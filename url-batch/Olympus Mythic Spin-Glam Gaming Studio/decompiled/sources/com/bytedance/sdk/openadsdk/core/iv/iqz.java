package com.bytedance.sdk.openadsdk.core.iv;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.cn.fs.hhw;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.bytedance.sdk.openadsdk.utils.nu;
import com.bytedance.sdk.openadsdk.utils.oub;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.h;

/* loaded from: classes11.dex */
public class iqz extends phc implements zn.fb, zn.InterfaceC0102zn {
    int btk;
    private long ev;
    boolean fb;
    private com.bytedance.sdk.openadsdk.zmn.fs.zn fkt;
    int fs;
    private boolean hgd;
    boolean hhw;
    boolean nps;
    private com.bytedance.sdk.openadsdk.core.cn.fs.hhw nu;
    private com.bytedance.sdk.openadsdk.kw.zn.zmn so;
    private long tf;
    int zg;
    private olo zmn;
    boolean zn;

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.hhw.zn, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.u, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void fs() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void hhw() {
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

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn() {
    }

    public iqz(@NonNull Context context, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, AdSlot adSlot, String str, boolean z) {
        super(context, nqiVar, adSlot, str, false, true);
        this.fs = 1;
        this.zn = false;
        this.fb = true;
        this.hhw = true;
        this.nps = true;
        this.zg = -1;
        this.hgd = z;
        cn();
    }

    public boolean rt() {
        return this.hgd;
    }

    protected void cn() {
        this.mw = new FrameLayout(this.bvs);
        com.bytedance.sdk.openadsdk.core.model.nqi nqiVar = this.klz;
        int qvo = nqiVar != null ? nqiVar.qvo() : 0;
        this.btk = qvo;
        fb(qvo);
        kjb();
        addView(this.mw, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.mw.zg() { // from class: com.bytedance.sdk.openadsdk.core.iv.iqz.1
            @Override // com.bytedance.sdk.openadsdk.mw.zg
            public void zmn(final com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
                nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.iqz.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        iqz.this.zmn(rtVar, true);
                    }
                });
            }
        });
    }

    private void kjb() {
        try {
            this.so = new com.bytedance.sdk.openadsdk.kw.zn.zmn();
            olo oloVar = new olo(this.bvs, this.klz, this.iv, this.rp, this.hgd);
            this.zmn = oloVar;
            oloVar.setShouldCheckNetChange(false);
            this.zmn.setControllerStatusCallBack(new hhw.fs() { // from class: com.bytedance.sdk.openadsdk.core.iv.iqz.2
                @Override // com.bytedance.sdk.openadsdk.core.cn.fs.hhw.fs
                public void zmn(boolean z, long j, long j2, long j3, boolean z2) {
                    iqz.this.so.zmn = z;
                    iqz.this.so.btk = j;
                    iqz.this.so.hhw = j2;
                    iqz.this.so.nps = j3;
                    iqz.this.so.fb = z2;
                }
            });
            this.zmn.setVideoAdLoadListener(this);
            this.zmn.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.iv)) {
                this.zmn.setIsAutoPlay(this.zn ? this.rc.isAutoPlay() : this.fb);
            } else if ("open_ad".equals(this.iv)) {
                this.zmn.setIsAutoPlay(true);
            } else {
                this.zmn.setIsAutoPlay(this.fb);
            }
            if ("open_ad".equals(this.iv)) {
                this.zmn.zmn(true, "initVideo");
            } else {
                boolean zn = com.bytedance.sdk.openadsdk.core.kgc.fb().zn(String.valueOf(this.btk));
                this.nqi = zn;
                this.zmn.zmn(zn, "initVideo");
            }
            this.zmn.fb();
        } catch (Exception unused) {
            this.zmn = null;
        }
    }

    void fb(int i) {
        int fs = com.bytedance.sdk.openadsdk.core.kgc.fb().fs(i);
        if (3 == fs) {
            this.zn = false;
            this.fb = false;
        } else if (4 == fs) {
            this.zn = true;
        } else {
            int zn = com.bytedance.sdk.component.utils.kgc.zn(com.bytedance.sdk.openadsdk.core.kgc.zmn());
            if (1 == fs) {
                this.zn = false;
                this.fb = oub.fb(zn);
            } else if (2 == fs) {
                if (oub.btk(zn) || oub.fb(zn) || oub.hhw(zn)) {
                    this.zn = false;
                    this.fb = true;
                }
            } else if (5 == fs && (oub.fb(zn) || oub.hhw(zn))) {
                this.zn = false;
                this.fb = true;
            }
        }
        if (this.fb) {
            return;
        }
        this.fs = 3;
    }

    public com.bytedance.sdk.openadsdk.kw.zn.zmn getVideoModel() {
        return this.so;
    }

    private void setShowAdInteractionView(boolean z) {
        olo oloVar = this.zmn;
        if (oloVar != null) {
            oloVar.setShowAdInteractionView(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.component.adexpress.fs.cn
    public void zmn(com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar, com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
        this.am = fbVar;
        this.zg = fbVar.zn();
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar2 = this.am;
        if ((fbVar2 instanceof kjb) && ((kjb) fbVar2).uqh() != null) {
            ((kjb) this.am).uqh().zmn((cyb) this);
        }
        if (rtVar != null && rtVar.fs()) {
            zmn(rtVar);
        }
        super.zmn(fbVar, rtVar);
    }

    private void zmn(final com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
        if (rtVar == null) {
            return;
        }
        nu.zmn(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.iqz.3
            @Override // java.lang.Runnable
            public void run() {
                iqz.this.zn(rtVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean zmn(com.bytedance.sdk.component.adexpress.fs.rt rtVar, boolean z) {
        int i;
        double btk = rtVar.btk();
        double hhw = rtVar.hhw();
        double nps = rtVar.nps();
        double zg = rtVar.zg();
        if ((nps == 0.0d || zg == 0.0d) && (i = this.zg) != 7 && i != 10 && i != 9 && !(this.am instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb)) {
            return false;
        }
        int fs = jy.fs(this.bvs, (float) btk);
        int fs2 = jy.fs(this.bvs, (float) hhw);
        int fs3 = jy.fs(this.bvs, (float) nps);
        int fs4 = jy.fs(this.bvs, (float) zg);
        float min = Math.min(Math.min(jy.fs(this.bvs, rtVar.rc()), jy.fs(this.bvs, rtVar.klz())), Math.min(jy.fs(this.bvs, rtVar.mw()), jy.fs(this.bvs, rtVar.rt())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mw.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(fs3, fs4);
        }
        layoutParams.width = fs3;
        layoutParams.height = fs4;
        layoutParams.topMargin = fs2;
        layoutParams.leftMargin = fs;
        layoutParams.setMarginStart(fs);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.mw.setLayoutParams(layoutParams);
        jy.fs(this.mw, min);
        olo oloVar = this.zmn;
        if (oloVar == null || !z) {
            return true;
        }
        oloVar.zmn(fs3, fs4);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zn(@NonNull com.bytedance.sdk.component.adexpress.fs.rt rtVar) {
        com.bytedance.sdk.openadsdk.core.cn.fs.zn videoController;
        if (zmn(rtVar, false)) {
            this.mw.removeAllViews();
            if (this.zmn != null) {
                if ((this.am instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb) && (rtVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fs)) {
                    FrameLayout cyb = ((com.bytedance.sdk.openadsdk.core.mw.hhw.fs) rtVar).cyb();
                    if (cyb != null) {
                        cyb.removeAllViews();
                        if (this.zg == 10) {
                            this.zmn.setClickable(false);
                        }
                        cyb.addView(this.zmn, new FrameLayout.LayoutParams(-1, -1));
                    }
                    if ((this.am instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.hhw) && (videoController = getVideoController()) != null) {
                        videoController.hhw(false);
                    }
                } else if (rtVar.zmn() != null) {
                    if (this.nps) {
                        rtVar.zmn().setTag(com.bytedance.sdk.component.adexpress.dynamic.zmn.hhw, 1);
                        ((FrameLayout) rtVar.zmn()).removeAllViews();
                        ((FrameLayout) rtVar.zmn()).addView(this.zmn, new FrameLayout.LayoutParams(-1, -1));
                        this.nps = false;
                    }
                } else {
                    this.mw.addView(this.zmn);
                }
                this.zmn.zmn(0L, true, false);
                fb(this.btk);
                if (!com.bytedance.sdk.component.utils.kgc.fb(this.bvs) && !this.fb && this.hhw) {
                    this.zmn.btk();
                }
                if (TextUtils.equals("embeded_ad", this.iv)) {
                    return;
                }
                setShowAdInteractionView(false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(boolean z, String str) {
        olo oloVar;
        if (this.klz.ulq() || (oloVar = this.zmn) == null) {
            return;
        }
        oloVar.zmn(z, str);
        setSoundMute(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(int i) {
        olo oloVar = this.zmn;
        if (oloVar == null) {
            return;
        }
        if (i == 1) {
            oloVar.zmn(0L, true, false);
            return;
        }
        if (i == 2 || i == 3) {
            oloVar.setCanInterruptVideoPlay(true);
            this.zmn.performClick();
        } else if (i == 4) {
            oloVar.getNativeVideoController().btk();
        } else {
            if (i != 5) {
                return;
            }
            oloVar.zmn(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.component.adexpress.fs.zg
    public void zmn(View view, int i, com.bytedance.sdk.component.adexpress.zn znVar) {
        if (i == -1 || znVar == null) {
            return;
        }
        if (i == 11) {
            try {
                olo oloVar = this.zmn;
                if (oloVar != null) {
                    oloVar.setCanInterruptVideoPlay(true);
                    this.zmn.performClick();
                    if (this.rt) {
                        this.zmn.findViewById(com.bytedance.sdk.openadsdk.utils.olo.gt).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.zmn(view, i, znVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public long zn() {
        return this.ev;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public long fb() {
        return this.ev;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public int btk() {
        olo oloVar;
        if (this.fs == 3 && (oloVar = this.zmn) != null) {
            oloVar.fb();
        }
        olo oloVar2 = this.zmn;
        if (oloVar2 != null && oloVar2.getNativeVideoController().rt()) {
            this.fs = 1;
        }
        nps(this.fs);
        return this.fs;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void g_() {
        this.hhw = false;
        this.fs = 2;
        com.bytedance.sdk.openadsdk.zmn.fs.zn znVar = this.fkt;
        if (znVar != null) {
            znVar.zmn(null);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void h_() {
        this.hhw = false;
        this.rt = true;
        this.fs = 3;
        com.bytedance.sdk.openadsdk.zmn.fs.zn znVar = this.fkt;
        if (znVar != null) {
            znVar.fs(null);
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void i_() {
        this.hhw = false;
        this.rt = false;
        this.fs = 2;
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void zmn(long j, long j2) {
        this.hhw = false;
        int i = this.fs;
        if (i != 5 && i != 3 && j > this.ev) {
            this.fs = 2;
        }
        this.ev = j;
        this.tf = j2;
        com.bytedance.sdk.component.adexpress.fs.fs fsVar = this.zak;
        if (fsVar != null && fsVar.fs() != null) {
            this.zak.fs().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb) {
            ((com.bytedance.sdk.openadsdk.core.mw.hhw.fb) fbVar).setTimeUpdate(((int) (j2 - j)) / 1000);
            ((com.bytedance.sdk.openadsdk.core.mw.hhw.fb) this.am).zmn(j, j2);
        }
        fs(j, j2);
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.InterfaceC0102zn
    public void j_() {
        this.hhw = false;
        this.fs = 5;
        com.bytedance.sdk.component.adexpress.fs.fs fsVar = this.zak;
        if (fsVar != null && fsVar.fs() != null) {
            this.zak.fs().onvideoComplate();
        }
        com.bytedance.sdk.openadsdk.zmn.fs.zn znVar = this.fkt;
        if (znVar != null) {
            znVar.zn(null);
        }
        com.bytedance.sdk.component.adexpress.fs.fb<? extends View> fbVar = this.am;
        if (fbVar instanceof com.bytedance.sdk.openadsdk.core.mw.hhw.fb) {
            ((com.bytedance.sdk.openadsdk.core.mw.hhw.fb) fbVar).onvideoComplate();
        }
    }

    @Override // com.bykv.vk.openvk.zmn.zmn.zmn.fb.zn.fb
    public void zmn(int i, int i2) {
        this.ev = this.tf;
        this.fs = 4;
        com.bytedance.sdk.openadsdk.zmn.fs.zn znVar = this.fkt;
        if (znVar != null) {
            znVar.zmn(i, i2);
        }
    }

    public void setBackupVideoView(com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar) {
        this.nu = hhwVar;
    }

    public void cyb() {
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = this.nu;
        if (hhwVar != null) {
            hhwVar.mw();
            return;
        }
        olo oloVar = this.zmn;
        if (oloVar != null) {
            oloVar.mw();
        }
    }

    public void olo() {
        com.bytedance.sdk.openadsdk.core.cn.fs.hhw hhwVar = this.nu;
        if (hhwVar != null) {
            hhwVar.cn();
            return;
        }
        olo oloVar = this.zmn;
        if (oloVar != null) {
            oloVar.cn();
        }
    }

    protected olo getExpressVideoView() {
        return this.zmn;
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.cn.fs.zn getVideoController() {
        olo oloVar = this.zmn;
        if (oloVar != null) {
            return oloVar.getNativeVideoController();
        }
        return null;
    }

    public void kgc() {
        com.bytedance.sdk.openadsdk.core.cn.fs.zn videoController = getVideoController();
        if (videoController != null) {
            videoController.zmn(3, true);
        }
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.zmn.fs.zn znVar) {
        this.fkt = znVar;
    }

    public com.bytedance.sdk.openadsdk.zmn.fs.zn getVideoAdListener() {
        return this.fkt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.iv.phc, com.bytedance.sdk.openadsdk.core.iv.cyb
    public void zmn(int i, String str) {
        this.kw = i;
        this.iqz = str;
    }

    private void fs(long j, long j2) {
        int abs = (int) Math.abs(this.kw - j);
        int i = this.kw;
        if (i < 0 || abs > 500 || i > j2 || abs >= 500 || this.phc.contains(this.iqz)) {
            return;
        }
        if (this.kw > j) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iv.iqz.4
                @Override // java.lang.Runnable
                public void run() {
                    iqz.this.zmn.setCanInterruptVideoPlay(true);
                    iqz.this.zmn.performClick();
                    iqz iqzVar = iqz.this;
                    iqzVar.fs(iqzVar.kw, iqzVar.iqz);
                }
            }, abs);
        } else {
            this.zmn.setCanInterruptVideoPlay(true);
            this.zmn.performClick();
            fs(this.kw, this.iqz);
        }
        this.phc.add(this.iqz);
    }
}
