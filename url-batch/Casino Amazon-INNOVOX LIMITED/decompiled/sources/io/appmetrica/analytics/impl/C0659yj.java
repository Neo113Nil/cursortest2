package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.yj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0659yj implements Ra {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f1588a;

    public C0659yj(ECommerceEvent eCommerceEvent) {
        this.f1588a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.Ra
    public final void a(Sa sa) {
        sa.reportECommerce(this.f1588a);
    }
}
