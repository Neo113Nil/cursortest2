package com.bytedance.sdk.openadsdk.zmn.btk;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nu;

/* loaded from: classes15.dex */
public class fs implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener zmn;

    public fs(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.zmn = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.nps
    public void onError(final int i, final String str) {
        if (this.zmn == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.btk.fs.1
            @Override // java.lang.Runnable
            public void run() {
                if (fs.this.zmn != null) {
                    fs.this.zmn.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.zmn == null) {
            return;
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zmn.btk.fs.2
            @Override // java.lang.Runnable
            public void run() {
                if (fs.this.zmn != null) {
                    fs.this.zmn.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
