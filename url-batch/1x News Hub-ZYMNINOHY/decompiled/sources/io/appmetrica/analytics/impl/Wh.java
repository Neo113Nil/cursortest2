package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes.dex */
public final class Wh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f6836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f6837b;

    public Wh(C0651li c0651li, ECommerceEvent eCommerceEvent) {
        this.f6837b = c0651li;
        this.f6836a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f6837b;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportECommerce(this.f6836a);
    }
}
