package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0242i3 extends ECommerceEvent {
    public static final int d = 4;
    public static final int e = 5;

    /* renamed from: a, reason: collision with root package name */
    public final int f1299a;
    public final C0319l3 b;
    public final InterfaceC0092c8 c;

    public C0242i3(int i, ECommerceCartItem eCommerceCartItem) {
        this(i, new C0319l3(eCommerceCartItem), new C0267j3());
    }

    public final InterfaceC0092c8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        int i = this.f1299a;
        return i != 4 ? i != 5 ? "unknown cart action info" : "remove cart item info" : "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f1299a + ", cartItem=" + this.b + ", converter=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public C0242i3(int i, C0319l3 c0319l3, InterfaceC0092c8 interfaceC0092c8) {
        this.f1299a = i;
        this.b = c0319l3;
        this.c = interfaceC0092c8;
    }
}
