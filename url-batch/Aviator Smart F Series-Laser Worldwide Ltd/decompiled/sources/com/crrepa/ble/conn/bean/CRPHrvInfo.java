package com.crrepa.ble.conn.bean;

import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPHrvInfo {
    private int ativeLevel;
    private Date date;
    private List<Integer> rriList;

    public CRPHrvInfo() {
    }

    public CRPHrvInfo(Date date, int i8, List<Integer> list) {
        this.date = date;
        this.ativeLevel = i8;
        this.rriList = list;
    }

    public int getAtiveLevel() {
        return this.ativeLevel;
    }

    public Date getDate() {
        return this.date;
    }

    public List<Integer> getRriList() {
        return this.rriList;
    }

    public void setAtiveLevel(int i8) {
        this.ativeLevel = i8;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setRriList(List<Integer> list) {
        this.rriList = list;
    }

    public String toString() {
        return "CRPHrvInfo{date=" + this.date + ", ativeLevel=" + this.ativeLevel + ", rriList=" + this.rriList + '}';
    }
}
