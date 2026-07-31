package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class G1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f37551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I1 f37552b;

    public G1(I1 i12, Bundle bundle) {
        this.f37552b = i12;
        this.f37551a = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f37552b.f37689b.resumeUserSession(this.f37551a);
    }
}
