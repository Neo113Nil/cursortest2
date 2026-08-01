package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.component.video.api.Jd.vG;
import com.bykv.vk.openvk.component.video.api.pvs;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.mnm;
import com.bytedance.sdk.component.utils.ny;
import com.bytedance.sdk.component.utils.so;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.nativeexpress.vA;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.yiw.sUS;
import com.bytedance.sdk.openadsdk.icD.Jd.icD.bNS;
import com.bytedance.sdk.openadsdk.icD.yiw;
import com.bytedance.sdk.openadsdk.layout.TTVideoDetailLayout;
import com.bytedance.sdk.openadsdk.layout.TTVideoPlayLayoutForLiveLayout;
import com.bytedance.sdk.openadsdk.utils.ae;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: NativeVideoController.java */
/* loaded from: classes2.dex */
public class vG extends com.bytedance.sdk.openadsdk.core.video.pvs.pvs {
    private int BSi;
    private final ny.pvs CjQ;
    private int OhP;
    private final String Pj;
    private yiw SE;
    private final Runnable ZsW;
    private final boolean cRf;
    private boolean cnN;
    private final boolean dx;
    private int ea;
    private long gA;
    private boolean gSd;
    private int jhZ;
    private long jlb;
    private WeakReference<pvs> od;
    private WeakReference<vG.Jd> qD;
    private final boolean sP;
    private final pvs.InterfaceC0018pvs sq;
    private icD yWX;

    /* compiled from: NativeVideoController.java */
    public interface pvs {
        void pvs(int i);

        void sUS();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean vG(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    public void yiw(boolean z) {
        this.gSd = z;
    }

    public void pvs(final NativeVideoTsView.pvs pvsVar) {
        if (!this.IP || this.sUS == null) {
            return;
        }
        this.sUS.pvs(new NativeVideoTsView.pvs() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.2
            @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.pvs
            public void pvs(View view, int i) {
                NativeVideoTsView.pvs pvsVar2 = pvsVar;
                if (pvsVar2 != null) {
                    pvsVar2.pvs(view, i);
                }
            }
        });
    }

    public void pvs(PAGNativeAd pAGNativeAd) {
        if (!this.IP || this.sUS == null) {
            return;
        }
        this.sUS.pvs(pAGNativeAd);
    }

    public void pvs(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.OhP = i;
        this.jhZ = i2;
    }

    public void pvs(icD icd) {
        this.yWX = icd;
    }

    private void pvs(Context context) {
        ViewGroup tTVideoDetailLayout;
        if (this.IP) {
            tTVideoDetailLayout = new TTVideoPlayLayoutForLiveLayout(context);
        } else {
            tTVideoDetailLayout = new TTVideoDetailLayout(context);
        }
        ViewGroup viewGroup = tTVideoDetailLayout;
        if (this.IP) {
            this.sUS = new NB(context, viewGroup, true, 17, this.yiw, this, ny());
        } else {
            this.sUS = new Jd(context, viewGroup, true, 17, this.yiw, this, false);
        }
        this.sUS.pvs(this);
    }

    public vG(Context context, ViewGroup viewGroup, cR cRVar, String str, boolean z, boolean z2, boolean z3, yiw yiwVar) {
        super(context, cRVar, viewGroup);
        this.gA = 0L;
        this.jlb = 0L;
        this.gSd = true;
        this.OhP = 0;
        this.jhZ = 0;
        this.sq = new pvs.InterfaceC0018pvs() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.1
            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void icD(com.bykv.vk.openvk.component.video.api.pvs pvsVar, int i) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void vG(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
                vG.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(vG.this.yiw, 5);
                            if (vG.this.CvL != null) {
                                vG.this.CvL.pvs(9);
                            }
                        } catch (Exception unused) {
                        }
                        vG.this.cRf();
                    }
                });
                if (vG.this.yiw.ig() == null || vG.this.yiw.ig().pvs() == null) {
                    return;
                }
                vG.this.yiw.ig().pvs().Jd(vG.this.so);
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, long j) {
                vG.this.ny = false;
                vG.this.icD.removeCallbacks(vG.this.ZsW);
                vG.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (vG.this.sUS != null) {
                            vG.this.sUS.icD();
                        }
                        if (!vG.this.IP || vG.this.od == null || vG.this.od.get() == null) {
                            return;
                        }
                        ((pvs) vG.this.od.get()).sUS();
                    }
                });
                vG.this.jlb();
                com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(vG.this.yiw, 0);
                if (vG.this.CvL != null) {
                    vG.this.CvL.vG();
                }
                vG vGVar = vG.this;
                vGVar.pvs(vGVar.SE);
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void icD(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
                vG.this.icD.removeCallbacks(vG.this.ZsW);
                vG.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (vG.this.qD != null && vG.this.qD.get() != null) {
                            vG.this.qD.get();
                        }
                        if (vG.this.sUS != null) {
                            vG.this.sUS.icD();
                        }
                    }
                });
                if (vG.this.dx) {
                    return;
                }
                vG vGVar = vG.this;
                vGVar.pvs(vGVar.SE);
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, final com.bykv.vk.openvk.component.video.api.vG.pvs pvsVar2) {
                Ju.pvs(vG.this.pvs, "onError: " + pvsVar2.pvs() + ", " + pvsVar2.icD() + ", " + pvsVar2.vG());
                vG.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        int pvs2 = pvsVar2.pvs();
                        int icD = pvsVar2.icD();
                        if (!vG.this.dX() || icD == -1004) {
                            if (vG.this.vG(pvs2, icD)) {
                                Ju.pvs(vG.this.pvs, "Play video error，show result page、、、、、、、");
                                vG.this.sUS.pvs(vG.this.yiw, (WeakReference<Context>) null, false);
                                vG.this.vG(true);
                                vG.this.Jd();
                            }
                            if (vG.this.sUS != null) {
                                vG.this.sUS.icD();
                            }
                            if (vG.this.dX != null) {
                                vG.this.dX.icD(vG.this.jlb, com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs(vG.this.so, vG.this.Gp));
                            }
                            if (vG.this.qD == null || vG.this.qD.get() == null || vG.this.dX()) {
                                return;
                            }
                            ((vG.Jd) vG.this.qD.get()).pvs(pvs2, icD);
                        }
                    }
                });
                vG.this.pvs(pvsVar2);
                com.bytedance.sdk.openadsdk.core.yiw.pvs ig = vG.this.yiw.ig();
                if (ig != null && ig.pvs() != null) {
                    ig.pvs().pvs(com.bytedance.sdk.openadsdk.core.yiw.pvs.pvs.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(vG.this.yiw, 6);
                if (vG.this.CvL != null) {
                    vG.this.CvL.pvs(14);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, boolean z4) {
                vG.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (vG.this.sUS != null) {
                            vG.this.sUS.icD();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, int i, int i2) {
                so.pvs().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        vG.this.gSd();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, int i, int i2, int i3) {
                vG.this.ny = true;
                vG.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (vG.this.sUS != null) {
                            vG.this.sUS.vA();
                            vG.this.icD.postDelayed(vG.this.ZsW, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(vG.this.yiw, 2);
                if (vG.this.CvL != null) {
                    vG.this.CvL.pvs(4);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, int i) {
                vG.this.ny = false;
                vG.this.icD.removeCallbacks(vG.this.ZsW);
                vG.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        vG.this.sUS.icD();
                    }
                });
                com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(vG.this.yiw, 0);
                if (vG.this.CvL != null) {
                    vG.this.CvL.pvs(5);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, final long j, final long j2) {
                if (Math.abs(j - vG.this.so) < 50) {
                    return;
                }
                vG vGVar = vG.this;
                vGVar.pvs(vGVar.SE);
                vG.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        vG.this.pvs(j, j2);
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void Jd(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
                com.bytedance.sdk.openadsdk.core.yiw.pvs ig = vG.this.yiw.ig();
                if (ig != null && ig.pvs() != null) {
                    ig.pvs().icD(vG.this.so);
                }
                com.bytedance.sdk.openadsdk.mnm.pvs.NB.pvs(vG.this.yiw, 3);
                if (vG.this.CvL != null) {
                    vG.this.CvL.pvs(0);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void NB(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
                com.bytedance.sdk.openadsdk.core.yiw.pvs ig = vG.this.yiw.ig();
                if (ig != null && ig.pvs() != null) {
                    ig.pvs().vG(vG.this.so);
                }
                if (vG.this.CvL != null) {
                    vG.this.CvL.pvs(1);
                }
            }
        };
        this.ea = 0;
        this.ZsW = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.4
            @Override // java.lang.Runnable
            public void run() {
                if (vG.this.sUS != null) {
                    vG.this.sUS.pvs(vG.this.yiw, (WeakReference<Context>) null, false);
                    vG.this.sUS.icD();
                    vG.this.vG(true);
                    Ju.pvs(vG.this.pvs, "Show result page after error.......showAdCard");
                }
            }
        };
        this.CjQ = new ny.pvs() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.6
            @Override // com.bytedance.sdk.component.utils.ny.pvs
            public void pvs(Context context2, Intent intent, boolean z4, final int i) {
                ae.pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        vG.this.NB(i);
                    }
                });
            }
        };
        this.cnN = false;
        this.BSi = mnm.vG(context);
        pvs(z);
        this.Pj = str;
        try {
            this.OhP = viewGroup.getWidth();
            this.jhZ = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        pvs(context);
        this.dx = true;
        this.cRf = z2;
        this.sP = z3;
        if (yiwVar != null) {
            this.SE = yiwVar;
        }
    }

    public sUS pvs(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.yiw.SJ()) {
            return null;
        }
        if (this.CvL == null) {
            this.CvL = sUS.pvs();
        }
        this.CvL.pvs(view, this.yiw.ig().IP());
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    this.CvL.pvs((View) pair.first, pair.second == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) pair.second);
                }
            }
        }
        return this.CvL;
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.pvs.pvs, com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs(vG.Jd jd) {
        this.qD = new WeakReference<>(jd);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public boolean pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        if (this.NB != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(vGVar.Ju())) {
            Ju.pvs(this.pvs, "[video] play video stop , because no video info");
            return false;
        }
        vG(false);
        vGVar.Ju();
        icD(vGVar);
        ae();
        if (this.CvL != null) {
            this.CvL.pvs(false, 0.0f);
        }
        if (!vA.icD(this.Pj) || this.so <= 0) {
            this.so = vGVar.yiw();
        }
        if (vGVar.yiw() <= 0) {
            this.uc = false;
            this.zM.set(false);
        } else {
            this.so = vGVar.yiw();
            this.Mxy = Math.max(this.Mxy, this.so);
        }
        if (this.sUS != null) {
            this.sUS.pvs();
            if (this.ea == 0) {
                this.sUS.yiw();
            }
            this.sUS.vG(vGVar.NB(), vGVar.sUS());
            this.sUS.vG(this.ZhG);
            this.sUS.pvs(vGVar.NB(), vGVar.sUS());
        }
        if (this.NB == null) {
            this.NB = new com.bytedance.sdk.openadsdk.core.video.vG.vG();
            this.NB.pvs(this.sq);
        }
        zM();
        this.jlb = 0L;
        try {
            vG(vGVar);
            return true;
        } catch (Exception e) {
            Ju.pvs(this.pvs, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e)));
            return false;
        }
    }

    private void vG(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        vGVar.vG(0);
        this.NB.pvs(vGVar);
        this.gA = System.currentTimeMillis();
        this.sUS.vG(8);
        this.sUS.vG(0);
        pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.3
            @Override // java.lang.Runnable
            public void run() {
                if (vG.this.NB == null) {
                    return;
                }
                vG.this.gA = System.currentTimeMillis();
                vG.this.sUS.Jd(0);
                vG.this.NB.pvs(true, vG.this.so, vG.this.bNS);
            }
        });
        if (this.IP) {
            cR();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cRf() {
        this.ea++;
        if (this.sUS == null) {
            return;
        }
        this.sUS.icD();
        if (this.dX != null) {
            this.dX.pvs(this.jlb, com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs(this.so, this.Gp));
        }
        this.jlb = System.currentTimeMillis() - this.gA;
        if (this.gSd) {
            this.sUS.pvs(this.yiw, (WeakReference<Context>) null, true);
        }
        if (!this.uc) {
            this.uc = true;
            pvs(this.Gp, this.Gp);
            long j = this.Gp;
            this.so = j;
            this.Mxy = j;
            icD(this.SE);
        }
        if (!this.IP && this.cR) {
            NB(this.sUS, null);
        }
        this.Ju = true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void icD() {
        if (this.sUS != null) {
            this.sUS.pvs();
        }
        if (this.sUS != null) {
            this.sUS.cR();
        }
        sP();
    }

    public void so(boolean z) {
        if (this.sUS != null) {
            this.sUS.pvs();
        }
        if (this.sUS != null && z) {
            this.sUS.cR();
        }
        sP();
    }

    private void sP() {
        Object[] objArr = new Object[2];
        Boolean.valueOf(this.kj);
        if (this.NB != null) {
            if (this.NB.yiw()) {
                if (this.kj) {
                    rCZ();
                } else {
                    icD(this.ae);
                }
                Object[] objArr2 = new Object[2];
                Boolean.valueOf(this.kj);
            } else {
                this.NB.pvs(false, this.so, this.bNS);
            }
        }
        if (this.zM.get()) {
            CvL();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void vG() {
        pvs(true, 3);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs(boolean z, int i) {
        if (!this.uc && this.zM.get()) {
            if (z) {
                bNS.pvs pvsVar = new bNS.pvs();
                pvsVar.pvs(NB());
                pvsVar.vG(so());
                pvsVar.icD(sUS());
                pvsVar.vG(i);
                pvsVar.Jd(yiw());
                com.bytedance.sdk.openadsdk.icD.Jd.pvs.pvs.pvs(this.sUS, pvsVar, this.SE);
                this.uc = false;
            } else {
                Gp();
            }
        }
        Jd();
        if (this.CvL != null) {
            this.CvL.Jd();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void Jd() {
        if (this.NB != null) {
            this.NB.kj();
            this.NB = null;
        }
        if (this.gSd) {
            if (!"embeded_ad".equals(this.Pj)) {
                this.sUS.pvs(this.yiw, (WeakReference<Context>) null, true);
            } else {
                this.sUS.uc();
            }
            this.icD.removeCallbacksAndMessages(null);
            this.qh.clear();
            if (this.IP) {
                dx();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 > 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void gSd() {
        int i;
        int i2;
        try {
            if (qD() != null && this.NB != null && this.ZhG != null) {
                int Jd = this.NB.Jd();
                int NB = this.NB.NB();
                final int width = this.ZhG.getWidth();
                final int height = this.ZhG.getHeight();
                if (width > 0 && height > 0 && NB > 0 && Jd > 0) {
                    if (Jd == NB) {
                        i2 = width > height ? height : width;
                        i = i2;
                    } else if (Jd > NB) {
                        i2 = (int) ((width * 1.0d) / ((Jd * 1.0f) / NB));
                        i = width;
                    } else {
                        i = (int) ((height * 1.0d) / ((NB * 1.0f) / Jd));
                        i2 = height;
                    }
                    if (i2 <= height && i2 > 0) {
                        height = i2;
                    }
                    this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.vG.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (vG.this.qD() instanceof TextureView) {
                                    ((TextureView) vG.this.qD()).setLayoutParams(layoutParams);
                                    String unused = vG.this.pvs;
                                } else if (vG.this.qD() instanceof SurfaceView) {
                                    ((SurfaceView) vG.this.qD()).setLayoutParams(layoutParams);
                                    String unused2 = vG.this.pvs;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = vG.this.pvs;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            new StringBuilder("[step-1] >>>>> mContextRef=").append(this.Wyp).append(",getIRenderView() =").append(qD());
            com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar = this.NB;
            com.bytedance.sdk.openadsdk.core.video.vG.vG vGVar2 = this.NB;
        } catch (Throwable th) {
            new StringBuilder("[step-11] >>>>> changeVideoSize error !!!!! ：").append(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.component.video.api.renderview.icD qD() {
        if (this.Wyp.getResources().getConfiguration().orientation != 1 || this.sUS == null) {
            return null;
        }
        return this.sUS.Ju();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.pvs
    public void pvs(com.bykv.vk.openvk.component.video.api.Jd.icD icd, View view) {
        if (this.NB == null) {
            return;
        }
        if (this.NB.sUS()) {
            pvs();
            this.sUS.icD(true, false);
            this.sUS.sUS();
        } else {
            if (!this.NB.yiw()) {
                if (this.sUS != null) {
                    this.sUS.vG(this.ZhG);
                }
                Jd(this.so);
                if (this.sUS != null) {
                    this.sUS.icD(false, false);
                    return;
                }
                return;
            }
            so(false);
            if (this.sUS != null) {
                this.sUS.icD(false, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(long j, long j2) {
        this.yiw.vG(j);
        this.so = j;
        this.Gp = j2;
        this.sUS.pvs(j, j2);
        this.sUS.pvs(com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs(j, j2));
        try {
            if (this.dX != null) {
                this.dX.pvs(j, j2);
            }
        } catch (Throwable th) {
            Ju.pvs(this.pvs, "onProgressUpdate error: ", th);
        }
        com.bytedance.sdk.openadsdk.core.yiw.pvs ig = this.yiw.ig();
        if (ig == null || ig.pvs() == null) {
            return;
        }
        ig.pvs().pvs(j, j2, this.CvL);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.pvs.pvs
    public void pvs(com.bykv.vk.openvk.component.video.api.Jd.icD icd, View view, boolean z) {
        sUS(!this.cR);
        if (this.Wyp instanceof Activity) {
            if (this.sUS != null) {
                this.sUS.icD(this.ZhG);
                this.sUS.vG(false);
            }
            pvs(1);
            vG.icD icd2 = this.dyT != null ? this.dyT.get() : null;
            if (icd2 != null) {
                icd2.pvs(this.cR);
            }
        }
    }

    private boolean icD(int i, int i2) {
        if (i2 == 0) {
            pvs();
            this.mnm = true;
            if (this.sUS != null) {
                this.sUS.pvs(this.yiw, (WeakReference<Context>) null, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            if (this.sUS != null) {
                this.sUS.pvs();
            }
            pvs();
            this.mnm = true;
            this.vA = false;
            if (this.sUS != null) {
                return this.sUS.pvs(i, this.yiw.od(), this.sP);
            }
        } else if (i2 == 4) {
            this.mnm = false;
            if (this.sUS != null) {
                this.sUS.bNS();
            }
        }
        return true;
    }

    private void Jd(int i) {
        if (this.BSi == i) {
            return;
        }
        this.BSi = i;
        if (i != 4 && i != 0) {
            this.vA = false;
        }
        if (!this.vA && !bNS() && this.cRf) {
            icD(2, i);
        }
        WeakReference<pvs> weakReference = this.od;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.od.get().pvs(this.BSi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NB(int i) {
        Jd(i);
        if (i == 4) {
            this.mnm = false;
        }
    }

    public void vG(int i) {
        Jd(i);
        if (i == 4) {
            this.mnm = false;
            icD();
        }
    }

    public void cR() {
        if (this.cnN || !this.rCZ) {
            return;
        }
        Context applicationContext = com.bytedance.sdk.openadsdk.core.mnm.pvs().getApplicationContext();
        this.cnN = true;
        ny.pvs(this.CjQ, applicationContext);
    }

    public void dx() {
        if (this.cnN && this.rCZ) {
            this.cnN = false;
            ny.pvs(this.CjQ);
        }
    }

    public void pvs(pvs pvsVar) {
        this.od = new WeakReference<>(pvsVar);
    }

    public void Pj() {
        if (this.CvL != null) {
            this.CvL.pvs(13);
        }
    }
}
