package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oo1 {
    @NotNull
    public static no1 a(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration, @NotNull C2379z3 adIdStorageManager, @NotNull InterfaceC1921fa adVisibilityValidator, @NotNull wo1 renderingImpressionTrackingListener) {
        EnumC1848c9 adStructureType = EnumC1848c9.f24098b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adIdStorageManager, "adIdStorageManager");
        Intrinsics.checkNotNullParameter(adVisibilityValidator, "adVisibilityValidator");
        Intrinsics.checkNotNullParameter(renderingImpressionTrackingListener, "renderingImpressionTrackingListener");
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        return new no1(context, new C1894e7(adVisibilityValidator, new xf0()), adResponse, adConfiguration, adStructureType, adIdStorageManager, renderingImpressionTrackingListener, (qo1) null, adResponse.j());
    }
}
