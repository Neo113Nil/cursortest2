package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bk0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private C2360y7<?> f23846a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f23847b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final C1795a4 f23848c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mp1 f23849d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final du1 f23850e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final jq f23851f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2388zc f23852g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private m71 f23853h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ bk0(Context context, C2360y7 c2360y7, C2286v2 c2286v2, C1795a4 c1795a4) {
        this(context, c2360y7, c2286v2, c1795a4, r7, ew1.a.a().a(context), new jq(), new C2388zc(context));
        c2286v2.p().f();
        e01 a4 = C1900ed.a(context, zm2.f35627a, c2286v2.p().b());
        int i4 = ew1.f25476l;
    }

    private final jp1 a() {
        jp1 a4 = this.f23851f.a(this.f23846a, this.f23847b);
        a4.b(ip1.a.f27312a, com.ironsource.ge.f16389B1);
        vy1 q4 = this.f23847b.q();
        if (q4 != null) {
            a4.b(q4.a().a(), "size_type");
            a4.b(Integer.valueOf(q4.getWidth()), "width");
            a4.b(Integer.valueOf(q4.getHeight()), "height");
        }
        du1 du1Var = this.f23850e;
        if (du1Var != null) {
            a4.b(du1Var.k(), "banner_size_calculation_type");
        }
        m71 m71Var = this.f23853h;
        return m71Var != null ? kp1.a(a4, m71Var.a()) : a4;
    }

    public final void b(@NotNull ip1.b reportType, @NotNull c92 validationResult) {
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        jp1 a4 = a();
        a4.b(validationResult.b().a(), "reason");
        String a5 = validationResult.a();
        if (a5 != null && a5.length() > 0) {
            a4.b(a5, "asset_name");
        }
        ip1 ip1Var = new ip1(reportType, (Map<String, ? extends Object>) a4.b(), a4.a());
        this.f23849d.a(ip1Var);
        this.f23852g.a(reportType, ip1Var.b(), ip1.a.f27312a, this.f23848c);
    }

    public bk0(@NotNull Context context, @NotNull C2360y7<?> adResponse, @NotNull C2286v2 adConfiguration, @Nullable C1795a4 c1795a4, @NotNull mp1 metricaReporter, @Nullable du1 du1Var, @NotNull jq commonReportDataProvider, @NotNull C2388zc metricaLibraryEventReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        Intrinsics.checkNotNullParameter(metricaLibraryEventReporter, "metricaLibraryEventReporter");
        this.f23846a = adResponse;
        this.f23847b = adConfiguration;
        this.f23848c = c1795a4;
        this.f23849d = metricaReporter;
        this.f23850e = du1Var;
        this.f23851f = commonReportDataProvider;
        this.f23852g = metricaLibraryEventReporter;
    }

    public final void a(@NotNull ip1.b reportType, @NotNull c92 validationResult) {
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        jp1 a4 = a();
        a4.b(validationResult.b().a(), "reason");
        String a5 = validationResult.a();
        if (a5 != null && a5.length() > 0) {
            a4.b(a5, "asset_name");
        }
        ip1 ip1Var = new ip1(reportType, (Map<String, ? extends Object>) a4.b(), a4.a());
        this.f23849d.a(ip1Var);
        this.f23852g.a(reportType, ip1Var.b(), ip1.a.f27312a, this.f23848c);
    }

    public final void a(@NotNull ip1.b reportType, @NotNull Map<String, ? extends Object> additionalReportData) {
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        jp1 a4 = a();
        a4.a(additionalReportData);
        ip1 ip1Var = new ip1(reportType, (Map<String, ? extends Object>) a4.b(), a4.a());
        this.f23849d.a(ip1Var);
        this.f23852g.a(reportType, ip1Var.b(), ip1.a.f27312a, this.f23848c);
    }

    public final void a(@NotNull ip1.b reportType) {
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        jp1 a4 = a();
        ip1 ip1Var = new ip1(reportType, (Map<String, ? extends Object>) a4.b(), a4.a());
        this.f23849d.a(ip1Var);
        this.f23852g.a(reportType, ip1Var.b(), ip1.a.f27312a, this.f23848c);
    }

    public final void a(@NotNull m71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f23853h = reportParameterManager;
    }

    public final void a(@NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f23846a = adResponse;
    }
}
