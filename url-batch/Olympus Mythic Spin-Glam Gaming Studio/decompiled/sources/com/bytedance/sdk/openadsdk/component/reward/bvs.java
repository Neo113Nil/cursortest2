package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.nu;

/* loaded from: classes11.dex */
public class bvs implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener zmn;

    public bvs(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.zmn = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.nps
    public void onError(final int i, final String str) {
        if (this.zmn != null) {
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bvs.1
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = bvs.this.zmn;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.zmn != null) {
            nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bvs.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGRewardedAdLoadListener pAGRewardedAdLoadListener = bvs.this.zmn;
                    if (pAGRewardedAdLoadListener != null) {
                        pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }
}
