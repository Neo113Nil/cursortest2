package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.utils.Pj;

/* loaded from: classes2.dex */
public class BannerExpressView extends PAGFrameLayout {
    protected cR Jd;
    protected String Mxy;
    protected AdSlot NB;
    protected NativeExpressView icD;
    protected final Context pvs;
    protected PAGBannerAdWrapperListener sUS;
    protected boolean so;
    protected NativeExpressView vG;
    protected int yiw;

    public BannerExpressView(Context context, cR cRVar, AdSlot adSlot) {
        super(context);
        this.Mxy = "banner_ad";
        this.pvs = context;
        this.Jd = cRVar;
        this.NB = adSlot;
        pvs();
        AdSlot adSlot2 = this.NB;
        if (adSlot2 != null) {
            pvs(adSlot2.getExpressViewAcceptedWidth(), this.NB.getExpressViewAcceptedHeight());
        }
    }

    protected void pvs() {
        NativeExpressView nativeExpressView = new NativeExpressView(this.pvs, this.Jd, this.NB, this.Mxy);
        this.icD = nativeExpressView;
        addView(nativeExpressView, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.sUS;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public void pvs(cR cRVar, AdSlot adSlot) {
        NativeExpressView nativeExpressView = new NativeExpressView(this.pvs, cRVar, adSlot, this.Mxy);
        this.vG = nativeExpressView;
        nativeExpressView.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (BannerExpressView.this.sUS != null) {
                    BannerExpressView.this.sUS.onAdClicked();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                BannerExpressView.this.pvs(f, f2);
                if (BannerExpressView.this.vG != null) {
                    BannerExpressView.this.vG.setSoundMute(true);
                }
                BannerExpressView.this.NB();
            }
        });
        Pj.pvs((View) this.vG, 8);
        addView(this.vG, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.sUS = pAGBannerAdWrapperListener;
        NativeExpressView nativeExpressView = this.icD;
        if (nativeExpressView != null) {
            nativeExpressView.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.icD() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.icD
                public void pvs() {
                    BannerExpressView.this.sUS.onAdClicked();
                }
            });
            this.icD.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    if (BannerExpressView.this.sUS != null) {
                        BannerExpressView.this.sUS.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                    if (BannerExpressView.this.sUS != null) {
                        BannerExpressView.this.sUS.onRenderFail(BannerExpressView.this, str, i);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    if (BannerExpressView.this.icD != null) {
                        BannerExpressView.this.icD.setSoundMute(true);
                    }
                    BannerExpressView.this.pvs(f, f2);
                    if (BannerExpressView.this.sUS != null) {
                        BannerExpressView.this.sUS.onRenderSuccess(BannerExpressView.this, f, f2);
                    }
                }
            });
        }
    }

    protected void pvs(float f, float f2) {
        int icD = Pj.icD(this.pvs, f);
        int icD2 = Pj.icD(this.pvs, f2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(icD, icD2);
        }
        layoutParams.width = icD;
        layoutParams.height = icD2;
        setLayoutParams(layoutParams);
    }

    public void icD() {
        NativeExpressView nativeExpressView = this.icD;
        if (nativeExpressView != null) {
            nativeExpressView.Mxy();
        }
    }

    public void vG() {
        if (this.icD != null) {
            so.icD().Jd(this.icD.getClosedListenerKey());
            removeView(this.icD);
            this.icD.qh();
            this.icD = null;
        }
        if (this.vG != null) {
            so.icD().Jd(this.vG.getClosedListenerKey());
            removeView(this.vG);
            this.vG.qh();
            this.vG = null;
        }
        so.icD().rCZ();
    }

    public NativeExpressView getCurView() {
        return this.icD;
    }

    public NativeExpressView getNextView() {
        return this.vG;
    }

    public void setDuration(int i) {
        this.yiw = i;
    }

    private ObjectAnimator pvs(NativeExpressView nativeExpressView) {
        return ObjectAnimator.ofFloat(nativeExpressView, "translationX", 0.0f, -getWidth());
    }

    private ObjectAnimator icD(NativeExpressView nativeExpressView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nativeExpressView, "translationX", getWidth(), 0.0f);
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView.4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BannerExpressView.this.so = false;
                BannerExpressView.this.yiw();
            }
        });
        return ofFloat;
    }

    public void Jd() {
        NativeExpressView nativeExpressView = this.vG;
        if (nativeExpressView != null) {
            nativeExpressView.Mxy();
        }
    }

    protected void NB() {
        try {
            if (this.so || this.vG == null) {
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(pvs(this.icD)).with(icD(this.vG));
            animatorSet.setDuration(this.yiw).start();
            Pj.pvs((View) this.vG, 0);
            this.so = true;
        } catch (Throwable th) {
            Ju.pvs("BannerExpressView", th.getMessage());
        }
    }

    public boolean sUS() {
        return this.vG != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yiw() {
        NativeExpressView nativeExpressView = this.icD;
        this.icD = this.vG;
        this.vG = nativeExpressView;
        if (nativeExpressView != null) {
            removeView(nativeExpressView);
            this.vG.qh();
            this.vG = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.icD == null) {
            pvs();
        }
        com.bytedance.sdk.openadsdk.utils.vG.pvs(this, this.Jd);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
