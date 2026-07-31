package com.yandex.mobile.ads.nativeads;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface NativeAd {
    void addImageLoadingListener(@NotNull NativeAdImageLoadingListener nativeAdImageLoadingListener);

    void bindNativeAd(@NotNull NativeAdViewBinder nativeAdViewBinder);

    @NotNull
    NativeAdAssets getAdAssets();

    @NotNull
    NativeAdType getAdType();

    @Nullable
    String getInfo();

    void loadImages();

    void removeImageLoadingListener(@NotNull NativeAdImageLoadingListener nativeAdImageLoadingListener);

    void setNativeAdEventListener(@Nullable NativeAdEventListener nativeAdEventListener);
}
