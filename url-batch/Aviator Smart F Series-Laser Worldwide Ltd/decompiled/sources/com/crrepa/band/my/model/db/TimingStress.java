package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class TimingStress {
    private Integer average;
    private Date date;
    private Long id;
    private Integer max;
    private Integer min;
    private String stress;

    public TimingStress(Long l8, Date date, String str, Integer num, Integer num2, Integer num3) {
        this.id = l8;
        this.date = date;
        this.stress = str;
        this.average = num;
        this.min = num2;
        this.max = num3;
    }

    public Integer getAverage() {
        return this.average;
    }

    public Date getDate() {
        return this.date;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getMax() {
        return this.max;
    }

    public Integer getMin() {
        return this.min;
    }

    public String getStress() {
        return this.stress;
    }

    public void setAverage(Integer num) {
        this.average = num;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setMax(Integer num) {
        this.max = num;
    }

    public void setMin(Integer num) {
        this.min = num;
    }

    public void setStress(String str) {
        this.stress = str;
    }

    public TimingStress() {
    }
}
