package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.kf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2045kf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f28184a;

    public C2045kf(@NotNull um2 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f28184a = sdkEnvironmentModule;
    }

    @NotNull
    public final C1974hf a(@NotNull Context context, @NotNull InterfaceC1987i4<C1974hf> finishListener, @NotNull C1918f7 adRequestData, @Nullable bd0 bd0Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(finishListener, "finishListener");
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        vu1 vu1Var = this.f28184a;
        C2105n4 c2105n4 = new C2105n4();
        yf0 yf0Var = new yf0();
        C1950gf c1950gf = new C1950gf(context);
        C2286v2 c2286v2 = new C2286v2(gs.f26285i, vu1Var);
        return new C1974hf(context, vu1Var, finishListener, adRequestData, c2105n4, yf0Var, c1950gf, c2286v2, new im1(context, c2286v2, c2105n4, bd0Var));
    }
}
