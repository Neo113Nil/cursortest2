package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class Ad extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dd f37176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37178c;

    public Ad(Dd dd, int i4, String str) {
        this.f37176a = dd;
        this.f37177b = i4;
        this.f37178c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Dd.a(this.f37176a).a(new C2487aa(this.f37177b, this.f37178c));
    }
}
