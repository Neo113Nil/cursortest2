package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pk2 implements fq1<bb2, List<? extends bb2>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final cd2 f30481a;

    public pk2(@NotNull cd2 reportParametersProvider) {
        Intrinsics.checkNotNullParameter(reportParametersProvider, "reportParametersProvider");
        this.f30481a = reportParametersProvider;
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(bb2 bb2Var) {
        bb2 request = bb2Var;
        Intrinsics.checkNotNullParameter(request, "request");
        Map<String, String> reportData = this.f30481a.a();
        ip1.b reportType = ip1.b.f27356o;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        return new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), (C1814b) null);
    }

    @Override // com.yandex.mobile.ads.impl.fq1
    public final ip1 a(qq1<List<? extends bb2>> qq1Var, int i4, bb2 bb2Var) {
        ip1.c cVar;
        bb2 request = bb2Var;
        Intrinsics.checkNotNullParameter(request, "request");
        List<? extends bb2> list = qq1Var != null ? qq1Var.f30869a : null;
        if (204 == i4) {
            cVar = ip1.c.f27371e;
        } else if (list != null && i4 == 200) {
            cVar = list.isEmpty() ? ip1.c.f27371e : ip1.c.f27369c;
        } else {
            cVar = ip1.c.f27370d;
        }
        Map reportData = MapsKt.plus(this.f30481a.a(), MapsKt.mapOf(TuplesKt.to("status", cVar.a())));
        ip1.b reportType = ip1.b.f27357p;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        return new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData), (C1814b) null);
    }
}
