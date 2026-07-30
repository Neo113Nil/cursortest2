package com.crrepa.ble.conn.bean;

import java.util.Date;

/* loaded from: classes3.dex */
public class CRPHistoryBloodOxygenInfo {
    private int bo;
    private Date date;

    public CRPHistoryBloodOxygenInfo(Date date, int i8) {
        this.date = date;
        this.bo = i8;
    }

    public int getBo() {
        return this.bo;
    }

    public Date getDate() {
        return this.date;
    }

    public void setBo(int i8) {
        this.bo = i8;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return "CRPHistoryBloodOxygenInfo{date=" + this.date + ", bo=" + this.bo + '}';
    }
}
