package com.crrepa.ble.conn.bean;

import java.util.Date;

/* loaded from: classes3.dex */
public class CRPHistoryStressInfo {
    private Date date;
    private int stress;

    public CRPHistoryStressInfo(Date date, int i8) {
        this.date = date;
        this.stress = i8;
    }

    public Date getDate() {
        return this.date;
    }

    public int getStress() {
        return this.stress;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStress(int i8) {
        this.stress = i8;
    }

    public String toString() {
        return "CRPHistoryStressInfo{date=" + this.date + ", stress=" + this.stress + '}';
    }
}
