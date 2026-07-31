package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j41 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<p91, i41> f27462a;

    public j41(@NotNull vu1 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f27462a = MapsKt.mapOf(TuplesKt.to(p91.f30362c, new j81(sdkEnvironmentModule)), TuplesKt.to(p91.f30363d, new u71(sdkEnvironmentModule)), TuplesKt.to(p91.f30364e, new nz1()));
    }

    @Nullable
    public final i41 a(@Nullable p91 p91Var) {
        return this.f27462a.get(p91Var);
    }
}
