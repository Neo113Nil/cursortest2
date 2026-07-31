package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qx0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f30927a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final C2360y7<?> f30928b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final px0 f30929c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final hz0 f30930d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final rr1 f30931e;

    public /* synthetic */ qx0(C2286v2 c2286v2, C2360y7 c2360y7) {
        this(c2286v2, c2360y7, new px0(), new hz0(), new rr1());
    }

    public final void a(@NotNull Context context, @NotNull xy0 mediationNetwork, @NotNull Map<String, ? extends Object> additionalReportData, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        a(context, ip1.b.f27347f, mediationNetwork, str, additionalReportData);
    }

    public final void b(@NotNull Context context, @NotNull xy0 mediationNetwork, @NotNull Map<String, ? extends Object> additionalReportData, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        a(context, ip1.b.f27363v, mediationNetwork, str, additionalReportData);
    }

    public final void c(@NotNull Context context, @NotNull xy0 mediationNetwork, @NotNull Map<String, ? extends Object> additionalReportData, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        a(context, ip1.b.f27315C, mediationNetwork, str, additionalReportData);
    }

    public final void d(@NotNull Context context, @NotNull xy0 mediationNetwork, @NotNull Map<String, ? extends Object> reportData, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        a(context, ip1.b.f27365x, mediationNetwork, str, reportData);
        a(context, ip1.b.f27366y, mediationNetwork, str, reportData);
    }

    public final void e(@NotNull Context context, @NotNull xy0 mediationNetwork, @NotNull Map<String, ? extends Object> additionalReportData, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        a(context, ip1.b.f27314B, mediationNetwork, str, additionalReportData);
    }

    public final void f(@NotNull Context context, @NotNull xy0 mediationNetwork, @NotNull Map<String, ? extends Object> additionalReportData, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        a(context, ip1.b.f27345e, mediationNetwork, str, additionalReportData);
    }

    public final void g(@NotNull Context context, @NotNull xy0 mediationNetwork, @NotNull Map<String, ? extends Object> additionalReportData, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(additionalReportData, "additionalReportData");
        a(context, ip1.b.f27349h, mediationNetwork, str, additionalReportData);
    }

    public final void h(@NotNull Context context, @NotNull xy0 mediationNetwork, @NotNull Map<String, ? extends Object> reportData, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        a(context, ip1.b.f27350i, mediationNetwork, str, reportData);
    }

    private final void a(Context context, ip1.b bVar, xy0 mediationNetwork, String str, Map<String, ? extends Object> map) {
        jp1 a4 = this.f30929c.a(this.f30928b, this.f30927a);
        this.f30930d.getClass();
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        jp1Var.b(mediationNetwork.e(), com.ironsource.ge.f16389B1);
        jp1Var.b(mediationNetwork.i(), "adapter_parameters");
        jp1 a5 = kp1.a(a4, jp1Var);
        a5.a(map);
        Map<String, Object> b4 = a5.b();
        ip1 ip1Var = new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a5, bVar, "reportType", b4, "reportData"));
        this.f30927a.p().f();
        C1900ed.a(context, zm2.f35627a, this.f30927a.p().b()).a(ip1Var);
        new C2388zc(context).a(bVar, ip1Var.b(), str, mediationNetwork.c());
    }

    public final void b(@NotNull Context context, @NotNull xy0 mediationNetwork, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        a(context, ip1.b.f27348g, mediationNetwork, str, MapsKt.emptyMap());
    }

    public qx0(@NotNull C2286v2 adConfiguration, @Nullable C2360y7<?> c2360y7, @NotNull px0 mediatedAdapterReportDataProvider, @NotNull hz0 mediationNetworkReportDataProvider, @NotNull rr1 rewardInfoProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(mediatedAdapterReportDataProvider, "mediatedAdapterReportDataProvider");
        Intrinsics.checkNotNullParameter(mediationNetworkReportDataProvider, "mediationNetworkReportDataProvider");
        Intrinsics.checkNotNullParameter(rewardInfoProvider, "rewardInfoProvider");
        this.f30927a = adConfiguration;
        this.f30928b = c2360y7;
        this.f30929c = mediatedAdapterReportDataProvider;
        this.f30930d = mediationNetworkReportDataProvider;
        this.f30931e = rewardInfoProvider;
    }

    public final void a(@NotNull Context context, @NotNull xy0 mediationNetwork, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        a(context, ip1.b.f27363v, mediationNetwork, str, MapsKt.emptyMap());
    }

    public final void a(@NotNull Context context, @NotNull xy0 mediationNetwork, @Nullable C2360y7<?> c2360y7, @Nullable String str) {
        Map emptyMap;
        nr1 J3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        this.f30931e.getClass();
        Boolean valueOf = (c2360y7 == null || (J3 = c2360y7.J()) == null) ? null : Boolean.valueOf(J3.e());
        if (Intrinsics.areEqual(valueOf, Boolean.TRUE)) {
            emptyMap = MapsKt.mapOf(TuplesKt.to("rewarding_side", "server_side"));
        } else if (Intrinsics.areEqual(valueOf, Boolean.FALSE)) {
            emptyMap = MapsKt.mapOf(TuplesKt.to("rewarding_side", "client_side"));
        } else if (valueOf == null) {
            emptyMap = MapsKt.emptyMap();
        } else {
            throw new W1.m();
        }
        a(context, ip1.b.f27326N, mediationNetwork, str, MapsKt.mapOf(TuplesKt.to("reward_info", emptyMap)));
    }
}
