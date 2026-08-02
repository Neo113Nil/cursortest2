package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes.dex */
public final class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f11077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f11078b;

    public V0(C0963t1 c0963t1, Revenue revenue) {
        this.f11078b = c0963t1;
        this.f11077a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f11078b).reportRevenue(this.f11077a);
    }
}
