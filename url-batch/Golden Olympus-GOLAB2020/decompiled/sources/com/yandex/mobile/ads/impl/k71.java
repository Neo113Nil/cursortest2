package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class k71 implements w71 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xq1 f28088a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2085m7 f28089b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final wq f28090c;

    public /* synthetic */ k71() {
        this(new xq1(), new C2085m7(), new wq());
    }

    @Override // com.yandex.mobile.ads.impl.w71
    @NotNull
    public final jp1 a(@Nullable C2360y7 c2360y7, @NotNull C2286v2 adConfiguration, @Nullable n61 n61Var) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 a4 = this.f28088a.a(c2360y7, adConfiguration, n61Var);
        jp1 a5 = this.f28089b.a(adConfiguration.a());
        wq wqVar = this.f28090c;
        wqVar.getClass();
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 a6 = wqVar.a(adConfiguration);
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        jp1Var.b(Boolean.valueOf(adConfiguration.t()), "image_loading_automatically");
        return kp1.a(kp1.a(a4, a5), kp1.a(a6, jp1Var));
    }

    public k71(@NotNull xq1 responseDataProvider, @NotNull C2085m7 adRequestReportDataProvider, @NotNull wq configurationReportDataProvider) {
        Intrinsics.checkNotNullParameter(responseDataProvider, "responseDataProvider");
        Intrinsics.checkNotNullParameter(adRequestReportDataProvider, "adRequestReportDataProvider");
        Intrinsics.checkNotNullParameter(configurationReportDataProvider, "configurationReportDataProvider");
        this.f28088a = responseDataProvider;
        this.f28089b = adRequestReportDataProvider;
        this.f28090c = configurationReportDataProvider;
    }
}
