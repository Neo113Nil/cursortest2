package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes.dex */
public final class X0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f7683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7684b;

    public X0(C0966s1 c0966s1, ECommerceEvent eCommerceEvent) {
        this.f7684b = c0966s1;
        this.f7683a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f7684b).reportECommerce(this.f7683a);
    }
}
