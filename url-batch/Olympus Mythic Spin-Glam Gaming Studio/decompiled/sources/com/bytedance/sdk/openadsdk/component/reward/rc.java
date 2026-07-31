package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class rc implements com.bytedance.sdk.openadsdk.zmn.btk.zmn {
    private final AtomicBoolean btk;
    private final AtomicBoolean fb;
    private final PAGRewardedAdInteractionCallback fs;
    private final nqi hhw;
    private final PAGRewardedAdInteractionListener zmn;
    private final AtomicBoolean zn;

    public rc(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        this.zn = new AtomicBoolean(false);
        this.fb = new AtomicBoolean(false);
        this.btk = new AtomicBoolean(false);
        this.zmn = pAGRewardedAdInteractionListener;
        this.fs = null;
        this.hhw = zmnVar != null ? zmnVar.nps() : null;
    }

    public rc(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
        this.zn = new AtomicBoolean(false);
        this.fb = new AtomicBoolean(false);
        this.btk = new AtomicBoolean(false);
        this.fs = pAGRewardedAdInteractionCallback;
        this.zmn = null;
        this.hhw = zmnVar != null ? zmnVar.nps() : null;
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.btk.zmn
    public void zmn() {
        this.zn.get();
        if (!this.zn.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.fb.iv.zmn("show_callback_repeat", this.fb.get(), this.zn.get(), this.hhw);
            return;
        }
        com.bytedance.sdk.openadsdk.fb.iv.zmn("show_callback", this.fb.get(), this.zn.get(), this.hhw);
        com.bytedance.sdk.component.utils.iqz.zmn("BVA", "reward video onAdShow");
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.zmn;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdShowed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.fs;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdShowed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.zmn;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdClicked();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.fs;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.btk.zmn
    public void fs() {
        this.fb.get();
        if (!this.fb.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.fb.iv.zmn("close_callback_repeat", this.fb.get(), this.zn.get(), this.hhw);
            return;
        }
        com.bytedance.sdk.openadsdk.fb.iv.zmn("close_callback", this.fb.get(), this.zn.get(), this.hhw);
        com.bytedance.sdk.component.utils.iqz.zmn("BVA", "reward video onAdClose");
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.zmn;
        if (pAGRewardedAdInteractionListener != null) {
            pAGRewardedAdInteractionListener.onAdDismissed();
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.fs;
        if (pAGRewardedAdInteractionCallback != null) {
            pAGRewardedAdInteractionCallback.onAdDismissed();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.zmn.btk.zmn
    public void zmn(boolean z, int i, String str, int i2, String str2) {
        if (this.btk.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.iqz.zmn("BVA", "reward video onRewardVerify");
            PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener = this.zmn;
            if (pAGRewardedAdInteractionListener != null) {
                if (z) {
                    pAGRewardedAdInteractionListener.onUserEarnedReward(new PAGRewardItem(i, str));
                    return;
                } else {
                    pAGRewardedAdInteractionListener.onUserEarnedRewardFail(i2, str2);
                    return;
                }
            }
            PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback = this.fs;
            if (pAGRewardedAdInteractionCallback != null) {
                if (z) {
                    pAGRewardedAdInteractionCallback.onUserEarnedReward(new PAGRewardItem(i, str));
                } else {
                    pAGRewardedAdInteractionCallback.onUserEarnedRewardFail(new PAGErrorModel(i2, str2));
                }
            }
        }
    }
}
