package com.bytedance.sdk.openadsdk.zmn.fs;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.nu;

/* loaded from: classes5.dex */
public class nps implements hhw {
    private final PAGNativeAdInteractionListener zmn;

    public nps(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.zmn = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.nps.1
            @Override // java.lang.Runnable
            public void run() {
                if (nps.this.zmn != null) {
                    nps.this.zmn.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.fs.hhw
    public void zmn(PAGNativeAd pAGNativeAd) {
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.nps.2
            @Override // java.lang.Runnable
            public void run() {
                if (nps.this.zmn != null) {
                    nps.this.zmn.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.fs.hhw
    public void zmn() {
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.nps.3
            @Override // java.lang.Runnable
            public void run() {
                if (nps.this.zmn != null) {
                    nps.this.zmn.onAdDismissed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.fs.hhw
    public boolean fs() {
        return this.zmn != null;
    }
}
