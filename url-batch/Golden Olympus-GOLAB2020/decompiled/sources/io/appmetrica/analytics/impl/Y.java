package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f38543a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38544b;

    public Y(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        return "AmountWrapper{amount=" + this.f38543a + ", unit='" + this.f38544b + "'}";
    }

    public Y(BigDecimal bigDecimal, String str) {
        this.f38543a = bigDecimal;
        this.f38544b = str;
    }
}
