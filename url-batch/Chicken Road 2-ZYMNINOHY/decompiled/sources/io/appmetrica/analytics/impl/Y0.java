package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes.dex */
public final class Y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f11281a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f11282b;

    public Y0(C0963t1 c0963t1, ECommerceEvent eCommerceEvent) {
        this.f11282b = c0963t1;
        this.f11281a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f11282b).reportECommerce(this.f11281a);
    }
}
