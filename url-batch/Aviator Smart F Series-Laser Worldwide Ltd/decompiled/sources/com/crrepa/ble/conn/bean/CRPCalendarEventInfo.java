package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPCalendarEventInfo {
    private int endHour;
    private int endMinute;
    private int id;
    private int startHour;
    private int startMinute;
    private long time;
    private String title;

    public int getEndHour() {
        return this.endHour;
    }

    public int getEndMinute() {
        return this.endMinute;
    }

    public int getId() {
        return this.id;
    }

    public int getStartHour() {
        return this.startHour;
    }

    public int getStartMinute() {
        return this.startMinute;
    }

    public long getTime() {
        return this.time;
    }

    public String getTitle() {
        return this.title;
    }

    public void setEndHour(int i8) {
        this.endHour = i8;
    }

    public void setEndMinute(int i8) {
        this.endMinute = i8;
    }

    public void setId(int i8) {
        this.id = i8;
    }

    public void setStartHour(int i8) {
        this.startHour = i8;
    }

    public void setStartMinute(int i8) {
        this.startMinute = i8;
    }

    public void setTime(long j8) {
        this.time = j8;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "CRPCalendarEventInfo{id=" + this.id + ", title='" + this.title + "', startHour=" + this.startHour + ", startMinute=" + this.startMinute + ", endHour=" + this.endHour + ", endMinute=" + this.endMinute + ", time=" + this.time + '}';
    }
}
