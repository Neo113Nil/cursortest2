package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* renamed from: io.appmetrica.analytics.impl.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732k3 {

    /* renamed from: a, reason: collision with root package name */
    public final Hf f12184a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f12185b;

    /* renamed from: c, reason: collision with root package name */
    public final C1133zf f12186c;

    /* renamed from: d, reason: collision with root package name */
    public final C1082xg f12187d;

    public C0732k3(ECommerceCartItem eCommerceCartItem) {
        this(new Hf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C1133zf(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C1082xg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f12184a + ", quantity=" + this.f12185b + ", revenue=" + this.f12186c + ", referrer=" + this.f12187d + '}';
    }

    public C0732k3(Hf hf, BigDecimal bigDecimal, C1133zf c1133zf, C1082xg c1082xg) {
        this.f12184a = hf;
        this.f12185b = bigDecimal;
        this.f12186c = c1133zf;
        this.f12187d = c1082xg;
    }
}
