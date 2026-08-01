package com.bytedance.sdk.openadsdk.core.video.vG;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.model.mnm;
import com.bytedance.sdk.openadsdk.core.so;
import com.bytedance.sdk.openadsdk.core.video.vG.vG;
import com.bytedance.sdk.openadsdk.core.yiw.sUS;
import com.bytedance.sdk.openadsdk.icD.yiw;
import com.bytedance.sdk.openadsdk.layout.TTVideoPlayLayoutForLiveLayout;
import com.bytedance.sdk.openadsdk.mnm.pvs.NB;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* compiled from: BaseVideoController.java */
/* loaded from: classes2.dex */
public class pvs extends com.bytedance.sdk.openadsdk.core.video.pvs.pvs {
    private InterfaceC0085pvs OhP;
    private final yiw Pj;
    private long cRf;
    final vG.icD dx;
    protected long gA;
    private boolean gSd;
    protected boolean jlb;
    private final Runnable od;
    private final int qD;
    private long sP;

    /* compiled from: BaseVideoController.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.video.vG.pvs$pvs, reason: collision with other inner class name */
    public interface InterfaceC0085pvs {
        void pvs(int i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.pvs.pvs
    public boolean ZhG() {
        return true;
    }

    protected void cR() {
    }

    public void dx() {
        this.dx.pvs((com.bykv.vk.openvk.component.video.api.pvs) null, 0, 0);
    }

    protected void yiw(boolean z) {
        try {
            new StringBuilder("landingPageChangeVideoSize start.......").append(this.yiw.jlb());
            if (!yWX() || z) {
                float Jd = this.NB.Jd();
                float NB = this.NB.NB();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) Jd, (int) NB);
                layoutParams.addRule(13);
                if (cRf() != null) {
                    if (cRf() instanceof TextureView) {
                        ((TextureView) cRf()).setLayoutParams(layoutParams);
                    } else if (cRf() instanceof SurfaceView) {
                        ((SurfaceView) cRf()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.ZhG.getLayoutParams();
                    if (this.ZhG.getHeight() > 0) {
                        float min = Math.min(this.ZhG.getWidth() / Jd, this.ZhG.getHeight() / NB);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (Jd * min);
                            layoutParams.height = (int) (NB * min);
                            if (cRf() instanceof TextureView) {
                                ((TextureView) cRf()).setLayoutParams(layoutParams);
                            } else if (cRf() instanceof SurfaceView) {
                                ((SurfaceView) cRf()).setLayoutParams(layoutParams);
                            }
                            if (this.OT.NB == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.ZhG.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Ju.pvs(this.pvs, "changeSize error", th);
        }
    }

    public pvs(Context context, ViewGroup viewGroup, cR cRVar, yiw yiwVar) {
        super(context, cRVar, viewGroup);
        this.cRf = 0L;
        this.sP = 0L;
        this.gSd = false;
        this.gA = 0L;
        this.jlb = false;
        this.dx = new vG.icD() { // from class: com.bytedance.sdk.openadsdk.core.video.vG.pvs.1
            private boolean icD = true;

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void icD(com.bykv.vk.openvk.component.video.api.pvs pvsVar, int i) {
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
                String unused = pvs.this.pvs;
                pvs.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.vG.pvs.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pvs.this.CvL != null) {
                            try {
                                pvs.this.CvL.pvs(9);
                            } catch (Exception unused2) {
                            }
                        }
                        pvs.this.OhP();
                    }
                });
                com.bytedance.sdk.openadsdk.core.yiw.pvs ig = pvs.this.yiw.ig();
                if (ig != null && ig.pvs() != null) {
                    long NB = pvs.this.NB();
                    ig.pvs().Jd(NB);
                    ig.pvs().NB(NB);
                }
                NB.pvs(pvs.this.yiw, 5);
                if (pvs.this.OhP != null) {
                    pvs.this.OhP.pvs(3);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, long j) {
                String unused = pvs.this.pvs;
                pvs.this.ny = false;
                pvs.this.icD.removeCallbacks(pvs.this.od);
                pvs.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.vG.pvs.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pvs.this.sUS != null) {
                            pvs.this.sUS.icD();
                        }
                    }
                });
                if (!pvs.this.zM.get()) {
                    pvs.this.gA = j;
                    pvs pvsVar2 = pvs.this;
                    pvsVar2.pvs(pvsVar2.Pj);
                    pvs.this.jlb();
                }
                if (pvs.this.CvL != null) {
                    pvs.this.CvL.vG();
                }
                NB.pvs(pvs.this.yiw, 0);
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void icD(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
                String unused = pvs.this.pvs;
                pvs.this.icD.removeCallbacks(pvs.this.od);
                pvs.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.vG.pvs.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pvs.this.sUS != null) {
                            pvs.this.sUS.icD();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, com.bykv.vk.openvk.component.video.api.vG.pvs pvsVar2) {
                Ju.pvs(pvs.this.pvs, "onError: " + pvsVar2.pvs() + "," + pvsVar2.icD() + "," + pvsVar2.vG());
                pvs.this.icD.removeCallbacks(pvs.this.od);
                pvs.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.vG.pvs.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pvs.this.sUS != null) {
                            pvs.this.sUS.icD();
                        }
                        if (pvs.this.dX != null) {
                            pvs.this.dX.icD(pvs.this.sP, com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs(pvs.this.so, pvs.this.Gp));
                        }
                    }
                });
                pvs.this.pvs(pvsVar2);
                NB.pvs(pvs.this.yiw, 6);
                if (pvs.this.CvL != null) {
                    pvs.this.CvL.pvs(14);
                }
                if (pvs.this.OhP != null) {
                    pvs.this.OhP.pvs(4);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, boolean z) {
                String unused = pvs.this.pvs;
                pvs.this.icD.removeCallbacks(pvs.this.od);
                pvs.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.vG.pvs.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pvs.this.sUS != null) {
                            pvs.this.sUS.icD();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void vG(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
                String unused = pvs.this.pvs;
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, int i, int i2) {
                String unused = pvs.this.pvs;
                pvs.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.vG.pvs.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pvs.this.jhZ()) {
                            if (!mnm.icD(pvs.this.yiw) && pvs.this.OT.NB != 4) {
                                if (pvs.this.yiw.Gp() != 3) {
                                    if (pvs.this.yiw.Gp() == 0) {
                                        pvs.this.ea();
                                        return;
                                    } else {
                                        pvs.this.sq();
                                        return;
                                    }
                                }
                                pvs.this.yiw(true);
                                return;
                            }
                            pvs.this.yiw(true);
                            return;
                        }
                        pvs.this.SE();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, int i, int i2, int i3) {
                String unused = pvs.this.pvs;
                pvs.this.ny = true;
                pvs.this.od();
                pvs.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.vG.pvs.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pvs.this.sUS != null) {
                            pvs.this.sUS.vA();
                        }
                    }
                });
                NB.pvs(pvs.this.yiw, 3);
                if (pvs.this.CvL != null) {
                    pvs.this.CvL.pvs(4);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, int i) {
                String unused = pvs.this.pvs;
                pvs.this.ny = false;
                pvs.this.icD.removeCallbacks(pvs.this.od);
                pvs.this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.vG.pvs.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pvs.this.sUS != null) {
                            pvs.this.sUS.icD();
                        }
                    }
                });
                NB.pvs(pvs.this.yiw, 0);
                if (pvs.this.CvL != null) {
                    pvs.this.CvL.pvs(5);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void pvs(com.bykv.vk.openvk.component.video.api.pvs pvsVar, long j, long j2) {
                if (Math.abs(j - pvs.this.so) < 50) {
                    return;
                }
                pvs pvsVar2 = pvs.this;
                pvsVar2.pvs(pvsVar2.Pj);
                pvs.this.pvs(j, j2);
                com.bytedance.sdk.openadsdk.core.yiw.pvs ig = pvs.this.yiw.ig();
                if (ig != null && ig.pvs() != null) {
                    ig.pvs().pvs(j, j2, pvs.this.CvL);
                }
                if (!this.icD || j2 - j >= 500) {
                    return;
                }
                this.icD = false;
                pvs(pvsVar);
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void Jd(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
                com.bytedance.sdk.openadsdk.core.yiw.pvs ig = pvs.this.yiw.ig();
                if (ig != null && ig.pvs() != null) {
                    ig.pvs().icD(pvs.this.so);
                }
                NB.pvs(pvs.this.yiw, 3);
                if (pvs.this.CvL != null) {
                    pvs.this.CvL.pvs(0);
                }
                if (pvs.this.OhP != null) {
                    pvs.this.OhP.pvs(2);
                }
            }

            @Override // com.bykv.vk.openvk.component.video.api.pvs.InterfaceC0018pvs
            public void NB(com.bykv.vk.openvk.component.video.api.pvs pvsVar) {
                NB.pvs(pvs.this.yiw, 0);
                if (pvs.this.CvL != null) {
                    pvs.this.CvL.pvs(1);
                }
                if (pvs.this.OhP != null) {
                    pvs.this.OhP.pvs(1);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.video.vG.vG.icD
            public void pvs(int i, int i2) {
                pvs pvsVar = pvs.this;
                pvsVar.icD(pvsVar.Pj);
                pvs.this.OT.Jd = pvs.this.NB.uc();
                pvs.this.ae();
                pvs.this.zM.set(false);
                pvs pvsVar2 = pvs.this;
                pvsVar2.pvs(pvsVar2.Pj);
            }
        };
        this.od = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.vG.pvs.3
            @Override // java.lang.Runnable
            public void run() {
                if (pvs.this.dX != null) {
                    pvs.this.cR();
                    pvs.this.dX.pvs();
                }
            }
        };
        this.Pj = yiwVar;
        this.qD = cRVar.yTz();
        if (cRVar.SJ() && cRVar.ig() != null && this.ZhG != null) {
            if (this.CvL == null) {
                this.CvL = sUS.pvs();
            }
            this.CvL.pvs(this.ZhG, cRVar.ig().IP());
        }
        this.sUS = new com.bytedance.sdk.openadsdk.core.video.nativevideo.NB(context.getApplicationContext(), new TTVideoPlayLayoutForLiveLayout(context), true, 17, this.yiw, this);
        this.sUS.pvs(this);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public boolean pvs(com.bykv.vk.openvk.component.video.api.vG.vG vGVar) {
        int zM;
        View view;
        if (this.NB != null) {
            Ju.pvs(this.pvs, "playVideoUrl: already invoked");
            return false;
        }
        vGVar.Ju();
        if (TextUtils.isEmpty(vGVar.Ju())) {
            Ju.pvs(this.pvs, "No video info");
            return false;
        }
        icD(vGVar);
        vGVar.vG(1);
        this.jlb = !vGVar.Ju().startsWith("http");
        if (this.CvL != null) {
            if (this.OT.NB == 1) {
                zM = com.bytedance.sdk.openadsdk.core.mnm.Jd().Wyp(String.valueOf(this.qD));
            } else {
                zM = com.bytedance.sdk.openadsdk.core.mnm.Jd().zM(String.valueOf(this.qD));
            }
            if (this.ZhG != null && (view = (View) this.ZhG.getParent()) != null) {
                try {
                    View findViewById = view.findViewById(kj.kj);
                    this.CvL.pvs(view.findViewById(kj.XPz), FriendlyObstructionPurpose.OTHER);
                    this.CvL.pvs(findViewById, FriendlyObstructionPurpose.OTHER);
                } catch (Throwable unused) {
                }
            }
            this.CvL.pvs(zM > 0, zM / 1000.0f);
        }
        ae();
        if (vGVar.yiw() > 0) {
            this.so = vGVar.yiw();
            this.Mxy = Math.max(this.Mxy, this.so);
        }
        if (this.sUS != null) {
            this.sUS.pvs();
            this.sUS.yiw();
            this.sUS.vG(vGVar.NB(), vGVar.sUS());
            this.sUS.vG(this.ZhG);
        }
        this.NB = new vG();
        this.NB.pvs(this.dx);
        zM();
        this.sP = 0L;
        qD();
        return true;
    }

    private void qD() {
        this.NB.vG(gA());
        this.NB.pvs(this.OT);
        this.cRf = System.currentTimeMillis();
        this.sUS.vG(8);
        this.sUS.vG(0);
        pvs(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.vG.pvs.2
            @Override // java.lang.Runnable
            public void run() {
                if (pvs.this.NB == null) {
                    return;
                }
                pvs.this.cRf = System.currentTimeMillis();
                pvs.this.sUS.Jd(0);
                pvs.this.NB.pvs(true, pvs.this.so, pvs.this.bNS);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void od() {
        int SE;
        int i = this.OT.NB;
        if (i == 2 || i == 1) {
            SE = com.bytedance.sdk.openadsdk.core.mnm.Jd().SE() * 1000;
        } else {
            SE = i == 4 ? com.bytedance.sdk.openadsdk.core.mnm.Jd().Mxy(String.valueOf(this.qD)) : PAGErrorCode.LOAD_FACTORY_NULL_CODE;
        }
        this.icD.removeCallbacks(this.od);
        this.icD.postDelayed(this.od, SE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OhP() {
        if (this.sUS == null) {
            return;
        }
        this.icD.removeCallbacks(this.od);
        this.sUS.icD();
        this.sP = System.currentTimeMillis() - this.cRf;
        if (!this.gSd) {
            this.gSd = true;
            pvs(this.Gp, this.Gp);
            long j = this.Gp;
            this.so = j;
            this.Mxy = j;
            icD(this.Pj);
        }
        if (this.dX != null) {
            this.dX.pvs(this.sP, com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs(this.so, this.Gp));
        }
        this.Ju = true;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void icD() {
        if (this.sUS != null) {
            this.sUS.pvs();
            this.sUS.bNS();
            this.sUS.cR();
        }
        Object[] objArr = new Object[2];
        Boolean.valueOf(this.kj);
        if (this.NB != null) {
            if (this.NB.yiw()) {
                if (this.kj) {
                    if (so.OT()) {
                        this.NB.icD(3);
                        this.NB.pvs(false, this.NB.vA(), this.bNS);
                    } else {
                        rCZ();
                    }
                } else {
                    icD(this.ae);
                }
                Object[] objArr2 = new Object[2];
                Boolean.valueOf(this.kj);
            } else {
                this.NB.pvs(false, this.so, this.bNS);
            }
        }
        if (this.gSd || !this.zM.get()) {
            return;
        }
        CvL();
        com.bytedance.sdk.openadsdk.core.yiw.pvs ig = this.yiw.ig();
        if (ig == null || ig.pvs() == null) {
            return;
        }
        ig.pvs().vG(NB());
    }

    public void Pj() {
        if (this.gSd || !this.zM.get()) {
            return;
        }
        CvL();
        com.bytedance.sdk.openadsdk.core.yiw.pvs ig = this.yiw.ig();
        if (ig == null || ig.pvs() == null) {
            return;
        }
        ig.pvs().vG(NB());
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void vG() {
        if (this.NB == null) {
            return;
        }
        this.NB.kj();
        this.NB = null;
        if (this.sUS != null) {
            this.sUS.Mxy();
        }
        this.icD.removeCallbacks(this.od);
        this.icD.removeCallbacksAndMessages(null);
        if (this.CvL != null) {
            this.CvL.Jd();
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void pvs(boolean z, int i) {
        vG();
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.vG
    public void Jd() {
        vG();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jhZ() {
        return this.yiw.UYh() == 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void SE() {
        try {
            if (cRf() != null && this.NB != null && this.ZhG != null) {
                int width = this.ZhG.getWidth();
                int height = this.ZhG.getHeight();
                float Jd = this.NB.Jd();
                float NB = this.NB.NB();
                float f = width;
                float f2 = height;
                if (Jd / (f * 1.0f) <= NB / (1.0f * f2)) {
                    f = (f2 / NB) * Jd;
                } else {
                    f2 = (f / Jd) * NB;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f, (int) f2);
                layoutParams.addRule(13);
                if (cRf() instanceof TextureView) {
                    ((TextureView) cRf()).setLayoutParams(layoutParams);
                } else if (cRf() instanceof SurfaceView) {
                    ((SurfaceView) cRf()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            Ju.pvs(this.pvs, "changeVideoSizeSupportInteraction error", th);
        }
    }

    private boolean yWX() {
        return cRf() == null || this.NB == null || this.yiw.gSd() != null || this.yiw.ae() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sq() {
        try {
            new StringBuilder("changeVideoSize start.......slot=").append(this.yiw.jlb());
            if (yWX()) {
                return;
            }
            int[] icD = Pj.icD(com.bytedance.sdk.openadsdk.core.mnm.pvs());
            boolean z = false;
            boolean z2 = this.yiw.rcB() == 1;
            float f = icD[0];
            float f2 = icD[1];
            float Jd = this.NB.Jd();
            float NB = this.NB.NB();
            if (z2) {
                if (Jd > NB) {
                    pvs(f, f2, Jd, NB, true);
                    return;
                }
            } else if (Jd < NB) {
                pvs(f, f2, Jd, NB, false);
                return;
            }
            float f3 = Jd / NB;
            float f4 = f / f2;
            if (z2) {
                if (f4 < 0.5625f && f3 == 0.5625f) {
                    Jd = (9.0f * f2) / 16.0f;
                    z = true;
                    NB = f2;
                }
            } else if (f4 > 1.7777778f && f3 == 1.7777778f) {
                NB = (9.0f * f) / 16.0f;
                z = true;
                Jd = f;
            }
            if (z) {
                f = Jd;
                f2 = NB;
            }
            int i = (int) f;
            int i2 = (int) f2;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(13);
            if (cRf() != null) {
                if (cRf() instanceof TextureView) {
                    ((TextureView) cRf()).setLayoutParams(layoutParams);
                } else if (cRf() instanceof SurfaceView) {
                    ((SurfaceView) cRf()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.ZhG.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = i2;
                    layoutParams2.width = i;
                    this.ZhG.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th) {
            Ju.pvs(this.pvs, "changeSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ea() {
        try {
            if (cRf() != null && this.NB != null) {
                boolean z = this.yiw.rcB() == 1;
                int[] icD = Pj.icD(com.bytedance.sdk.openadsdk.core.mnm.pvs());
                pvs(icD[0], icD[1], this.NB.Jd(), this.NB.NB(), z);
            }
        } catch (Throwable unused) {
        }
    }

    private void pvs(float f, float f2, float f3, float f4, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        if (f3 <= 0.0f || f4 <= 0.0f) {
            try {
                f3 = this.yiw.od().vG();
                f4 = this.yiw.od().icD();
            } catch (Throwable unused) {
                return;
            }
        }
        if (f4 > 0.0f && f3 > 0.0f) {
            if (z) {
                if (f3 < f4) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f, (int) ((f4 * f) / f3));
            } else if (f3 > f4) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f3 * f2) / f4), (int) f2);
            }
            layoutParams.addRule(13);
            if (cRf() != null) {
                if (cRf() instanceof TextureView) {
                    ((TextureView) cRf()).setLayoutParams(layoutParams);
                } else if (cRf() instanceof SurfaceView) {
                    ((SurfaceView) cRf()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.ZhG.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.Jd.icD.pvs(com.bytedance.sdk.openadsdk.core.mnm.pvs()) || this.ZhG.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.ZhG.setLayoutParams(layoutParams2);
            }
        }
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
            icD();
            if (this.sUS != null) {
                this.sUS.icD(false, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final long j, final long j2) {
        this.yiw.vG(j);
        this.so = j;
        this.Gp = j2;
        final int pvs = com.bykv.vk.openvk.component.video.pvs.NB.pvs.pvs(j, j2);
        this.icD.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.vG.pvs.4
            @Override // java.lang.Runnable
            public void run() {
                pvs.this.sUS.pvs(j, j2);
                pvs.this.sUS.pvs(pvs);
                try {
                    if (pvs.this.dX != null) {
                        pvs.this.dX.pvs(j, j2);
                    }
                } catch (Throwable th) {
                    Ju.pvs(pvs.this.pvs, "onProgressUpdate error: ", th);
                }
            }
        });
    }

    public com.bykv.vk.openvk.component.video.api.renderview.icD cRf() {
        if (this.sUS != null) {
            return this.sUS.Ju();
        }
        return null;
    }

    public void sP() {
        if (this.CvL != null) {
            this.CvL.pvs(2);
        }
    }

    public void gSd() {
        if (this.CvL != null) {
            this.CvL.pvs(13);
        }
    }

    public void pvs(InterfaceC0085pvs interfaceC0085pvs) {
        this.OhP = interfaceC0085pvs;
    }
}
