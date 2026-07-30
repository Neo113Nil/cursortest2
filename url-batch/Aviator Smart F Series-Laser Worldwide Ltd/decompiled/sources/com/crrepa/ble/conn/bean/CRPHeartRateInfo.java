package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPHistoryDay;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPHeartRateInfo {
    private List<Integer> heartRateList;
    private CRPHistoryDay historyDay;
    private boolean isAllDay;
    private long startTime;
    private int timeInterval;

    public CRPHeartRateInfo(long j8, List<Integer> list, int i8, boolean z7, CRPHistoryDay cRPHistoryDay) {
        this.startTime = j8;
        this.heartRateList = list;
        this.timeInterval = i8;
        this.isAllDay = z7;
        this.historyDay = cRPHistoryDay;
    }

    public List<Integer> getHeartRateList() {
        return this.heartRateList;
    }

    public CRPHistoryDay getHistoryDay() {
        return this.historyDay;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getTimeInterval() {
        return this.timeInterval;
    }

    public boolean isAllDay() {
        return this.isAllDay;
    }

    public String toString() {
        return "CRPHeartRateInfo{startTime=" + this.startTime + ", heartRateList=" + this.heartRateList + ", timeInterval=" + this.timeInterval + ", isAllDay=" + this.isAllDay + ", historyDay=" + this.historyDay + '}';
    }
}
