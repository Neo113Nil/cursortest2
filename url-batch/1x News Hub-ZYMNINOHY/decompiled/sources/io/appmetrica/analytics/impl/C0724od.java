package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.od, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724od extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0879ud f8004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f8005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8006c;

    public C0724od(C0879ud c0879ud, AdRevenue adRevenue, boolean z) {
        this.f8004a = c0879ud;
        this.f8005b = adRevenue;
        this.f8006c = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0879ud.a(this.f8004a).reportAdRevenue(this.f8005b, this.f8006c);
    }
}
