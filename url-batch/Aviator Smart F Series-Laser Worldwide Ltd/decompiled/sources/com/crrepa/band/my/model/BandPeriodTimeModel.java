package com.crrepa.band.my.model;

import com.crrepa.ble.conn.bean.CRPPeriodTimeInfo;

/* loaded from: classes2.dex */
public abstract class BandPeriodTimeModel {
    protected int endHour;
    protected int endMinute;
    protected int startHour;
    protected int startMinute;

    public CRPPeriodTimeInfo convertCRPPeriodTimeInfo() {
        return new CRPPeriodTimeInfo(this.startHour, this.startMinute, this.endHour, this.endMinute);
    }

    public int getEndHour() {
        return this.endHour;
    }

    public int getEndMinute() {
        return this.endMinute;
    }

    public int getStartHour() {
        return this.startHour;
    }

    public int getStartMinute() {
        return this.startMinute;
    }

    public abstract void savePeriodTime();

    public void setEndHour(int i8) {
        this.endHour = i8;
    }

    public void setEndMinute(int i8) {
        this.endMinute = i8;
    }

    public void setStartHour(int i8) {
        this.startHour = i8;
    }

    public void setStartMinute(int i8) {
        this.startMinute = i8;
    }
}
