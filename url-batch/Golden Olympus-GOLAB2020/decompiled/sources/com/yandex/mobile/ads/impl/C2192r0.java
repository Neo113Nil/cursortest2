package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2192r0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f30976a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jq f30977b;

    public /* synthetic */ C2192r0(mp1 mp1Var) {
        this(mp1Var, new jq());
    }

    public final void a(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f30976a.reportError("Failed to register ActivityResult", throwable);
    }

    public C2192r0(@NotNull mp1 reporter, @NotNull jq commonReportDataProvider) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        this.f30976a = reporter;
        this.f30977b = commonReportDataProvider;
    }

    public final void a(@NotNull C2353y0 adActivityData) {
        Intrinsics.checkNotNullParameter(adActivityData, "adActivityData");
        jp1 a4 = this.f30977b.a(adActivityData.c(), adActivityData.b());
        ip1.b bVar = ip1.b.f27342c0;
        Map<String, Object> b4 = a4.b();
        this.f30976a.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData")));
    }
}
