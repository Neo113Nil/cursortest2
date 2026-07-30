package com.baidu.mapapi.search.busline;

import com.baidu.mapapi.search.base.LanguageType;

/* loaded from: classes2.dex */
public class BusLineSearchOption {
    public Integer mCity;
    public String mEndUid;
    public String mStartUid;
    public String mUid = null;
    public LanguageType mLanguageType = LanguageType.LanguageTypeChinese;

    public BusLineSearchOption city(int i8) {
        this.mCity = Integer.valueOf(i8);
        return this;
    }

    public BusLineSearchOption endUid(String str) {
        this.mEndUid = str;
        return this;
    }

    public BusLineSearchOption language(LanguageType languageType) {
        this.mLanguageType = languageType;
        return this;
    }

    public BusLineSearchOption startUid(String str) {
        this.mStartUid = str;
        return this;
    }

    public BusLineSearchOption uid(String str) {
        this.mUid = str;
        return this;
    }
}
