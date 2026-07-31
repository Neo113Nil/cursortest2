package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tv implements sv {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f32702a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jp1 f32703b;

    public tv(@NotNull e01 metricaReporter, @NotNull jp1 reportDataWrapper) {
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        Intrinsics.checkNotNullParameter(reportDataWrapper, "reportDataWrapper");
        this.f32702a = metricaReporter;
        this.f32703b = reportDataWrapper;
    }

    @Override // com.yandex.mobile.ads.impl.sv
    public final void a(@NotNull rv eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f32703b.b(eventType.a(), "log_type");
        ip1.b bVar = ip1.b.f27334V;
        Map<String, Object> b4 = this.f32703b.b();
        this.f32702a.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(this.f32703b, bVar, "reportType", b4, "reportData")));
    }
}
