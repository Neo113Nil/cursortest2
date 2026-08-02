package io.appmetrica.analytics.ecommerce;

import E.AbstractC0005f;
import io.appmetrica.analytics.impl.AbstractC0779lo;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class ECommerceAmount {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f9799a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9800b;

    public ECommerceAmount(long j4, String str) {
        this(AbstractC0779lo.a(j4), str);
    }

    public BigDecimal getAmount() {
        return this.f9799a;
    }

    public String getUnit() {
        return this.f9800b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceAmount{amount=");
        sb.append(this.f9799a);
        sb.append(", unit='");
        return AbstractC0005f.q(sb, this.f9800b, "'}");
    }

    public ECommerceAmount(double d4, String str) {
        this(new BigDecimal(AbstractC0779lo.a(d4)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f9799a = bigDecimal;
        this.f9800b = str;
    }
}
