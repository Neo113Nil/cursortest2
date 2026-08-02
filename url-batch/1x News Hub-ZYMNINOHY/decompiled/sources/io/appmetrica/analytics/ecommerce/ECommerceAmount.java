package io.appmetrica.analytics.ecommerce;

import E1.AbstractC0033i;
import io.appmetrica.analytics.impl.AbstractC0709no;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class ECommerceAmount {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f5545a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5546b;

    public ECommerceAmount(long j3, String str) {
        this(AbstractC0709no.a(j3), str);
    }

    public BigDecimal getAmount() {
        return this.f5545a;
    }

    public String getUnit() {
        return this.f5546b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ECommerceAmount{amount=");
        sb.append(this.f5545a);
        sb.append(", unit='");
        return AbstractC0033i.m(sb, this.f5546b, "'}");
    }

    public ECommerceAmount(double d3, String str) {
        this(new BigDecimal(AbstractC0709no.a(d3)), str);
    }

    public ECommerceAmount(BigDecimal bigDecimal, String str) {
        this.f5545a = bigDecimal;
        this.f5546b = str;
    }
}
