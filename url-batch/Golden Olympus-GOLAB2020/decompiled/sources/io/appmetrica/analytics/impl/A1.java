package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class A1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f37148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37149b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I1 f37150c;

    public A1(I1 i12, Intent intent, int i4) {
        this.f37150c = i12;
        this.f37148a = intent;
        this.f37149b = i4;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f37150c.f37689b.a(this.f37148a, this.f37149b);
    }
}
