package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes3.dex */
public final class S0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f38221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38222b;

    public S0(C2872p1 c2872p1, Revenue revenue) {
        this.f38222b = c2872p1;
        this.f38221a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f38222b).reportRevenue(this.f38221a);
    }
}
