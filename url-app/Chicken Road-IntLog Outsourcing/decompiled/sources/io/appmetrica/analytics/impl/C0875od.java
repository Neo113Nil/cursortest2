package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.od, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0875od extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1030ud f8924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f8925b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f8926c;

    public C0875od(C1030ud c1030ud, AdRevenue adRevenue, boolean z) {
        this.f8924a = c1030ud;
        this.f8925b = adRevenue;
        this.f8926c = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C1030ud.a(this.f8924a).reportAdRevenue(this.f8925b, this.f8926c);
    }
}
