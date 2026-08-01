package com.bytedance.sdk.openadsdk.apiImpl.feed;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: PAGNativeAdLoadListenerAdapter.java */
/* loaded from: classes2.dex */
public class NB implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener pvs;

    public NB(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.pvs = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Jd
    public void onError(final int i, final String str) {
        if (this.pvs == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.NB.1
            @Override // java.lang.Runnable
            public void run() {
                NB.this.pvs.onError(i, str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.NB.2
            @Override // java.lang.Runnable
            public void run() {
                NB.this.pvs.onAdLoaded(pAGNativeAd);
            }
        });
    }
}
