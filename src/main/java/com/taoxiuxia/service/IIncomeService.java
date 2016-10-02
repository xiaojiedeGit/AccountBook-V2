package com.taoxiuxia.service;

import java.util.List;

import com.taoxiuxia.model.Income;

public interface IIncomeService {
	
	/**
     * 加载全部income
     * @return
     */
	List<Income> loadIncomes();
	
	/**
	 * 增加收入
	 * @param item
	 * @param money
	 * @param remark
	 */
	void addIncome(int item,float money,String remark);
	
	/**
	 * 修改收入
	 * @param incomeId
	 * @param money
	 * @param itemId
	 * @param remark
	 */
	void changeIncome(int incomeId,float money,int itemId ,String remark);
	
	/**
	 * 删除收入
	 * @param incomeId
	 * @param itemId
	 */
	void deleIncome(int incomeId,int itemId);
}
