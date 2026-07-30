package com.baidu.mapapi.search.batch.common;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ParamsItem extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = FirebaseAnalytics.Param.METHOD)
    private String f6648a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "url")
    private String f6649b;

    public String getMethod() {
        return this.f6648a;
    }

    public String getUrl() {
        return this.f6649b;
    }

    public void setMethod(String str) {
        this.f6648a = str;
    }

    public void setUrl(String str) {
        this.f6649b = str;
    }
}
