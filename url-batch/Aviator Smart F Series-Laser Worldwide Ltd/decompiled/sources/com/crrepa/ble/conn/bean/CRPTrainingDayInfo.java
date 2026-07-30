package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPTrainingDayInfo {
    private boolean enable;
    private byte trainingDays;

    public CRPTrainingDayInfo(boolean z7, byte b8) {
        this.enable = z7;
        this.trainingDays = b8;
    }

    public byte getTrainingDays() {
        return this.trainingDays;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z7) {
        this.enable = z7;
    }

    public void setTrainingDays(byte b8) {
        this.trainingDays = b8;
    }

    public String toString() {
        return "CRPTrainingDayInfo{enable=" + this.enable + ", trainingDays=" + ((int) this.trainingDays) + '}';
    }
}
