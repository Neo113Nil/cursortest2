package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: PAGRewardProxyListener.java */
/* loaded from: classes2.dex */
public class yiw implements PAGRewardedAdLoadListener {
    final PAGRewardedAdLoadListener pvs;

    public yiw(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.pvs = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Jd
    public void onError(final int i, final String str) {
        if (this.pvs != null) {
            ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.yiw.1
                @Override // java.lang.Runnable
                public void run() {
                    if (yiw.this.pvs != null) {
                        yiw.this.pvs.onError(i, str);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.pvs != null) {
            ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.yiw.2
                @Override // java.lang.Runnable
                public void run() {
                    if (yiw.this.pvs != null) {
                        yiw.this.pvs.onAdLoaded(pAGRewardedAd);
                    }
                }
            });
        }
    }
}
