package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499fl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Mf f7325a;

    /* renamed from: b, reason: collision with root package name */
    public final C0549hj f7326b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0538h8 f7327c;

    public C0499fl(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        this(new Mf(eCommerceProduct), new C0549hj(eCommerceScreen), new C0525gl());
    }

    public final InterfaceC0538h8 a() {
        return this.f7327c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f7327c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f7325a + ", screen=" + this.f7326b + ", converter=" + this.f7327c + '}';
    }

    public C0499fl(Mf mf, C0549hj c0549hj, InterfaceC0538h8 interfaceC0538h8) {
        this.f7325a = mf;
        this.f7326b = c0549hj;
        this.f7327c = interfaceC0538h8;
    }
}
