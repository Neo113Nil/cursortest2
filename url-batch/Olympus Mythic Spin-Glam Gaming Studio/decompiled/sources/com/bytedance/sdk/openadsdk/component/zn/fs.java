package com.bytedance.sdk.openadsdk.component.zn;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nu;

/* loaded from: classes12.dex */
public class fs implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener zmn;

    public fs(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.zmn = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.nps
    public void onError(final int i, final String str) {
        if (this.zmn != null) {
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.zn.fs.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = fs.this.zmn;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.zmn != null) {
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.zn.fs.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = fs.this.zmn;
                    if (pAGInterstitialAdLoadListener != null) {
                        pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }
}
