package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.al, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1812al {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f23351a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp1 f23352b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2117ng f23353c;

    public C1812al(@NotNull InterfaceC1915f4 adInfoReportDataProviderFactory, @NotNull gs adType, @NotNull C2360y7 adResponse, @NotNull mp1 metricaReporter, @NotNull C2117ng assetViewsValidationReportParametersProvider) {
        Intrinsics.checkNotNullParameter(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        Intrinsics.checkNotNullParameter(assetViewsValidationReportParametersProvider, "assetViewsValidationReportParametersProvider");
        this.f23351a = adResponse;
        this.f23352b = metricaReporter;
        this.f23353c = assetViewsValidationReportParametersProvider;
    }

    public final void a(@Nullable String str) {
        C2117ng c2117ng = this.f23353c;
        c2117ng.getClass();
        Intrinsics.checkNotNullParameter("no_view_for_asset", "reason");
        jp1 a4 = c2117ng.a();
        a4.b("no_view_for_asset", "reason");
        a4.b(str, "asset_name");
        Map<String, Object> s4 = this.f23351a.s();
        if (s4 != null) {
            a4.a((Map<String, ? extends Object>) s4);
        }
        a4.a(this.f23351a.a());
        ip1.b bVar = ip1.b.f27323K;
        Map<String, Object> b4 = a4.b();
        this.f23352b.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData")));
    }

    public /* synthetic */ C1812al(InterfaceC1915f4 interfaceC1915f4, gs gsVar, C2360y7 c2360y7, String str, mp1 mp1Var) {
        this(interfaceC1915f4, gsVar, c2360y7, mp1Var, new C2117ng(interfaceC1915f4, gsVar, str));
    }

    public final void a(@NotNull m71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f23353c.a(reportParameterManager);
    }
}
