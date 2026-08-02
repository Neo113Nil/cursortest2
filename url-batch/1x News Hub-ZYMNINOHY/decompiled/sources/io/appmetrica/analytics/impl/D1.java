package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class D1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f5876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5877b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L1 f5878c;

    public D1(L1 l12, Intent intent, int i3) {
        this.f5878c = l12;
        this.f5876a = intent;
        this.f5877b = i3;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f5878c.f6252b.a(this.f5876a, this.f5877b);
    }
}
