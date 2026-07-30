package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPNapSleepInfo {
    private int endTime;
    private int startTime;
    private int totalTime;

    public CRPNapSleepInfo(int i8, int i9, int i10) {
        this.startTime = i8;
        this.endTime = i9;
        this.totalTime = i10;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public int getTotalTime() {
        return this.totalTime;
    }

    public void setEndTime(int i8) {
        this.endTime = i8;
    }

    public void setStartTime(int i8) {
        this.startTime = i8;
    }

    public void setTotalTime(int i8) {
        this.totalTime = i8;
    }

    public String toString() {
        return "CRPNapSleepInfo{startTime=" + this.startTime + ", endTime=" + this.endTime + ", totalTime=" + this.totalTime + '}';
    }
}
