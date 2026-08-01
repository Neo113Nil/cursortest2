package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientFillContent.java */
/* loaded from: classes.dex */
public class so implements pvs.InterfaceC0030pvs, NB, qh {
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> IP;
    private final com.bytedance.adsdk.lottie.vG.vG.pvs Jd;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> Ju;
    private final RectF Mxy;
    private final List<Ju> Wyp;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> bNS;
    private final com.bytedance.adsdk.lottie.so cR;
    private final String icD;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<com.bytedance.adsdk.lottie.vG.icD.Jd, com.bytedance.adsdk.lottie.vG.icD.Jd> kj;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<ColorFilter, ColorFilter> mnm;
    float pvs;
    private final com.bytedance.adsdk.lottie.vG.icD.yiw qh;
    private com.bytedance.adsdk.lottie.pvs.icD.vG rCZ;
    private final Paint so;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> uc;
    private com.bytedance.adsdk.lottie.pvs.icD.vA vA;
    private final boolean vG;
    private final Path yiw;
    private final int zM;
    private final LongSparseArray<LinearGradient> NB = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> sUS = new LongSparseArray<>();

    public so(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.vG.icD.NB nb) {
        Path path = new Path();
        this.yiw = path;
        this.so = new com.bytedance.adsdk.lottie.pvs.pvs(1);
        this.Mxy = new RectF();
        this.Wyp = new ArrayList();
        this.pvs = 0.0f;
        this.Jd = pvsVar;
        this.icD = nb.pvs();
        this.vG = nb.so();
        this.cR = soVar;
        this.qh = nb.icD();
        path.setFillType(nb.vG());
        this.zM = (int) (sus.NB() / 32.0f);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<com.bytedance.adsdk.lottie.vG.icD.Jd, com.bytedance.adsdk.lottie.vG.icD.Jd> pvs = nb.Jd().pvs();
        this.kj = pvs;
        pvs.pvs(this);
        pvsVar.pvs(pvs);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Integer, Integer> pvs2 = nb.NB().pvs();
        this.Ju = pvs2;
        pvs2.pvs(this);
        pvsVar.pvs(pvs2);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> pvs3 = nb.sUS().pvs();
        this.IP = pvs3;
        pvs3.pvs(this);
        pvsVar.pvs(pvs3);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> pvs4 = nb.yiw().pvs();
        this.bNS = pvs4;
        pvs4.pvs(this);
        pvsVar.pvs(pvs4);
        if (pvsVar.sUS() != null) {
            com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs5 = pvsVar.sUS().pvs().pvs();
            this.uc = pvs5;
            pvs5.pvs(this);
            pvsVar.pvs(this.uc);
        }
        if (pvsVar.yiw() != null) {
            this.rCZ = new com.bytedance.adsdk.lottie.pvs.icD.vG(this, pvsVar, pvsVar.yiw());
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        this.cR.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<vG> list, List<vG> list2) {
        for (int i = 0; i < list2.size(); i++) {
            vG vGVar = list2.get(i);
            if (vGVar instanceof Ju) {
                this.Wyp.add((Ju) vGVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(Canvas canvas, Matrix matrix, int i) {
        Shader vG;
        if (this.vG) {
            return;
        }
        com.bytedance.adsdk.lottie.NB.pvs("GradientFillContent#draw");
        this.yiw.reset();
        for (int i2 = 0; i2 < this.Wyp.size(); i2++) {
            this.yiw.addPath(this.Wyp.get(i2).Jd(), matrix);
        }
        this.yiw.computeBounds(this.Mxy, false);
        if (this.qh == com.bytedance.adsdk.lottie.vG.icD.yiw.LINEAR) {
            vG = icD();
        } else {
            vG = vG();
        }
        vG.setLocalMatrix(matrix);
        this.so.setShader(vG);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<ColorFilter, ColorFilter> pvsVar = this.mnm;
        if (pvsVar != null) {
            this.so.setColorFilter(pvsVar.yiw());
        }
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvsVar2 = this.uc;
        if (pvsVar2 != null) {
            float floatValue = pvsVar2.yiw().floatValue();
            if (floatValue == 0.0f) {
                this.so.setMaskFilter(null);
            } else if (floatValue != this.pvs) {
                this.so.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.pvs = floatValue;
        }
        com.bytedance.adsdk.lottie.pvs.icD.vG vGVar = this.rCZ;
        if (vGVar != null) {
            vGVar.pvs(this.so);
        }
        this.so.setAlpha(com.bytedance.adsdk.lottie.sUS.NB.pvs((int) ((((i / 255.0f) * this.Ju.yiw().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.yiw, this.so);
        com.bytedance.adsdk.lottie.NB.icD("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(RectF rectF, Matrix matrix, boolean z) {
        this.yiw.reset();
        for (int i = 0; i < this.Wyp.size(); i++) {
            this.yiw.addPath(this.Wyp.get(i).Jd(), matrix);
        }
        this.yiw.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private LinearGradient icD() {
        long Jd = Jd();
        LinearGradient linearGradient = this.NB.get(Jd);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF yiw = this.IP.yiw();
        PointF yiw2 = this.bNS.yiw();
        com.bytedance.adsdk.lottie.vG.icD.Jd yiw3 = this.kj.yiw();
        LinearGradient linearGradient2 = new LinearGradient(yiw.x, yiw.y, yiw2.x, yiw2.y, pvs(yiw3.icD()), yiw3.pvs(), Shader.TileMode.CLAMP);
        this.NB.put(Jd, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient vG() {
        long Jd = Jd();
        RadialGradient radialGradient = this.sUS.get(Jd);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF yiw = this.IP.yiw();
        PointF yiw2 = this.bNS.yiw();
        com.bytedance.adsdk.lottie.vG.icD.Jd yiw3 = this.kj.yiw();
        int[] pvs = pvs(yiw3.icD());
        float[] pvs2 = yiw3.pvs();
        float f = yiw.x;
        float f2 = yiw.y;
        float hypot = (float) Math.hypot(yiw2.x - f, yiw2.y - f2);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot, pvs, pvs2, Shader.TileMode.CLAMP);
        this.sUS.put(Jd, radialGradient2);
        return radialGradient2;
    }

    private int Jd() {
        int round = Math.round(this.IP.so() * this.zM);
        int round2 = Math.round(this.bNS.so() * this.zM);
        int round3 = Math.round(this.kj.so() * this.zM);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private int[] pvs(int[] iArr) {
        if (this.vA == null) {
            return iArr;
        }
        throw null;
    }
}
