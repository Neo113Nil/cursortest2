package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPSavedCalendarEventInfo {
    private int id;
    private long time;

    public CRPSavedCalendarEventInfo(int i8, long j8) {
        this.id = i8;
        this.time = j8;
    }

    public int getId() {
        return this.id;
    }

    public long getTime() {
        return this.time;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setTime(long j8) {
        this.time = j8;
    }

    public String toString() {
        return "CRPSavedCalendarEventInfo{id=" + this.id + ", time=" + this.time + '}';
    }
}
