package com.bytedance.sdk.openadsdk.component.reward.icD;

import android.content.Context;
import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.RewardFullBaseLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.mnm;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* compiled from: RewardFullLandingPageType.java */
/* loaded from: classes2.dex */
public class vG extends icD {
    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public boolean NB() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public int qh() {
        return 16;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public RFEndCardBackUpLayout so() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void yiw() {
    }

    public vG(com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        super(pvsVar);
    }

    public static boolean pvs(cR cRVar) {
        return mnm.icD(cRVar) || mnm.vG(cRVar) || mnm.Jd(cRVar);
    }

    public static void pvs(cR cRVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.reward.pvs.pvs pvsVar) {
        if (mnm.icD(cRVar)) {
            icD(frameLayout);
        } else if (mnm.vG(cRVar) || mnm.Jd(cRVar)) {
            vG(frameLayout);
        } else {
            pvs(frameLayout, pvsVar);
        }
    }

    static void icD(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(1);
        frameLayout.addView(pAGLinearLayout, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(kj.Pj);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout.addView(pAGFrameLayout, layoutParams);
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(context);
        pAGFrameLayout2.setId(kj.Wyp);
        pAGFrameLayout.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout2.addView(pvs(context));
        PAGFrameLayout pAGFrameLayout3 = new PAGFrameLayout(context);
        pAGFrameLayout3.setId(kj.cR);
        pAGFrameLayout3.setVisibility(8);
        pAGFrameLayout3.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        pAGFrameLayout2.addView(pAGFrameLayout3, layoutParams2);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(kj.zM);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        pAGFrameLayout3.addView(pAGImageView, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.pvs.icD(pAGFrameLayout);
        PAGFrameLayout pAGFrameLayout4 = new PAGFrameLayout(context);
        pAGFrameLayout4.setId(kj.uc);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 0.0f;
        pAGLinearLayout.addView(pAGFrameLayout4, layoutParams3);
        pAGFrameLayout4.addView(icD(context));
        LinearLayout vG = vG(context);
        vG.setBackgroundColor(Color.parseColor("#70161823"));
        pAGFrameLayout4.addView(vG);
        vG.addView(Jd(context));
        com.bytedance.sdk.openadsdk.component.reward.view.pvs.pvs(pAGFrameLayout4);
    }

    private static SSWebView icD(Context context) {
        SSWebView sSWebView = new SSWebView(context);
        sSWebView.setId(kj.rCZ);
        sSWebView.setLayerType(2, null);
        sSWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return sSWebView;
    }

    private static LinearLayout vG(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setId(kj.OT);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setVisibility(8);
        pAGLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return pAGLinearLayout;
    }

    private static ImageView Jd(Context context) {
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        pAGImageView.setImageResource(uc.Jd(context, "tt_up_slide"));
        pAGImageView.setId(kj.ny);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Pj.icD(context, 18.0f), Pj.icD(context, 16.0f));
        layoutParams.gravity = 17;
        layoutParams.topMargin = Pj.icD(context, 45.0f);
        pAGImageView.setLayoutParams(layoutParams);
        return pAGImageView;
    }

    static void vG(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(kj.uc);
        frameLayout.addView(pAGFrameLayout, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(icD(context));
        LinearLayout vG = vG(context);
        vG.setBackgroundColor(Color.parseColor("#99161823"));
        pAGFrameLayout.addView(vG);
        vG.addView(Jd(context));
        com.bytedance.sdk.openadsdk.component.reward.view.pvs.pvs(pAGFrameLayout);
        PAGFrameLayout pAGFrameLayout2 = new PAGFrameLayout(context);
        pAGFrameLayout2.setId(kj.Pj);
        frameLayout.addView(pAGFrameLayout2, new FrameLayout.LayoutParams(-1, -1));
        PAGFrameLayout pAGFrameLayout3 = new PAGFrameLayout(context);
        pAGFrameLayout3.setId(kj.Wyp);
        pAGFrameLayout2.addView(pAGFrameLayout3, new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout3.addView(pvs(context));
        PAGFrameLayout pAGFrameLayout4 = new PAGFrameLayout(context);
        pAGFrameLayout4.setId(kj.cR);
        pAGFrameLayout4.setVisibility(8);
        pAGFrameLayout4.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGFrameLayout3.addView(pAGFrameLayout4, layoutParams);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(kj.zM);
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        pAGFrameLayout4.addView(pAGImageView, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.reward.view.pvs.icD(pAGFrameLayout2);
        PlayableLoadingView playableLoadingView = new PlayableLoadingView(context);
        playableLoadingView.setId(kj.cRf);
        playableLoadingView.setClickable(true);
        playableLoadingView.setFocusable(true);
        frameLayout.addView(playableLoadingView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void pvs(RewardFullBaseLayout rewardFullBaseLayout) {
        pvs(this.icD, rewardFullBaseLayout, this.pvs);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void IP() {
        if (mnm.icD(this.pvs.icD) && this.pvs.gSd != null && this.pvs.gSd.bNS != null) {
            if (this.pvs.gSd.bNS.vG()) {
                this.pvs.gSd.vG(0);
                this.pvs.mnm.set(true);
            } else {
                this.pvs.vA.set(true);
                pvs(true, false, true, 80);
            }
        }
        if (mnm.vG(this.pvs.icD) || mnm.Jd(this.pvs.icD)) {
            pvs(true, false, true, 70);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public void pvs(FrameLayout frameLayout) {
        if (!mnm.vG(this.pvs.icD) || this.pvs.Ye == null) {
            return;
        }
        this.pvs.Ye.pvs(this.pvs.icD.Mxy().icD() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.icD.icD
    public boolean sUS() {
        if (mnm.icD(this.pvs.icD)) {
            return true;
        }
        return (mnm.vG(this.pvs.icD) || mnm.Jd(this.pvs.icD)) ? false : true;
    }
}
