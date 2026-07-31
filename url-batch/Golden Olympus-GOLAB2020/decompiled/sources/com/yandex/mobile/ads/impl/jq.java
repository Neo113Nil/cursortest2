package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jq {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xq1 f27799a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2085m7 f27800b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final wq f27801c;

    public /* synthetic */ jq() {
        this(new xq1(), new C2085m7(), new wq());
    }

    @NotNull
    public final jp1 a(@Nullable C2360y7<?> c2360y7, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        jp1 b4 = this.f27799a.b(c2360y7, adConfiguration);
        jp1 a4 = this.f27800b.a(adConfiguration.a());
        return kp1.a(kp1.a(b4, a4), this.f27801c.a(adConfiguration));
    }

    public jq(@NotNull xq1 responseDataProvider, @NotNull C2085m7 adRequestReportDataProvider, @NotNull wq configurationReportDataProvider) {
        Intrinsics.checkNotNullParameter(responseDataProvider, "responseDataProvider");
        Intrinsics.checkNotNullParameter(adRequestReportDataProvider, "adRequestReportDataProvider");
        Intrinsics.checkNotNullParameter(configurationReportDataProvider, "configurationReportDataProvider");
        this.f27799a = responseDataProvider;
        this.f27800b = adRequestReportDataProvider;
        this.f27801c = configurationReportDataProvider;
    }
}
