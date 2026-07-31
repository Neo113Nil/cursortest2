package com.bytedance.adsdk.fs.zmn.zmn;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.bytedance.adsdk.fs.zmn.fs.zmn;
import com.bytedance.adsdk.fs.zn.fs.kw;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class zmn implements zmn.InterfaceC0104zmn, btk, rc {
    private com.bytedance.adsdk.fs.zmn.fs.zmn<ColorFilter, ColorFilter> cn;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> cyb;
    final Paint fs;
    private final float[] iv;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Integer> klz;
    private final List<com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float>> mw;
    private com.bytedance.adsdk.fs.zmn.fs.zn olo;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> rc;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> rt;
    private final com.bytedance.adsdk.fs.bvs zg;
    protected final com.bytedance.adsdk.fs.zn.zn.zmn zmn;
    float zn;
    private final PathMeasure fb = new PathMeasure();
    private final Path btk = new Path();
    private final Path hhw = new Path();
    private final RectF nps = new RectF();
    private final List<C0105zmn> bvs = new ArrayList();

    zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, Paint.Cap cap, Paint.Join join, float f, com.bytedance.adsdk.fs.zn.zmn.fb fbVar, com.bytedance.adsdk.fs.zn.zmn.fs fsVar, List<com.bytedance.adsdk.fs.zn.zmn.fs> list, com.bytedance.adsdk.fs.zn.zmn.fs fsVar2) {
        com.bytedance.adsdk.fs.zmn.zmn zmnVar2 = new com.bytedance.adsdk.fs.zmn.zmn(1);
        this.fs = zmnVar2;
        this.zn = 0.0f;
        this.zg = bvsVar;
        this.zmn = zmnVar;
        zmnVar2.setStyle(Paint.Style.STROKE);
        zmnVar2.setStrokeCap(cap);
        zmnVar2.setStrokeJoin(join);
        zmnVar2.setStrokeMiter(f);
        this.klz = fbVar.zmn();
        this.rc = fsVar.zmn();
        if (fsVar2 == null) {
            this.rt = null;
        } else {
            this.rt = fsVar2.zmn();
        }
        this.mw = new ArrayList(list.size());
        this.iv = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.mw.add(list.get(i).zmn());
        }
        zmnVar.zmn(this.klz);
        zmnVar.zmn(this.rc);
        for (int i2 = 0; i2 < this.mw.size(); i2++) {
            zmnVar.zmn(this.mw.get(i2));
        }
        com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> zmnVar3 = this.rt;
        if (zmnVar3 != null) {
            zmnVar.zmn(zmnVar3);
        }
        this.klz.zmn(this);
        this.rc.zmn(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.mw.get(i3).zmn(this);
        }
        com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> zmnVar4 = this.rt;
        if (zmnVar4 != null) {
            zmnVar4.zmn(this);
        }
        if (zmnVar.iv() != null) {
            com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn = zmnVar.iv().zmn().zmn();
            this.cyb = zmn;
            zmn.zmn(this);
            zmnVar.zmn(this.cyb);
        }
        if (zmnVar.rc() != null) {
            this.olo = new com.bytedance.adsdk.fs.zmn.fs.zn(this, zmnVar, zmnVar.rc());
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        this.zg.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<zn> list, List<zn> list2) {
        phc phcVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            zn znVar = list.get(size);
            if (znVar instanceof phc) {
                phc phcVar2 = (phc) znVar;
                if (phcVar2.fs() == kw.zmn.INDIVIDUALLY) {
                    phcVar = phcVar2;
                }
            }
        }
        if (phcVar != null) {
            phcVar.zmn(this);
        }
        C0105zmn c0105zmn = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            zn znVar2 = list2.get(size2);
            if (znVar2 instanceof phc) {
                phc phcVar3 = (phc) znVar2;
                if (phcVar3.fs() == kw.zmn.INDIVIDUALLY) {
                    if (c0105zmn != null) {
                        this.bvs.add(c0105zmn);
                    }
                    c0105zmn = new C0105zmn(phcVar3);
                    phcVar3.zmn(this);
                }
            }
            if (znVar2 instanceof mw) {
                if (c0105zmn == null) {
                    c0105zmn = new C0105zmn(phcVar);
                }
                c0105zmn.zmn.add((mw) znVar2);
            }
        }
        if (c0105zmn != null) {
            this.bvs.add(c0105zmn);
        }
    }

    public void zmn(Canvas canvas, Matrix matrix, int i) {
        com.bytedance.adsdk.fs.btk.zmn("StrokeContent#draw");
        if (com.bytedance.adsdk.fs.hhw.hhw.fs(matrix)) {
            com.bytedance.adsdk.fs.btk.fs("StrokeContent#draw");
            return;
        }
        this.fs.setAlpha(com.bytedance.adsdk.fs.hhw.btk.zmn((int) ((((i / 255.0f) * ((com.bytedance.adsdk.fs.zmn.fs.hhw) this.klz).bvs()) / 100.0f) * 255.0f), 0, 255));
        this.fs.setStrokeWidth(((com.bytedance.adsdk.fs.zmn.fs.fb) this.rc).bvs() * com.bytedance.adsdk.fs.hhw.hhw.zmn(matrix));
        if (this.fs.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.fs.btk.fs("StrokeContent#draw");
            return;
        }
        zmn(matrix);
        com.bytedance.adsdk.fs.zmn.fs.zmn<ColorFilter, ColorFilter> zmnVar = this.cn;
        if (zmnVar != null) {
            this.fs.setColorFilter(zmnVar.nps());
        }
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmnVar2 = this.cyb;
        if (zmnVar2 != null) {
            float floatValue = zmnVar2.nps().floatValue();
            if (floatValue == 0.0f) {
                this.fs.setMaskFilter(null);
            } else if (floatValue != this.zn) {
                this.fs.setMaskFilter(this.zmn.fs(floatValue));
            }
            this.zn = floatValue;
        }
        com.bytedance.adsdk.fs.zmn.fs.zn znVar = this.olo;
        if (znVar != null) {
            znVar.zmn(this.fs);
        }
        for (int i2 = 0; i2 < this.bvs.size(); i2++) {
            C0105zmn c0105zmn = this.bvs.get(i2);
            if (c0105zmn.fs != null) {
                zmn(canvas, c0105zmn, matrix);
            } else {
                com.bytedance.adsdk.fs.btk.zmn("StrokeContent#buildPath");
                this.btk.reset();
                for (int size = c0105zmn.zmn.size() - 1; size >= 0; size--) {
                    this.btk.addPath(((mw) c0105zmn.zmn.get(size)).fb(), matrix);
                }
                com.bytedance.adsdk.fs.btk.fs("StrokeContent#buildPath");
                com.bytedance.adsdk.fs.btk.zmn("StrokeContent#drawPath");
                canvas.drawPath(this.btk, this.fs);
                com.bytedance.adsdk.fs.btk.fs("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.fs.btk.fs("StrokeContent#draw");
    }

    private void zmn(Canvas canvas, C0105zmn c0105zmn, Matrix matrix) {
        float f;
        float f2;
        com.bytedance.adsdk.fs.btk.zmn("StrokeContent#applyTrimPath");
        if (c0105zmn.fs == null) {
            com.bytedance.adsdk.fs.btk.fs("StrokeContent#applyTrimPath");
            return;
        }
        this.btk.reset();
        for (int size = c0105zmn.zmn.size() - 1; size >= 0; size--) {
            this.btk.addPath(((mw) c0105zmn.zmn.get(size)).fb(), matrix);
        }
        float floatValue = c0105zmn.fs.zn().nps().floatValue() / 100.0f;
        float floatValue2 = c0105zmn.fs.fb().nps().floatValue() / 100.0f;
        float floatValue3 = c0105zmn.fs.btk().nps().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.btk, this.fs);
            com.bytedance.adsdk.fs.btk.fs("StrokeContent#applyTrimPath");
            return;
        }
        this.fb.setPath(this.btk, false);
        float length = this.fb.getLength();
        while (this.fb.nextContour()) {
            length += this.fb.getLength();
        }
        float f3 = floatValue3 * length;
        float f4 = (floatValue * length) + f3;
        float min = Math.min((floatValue2 * length) + f3, (f4 + length) - 1.0f);
        float f5 = 0.0f;
        for (int size2 = c0105zmn.zmn.size() - 1; size2 >= 0; size2--) {
            this.hhw.set(((mw) c0105zmn.zmn.get(size2)).fb());
            this.hhw.transform(matrix);
            this.fb.setPath(this.hhw, false);
            float length2 = this.fb.getLength();
            if (min > length) {
                float f6 = min - length;
                if (f6 < f5 + length2 && f5 < f6) {
                    f = f4 > length ? (f4 - length) / length2 : 0.0f;
                    f2 = Math.min(f6 / length2, 1.0f);
                    com.bytedance.adsdk.fs.hhw.hhw.zmn(this.hhw, f, f2, 0.0f);
                    canvas.drawPath(this.hhw, this.fs);
                    f5 += length2;
                }
            }
            float f7 = f5 + length2;
            if (f7 >= f4 && f5 <= min) {
                if (f7 <= min && f4 < f5) {
                    canvas.drawPath(this.hhw, this.fs);
                } else {
                    f = f4 < f5 ? 0.0f : (f4 - f5) / length2;
                    f2 = min > f7 ? 1.0f : (min - f5) / length2;
                    com.bytedance.adsdk.fs.hhw.hhw.zmn(this.hhw, f, f2, 0.0f);
                    canvas.drawPath(this.hhw, this.fs);
                }
            }
            f5 += length2;
        }
        com.bytedance.adsdk.fs.btk.fs("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(RectF rectF, Matrix matrix, boolean z) {
        com.bytedance.adsdk.fs.btk.zmn("StrokeContent#getBounds");
        this.btk.reset();
        for (int i = 0; i < this.bvs.size(); i++) {
            C0105zmn c0105zmn = this.bvs.get(i);
            for (int i2 = 0; i2 < c0105zmn.zmn.size(); i2++) {
                this.btk.addPath(((mw) c0105zmn.zmn.get(i2)).fb(), matrix);
            }
        }
        this.btk.computeBounds(this.nps, false);
        float bvs = ((com.bytedance.adsdk.fs.zmn.fs.fb) this.rc).bvs();
        RectF rectF2 = this.nps;
        float f = bvs / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.nps);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.fs.btk.fs("StrokeContent#getBounds");
    }

    private void zmn(Matrix matrix) {
        com.bytedance.adsdk.fs.btk.zmn("StrokeContent#applyDashPattern");
        if (this.mw.isEmpty()) {
            com.bytedance.adsdk.fs.btk.fs("StrokeContent#applyDashPattern");
            return;
        }
        float zmn = com.bytedance.adsdk.fs.hhw.hhw.zmn(matrix);
        for (int i = 0; i < this.mw.size(); i++) {
            this.iv[i] = this.mw.get(i).nps().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.iv;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.iv;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.iv;
            fArr3[i] = fArr3[i] * zmn;
        }
        com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> zmnVar = this.rt;
        this.fs.setPathEffect(new DashPathEffect(this.iv, zmnVar == null ? 0.0f : zmn * zmnVar.nps().floatValue()));
        com.bytedance.adsdk.fs.btk.fs("StrokeContent#applyDashPattern");
    }

    /* renamed from: com.bytedance.adsdk.fs.zmn.zmn.zmn$zmn, reason: collision with other inner class name */
    private static final class C0105zmn {
        private final phc fs;
        private final List<mw> zmn;

        private C0105zmn(phc phcVar) {
            this.zmn = new ArrayList();
            this.fs = phcVar;
        }
    }
}
