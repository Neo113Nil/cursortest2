package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j71 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f27554a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final n61 f27555b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2286v2 f27556c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final w71 f27557d;

    public /* synthetic */ j71(C2360y7 c2360y7, n61 n61Var, C2286v2 c2286v2) {
        this(c2360y7, n61Var, c2286v2, new k71());
    }

    @NotNull
    public final jp1 a() {
        return this.f27557d.a(this.f27554a, this.f27556c, this.f27555b);
    }

    public j71(@NotNull C2360y7<?> adResponse, @Nullable n61 n61Var, @NotNull C2286v2 adConfiguration, @NotNull w71 commonReportDataProvider) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        this.f27554a = adResponse;
        this.f27555b = n61Var;
        this.f27556c = adConfiguration;
        this.f27557d = commonReportDataProvider;
    }
}
