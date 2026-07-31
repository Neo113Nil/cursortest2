package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0208gl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final C0129dj f1276a;
    public final InterfaceC0092c8 b;

    public C0208gl(ECommerceScreen eCommerceScreen) {
        this(new C0129dj(eCommerceScreen), new C0234hl());
    }

    public final InterfaceC0092c8 a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f1276a + ", converter=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }

    public C0208gl(C0129dj c0129dj, InterfaceC0092c8 interfaceC0092c8) {
        this.f1276a = c0129dj;
        this.b = interfaceC0092c8;
    }
}
