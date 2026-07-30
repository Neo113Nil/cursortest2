package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class BloodOxygen {
    private Integer bloodOxygen;
    private Date date;
    private Long id;

    public BloodOxygen(Long l8, Date date, Integer num) {
        this.id = l8;
        this.date = date;
        this.bloodOxygen = num;
    }

    public Integer getBloodOxygen() {
        return this.bloodOxygen;
    }

    public Date getDate() {
        return this.date;
    }

    public Long getId() {
        return this.id;
    }

    public void setBloodOxygen(Integer num) {
        this.bloodOxygen = num;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public BloodOxygen() {
    }
}
