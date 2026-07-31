package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class gi2 implements fq1<di2, zh2> {
    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(di2 di2Var) {
        di2 requestConfiguration = di2Var;
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Map reportData = MapsKt.mapOf(TuplesKt.to("page_id", requestConfiguration.a()), TuplesKt.to("category_id", requestConfiguration.b()), TuplesKt.to(AdRevenueScheme.AD_TYPE, gs.f26284h.b()));
        ip1.b reportType = ip1.b.f27361t;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        return new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), (C1814b) null);
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(qq1<zh2> qq1Var, int i4, di2 di2Var) {
        di2 requestConfiguration = di2Var;
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Map reportData = MapsKt.toMutableMap(MapsKt.mapOf(TuplesKt.to("page_id", requestConfiguration.a()), TuplesKt.to("category_id", requestConfiguration.b()), TuplesKt.to(AdRevenueScheme.AD_TYPE, gs.f26284h.b())));
        if (i4 != -1) {
            reportData.put("code", Integer.valueOf(i4));
        }
        ip1.b reportType = ip1.b.f27362u;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        return new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), (C1814b) null);
    }
}
