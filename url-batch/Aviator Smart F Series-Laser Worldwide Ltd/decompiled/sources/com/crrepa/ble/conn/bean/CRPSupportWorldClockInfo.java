package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPSupportWorldClockInfo {
    private List<Integer> idList;
    private int maxCount;

    public CRPSupportWorldClockInfo(int i8, List<Integer> list) {
        this.maxCount = i8;
        this.idList = list;
    }

    public List<Integer> getIdList() {
        return this.idList;
    }

    public int getMaxCount() {
        return this.maxCount;
    }

    public void setIdList(List<Integer> list) {
        this.idList = list;
    }

    public void setMaxCount(int i8) {
        this.maxCount = i8;
    }

    public String toString() {
        return "CRPSupportWorldClockInfo{maxCount=" + this.maxCount + ", idList=" + this.idList + '}';
    }
}
