package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h91 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m71 f26672a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private C2231sg f26673b;

    public h91(@NotNull m71 reportManager, @NotNull C2231sg assetsRenderedReportParameterProvider) {
        Intrinsics.checkNotNullParameter(reportManager, "reportManager");
        Intrinsics.checkNotNullParameter(assetsRenderedReportParameterProvider, "assetsRenderedReportParameterProvider");
        this.f26672a = reportManager;
        this.f26673b = assetsRenderedReportParameterProvider;
    }

    @NotNull
    public final Map<String, Object> a() {
        return MapsKt.plus(this.f26672a.a().b(), MapsKt.mapOf(TuplesKt.to("assets", MapsKt.mapOf(TuplesKt.to("rendered", this.f26673b.a())))));
    }
}
