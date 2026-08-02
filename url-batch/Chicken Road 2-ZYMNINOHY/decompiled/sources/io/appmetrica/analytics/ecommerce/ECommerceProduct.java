package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceProduct {

    /* renamed from: a, reason: collision with root package name */
    private final String f9810a;

    /* renamed from: b, reason: collision with root package name */
    private String f9811b;

    /* renamed from: c, reason: collision with root package name */
    private List f9812c;

    /* renamed from: d, reason: collision with root package name */
    private Map f9813d;

    /* renamed from: e, reason: collision with root package name */
    private ECommercePrice f9814e;

    /* renamed from: f, reason: collision with root package name */
    private ECommercePrice f9815f;

    /* renamed from: g, reason: collision with root package name */
    private List f9816g;

    public ECommerceProduct(String str) {
        this.f9810a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f9814e;
    }

    public List<String> getCategoriesPath() {
        return this.f9812c;
    }

    public String getName() {
        return this.f9811b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f9815f;
    }

    public Map<String, String> getPayload() {
        return this.f9813d;
    }

    public List<String> getPromocodes() {
        return this.f9816g;
    }

    public String getSku() {
        return this.f9810a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f9814e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f9812c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f9811b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f9815f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f9813d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f9816g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f9810a + "', name='" + this.f9811b + "', categoriesPath=" + this.f9812c + ", payload=" + this.f9813d + ", actualPrice=" + this.f9814e + ", originalPrice=" + this.f9815f + ", promocodes=" + this.f9816g + '}';
    }
}
