package com.crrepa.ble.conn.bean;

import java.util.Date;

/* loaded from: classes3.dex */
public class CRPHistoryBreathRateInfo {
    private int breathRate;
    private Date date;

    public CRPHistoryBreathRateInfo(Date date, int i8) {
        this.date = date;
        this.breathRate = i8;
    }

    public int getBreathRate() {
        return this.breathRate;
    }

    public Date getDate() {
        return this.date;
    }

    public void setBreathRate(int i8) {
        this.breathRate = i8;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return "CRPHistoryBreathRateInfo{date=" + this.date + ", breathRate=" + this.breathRate + '}';
    }
}
