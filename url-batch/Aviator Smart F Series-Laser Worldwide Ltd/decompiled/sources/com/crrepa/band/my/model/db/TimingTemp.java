package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class TimingTemp {
    private Float average;
    private Date date;
    private Long id;
    private Float max;
    private Float min;
    private String tempStr;

    public TimingTemp(Long l8, Date date, String str, Float f8, Float f9, Float f10) {
        this.id = l8;
        this.date = date;
        this.tempStr = str;
        this.average = f8;
        this.max = f9;
        this.min = f10;
    }

    public Float getAverage() {
        return this.average;
    }

    public Date getDate() {
        return this.date;
    }

    public Long getId() {
        return this.id;
    }

    public Float getMax() {
        return this.max;
    }

    public Float getMin() {
        return this.min;
    }

    public String getTempStr() {
        return this.tempStr;
    }

    public void setAverage(Float f8) {
        this.average = f8;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setMax(Float f8) {
        this.max = f8;
    }

    public void setMin(Float f8) {
        this.min = f8;
    }

    public void setTempStr(String str) {
        this.tempStr = str;
    }

    public TimingTemp() {
    }
}
