package com.baidu.ar.filter;

import java.util.List;

/* loaded from: classes.dex */
public class FilterModel {

    /* renamed from: a, reason: collision with root package name */
    public String f2262a;

    /* renamed from: b, reason: collision with root package name */
    public String f2263b;

    /* renamed from: c, reason: collision with root package name */
    public List<Object> f2264c;

    public String getFilterName() {
        return this.f2263b;
    }

    public String getFilterType() {
        return this.f2262a;
    }

    public List<Object> getUniformList() {
        return this.f2264c;
    }

    public void setFilterName(String str) {
        this.f2263b = str;
    }

    public void setFilterType(String str) {
        this.f2262a = str;
    }

    public void setUniformList(List<Object> list) {
        this.f2264c = list;
    }
}
