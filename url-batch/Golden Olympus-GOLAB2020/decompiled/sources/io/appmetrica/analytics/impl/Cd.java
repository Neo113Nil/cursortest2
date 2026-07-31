package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class Cd extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dd f37293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f37295c;

    public Cd(Dd dd, String str, byte[] bArr) {
        this.f37293a = dd;
        this.f37294b = str;
        this.f37295c = bArr;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Dd.a(this.f37293a).setSessionExtra(this.f37294b, this.f37295c);
    }
}
