package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class Hrv {
    private Date date;
    private Integer hrv;
    private Long id;

    public Hrv(Long l8, Date date, Integer num) {
        this.id = l8;
        this.date = date;
        this.hrv = num;
    }

    public Date getDate() {
        return this.date;
    }

    public Integer getHrv() {
        return this.hrv;
    }

    public Long getId() {
        return this.id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHrv(Integer num) {
        this.hrv = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public Hrv() {
    }
}
