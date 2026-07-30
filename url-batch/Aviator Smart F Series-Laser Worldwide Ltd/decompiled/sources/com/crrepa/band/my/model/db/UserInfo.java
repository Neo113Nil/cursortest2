package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class UserInfo {
    private Integer birthYear;
    private Date birthday;
    private Integer gender;
    private Integer heightCm;
    private Integer heightIn;
    private Long id;
    private Integer stepLengthCm;
    private Integer stepLengthIn;
    private Float weightKg;
    private Float weightLbs;

    public UserInfo(Long l8, Integer num, Integer num2, Date date, Integer num3, Integer num4, Integer num5, Integer num6, Float f8, Float f9) {
        this.id = l8;
        this.gender = num;
        this.birthYear = num2;
        this.birthday = date;
        this.heightCm = num3;
        this.heightIn = num4;
        this.stepLengthCm = num5;
        this.stepLengthIn = num6;
        this.weightKg = f8;
        this.weightLbs = f9;
    }

    public Integer getBirthYear() {
        return this.birthYear;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public Integer getGender() {
        return this.gender;
    }

    public Integer getHeightCm() {
        return this.heightCm;
    }

    public Integer getHeightIn() {
        return this.heightIn;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getStepLengthCm() {
        return this.stepLengthCm;
    }

    public Integer getStepLengthIn() {
        return this.stepLengthIn;
    }

    public Float getWeightKg() {
        return this.weightKg;
    }

    public Float getWeightLbs() {
        return this.weightLbs;
    }

    public void setBirthYear(Integer num) {
        this.birthYear = num;
    }

    public void setBirthday(Date date) {
        this.birthday = date;
    }

    public void setGender(Integer num) {
        this.gender = num;
    }

    public void setHeightCm(Integer num) {
        this.heightCm = num;
    }

    public void setHeightIn(Integer num) {
        this.heightIn = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setStepLengthCm(Integer num) {
        this.stepLengthCm = num;
    }

    public void setStepLengthIn(Integer num) {
        this.stepLengthIn = num;
    }

    public void setWeightKg(Float f8) {
        this.weightKg = f8;
    }

    public void setWeightLbs(Float f8) {
        this.weightLbs = f8;
    }

    public UserInfo() {
    }
}
