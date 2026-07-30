package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPStressDate;
import java.util.List;

/* loaded from: classes3.dex */
public class CRPTimingStressInfo {
    private CRPStressDate date;
    private List<Integer> list;

    public CRPTimingStressInfo(CRPStressDate cRPStressDate, List<Integer> list) {
        this.date = cRPStressDate;
        this.list = list;
    }

    public CRPStressDate getDate() {
        return this.date;
    }

    public List<Integer> getList() {
        return this.list;
    }

    public void setDate(CRPStressDate cRPStressDate) {
        this.date = cRPStressDate;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public String toString() {
        return "CRPTimingStressInfo{date=" + this.date + ", list=" + this.list + '}';
    }
}
