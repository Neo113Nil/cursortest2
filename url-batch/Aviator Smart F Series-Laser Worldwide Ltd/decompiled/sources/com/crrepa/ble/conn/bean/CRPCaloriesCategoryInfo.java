package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPCategoryHistoryDay;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPCaloriesCategoryInfo {
    private List<Integer> caloriesList;
    private CRPCategoryHistoryDay historyDay;
    private int timeInterval;

    public CRPCaloriesCategoryInfo(CRPCategoryHistoryDay cRPCategoryHistoryDay, int i8, List<Integer> list) {
        this.historyDay = cRPCategoryHistoryDay;
        this.timeInterval = i8;
        this.caloriesList = list;
    }

    public List<Integer> getCaloriesList() {
        return this.caloriesList;
    }

    public CRPCategoryHistoryDay getHistoryDay() {
        return this.historyDay;
    }

    public int getTimeInterval() {
        return this.timeInterval;
    }

    public String toString() {
        return "CRPCaloriesCategoryInfo{historyDay=" + this.historyDay + ", timeInterval=" + this.timeInterval + ", caloriesList=" + this.caloriesList + '}';
    }
}
