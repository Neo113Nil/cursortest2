package com.bytedance.sdk.openadsdk.core.fb;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.core.iv;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes9.dex */
public class fb extends com.bytedance.sdk.openadsdk.core.hhw.zn {
    protected PAGBannerAdWrapperListener btk;
    private boolean bvs;
    protected AdSlot fb;
    protected phc fs;
    protected String hhw;
    protected boolean nps;
    private int zg;
    protected final Context zmn;
    protected nqi zn;

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public fb(@NonNull Context context, nqi nqiVar, AdSlot adSlot, boolean z) {
        super(context);
        this.hhw = "banner_ad";
        this.nps = false;
        this.zg = -1;
        this.bvs = false;
        if (nqiVar != null && nqiVar.nkt() != 2) {
            nqiVar.iqz(1);
        }
        this.nps = z;
        this.zmn = context;
        this.zn = nqiVar;
        this.fb = adSlot;
        zn();
        AdSlot adSlot2 = this.fb;
        if (adSlot2 != null) {
            zmn(adSlot2.getExpressViewAcceptedWidth(), this.fb.getExpressViewAcceptedHeight());
        }
    }

    public void setCurrentIndex(int i) {
        this.zg = i;
    }

    protected void zn() {
        phc phcVar = new phc(this.zmn, this.zn, this.fb, this.hhw) { // from class: com.bytedance.sdk.openadsdk.core.fb.fb.1
            @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent me) {
                DetectTouchUtils.viewOnTouch(h.u, this, me);
                return super.dispatchTouchEvent(me);
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                    CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.phc
            protected btk.zmn zn(int i) {
                return fb.this.zmn(super.zn(i));
            }
        };
        this.fs = phcVar;
        addView(phcVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.btk;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    protected btk.zmn zmn(btk.zmn zmnVar) {
        int i;
        if (this.nps && (i = this.zg) >= 0) {
            zmnVar.fs = i;
        }
        return zmnVar;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.btk = pAGBannerAdWrapperListener;
        phc phcVar = this.fs;
        if (phcVar != null) {
            phcVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.btk() { // from class: com.bytedance.sdk.openadsdk.core.fb.fb.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.btk
                public void zmn() {
                    fb.this.btk.onAdClicked();
                }
            });
            this.fs.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.fb.fb.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2;
                    nqi nqiVar = fb.this.zn;
                    if (nqiVar == null || !nqiVar.xup() || (pAGBannerAdWrapperListener2 = fb.this.btk) == null) {
                        return;
                    }
                    pAGBannerAdWrapperListener2.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                    fb fbVar = fb.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = fbVar.btk;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(fbVar, str, i);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    phc phcVar2 = fb.this.fs;
                    if (phcVar2 != null) {
                        phcVar2.setSoundMute(true);
                        if (!com.bytedance.sdk.openadsdk.core.mw.btk.zmn(fb.this.fs.getDynamicShowType())) {
                            fb.this.zmn(f, f2);
                        } else {
                            fb fbVar = fb.this;
                            AdSlot adSlot = fbVar.fb;
                            if (adSlot != null) {
                                fbVar.zmn(adSlot.getExpressViewAcceptedWidth(), fb.this.fb.getExpressViewAcceptedHeight());
                            }
                        }
                    }
                    if (fb.this.bvs) {
                        fb.this.fs.kw();
                    }
                    fb fbVar2 = fb.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = fbVar2.btk;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(fbVar2, f, f2);
                    }
                }
            });
        }
    }

    protected void zmn(float f, float f2) {
        int fs = jy.fs(this.zmn, f);
        int fs2 = jy.fs(this.zmn, f2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(fs, fs2);
        }
        layoutParams.width = fs;
        layoutParams.height = fs2;
        setLayoutParams(layoutParams);
    }

    public void btk() {
        phc phcVar = this.fs;
        if (phcVar != null) {
            phcVar.phc();
        }
    }

    public void fb() {
        if (this.fs != null) {
            iv.fs().hhw(this.fs.getClosedListenerKey());
            removeView(this.fs);
            this.fs.mw();
            this.fs = null;
        }
        iv.fs().kw();
    }

    public phc getCurView() {
        return this.fs;
    }

    public void setIsShow(boolean z) {
        this.bvs = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.fs == null) {
            zn();
        }
        com.bytedance.sdk.openadsdk.utils.fb.zmn(this, this.zn);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
