package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes.dex */
public final class Rh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f10887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0644gi f10888b;

    public Rh(C0644gi c0644gi, ECommerceEvent eCommerceEvent) {
        this.f10888b = c0644gi;
        this.f10887a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f10888b;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportECommerce(this.f10887a);
    }
}
