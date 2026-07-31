package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class E1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f37394a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f37395b;

    public E1(I1 i12, Intent intent) {
        this.f37395b = i12;
        this.f37394a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f37395b.f37689b.b(this.f37394a);
    }
}
