package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class X0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f11216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f11217b;

    public X0(C0963t1 c0963t1, AdRevenue adRevenue) {
        this.f11217b = c0963t1;
        this.f11216a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f11217b).reportAdRevenue(this.f11216a);
    }
}
