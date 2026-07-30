package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPHistoryDay;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPBreathRateInfo {
    private List<Integer> breathRateList;
    private CRPHistoryDay historyDay;

    public CRPBreathRateInfo(CRPHistoryDay cRPHistoryDay, List<Integer> list) {
        this.historyDay = cRPHistoryDay;
        this.breathRateList = list;
    }

    public List<Integer> getBreathRateList() {
        return this.breathRateList;
    }

    public CRPHistoryDay getHistoryDay() {
        return this.historyDay;
    }

    public void setBreathRateList(List<Integer> list) {
        this.breathRateList = list;
    }

    public void setHistoryDay(CRPHistoryDay cRPHistoryDay) {
        this.historyDay = cRPHistoryDay;
    }

    public String toString() {
        return "CRPBreathRateInfo{historyDay=" + this.historyDay + ", breathRateList=" + this.breathRateList + '}';
    }
}
