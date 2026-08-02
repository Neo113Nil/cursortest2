package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class B1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Configuration f5798a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f5799b;

    public B1(L1 l12, Configuration configuration) {
        this.f5799b = l12;
        this.f5798a = configuration;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f5799b.f6252b.onConfigurationChanged(this.f5798a);
    }
}
