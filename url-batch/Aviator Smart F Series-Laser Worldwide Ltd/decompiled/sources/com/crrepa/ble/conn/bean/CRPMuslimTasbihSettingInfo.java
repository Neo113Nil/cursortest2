package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPMuslimTasbihSettingInfo {
    private boolean enable;
    private byte endHour;
    private byte endMinutes;
    private byte interval;
    private byte repeatMode;
    private byte startHour;
    private byte startMinutes;

    public byte getEndHour() {
        return this.endHour;
    }

    public byte getEndMinutes() {
        return this.endMinutes;
    }

    public byte getInterval() {
        return this.interval;
    }

    public byte getRepeatMode() {
        return this.repeatMode;
    }

    public byte getStartHour() {
        return this.startHour;
    }

    public byte getStartMinutes() {
        return this.startMinutes;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z7) {
        this.enable = z7;
    }

    public void setEndHour(byte b8) {
        this.endHour = b8;
    }

    public void setEndMinutes(byte b8) {
        this.endMinutes = b8;
    }

    public void setInterval(byte b8) {
        this.interval = b8;
    }

    public void setRepeatMode(byte b8) {
        this.repeatMode = b8;
    }

    public void setStartHour(byte b8) {
        this.startHour = b8;
    }

    public void setStartMinutes(byte b8) {
        this.startMinutes = b8;
    }

    public String toString() {
        return "CRPMuslimTasbihSettingInfo{enable=" + this.enable + ", startHour=" + ((int) this.startHour) + ", startMinutes=" + ((int) this.startMinutes) + ", endHour=" + ((int) this.endHour) + ", endMinutes=" + ((int) this.endMinutes) + ", interval=" + ((int) this.interval) + ", repeatMode=" + ((int) this.repeatMode) + '}';
    }
}
