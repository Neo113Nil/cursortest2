package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class w31 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e01 f33909a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2117ng f33910b;

    public w31(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull InterfaceC1915f4 adInfoReportDataProviderFactory, @NotNull gs adType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        Intrinsics.checkNotNullParameter(adType, "adType");
        adConfiguration.p().f();
        this.f33909a = C1900ed.a(context, zm2.f35627a, adConfiguration.p().b());
        this.f33910b = new C2117ng(adInfoReportDataProviderFactory, adType, str);
    }

    public final void a(@NotNull ArrayList assetNames, @NotNull ip1.b reportType) {
        Intrinsics.checkNotNullParameter(assetNames, "assetNames");
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        jp1 a4 = this.f33910b.a();
        a4.b(assetNames, "assets");
        Map<String, Object> b4 = a4.b();
        this.f33909a.a(new ip1(reportType.a(), (Map<String, Object>) MapsKt.toMutableMap(b4), ve1.a(a4, reportType, "reportType", b4, "reportData")));
    }

    public final void a(@NotNull m71 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f33910b.a(reportParameterManager);
    }
}
