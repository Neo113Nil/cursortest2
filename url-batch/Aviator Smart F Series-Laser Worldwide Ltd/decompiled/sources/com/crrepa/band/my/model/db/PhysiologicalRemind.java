package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class PhysiologicalRemind {
    private Boolean enable;
    private Integer hour;
    private Long id;
    private Boolean menstrual;
    private Integer minute;
    private Boolean ovulation;
    private Boolean ovulationDay;
    private Boolean ovulationEnd;

    public PhysiologicalRemind(Long l8, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2) {
        this.id = l8;
        this.enable = bool;
        this.menstrual = bool2;
        this.ovulation = bool3;
        this.ovulationDay = bool4;
        this.ovulationEnd = bool5;
        this.hour = num;
        this.minute = num2;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public Integer getHour() {
        return this.hour;
    }

    public Long getId() {
        return this.id;
    }

    public Boolean getMenstrual() {
        return this.menstrual;
    }

    public Integer getMinute() {
        return this.minute;
    }

    public Boolean getOvulation() {
        return this.ovulation;
    }

    public Boolean getOvulationDay() {
        return this.ovulationDay;
    }

    public Boolean getOvulationEnd() {
        return this.ovulationEnd;
    }

    public void setEnable(Boolean bool) {
        this.enable = bool;
    }

    public void setHour(Integer num) {
        this.hour = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setMenstrual(Boolean bool) {
        this.menstrual = bool;
    }

    public void setMinute(Integer num) {
        this.minute = num;
    }

    public void setOvulation(Boolean bool) {
        this.ovulation = bool;
    }

    public void setOvulationDay(Boolean bool) {
        this.ovulationDay = bool;
    }

    public void setOvulationEnd(Boolean bool) {
        this.ovulationEnd = bool;
    }

    public PhysiologicalRemind() {
    }
}
