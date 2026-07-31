package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2632fl extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final C2890pj f38974a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3034v8 f38975b;

    public C2632fl(@NonNull ECommerceScreen eCommerceScreen) {
        this(new C2890pj(eCommerceScreen), new C2659gl());
    }

    @NonNull
    public final InterfaceC3034v8 a() {
        return this.f38975b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Xf
    public final List<Qi> toProto() {
        return (List) this.f38975b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f38974a + ", converter=" + this.f38975b + '}';
    }

    public C2632fl(@NonNull C2890pj c2890pj, @NonNull InterfaceC3034v8 interfaceC3034v8) {
        this.f38974a = c2890pj;
        this.f38975b = interfaceC3034v8;
    }
}
