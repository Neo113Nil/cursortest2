package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceScreen {

    /* renamed from: a, reason: collision with root package name */
    private String f5565a;

    /* renamed from: b, reason: collision with root package name */
    private List f5566b;

    /* renamed from: c, reason: collision with root package name */
    private String f5567c;

    /* renamed from: d, reason: collision with root package name */
    private Map f5568d;

    public List<String> getCategoriesPath() {
        return this.f5566b;
    }

    public String getName() {
        return this.f5565a;
    }

    public Map<String, String> getPayload() {
        return this.f5568d;
    }

    public String getSearchQuery() {
        return this.f5567c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f5566b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f5565a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f5568d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f5567c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f5565a + "', categoriesPath=" + this.f5566b + ", searchQuery='" + this.f5567c + "', payload=" + this.f5568d + '}';
    }
}
