package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class HandWashing {
    private Integer count;
    private Boolean enable;
    private Long id;
    private Integer period;
    private Integer startHour;
    private Integer startMinute;

    public HandWashing(Long l8, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.id = l8;
        this.enable = bool;
        this.startHour = num;
        this.startMinute = num2;
        this.count = num3;
        this.period = num4;
    }

    public Integer getCount() {
        return this.count;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getPeriod() {
        return this.period;
    }

    public Integer getStartHour() {
        return this.startHour;
    }

    public Integer getStartMinute() {
        return this.startMinute;
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public void setEnable(Boolean bool) {
        this.enable = bool;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setPeriod(Integer num) {
        this.period = num;
    }

    public void setStartHour(Integer num) {
        this.startHour = num;
    }

    public void setStartMinute(Integer num) {
        this.startMinute = num;
    }

    public HandWashing() {
    }
}
