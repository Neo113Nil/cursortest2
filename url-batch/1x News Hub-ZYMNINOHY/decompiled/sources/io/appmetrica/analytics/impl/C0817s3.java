package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817s3 {

    /* renamed from: a, reason: collision with root package name */
    public final Mf f8285a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f8286b;

    /* renamed from: c, reason: collision with root package name */
    public final Ef f8287c;

    /* renamed from: d, reason: collision with root package name */
    public final Cg f8288d;

    public C0817s3(ECommerceCartItem eCommerceCartItem) {
        this(new Mf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Ef(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new Cg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f8285a + ", quantity=" + this.f8286b + ", revenue=" + this.f8287c + ", referrer=" + this.f8288d + '}';
    }

    public C0817s3(Mf mf, BigDecimal bigDecimal, Ef ef, Cg cg) {
        this.f8285a = mf;
        this.f8286b = bigDecimal;
        this.f8287c = ef;
        this.f8288d = cg;
    }
}
