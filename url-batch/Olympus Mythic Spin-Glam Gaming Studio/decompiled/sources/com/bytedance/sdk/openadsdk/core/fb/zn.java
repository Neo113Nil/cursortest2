package com.bytedance.sdk.openadsdk.core.fb;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.bjh.fs.btk;
import com.bytedance.sdk.openadsdk.core.iv.iqz;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes5.dex */
public class zn extends fb {
    private int bvs;
    private int iv;
    private com.bytedance.sdk.openadsdk.zmn.zmn.fs zg;

    @Override // com.bytedance.sdk.openadsdk.core.fb.fb, com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.fb.fb, com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    public zn(@NonNull Context context, nqi nqiVar, AdSlot adSlot, boolean z) {
        super(context, nqiVar, adSlot, z);
        this.bvs = 1;
        this.iv = -1;
    }

    public void zmn(com.bytedance.sdk.openadsdk.zmn.zmn.fs fsVar) {
        phc phcVar = this.fs;
        if (phcVar != null) {
            ((iqz) phcVar).olo();
            this.zg = fsVar;
            this.iv = 3;
        }
    }

    public void zmn() {
        phc phcVar = this.fs;
        if (phcVar != null) {
            ((iqz) phcVar).cyb();
            this.iv = 2;
        }
    }

    public void fs() {
        phc phcVar = this.fs;
        if (phcVar != null) {
            ((iqz) phcVar).kgc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.fb.fb
    protected void zn() {
        iqz iqzVar = new iqz(this.zmn, this.zn, this.fb, this.hhw, this.nps) { // from class: com.bytedance.sdk.openadsdk.core.fb.zn.1
            @Override // com.bytedance.sdk.openadsdk.core.iv.iqz, com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent me) {
                DetectTouchUtils.viewOnTouch(h.u, this, me);
                return super.dispatchTouchEvent(me);
            }

            @Override // com.bytedance.sdk.openadsdk.core.iv.iqz, com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.hhw.zn, android.widget.FrameLayout, android.view.View
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
                return zn.this.zmn(super.zn(i));
            }
        };
        this.fs = iqzVar;
        com.bytedance.sdk.openadsdk.core.cn.fs.zn videoController = iqzVar.getVideoController();
        if (videoController != null) {
            videoController.fb(this.bvs);
        }
        addView(this.fs, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.btk;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
        phc phcVar = this.fs;
        if (phcVar != null) {
            ((iqz) phcVar).setVideoAdListener(new com.bytedance.sdk.openadsdk.zmn.fs.zn() { // from class: com.bytedance.sdk.openadsdk.core.fb.zn.2
                @Override // com.bytedance.sdk.openadsdk.zmn.fs.zn
                public void fs(PAGNativeAd pAGNativeAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.zmn.fs.zn
                public void zmn(int i, int i2) {
                }

                @Override // com.bytedance.sdk.openadsdk.zmn.fs.zn
                public void zmn(PAGNativeAd pAGNativeAd) {
                    if (zn.this.iv != 3) {
                        if (zn.this.iv == 2) {
                            zn.this.zmn();
                        }
                    } else {
                        zn znVar = zn.this;
                        znVar.zmn(znVar.zg);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.zmn.fs.zn
                public void zn(PAGNativeAd pAGNativeAd) {
                    if (zn.this.zg != null) {
                        zn.this.zg.zmn();
                    }
                }
            });
        }
    }

    public com.bytedance.sdk.openadsdk.kw.zn.zmn getVideoModel() {
        phc phcVar = this.fs;
        if (phcVar != null) {
            return ((iqz) phcVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.fb.fb
    public void fb() {
        com.bytedance.sdk.openadsdk.core.cn.fs.zn videoController;
        phc phcVar = this.fs;
        if ((phcVar instanceof iqz) && (videoController = ((iqz) phcVar).getVideoController()) != null) {
            this.bvs = videoController.ww();
        }
        super.fb();
    }
}
