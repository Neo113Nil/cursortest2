package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPPeriodTimeInfo {
    private int endHour;
    private int endMinute;
    private int startHour;
    private int startMinute;

    public CRPPeriodTimeInfo() {
    }

    public CRPPeriodTimeInfo(int i8, int i9, int i10, int i11) {
        this.startHour = i8;
        this.startMinute = i9;
        this.endHour = i10;
        this.endMinute = i11;
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

    public String toString() {
        return "CRPPeriodTimeInfo{startHour=" + this.startHour + ", startMinute=" + this.startMinute + ", endHour=" + this.endHour + ", endMinute=" + this.endMinute + '}';
    }
}
