package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.appsflyer.AdRevenueScheme;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.yandex.mobile.ads.impl.ip1;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rt1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f31365a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2085m7 f31366b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final jq f31367c;

    public /* synthetic */ rt1(C2286v2 c2286v2) {
        this(c2286v2, new C2085m7(), new jq());
    }

    private final void a(Context context, C2360y7<?> c2360y7, ip1.b bVar, jp1 jp1Var) {
        u31 u31Var;
        zq1 g4;
        jp1 a4 = this.f31366b.a(this.f31365a.a());
        a4.b(c2360y7.p(), "ad_unit_id");
        a4.b(c2360y7.p(), "block_id");
        String str = ip1.a.f27312a;
        a4.b(str, com.ironsource.ge.f16389B1);
        gs n4 = c2360y7.n();
        a4.b(n4 != null ? n4.b() : null, AdRevenueScheme.AD_TYPE);
        Object I3 = c2360y7.I();
        if (I3 instanceof n61) {
            List<u31> e4 = ((n61) I3).e();
            String a5 = (e4 == null || (u31Var = (u31) CollectionsKt.firstOrNull((List) e4)) == null || (g4 = u31Var.g()) == null) ? null : g4.a();
            if (a5 == null) {
                a5 = "";
            }
            a4.b(a5, "native_ad_type");
        }
        a4.b(c2360y7.m(), FirebaseAnalytics.Param.AD_SOURCE);
        jp1 a6 = kp1.a(a4, jp1Var);
        Map<String, Object> b4 = a6.b();
        ip1 ip1Var = new ip1(bVar.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a6, bVar, "reportType", b4, "reportData"));
        this.f31365a.p().f();
        C1900ed.a(context, zm2.f35627a, this.f31365a.p().b()).a(ip1Var);
        new C2388zc(context).a(bVar, ip1Var.b(), str, null);
    }

    public final void b(@NotNull Context context, @NotNull C2360y7<?> adResponse) {
        Map emptyMap;
        nr1 J3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Boolean bool = null;
        jp1 jp1Var = new jp1((Map) null, 3);
        if (adResponse != null && (J3 = adResponse.J()) != null) {
            bool = Boolean.valueOf(J3.e());
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            emptyMap = MapsKt.mapOf(TuplesKt.to("rewarding_side", "server_side"));
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            emptyMap = MapsKt.mapOf(TuplesKt.to("rewarding_side", "client_side"));
        } else {
            if (bool != null) {
                throw new W1.m();
            }
            emptyMap = MapsKt.emptyMap();
        }
        jp1Var.b(emptyMap, "reward_info");
        a(context, adResponse, ip1.b.f27326N, jp1Var);
    }

    public rt1(@NotNull C2286v2 adConfiguration, @NotNull C2085m7 adRequestReportDataProvider, @NotNull jq commonReportDataProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adRequestReportDataProvider, "adRequestReportDataProvider");
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        this.f31365a = adConfiguration;
        this.f31366b = adRequestReportDataProvider;
        this.f31367c = commonReportDataProvider;
    }

    public final void a(@NotNull Context context, @NotNull C2360y7<?> adResponse, @Nullable i71 i71Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        jp1 jp1Var = new jp1((Map) null, 3);
        if (i71Var != null) {
            jp1Var.a((Map<String, ? extends Object>) i71Var.a());
        }
        a(context, adResponse, ip1.b.f27348g, jp1Var);
    }

    public final void a(@NotNull Context context, @NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        jp1 a4 = this.f31367c.a(adResponse, this.f31365a);
        a4.b(ip1.c.f27369c.a(), "status");
        a(context, adResponse, ip1.b.f27349h, a4);
    }

    public final void a(@NotNull Context context, @NotNull C2360y7<?> adResponse, @Nullable j71 j71Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        jp1 jp1Var = new jp1((Map) null, 3);
        if (j71Var != null) {
            jp1Var = j71Var.a();
        }
        jp1Var.b(ip1.c.f27369c.a(), "status");
        a(context, adResponse, ip1.b.f27349h, jp1Var);
    }
}
