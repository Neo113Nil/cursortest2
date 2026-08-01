package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;
import com.bytedance.adsdk.lottie.vG.icD.zM;
import java.util.List;

/* compiled from: RectangleContent.java */
/* loaded from: classes.dex */
public class bNS implements pvs.InterfaceC0030pvs, Ju, qh {
    private final boolean Jd;
    private final com.bytedance.adsdk.lottie.so NB;
    private boolean qh;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, PointF> sUS;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> so;
    private final String vG;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, PointF> yiw;
    private final Path pvs = new Path();
    private final RectF icD = new RectF();
    private final icD Mxy = new icD();
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> Wyp = null;

    public bNS(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.vG.icD.qh qhVar) {
        this.vG = qhVar.pvs();
        this.Jd = qhVar.NB();
        this.NB = soVar;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> pvs = qhVar.Jd().pvs();
        this.sUS = pvs;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> pvs2 = qhVar.vG().pvs();
        this.yiw = pvs2;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs3 = qhVar.icD().pvs();
        this.so = pvs3;
        pvsVar.pvs(pvs);
        pvsVar.pvs(pvs2);
        pvsVar.pvs(pvs3);
        pvs.pvs(this);
        pvs2.pvs(this);
        pvs3.pvs(this);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        icD();
    }

    private void icD() {
        this.qh = false;
        this.NB.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<vG> list, List<vG> list2) {
        for (int i = 0; i < list.size(); i++) {
            vG vGVar = list.get(i);
            if (vGVar instanceof rCZ) {
                rCZ rcz = (rCZ) vGVar;
                if (rcz.icD() == zM.pvs.SIMULTANEOUSLY) {
                    this.Mxy.pvs(rcz);
                    rcz.pvs(this);
                }
            }
            if (vGVar instanceof vA) {
                this.Wyp = ((vA) vGVar).icD();
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.Ju
    public Path Jd() {
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvsVar;
        if (this.qh) {
            return this.pvs;
        }
        this.pvs.reset();
        if (this.Jd) {
            this.qh = true;
            return this.pvs;
        }
        PointF yiw = this.yiw.yiw();
        float f = yiw.x / 2.0f;
        float f2 = yiw.y / 2.0f;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> pvsVar2 = this.so;
        float Mxy = pvsVar2 == null ? 0.0f : ((com.bytedance.adsdk.lottie.pvs.icD.Jd) pvsVar2).Mxy();
        if (Mxy == 0.0f && (pvsVar = this.Wyp) != null) {
            Mxy = Math.min(pvsVar.yiw().floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (Mxy > min) {
            Mxy = min;
        }
        PointF yiw2 = this.sUS.yiw();
        this.pvs.moveTo(yiw2.x + f, (yiw2.y - f2) + Mxy);
        this.pvs.lineTo(yiw2.x + f, (yiw2.y + f2) - Mxy);
        if (Mxy > 0.0f) {
            float f3 = Mxy * 2.0f;
            this.icD.set((yiw2.x + f) - f3, (yiw2.y + f2) - f3, yiw2.x + f, yiw2.y + f2);
            this.pvs.arcTo(this.icD, 0.0f, 90.0f, false);
        }
        this.pvs.lineTo((yiw2.x - f) + Mxy, yiw2.y + f2);
        if (Mxy > 0.0f) {
            float f4 = Mxy * 2.0f;
            this.icD.set(yiw2.x - f, (yiw2.y + f2) - f4, (yiw2.x - f) + f4, yiw2.y + f2);
            this.pvs.arcTo(this.icD, 90.0f, 90.0f, false);
        }
        this.pvs.lineTo(yiw2.x - f, (yiw2.y - f2) + Mxy);
        if (Mxy > 0.0f) {
            float f5 = Mxy * 2.0f;
            this.icD.set(yiw2.x - f, yiw2.y - f2, (yiw2.x - f) + f5, (yiw2.y - f2) + f5);
            this.pvs.arcTo(this.icD, 180.0f, 90.0f, false);
        }
        this.pvs.lineTo((yiw2.x + f) - Mxy, yiw2.y - f2);
        if (Mxy > 0.0f) {
            float f6 = Mxy * 2.0f;
            this.icD.set((yiw2.x + f) - f6, yiw2.y - f2, yiw2.x + f, (yiw2.y - f2) + f6);
            this.pvs.arcTo(this.icD, 270.0f, 90.0f, false);
        }
        this.pvs.close();
        this.Mxy.pvs(this.pvs);
        this.qh = true;
        return this.pvs;
    }
}
