package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class BloodPressure {
    private Date date;
    private Integer dbp;
    private Integer hr;
    private Long id;
    private Integer sbp;

    public BloodPressure(Long l8, Date date, Integer num, Integer num2, Integer num3) {
        this.id = l8;
        this.date = date;
        this.hr = num;
        this.sbp = num2;
        this.dbp = num3;
    }

    public Date getDate() {
        return this.date;
    }

    public Integer getDbp() {
        return this.dbp;
    }

    public Integer getHr() {
        return this.hr;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getSbp() {
        return this.sbp;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDbp(Integer num) {
        this.dbp = num;
    }

    public void setHr(Integer num) {
        this.hr = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setSbp(Integer num) {
        this.sbp = num;
    }

    public BloodPressure() {
    }
}
