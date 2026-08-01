package com.bytedance.adsdk.lottie.pvs.icD;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes.dex */
public class mnm {
    private pvs<?, Float> IP;
    private final Matrix Jd;
    private pvs<?, Float> Ju;
    private pvs<Float, Float> Mxy;
    private final float[] NB;
    private pvs<Integer, Integer> Wyp;
    private final Matrix icD;
    private Jd kj;
    private final Matrix pvs = new Matrix();
    private Jd qh;
    private pvs<PointF, PointF> sUS;
    private pvs<com.bytedance.adsdk.lottie.yiw.vG, com.bytedance.adsdk.lottie.yiw.vG> so;
    private final Matrix vG;
    private pvs<?, PointF> yiw;

    public mnm(com.bytedance.adsdk.lottie.vG.pvs.kj kjVar) {
        this.sUS = kjVar.pvs() == null ? null : kjVar.pvs().pvs();
        this.yiw = kjVar.icD() == null ? null : kjVar.icD().pvs();
        this.so = kjVar.vG() == null ? null : kjVar.vG().pvs();
        this.Mxy = kjVar.Jd() == null ? null : kjVar.Jd().pvs();
        Jd jd = kjVar.so() == null ? null : (Jd) kjVar.so().pvs();
        this.qh = jd;
        if (jd != null) {
            this.icD = new Matrix();
            this.vG = new Matrix();
            this.Jd = new Matrix();
            this.NB = new float[9];
        } else {
            this.icD = null;
            this.vG = null;
            this.Jd = null;
            this.NB = null;
        }
        this.kj = kjVar.Mxy() == null ? null : (Jd) kjVar.Mxy().pvs();
        if (kjVar.NB() != null) {
            this.Wyp = kjVar.NB().pvs();
        }
        if (kjVar.sUS() != null) {
            this.Ju = kjVar.sUS().pvs();
        } else {
            this.Ju = null;
        }
        if (kjVar.yiw() != null) {
            this.IP = kjVar.yiw().pvs();
        } else {
            this.IP = null;
        }
    }

    public void pvs(com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar) {
        pvsVar.pvs(this.Wyp);
        pvsVar.pvs(this.Ju);
        pvsVar.pvs(this.IP);
        pvsVar.pvs(this.sUS);
        pvsVar.pvs(this.yiw);
        pvsVar.pvs(this.so);
        pvsVar.pvs(this.Mxy);
        pvsVar.pvs(this.qh);
        pvsVar.pvs(this.kj);
    }

    public void pvs(pvs.InterfaceC0030pvs interfaceC0030pvs) {
        pvs<Integer, Integer> pvsVar = this.Wyp;
        if (pvsVar != null) {
            pvsVar.pvs(interfaceC0030pvs);
        }
        pvs<?, Float> pvsVar2 = this.Ju;
        if (pvsVar2 != null) {
            pvsVar2.pvs(interfaceC0030pvs);
        }
        pvs<?, Float> pvsVar3 = this.IP;
        if (pvsVar3 != null) {
            pvsVar3.pvs(interfaceC0030pvs);
        }
        pvs<PointF, PointF> pvsVar4 = this.sUS;
        if (pvsVar4 != null) {
            pvsVar4.pvs(interfaceC0030pvs);
        }
        pvs<?, PointF> pvsVar5 = this.yiw;
        if (pvsVar5 != null) {
            pvsVar5.pvs(interfaceC0030pvs);
        }
        pvs<com.bytedance.adsdk.lottie.yiw.vG, com.bytedance.adsdk.lottie.yiw.vG> pvsVar6 = this.so;
        if (pvsVar6 != null) {
            pvsVar6.pvs(interfaceC0030pvs);
        }
        pvs<Float, Float> pvsVar7 = this.Mxy;
        if (pvsVar7 != null) {
            pvsVar7.pvs(interfaceC0030pvs);
        }
        Jd jd = this.qh;
        if (jd != null) {
            jd.pvs(interfaceC0030pvs);
        }
        Jd jd2 = this.kj;
        if (jd2 != null) {
            jd2.pvs(interfaceC0030pvs);
        }
    }

    public void pvs(float f) {
        pvs<Integer, Integer> pvsVar = this.Wyp;
        if (pvsVar != null) {
            pvsVar.pvs(f);
        }
        pvs<?, Float> pvsVar2 = this.Ju;
        if (pvsVar2 != null) {
            pvsVar2.pvs(f);
        }
        pvs<?, Float> pvsVar3 = this.IP;
        if (pvsVar3 != null) {
            pvsVar3.pvs(f);
        }
        pvs<PointF, PointF> pvsVar4 = this.sUS;
        if (pvsVar4 != null) {
            pvsVar4.pvs(f);
        }
        pvs<?, PointF> pvsVar5 = this.yiw;
        if (pvsVar5 != null) {
            pvsVar5.pvs(f);
        }
        pvs<com.bytedance.adsdk.lottie.yiw.vG, com.bytedance.adsdk.lottie.yiw.vG> pvsVar6 = this.so;
        if (pvsVar6 != null) {
            pvsVar6.pvs(f);
        }
        pvs<Float, Float> pvsVar7 = this.Mxy;
        if (pvsVar7 != null) {
            pvsVar7.pvs(f);
        }
        Jd jd = this.qh;
        if (jd != null) {
            jd.pvs(f);
        }
        Jd jd2 = this.kj;
        if (jd2 != null) {
            jd2.pvs(f);
        }
    }

    public pvs<?, Integer> pvs() {
        return this.Wyp;
    }

    public pvs<?, Float> icD() {
        return this.Ju;
    }

    public pvs<?, Float> vG() {
        return this.IP;
    }

    public Matrix Jd() {
        PointF yiw;
        float Mxy;
        PointF yiw2;
        this.pvs.reset();
        pvs<?, PointF> pvsVar = this.yiw;
        if (pvsVar != null && (yiw2 = pvsVar.yiw()) != null && (yiw2.x != 0.0f || yiw2.y != 0.0f)) {
            this.pvs.preTranslate(yiw2.x, yiw2.y);
        }
        pvs<Float, Float> pvsVar2 = this.Mxy;
        if (pvsVar2 != null) {
            if (pvsVar2 instanceof vA) {
                Mxy = pvsVar2.yiw().floatValue();
            } else {
                Mxy = ((Jd) pvsVar2).Mxy();
            }
            if (Mxy != 0.0f) {
                this.pvs.preRotate(Mxy);
            }
        }
        if (this.qh != null) {
            float cos = this.kj == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.Mxy()) + 90.0f));
            float sin = this.kj == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.Mxy()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r0.Mxy()));
            NB();
            float[] fArr = this.NB;
            fArr[0] = cos;
            fArr[1] = sin;
            float f = -sin;
            fArr[3] = f;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.icD.setValues(fArr);
            NB();
            float[] fArr2 = this.NB;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.vG.setValues(fArr2);
            NB();
            float[] fArr3 = this.NB;
            fArr3[0] = cos;
            fArr3[1] = f;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.Jd.setValues(fArr3);
            this.vG.preConcat(this.icD);
            this.Jd.preConcat(this.vG);
            this.pvs.preConcat(this.Jd);
        }
        pvs<com.bytedance.adsdk.lottie.yiw.vG, com.bytedance.adsdk.lottie.yiw.vG> pvsVar3 = this.so;
        if (pvsVar3 != null) {
            com.bytedance.adsdk.lottie.yiw.vG yiw3 = pvsVar3.yiw();
            if (yiw3.pvs() != 1.0f || yiw3.icD() != 1.0f) {
                this.pvs.preScale(yiw3.pvs(), yiw3.icD());
            }
        }
        pvs<PointF, PointF> pvsVar4 = this.sUS;
        if (pvsVar4 != null && (((yiw = pvsVar4.yiw()) != null && yiw.x != 0.0f) || yiw.y != 0.0f)) {
            this.pvs.preTranslate(-yiw.x, -yiw.y);
        }
        return this.pvs;
    }

    private void NB() {
        for (int i = 0; i < 9; i++) {
            this.NB[i] = 0.0f;
        }
    }

    public Matrix icD(float f) {
        pvs<?, PointF> pvsVar = this.yiw;
        PointF yiw = pvsVar == null ? null : pvsVar.yiw();
        pvs<com.bytedance.adsdk.lottie.yiw.vG, com.bytedance.adsdk.lottie.yiw.vG> pvsVar2 = this.so;
        com.bytedance.adsdk.lottie.yiw.vG yiw2 = pvsVar2 == null ? null : pvsVar2.yiw();
        this.pvs.reset();
        if (yiw != null) {
            this.pvs.preTranslate(yiw.x * f, yiw.y * f);
        }
        if (yiw2 != null) {
            double d = f;
            this.pvs.preScale((float) Math.pow(yiw2.pvs(), d), (float) Math.pow(yiw2.icD(), d));
        }
        pvs<Float, Float> pvsVar3 = this.Mxy;
        if (pvsVar3 != null) {
            float floatValue = pvsVar3.yiw().floatValue();
            pvs<PointF, PointF> pvsVar4 = this.sUS;
            PointF yiw3 = pvsVar4 != null ? pvsVar4.yiw() : null;
            this.pvs.preRotate(floatValue * f, yiw3 == null ? 0.0f : yiw3.x, yiw3 != null ? yiw3.y : 0.0f);
        }
        return this.pvs;
    }
}
