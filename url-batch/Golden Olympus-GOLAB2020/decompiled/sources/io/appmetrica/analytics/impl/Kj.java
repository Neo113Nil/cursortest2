package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes3.dex */
public final class Kj implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f37898a;

    public Kj(ECommerceEvent eCommerceEvent) {
        this.f37898a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.reportECommerce(this.f37898a);
    }
}
