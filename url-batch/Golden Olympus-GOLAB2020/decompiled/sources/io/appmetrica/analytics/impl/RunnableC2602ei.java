package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2602ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f38931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f38932b;

    public RunnableC2602ei(C2992ti c2992ti, ECommerceEvent eCommerceEvent) {
        this.f38932b = c2992ti;
        this.f38931a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f38932b;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).reportECommerce(this.f38931a);
    }
}
