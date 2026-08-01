package com.bytedance.sdk.openadsdk.apiImpl.icD;

import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: PAGInterstitialAdListenerAdapter.java */
/* loaded from: classes2.dex */
public class pvs implements PAGInterstitialAdLoadListener {
    private final PAGInterstitialAdLoadListener pvs;

    public pvs(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        this.pvs = pAGInterstitialAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Jd
    public void onError(final int i, final String str) {
        if (this.pvs == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.icD.pvs.1
            @Override // java.lang.Runnable
            public void run() {
                if (pvs.this.pvs != null) {
                    pvs.this.pvs.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGInterstitialAd pAGInterstitialAd) {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.icD.pvs.2
            @Override // java.lang.Runnable
            public void run() {
                if (pvs.this.pvs != null) {
                    pvs.this.pvs.onAdLoaded(pAGInterstitialAd);
                }
            }
        });
    }
}
