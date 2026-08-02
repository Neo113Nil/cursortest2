package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Xh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f11269a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0644gi f11271c;

    public Xh(C0644gi c0644gi, AdRevenue adRevenue, boolean z) {
        this.f11271c = c0644gi;
        this.f11269a = adRevenue;
        this.f11270b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f11271c;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportAdRevenue(this.f11269a, this.f11270b);
    }
}
