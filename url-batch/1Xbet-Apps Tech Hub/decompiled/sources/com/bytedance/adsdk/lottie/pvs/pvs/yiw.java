package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FillContent.java */
/* loaded from: classes.dex */
public class yiw implements pvs.InterfaceC0030pvs, NB, qh {
    private final com.bytedance.adsdk.lottie.vG.vG.pvs Jd;
    private com.bytedance.adsdk.lottie.pvs.icD.vG Ju;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> Mxy;
    private final String NB;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<ColorFilter, ColorFilter> Wyp;
    private final Path icD;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> kj;
    float pvs;
    private final com.bytedance.adsdk.lottie.so qh;
    private final boolean sUS;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> so;
    private final Paint vG;
    private final List<Ju> yiw;

    public yiw(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.vG.icD.bNS bns) {
        Path path = new Path();
        this.icD = path;
        this.vG = new com.bytedance.adsdk.lottie.pvs.pvs(1);
        this.yiw = new ArrayList();
        this.Jd = pvsVar;
        this.NB = bns.pvs();
        this.sUS = bns.NB();
        this.qh = soVar;
        if (pvsVar.sUS() != null) {
            com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs = pvsVar.sUS().pvs().pvs();
            this.kj = pvs;
            pvs.pvs(this);
            pvsVar.pvs(this.kj);
        }
        if (pvsVar.yiw() != null) {
            this.Ju = new com.bytedance.adsdk.lottie.pvs.icD.vG(this, pvsVar, pvsVar.yiw());
        }
        if (bns.icD() == null || bns.vG() == null) {
            this.so = null;
            this.Mxy = null;
            return;
        }
        path.setFillType(bns.Jd());
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvs2 = bns.icD().pvs();
        this.so = pvs2;
        pvs2.pvs(this);
        pvsVar.pvs(pvs2);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvs3 = bns.vG().pvs();
        this.Mxy = pvs3;
        pvs3.pvs(this);
        pvsVar.pvs(pvs3);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        this.qh.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<vG> list, List<vG> list2) {
        for (int i = 0; i < list2.size(); i++) {
            vG vGVar = list2.get(i);
            if (vGVar instanceof Ju) {
                this.yiw.add((Ju) vGVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(Canvas canvas, Matrix matrix, int i) {
        if (this.sUS) {
            return;
        }
        com.bytedance.adsdk.lottie.NB.pvs("FillContent#draw");
        this.vG.setColor((com.bytedance.adsdk.lottie.sUS.NB.pvs((int) ((((i / 255.0f) * this.Mxy.yiw().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.lottie.pvs.icD.icD) this.so).Mxy() & ViewCompat.MEASURED_SIZE_MASK));
        com.bytedance.adsdk.lottie.pvs.icD.pvs<ColorFilter, ColorFilter> pvsVar = this.Wyp;
        if (pvsVar != null) {
            this.vG.setColorFilter(pvsVar.yiw());
        }
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvsVar2 = this.kj;
        if (pvsVar2 != null) {
            float floatValue = pvsVar2.yiw().floatValue();
            if (floatValue == 0.0f) {
                this.vG.setMaskFilter(null);
            } else if (floatValue != this.pvs) {
                this.vG.setMaskFilter(this.Jd.icD(floatValue));
            }
            this.pvs = floatValue;
        }
        com.bytedance.adsdk.lottie.pvs.icD.vG vGVar = this.Ju;
        if (vGVar != null) {
            vGVar.pvs(this.vG);
        }
        this.icD.reset();
        for (int i2 = 0; i2 < this.yiw.size(); i2++) {
            this.icD.addPath(this.yiw.get(i2).Jd(), matrix);
        }
        canvas.drawPath(this.icD, this.vG);
        com.bytedance.adsdk.lottie.NB.icD("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(RectF rectF, Matrix matrix, boolean z) {
        this.icD.reset();
        for (int i = 0; i < this.yiw.size(); i++) {
            this.icD.addPath(this.yiw.get(i).Jd(), matrix);
        }
        this.icD.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
