package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifierAdapterConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.r6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2198r6 {
    @NotNull
    public static AdQualityVerifierAdapterConfiguration a(@NotNull C1989i6 sdkAdQualityConfiguration) {
        Intrinsics.checkNotNullParameter(sdkAdQualityConfiguration, "sdkAdQualityConfiguration");
        return new AdQualityVerifierAdapterConfiguration(sdkAdQualityConfiguration.b(), sdkAdQualityConfiguration.h(), sdkAdQualityConfiguration.d());
    }
}
