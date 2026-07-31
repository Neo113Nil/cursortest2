package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zs0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f35759a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f35760b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C1937g2 f35761c;

    public zs0(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull qs instreamVideoAd) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(instreamVideoAd, "instreamVideoAd");
        this.f35759a = sdkEnvironmentModule;
        this.f35760b = context.getApplicationContext();
        this.f35761c = new C1937g2(instreamVideoAd.a());
    }

    @NotNull
    public final ys0 a(@NotNull ss coreInstreamAdBreak) {
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        Context context = this.f35760b;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        vu1 vu1Var = this.f35759a;
        C1937g2 c1937g2 = this.f35761c;
        il0 il0Var = new il0();
        ul0 ul0Var = new ul0();
        ft0 ft0Var = new ft0();
        return new ys0(context, vu1Var, coreInstreamAdBreak, c1937g2, il0Var, ul0Var, ft0Var, new cb2(), new bt0(context, vu1Var, coreInstreamAdBreak, c1937g2, ft0Var, il0Var));
    }
}
