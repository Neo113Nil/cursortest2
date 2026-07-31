package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC2097mj;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.b8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1823b8 implements AbstractC2097mj.a<String> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final jq f23627a;

    public /* synthetic */ C1823b8() {
        this(new jq());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2097mj.a
    @NotNull
    public final jp1 a(@Nullable qq1<C2360y7<String>> qq1Var, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        return this.f23627a.a(qq1Var != null ? qq1Var.f30869a : null, adConfiguration);
    }

    public C1823b8(@NotNull jq commonReportDataProvider) {
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        this.f23627a = commonReportDataProvider;
    }
}
