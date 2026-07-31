package com.bytedance.sdk.openadsdk.zmn.fs;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nu;

/* loaded from: classes9.dex */
public class btk implements PAGNativeAdLoadListener {
    private final PAGNativeAdLoadListener zmn;

    public btk(PAGNativeAdLoadListener pAGNativeAdLoadListener) {
        this.zmn = pAGNativeAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.nps
    public void onError(final int i, final String str) {
        if (this.zmn == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.btk.1
            @Override // java.lang.Runnable
            public void run() {
                if (btk.this.zmn != null) {
                    btk.this.zmn.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGNativeAd pAGNativeAd) {
        if (this.zmn == null) {
            return;
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.btk.2
            @Override // java.lang.Runnable
            public void run() {
                if (btk.this.zmn != null) {
                    btk.this.zmn.onAdLoaded(pAGNativeAd);
                }
            }
        });
    }
}
