package com.crrepa.band.my.model.db;

import java.util.Date;

/* loaded from: classes2.dex */
public class Sleep {
    private Float completion;
    private Date date;
    private Integer deep;
    private String detail;
    private Long id;
    private Integer rem;
    private Integer shallow;
    private Integer sober;

    public Sleep(Long l8, Integer num, Integer num2, Integer num3, Integer num4, String str, Float f8, Date date) {
        this.id = l8;
        this.deep = num;
        this.shallow = num2;
        this.sober = num3;
        this.rem = num4;
        this.detail = str;
        this.completion = f8;
        this.date = date;
    }

    public Float getCompletion() {
        return this.completion;
    }

    public Date getDate() {
        return this.date;
    }

    public Integer getDeep() {
        return this.deep;
    }

    public String getDetail() {
        return this.detail;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getRem() {
        return this.rem;
    }

    public Integer getShallow() {
        return this.shallow;
    }

    public Integer getSober() {
        return this.sober;
    }

    public void setCompletion(Float f8) {
        this.completion = f8;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDeep(Integer num) {
        this.deep = num;
    }

    public void setDetail(String str) {
        this.detail = str;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setRem(Integer num) {
        this.rem = num;
    }

    public void setShallow(Integer num) {
        this.shallow = num;
    }

    public void setSober(Integer num) {
        this.sober = num;
    }

    public Sleep() {
    }
}
