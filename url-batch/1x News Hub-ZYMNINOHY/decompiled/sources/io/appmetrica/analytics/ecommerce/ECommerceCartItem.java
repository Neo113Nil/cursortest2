package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.AbstractC0709no;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class ECommerceCartItem {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f5547a;

    /* renamed from: b, reason: collision with root package name */
    private final BigDecimal f5548b;

    /* renamed from: c, reason: collision with root package name */
    private final ECommercePrice f5549c;

    /* renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f5550d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j3) {
        this(eCommerceProduct, eCommercePrice, AbstractC0709no.a(j3));
    }

    public ECommerceProduct getProduct() {
        return this.f5547a;
    }

    public BigDecimal getQuantity() {
        return this.f5548b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f5550d;
    }

    public ECommercePrice getRevenue() {
        return this.f5549c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f5550d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f5547a + ", quantity=" + this.f5548b + ", revenue=" + this.f5549c + ", referrer=" + this.f5550d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d3) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(AbstractC0709no.a(d3)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f5547a = eCommerceProduct;
        this.f5548b = bigDecimal;
        this.f5549c = eCommercePrice;
    }
}
