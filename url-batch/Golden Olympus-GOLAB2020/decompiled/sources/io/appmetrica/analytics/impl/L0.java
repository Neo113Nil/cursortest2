package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes3.dex */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f37910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f37911b;

    public L0(C2872p1 c2872p1, Location location) {
        this.f37911b = c2872p1;
        this.f37910a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3000u0 c3000u0 = this.f37911b.f39593a;
        Location location = this.f37910a;
        c3000u0.getClass();
        C2974t0.c().a(location);
    }
}
