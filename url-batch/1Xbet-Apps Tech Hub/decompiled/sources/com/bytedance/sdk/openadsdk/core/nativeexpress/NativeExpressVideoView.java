package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public class NativeExpressVideoView extends NativeExpressView implements vG.Jd, vG.InterfaceC0016vG, kj {
    int Jd;
    boolean NB;
    private com.bytedance.sdk.openadsdk.apiImpl.feed.vG Pj;
    private ExpressVideoView ae;
    private long dx;
    private com.bytedance.sdk.openadsdk.multipro.icD.pvs gA;
    boolean icD;
    private long jlb;
    int pvs;
    boolean sUS;
    boolean vG;
    int yiw;

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void NB() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void icD() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void pvs() {
    }

    public NativeExpressVideoView(Context context, cR cRVar, AdSlot adSlot, String str) {
        super(context, cRVar, adSlot, str, false, true);
        this.pvs = 1;
        this.icD = false;
        this.vG = true;
        this.NB = true;
        this.sUS = true;
        this.yiw = -1;
        yiw();
    }

    protected void yiw() {
        this.kj = new FrameLayout(this.so);
        int yTz = this.qh != null ? this.qh.yTz() : 0;
        this.Jd = yTz;
        Jd(yTz);
        mnm();
        addView(this.kj, new FrameLayout.LayoutParams(-1, -1));
        if (getWebView() != null) {
            getWebView().setBackgroundColor(0);
        }
    }

    private void mnm() {
        try {
            this.gA = new com.bytedance.sdk.openadsdk.multipro.icD.pvs();
            ExpressVideoView expressVideoView = new ExpressVideoView(this.so, this.qh, this.Mxy, this.dyT);
            this.ae = expressVideoView;
            expressVideoView.setShouldCheckNetChange(false);
            this.ae.setControllerStatusCallBack(new NativeVideoTsView.icD() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.1
                @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.icD
                public void pvs(boolean z, long j, long j2, long j3, boolean z2) {
                    NativeExpressVideoView.this.gA.pvs = z;
                    NativeExpressVideoView.this.gA.NB = j;
                    NativeExpressVideoView.this.gA.sUS = j2;
                    NativeExpressVideoView.this.gA.yiw = j3;
                    NativeExpressVideoView.this.gA.Jd = z2;
                }
            });
            this.ae.setVideoAdLoadListener(this);
            this.ae.setVideoAdInteractionListener(this);
            if ("embeded_ad".equals(this.Mxy)) {
                this.ae.setIsAutoPlay(this.icD ? this.Wyp.isAutoPlay() : this.vG);
            } else if ("open_ad".equals(this.Mxy)) {
                this.ae.setIsAutoPlay(true);
            } else {
                this.ae.setIsAutoPlay(this.vG);
            }
            if ("open_ad".equals(this.Mxy)) {
                this.ae.setIsQuiet(true);
            } else {
                this.OT = com.bytedance.sdk.openadsdk.core.mnm.Jd().vG(String.valueOf(this.Jd));
                this.ae.setIsQuiet(this.OT);
            }
            this.ae.Jd();
        } catch (Exception unused) {
            this.ae = null;
        }
    }

    void Jd(int i) {
        int icD = com.bytedance.sdk.openadsdk.core.mnm.Jd().icD(i);
        if (3 == icD) {
            this.icD = false;
            this.vG = false;
        } else if (4 == icD) {
            this.icD = true;
        } else {
            int vG = com.bytedance.sdk.component.utils.mnm.vG(com.bytedance.sdk.openadsdk.core.mnm.pvs());
            if (1 == icD) {
                this.icD = false;
                this.vG = jlb.Jd(vG);
            } else if (2 == icD) {
                if (jlb.NB(vG) || jlb.Jd(vG) || jlb.sUS(vG)) {
                    this.icD = false;
                    this.vG = true;
                }
            } else if (5 == icD && (jlb.Jd(vG) || jlb.sUS(vG))) {
                this.icD = false;
                this.vG = true;
            }
        }
        if (this.vG) {
            return;
        }
        this.pvs = 3;
    }

    public com.bytedance.sdk.openadsdk.multipro.icD.pvs getVideoModel() {
        return this.gA;
    }

    private void setShowAdInteractionView(boolean z) {
        ExpressVideoView expressVideoView = this.ae;
        if (expressVideoView != null) {
            expressVideoView.setShowAdInteractionView(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.icD.bNS
    public void pvs(com.bytedance.sdk.component.adexpress.icD.Jd<? extends View> jd, com.bytedance.sdk.component.adexpress.icD.IP ip) {
        this.Gp = jd;
        this.yiw = jd.vG();
        if ((this.Gp instanceof vA) && ((vA) this.Gp).mnm() != null) {
            ((vA) this.Gp).mnm().pvs((kj) this);
        }
        if (ip != null && ip.vG()) {
            icD(ip);
        }
        super.pvs(jd, ip);
    }

    private void icD(final com.bytedance.sdk.component.adexpress.icD.IP ip) {
        if (ip == null) {
            return;
        }
        ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.2
            @Override // java.lang.Runnable
            public void run() {
                NativeExpressVideoView.this.vG(ip);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vG(com.bytedance.sdk.component.adexpress.icD.IP ip) {
        double sUS = ip.sUS();
        double yiw = ip.yiw();
        double so = ip.so();
        double Mxy = ip.Mxy();
        if ((so == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || Mxy == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) && this.yiw != 7) {
            return;
        }
        int icD = Pj.icD(this.so, (float) sUS);
        int icD2 = Pj.icD(this.so, (float) yiw);
        int icD3 = Pj.icD(this.so, (float) so);
        int icD4 = Pj.icD(this.so, (float) Mxy);
        float min = Math.min(Math.min(Pj.icD(this.so, ip.kj()), Pj.icD(this.so, ip.Ju())), Math.min(Pj.icD(this.so, ip.IP()), Pj.icD(this.so, ip.bNS())));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.kj.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(icD3, icD4);
        }
        layoutParams.width = icD3;
        layoutParams.height = icD4;
        layoutParams.topMargin = icD2;
        layoutParams.leftMargin = icD;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        this.kj.setLayoutParams(layoutParams);
        this.kj.removeAllViews();
        if (this.ae != null) {
            if (this.yiw == 7 && (ip instanceof com.bytedance.sdk.openadsdk.core.ugen.vG.icD)) {
                FrameLayout mnm = ((com.bytedance.sdk.openadsdk.core.ugen.vG.icD) ip).mnm();
                if (mnm != null) {
                    mnm.removeAllViews();
                    mnm.addView(this.ae, new FrameLayout.LayoutParams(-1, -1));
                }
            } else if (ip.pvs() != null) {
                if (this.sUS) {
                    ip.pvs().setTag(com.bytedance.sdk.component.adexpress.dynamic.pvs.sUS, 1);
                    ((FrameLayout) ip.pvs()).removeAllViews();
                    ((FrameLayout) ip.pvs()).addView(this.ae, new FrameLayout.LayoutParams(-1, -1));
                    this.sUS = false;
                }
            } else {
                this.kj.addView(this.ae);
            }
            Pj.icD(this.kj, min);
            this.ae.pvs(0L, true, false);
            Jd(this.Jd);
            if (!com.bytedance.sdk.component.utils.mnm.Jd(this.so) && !this.vG && this.NB) {
                this.ae.NB();
            }
            if (TextUtils.equals("embeded_ad", this.Mxy)) {
                return;
            }
            setShowAdInteractionView(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void pvs(boolean z) {
        ExpressVideoView expressVideoView = this.ae;
        if (expressVideoView != null) {
            expressVideoView.setIsQuiet(z);
            setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void pvs(int i) {
        ExpressVideoView expressVideoView = this.ae;
        if (expressVideoView == null) {
            com.bytedance.sdk.component.utils.Ju.pvs("TTAD.NativeExpressVideoView", "onChangeVideoState,ExpressVideoView is null !!!!!!!!!!!!");
            return;
        }
        if (i == 1) {
            expressVideoView.pvs(0L, true, false);
            return;
        }
        if (i == 2 || i == 3) {
            expressVideoView.setCanInterruptVideoPlay(true);
            this.ae.performClick();
        } else if (i == 4) {
            expressVideoView.getNativeVideoController().Jd();
        } else {
            if (i != 5) {
                return;
            }
            expressVideoView.pvs(0L, true, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.component.adexpress.icD.so
    public void pvs(View view, int i, com.bytedance.sdk.component.adexpress.vG vGVar) {
        if (i == -1 || vGVar == null) {
            return;
        }
        if (i == 11) {
            try {
                ExpressVideoView expressVideoView = this.ae;
                if (expressVideoView != null) {
                    expressVideoView.setCanInterruptVideoPlay(true);
                    this.ae.performClick();
                    if (this.Ju) {
                        this.ae.findViewById(com.bytedance.sdk.openadsdk.utils.kj.BiC).setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.pvs(view, i, vGVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public long vG() {
        return this.jlb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public int Jd() {
        ExpressVideoView expressVideoView;
        if (this.pvs == 3 && (expressVideoView = this.ae) != null) {
            expressVideoView.Jd();
        }
        ExpressVideoView expressVideoView2 = this.ae;
        if (expressVideoView2 == null || !expressVideoView2.getNativeVideoController().mnm()) {
            return this.pvs;
        }
        return 1;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void e_() {
        this.NB = false;
        this.pvs = 2;
        com.bytedance.sdk.openadsdk.apiImpl.feed.vG vGVar = this.Pj;
        if (vGVar != null) {
            vGVar.pvs(null);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void h_() {
        this.NB = false;
        this.Ju = true;
        this.pvs = 3;
        com.bytedance.sdk.openadsdk.apiImpl.feed.vG vGVar = this.Pj;
        if (vGVar != null) {
            vGVar.icD(null);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void i_() {
        this.NB = false;
        this.Ju = false;
        this.pvs = 2;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void pvs(long j, long j2) {
        this.NB = false;
        int i = this.pvs;
        if (i != 5 && i != 3 && j > this.jlb) {
            this.pvs = 2;
        }
        this.jlb = j;
        this.dx = j2;
        if (this.CvL != null && this.CvL.icD() != null) {
            this.CvL.icD().setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        if (this.Gp instanceof com.bytedance.sdk.openadsdk.core.ugen.vG.vG) {
            ((com.bytedance.sdk.openadsdk.core.ugen.vG.vG) this.Gp).setTimeUpdate(((int) (j2 - j)) / 1000);
        }
        icD(j, j2);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.InterfaceC0016vG
    public void j_() {
        this.NB = false;
        this.pvs = 5;
        if (this.CvL != null && this.CvL.icD() != null) {
            this.CvL.icD().d_();
        }
        com.bytedance.sdk.openadsdk.apiImpl.feed.vG vGVar = this.Pj;
        if (vGVar != null) {
            vGVar.vG(null);
        }
        if (this.Gp instanceof com.bytedance.sdk.openadsdk.core.ugen.vG.vG) {
            ((com.bytedance.sdk.openadsdk.core.ugen.vG.vG) this.Gp).d_();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG.Jd
    public void pvs(int i, int i2) {
        this.jlb = this.dx;
        this.pvs = 4;
        com.bytedance.sdk.openadsdk.apiImpl.feed.vG vGVar = this.Pj;
        if (vGVar != null) {
            vGVar.pvs(i, i2);
        }
    }

    protected ExpressVideoView getExpressVideoView() {
        return this.ae;
    }

    public com.bykv.vk.openvk.component.video.api.Jd.vG getVideoController() {
        ExpressVideoView expressVideoView = this.ae;
        if (expressVideoView != null) {
            return expressVideoView.getNativeVideoController();
        }
        return null;
    }

    public void setVideoAdListener(com.bytedance.sdk.openadsdk.apiImpl.feed.vG vGVar) {
        this.Pj = vGVar;
    }

    public com.bytedance.sdk.openadsdk.apiImpl.feed.vG getVideoAdListener() {
        return this.Pj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView, com.bytedance.sdk.openadsdk.core.nativeexpress.kj
    public void pvs(int i, String str) {
        this.cR = i;
        this.zM = str;
    }

    private void icD(long j, long j2) {
        int abs = (int) Math.abs(this.cR - j);
        if (this.cR < 0 || abs > 500 || this.cR > j2 || abs >= 500 || this.uc.contains(this.zM)) {
            return;
        }
        if (this.cR > j) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView.3
                @Override // java.lang.Runnable
                public void run() {
                    NativeExpressVideoView.this.ae.setCanInterruptVideoPlay(true);
                    NativeExpressVideoView.this.ae.performClick();
                    NativeExpressVideoView nativeExpressVideoView = NativeExpressVideoView.this;
                    nativeExpressVideoView.icD(nativeExpressVideoView.cR, NativeExpressVideoView.this.zM);
                }
            }, abs);
        } else {
            this.ae.setCanInterruptVideoPlay(true);
            this.ae.performClick();
            icD(this.cR, this.zM);
        }
        this.uc.add(this.zM);
    }
}
