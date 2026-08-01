package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.bNS;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.vA;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.facebook.ads.AdError;
import java.util.Locale;

/* compiled from: LandingPageLoadingFirstStyle.java */
/* loaded from: classes2.dex */
public class sUS extends yiw {
    private int Ju;
    private TextView Mxy;
    private PAGProgressBar Wyp;
    private FrameLayout kj;
    AnimatorSet pvs;
    private TextView qh;
    private TextView so;

    public sUS(Context context, String str, String[] strArr, bNS bns, vA vAVar) {
        super(context, str, strArr, bns, vAVar);
        this.Ju = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.common.yiw
    protected void pvs() {
        if (this.sUS == null) {
            return;
        }
        this.NB = sUS();
        if (this.Jd != null && this.Jd.length > 0) {
            TextView textView = this.Mxy;
            if (textView != null) {
                textView.setText(this.Jd[0]);
                return;
            }
            return;
        }
        FrameLayout frameLayout = this.kj;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    private View sUS() {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this.sUS);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGLinearLayout.setGravity(17);
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        int icD = Pj.icD(this.sUS, 68.0f);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(this.sUS);
        pAGLinearLayout.addView(tTRoundRectImageView, new LinearLayout.LayoutParams(icD, icD));
        PAGTextView pAGTextView = new PAGTextView(this.sUS);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(Pj.icD(this.sUS, 170.0f), -2);
        layoutParams2.topMargin = Pj.icD(this.sUS, 8.0f);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(17);
        pAGTextView.setMaxWidth(Pj.icD(this.sUS, 150.0f));
        pAGTextView.setMaxLines(2);
        pAGTextView.setTextColor(Color.parseColor("#222222"));
        pAGTextView.setTextSize(18.0f);
        pAGLinearLayout.addView(pAGTextView, layoutParams2);
        this.kj = new PAGFrameLayout(this.sUS);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.width = Pj.icD(this.sUS, 244.0f);
        layoutParams3.height = Pj.icD(this.sUS, 24.0f);
        layoutParams3.topMargin = Pj.icD(this.sUS, 16.0f);
        pAGLinearLayout.addView(this.kj, layoutParams3);
        this.so = new PAGTextView(this.sUS);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -1);
        this.so.setEllipsize(TextUtils.TruncateAt.END);
        this.so.setVisibility(4);
        layoutParams4.gravity = 17;
        Drawable pvs = com.bytedance.sdk.openadsdk.utils.so.pvs(this.sUS, "tt_landingpage_loading_text_rect");
        this.so.setBackground(pvs);
        this.so.setGravity(17);
        this.so.setMaxLines(1);
        int icD2 = Pj.icD(this.sUS, 12.0f);
        int icD3 = Pj.icD(this.sUS, 4.0f);
        this.so.setPadding(icD2, icD3, icD2, icD3);
        int parseColor = Color.parseColor("#1A73E8");
        this.so.setTextColor(parseColor);
        this.so.setTextSize(12.0f);
        this.kj.addView(this.so, layoutParams4);
        this.Mxy = new PAGTextView(this.sUS);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -1);
        this.Mxy.setEllipsize(TextUtils.TruncateAt.END);
        layoutParams5.gravity = 17;
        this.Mxy.setBackground(pvs);
        this.Mxy.setGravity(17);
        this.Mxy.setMaxLines(1);
        this.Mxy.setPadding(icD2, icD3, icD2, icD3);
        this.Mxy.setTextColor(parseColor);
        this.Mxy.setTextSize(12.0f);
        this.kj.addView(this.Mxy, layoutParams5);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(this.sUS);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        int icD4 = Pj.icD(this.sUS, 21.0f);
        int icD5 = Pj.icD(this.sUS, 43.0f);
        layoutParams6.topMargin = icD4;
        pAGLinearLayout2.setOrientation(0);
        pAGLinearLayout2.setPadding(icD5, 0, 0, 0);
        pAGLinearLayout.addView(pAGLinearLayout2, layoutParams6);
        this.Wyp = new PAGProgressBar(this.sUS, null, R.style.Widget.ProgressBar.Horizontal);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(Pj.icD(this.sUS, 160.0f), icD2);
        layoutParams7.gravity = 16;
        this.Wyp.setMax(100);
        this.Wyp.setProgress(1);
        this.Wyp.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.so.pvs(this.sUS, "tt_full_reward_loading_progress_style"));
        pAGLinearLayout2.addView(this.Wyp, layoutParams7);
        this.qh = new PAGTextView(this.sUS);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(Pj.icD(this.sUS, 35.0f), -2);
        this.qh.setMaxLines(1);
        layoutParams8.leftMargin = Pj.icD(this.sUS, 8.0f);
        this.qh.setTextColor(Color.parseColor("#161823"));
        this.qh.setTextSize(14.0f);
        pAGLinearLayout2.addView(this.qh, layoutParams8);
        if (!TextUtils.isEmpty(this.vG)) {
            pAGTextView.setText(this.vG);
        } else {
            pAGTextView.setVisibility(8);
        }
        if (this.icD != null && !TextUtils.isEmpty(this.icD.pvs())) {
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.icD, tTRoundRectImageView, (cR) null);
        } else {
            tTRoundRectImageView.setVisibility(8);
        }
        return pAGLinearLayout;
    }

    @Override // com.bytedance.sdk.openadsdk.common.yiw
    public void icD() {
        icD(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void icD(int i) {
        FrameLayout frameLayout = this.kj;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            return;
        }
        this.kj.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sUS.1
            @Override // java.lang.Runnable
            public void run() {
                if (sUS.this.pvs == null) {
                    sUS.this.pvs = new AnimatorSet();
                    AnimatorSet animatorSet = sUS.this.pvs;
                    sUS sus = sUS.this;
                    AnimatorSet.Builder play = animatorSet.play(sus.pvs(sus.so));
                    sUS sus2 = sUS.this;
                    play.with(sus2.icD(sus2.Mxy));
                    sUS.this.pvs.setDuration(500L);
                }
                sUS.this.pvs.start();
            }
        }, i);
    }

    @Override // com.bytedance.sdk.openadsdk.common.yiw
    public void vG() {
        AnimatorSet animatorSet = this.pvs;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator pvs(TextView textView) {
        return ObjectAnimator.ofFloat(textView, "translationY", 0.0f, -this.kj.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ObjectAnimator icD(final TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "translationY", this.kj.getHeight() + Pj.icD(this.sUS, 10.0f), 0.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.common.sUS.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                TextView textView2 = textView;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (sUS.this.Jd == null || sUS.this.Jd.length < 2 || sUS.this.kj == null) {
                    return;
                }
                sUS.this.icD(AdError.SERVER_ERROR_CODE);
                sUS.this.yiw();
            }
        });
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yiw() {
        if (this.Jd == null) {
            return;
        }
        if (this.Ju >= this.Jd.length) {
            this.Ju = 0;
        }
        TextView textView = this.so;
        if (textView != null) {
            if (textView.getVisibility() != 0) {
                this.so.setVisibility(0);
            }
            this.so.setText(this.Jd[this.Ju]);
            this.so.setY(0.0f);
        }
        if (this.Mxy != null) {
            int i = this.Ju + 1;
            this.Mxy.setText(this.Jd[i < this.Jd.length ? i : 0]);
            this.Mxy.setVisibility(4);
        }
        this.Ju++;
    }

    @Override // com.bytedance.sdk.openadsdk.common.yiw
    public void pvs(int i) {
        PAGProgressBar pAGProgressBar = this.Wyp;
        if (pAGProgressBar != null) {
            pAGProgressBar.setProgress(i);
        }
        TextView textView = this.qh;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf(i)));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.common.yiw
    public void Jd() {
        super.Jd();
    }
}
