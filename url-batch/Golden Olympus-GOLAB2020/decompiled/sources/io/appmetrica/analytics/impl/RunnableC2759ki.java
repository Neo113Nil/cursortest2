package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.ki, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2759ki implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f39353a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f39354b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2992ti f39355c;

    public RunnableC2759ki(C2992ti c2992ti, AdRevenue adRevenue, boolean z4) {
        this.f39355c = c2992ti;
        this.f39353a = adRevenue;
        this.f39354b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f39355c;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).reportAdRevenue(this.f39353a, this.f39354b);
    }
}
