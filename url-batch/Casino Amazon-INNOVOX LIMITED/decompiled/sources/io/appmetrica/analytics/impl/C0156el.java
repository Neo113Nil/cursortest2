package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0156el extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final If f1240a;
    public final C0656yg b;
    public final InterfaceC0092c8 c;

    public C0156el(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        this(new If(eCommerceProduct), eCommerceReferrer == null ? null : new C0656yg(eCommerceReferrer), new C0182fl());
    }

    public final InterfaceC0092c8 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f1240a + ", referrer=" + this.b + ", converter=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }

    public C0156el(If r1, C0656yg c0656yg, InterfaceC0092c8 interfaceC0092c8) {
        this.f1240a = r1;
        this.b = c0656yg;
        this.c = interfaceC0092c8;
    }
}
