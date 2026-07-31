package com.yandex.mobile.ads.nativeads;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface SliderAd {
    void bindSliderAd(@NotNull NativeAdViewBinder nativeAdViewBinder);

    @NotNull
    List<NativeAd> getNativeAds();
}
