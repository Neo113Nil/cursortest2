package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderSurfaceView;
import com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.NB.qh;
import com.bytedance.sdk.component.utils.Ju;
import com.bytedance.sdk.component.utils.dyT;
import com.bytedance.sdk.component.utils.uc;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.icD.icD;
import com.bytedance.sdk.openadsdk.core.icD.pvs;
import com.bytedance.sdk.openadsdk.core.mnm;
import com.bytedance.sdk.openadsdk.core.model.cR;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.core.widget.Jd;
import com.bytedance.sdk.openadsdk.core.widget.NB;
import com.bytedance.sdk.openadsdk.utils.Pj;
import com.bytedance.sdk.openadsdk.utils.jlb;
import com.bytedance.sdk.openadsdk.utils.kj;
import com.bytedance.sdk.openadsdk.utils.so;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: NativeVideoLayout.java */
/* loaded from: classes2.dex */
public class NB implements com.bykv.vk.openvk.component.video.api.Jd.icD<cR>, com.bykv.vk.openvk.component.video.api.renderview.pvs, dyT.pvs, pvs.InterfaceC0074pvs, Jd.pvs, NB.icD {
    boolean CvL;
    com.com.bytedance.overseas.sdk.pvs.vG Gp;
    TextView IP;
    View Jd;
    TextView Ju;
    ImageView Mxy;
    View NB;
    int OT;
    private NativeVideoTsView.pvs Pj;
    View Wyp;
    Context ZhG;
    com.bykv.vk.openvk.component.video.api.Jd.vG ae;
    int bNS;
    int cR;
    private long cRf;
    pvs dX;
    boolean dx;
    com.bytedance.sdk.openadsdk.core.widget.NB dyT;
    com.bytedance.sdk.openadsdk.core.icD.pvs gA;
    com.bykv.vk.openvk.component.video.api.renderview.icD icD;
    com.bytedance.sdk.openadsdk.core.icD.pvs jlb;
    TextView kj;
    int mnm;
    cR ny;
    ViewGroup pvs;
    CornerIV qh;
    int rCZ;
    private final String sP;
    ImageView sUS;
    View so;
    boolean uc;
    int vA;
    ImageView vG;
    View yiw;
    boolean zM;

    public void NB() {
    }

    public boolean Wyp() {
        return false;
    }

    public void icD(ViewGroup viewGroup) {
    }

    public void icD(boolean z) {
    }

    public boolean icD(int i) {
        return false;
    }

    public void pvs(int i) {
    }

    public void pvs(long j) {
    }

    public void pvs(long j, long j2) {
    }

    public void pvs(Message message) {
    }

    public void pvs(View view, boolean z) {
    }

    public void pvs(ViewGroup viewGroup) {
    }

    public void pvs(String str) {
    }

    public void sUS() {
    }

    public void vG(boolean z) {
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.icD
    public /* bridge */ /* synthetic */ void pvs(cR cRVar, WeakReference weakReference, boolean z) {
        pvs(cRVar, (WeakReference<Context>) weakReference, z);
    }

    public NB(Context context, ViewGroup viewGroup, boolean z, int i, cR cRVar, com.bykv.vk.openvk.component.video.api.Jd.vG vGVar, boolean z2) {
        this.zM = true;
        this.CvL = true;
        this.dx = true;
        this.sP = Build.MODEL;
        if (this instanceof Jd) {
            return;
        }
        this.ZhG = mnm.pvs().getApplicationContext();
        Jd(z2);
        this.pvs = viewGroup;
        this.zM = z;
        this.OT = i;
        this.ae = vGVar;
        this.ny = cRVar;
        Jd(8);
        pvs(context, this.pvs);
        Jd();
        kj();
    }

    public NB(Context context, ViewGroup viewGroup, boolean z, int i, cR cRVar, com.bykv.vk.openvk.component.video.api.Jd.vG vGVar) {
        this(context, viewGroup, z, i, cRVar, vGVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void kj() {
        String str;
        int i;
        String str2;
        int i2;
        com.com.bytedance.overseas.sdk.pvs.vG vGVar;
        com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar;
        String str3 = this.CvL ? "embeded_ad" : "embeded_ad_landingpage";
        if (this.ny.FJ()) {
            str2 = "rewarded_video";
            i2 = 7;
        } else if (this.ny.RgU()) {
            str2 = "fullscreen_interstitial_ad";
            i2 = 5;
        } else {
            if (!this.ny.VXe()) {
                str = str3;
                i = 1;
                if (this.ny.jhZ() == 4) {
                    this.Gp = com.com.bytedance.overseas.sdk.pvs.Jd.pvs(this.ZhG, this.ny, str);
                }
                com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar2 = new com.bytedance.sdk.openadsdk.core.icD.pvs(this.ZhG, this.ny, str, i);
                this.gA = pvsVar2;
                pvsVar2.pvs(this);
                this.gA.icD(true);
                if (!this.CvL) {
                    this.gA.pvs(true);
                } else {
                    this.gA.pvs(false);
                    this.gA.vG(true);
                }
                this.gA.pvs(this.ae);
                this.gA.Jd(true);
                this.gA.pvs(new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NB.1
                    @Override // com.bytedance.sdk.openadsdk.core.icD.icD.pvs
                    public void pvs(View view, int i3) {
                        if (NB.this.Pj != null) {
                            NB.this.Pj.pvs(view, i3);
                        }
                    }
                });
                vGVar = this.Gp;
                if (vGVar != null && (pvsVar = this.gA) != null) {
                    pvsVar.pvs(vGVar);
                }
                if (dyT()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar3 = new com.bytedance.sdk.openadsdk.core.icD.pvs(this.ZhG, this.ny, str, i) { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NB.2
                    @Override // com.bytedance.sdk.openadsdk.core.icD.pvs
                    public boolean icD() {
                        boolean pvs = NB.this.dyT != null ? NB.this.dyT.pvs() : false;
                        NB.this.vG.getVisibility();
                        return pvs || NB.this.vG.getVisibility() == 0;
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.icD.pvs
                    public boolean vG() {
                        if (NB.this.so != null && NB.this.so.getVisibility() == 0) {
                            return true;
                        }
                        if (NB.this.Wyp != null && NB.this.Wyp.getVisibility() == 0) {
                            return true;
                        }
                        if (NB.this.qh == null || NB.this.qh.getVisibility() != 0) {
                            return NB.this.kj != null && NB.this.kj.getVisibility() == 0;
                        }
                        return true;
                    }
                };
                this.jlb = pvsVar3;
                pvsVar3.pvs(new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NB.3
                    @Override // com.bytedance.sdk.openadsdk.core.icD.icD.pvs
                    public void pvs(View view, int i3) {
                        if (NB.this.Pj != null) {
                            NB.this.Pj.pvs(view, i3);
                        }
                    }
                });
                this.jlb.icD(true);
                this.jlb.pvs(this.CvL);
                this.jlb.pvs(this.ae);
                this.jlb.Jd(true);
                com.com.bytedance.overseas.sdk.pvs.vG vGVar2 = this.Gp;
                if (vGVar2 != null) {
                    this.jlb.pvs(vGVar2);
                }
                this.jlb.pvs(this);
                return;
            }
            str2 = "banner_ad";
            i2 = 2;
        }
        str = str2;
        i = i2;
        if (this.ny.jhZ() == 4) {
        }
        com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar22 = new com.bytedance.sdk.openadsdk.core.icD.pvs(this.ZhG, this.ny, str, i);
        this.gA = pvsVar22;
        pvsVar22.pvs(this);
        this.gA.icD(true);
        if (!this.CvL) {
        }
        this.gA.pvs(this.ae);
        this.gA.Jd(true);
        this.gA.pvs(new icD.pvs() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NB.1
            @Override // com.bytedance.sdk.openadsdk.core.icD.icD.pvs
            public void pvs(View view, int i3) {
                if (NB.this.Pj != null) {
                    NB.this.Pj.pvs(view, i3);
                }
            }
        });
        vGVar = this.Gp;
        if (vGVar != null) {
            pvsVar.pvs(vGVar);
        }
        if (dyT()) {
        }
    }

    private boolean dyT() {
        return cR.NB(this.ny) && this.ny.gSd() == null && this.ny.ZhG() == 1;
    }

    public void pvs(NativeVideoTsView.pvs pvsVar) {
        this.Pj = pvsVar;
    }

    public void pvs(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar = this.gA;
        if (pvsVar != null) {
            pvsVar.pvs(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar2 = this.jlb;
        if (pvsVar2 != null) {
            pvsVar2.pvs(pAGNativeAd);
        }
    }

    public com.bykv.vk.openvk.component.video.api.renderview.icD Ju() {
        return this.icD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20, types: [com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView] */
    void pvs(Context context, View view) {
        SSRenderSurfaceView sSRenderSurfaceView;
        System.currentTimeMillis();
        cR cRVar = this.ny;
        if ((cRVar == null || ((!cRVar.lHK() && !this.ny.VXe()) || com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj().RGX())) && view != null) {
            view.setKeepScreenOn(true);
        }
        com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.ae;
        if (vGVar != null && vGVar.vA()) {
            sSRenderSurfaceView = new SSRenderTextureView(this.ZhG);
        } else {
            sSRenderSurfaceView = new SSRenderSurfaceView(this.ZhG);
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(sSRenderSurfaceView, 0, layoutParams);
        }
        Pj.pvs((View) sSRenderSurfaceView, 8);
        this.icD = sSRenderSurfaceView;
        this.vG = (ImageView) view.findViewById(kj.BiC);
        this.Jd = view.findViewById(kj.nS);
        this.NB = view.findViewById(kj.VVr);
        this.sUS = (ImageView) view.findViewById(kj.Lxj);
        this.yiw = view.findViewById(kj.Oa);
        System.currentTimeMillis();
    }

    void pvs(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.yiw) == null || view2.getParent() == null || this.so != null) {
            return;
        }
        this.so = this.yiw;
        this.Mxy = (ImageView) view.findViewById(kj.GcG);
        this.Wyp = view.findViewById(kj.RGX);
        this.qh = (CornerIV) view.findViewById(kj.OhP);
        this.kj = (TextView) view.findViewById(kj.jhZ);
        this.Ju = (TextView) view.findViewById(kj.SE);
        this.IP = (TextView) view.findViewById(kj.yWX);
    }

    void IP() {
        if (this.dX == null || this.dyT != null) {
            return;
        }
        System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.widget.NB nb = new com.bytedance.sdk.openadsdk.core.widget.NB();
        this.dyT = nb;
        nb.pvs(this.ZhG, this.pvs);
        this.dyT.pvs(this.dX, this);
        System.currentTimeMillis();
    }

    public boolean pvs(int i, com.bykv.vk.openvk.component.video.api.vG.icD icd, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.NB nb = this.dyT;
        return nb == null || nb.pvs(i, icd, z);
    }

    public void bNS() {
        com.bytedance.sdk.openadsdk.core.widget.NB nb = this.dyT;
        if (nb != null) {
            nb.pvs(false);
        }
    }

    public void pvs(com.bykv.vk.openvk.component.video.api.Jd.pvs pvsVar) {
        if (pvsVar instanceof pvs) {
            this.dX = (pvs) pvsVar;
            IP();
        }
    }

    boolean mnm() {
        if (this.dX != null) {
            return true;
        }
        Ju.pvs("NewLiveViewLayout", "callback is null");
        return false;
    }

    void Jd() {
        this.icD.pvs(this);
        this.vG.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NB.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (NB.this.mnm()) {
                    if (NB.this.IP == null || NB.this.IP.getVisibility() != 0) {
                        NB.this.dX.pvs(NB.this, view);
                    }
                }
            }
        });
    }

    public void vG(int i) {
        Pj.pvs((View) this.pvs, 0);
        com.bykv.vk.openvk.component.video.api.renderview.icD icd = this.icD;
        if (icd != null) {
            icd.setVisibility(i);
        }
    }

    public void Jd(boolean z) {
        this.CvL = z;
        if (z) {
            com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar = this.gA;
            if (pvsVar != null) {
                pvsVar.pvs(true);
            }
            com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar2 = this.jlb;
            if (pvsVar2 != null) {
                pvsVar2.pvs(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar3 = this.gA;
        if (pvsVar3 != null) {
            pvsVar3.pvs(false);
        }
        com.bytedance.sdk.openadsdk.core.icD.pvs pvsVar4 = this.jlb;
        if (pvsVar4 != null) {
            pvsVar4.pvs(false);
        }
    }

    public void pvs(int i, int i2) {
        if (i == -1) {
            i = Pj.vG(this.ZhG);
        }
        if (i <= 0) {
            return;
        }
        this.bNS = i;
        if (rCZ() || Wyp() || (this.OT & 8) == 8) {
            this.mnm = i2;
        } else {
            this.mnm = NB(i);
        }
        icD(this.bNS, this.mnm);
    }

    public void icD(boolean z, boolean z2) {
        ImageView imageView = this.vG;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(so.pvs(this.ZhG, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(so.pvs(this.ZhG, "tt_stop_movebar_textpage"));
            }
        }
    }

    public void icD(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.pvs.getLayoutParams();
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.pvs.setLayoutParams(layoutParams);
    }

    private int NB(int i) {
        if (this.vA <= 0 || this.cR <= 0) {
            return 0;
        }
        int dimensionPixelSize = this.ZhG.getResources().getDimensionPixelSize(uc.yiw(this.ZhG, "tt_video_container_maxheight"));
        int dimensionPixelSize2 = this.ZhG.getResources().getDimensionPixelSize(uc.yiw(this.ZhG, "tt_video_container_minheight"));
        int i2 = (int) (this.cR * ((i * 1.0f) / this.vA));
        return i2 > dimensionPixelSize ? dimensionPixelSize : i2 < dimensionPixelSize2 ? dimensionPixelSize2 : i2;
    }

    public void vG(int i, int i2) {
        this.vA = i;
        this.cR = i2;
    }

    public void vG(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.pvs.getParent() == null) {
            viewGroup.addView(this.pvs);
        }
        Jd(0);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.icD
    public View vG() {
        return this.pvs;
    }

    public void yiw() {
        cR cRVar;
        Pj.sUS(this.Jd);
        Pj.sUS(this.NB);
        if (this.sUS != null && (cRVar = this.ny) != null && cRVar.od() != null && this.ny.od().Wyp() != null) {
            Pj.sUS(this.sUS);
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.ny.od().Wyp(), this.ny.od().vG(), this.ny.od().icD(), this.sUS, this.ny);
        }
        if (this.vG.getVisibility() == 0) {
            Pj.pvs((View) this.vG, 8);
        }
    }

    public void vA() {
        Pj.sUS(this.Jd);
        Pj.sUS(this.NB);
        if (this.vG.getVisibility() == 0) {
            Pj.pvs((View) this.vG, 8);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.icD
    public void pvs() {
        pvs(false, this.zM);
        zM();
    }

    public void cR() {
        Pj.pvs((View) this.pvs, 0);
        com.bykv.vk.openvk.component.video.api.renderview.icD icd = this.icD;
        if (icd != null) {
            Pj.pvs(icd.getView(), 0);
        }
    }

    void zM() {
        try {
            Pj.pvs(this.so, 8);
            Pj.pvs((View) this.Mxy, 8);
            Pj.pvs(this.Wyp, 8);
            Pj.pvs((View) this.qh, 8);
            Pj.pvs((View) this.kj, 8);
            Pj.pvs((View) this.Ju, 8);
            Pj.pvs((View) this.IP, 8);
        } catch (Exception unused) {
        }
    }

    public void uc() {
        ImageView imageView = this.Mxy;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        CornerIV cornerIV = this.qh;
        if (cornerIV != null) {
            cornerIV.setImageBitmap(null);
        }
    }

    private void sUS(int i) {
        Pj.pvs(this.Wyp, i);
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.icD
    public void pvs(boolean z) {
        this.dx = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public void pvs(final cR cRVar, WeakReference<Context> weakReference, boolean z) {
        String rW;
        cR cRVar2;
        cR cRVar3;
        if (cRVar == null) {
            return;
        }
        pvs(false, this.zM);
        pvs(this.pvs, mnm.pvs());
        View view = this.so;
        if (view != null) {
            Pj.pvs(view, 0);
        }
        ImageView imageView = this.Mxy;
        if (imageView != null) {
            Pj.pvs((View) imageView, 0);
        }
        Pj.pvs(this.Wyp, 0);
        if (this.Mxy != null && (cRVar3 = this.ny) != null && cRVar3.od() != null && this.ny.od().Wyp() != null) {
            com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.ny.od().Wyp(), this.ny.od().vG(), this.ny.od().icD(), this.Mxy, cRVar);
        }
        if (!TextUtils.isEmpty(cRVar.OhP())) {
            rW = cRVar.OhP();
        } else if (!TextUtils.isEmpty(cRVar.qd())) {
            rW = cRVar.qd();
        } else {
            rW = !TextUtils.isEmpty(cRVar.rW()) ? cRVar.rW() : "";
        }
        if (this.qh != null && (cRVar2 = this.ny) != null && cRVar2.ea() != null && this.ny.ea().pvs() != null) {
            Pj.pvs((View) this.qh, 0);
            Pj.pvs((View) this.kj, 4);
            cR cRVar4 = this.ny;
            if (cRVar4 != null && cRVar4.SJ()) {
                com.bytedance.sdk.openadsdk.sUS.Jd.pvs(this.ny.ea()).vG(2).pvs(new com.bytedance.sdk.openadsdk.sUS.icD(cRVar, this.ny.ea().pvs(), new com.bytedance.sdk.component.NB.mnm<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NB.5
                    @Override // com.bytedance.sdk.component.NB.mnm
                    public void pvs(qh<Bitmap> qhVar) {
                        if (qhVar == null || qhVar.icD() == null) {
                            return;
                        }
                        if (NB.this.qh != null) {
                            NB.this.qh.setImageBitmap(qhVar.icD());
                        }
                        com.bytedance.sdk.openadsdk.icD.vG.icD(NB.this.ny, NB.this.ny != null ? jlb.vG(cRVar.VLm()) : null, "load_vast_icon_success", (JSONObject) null);
                    }

                    @Override // com.bytedance.sdk.component.NB.mnm
                    public void pvs(int i, String str, Throwable th) {
                        NB.this.pvs(i, str, cRVar);
                    }
                }));
                if (this.ny.ig() != null && this.ny.ig().icD() != null) {
                    this.ny.ig().icD().icD(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.qh.vG.pvs().pvs(this.ny.ea(), this.qh, cRVar);
            }
            cR cRVar5 = this.ny;
            if (cRVar5 != null && cRVar5.SJ()) {
                try {
                    this.qh.setTag(570425345, "VAST_ICON");
                } catch (Throwable unused) {
                }
            }
            cR cRVar6 = this.ny;
            if (cRVar6 != null && cRVar6.ig() != null && this.ny.ig().icD() != null) {
                final com.bytedance.sdk.openadsdk.core.yiw.icD icD = this.ny.ig().icD();
                CornerIV cornerIV = this.qh;
                if (cornerIV != null) {
                    cornerIV.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NB.6
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.yiw.icD icd;
                            if (NB.this.qh == null || !NB.this.qh.isShown() || (icd = icD) == null) {
                                return;
                            }
                            icd.icD(NB.this.getVideoProgress());
                        }
                    });
                }
            }
            if (dyT()) {
                this.qh.setOnClickListener(this.jlb);
                this.qh.setOnTouchListener(this.jlb);
            } else {
                this.qh.setOnClickListener(this.gA);
                this.qh.setOnTouchListener(this.gA);
            }
        } else if (!TextUtils.isEmpty(rW)) {
            Pj.pvs((View) this.qh, 4);
            Pj.pvs((View) this.kj, 0);
            TextView textView = this.kj;
            if (textView != null) {
                textView.setText(rW.substring(0, 1));
                if (dyT()) {
                    this.kj.setOnClickListener(this.jlb);
                    this.kj.setOnTouchListener(this.jlb);
                } else {
                    this.kj.setOnClickListener(this.gA);
                    this.kj.setOnTouchListener(this.gA);
                }
            }
        }
        if (this.Ju != null && !TextUtils.isEmpty(rW)) {
            this.Ju.setText(rW);
            this.Ju.setTag(570425345, "VAST_TITLE");
        }
        Pj.pvs((View) this.Ju, 0);
        Pj.pvs((View) this.IP, 0);
        String Cwg = cRVar.Cwg();
        if (TextUtils.isEmpty(Cwg)) {
            int jhZ = cRVar.jhZ();
            if (jhZ != 2 && jhZ != 3) {
                if (jhZ == 4) {
                    Cwg = uc.pvs(this.ZhG, "tt_video_download_apk");
                } else if (jhZ == 5) {
                    Cwg = uc.pvs(this.ZhG, "tt_video_dial_phone");
                } else if (jhZ != 8) {
                    Cwg = uc.pvs(this.ZhG, "tt_video_mobile_go_detail");
                }
            }
            Cwg = uc.pvs(this.ZhG, "tt_video_mobile_go_detail");
        }
        TextView textView2 = this.IP;
        if (textView2 != null) {
            textView2.setText(Cwg);
            this.IP.setOnClickListener(this.gA);
            this.IP.setOnTouchListener(this.gA);
        }
        if (this.dx) {
            return;
        }
        sUS(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pvs(final int i, final String str, final cR cRVar) {
        com.bytedance.sdk.openadsdk.icD.vG.pvs(new com.bytedance.sdk.component.so.so("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.video.nativevideo.NB.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("description", i + ":" + str);
                    jSONObject.put(ImagesContract.URL, NB.this.ny.ea().pvs());
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.icD.vG.icD(NB.this.ny, NB.this.ny != null ? jlb.vG(cRVar.VLm()) : null, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.icD
    public void icD() {
        Pj.NB(this.Jd);
        Pj.NB(this.NB);
        ImageView imageView = this.sUS;
        if (imageView != null) {
            Pj.NB(imageView);
        }
    }

    public void so() {
        Pj.NB(this.Jd);
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.pvs
    public void pvs(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.icD.getHolder()) {
            return;
        }
        this.uc = true;
        if (mnm()) {
            this.dX.pvs(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.pvs
    public void pvs(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder != this.icD.getHolder()) {
            return;
        }
        mnm();
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.pvs
    public void icD(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.icD.getHolder()) {
            return;
        }
        this.uc = false;
        if (mnm()) {
            this.dX.icD(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.pvs
    public void pvs(SurfaceTexture surfaceTexture, int i, int i2) {
        this.uc = true;
        if (mnm()) {
            this.dX.pvs(this, surfaceTexture);
        }
    }

    @Override // com.bykv.vk.openvk.component.video.api.renderview.pvs
    public boolean pvs(SurfaceTexture surfaceTexture) {
        this.uc = false;
        if (!mnm()) {
            return true;
        }
        this.dX.icD(this, surfaceTexture);
        return true;
    }

    public void Mxy() {
        Jd(8);
        if (ZhG()) {
            this.icD.setVisibility(8);
        }
        ImageView imageView = this.sUS;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        Jd(8);
        Pj.pvs(this.so, 8);
        Pj.pvs((View) this.Mxy, 8);
        Pj.pvs(this.Wyp, 8);
        Pj.pvs((View) this.qh, 8);
        Pj.pvs((View) this.kj, 8);
        Pj.pvs((View) this.Ju, 8);
        com.bytedance.sdk.openadsdk.core.widget.NB nb = this.dyT;
        if (nb != null) {
            nb.pvs(true);
        }
    }

    public boolean rCZ() {
        return this.zM;
    }

    public void pvs(boolean z, boolean z2, boolean z3) {
        Pj.pvs((View) this.vG, (!z || this.Jd.getVisibility() == 0) ? 8 : 0);
    }

    public void pvs(boolean z, boolean z2) {
        Pj.pvs((View) this.vG, 8);
    }

    public void qh() {
        pvs(true, false);
    }

    public boolean OT() {
        return this.uc;
    }

    public void Jd(int i) {
        this.rCZ = i;
        Pj.pvs((View) this.pvs, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.Jd.pvs
    public boolean ny() {
        com.bytedance.sdk.openadsdk.core.widget.NB nb = this.dyT;
        return nb != null && nb.pvs();
    }

    boolean ZhG() {
        return (this.OT & 4) != 4 || this.zM;
    }

    @Override // com.bykv.vk.openvk.component.video.api.Jd.icD
    public void pvs(Drawable drawable) {
        ViewGroup viewGroup = this.pvs;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.icD.pvs.InterfaceC0074pvs
    public long getVideoProgress() {
        if (this.cRf <= 0) {
            cR cRVar = this.ny;
            if (cRVar != null && cRVar.od() != null) {
                this.cRf = (long) (this.ny.od().sUS() * 1000.0d);
            }
            com.bykv.vk.openvk.component.video.api.Jd.vG vGVar = this.ae;
            if (vGVar != null) {
                this.cRf = vGVar.so();
            }
        }
        return this.cRf;
    }
}
