package com.crrepa.ble.conn.bean;

import java.io.File;
import java.util.Date;

/* loaded from: classes3.dex */
public class CRPAlarmInfo {
    public static final byte EVERYDAY = Byte.MAX_VALUE;
    public static final int FIRST_ALARM = 0;
    public static final byte FRIDAY = 32;
    public static final byte MONDAY = 2;
    public static final byte SATURDAY = 64;
    public static final int SECOND_ALARM = 1;
    public static final byte SINGLE = 0;
    public static final byte SUNDAY = 1;
    public static final int THIRD_ALARM = 2;
    public static final byte THURSDAY = 16;
    public static final byte TUESDAY = 4;
    public static final byte WEDNESDAY = 8;
    private Date date;
    private boolean enable;
    private int hour;
    private int id;
    private int minute;
    private int repeatMode;

    public CRPAlarmInfo() {
    }

    public CRPAlarmInfo(int i8, int i9, int i10, int i11, boolean z7) {
        this.id = i8;
        this.hour = i9;
        this.minute = i10;
        this.repeatMode = i11;
        this.enable = z7;
    }

    public Date getDate() {
        return this.date;
    }

    public int getHour() {
        return this.hour;
    }

    public int getId() {
        return this.id;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getRepeatMode() {
        return this.repeatMode;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEnable(boolean z7) {
        this.enable = z7;
    }

    public void setHour(int i8) {
        this.hour = i8;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setMinute(int i8) {
        this.minute = i8;
    }

    public void setRepeatMode(int i8) {
        this.repeatMode = i8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ");
        sb.append(this.id);
        String str = File.separator;
        sb.append(str);
        sb.append("time: ");
        sb.append(this.hour);
        sb.append(":");
        sb.append(this.minute);
        sb.append(str);
        sb.append("repeatMode: ");
        sb.append(this.repeatMode);
        sb.append(str);
        sb.append("enable: ");
        sb.append(this.enable);
        return sb.toString();
    }
}
