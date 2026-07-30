package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class OnceHeartRate {
    private Date date;
    private Integer heartRate;
    private Long id;

    public OnceHeartRate(Long l8, Date date, Integer num) {
        this.id = l8;
        this.date = date;
        this.heartRate = num;
    }

    public Date getDate() {
        return this.date;
    }

    public Integer getHeartRate() {
        return this.heartRate;
    }

    public Long getId() {
        return this.id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHeartRate(Integer num) {
        this.heartRate = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public OnceHeartRate() {
    }
}
