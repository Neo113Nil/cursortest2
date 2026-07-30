package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPHandWashingPeriodInfo {
    private int count;
    private boolean enable;
    private int period;
    private int startHour;
    private int startMinute;

    public CRPHandWashingPeriodInfo() {
    }

    public CRPHandWashingPeriodInfo(boolean z7, int i8, int i9, int i10, int i11) {
        this.enable = z7;
        this.startHour = i8;
        this.startMinute = i9;
        this.count = i10;
        this.period = i11;
    }

    public int getCount() {
        return this.count;
    }

    public int getPeriod() {
        return this.period;
    }

    public int getStartHour() {
        return this.startHour;
    }

    public int getStartMinute() {
        return this.startMinute;
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

    public void setPeriod(int i8) {
        this.period = i8;
    }

    public void setStartHour(int i8) {
        this.startHour = i8;
    }

    public void setStartMinute(int i8) {
        this.startMinute = i8;
    }

    public String toString() {
        return "CRPHandWashingPeriodInfo{enable=" + this.enable + ", startHour=" + this.startHour + ", startMinute=" + this.startMinute + ", count=" + this.count + ", period=" + this.period + '}';
    }
}
