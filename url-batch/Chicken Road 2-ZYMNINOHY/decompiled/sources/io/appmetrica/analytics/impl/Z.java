package io.appmetrica.analytics.impl;

import E.AbstractC0005f;
import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f11330a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11331b;

    public Z(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AmountWrapper{amount=");
        sb.append(this.f11330a);
        sb.append(", unit='");
        return AbstractC0005f.q(sb, this.f11331b, "'}");
    }

    public Z(BigDecimal bigDecimal, String str) {
        this.f11330a = bigDecimal;
        this.f11331b = str;
    }
}
