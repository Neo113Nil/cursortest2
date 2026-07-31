package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zy0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final qx0 f35818a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final lx0 f35819b;

    public /* synthetic */ zy0(qx0 qx0Var) {
        this(qx0Var, new lx0());
    }

    public final void a(@NotNull Context context, @NotNull xy0 mediationNetwork, @Nullable bx0 bx0Var, @NotNull String failureReason, @Nullable Long l4) {
        MediatedAdapterInfo b4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("failure_reason", failureReason);
        linkedHashMap.put("status", "error");
        if (l4 != null) {
            linkedHashMap.put("response_time", l4);
        }
        if (bx0Var != null) {
            this.f35819b.getClass();
            linkedHashMap.putAll(lx0.a(bx0Var));
        }
        this.f35818a.h(context, mediationNetwork, linkedHashMap, (bx0Var == null || (b4 = bx0Var.b()) == null) ? null : b4.getNetworkName());
    }

    public zy0(@NotNull qx0 mediatedAdapterReporter, @NotNull lx0 mediatedAdapterInfoReportDataProvider) {
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(mediatedAdapterInfoReportDataProvider, "mediatedAdapterInfoReportDataProvider");
        this.f35818a = mediatedAdapterReporter;
        this.f35819b = mediatedAdapterInfoReportDataProvider;
    }

    public final void a(@NotNull Context context, @NotNull xy0 mediationNetwork, @Nullable bx0 bx0Var) {
        MediatedAdapterInfo b4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("status", "success"));
        if (bx0Var != null) {
            this.f35819b.getClass();
            mutableMapOf.putAll(lx0.a(bx0Var));
        }
        this.f35818a.h(context, mediationNetwork, mutableMapOf, (bx0Var == null || (b4 = bx0Var.b()) == null) ? null : b4.getNetworkName());
    }
}
