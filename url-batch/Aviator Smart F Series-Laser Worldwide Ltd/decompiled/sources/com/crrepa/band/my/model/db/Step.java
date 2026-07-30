package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class Step {
    private Float calory;
    private Float completion;

    @Deprecated
    private Boolean compliance;
    private Date date;
    private Float distance;
    private Long id;
    private Integer steps;
    private String stepsCategory;
    private Integer time;
    private int timeInterval;

    public Step(Long l8, Integer num, Float f8, Float f9, Integer num2, Boolean bool, Float f10, Date date, String str, int i8) {
        this.id = l8;
        this.steps = num;
        this.calory = f8;
        this.distance = f9;
        this.time = num2;
        this.compliance = bool;
        this.completion = f10;
        this.date = date;
        this.stepsCategory = str;
        this.timeInterval = i8;
    }

    public Float getCalory() {
        return this.calory;
    }

    public Float getCompletion() {
        return this.completion;
    }

    public Boolean getCompliance() {
        return this.compliance;
    }

    public Date getDate() {
        return this.date;
    }

    public Float getDistance() {
        return this.distance;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getSteps() {
        return this.steps;
    }

    public String getStepsCategory() {
        return this.stepsCategory;
    }

    public Integer getTime() {
        return this.time;
    }

    public int getTimeInterval() {
        return this.timeInterval;
    }

    public void setCalory(Float f8) {
        this.calory = f8;
    }

    public void setCompletion(Float f8) {
        this.completion = f8;
    }

    public void setCompliance(Boolean bool) {
        this.compliance = bool;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDistance(Float f8) {
        this.distance = f8;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setSteps(Integer num) {
        this.steps = num;
    }

    public void setStepsCategory(String str) {
        this.stepsCategory = str;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public void setTimeInterval(int i8) {
        this.timeInterval = i8;
    }

    public Step() {
    }
}
