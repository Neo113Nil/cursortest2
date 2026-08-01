package com.bytedance.adsdk.lottie.pvs.pvs;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.pvs.icD.pvs;
import com.bytedance.adsdk.lottie.vG.icD.zM;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseStrokeContent.java */
/* loaded from: classes.dex */
public abstract class pvs implements pvs.InterfaceC0030pvs, NB, qh {
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> IP;
    private final List<com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float>> Ju;
    private final float[] Wyp;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<ColorFilter, ColorFilter> bNS;
    final Paint icD;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Integer> kj;
    private com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> mnm;
    protected final com.bytedance.adsdk.lottie.vG.vG.pvs pvs;
    private final com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> qh;
    private final com.bytedance.adsdk.lottie.so so;
    private com.bytedance.adsdk.lottie.pvs.icD.vG vA;
    float vG;
    private final PathMeasure Jd = new PathMeasure();
    private final Path NB = new Path();
    private final Path sUS = new Path();
    private final RectF yiw = new RectF();
    private final List<C0031pvs> Mxy = new ArrayList();

    pvs(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar, Paint.Cap cap, Paint.Join join, float f, com.bytedance.adsdk.lottie.vG.pvs.Jd jd, com.bytedance.adsdk.lottie.vG.pvs.icD icd, List<com.bytedance.adsdk.lottie.vG.pvs.icD> list, com.bytedance.adsdk.lottie.vG.pvs.icD icd2) {
        com.bytedance.adsdk.lottie.pvs.pvs pvsVar2 = new com.bytedance.adsdk.lottie.pvs.pvs(1);
        this.icD = pvsVar2;
        this.vG = 0.0f;
        this.so = soVar;
        this.pvs = pvsVar;
        pvsVar2.setStyle(Paint.Style.STROKE);
        pvsVar2.setStrokeCap(cap);
        pvsVar2.setStrokeJoin(join);
        pvsVar2.setStrokeMiter(f);
        this.kj = jd.pvs();
        this.qh = icd.pvs();
        if (icd2 == null) {
            this.IP = null;
        } else {
            this.IP = icd2.pvs();
        }
        this.Ju = new ArrayList(list.size());
        this.Wyp = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.Ju.add(list.get(i).pvs());
        }
        pvsVar.pvs(this.kj);
        pvsVar.pvs(this.qh);
        for (int i2 = 0; i2 < this.Ju.size(); i2++) {
            pvsVar.pvs(this.Ju.get(i2));
        }
        com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> pvsVar3 = this.IP;
        if (pvsVar3 != null) {
            pvsVar.pvs(pvsVar3);
        }
        this.kj.pvs(this);
        this.qh.pvs(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.Ju.get(i3).pvs(this);
        }
        com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> pvsVar4 = this.IP;
        if (pvsVar4 != null) {
            pvsVar4.pvs(this);
        }
        if (pvsVar.sUS() != null) {
            com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvs = pvsVar.sUS().pvs().pvs();
            this.mnm = pvs;
            pvs.pvs(this);
            pvsVar.pvs(this.mnm);
        }
        if (pvsVar.yiw() != null) {
            this.vA = new com.bytedance.adsdk.lottie.pvs.icD.vG(this, pvsVar, pvsVar.yiw());
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs.InterfaceC0030pvs
    public void pvs() {
        this.so.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.vG
    public void pvs(List<vG> list, List<vG> list2) {
        rCZ rcz = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            vG vGVar = list.get(size);
            if (vGVar instanceof rCZ) {
                rCZ rcz2 = (rCZ) vGVar;
                if (rcz2.icD() == zM.pvs.INDIVIDUALLY) {
                    rcz = rcz2;
                }
            }
        }
        if (rcz != null) {
            rcz.pvs(this);
        }
        C0031pvs c0031pvs = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            vG vGVar2 = list2.get(size2);
            if (vGVar2 instanceof rCZ) {
                rCZ rcz3 = (rCZ) vGVar2;
                if (rcz3.icD() == zM.pvs.INDIVIDUALLY) {
                    if (c0031pvs != null) {
                        this.Mxy.add(c0031pvs);
                    }
                    c0031pvs = new C0031pvs(rcz3);
                    rcz3.pvs(this);
                }
            }
            if (vGVar2 instanceof Ju) {
                if (c0031pvs == null) {
                    c0031pvs = new C0031pvs(rcz);
                }
                c0031pvs.pvs.add((Ju) vGVar2);
            }
        }
        if (c0031pvs != null) {
            this.Mxy.add(c0031pvs);
        }
    }

    public void pvs(Canvas canvas, Matrix matrix, int i) {
        com.bytedance.adsdk.lottie.NB.pvs("StrokeContent#draw");
        if (com.bytedance.adsdk.lottie.sUS.sUS.icD(matrix)) {
            com.bytedance.adsdk.lottie.NB.icD("StrokeContent#draw");
            return;
        }
        this.icD.setAlpha(com.bytedance.adsdk.lottie.sUS.NB.pvs((int) ((((i / 255.0f) * ((com.bytedance.adsdk.lottie.pvs.icD.sUS) this.kj).Mxy()) / 100.0f) * 255.0f), 0, 255));
        this.icD.setStrokeWidth(((com.bytedance.adsdk.lottie.pvs.icD.Jd) this.qh).Mxy() * com.bytedance.adsdk.lottie.sUS.sUS.pvs(matrix));
        if (this.icD.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.lottie.NB.icD("StrokeContent#draw");
            return;
        }
        pvs(matrix);
        com.bytedance.adsdk.lottie.pvs.icD.pvs<ColorFilter, ColorFilter> pvsVar = this.bNS;
        if (pvsVar != null) {
            this.icD.setColorFilter(pvsVar.yiw());
        }
        com.bytedance.adsdk.lottie.pvs.icD.pvs<Float, Float> pvsVar2 = this.mnm;
        if (pvsVar2 != null) {
            float floatValue = pvsVar2.yiw().floatValue();
            if (floatValue == 0.0f) {
                this.icD.setMaskFilter(null);
            } else if (floatValue != this.vG) {
                this.icD.setMaskFilter(this.pvs.icD(floatValue));
            }
            this.vG = floatValue;
        }
        com.bytedance.adsdk.lottie.pvs.icD.vG vGVar = this.vA;
        if (vGVar != null) {
            vGVar.pvs(this.icD);
        }
        for (int i2 = 0; i2 < this.Mxy.size(); i2++) {
            C0031pvs c0031pvs = this.Mxy.get(i2);
            if (c0031pvs.icD != null) {
                pvs(canvas, c0031pvs, matrix);
            } else {
                com.bytedance.adsdk.lottie.NB.pvs("StrokeContent#buildPath");
                this.NB.reset();
                for (int size = c0031pvs.pvs.size() - 1; size >= 0; size--) {
                    this.NB.addPath(((Ju) c0031pvs.pvs.get(size)).Jd(), matrix);
                }
                com.bytedance.adsdk.lottie.NB.icD("StrokeContent#buildPath");
                com.bytedance.adsdk.lottie.NB.pvs("StrokeContent#drawPath");
                canvas.drawPath(this.NB, this.icD);
                com.bytedance.adsdk.lottie.NB.icD("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.lottie.NB.icD("StrokeContent#draw");
    }

    private void pvs(Canvas canvas, C0031pvs c0031pvs, Matrix matrix) {
        float f;
        float f2;
        com.bytedance.adsdk.lottie.NB.pvs("StrokeContent#applyTrimPath");
        if (c0031pvs.icD == null) {
            com.bytedance.adsdk.lottie.NB.icD("StrokeContent#applyTrimPath");
            return;
        }
        this.NB.reset();
        for (int size = c0031pvs.pvs.size() - 1; size >= 0; size--) {
            this.NB.addPath(((Ju) c0031pvs.pvs.get(size)).Jd(), matrix);
        }
        float floatValue = c0031pvs.icD.vG().yiw().floatValue() / 100.0f;
        float floatValue2 = c0031pvs.icD.Jd().yiw().floatValue() / 100.0f;
        float floatValue3 = c0031pvs.icD.NB().yiw().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.NB, this.icD);
            com.bytedance.adsdk.lottie.NB.icD("StrokeContent#applyTrimPath");
            return;
        }
        this.Jd.setPath(this.NB, false);
        float length = this.Jd.getLength();
        while (this.Jd.nextContour()) {
            length += this.Jd.getLength();
        }
        float f3 = floatValue3 * length;
        float f4 = (floatValue * length) + f3;
        float min = Math.min((floatValue2 * length) + f3, (f4 + length) - 1.0f);
        float f5 = 0.0f;
        for (int size2 = c0031pvs.pvs.size() - 1; size2 >= 0; size2--) {
            this.sUS.set(((Ju) c0031pvs.pvs.get(size2)).Jd());
            this.sUS.transform(matrix);
            this.Jd.setPath(this.sUS, false);
            float length2 = this.Jd.getLength();
            if (min > length) {
                float f6 = min - length;
                if (f6 < f5 + length2 && f5 < f6) {
                    f = f4 > length ? (f4 - length) / length2 : 0.0f;
                    f2 = Math.min(f6 / length2, 1.0f);
                    com.bytedance.adsdk.lottie.sUS.sUS.pvs(this.sUS, f, f2, 0.0f);
                    canvas.drawPath(this.sUS, this.icD);
                    f5 += length2;
                }
            }
            float f7 = f5 + length2;
            if (f7 >= f4 && f5 <= min) {
                if (f7 <= min && f4 < f5) {
                    canvas.drawPath(this.sUS, this.icD);
                } else {
                    f = f4 < f5 ? 0.0f : (f4 - f5) / length2;
                    f2 = min > f7 ? 1.0f : (min - f5) / length2;
                    com.bytedance.adsdk.lottie.sUS.sUS.pvs(this.sUS, f, f2, 0.0f);
                    canvas.drawPath(this.sUS, this.icD);
                }
            }
            f5 += length2;
        }
        com.bytedance.adsdk.lottie.NB.icD("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(RectF rectF, Matrix matrix, boolean z) {
        com.bytedance.adsdk.lottie.NB.pvs("StrokeContent#getBounds");
        this.NB.reset();
        for (int i = 0; i < this.Mxy.size(); i++) {
            C0031pvs c0031pvs = this.Mxy.get(i);
            for (int i2 = 0; i2 < c0031pvs.pvs.size(); i2++) {
                this.NB.addPath(((Ju) c0031pvs.pvs.get(i2)).Jd(), matrix);
            }
        }
        this.NB.computeBounds(this.yiw, false);
        float Mxy = ((com.bytedance.adsdk.lottie.pvs.icD.Jd) this.qh).Mxy();
        RectF rectF2 = this.yiw;
        float f = Mxy / 2.0f;
        rectF2.set(rectF2.left - f, this.yiw.top - f, this.yiw.right + f, this.yiw.bottom + f);
        rectF.set(this.yiw);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.lottie.NB.icD("StrokeContent#getBounds");
    }

    private void pvs(Matrix matrix) {
        com.bytedance.adsdk.lottie.NB.pvs("StrokeContent#applyDashPattern");
        if (this.Ju.isEmpty()) {
            com.bytedance.adsdk.lottie.NB.icD("StrokeContent#applyDashPattern");
            return;
        }
        float pvs = com.bytedance.adsdk.lottie.sUS.sUS.pvs(matrix);
        for (int i = 0; i < this.Ju.size(); i++) {
            this.Wyp[i] = this.Ju.get(i).yiw().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.Wyp;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.Wyp;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.Wyp;
            fArr3[i] = fArr3[i] * pvs;
        }
        com.bytedance.adsdk.lottie.pvs.icD.pvs<?, Float> pvsVar = this.IP;
        this.icD.setPathEffect(new DashPathEffect(this.Wyp, pvsVar == null ? 0.0f : pvs * pvsVar.yiw().floatValue()));
        com.bytedance.adsdk.lottie.NB.icD("StrokeContent#applyDashPattern");
    }

    /* compiled from: BaseStrokeContent.java */
    /* renamed from: com.bytedance.adsdk.lottie.pvs.pvs.pvs$pvs, reason: collision with other inner class name */
    private static final class C0031pvs {
        private final rCZ icD;
        private final List<Ju> pvs;

        private C0031pvs(rCZ rcz) {
            this.pvs = new ArrayList();
            this.icD = rcz;
        }
    }
}
