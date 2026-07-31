package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class G3 {

    /* renamed from: a, reason: collision with root package name */
    public final Uf f37554a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f37555b;

    /* renamed from: c, reason: collision with root package name */
    public final Nf f37556c;

    /* renamed from: d, reason: collision with root package name */
    public final Kg f37557d;

    public G3(ECommerceCartItem eCommerceCartItem) {
        this(new Uf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Nf(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new Kg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f37554a + ", quantity=" + this.f37555b + ", revenue=" + this.f37556c + ", referrer=" + this.f37557d + '}';
    }

    public G3(Uf uf, BigDecimal bigDecimal, Nf nf, Kg kg) {
        this.f37554a = uf;
        this.f37555b = bigDecimal;
        this.f37556c = nf;
        this.f37557d = kg;
    }
}
