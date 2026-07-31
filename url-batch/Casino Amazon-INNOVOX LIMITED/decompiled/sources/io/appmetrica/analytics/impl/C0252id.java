package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.id, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0252id extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0404od f1305a;
    public final /* synthetic */ AdRevenue b;
    public final /* synthetic */ boolean c;

    public C0252id(C0404od c0404od, AdRevenue adRevenue, boolean z) {
        this.f1305a = c0404od;
        this.b = adRevenue;
        this.c = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0404od.a(this.f1305a).reportAdRevenue(this.b, this.c);
    }
}
