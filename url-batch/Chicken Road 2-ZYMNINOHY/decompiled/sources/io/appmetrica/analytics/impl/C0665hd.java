package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.hd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665hd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0820nd f11995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f11996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11997c;

    public C0665hd(C0820nd c0820nd, AdRevenue adRevenue, boolean z) {
        this.f11995a = c0820nd;
        this.f11996b = adRevenue;
        this.f11997c = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0820nd.a(this.f11995a).reportAdRevenue(this.f11996b, this.f11997c);
    }
}
