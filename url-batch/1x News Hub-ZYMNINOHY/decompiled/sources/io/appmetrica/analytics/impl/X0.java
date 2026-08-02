package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes.dex */
public final class X0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f6846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6847b;

    public X0(C0815s1 c0815s1, ECommerceEvent eCommerceEvent) {
        this.f6847b = c0815s1;
        this.f6846a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f6847b).reportECommerce(this.f6846a);
    }
}
