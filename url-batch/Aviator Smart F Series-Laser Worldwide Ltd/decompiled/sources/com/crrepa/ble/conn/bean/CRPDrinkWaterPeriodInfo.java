package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPDrinkWaterPeriodInfo {
    private int count;
    private int currentCups;
    private boolean enable;
    private int period;
    private int startHour;
    private int startMinute;

    public CRPDrinkWaterPeriodInfo() {
    }

    public CRPDrinkWaterPeriodInfo(boolean z7, int i8, int i9, int i10, int i11) {
        this.enable = z7;
        this.startHour = i8;
        this.startMinute = i9;
        this.count = i10;
        this.period = i11;
    }

    public int getCount() {
        return this.count;
    }

    public int getCurrentCups() {
        return this.currentCups;
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

    public void setCurrentCups(int i8) {
        this.currentCups = i8;
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
        return "CRPDrinkWaterPeriodInfo{enable=" + this.enable + ", startHour=" + this.startHour + ", startMinute=" + this.startMinute + ", count=" + this.count + ", period=" + this.period + ", currentCups=" + this.currentCups + '}';
    }

    public CRPDrinkWaterPeriodInfo(boolean z7, int i8, int i9, int i10, int i11, int i12) {
        this.enable = z7;
        this.startHour = i8;
        this.startMinute = i9;
        this.count = i10;
        this.period = i11;
        this.currentCups = i12;
    }
}
