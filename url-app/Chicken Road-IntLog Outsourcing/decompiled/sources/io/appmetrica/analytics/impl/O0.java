package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f7204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7205b;

    public O0(C0966s1 c0966s1, Location location) {
        this.f7205b = c0966s1;
        this.f7204a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1095x0 c1095x0 = this.f7205b.f9216a;
        Location location = this.f7204a;
        c1095x0.getClass();
        C1069w0.c().a(location);
    }
}
