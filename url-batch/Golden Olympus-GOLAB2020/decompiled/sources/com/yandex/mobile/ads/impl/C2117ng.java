package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ng, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2117ng {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gs f29563a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f29564b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2216s1 f29565c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC1847c8 f29566d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private m71 f29567e;

    public /* synthetic */ C2117ng(InterfaceC1915f4 interfaceC1915f4, gs gsVar, String str) {
        this(interfaceC1915f4, gsVar, str, interfaceC1915f4.a(), interfaceC1915f4.b());
    }

    @NotNull
    public final jp1 a() {
        jp1 a4 = this.f29566d.a();
        a4.b(this.f29563a.b(), AdRevenueScheme.AD_TYPE);
        a4.a(this.f29564b, "ad_id");
        a4.a((Map<String, ? extends Object>) this.f29565c.a());
        m71 m71Var = this.f29567e;
        return m71Var != null ? kp1.a(a4, m71Var.a()) : a4;
    }

    public C2117ng(@NotNull InterfaceC1915f4 adInfoReportDataProviderFactory, @NotNull gs adType, @Nullable String str, @NotNull InterfaceC2216s1 adAdapterReportDataProvider, @NotNull InterfaceC1847c8 adResponseReportDataProvider) {
        Intrinsics.checkNotNullParameter(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adAdapterReportDataProvider, "adAdapterReportDataProvider");
        Intrinsics.checkNotNullParameter(adResponseReportDataProvider, "adResponseReportDataProvider");
        this.f29563a = adType;
        this.f29564b = str;
        this.f29565c = adAdapterReportDataProvider;
        this.f29566d = adResponseReportDataProvider;
    }

    public final void a(@NotNull m71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f29567e = reportParameterManager;
    }
}
