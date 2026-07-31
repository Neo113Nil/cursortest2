package com.bytedance.sdk.openadsdk.component.reward.zmn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.am;
import com.bytedance.sdk.openadsdk.core.model.nqi;

/* loaded from: classes3.dex */
public class zmn {
    protected com.bytedance.sdk.openadsdk.core.zn.btk btk;
    com.bytedance.sdk.openadsdk.core.widget.zg fb;
    protected final Activity fs;
    protected final String hhw;
    private com.bytedance.sdk.openadsdk.core.widget.nps nps;
    private AnimatorSet zg;
    protected final nqi zmn;
    protected final int zn;

    public zmn(Activity activity, nqi nqiVar, int i, String str) {
        this.fs = activity;
        this.zmn = nqiVar;
        this.zn = i;
        this.hhw = str;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.zn.btk btkVar) {
        this.btk = btkVar;
    }

    public void zmn() {
        try {
            if (am.zn(this.zmn)) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.widget.nps npsVar = new com.bytedance.sdk.openadsdk.core.widget.nps(this.fs);
            this.nps = npsVar;
            this.fb = npsVar.getLoadingProgressBar();
            com.bytedance.sdk.openadsdk.core.hhw.zg downloadButton = this.nps.getDownloadButton();
            if (downloadButton != null) {
                downloadButton.setOnClickListener(this.btk);
            }
            this.nps.zmn(this.zmn, this.zn);
            this.nps.zmn(this.zmn, this.fs, this.hhw);
        } catch (Throwable unused) {
        }
    }

    public void fs() {
        com.bytedance.sdk.openadsdk.core.widget.nps npsVar = this.nps;
        if (npsVar != null) {
            npsVar.bringToFront();
        }
    }

    public void zn() {
        ValueAnimator ofInt = ValueAnimator.ofInt(1, 80);
        ofInt.setDuration(2000L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.zmn.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.zg zgVar = zmn.this.fb;
                if (zgVar != null) {
                    zgVar.setProgress(intValue);
                }
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(81, 99);
        ofInt2.setDuration(3000L);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.zmn.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                com.bytedance.sdk.openadsdk.core.widget.zg zgVar = zmn.this.fb;
                if (zgVar != null) {
                    zgVar.setProgress(intValue);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.zg = animatorSet;
        animatorSet.play(ofInt).before(ofInt2);
        this.zg.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.component.reward.zmn.zmn.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        this.zg.start();
    }

    public void fb() {
        AnimatorSet animatorSet = this.zg;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void btk() {
        com.bytedance.sdk.openadsdk.core.widget.nps npsVar = this.nps;
        if (npsVar != null) {
            npsVar.setVisibility(8);
        }
    }

    public View hhw() {
        return this.nps;
    }
}
