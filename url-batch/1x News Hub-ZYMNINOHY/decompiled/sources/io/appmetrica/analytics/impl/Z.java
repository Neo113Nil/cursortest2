package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;
import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f6920a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6921b;

    public Z(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountWrapper{amount=");
        sb.append(this.f6920a);
        sb.append(", unit='");
        return AbstractC0033i.m(sb, this.f6921b, "'}");
    }

    public Z(BigDecimal bigDecimal, String str) {
        this.f6920a = bigDecimal;
        this.f6921b = str;
    }
}
