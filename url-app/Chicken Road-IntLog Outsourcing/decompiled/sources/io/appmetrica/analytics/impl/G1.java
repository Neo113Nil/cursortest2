package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class G1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f6818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f6819b;

    public G1(L1 l12, Intent intent) {
        this.f6819b = l12;
        this.f6818a = intent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6819b.f7057b.c(this.f6818a);
    }
}
