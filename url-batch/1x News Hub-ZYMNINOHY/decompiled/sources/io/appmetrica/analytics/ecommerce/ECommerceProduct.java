package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ECommerceProduct {

    /* renamed from: a, reason: collision with root package name */
    private final String f5556a;

    /* renamed from: b, reason: collision with root package name */
    private String f5557b;

    /* renamed from: c, reason: collision with root package name */
    private List f5558c;

    /* renamed from: d, reason: collision with root package name */
    private Map f5559d;

    /* renamed from: e, reason: collision with root package name */
    private ECommercePrice f5560e;
    private ECommercePrice f;

    /* renamed from: g, reason: collision with root package name */
    private List f5561g;

    public ECommerceProduct(String str) {
        this.f5556a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f5560e;
    }

    public List<String> getCategoriesPath() {
        return this.f5558c;
    }

    public String getName() {
        return this.f5557b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f;
    }

    public Map<String, String> getPayload() {
        return this.f5559d;
    }

    public List<String> getPromocodes() {
        return this.f5561g;
    }

    public String getSku() {
        return this.f5556a;
    }

    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f5560e = eCommercePrice;
        return this;
    }

    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f5558c = list;
        return this;
    }

    public ECommerceProduct setName(String str) {
        this.f5557b = str;
        return this;
    }

    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f = eCommercePrice;
        return this;
    }

    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f5559d = map;
        return this;
    }

    public ECommerceProduct setPromocodes(List<String> list) {
        this.f5561g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f5556a + "', name='" + this.f5557b + "', categoriesPath=" + this.f5558c + ", payload=" + this.f5559d + ", actualPrice=" + this.f5560e + ", originalPrice=" + this.f + ", promocodes=" + this.f5561g + '}';
    }
}
