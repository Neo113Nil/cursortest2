package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;

/* compiled from: PAGRewardedAdWrapper.java */
/* loaded from: classes2.dex */
public class Mxy implements com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs {
    private final PAGRewardedAdInteractionCallback icD;
    private final PAGRewardedAdInteractionListener pvs;

    public Mxy(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.pvs = pAGRewardedAdInteractionListener;
        this.icD = null;
    }

    public Mxy(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.icD = pAGRewardedAdInteractionCallback;
        this.pvs = null;
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs
    public void pvs() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.pvs;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdShowed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.icD;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.pvs;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.icD;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs
    public void icD() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.pvs;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdDismissed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.icD;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.apiImpl.Jd.pvs
    public void pvs(boolean z, int i, String str, int i2, String str2) {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.pvs;
        if (pAGRewardedAdInteractionListener != null) {
            if (z) {
                pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i, str));
                return;
            } else {
                pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i2, str2);
                return;
            }
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.icD;
        if (pAGRewardedAdInteractionCallback != null) {
            if (z) {
                pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i, str));
            } else {
                pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i2, str2));
            }
        }
    }
}
