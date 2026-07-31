package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC2097mj;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class o91 implements AbstractC2097mj.a<n61> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w71 f29947a;

    public /* synthetic */ o91() {
        this(new k71());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2097mj.a
    @NotNull
    public final jp1 a(@Nullable qq1<C2360y7<n61>> qq1Var, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        C2360y7<n61> c2360y7 = qq1Var != null ? qq1Var.f30869a : null;
        return this.f29947a.a(c2360y7, adConfiguration, c2360y7 != null ? c2360y7.I() : null);
    }

    public o91(@NotNull w71 nativeCommonReportDataProvider) {
        Intrinsics.checkNotNullParameter(nativeCommonReportDataProvider, "nativeCommonReportDataProvider");
        this.f29947a = nativeCommonReportDataProvider;
    }
}
