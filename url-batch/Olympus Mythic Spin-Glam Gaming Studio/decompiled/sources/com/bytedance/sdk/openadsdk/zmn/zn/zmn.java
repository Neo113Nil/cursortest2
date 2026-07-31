package com.bytedance.sdk.openadsdk.zmn.zn;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nu;

/* loaded from: classes4.dex */
public class zmn implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener zmn;

    public zmn(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.zmn = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.nps
    public void onError(final int i, final String str) {
        if (this.zmn == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.zn.zmn.1
            @Override // java.lang.Runnable
            public void run() {
                if (zmn.this.zmn != null) {
                    zmn.this.zmn.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.zmn == null) {
            return;
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.zn.zmn.2
            @Override // java.lang.Runnable
            public void run() {
                if (zmn.this.zmn != null) {
                    zmn.this.zmn.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
