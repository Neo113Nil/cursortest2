package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes3.dex */
public final class F1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f37493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I1 f37494c;

    public F1(I1 i12, int i4, Bundle bundle) {
        this.f37494c = i12;
        this.f37492a = i4;
        this.f37493b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f37494c.f37689b.reportData(this.f37492a, this.f37493b);
    }
}
