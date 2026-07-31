package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.appsflyer.AdRevenueScheme;
import com.yandex.mobile.ads.impl.ip1;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j62 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f27551a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp1 f27552b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j62(Context context, C2286v2 c2286v2) {
        this(context, c2286v2, C1900ed.a(context, zm2.f35627a, c2286v2.p().b()));
        c2286v2.p().f();
    }

    public final void a(@NotNull Map reportData, @Nullable du1 du1Var) {
        ip1.b reportType = ip1.b.f27338Z;
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        if (du1Var == null || !du1Var.L()) {
            return;
        }
        C2286v2 c2286v2 = this.f27551a;
        Pair pair = TuplesKt.to(AdRevenueScheme.AD_TYPE, c2286v2.b().b());
        String c4 = c2286v2.c();
        if (c4 == null) {
            c4 = "";
        }
        Map reportData2 = MapsKt.plus(MapsKt.mapOf(pair, TuplesKt.to("ad_unit_id", c4)), reportData);
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(reportData2, "reportData");
        this.f27552b.a(new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(reportData2), (C1814b) null));
    }

    public j62(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull mp1 metricaReporter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(metricaReporter, "metricaReporter");
        this.f27551a = adConfiguration;
        this.f27552b = metricaReporter;
    }
}
