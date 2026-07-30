package com.crrepa.ble.conn.bean;

import com.crrepa.ble.conn.type.CRPEpoType;

/* loaded from: classes3.dex */
public class CRPHisiliconEpoInfo {
    private final CRPEpoType epoType = CRPEpoType.HISILICON_GPS;
    private int gloUpdateTime;
    private int nonGloUpdateTime;

    public CRPHisiliconEpoInfo(int i8, int i9) {
        this.gloUpdateTime = i8;
        this.nonGloUpdateTime = i9;
    }

    public CRPEpoType getEpoType() {
        return this.epoType;
    }

    public int getGloUpdateTime() {
        return this.gloUpdateTime;
    }

    public int getNonGloUpdateTime() {
        return this.nonGloUpdateTime;
    }

    public void setGloUpdateTime(int i8) {
        this.gloUpdateTime = i8;
    }

    public void setNonGloUpdateTime(int i8) {
        this.nonGloUpdateTime = i8;
    }

    public String toString() {
        return "CRPHisiliconEpoInfo{epoType=" + this.epoType + ", gloUpdateTime=" + this.gloUpdateTime + ", nonGloUpdateTime=" + this.nonGloUpdateTime + '}';
    }
}
