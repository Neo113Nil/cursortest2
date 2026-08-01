package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;
import com.bytedance.adsdk.lottie.vG.icD.zM;
import java.util.List;

/* compiled from: EllipseContent.java */
/* loaded from: classes.dex */
public class sUS implements pvs.InterfaceC0030pvs, Ju, qh {
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, PointF> Jd;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, PointF> NB;
    private final String icD;
    private final com.bytedance.adsdk.lottie.vG.icD.icD sUS;
    private boolean so;
    private final com.bytedance.adsdk.lottie.so vG;
    private final Path pvs = new Path();
    private final icD yiw = new icD();

    public sUS(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.vG.icD.icD icd) {
        this.icD = icd.pvs();
        this.vG = soVar;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> pvs = icd.vG().pvs();
        this.Jd = pvs;
        com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> pvs2 = icd.icD().pvs();
        this.NB = pvs2;
        this.sUS = icd;
        pvsVar.pvs(pvs);
        pvsVar.pvs(pvs2);
        pvs.pvs(this);
        pvs2.pvs(this);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        icD();
    }

    private void icD() {
        this.so = false;
        this.vG.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<vG> list, List<vG> list2) {
        for (int i = 0; i < list.size(); i++) {
            vG vGVar = list.get(i);
            if (vGVar instanceof rCZ) {
                rCZ rcz = (rCZ) vGVar;
                if (rcz.icD() == zM.pvs.SIMULTANEOUSLY) {
                    this.yiw.pvs(rcz);
                    rcz.pvs(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.Ju
    public Path Jd() {
        if (this.so) {
            return this.pvs;
        }
        this.pvs.reset();
        if (this.sUS.NB()) {
            this.so = true;
            return this.pvs;
        }
        PointF yiw = this.Jd.yiw();
        float f = yiw.x / 2.0f;
        float f2 = yiw.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.pvs.reset();
        if (this.sUS.Jd()) {
            float f5 = -f2;
            this.pvs.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.pvs.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.pvs.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.pvs.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.pvs.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.pvs.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.pvs.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.pvs.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.pvs.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.pvs.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF yiw2 = this.NB.yiw();
        this.pvs.offset(yiw2.x, yiw2.y);
        this.pvs.close();
        this.yiw.pvs(this.pvs);
        this.so = true;
        return this.pvs;
    }
}
