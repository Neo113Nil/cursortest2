package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes.dex */
public final class Wh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f7671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f7672b;

    public Wh(C0802li c0802li, ECommerceEvent eCommerceEvent) {
        this.f7672b = c0802li;
        this.f7671a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7672b;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportECommerce(this.f7671a);
    }
}
