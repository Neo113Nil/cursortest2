package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class PhysiologicalPeriod {
    private Long id;
    private Date lastMenstrualDate;
    private Integer menstrualPeriod;
    private Integer physiologicalPeriod;

    public PhysiologicalPeriod(Long l8, Integer num, Integer num2, Date date) {
        this.id = l8;
        this.physiologicalPeriod = num;
        this.menstrualPeriod = num2;
        this.lastMenstrualDate = date;
    }

    public Long getId() {
        return this.id;
    }

    public Date getLastMenstrualDate() {
        return this.lastMenstrualDate;
    }

    public Integer getMenstrualPeriod() {
        return this.menstrualPeriod;
    }

    public Integer getPhysiologicalPeriod() {
        return this.physiologicalPeriod;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setLastMenstrualDate(Date date) {
        this.lastMenstrualDate = date;
    }

    public void setMenstrualPeriod(Integer num) {
        this.menstrualPeriod = num;
    }

    public void setPhysiologicalPeriod(Integer num) {
        this.physiologicalPeriod = num;
    }

    public PhysiologicalPeriod() {
    }
}
