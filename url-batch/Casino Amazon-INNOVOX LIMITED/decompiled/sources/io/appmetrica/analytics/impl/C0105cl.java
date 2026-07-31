package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0105cl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final If f1203a;
    public final C0129dj b;
    public final InterfaceC0092c8 c;

    public C0105cl(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        this(new If(eCommerceProduct), new C0129dj(eCommerceScreen), new C0131dl());
    }

    public final InterfaceC0092c8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f1203a + ", screen=" + this.b + ", converter=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public C0105cl(If r1, C0129dj c0129dj, InterfaceC0092c8 interfaceC0092c8) {
        this.f1203a = r1;
        this.b = c0129dj;
        this.c = interfaceC0092c8;
    }
}
