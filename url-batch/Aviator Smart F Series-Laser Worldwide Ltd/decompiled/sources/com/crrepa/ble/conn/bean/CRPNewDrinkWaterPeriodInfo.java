package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPNewDrinkWaterPeriodInfo {
    private int count;
    private boolean enable;
    private int period;
    private int startHour;
    private int startMinutes;

    public CRPNewDrinkWaterPeriodInfo() {
    }

    public CRPNewDrinkWaterPeriodInfo(boolean z7, int i8, int i9, int i10, int i11) {
        this.enable = z7;
        this.startHour = i8;
        this.startMinutes = i9;
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

    public int getStartMinutes() {
        return this.startMinutes;
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

    public void setStartMinutes(int i8) {
        this.startMinutes = i8;
    }

    public String toString() {
        return "CRPNewDrinkWaterPeriodInfo{enable=" + this.enable + ", startHour=" + this.startHour + ", startMinute=" + this.startMinutes + ", count=" + this.count + ", period=" + this.period + '}';
    }
}
