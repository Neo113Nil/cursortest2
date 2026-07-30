package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class OnceTemp {
    private Date date;
    private Long id;
    private Float temp;

    public OnceTemp(Long l8, Date date, Float f8) {
        this.id = l8;
        this.date = date;
        this.temp = f8;
    }

    public Date getDate() {
        return this.date;
    }

    public Long getId() {
        return this.id;
    }

    public Float getTemp() {
        return this.temp;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setTemp(Float f8) {
        this.temp = f8;
    }

    public OnceTemp() {
    }
}
