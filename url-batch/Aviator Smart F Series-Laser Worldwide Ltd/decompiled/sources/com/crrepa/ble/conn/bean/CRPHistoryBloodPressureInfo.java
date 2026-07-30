package com.crrepa.ble.conn.bean;

import java.util.Date;

/* loaded from: classes3.dex */
public class CRPHistoryBloodPressureInfo {
    private Date date;
    private int dbp;
    private int sbp;

    public CRPHistoryBloodPressureInfo(Date date, int i8, int i9) {
        this.date = date;
        this.sbp = i8;
        this.dbp = i9;
    }

    public Date getDate() {
        return this.date;
    }

    public int getDbp() {
        return this.dbp;
    }

    public int getSbp() {
        return this.sbp;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDbp(int i8) {
        this.dbp = i8;
    }

    public void setSbp(int i8) {
        this.sbp = i8;
    }

    public String toString() {
        return "CRPHistoryBloodPressureInfo{date=" + this.date + ", sbp=" + this.sbp + ", dbp=" + this.dbp + '}';
    }
}
