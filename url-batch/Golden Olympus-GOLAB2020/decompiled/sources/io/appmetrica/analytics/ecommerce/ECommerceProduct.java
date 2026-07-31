package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ECommerceProduct {

    /* renamed from: a, reason: collision with root package name */
    private final String f37095a;

    /* renamed from: b, reason: collision with root package name */
    private String f37096b;

    /* renamed from: c, reason: collision with root package name */
    private List f37097c;

    /* renamed from: d, reason: collision with root package name */
    private Map f37098d;

    /* renamed from: e, reason: collision with root package name */
    private ECommercePrice f37099e;

    /* renamed from: f, reason: collision with root package name */
    private ECommercePrice f37100f;

    /* renamed from: g, reason: collision with root package name */
    private List f37101g;

    public ECommerceProduct(@NonNull String str) {
        this.f37095a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f37099e;
    }

    public List<String> getCategoriesPath() {
        return this.f37097c;
    }

    public String getName() {
        return this.f37096b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f37100f;
    }

    public Map<String, String> getPayload() {
        return this.f37098d;
    }

    public List<String> getPromocodes() {
        return this.f37101g;
    }

    @NonNull
    public String getSku() {
        return this.f37095a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f37099e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f37097c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(String str) {
        this.f37096b = str;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f37100f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f37098d = map;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(List<String> list) {
        this.f37101g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f37095a + "', name='" + this.f37096b + "', categoriesPath=" + this.f37097c + ", payload=" + this.f37098d + ", actualPrice=" + this.f37099e + ", originalPrice=" + this.f37100f + ", promocodes=" + this.f37101g + '}';
    }
}
