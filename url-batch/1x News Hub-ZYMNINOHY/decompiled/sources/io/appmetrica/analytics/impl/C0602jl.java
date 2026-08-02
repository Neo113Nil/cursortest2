package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0602jl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final C0549hj f7659a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0538h8 f7660b;

    public C0602jl(ECommerceScreen eCommerceScreen) {
        this(new C0549hj(eCommerceScreen), new C0628kl());
    }

    public final InterfaceC0538h8 a() {
        return this.f7660b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Pf
    public final List<Ii> toProto() {
        return (List) this.f7660b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f7659a + ", converter=" + this.f7660b + '}';
    }

    public C0602jl(C0549hj c0549hj, InterfaceC0538h8 interfaceC0538h8) {
        this.f7659a = c0549hj;
        this.f7660b = interfaceC0538h8;
    }
}
