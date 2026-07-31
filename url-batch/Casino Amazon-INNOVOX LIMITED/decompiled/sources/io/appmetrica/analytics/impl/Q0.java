package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes3.dex */
public final class Q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f1010a;
    public final /* synthetic */ C0541u1 b;

    public Q0(C0541u1 c0541u1, Location location) {
        this.b = c0541u1;
        this.f1010a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0665z0 c0665z0 = this.b.f1507a;
        Location location = this.f1010a;
        c0665z0.getClass();
        C0640y0.c().a(location);
    }
}
