package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.AbstractC0779lo;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class ECommerceCartItem {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f9801a;

    /* renamed from: b, reason: collision with root package name */
    private final BigDecimal f9802b;

    /* renamed from: c, reason: collision with root package name */
    private final ECommercePrice f9803c;

    /* renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f9804d;

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, long j4) {
        this(eCommerceProduct, eCommercePrice, AbstractC0779lo.a(j4));
    }

    public ECommerceProduct getProduct() {
        return this.f9801a;
    }

    public BigDecimal getQuantity() {
        return this.f9802b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f9804d;
    }

    public ECommercePrice getRevenue() {
        return this.f9803c;
    }

    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f9804d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f9801a + ", quantity=" + this.f9802b + ", revenue=" + this.f9803c + ", referrer=" + this.f9804d + '}';
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, double d4) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(AbstractC0779lo.a(d4)));
    }

    public ECommerceCartItem(ECommerceProduct eCommerceProduct, ECommercePrice eCommercePrice, BigDecimal bigDecimal) {
        this.f9801a = eCommerceProduct;
        this.f9802b = bigDecimal;
        this.f9803c = eCommercePrice;
    }
}
