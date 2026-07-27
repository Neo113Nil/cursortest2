package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0968s3 {

    /* renamed from: a, reason: collision with root package name */
    public final Mf f9224a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f9225b;

    /* renamed from: c, reason: collision with root package name */
    public final Ef f9226c;

    /* renamed from: d, reason: collision with root package name */
    public final Cg f9227d;

    public C0968s3(ECommerceCartItem eCommerceCartItem) {
        this(new Mf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Ef(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new Cg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f9224a + ", quantity=" + this.f9225b + ", revenue=" + this.f9226c + ", referrer=" + this.f9227d + '}';
    }

    public C0968s3(Mf mf, BigDecimal bigDecimal, Ef ef, Cg cg) {
        this.f9224a = mf;
        this.f9225b = bigDecimal;
        this.f9226c = ef;
        this.f9227d = cg;
    }
}
