package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes.dex */
public final class P0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f10783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f10784b;

    public P0(C0963t1 c0963t1, Location location) {
        this.f10784b = c0963t1;
        this.f10783a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1118z0 c1118z0 = this.f10784b.f12756a;
        Location location = this.f10783a;
        c1118z0.getClass();
        C1092y0.c().a(location);
    }
}
