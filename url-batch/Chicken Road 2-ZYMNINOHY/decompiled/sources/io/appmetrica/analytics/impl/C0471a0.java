package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471a0 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0497b0 f11405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f11406b;

    public C0471a0(C0497b0 c0497b0, Context context) {
        this.f11405a = c0497b0;
        this.f11406b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0497b0 c0497b0 = this.f11405a;
        Context context = this.f11406b;
        c0497b0.getClass();
        c0497b0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
