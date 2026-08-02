package io.appmetrica.analytics.ecommerce;

import java.util.List;

/* loaded from: classes.dex */
public class ECommercePrice {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f9808a;

    /* renamed from: b, reason: collision with root package name */
    private List f9809b;

    public ECommercePrice(ECommerceAmount eCommerceAmount) {
        this.f9808a = eCommerceAmount;
    }

    public ECommerceAmount getFiat() {
        return this.f9808a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f9809b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f9809b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f9808a + ", internalComponents=" + this.f9809b + '}';
    }
}
