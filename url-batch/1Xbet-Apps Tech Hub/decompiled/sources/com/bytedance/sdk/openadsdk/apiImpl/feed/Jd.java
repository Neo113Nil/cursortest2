package com.bytedance.sdk.openadsdk.apiImpl.feed;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.cR;

/* compiled from: PAGNativeAdDataImpl.java */
/* loaded from: classes2.dex */
public class Jd implements PAGNativeAdData {
    private final pvs pvs;

    public Jd(pvs pvsVar) {
        this.pvs = pvsVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        pvs pvsVar = this.pvs;
        if (pvsVar != null) {
            return pvsVar.vG();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        pvs pvsVar = this.pvs;
        if (pvsVar != null) {
            return pvsVar.Jd();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        pvs pvsVar = this.pvs;
        if (pvsVar != null) {
            return pvsVar.NB();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        pvs pvsVar = this.pvs;
        if (pvsVar != null) {
            return pvsVar.sUS();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        pvs pvsVar = this.pvs;
        if (pvsVar != null) {
            return pvsVar.yiw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        pvs pvsVar = this.pvs;
        if (pvsVar != null) {
            return pvsVar.Wyp();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        if (cR.NB(this.pvs.pvs)) {
            return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo;
        }
        return PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        pvs pvsVar = this.pvs;
        if (pvsVar != null) {
            return pvsVar.qh();
        }
        return null;
    }
}
