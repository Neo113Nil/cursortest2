package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g22 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f25983a;

    public g22(@NotNull mp1 reporter) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f25983a = reporter;
    }

    public final void a(@NotNull ok0 initializationCallSource) {
        Intrinsics.checkNotNullParameter(initializationCallSource, "initializationCallSource");
        mp1 mp1Var = this.f25983a;
        ip1.b reportType = ip1.b.f27340b0;
        Map reportData = MapsKt.mapOf(TuplesKt.to("call_source", initializationCallSource.a()));
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        mp1Var.a(new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), (C1814b) null));
    }
}
