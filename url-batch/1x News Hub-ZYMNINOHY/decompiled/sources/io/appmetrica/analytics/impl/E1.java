package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class E1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f5921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5923c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ L1 f5924d;

    public E1(L1 l12, Intent intent, int i3, int i4) {
        this.f5924d = l12;
        this.f5921a = intent;
        this.f5922b = i3;
        this.f5923c = i4;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f5924d.f6252b.a(this.f5921a, this.f5922b, this.f5923c);
    }
}
