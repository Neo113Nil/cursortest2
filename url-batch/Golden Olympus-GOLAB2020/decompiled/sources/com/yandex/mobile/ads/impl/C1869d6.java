package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.d6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1869d6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jq f24441a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final w71 f24442b;

    public /* synthetic */ C1869d6() {
        this(new jq(), new k71());
    }

    @NotNull
    public final jp1 a(@Nullable C2360y7<?> c2360y7, @NotNull C2286v2 adConfiguration) {
        jp1 a4;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        if ((c2360y7 != null ? c2360y7.v() : null) == vr.f33728c) {
            Object I3 = c2360y7.I();
            a4 = this.f24442b.a(c2360y7, adConfiguration, I3 instanceof n61 ? (n61) I3 : null);
        } else {
            a4 = this.f24441a.a(c2360y7, adConfiguration);
        }
        a4.a(adConfiguration.i(), "verification_network");
        return a4;
    }

    public C1869d6(@NotNull jq commonReportDataProvider, @NotNull w71 nativeCommonReportDataProvider) {
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        Intrinsics.checkNotNullParameter(nativeCommonReportDataProvider, "nativeCommonReportDataProvider");
        this.f24441a = commonReportDataProvider;
        this.f24442b = nativeCommonReportDataProvider;
    }
}
