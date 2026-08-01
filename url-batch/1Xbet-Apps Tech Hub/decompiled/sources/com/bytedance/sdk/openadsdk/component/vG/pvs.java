package com.bytedance.sdk.openadsdk.component.vG;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;

/* compiled from: PAGInterstitialAdWrapper.java */
/* loaded from: classes2.dex */
public class pvs implements com.bytedance.sdk.openadsdk.apiImpl.icD.icD {
    private final PAGInterstitialAdInteractionListener pvs;

    public pvs(PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener) {
        this.pvs = pAGInterstitialAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.icD.icD
    public void pvs() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.pvs;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.icD.icD
    public void icD() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.pvs;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGInterstitialAdInteractionListener pAGInterstitialAdInteractionListener = this.pvs;
        if (pAGInterstitialAdInteractionListener != null) {
            pAGInterstitialAdInteractionListener.onAdClicked();
        }
    }
}
