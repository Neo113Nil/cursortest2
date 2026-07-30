package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class ECardConfig {
    private Integer count;
    private Long id;
    private String name;
    private String savedIdList;
    private Integer urlLimit;

    public ECardConfig(Long l8, String str, Integer num, Integer num2, String str2) {
        this.id = l8;
        this.name = str;
        this.count = num;
        this.urlLimit = num2;
        this.savedIdList = str2;
    }

    public Integer getCount() {
        return this.count;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSavedIdList() {
        return this.savedIdList;
    }

    public Integer getUrlLimit() {
        return this.urlLimit;
    }

    public void setCount(Integer num) {
        this.count = num;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSavedIdList(String str) {
        this.savedIdList = str;
    }

    public void setUrlLimit(Integer num) {
        this.urlLimit = num;
    }

    public ECardConfig() {
    }
}
