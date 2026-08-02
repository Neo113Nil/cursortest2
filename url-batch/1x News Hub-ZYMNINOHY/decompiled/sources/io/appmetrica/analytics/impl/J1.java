package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class J1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f6193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L1 f6194b;

    public J1(L1 l12, Bundle bundle) {
        this.f6194b = l12;
        this.f6193a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6194b.f6252b.resumeUserSession(this.f6193a);
    }
}
