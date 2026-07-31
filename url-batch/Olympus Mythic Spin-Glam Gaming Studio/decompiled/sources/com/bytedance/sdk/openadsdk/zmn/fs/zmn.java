package com.bytedance.sdk.openadsdk.zmn.fs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.iv.bvs;
import com.bytedance.sdk.openadsdk.core.iv.iqz;
import com.bytedance.sdk.openadsdk.core.iv.iv;
import com.bytedance.sdk.openadsdk.core.iv.phc;
import com.bytedance.sdk.openadsdk.core.model.kgc;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.settings.rc;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes13.dex */
public class zmn {
    private WeakReference<com.bytedance.sdk.openadsdk.core.cn.fs.hhw> btk;
    private phc bvs;
    private boolean fb;
    private final Context fs;
    private fs hhw;
    private PAGMediaView iv;
    private com.bytedance.sdk.openadsdk.core.zn.fs klz;
    private boolean mw = false;
    private com.bytedance.sdk.openadsdk.zmn.fs.zmn.zn nps;
    private com.bytedance.sdk.openadsdk.core.zn.zmn rc;
    private WeakReference<com.bytedance.sdk.openadsdk.core.rt.hhw> rt;
    private PAGMediaView zg;
    protected final nqi zmn;
    private final String zn;

    public zmn(Context context, nqi nqiVar, String str) {
        this.fs = context;
        this.zmn = nqiVar;
        this.zn = str;
    }

    public void zmn(fs fsVar) {
        this.hhw = fsVar;
    }

    public void zmn(com.bytedance.sdk.openadsdk.zmn.fs.zmn.zn znVar) {
        this.nps = znVar;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar) {
        this.btk = new WeakReference<>(hhwVar);
    }

    public void zmn(boolean z) {
        this.fb = z;
    }

    public PAGMediaView zmn() {
        return this.zg;
    }

    public phc fs() {
        return this.bvs;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar) {
        this.rc = zmnVar;
    }

    public PAGImageItem zn() {
        nqi nqiVar = this.zmn;
        if (nqiVar == null || nqiVar.uaq() == null) {
            return null;
        }
        return new PAGImageItem(this.zmn.uaq().zn(), this.zmn.uaq().fs(), this.zmn.uaq().zmn(), (float) this.zmn.uaq().fb());
    }

    public String fb() {
        nqi nqiVar = this.zmn;
        if (nqiVar != null) {
            return zmn(nqiVar);
        }
        return null;
    }

    private String zmn(nqi nqiVar) {
        if (nqiVar.pw() != null && !TextUtils.isEmpty(nqiVar.pw().fs())) {
            return nqiVar.pw().fs();
        }
        if (!TextUtils.isEmpty(nqiVar.dey())) {
            return nqiVar.dey();
        }
        if (!TextUtils.isEmpty(nqiVar.db())) {
            return nqiVar.db();
        }
        return "";
    }

    private String fs(nqi nqiVar) {
        if (!TextUtils.isEmpty(nqiVar.db())) {
            return nqiVar.db();
        }
        if (!TextUtils.isEmpty(nqiVar.pf())) {
            return nqiVar.pf();
        }
        return "";
    }

    public String btk() {
        nqi nqiVar = this.zmn;
        if (nqiVar != null) {
            return fs(nqiVar);
        }
        return null;
    }

    public String hhw() {
        nqi nqiVar = this.zmn;
        if (nqiVar != null) {
            return nqiVar.gt();
        }
        return null;
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.zn.fs fsVar) {
        this.klz = fsVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public PAGMediaView nps() {
        PAGMediaView bvs;
        com.bytedance.sdk.openadsdk.utils.fs.zmn(this.zmn);
        if (this.zmn.nkt() == 2) {
            bvs = rt();
            zmn(bvs);
        } else {
            bvs = bvs();
        }
        if (bvs != null) {
            bvs.setMrcTrackerKey(com.bytedance.sdk.openadsdk.bjh.fs.btk.fs(this.zmn));
        } else {
            bvs = new PAGMediaView(this.fs) { // from class: com.bytedance.sdk.openadsdk.zmn.fs.zmn.1
                @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.view.ViewGroup, android.view.View
                public boolean dispatchTouchEvent(MotionEvent me) {
                    DetectTouchUtils.viewOnTouch(h.u, this, me);
                    return super.dispatchTouchEvent(me);
                }

                @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.widget.FrameLayout, android.view.View
                protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                    if (1 == 0) {
                        setMeasuredDimension(0, 0);
                    } else {
                        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                        CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                protected void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.fb.zmn(this, zmn.this.zmn);
                }
            };
        }
        if (bvs instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) bvs).setMaterialMeta(this.zmn);
        }
        this.iv = bvs;
        return bvs;
    }

    public PAGMediaView zg() {
        return this.iv;
    }

    private void zmn(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(-16777216);
        } catch (Exception unused) {
        }
    }

    private PAGMediaView rt() {
        if (nqi.btk(this.zmn)) {
            com.bytedance.sdk.openadsdk.zmn.fs.zmn.zn znVar = this.nps;
            if (znVar == null || !(znVar instanceof com.bytedance.sdk.openadsdk.zmn.fs.zmn.fs)) {
                return null;
            }
            iqz iqzVar = (iqz) znVar.fb();
            iqzVar.setTag(520093762, Boolean.TRUE);
            if (!this.mw) {
                this.nps.btk();
            }
            this.mw = true;
            return zmn(iqzVar);
        }
        com.bytedance.sdk.openadsdk.zmn.fs.zmn.zn znVar2 = this.nps;
        if (znVar2 == null) {
            return null;
        }
        phc fb = znVar2.fb();
        fb.setTag(520093762, Boolean.TRUE);
        if (!this.mw) {
            this.nps.btk();
        }
        this.mw = true;
        return zmn(fb);
    }

    public PAGMediaView bvs() {
        if (nqi.btk(this.zmn)) {
            fs fsVar = this.hhw;
            if (fsVar != null) {
                View btk = fsVar.btk();
                if (btk != null) {
                    if (btk.getParent() instanceof ViewGroup) {
                        ((ViewGroup) btk.getParent()).removeView(btk);
                    }
                    PAGMediaView pAGMediaView = this.zg;
                    if (pAGMediaView != null) {
                        pAGMediaView.setOnClickListener(null);
                        this.zg.setOnTouchListener(null);
                    }
                    PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.fs, btk, this);
                    pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
                    if (this.rc != null && rc.fs().fb(String.valueOf(this.zmn.qvo()))) {
                        pAGVideoMediaView.setOnClickListener(this.rc);
                        pAGVideoMediaView.setOnTouchListener(this.rc);
                    } else {
                        com.bytedance.sdk.openadsdk.core.zn.zn znVar = new com.bytedance.sdk.openadsdk.core.zn.zn() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.zmn.2
                            @Override // com.bytedance.sdk.openadsdk.core.zn.zn
                            protected void zmn(View view, float f, float f2, float f3, float f4, SparseArray<zn.zmn> sparseArray, boolean z) {
                                try {
                                    ((PAGVideoMediaView) view).handleInterruptVideo();
                                } catch (Exception unused) {
                                }
                            }
                        };
                        pAGVideoMediaView.setOnClickListener(znVar);
                        pAGVideoMediaView.setOnTouchListener(znVar);
                    }
                    this.zg = pAGVideoMediaView;
                    pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    return pAGVideoMediaView;
                }
                ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
                return null;
            }
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        List<kgc> tj = this.zmn.tj();
        if (tj != null && !tj.isEmpty()) {
            ImageView imageView = new ImageView(this.fs);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            kgc kgcVar = tj.get(0);
            if (kgcVar != null) {
                com.bytedance.sdk.openadsdk.iv.fb.zmn(kgcVar).zn(1).zmn(com.bytedance.sdk.openadsdk.iv.zn.zmn(this.zmn, kgcVar.zmn(), imageView));
            }
            PAGMediaView zmn = zmn(imageView);
            if (this.rc != null && rc.fs().fb(String.valueOf(this.zmn.qvo()))) {
                zmn.setOnClickListener(this.rc);
                zmn.setOnTouchListener(this.rc);
            } else {
                zmn.setOnClickListener(null);
                zmn.setOnTouchListener(null);
            }
            zmn.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView2 = this.zg;
            if (pAGMediaView2 != null) {
                pAGMediaView2.setOnClickListener(null);
                this.zg.setOnTouchListener(null);
            }
            this.zg = zmn;
            return zmn;
        }
        ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
        return null;
    }

    private PAGMediaView zmn(final View view) {
        int i;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        phc phcVar = this.bvs;
        if (phcVar != null) {
            phcVar.setClickListener(null);
            this.bvs.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.zn.fs fsVar = this.klz;
        if (fsVar != null && (fsVar instanceof iv) && (view instanceof phc)) {
            ((phc) view).setClickListener((iv) fsVar);
        }
        com.bytedance.sdk.openadsdk.core.zn.zmn zmnVar = this.rc;
        if (zmnVar != null && (zmnVar instanceof bvs) && (view instanceof phc)) {
            ((phc) view).setClickCreativeListener((bvs) zmnVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.fs) { // from class: com.bytedance.sdk.openadsdk.zmn.fs.zmn.3
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent me) {
                DetectTouchUtils.viewOnTouch(h.u, this, me);
                return super.dispatchTouchEvent(me);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView, android.widget.FrameLayout, android.view.View
            protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                    CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
                }
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if (view instanceof phc) {
                    return;
                }
                zmn(z);
            }

            private void zmn(boolean z) {
                Integer num = this.zmn;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(com.bytedance.sdk.openadsdk.bjh.fs.btk.zmn(num), z ? 4 : 8);
                }
                nqi nqiVar = zmn.this.zmn;
                if (nqiVar != null) {
                    com.bytedance.sdk.openadsdk.bjh.zmn.zn.zmn(nqiVar, z);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                zmn.this.zmn(pAGVideoAdListener);
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.fb.zmn(this, zmn.this.zmn);
            }
        };
        int i2 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i2 = layoutParams.width;
            i = layoutParams.height;
        } else {
            i = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof phc) {
            this.bvs = (phc) view;
        }
        return pAGMediaView;
    }

    public View iv() {
        if (com.bytedance.sdk.openadsdk.core.kgc.zmn() == null) {
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(com.bytedance.sdk.openadsdk.core.kgc.zmn()) { // from class: com.bytedance.sdk.openadsdk.zmn.fs.zmn.4
            int zmn = 0;
            int fs = 0;

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent me) {
                DetectTouchUtils.viewOnTouch(h.u, this, me);
                return super.dispatchTouchEvent(me);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            protected void onMeasure(int i, int i2) {
                if (this.zmn == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), i2);
                    this.zmn = getMeasuredWidth();
                    this.fs = this.containerHeight;
                }
                setMeasuredDimension(this.zmn, this.fs);
            }

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                try {
                    Object parent = getParent();
                    if (parent == null || this.zmn == 0 || this.fs == 0) {
                        return;
                    }
                    int width = ((View) parent).getWidth();
                    int height = ((View) parent).getHeight();
                    int i5 = this.zmn;
                    if (width < i5 || height < this.fs) {
                        float min = Math.min(height / this.fs, width / i5);
                        int i6 = (width - this.zmn) / 2;
                        if (min != 1.0f) {
                            setScaleX(min);
                            setScaleY(min);
                            setTranslationX(i6);
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        };
        pAGLogoView.initData(this.zmn);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.zmn.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zmn/fs/zmn$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(h.u, view);
                safedk_zmn$5_onClick_f0f2db10c8b6a616ecaa9e71dfbefb06(view);
            }

            public void safedk_zmn$5_onClick_f0f2db10c8b6a616ecaa9e71dfbefb06(View p0) {
                zmn.this.klz();
            }
        });
        return pAGLogoView;
    }

    public View rc() {
        nqi nqiVar;
        if (com.bytedance.sdk.openadsdk.core.kgc.zmn() == null || (nqiVar = this.zmn) == null || !nqiVar.ch() || !this.zmn.nqi()) {
            return null;
        }
        ImageView imageView = new ImageView(com.bytedance.sdk.openadsdk.core.kgc.zmn());
        com.bytedance.sdk.openadsdk.iqz.fs.fs().zmn((int) jy.zmn(com.bytedance.sdk.openadsdk.core.kgc.zmn(), 14.0f, true), imageView, this.zmn);
        return imageView;
    }

    public void klz() {
        if (this.fs != null) {
            if (com.bytedance.sdk.openadsdk.utils.fs.btk() && com.bytedance.sdk.openadsdk.core.kgc.fb().am()) {
                IABLandingPageActivity.zmn(this.fs, this.zmn, this.zn);
            } else {
                TTWebsiteActivity.zmn(this.fs, this.zmn, this.zn);
            }
        }
    }

    public void zmn(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.zmn.fs.zmn.zn znVar;
        if (this.zmn.nkt() == 2 && nqi.btk(this.zmn) && (znVar = this.nps) != null && (znVar instanceof com.bytedance.sdk.openadsdk.zmn.fs.zmn.fs)) {
            iqz iqzVar = (iqz) znVar.fb();
            if (iqzVar != null) {
                iqzVar.setVideoAdListener(fs(pAGVideoAdListener));
                return;
            }
            return;
        }
        fs fsVar = this.hhw;
        if (fsVar != null) {
            fsVar.zmn(fs(pAGVideoAdListener));
        }
    }

    private zn fs(final PAGVideoAdListener pAGVideoAdListener) {
        return new zn() { // from class: com.bytedance.sdk.openadsdk.zmn.fs.zmn.6
            @Override // com.bytedance.sdk.openadsdk.zmn.fs.zn
            public void zmn(int i, int i2) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zmn.fs.zn
            public void zmn(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zmn.fs.zn
            public void fs(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zmn.fs.zn
            public void zn(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }
        };
    }

    public void mw() {
        com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.rt.hhw> weakReference = this.rt;
        if (weakReference == null || (hhwVar = weakReference.get()) == null) {
            return;
        }
        hhwVar.zmn(13);
    }

    public void zmn(com.bytedance.sdk.openadsdk.core.rt.hhw hhwVar) {
        this.rt = new WeakReference<>(hhwVar);
    }
}
