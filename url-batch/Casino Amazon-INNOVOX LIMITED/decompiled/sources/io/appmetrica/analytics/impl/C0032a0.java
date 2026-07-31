package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0032a0 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0058b0 f1153a;
    public final /* synthetic */ Context b;

    public C0032a0(C0058b0 c0058b0, Context context) {
        this.f1153a = c0058b0;
        this.b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0058b0 c0058b0 = this.f1153a;
        Context context = this.b;
        c0058b0.getClass();
        c0058b0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
