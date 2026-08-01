package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTTitleNewStyleManager.java */
/* loaded from: classes2.dex */
public class qh {
    private TextView Mxy;
    private final RelativeLayout NB;
    private PAGProgressBar Wyp;
    TTAdDislikeToast icD;
    private boolean kj;
    TTAdDislikeDialog pvs;
    private final cR sUS;
    private ImageView so;
    private final Context yiw;
    final AtomicBoolean vG = new AtomicBoolean(false);
    final AtomicBoolean Jd = new AtomicBoolean(false);
    private final int qh = Pj.icD(mnm.pvs(), 44.0f);

    public qh(Context context, RelativeLayout relativeLayout, cR cRVar) {
        this.yiw = context;
        this.NB = relativeLayout;
        this.sUS = cRVar;
        NB();
    }

    private void NB() {
        this.so = (ImageView) this.NB.findViewById(kj.Zm);
        this.Mxy = (TextView) this.NB.findViewById(kj.HWd);
        ImageView imageView = (ImageView) this.NB.findViewById(kj.Ye);
        this.Wyp = (PAGProgressBar) this.NB.findViewById(kj.Ayu);
        cR cRVar = this.sUS;
        if (cRVar != null) {
            this.Mxy.setText(TextUtils.isEmpty(cRVar.qd()) ? uc.pvs(this.yiw, "tt_web_title_default") : this.sUS.qd());
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.qh.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qh.this.Jd();
            }
        });
    }

    public void pvs(int i) {
        if (i == 100) {
            this.Wyp.setVisibility(8);
        } else {
            this.Wyp.setVisibility(0);
            this.Wyp.setProgress(i);
        }
    }

    public void pvs() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.NB.getLayoutParams();
            if (this.kj) {
                return;
            }
            int i = marginLayoutParams.topMargin;
            int i2 = this.qh;
            if (i == (-i2)) {
                ValueAnimator ofInt = ValueAnimator.ofInt(-i2, 0);
                ofInt.setDuration(300L);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.qh.2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                        qh.this.NB.setLayoutParams(marginLayoutParams);
                    }
                });
                ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.qh.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        qh.this.kj = true;
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        qh.this.kj = false;
                    }
                });
                ofInt.start();
            }
        } catch (Throwable unused) {
        }
    }

    public void icD() {
        try {
            final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.NB.getLayoutParams();
            if (this.kj || marginLayoutParams.topMargin != 0) {
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, -this.qh);
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.common.qh.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    qh.this.NB.setLayoutParams(marginLayoutParams);
                }
            });
            ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.common.qh.5
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    qh.this.kj = true;
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    qh.this.kj = false;
                }
            });
            ofInt.start();
        } catch (Throwable unused) {
        }
    }

    public ImageView vG() {
        return this.so;
    }

    protected void Jd() {
        if (this.Jd.get()) {
            yiw();
            return;
        }
        if (this.pvs == null) {
            sUS();
        }
        TTAdDislikeDialog tTAdDislikeDialog = this.pvs;
        if (tTAdDislikeDialog != null) {
            tTAdDislikeDialog.pvs();
        }
    }

    private void sUS() {
        try {
            if (this.pvs == null) {
                TTAdDislikeDialog tTAdDislikeDialog = new TTAdDislikeDialog(this.yiw, this.sUS);
                this.pvs = tTAdDislikeDialog;
                tTAdDislikeDialog.setDislikeSource("landing_page");
                this.pvs.setCallback(new TTAdDislikeDialog.pvs() { // from class: com.bytedance.sdk.openadsdk.common.qh.6
                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                    public void pvs(View view) {
                        qh.this.vG.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                    public void icD(View view) {
                        qh.this.vG.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.TTAdDislikeDialog.pvs
                    public void pvs(int i, FilterWord filterWord) {
                        if (qh.this.Jd.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        qh.this.Jd.set(true);
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) this.NB.getRootView().findViewById(R.id.content);
            frameLayout.addView(this.pvs);
            if (this.icD == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.yiw);
                this.icD = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th);
        }
    }

    private void yiw() {
        this.icD.pvs(TTAdDislikeToast.getDislikeTip());
    }
}
