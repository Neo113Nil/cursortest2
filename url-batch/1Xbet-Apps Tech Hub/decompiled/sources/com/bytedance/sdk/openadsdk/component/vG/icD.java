package com.bytedance.sdk.openadsdk.component.vG;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: PAGInterstitialProxyListener.java */
/* loaded from: classes2.dex */
public class icD implements PAGInterstitialAdLoadListener {
    final PAGInterstitialAdLoadListener pvs;

    public icD(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.pvs = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Jd
    public void onError(final int i, final String str) {
        if (this.pvs != null) {
            ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.vG.icD.1
                @Override // java.lang.Runnable
                public void run() {
                    if (icD.this.pvs != null) {
                        icD.this.pvs.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.pvs != null) {
            ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.vG.icD.2
                @Override // java.lang.Runnable
                public void run() {
                    if (icD.this.pvs != null) {
                        icD.this.pvs.onAdLoaded(pAGInterstitialAd);
                    }
                }
            });
        }
    }
}
