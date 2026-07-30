package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPCategoryHistoryDay;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPDistanceCategoryInfo {
    private List<Integer> distanceList;
    private CRPCategoryHistoryDay historyDay;
    private int timeInterval;

    public CRPDistanceCategoryInfo(CRPCategoryHistoryDay cRPCategoryHistoryDay, int i8, List<Integer> list) {
        this.historyDay = cRPCategoryHistoryDay;
        this.timeInterval = i8;
        this.distanceList = list;
    }

    public List<Integer> getDistanceList() {
        return this.distanceList;
    }

    public CRPCategoryHistoryDay getHistoryDay() {
        return this.historyDay;
    }

    public int getTimeInterval() {
        return this.timeInterval;
    }

    public String toString() {
        return "CRPDistanceCategoryInfo{historyDay=" + this.historyDay + ", timeInterval=" + this.timeInterval + ", distanceList=" + this.distanceList + '}';
    }
}
