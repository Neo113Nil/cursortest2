package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class Weight {
    private Date date;
    private Long id;
    private boolean isShowWeight;
    private Float weightKg;
    private Float weightLb;

    public Weight() {
    }

    public Date getDate() {
        return this.date;
    }

    public Long getId() {
        return this.id;
    }

    public boolean getIsShowWeight() {
        return this.isShowWeight;
    }

    public Float getWeightKg() {
        return this.weightKg;
    }

    public Float getWeightLb() {
        return this.weightLb;
    }

    public boolean isShowWeight() {
        return this.isShowWeight;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setIsShowWeight(boolean z7) {
        this.isShowWeight = z7;
    }

    public void setShowWeight(boolean z7) {
        this.isShowWeight = z7;
    }

    public void setWeightKg(Float f8) {
        this.weightKg = f8;
    }

    public void setWeightLb(Float f8) {
        this.weightLb = f8;
    }

    public Weight(Long l8, Date date, boolean z7, Float f8, Float f9) {
        this.id = l8;
        this.date = date;
        this.isShowWeight = z7;
        this.weightKg = f8;
        this.weightLb = f9;
    }
}
