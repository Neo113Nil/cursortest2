package com.crrepa.ble.spp.hisilicon.write.map.bean;

/* loaded from: classes3.dex */
public class Duration {
    private int dates;
    private int hours;
    private int minutes;
    private int seconds;

    public Duration(int i8, int i9, int i10, int i11) {
        this.dates = i8;
        this.hours = i9;
        this.minutes = i10;
        this.seconds = i11;
    }

    public int getDates() {
        return this.dates;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setDates(int i8) {
        this.dates = i8;
    }

    public void setHours(int i8) {
        this.hours = i8;
    }

    public void setMinutes(int i8) {
        this.minutes = i8;
    }

    public void setSeconds(int i8) {
        this.seconds = i8;
    }

    public String toString() {
        return "Duration{dates=" + this.dates + ", hours=" + this.hours + ", minutes=" + this.minutes + ", seconds=" + this.seconds + '}';
    }
}
