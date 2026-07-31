package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes3.dex */
public final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f38285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38286b;

    public T0(C2872p1 c2872p1, AdRevenue adRevenue) {
        this.f38286b = c2872p1;
        this.f38285a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f38286b).reportAdRevenue(this.f38285a);
    }
}
