package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class H1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f37600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f37601b;

    public H1(I1 i12, Bundle bundle) {
        this.f37601b = i12;
        this.f37600a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f37601b.f37689b.pauseUserSession(this.f37600a);
    }
}
