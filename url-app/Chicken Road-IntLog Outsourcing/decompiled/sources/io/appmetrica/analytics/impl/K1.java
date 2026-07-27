package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class K1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f7026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f7027b;

    public K1(L1 l12, Bundle bundle) {
        this.f7027b = l12;
        this.f7026a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f7027b.f7057b.pauseUserSession(this.f7026a);
    }
}
