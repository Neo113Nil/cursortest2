package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class K1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f6223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f6224b;

    public K1(L1 l12, Bundle bundle) {
        this.f6224b = l12;
        this.f6223a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6224b.f6252b.pauseUserSession(this.f6223a);
    }
}
