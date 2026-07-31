package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2549ci implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f38783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f38784b;

    public RunnableC2549ci(C2992ti c2992ti, AdRevenue adRevenue) {
        this.f38784b = c2992ti;
        this.f38783a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f38784b;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).reportAdRevenue(this.f38783a);
    }
}
