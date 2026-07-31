package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qy1 implements w71 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u31 f30934a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xq1 f30935b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2085m7 f30936c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final wq f30937d;

    public qy1(@NotNull u31 u31Var, @NotNull xq1 responseDataProvider, @NotNull C2085m7 adRequestReportDataProvider, @NotNull wq configurationReportDataProvider) {
        Intrinsics.checkNotNullParameter(u31Var, "native");
        Intrinsics.checkNotNullParameter(responseDataProvider, "responseDataProvider");
        Intrinsics.checkNotNullParameter(adRequestReportDataProvider, "adRequestReportDataProvider");
        Intrinsics.checkNotNullParameter(configurationReportDataProvider, "configurationReportDataProvider");
        this.f30934a = u31Var;
        this.f30935b = responseDataProvider;
        this.f30936c = adRequestReportDataProvider;
        this.f30937d = configurationReportDataProvider;
    }

    @Override // com.yandex.mobile.ads.impl.w71
    @NotNull
    public final jp1 a(@Nullable C2360y7 c2360y7, @NotNull C2286v2 adConfiguration, @Nullable n61 n61Var) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 a4 = this.f30935b.a(c2360y7, n61Var, adConfiguration, this.f30934a);
        jp1 a5 = this.f30936c.a(adConfiguration.a());
        wq wqVar = this.f30937d;
        wqVar.getClass();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 a6 = wqVar.a(adConfiguration);
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        jp1Var.b(Boolean.valueOf(adConfiguration.t()), "image_loading_automatically");
        return kp1.a(kp1.a(a4, a5), kp1.a(a6, jp1Var));
    }
}
