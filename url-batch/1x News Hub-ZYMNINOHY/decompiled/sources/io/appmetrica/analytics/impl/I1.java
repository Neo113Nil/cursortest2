package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes.dex */
public final class I1 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f6106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ L1 f6107c;

    public I1(L1 l12, int i3, Bundle bundle) {
        this.f6107c = l12;
        this.f6105a = i3;
        this.f6106b = bundle;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        this.f6107c.f6252b.reportData(this.f6105a, this.f6106b);
    }
}
