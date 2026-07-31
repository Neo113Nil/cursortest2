package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.le, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2068le {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final AppMetricaAdapter f28521a;

    public C2068le(@NotNull Context context) {
        AppMetricaAdapter appMetricaAdapter;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            appMetricaAdapter = new AppMetricaAdapter(context);
        } catch (Throwable th) {
            th.toString();
            ap0.b(new Object[0]);
            appMetricaAdapter = null;
        }
        this.f28521a = appMetricaAdapter;
    }

    public final void a(@NotNull String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        try {
            AppMetricaAdapter appMetricaAdapter = this.f28521a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.a(apiKey);
            }
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
        }
    }

    public final void b(@NotNull String experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        try {
            AppMetricaAdapter appMetricaAdapter = this.f28521a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.setExperiments(experiments);
            }
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
        }
    }

    public final void a(@NotNull Set<Long> testIds) {
        Intrinsics.checkNotNullParameter(testIds, "testIds");
        try {
            AppMetricaAdapter appMetricaAdapter = this.f28521a;
            if (appMetricaAdapter != null) {
                appMetricaAdapter.setTriggeredTestIds(testIds);
            }
        } catch (Throwable unused) {
            testIds.toString();
            ap0.c(new Object[0]);
        }
    }
}
