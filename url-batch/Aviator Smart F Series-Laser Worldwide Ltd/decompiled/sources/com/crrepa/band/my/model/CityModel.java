package com.crrepa.band.my.model;

import me.yokeyword.indexablerv.e;

/* loaded from: classes2.dex */
public class CityModel implements e {
    private long id;
    private String name;
    private String pinyin;

    public CityModel() {
    }

    @Override // me.yokeyword.indexablerv.e
    public String getFieldIndexBy() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPinyin() {
        return this.pinyin;
    }

    @Override // me.yokeyword.indexablerv.e
    public void setFieldIndexBy(String str) {
        this.name = str;
    }

    @Override // me.yokeyword.indexablerv.e
    public void setFieldPinyinIndexBy(String str) {
        this.pinyin = str;
    }

    public void setId(long j8) {
        this.id = j8;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPinyin(String str) {
        this.pinyin = str;
    }

    public CityModel(String str) {
        this.name = str;
    }
}
