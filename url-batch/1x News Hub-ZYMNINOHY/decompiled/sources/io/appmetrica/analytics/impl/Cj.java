package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes.dex */
public final class Cj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f5857a;

    public Cj(ECommerceEvent eCommerceEvent) {
        this.f5857a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportECommerce(this.f5857a);
    }
}
