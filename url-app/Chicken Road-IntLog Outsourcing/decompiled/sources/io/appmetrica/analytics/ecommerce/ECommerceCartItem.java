package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.AbstractC0860no;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class ECommerceCartItem {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f6312a;

    /* renamed from: b, reason: collision with root package name */
    private final BigDecimal f6313b;

    /* renamed from: c, reason: collision with root package name */
    private final ECommercePrice f6314c;

    /* renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f6315d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j2) {
        this(eCommerceProduct, eCommercePrice, AbstractC0860no.a(j2));
    }

    public ECommerceProduct getProduct() {
        return this.f6312a;
    }

    public BigDecimal getQuantity() {
        return this.f6313b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f6315d;
    }

    public ECommercePrice getRevenue() {
        return this.f6314c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f6315d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f6312a + ", quantity=" + this.f6313b + ", revenue=" + this.f6314c + ", referrer=" + this.f6315d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d6) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(AbstractC0860no.a(d6)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f6312a = eCommerceProduct;
        this.f6313b = bigDecimal;
        this.f6314c = eCommercePrice;
    }
}
