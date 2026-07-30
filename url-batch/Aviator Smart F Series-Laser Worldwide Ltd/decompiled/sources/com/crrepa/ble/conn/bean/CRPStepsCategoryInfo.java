package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPCategoryHistoryDay;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPStepsCategoryInfo {
    private CRPCategoryHistoryDay historyDay;
    private List<Integer> stepsList;
    private int timeInterval;

    public CRPStepsCategoryInfo(CRPCategoryHistoryDay cRPCategoryHistoryDay, int i8, List<Integer> list) {
        this.historyDay = cRPCategoryHistoryDay;
        this.timeInterval = i8;
        this.stepsList = list;
    }

    public CRPCategoryHistoryDay getDateType() {
        return this.historyDay;
    }

    public List<Integer> getStepsList() {
        return this.stepsList;
    }

    public int getTimeInterval() {
        return this.timeInterval;
    }

    public String toString() {
        return "CRPStepsCategoryInfo{historyDay=" + this.historyDay + ", timeInterval=" + this.timeInterval + ", stepsList=" + this.stepsList + '}';
    }
}
