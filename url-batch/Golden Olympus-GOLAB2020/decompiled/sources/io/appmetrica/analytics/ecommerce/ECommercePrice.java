package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes3.dex */
public class ECommercePrice {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f37093a;

    /* renamed from: b, reason: collision with root package name */
    private List f37094b;

    public ECommercePrice(@NonNull ECommerceAmount eCommerceAmount) {
        this.f37093a = eCommerceAmount;
    }

    @NonNull
    public ECommerceAmount getFiat() {
        return this.f37093a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f37094b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f37094b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f37093a + ", internalComponents=" + this.f37094b + '}';
    }
}
