package com.crrepa.ble.conn.bean;

import java.util.List;

/* loaded from: classes3.dex */
public class CRPSleepActionInfo {
    private List<Integer> actionList;
    private int hour;

    public CRPSleepActionInfo() {
    }

    public CRPSleepActionInfo(int i8, List<Integer> list) {
        this.hour = i8;
        this.actionList = list;
    }

    public List<Integer> getActionList() {
        return this.actionList;
    }

    public int getHour() {
        return this.hour;
    }

    public void setActionList(List<Integer> list) {
        this.actionList = list;
    }

    public void setHour(int i8) {
        this.hour = i8;
    }

    public String toString() {
        return "CRPSleepActionInfo{hour=" + this.hour + ", actionList=" + this.actionList + '}';
    }
}
