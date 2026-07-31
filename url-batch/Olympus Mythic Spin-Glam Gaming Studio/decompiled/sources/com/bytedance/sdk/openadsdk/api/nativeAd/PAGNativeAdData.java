package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public interface PAGNativeAdData {

    public enum PAGNativeMediaType {
        PAGNativeMediaTypeImage,
        PAGNativeMediaTypeVideo
    }

    @Nullable
    View getAdChoicesView();

    View getAdLogoView();

    String getButtonText();

    String getDescription();

    PAGImageItem getIcon();

    PAGNativeMediaType getMediaType();

    PAGMediaView getMediaView();

    String getTitle();
}
