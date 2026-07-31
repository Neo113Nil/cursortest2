package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e41 extends m51 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e41(@NotNull Context context, @NotNull u31 nativeAd, @NotNull b61 nativeAdManager, @NotNull zi0 imageProvider, @NotNull C2258tk adBinderConfiguration, @NotNull t41 nativeAdControllers) {
        super(context, nativeAd, nativeAdManager, imageProvider, adBinderConfiguration, nativeAdControllers);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(nativeAdManager, "nativeAdManager");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(adBinderConfiguration, "adBinderConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdControllers, "nativeAdControllers");
    }
}
