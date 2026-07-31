package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fp0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f25890a;

    public fp0(@NotNull um2 sdkEnvironmentModule) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f25890a = sdkEnvironmentModule;
    }

    @NotNull
    public final ep0 a(@NotNull Context context, @NotNull InterfaceC1987i4<ep0> itemsLoadFinishListener, @NotNull C1918f7 adRequestData, @Nullable bd0 bd0Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemsLoadFinishListener, "itemsLoadFinishListener");
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        vu1 vu1Var = this.f25890a;
        C2105n4 c2105n4 = new C2105n4();
        yf0 yf0Var = new yf0();
        dp0 dp0Var = new dp0(context);
        jp0 jp0Var = new jp0(context, bd0Var);
        C2286v2 c2286v2 = new C2286v2(gs.f26281e, vu1Var);
        return new ep0(context, vu1Var, itemsLoadFinishListener, adRequestData, c2105n4, yf0Var, dp0Var, jp0Var, c2286v2, new km1(context, c2286v2, c2105n4, jp0Var));
    }
}
