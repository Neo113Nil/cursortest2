package com.bytedance.sdk.openadsdk.component.reward;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTRewardWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAdActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.bytedance.sdk.openadsdk.component.reward.mw;
import com.bytedance.sdk.openadsdk.core.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.kjb;
import java.util.Map;

/* loaded from: classes6.dex */
class iv extends PAGRewardedAd {
    private final mw btk;
    private final String fb = kjb.zmn();
    private final AdSlot fs;
    private final com.bytedance.sdk.openadsdk.core.model.zmn zmn;
    private com.bytedance.sdk.openadsdk.zmn.btk.zmn zn;

    iv(Context context, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar, AdSlot adSlot) {
        this.zmn = zmnVar;
        this.fs = adSlot;
        this.btk = new mw(context, zmnVar, "rewarded_video", new mw.zmn() { // from class: com.bytedance.sdk.openadsdk.component.reward.iv.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.mw.zmn
            public Intent zmn(Context context2, nqi nqiVar, @Nullable Activity activity) {
                if (com.bytedance.sdk.openadsdk.component.reward.zn.zg.zmn(nqiVar)) {
                    return new Intent(context2, (Class<?>) TTRewardWebActivity.class);
                }
                if (nqiVar.dgt()) {
                    return new Intent(context2, (Class<?>) TTAdActivity.class);
                }
                return nqiVar.hhw() ? new Intent(context2, (Class<?>) TTRewardExpressVideoActivity.class) : new Intent(context2, (Class<?>) TTRewardVideoActivity.class);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.mw.zmn
            public void zmn(Intent intent, @Nullable Activity activity, nqi nqiVar, boolean z) {
                com.bytedance.sdk.openadsdk.component.reward.zmn.zn.zmn(intent, activity, iv.this.btk.zn(), iv.this.zmn, iv.this.fb);
                intent.putExtra("media_extra", iv.this.fs.getMediaExtra());
                intent.putExtra("user_id", iv.this.fs.getUserID());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.mw.zmn
            public void zmn(boolean z) {
                if (iv.this.zn == null) {
                    return;
                }
                if (z) {
                    am.zmn().zmn(iv.this.fb, (String) iv.this.zn);
                } else {
                    am.zmn().zmn(iv.this.zn);
                }
                iv.this.zn = null;
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.mw.zmn
            public void zmn(nqi nqiVar) {
                fs.zmn(nqiVar, iv.this.btk.zn(), true);
            }
        });
    }

    public void zmn() {
        this.btk.zmn();
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionListener(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener) {
        this.zn = new rc(pAGRewardedAdInteractionListener, this.zmn);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void setAdInteractionCallback(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback) {
        this.zn = new rc(pAGRewardedAdInteractionCallback, this.zmn);
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd
    public void show(@Nullable Activity activity) {
        this.btk.zmn(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        return this.btk.fs();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        return this.btk.zmn(str);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        this.btk.zmn(d);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        this.btk.zmn(d, str, str2);
    }
}
