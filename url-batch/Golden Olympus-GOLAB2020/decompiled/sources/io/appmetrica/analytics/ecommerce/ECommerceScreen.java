package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ECommerceScreen {

    /* renamed from: a, reason: collision with root package name */
    private String f37105a;

    /* renamed from: b, reason: collision with root package name */
    private List f37106b;

    /* renamed from: c, reason: collision with root package name */
    private String f37107c;

    /* renamed from: d, reason: collision with root package name */
    private Map f37108d;

    public List<String> getCategoriesPath() {
        return this.f37106b;
    }

    public String getName() {
        return this.f37105a;
    }

    public Map<String, String> getPayload() {
        return this.f37108d;
    }

    public String getSearchQuery() {
        return this.f37107c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f37106b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f37105a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f37108d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f37107c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f37105a + "', categoriesPath=" + this.f37106b + ", searchQuery='" + this.f37107c + "', payload=" + this.f37108d + '}';
    }
}
