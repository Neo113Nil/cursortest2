package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.y22;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w51 {
    @NotNull
    public static v51 a(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull j61 requestData, @NotNull C2286v2 adConfiguration, @NotNull e61 nativeAdOnLoadListener, @NotNull C2105n4 adLoadingPhasesManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdOnLoadListener, "nativeAdOnLoadListener");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        InterfaceC3316J a4 = o2.K.a(o2.R0.b(null, 1, null).plus(o2.Z.b()).plus(new eu(sdkEnvironmentModule.c())));
        p61 p61Var = new p61(sdkEnvironmentModule, adConfiguration);
        s61 s61Var = new s61(adConfiguration);
        int i4 = y22.f34782d;
        return new v51(context, sdkEnvironmentModule, requestData, adConfiguration, nativeAdOnLoadListener, adLoadingPhasesManager, a4, p61Var, s61Var, y22.a.a(), new x41(context, sdkEnvironmentModule, adConfiguration, adLoadingPhasesManager, a4));
    }
}
