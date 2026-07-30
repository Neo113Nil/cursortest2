package com.crrepa.ble.conn.bean;

import java.util.Date;

/* loaded from: classes3.dex */
public class CRPHistoryHrvInfo {
    private Date date;
    private int hrv;

    public CRPHistoryHrvInfo(Date date, int i8) {
        this.date = date;
        this.hrv = i8;
    }

    public Date getDate() {
        return this.date;
    }

    public int getHrv() {
        return this.hrv;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHrv(int i8) {
        this.hrv = i8;
    }

    public String toString() {
        return "CRPHistoryHrvInfo{date=" + this.date + ", hrv=" + this.hrv + '}';
    }
}
