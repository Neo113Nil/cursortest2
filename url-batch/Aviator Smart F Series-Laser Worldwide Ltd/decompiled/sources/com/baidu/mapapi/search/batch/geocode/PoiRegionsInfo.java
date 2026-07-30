package com.baidu.mapapi.search.batch.geocode;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class PoiRegionsInfo extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "direction_desc")
    private String f6686a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "name")
    private String f6687b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "tag")
    private String f6688c;

    public String getDirectionDesc() {
        return this.f6686a;
    }

    public String getName() {
        return this.f6687b;
    }

    public String getTag() {
        return this.f6688c;
    }

    public void setDirectionDesc(String str) {
        this.f6686a = str;
    }

    public void setName(String str) {
        this.f6687b = str;
    }

    public void setTag(String str) {
        this.f6688c = str;
    }
}
