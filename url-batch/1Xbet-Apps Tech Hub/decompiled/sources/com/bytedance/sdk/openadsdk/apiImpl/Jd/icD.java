package com.bytedance.sdk.openadsdk.apiImpl.Jd;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.utils.ae;

/* compiled from: PARewardedAdListenerAdapter.java */
/* loaded from: classes2.dex */
public class icD implements PAGRewardedAdLoadListener {
    private final PAGRewardedAdLoadListener pvs;

    public icD(PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        this.pvs = pAGRewardedAdLoadListener;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.Jd
    public void onError(final int i, final String str) {
        if (this.pvs == null) {
            return;
        }
        if (str == null) {
            str = "Unknown exception.";
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.Jd.icD.1
            @Override // java.lang.Runnable
            public void run() {
                if (icD.this.pvs != null) {
                    icD.this.pvs.onError(i, str);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public void onAdLoaded(final PAGRewardedAd pAGRewardedAd) {
        if (this.pvs == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.Jd.icD.2
            @Override // java.lang.Runnable
            public void run() {
                if (icD.this.pvs != null) {
                    icD.this.pvs.onAdLoaded(pAGRewardedAd);
                }
            }
        });
    }
}
