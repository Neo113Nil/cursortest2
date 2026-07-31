package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0405oe extends ECommerceEvent {
    public static final int d = 6;
    public static final int e = 7;

    /* renamed from: a, reason: collision with root package name */
    public final int f1414a;
    public final C0455qe b;
    public final InterfaceC0092c8 c;

    public C0405oe(int i, ECommerceOrder eCommerceOrder) {
        this(i, new C0455qe(eCommerceOrder), new C0430pe());
    }

    public final InterfaceC0092c8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "order info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f1414a + ", order=" + this.b + ", converter=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public C0405oe(int i, C0455qe c0455qe, InterfaceC0092c8 interfaceC0092c8) {
        this.f1414a = i;
        this.b = c0455qe;
        this.c = interfaceC0092c8;
    }
}
