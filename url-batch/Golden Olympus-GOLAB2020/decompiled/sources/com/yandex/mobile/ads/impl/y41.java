package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y41 implements k81 {
    @Override // com.yandex.mobile.ads.impl.k81
    @NotNull
    public final f61 a(@NotNull Context context, @NotNull u31 nativeAd, @NotNull b61 nativeAdManager, @NotNull zi0 imageProvider, @NotNull C2258tk binderConfiguration, @NotNull t41 nativeAdControllers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(nativeAdManager, "nativeAdManager");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(binderConfiguration, "binderConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
        return new e41(context, nativeAd, nativeAdManager, imageProvider, binderConfiguration, nativeAdControllers);
    }
}
