package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.iv.uqh;
import com.bytedance.sdk.openadsdk.core.model.nqi;

/* loaded from: classes3.dex */
public class cn extends com.bytedance.sdk.openadsdk.core.iv.zmn.zmn {
    public cn(ViewGroup viewGroup, nqi nqiVar, String str, Activity activity, Context context, com.bytedance.sdk.openadsdk.component.reward.zn.fs fsVar) {
        super(viewGroup, nqiVar, str, activity, context, fsVar);
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.hhw hhwVar) {
        uqh uqhVar = this.zmn;
        if (uqhVar != null) {
            uqhVar.setRewardControlListener(hhwVar);
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.zmn zmnVar) {
        uqh uqhVar = this.zmn;
        if (uqhVar != null) {
            uqhVar.setAdInteractionListener(zmnVar);
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.bvs bvsVar) {
        uqh uqhVar = this.zmn;
        if (uqhVar != null) {
            uqhVar.setVideoTrackListener(bvsVar);
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.fb fbVar) {
        uqh uqhVar = this.zmn;
        if (uqhVar != null) {
            uqhVar.setHeartBeatListener(fbVar);
        }
    }

    public void zmn(com.bytedance.sdk.openadsdk.component.reward.zn.zmn.zn znVar) {
        uqh uqhVar = this.zmn;
        if (uqhVar != null) {
            uqhVar.setLandingPageListener(znVar);
        }
    }

    public void zmn() {
        uqh uqhVar = this.zmn;
        if (uqhVar != null) {
            uqhVar.rt();
        }
    }

    public void zmn(String str, int i, int i2) {
        uqh uqhVar = this.zmn;
        if (uqhVar != null) {
            uqhVar.zmn(str, i, i2);
        }
    }

    public void zmn(com.bytedance.sdk.component.bvs.btk btkVar) {
        uqh uqhVar = this.zmn;
        if (uqhVar != null) {
            uqhVar.setWebTouchProxy(btkVar);
        }
    }
}
