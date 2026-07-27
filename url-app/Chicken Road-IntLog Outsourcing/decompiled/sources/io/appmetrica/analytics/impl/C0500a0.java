package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500a0 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0526b0 f7806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f7807b;

    public C0500a0(C0526b0 c0526b0, Context context) {
        this.f7806a = c0526b0;
        this.f7807b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0526b0 c0526b0 = this.f7806a;
        Context context = this.f7807b;
        c0526b0.getClass();
        c0526b0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
