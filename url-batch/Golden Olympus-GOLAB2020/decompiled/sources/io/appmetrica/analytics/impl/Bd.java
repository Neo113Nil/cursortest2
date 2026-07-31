package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class Bd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dd f37235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f37236b;

    public Bd(Dd dd, boolean z4) {
        this.f37235a = dd;
        this.f37236b = z4;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Dd.a(this.f37235a).b(this.f37236b);
    }
}
