package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class HeartRateWarning {
    private Boolean enable;
    private Integer hr;
    private Long id;

    public HeartRateWarning(Long l8, Boolean bool, Integer num) {
        this.id = l8;
        this.enable = bool;
        this.hr = num;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public Integer getHr() {
        return this.hr;
    }

    public Long getId() {
        return this.id;
    }

    public void setEnable(Boolean bool) {
        this.enable = bool;
    }

    public void setHr(Integer num) {
        this.hr = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public HeartRateWarning() {
    }
}
