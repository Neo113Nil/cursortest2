package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes3.dex */
public final class Y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f1124a;
    public final /* synthetic */ C0541u1 b;

    public Y0(C0541u1 c0541u1, AdRevenue adRevenue) {
        this.b = c0541u1;
        this.f1124a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.b).reportAdRevenue(this.f1124a);
    }
}
