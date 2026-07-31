package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.cn;

/* loaded from: classes5.dex */
public class nps extends zmn<PAGInterstitialAdLoadListener, TTClientBidding> {
    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    protected int fs() {
        return 8;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    protected int hhw() {
        return 5;
    }

    public static nps zmn(Context context) {
        return (nps) phc.zmn(context, 8);
    }

    nps(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    protected cn zmn() {
        return cn.zmn(this.zmn, cn.zmn.FULL_SCREEN_VIDEO);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public TTClientBidding zmn(Context context, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, AdSlot adSlot) {
        return new kw(context, zmnVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    public Object zmn(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof kw) {
            return ((kw) tTClientBidding).zmn();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    public void zmn(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, int i, String str) {
        pAGInterstitialAdLoadListener.onError(i, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    public void zmn(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, Object obj) {
        if (pAGInterstitialAdLoadListener == null || obj == null || !(obj instanceof PAGInterstitialAd)) {
            return;
        }
        pAGInterstitialAdLoadListener.onAdLoaded((PAGInterstitialAd) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.component.reward.zmn
    public void fs(TTClientBidding tTClientBidding) {
        if (tTClientBidding instanceof kw) {
            ((kw) tTClientBidding).fs();
        }
    }
}
