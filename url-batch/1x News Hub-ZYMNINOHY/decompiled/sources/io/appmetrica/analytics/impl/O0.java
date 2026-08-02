package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f6394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6395b;

    public O0(C0815s1 c0815s1, Location location) {
        this.f6395b = c0815s1;
        this.f6394a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0944x0 c0944x0 = this.f6395b.f8278a;
        Location location = this.f6394a;
        c0944x0.getClass();
        C0918w0.c().a(location);
    }
}
