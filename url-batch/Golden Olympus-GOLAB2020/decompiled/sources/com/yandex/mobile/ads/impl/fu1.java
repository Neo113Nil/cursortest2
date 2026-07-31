package com.yandex.mobile.ads.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fu1 implements tu1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2275ue f25924a;

    public fu1(@NotNull C2275ue appMetricaPolicyConfigurator) {
        Intrinsics.checkNotNullParameter(appMetricaPolicyConfigurator, "appMetricaPolicyConfigurator");
        this.f25924a = appMetricaPolicyConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.tu1
    public final void a(@NotNull Context context, @NotNull du1 sdkConfiguration) {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        C1828bd configuration = this.f25924a.a(context);
        C2319wc.f33993a.getClass();
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        try {
            Result.Companion companion = Result.Companion;
            AppMetricaLibraryAdapter.setAdvIdentifiersTracking(configuration.a());
            m243constructorimpl = Result.m243constructorimpl(Unit.f41027a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            ap0.b(new Object[0]);
        }
    }
}
