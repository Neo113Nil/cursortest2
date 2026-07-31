package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.cn;

/* loaded from: classes3.dex */
public class kgc extends zmn<PAGRewardedAdLoadListener, TTClientBidding> {
    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    protected int fs() {
        return 7;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    protected int hhw() {
        return 6;
    }

    public static kgc zmn(Context context) {
        return (kgc) phc.zmn(context, 7);
    }

    kgc(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    protected cn zmn() {
        return cn.zmn(this.zmn, cn.zmn.REWARD_VIDEO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public TTClientBidding zmn(Context context, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, AdSlot adSlot) {
        return new iqz(context, zmnVar, adSlot);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    public Object zmn(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof iqz) {
            return ((iqz) tTClientBidding).zmn();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    public void zmn(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, int i, String str) {
        pAGRewardedAdLoadListener.onError(i, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    public void zmn(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, Object obj) {
        if (pAGRewardedAdLoadListener == null || obj == null || !(obj instanceof PAGRewardedAd)) {
            return;
        }
        pAGRewardedAdLoadListener.onAdLoaded((PAGRewardedAd) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    public void fs(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof iqz) {
            ((iqz) tTClientBidding).fs();
        }
    }
}
