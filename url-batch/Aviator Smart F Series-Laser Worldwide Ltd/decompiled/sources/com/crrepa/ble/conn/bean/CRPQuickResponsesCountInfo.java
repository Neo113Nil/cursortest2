package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPQuickResponsesCountInfo {
    private int count;
    private boolean enable;

    public int getCount() {
        return this.count;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setCount(int i8) {
        this.count = i8;
    }

    public void setEnable(boolean z7) {
        this.enable = z7;
    }

    public String toString() {
        return "CRPQuickResponsesCountInfo{enable=" + this.enable + ", count=" + this.count + '}';
    }
}
