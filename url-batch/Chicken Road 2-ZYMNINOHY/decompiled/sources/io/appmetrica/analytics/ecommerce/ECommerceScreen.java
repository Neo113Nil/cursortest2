package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceScreen {

    /* renamed from: a, reason: collision with root package name */
    private String f9820a;

    /* renamed from: b, reason: collision with root package name */
    private List f9821b;

    /* renamed from: c, reason: collision with root package name */
    private String f9822c;

    /* renamed from: d, reason: collision with root package name */
    private Map f9823d;

    public List<String> getCategoriesPath() {
        return this.f9821b;
    }

    public String getName() {
        return this.f9820a;
    }

    public Map<String, String> getPayload() {
        return this.f9823d;
    }

    public String getSearchQuery() {
        return this.f9822c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f9821b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f9820a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f9823d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f9822c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f9820a + "', categoriesPath=" + this.f9821b + ", searchQuery='" + this.f9822c + "', payload=" + this.f9823d + '}';
    }
}
