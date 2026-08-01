package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: StrokeContent.java */
/* loaded from: classes.dex */
public class uc extends pvs {
    private final com.bytedance.adsdk.lottie.vG.vG.pvs Jd;
    private final String NB;
    private final boolean sUS;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<ColorFilter, ColorFilter> so;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> yiw;

    public uc(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.vG.icD.cR cRVar) {
        super(soVar, pvsVar, cRVar.yiw().pvs(), cRVar.so().pvs(), cRVar.Mxy(), cRVar.vG(), cRVar.Jd(), cRVar.NB(), cRVar.sUS());
        this.Jd = pvsVar;
        this.NB = cRVar.pvs();
        this.sUS = cRVar.Wyp();
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvs = cRVar.icD().pvs();
        this.yiw = pvs;
        pvs.pvs(this);
        pvsVar.pvs(pvs);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.pvs, com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(Canvas canvas, Matrix matrix, int i) {
        if (this.sUS) {
            return;
        }
        this.icD.setColor(((com.bytedance.adsdk.lottie.pvs.icD.icD) this.yiw).Mxy());
        if (this.so != null) {
            this.icD.setColorFilter(this.so.yiw());
        }
        super.pvs(canvas, matrix, i);
    }
}
