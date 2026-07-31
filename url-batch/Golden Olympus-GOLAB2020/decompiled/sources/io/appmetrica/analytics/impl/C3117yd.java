package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.yd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3117yd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dd f40276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f40277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f40278c;

    public C3117yd(Dd dd, AdRevenue adRevenue, boolean z4) {
        this.f40276a = dd;
        this.f40277b = adRevenue;
        this.f40278c = z4;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Dd.a(this.f40276a).reportAdRevenue(this.f40277b, this.f40278c);
    }
}
