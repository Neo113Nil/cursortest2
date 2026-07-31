package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zn1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f35644a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp1 f35645b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2117ng f35646c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35647d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn1(Context context, C2286v2 c2286v2, InterfaceC1915f4 interfaceC1915f4, gs gsVar, C2360y7 c2360y7, String str) {
        this(context, c2286v2, interfaceC1915f4, gsVar, c2360y7, str, C1900ed.a(context, zm2.f35627a, c2286v2.p().b()));
        c2286v2.p().f();
    }

    public final void a() {
        if (this.f35647d) {
            this.f35647d = false;
            return;
        }
        jp1 a4 = this.f35646c.a();
        Map<String, Object> s4 = this.f35644a.s();
        if (s4 != null) {
            a4.a((Map<String, ? extends Object>) s4);
        }
        a4.a(this.f35644a.a());
        ip1.b bVar = ip1.b.f27322J;
        Map<String, Object> b4 = a4.b();
        this.f35645b.a(new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, bVar, "reportType", b4, "reportData")));
    }

    public zn1(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull InterfaceC1915f4 adInfoReportDataProviderFactory, @NotNull gs adType, @NotNull C2360y7<?> adResponse, @Nullable String str, @NotNull mp1 metricaReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        this.f35644a = adResponse;
        this.f35645b = metricaReporter;
        this.f35646c = new C2117ng(adInfoReportDataProviderFactory, adType, str);
        this.f35647d = true;
    }

    public final void a(@NotNull m71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f35646c.a(reportParameterManager);
    }
}
