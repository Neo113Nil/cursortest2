package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPHistoryTrainingInfo {
    private int id;
    private long startTime;
    private int type;

    public CRPHistoryTrainingInfo(int i8, long j8, int i9) {
        this.id = i8;
        this.startTime = j8;
        this.type = i9;
    }

    public int getId() {
        return this.id;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "CRPHistoryTrainingInfo{id=" + this.id + ", startTime=" + this.startTime + ", type=" + this.type + '}';
    }
}
