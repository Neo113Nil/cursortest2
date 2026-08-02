package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0621fl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final C0542cj f11856a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0505b8 f11857b;

    public C0621fl(ECommerceScreen eCommerceScreen) {
        this(new C0542cj(eCommerceScreen), new C0647gl());
    }

    public final InterfaceC0505b8 a() {
        return this.f11857b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Kf
    public final List<Di> toProto() {
        return (List) this.f11857b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f11856a + ", converter=" + this.f11857b + '}';
    }

    public C0621fl(C0542cj c0542cj, InterfaceC0505b8 interfaceC0505b8) {
        this.f11856a = c0542cj;
        this.f11857b = interfaceC0505b8;
    }
}
