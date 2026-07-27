package io.appmetrica.analytics.ecommerce;

import b2.AbstractC0279e;
import io.appmetrica.analytics.impl.AbstractC0860no;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class ECommerceAmount {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f6310a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6311b;

    public ECommerceAmount(long j2, String str) {
        this(AbstractC0860no.a(j2), str);
    }

    public BigDecimal getAmount() {
        return this.f6310a;
    }

    public String getUnit() {
        return this.f6311b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceAmount{amount=");
        sb.append(this.f6310a);
        sb.append(", unit='");
        return AbstractC0279e.h(sb, this.f6311b, "'}");
    }

    public ECommerceAmount(double d6, String str) {
        this(new BigDecimal(AbstractC0860no.a(d6)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f6310a = bigDecimal;
        this.f6311b = str;
    }
}
