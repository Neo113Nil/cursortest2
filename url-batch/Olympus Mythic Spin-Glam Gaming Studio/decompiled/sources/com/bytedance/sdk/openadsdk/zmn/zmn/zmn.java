package com.bytedance.sdk.openadsdk.zmn.zmn;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nu;

/* loaded from: classes14.dex */
public class zmn implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener zmn;

    public zmn(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.zmn = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.nps
    public void onError(final int i, final String str) {
        if (this.zmn == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.zmn.zmn.1
            @Override // java.lang.Runnable
            public void run() {
                zmn.this.zmn.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.zmn == null) {
            return;
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.zmn.zmn.2
            @Override // java.lang.Runnable
            public void run() {
                zmn.this.zmn.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
