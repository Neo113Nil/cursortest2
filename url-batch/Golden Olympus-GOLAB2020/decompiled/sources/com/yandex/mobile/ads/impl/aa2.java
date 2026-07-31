package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class aa2 implements fq1<w92, o92> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2037k7 f23194a;

    public aa2(@NotNull C2037k7 adRequestParametersProvider) {
        Intrinsics.checkNotNullParameter(adRequestParametersProvider, "adRequestParametersProvider");
        this.f23194a = adRequestParametersProvider;
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(w92 w92Var) {
        w92 requestConfiguration = w92Var;
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Map<String, Object> reportData = a();
        ip1.b reportType = ip1.b.f27354m;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        return new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), (C1814b) null);
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(qq1<o92> qq1Var, int i4, w92 w92Var) {
        w92 requestConfiguration = w92Var;
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Map reportData = MapsKt.toMutableMap(a());
        if (i4 != -1) {
            reportData.put("code", Integer.valueOf(i4));
        }
        ip1.b reportType = ip1.b.f27355n;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        return new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), (C1814b) null);
    }

    private final Map<String, Object> a() {
        String d4 = this.f23194a.d();
        if (d4 == null) {
            d4 = "";
        }
        if (d4.length() == 0) {
            d4 = "null";
        }
        Pair pair = TuplesKt.to("page_id", d4);
        String c4 = this.f23194a.c();
        String str = c4 != null ? c4 : "";
        return MapsKt.mapOf(pair, TuplesKt.to("imp_id", str.length() != 0 ? str : "null"), TuplesKt.to(AdRevenueScheme.AD_TYPE, gs.f26284h.b()));
    }
}
