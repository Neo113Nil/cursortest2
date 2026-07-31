package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class we1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f34019a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2050kk f34020b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ug1 f34021c;

    public we1(@NotNull C2105n4 adLoadingPhasesManager, @NotNull mp1 reporter, @NotNull C2050kk reportDataProvider, @NotNull ug1 phasesParametersProvider) {
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(reportDataProvider, "reportDataProvider");
        Intrinsics.checkNotNullParameter(phasesParametersProvider, "phasesParametersProvider");
        this.f34019a = reporter;
        this.f34020b = reportDataProvider;
        this.f34021c = phasesParametersProvider;
    }

    public final void a(@Nullable C2074lk c2074lk) {
        Intrinsics.checkNotNullParameter("Cannot load bidder token. Token generation failed", "reason");
        this.f34020b.getClass();
        jp1 a4 = C2050kk.a(c2074lk);
        a4.b(ip1.c.f27370d.a(), "status");
        a4.b("Cannot load bidder token. Token generation failed", "failure_reason");
        a4.b(this.f34021c.a(), "durations");
        ip1.b bVar = ip1.b.f27335W;
        Map<String, Object> b4 = a4.b();
        this.f34019a.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData")));
    }

    public final void a(@Nullable C2074lk c2074lk, @Nullable bu1 bu1Var) {
        this.f34020b.getClass();
        jp1 a4 = C2050kk.a(c2074lk);
        a4.b(ip1.c.f27369c.a(), "status");
        a4.b(this.f34021c.a(), "durations");
        a4.a(bu1Var != null ? bu1Var.a() : null, "stub_reason");
        ip1.b bVar = ip1.b.f27335W;
        Map<String, Object> b4 = a4.b();
        this.f34019a.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData")));
    }
}
