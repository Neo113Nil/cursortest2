package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPSedentaryReminderPeriodInfo {
    private byte endHour;
    private byte period;
    private byte startHour;
    private byte steps;

    public CRPSedentaryReminderPeriodInfo() {
    }

    public CRPSedentaryReminderPeriodInfo(byte b8, byte b9, byte b10, byte b11) {
        this.period = b8;
        this.steps = b9;
        this.startHour = b10;
        this.endHour = b11;
    }

    public byte getEndHour() {
        return this.endHour;
    }

    public byte getPeriod() {
        return this.period;
    }

    public byte getStartHour() {
        return this.startHour;
    }

    public byte getSteps() {
        return this.steps;
    }

    public void setEndHour(byte b8) {
        this.endHour = b8;
    }

    public void setPeriod(byte b8) {
        this.period = b8;
    }

    public void setStartHour(byte b8) {
        this.startHour = b8;
    }

    public void setSteps(byte b8) {
        this.steps = b8;
    }

    public String toString() {
        return "CRPSedentaryReminderPeriodInfo{period=" + ((int) this.period) + ", steps=" + ((int) this.steps) + ", startHour=" + ((int) this.startHour) + ", endHour=" + ((int) this.endHour) + '}';
    }
}
