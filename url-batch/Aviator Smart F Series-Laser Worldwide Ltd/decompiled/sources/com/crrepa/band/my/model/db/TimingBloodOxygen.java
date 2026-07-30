package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class TimingBloodOxygen {
    private int average;
    private String bloodOxygen;
    private Date date;
    private Long id;
    private int max;
    private int min;

    public TimingBloodOxygen(Long l8, Date date, String str, int i8, int i9, int i10) {
        this.id = l8;
        this.date = date;
        this.bloodOxygen = str;
        this.average = i8;
        this.min = i9;
        this.max = i10;
    }

    public int getAverage() {
        return this.average;
    }

    public String getBloodOxygen() {
        return this.bloodOxygen;
    }

    public Date getDate() {
        return this.date;
    }

    public Long getId() {
        return this.id;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public void setAverage(int i8) {
        this.average = i8;
    }

    public void setBloodOxygen(String str) {
        this.bloodOxygen = str;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setMax(int i8) {
        this.max = i8;
    }

    public void setMin(int i8) {
        this.min = i8;
    }

    public TimingBloodOxygen() {
    }
}
