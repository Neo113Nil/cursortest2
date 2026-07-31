package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class px0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jq f30611a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final w71 f30612b;

    public /* synthetic */ px0() {
        this(new jq(), new k71());
    }

    @NotNull
    public final jp1 a(@Nullable C2360y7<?> c2360y7, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        if ((c2360y7 != null ? c2360y7.v() : null) != vr.f33728c) {
            return this.f30611a.a(c2360y7, adConfiguration);
        }
        Object I3 = c2360y7.I();
        return this.f30612b.a(c2360y7, adConfiguration, I3 instanceof n61 ? (n61) I3 : null);
    }

    public px0(@NotNull jq commonReportDataProvider, @NotNull w71 nativeCommonReportDataProvider) {
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        Intrinsics.checkNotNullParameter(nativeCommonReportDataProvider, "nativeCommonReportDataProvider");
        this.f30611a = commonReportDataProvider;
        this.f30612b = nativeCommonReportDataProvider;
    }
}
