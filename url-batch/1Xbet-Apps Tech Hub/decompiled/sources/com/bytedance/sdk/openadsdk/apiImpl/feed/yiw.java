package com.bytedance.sdk.openadsdk.apiImpl.feed;

import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: PAGNativeFeedAdWrapperListenerImpl.java */
/* loaded from: classes2.dex */
public class yiw implements sUS {
    private final PAGNativeAdInteractionListener pvs;

    public yiw(PAGNativeAdInteractionListener pAGNativeAdInteractionListener) {
        this.pvs = pAGNativeAdInteractionListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.yiw.1
            @Override // java.lang.Runnable
            public void run() {
                if (yiw.this.pvs != null) {
                    yiw.this.pvs.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.sUS
    public void pvs(PAGNativeAd pAGNativeAd) {
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.yiw.2
            @Override // java.lang.Runnable
            public void run() {
                if (yiw.this.pvs != null) {
                    yiw.this.pvs.onAdShowed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.sUS
    public void pvs() {
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.feed.yiw.3
            @Override // java.lang.Runnable
            public void run() {
                if (yiw.this.pvs != null) {
                    yiw.this.pvs.onAdDismissed();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.feed.sUS
    public boolean icD() {
        return this.pvs != null;
    }
}
