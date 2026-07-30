package com.crrepa.ble.conn.bean;

import java.util.Date;

/* loaded from: classes3.dex */
public class CRPHistoryHeartRateInfo {
    private Date date;
    private int hr;

    public CRPHistoryHeartRateInfo(Date date, int i8) {
        this.date = date;
        this.hr = i8;
    }

    public Date getDate() {
        return this.date;
    }

    public int getHr() {
        return this.hr;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHr(int i8) {
        this.hr = i8;
    }

    public String toString() {
        return "CRPHistoryHeartRateInfo{date=" + this.date + ", hr=" + this.hr + '}';
    }
}
