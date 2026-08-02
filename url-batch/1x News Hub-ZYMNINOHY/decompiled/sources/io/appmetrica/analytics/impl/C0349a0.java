package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349a0 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0375b0 f6965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6966b;

    public C0349a0(C0375b0 c0375b0, Context context) {
        this.f6965a = c0375b0;
        this.f6966b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0375b0 c0375b0 = this.f6965a;
        Context context = this.f6966b;
        c0375b0.getClass();
        c0375b0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
