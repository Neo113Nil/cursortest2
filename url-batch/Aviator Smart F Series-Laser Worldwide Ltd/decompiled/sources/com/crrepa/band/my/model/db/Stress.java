package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class Stress {
    private Date date;
    private Integer id;
    private Integer stress;

    public Stress(Integer num, Date date, Integer num2) {
        this.id = num;
        this.date = date;
        this.stress = num2;
    }

    public Date getDate() {
        return this.date;
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getStress() {
        return this.stress;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public void setStress(Integer num) {
        this.stress = num;
    }

    public Stress() {
    }
}
