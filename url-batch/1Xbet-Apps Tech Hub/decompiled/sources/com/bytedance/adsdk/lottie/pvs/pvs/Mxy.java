package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;

/* compiled from: GradientStrokeContent.java */
/* loaded from: classes.dex */
public class Mxy extends pvs {
    private com.bytedance.adsdk.lottie.pvs.icD.vA IP;
    private final String Jd;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> Ju;
    private final com.bytedance.adsdk.lottie.vG.icD.yiw Mxy;
    private final boolean NB;
    private final int Wyp;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> kj;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<com.bytedance.adsdk.lottie.vG.icD.Jd, com.bytedance.adsdk.lottie.vG.icD.Jd> qh;
    private final LongSparseArray<LinearGradient> sUS;
    private final RectF so;
    private final LongSparseArray<RadialGradient> yiw;

    public Mxy(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, com.bytedance.adsdk.lottie.vG.icD.sUS sus) {
        super(soVar, pvsVar, sus.so().pvs(), sus.Mxy().pvs(), sus.kj(), sus.Jd(), sus.yiw(), sus.Wyp(), sus.qh());
        this.sUS = new LongSparseArray<>();
        this.yiw = new LongSparseArray<>();
        this.so = new RectF();
        this.Jd = sus.pvs();
        this.Mxy = sus.icD();
        this.NB = sus.Ju();
        this.Wyp = (int) (soVar.OT().NB() / 32.0f);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<com.bytedance.adsdk.lottie.vG.icD.Jd, com.bytedance.adsdk.lottie.vG.icD.Jd> pvs = sus.vG().pvs();
        this.qh = pvs;
        pvs.pvs(this);
        pvsVar.pvs(pvs);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> pvs2 = sus.NB().pvs();
        this.kj = pvs2;
        pvs2.pvs(this);
        pvsVar.pvs(pvs2);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> pvs3 = sus.sUS().pvs();
        this.Ju = pvs3;
        pvs3.pvs(this);
        pvsVar.pvs(pvs3);
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.pvs, com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(Canvas canvas, Matrix matrix, int i) {
        Shader vG;
        if (this.NB) {
            return;
        }
        pvs(this.so, matrix, false);
        if (this.Mxy == com.bytedance.adsdk.lottie.vG.icD.yiw.LINEAR) {
            vG = icD();
        } else {
            vG = vG();
        }
        vG.setLocalMatrix(matrix);
        this.icD.setShader(vG);
        super.pvs(canvas, matrix, i);
    }

    private LinearGradient icD() {
        long Jd = Jd();
        LinearGradient linearGradient = this.sUS.get(Jd);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF yiw = this.kj.yiw();
        PointF yiw2 = this.Ju.yiw();
        com.bytedance.adsdk.lottie.vG.icD.Jd yiw3 = this.qh.yiw();
        LinearGradient linearGradient2 = new LinearGradient(yiw.x, yiw.y, yiw2.x, yiw2.y, pvs(yiw3.icD()), yiw3.pvs(), Shader.TileMode.CLAMP);
        this.sUS.put(Jd, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient vG() {
        long Jd = Jd();
        RadialGradient radialGradient = this.yiw.get(Jd);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF yiw = this.kj.yiw();
        PointF yiw2 = this.Ju.yiw();
        com.bytedance.adsdk.lottie.vG.icD.Jd yiw3 = this.qh.yiw();
        int[] pvs = pvs(yiw3.icD());
        float[] pvs2 = yiw3.pvs();
        RadialGradient radialGradient2 = new RadialGradient(yiw.x, yiw.y, (float) Math.hypot(yiw2.x - r7, yiw2.y - r8), pvs, pvs2, Shader.TileMode.CLAMP);
        this.yiw.put(Jd, radialGradient2);
        return radialGradient2;
    }

    private int Jd() {
        int round = Math.round(this.kj.so() * this.Wyp);
        int round2 = Math.round(this.Ju.so() * this.Wyp);
        int round3 = Math.round(this.qh.so() * this.Wyp);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private int[] pvs(int[] iArr) {
        if (this.IP == null) {
            return iArr;
        }
        throw null;
    }
}
