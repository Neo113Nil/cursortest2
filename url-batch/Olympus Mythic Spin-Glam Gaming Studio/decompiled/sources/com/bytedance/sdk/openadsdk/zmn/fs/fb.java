package com.bytedance.sdk.openadsdk.zmn.fs;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.nqi;

/* loaded from: classes5.dex */
public class fb implements PAGNativeAdData {
    private final zmn zmn;

    public fb(zmn zmnVar) {
        this.zmn = zmnVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        zmn zmnVar = this.zmn;
        if (zmnVar != null) {
            return zmnVar.zn();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        zmn zmnVar = this.zmn;
        if (zmnVar != null) {
            return zmnVar.fb();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        zmn zmnVar = this.zmn;
        if (zmnVar != null) {
            return zmnVar.btk();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        zmn zmnVar = this.zmn;
        if (zmnVar != null) {
            return zmnVar.hhw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        zmn zmnVar = this.zmn;
        if (zmnVar != null) {
            return zmnVar.nps();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        zmn zmnVar = this.zmn;
        if (zmnVar != null) {
            return zmnVar.iv();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        if (nqi.btk(this.zmn.zmn)) {
            return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo;
        }
        return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        zmn zmnVar = this.zmn;
        if (zmnVar != null) {
            return zmnVar.rc();
        }
        return null;
    }
}
