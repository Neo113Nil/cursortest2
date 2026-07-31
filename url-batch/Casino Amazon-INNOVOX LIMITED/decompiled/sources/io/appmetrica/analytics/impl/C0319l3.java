package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0319l3 {

    /* renamed from: a, reason: collision with root package name */
    public final If f1351a;
    public final BigDecimal b;
    public final Af c;
    public final C0656yg d;

    public C0319l3(ECommerceCartItem eCommerceCartItem) {
        this(new If(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new Af(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C0656yg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f1351a + ", quantity=" + this.b + ", revenue=" + this.c + ", referrer=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    public C0319l3(If r1, BigDecimal bigDecimal, Af af, C0656yg c0656yg) {
        this.f1351a = r1;
        this.b = bigDecimal;
        this.c = af;
        this.d = c0656yg;
    }
}
