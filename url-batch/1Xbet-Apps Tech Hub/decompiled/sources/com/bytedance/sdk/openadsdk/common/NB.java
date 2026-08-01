package com.bytedance.sdk.openadsdk.common;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.bNS;
import com.bytedance.sdk.openadsdk.core.model.vA;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;

/* compiled from: LandingPageLoadingDefaultStyle.java */
/* loaded from: classes2.dex */
public class NB extends yiw {
    private LinearLayout Mxy;
    ObjectAnimator pvs;
    private AnimatorSet so;

    @Override // com.bytedance.sdk.openadsdk.common.yiw
    public void pvs(int i) {
    }

    public NB(Context context, String str, String[] strArr, bNS bns, vA vAVar) {
        super(context, str, strArr, bns, vAVar);
    }

    @Override // com.bytedance.sdk.openadsdk.common.yiw
    protected void pvs() {
        this.NB = sUS();
    }

    private View sUS() {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this.sUS);
        pAGLinearLayout.setGravity(17);
        pAGLinearLayout.setOrientation(1);
        this.Mxy = new LinearLayout(this.sUS);
        this.Mxy.setLayoutDirection(0);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, Pj.icD(this.sUS, 60.0f));
        this.Mxy.setGravity(17);
        this.Mxy.setOrientation(0);
        pAGLinearLayout.addView(this.Mxy, layoutParams);
        int icD = Pj.icD(this.sUS, 17.0f);
        int icD2 = Pj.icD(this.sUS, 35.0f);
        int icD3 = Pj.icD(this.sUS, 1.5f);
        View view = new View(this.sUS);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(icD, icD2);
        int i = -icD3;
        layoutParams2.rightMargin = i;
        view.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(this.sUS, "tt_ad_landing_loading_three_left"));
        this.Mxy.addView(view, layoutParams2);
        View view2 = new View(this.sUS);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(icD, icD2);
        layoutParams3.rightMargin = i;
        view2.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(this.sUS, "tt_ad_landing_loading_three_mid"));
        this.Mxy.addView(view2, layoutParams3);
        View view3 = new View(this.sUS);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(icD, icD2);
        view3.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(this.sUS, "tt_ad_landing_loading_three_mid"));
        this.Mxy.addView(view3, layoutParams4);
        View view4 = new View(this.sUS);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(icD, icD2);
        layoutParams5.leftMargin = i;
        view4.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(this.sUS, "tt_ad_landing_loading_three_mid"));
        this.Mxy.addView(view4, layoutParams5);
        View view5 = new View(this.sUS);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(icD, icD2);
        layoutParams6.leftMargin = i;
        view5.setBackground(com.bytedance.sdk.openadsdk.utils.so.pvs(this.sUS, "tt_ad_landing_loading_three_right"));
        this.Mxy.addView(view5, layoutParams6);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(this.sUS);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.topMargin = Pj.icD(this.sUS, 10.0f);
        pAGLinearLayout2.setGravity(17);
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams7);
        PAGTextView pAGTextView = new PAGTextView(this.sUS);
        pAGTextView.setId(kj.wS);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams8.gravity = 17;
        pAGTextView.setGravity(17);
        pAGTextView.setPadding(Pj.icD(this.sUS, 10.0f), 0, 0, 0);
        pAGTextView.setText(uc.pvs(this.sUS, "tt_loading_language"));
        pAGTextView.setTextColor(Color.parseColor("#80161823"));
        pAGTextView.setTextSize(14.0f);
        pAGLinearLayout2.addView(pAGTextView, layoutParams8);
        if (this.yiw != null) {
            pAGTextView.setText(this.yiw.NB());
        }
        return pAGLinearLayout;
    }

    @Override // com.bytedance.sdk.openadsdk.common.yiw
    public void icD() {
        this.so = new AnimatorSet();
        LinearLayout linearLayout = this.Mxy;
        if (linearLayout != null) {
            ObjectAnimator duration = ObjectAnimator.ofFloat(linearLayout.getChildAt(0), "translationY", -9.0f, 9.0f).setDuration(300L);
            this.pvs = duration;
            duration.setRepeatMode(2);
            this.pvs.setRepeatCount(-1);
            AnimatorSet.Builder play = this.so.play(this.pvs);
            for (int i = 1; i < this.Mxy.getChildCount(); i++) {
                float f = i % 2 == 0 ? 9.0f : -9.0f;
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.Mxy.getChildAt(i), "translationY", -f, f).setDuration(300L);
                duration2.setRepeatMode(2);
                duration2.setRepeatCount(-1);
                play = play.with(duration2);
            }
            this.so.start();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.common.yiw
    public void vG() {
        ObjectAnimator objectAnimator = this.pvs;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        AnimatorSet animatorSet = this.so;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.common.yiw
    public void Jd() {
        super.Jd();
    }
}
