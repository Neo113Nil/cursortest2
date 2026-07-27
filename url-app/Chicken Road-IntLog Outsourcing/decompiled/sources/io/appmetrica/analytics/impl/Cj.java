package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes.dex */
public final class Cj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f6640a;

    public Cj(ECommerceEvent eCommerceEvent) {
        this.f6640a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportECommerce(this.f6640a);
    }
}
