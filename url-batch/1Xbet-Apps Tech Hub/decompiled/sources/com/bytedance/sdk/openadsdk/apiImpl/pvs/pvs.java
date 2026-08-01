package com.bytedance.sdk.openadsdk.apiImpl.pvs;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: PAGBannerAdListenerAdapter.java */
/* loaded from: classes2.dex */
public class pvs implements PAGBannerAdLoadListener {
    private final PAGBannerAdLoadListener pvs;

    public pvs(PAGBannerAdLoadListener pAGBannerAdLoadListener) {
        this.pvs = pAGBannerAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Jd
    public void onError(final int i, final String str) {
        if (this.pvs == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs.1
            @Override // java.lang.Runnable
            public void run() {
                pvs.this.pvs.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGBannerAd pAGBannerAd) {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.pvs.pvs.2
            @Override // java.lang.Runnable
            public void run() {
                pvs.this.pvs.onAdLoaded(pAGBannerAd);
            }
        });
    }
}
