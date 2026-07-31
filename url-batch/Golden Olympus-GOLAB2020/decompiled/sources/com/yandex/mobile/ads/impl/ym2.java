package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ym2 implements g92 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2068le f35244a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final du1 f35245b;

    public ym2(@NotNull C2068le appMetricaAdapter, @NotNull Context context, @Nullable du1 du1Var) {
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35244a = appMetricaAdapter;
        this.f35245b = du1Var;
    }

    @Override // com.yandex.mobile.ads.impl.g92
    public final void setExperiments(@NotNull String experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        du1 du1Var = this.f35245b;
        if (du1Var == null || !du1Var.C0()) {
            return;
        }
        this.f35244a.b(experiments);
    }

    @Override // com.yandex.mobile.ads.impl.g92
    public final void setTriggeredTestIds(@NotNull Set<Long> testIds) {
        Intrinsics.checkNotNullParameter(testIds, "testIds");
        du1 du1Var = this.f35245b;
        if (du1Var == null || !du1Var.C0()) {
            return;
        }
        this.f35244a.a(testIds);
    }
}
