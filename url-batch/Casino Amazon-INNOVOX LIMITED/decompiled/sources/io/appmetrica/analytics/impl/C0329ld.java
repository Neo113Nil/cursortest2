package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0329ld extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0404od f1359a;
    public final /* synthetic */ boolean b;

    public C0329ld(C0404od c0404od, boolean z) {
        this.f1359a = c0404od;
        this.b = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0404od.a(this.f1359a).a(this.b, false);
    }
}
