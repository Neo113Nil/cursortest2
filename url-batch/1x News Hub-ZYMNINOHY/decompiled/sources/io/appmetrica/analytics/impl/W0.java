package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f6809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6810b;

    public W0(C0815s1 c0815s1, AdRevenue adRevenue) {
        this.f6810b = c0815s1;
        this.f6809a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f6810b).reportAdRevenue(this.f6809a);
    }
}
