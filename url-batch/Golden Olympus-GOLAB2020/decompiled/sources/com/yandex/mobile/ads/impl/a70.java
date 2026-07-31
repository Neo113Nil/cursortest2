package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a70 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f23175a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2117ng f23176b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mp1 f23177c;

    public a70(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull InterfaceC1915f4 adInfoReportDataProviderFactory, @NotNull gs adType, @NotNull C2360y7 adResponse, @NotNull C2117ng assetViewsValidationReportParametersProvider, @NotNull mp1 metricaReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(assetViewsValidationReportParametersProvider, "assetViewsValidationReportParametersProvider");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        this.f23175a = adResponse;
        this.f23176b = assetViewsValidationReportParametersProvider;
        this.f23177c = metricaReporter;
    }

    public final void a(@NotNull ArrayList assetNames) {
        Intrinsics.checkNotNullParameter(assetNames, "assetNames");
        C2117ng c2117ng = this.f23176b;
        c2117ng.getClass();
        Intrinsics.checkNotNullParameter("no_view_for_asset", "reason");
        jp1 a4 = c2117ng.a();
        a4.b("no_view_for_asset", "reason");
        a4.b(assetNames, "assets");
        Map<String, Object> s4 = this.f23175a.s();
        if (s4 != null) {
            a4.a((Map<String, ? extends Object>) s4);
        }
        a4.a(this.f23175a.a());
        ip1.b bVar = ip1.b.f27324L;
        Map<String, Object> b4 = a4.b();
        this.f23177c.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData")));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a70(Context context, C2286v2 c2286v2, InterfaceC1915f4 interfaceC1915f4, gs gsVar, C2360y7 c2360y7, String str) {
        this(context, c2286v2, interfaceC1915f4, gsVar, c2360y7, r6, C1900ed.a(context, zm2.f35627a, c2286v2.p().b()));
        C2117ng c2117ng = new C2117ng(interfaceC1915f4, gsVar, str);
        c2286v2.p().f();
    }

    public final void a(@NotNull m71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f23176b.a(reportParameterManager);
    }
}
