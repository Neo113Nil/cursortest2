package com.crrepa.band.my.model;

import java.io.Serializable;
import me.yokeyword.indexablerv.e;

/* loaded from: classes2.dex */
public class WorldClockModel implements e, Serializable {
    private String city;
    private int index;
    private String indexText;
    private String keyName;
    private double latitude;
    private double longitude;
    private String pinyin;
    private int seconds;
    private String timeIdentifier;

    public String getCity() {
        return this.city;
    }

    @Override // me.yokeyword.indexablerv.e
    public String getFieldIndexBy() {
        String str = this.city;
        this.indexText = str;
        return str;
    }

    public int getIndex() {
        return this.index;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getPinyin() {
        return this.pinyin;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public String getTimeIdentifier() {
        return this.timeIdentifier;
    }

    public void setCity(String str) {
        this.city = str;
    }

    @Override // me.yokeyword.indexablerv.e
    public void setFieldIndexBy(String str) {
        this.indexText = str;
    }

    @Override // me.yokeyword.indexablerv.e
    public void setFieldPinyinIndexBy(String str) {
        this.pinyin = str;
    }

    public void setIndex(int i8) {
        this.index = i8;
    }

    public void setKeyName(String str) {
        this.keyName = str;
    }

    public void setLatitude(double d8) {
        this.latitude = d8;
    }

    public void setLongitude(double d8) {
        this.longitude = d8;
    }

    public void setPinyin(String str) {
        this.pinyin = str;
    }

    public void setSeconds(int i8) {
        this.seconds = i8;
    }

    public void setTimeIdentifier(String str) {
        this.timeIdentifier = str;
    }
}
