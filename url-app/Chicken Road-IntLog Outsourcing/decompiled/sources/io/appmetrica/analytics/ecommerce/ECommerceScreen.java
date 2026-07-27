package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceScreen {

    /* renamed from: a, reason: collision with root package name */
    private String f6331a;

    /* renamed from: b, reason: collision with root package name */
    private List f6332b;

    /* renamed from: c, reason: collision with root package name */
    private String f6333c;

    /* renamed from: d, reason: collision with root package name */
    private Map f6334d;

    public List<String> getCategoriesPath() {
        return this.f6332b;
    }

    public String getName() {
        return this.f6331a;
    }

    public Map<String, String> getPayload() {
        return this.f6334d;
    }

    public String getSearchQuery() {
        return this.f6333c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f6332b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f6331a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f6334d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f6333c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f6331a + "', categoriesPath=" + this.f6332b + ", searchQuery='" + this.f6333c + "', payload=" + this.f6334d + '}';
    }
}
