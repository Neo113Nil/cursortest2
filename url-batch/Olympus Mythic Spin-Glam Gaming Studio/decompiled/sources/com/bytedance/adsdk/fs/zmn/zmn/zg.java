package com.bytedance.adsdk.fs.zmn.zmn;

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
import com.bytedance.adsdk.fs.zmn.fs.zmn;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class zg implements zmn.InterfaceC0104zmn, btk, rc {
    private final RectF bvs;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> cn;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<ColorFilter, ColorFilter> cyb;
    private final com.bytedance.adsdk.fs.zn.zn.zmn fb;
    private final String fs;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> iqz;
    private final List<mw> iv;
    private final com.bytedance.adsdk.fs.bvs kgc;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<com.bytedance.adsdk.fs.zn.fs.fb, com.bytedance.adsdk.fs.zn.fs.fb> klz;
    private final int kw;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> mw;
    private final Path nps;
    private com.bytedance.adsdk.fs.zmn.fs.olo olo;
    private com.bytedance.adsdk.fs.zmn.fs.zn phc;
    private final com.bytedance.adsdk.fs.zn.fs.nps rc;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> rt;
    private final Paint zg;
    float zmn;
    private final boolean zn;
    private final LongSparseArray<LinearGradient> btk = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> hhw = new LongSparseArray<>();

    public zg(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.zn.fs.btk btkVar) {
        Path path = new Path();
        this.nps = path;
        this.zg = new com.bytedance.adsdk.fs.zmn.zmn(1);
        this.bvs = new RectF();
        this.iv = new ArrayList();
        this.zmn = 0.0f;
        this.fb = zmnVar;
        this.fs = btkVar.zmn();
        this.zn = btkVar.zg();
        this.kgc = bvsVar;
        this.rc = btkVar.fs();
        path.setFillType(btkVar.zn());
        this.kw = (int) (npsVar.btk() / 32.0f);
        com.bytedance.adsdk.fs.zmn.fs.zmn<com.bytedance.adsdk.fs.zn.fs.fb, com.bytedance.adsdk.fs.zn.fs.fb> zmn = btkVar.fb().zmn();
        this.klz = zmn;
        zmn.zmn(this);
        zmnVar.zmn(zmn);
        com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmn2 = btkVar.btk().zmn();
        this.mw = zmn2;
        zmn2.zmn(this);
        zmnVar.zmn(zmn2);
        com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> zmn3 = btkVar.hhw().zmn();
        this.rt = zmn3;
        zmn3.zmn(this);
        zmnVar.zmn(zmn3);
        com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> zmn4 = btkVar.nps().zmn();
        this.cn = zmn4;
        zmn4.zmn(this);
        zmnVar.zmn(zmn4);
        if (zmnVar.iv() != null) {
            com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn5 = zmnVar.iv().zmn().zmn();
            this.iqz = zmn5;
            zmn5.zmn(this);
            zmnVar.zmn(this.iqz);
        }
        if (zmnVar.rc() != null) {
            this.phc = new com.bytedance.adsdk.fs.zmn.fs.zn(this, zmnVar, zmnVar.rc());
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        this.kgc.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<zn> list, List<zn> list2) {
        for (int i = 0; i < list2.size(); i++) {
            zn znVar = list2.get(i);
            if (znVar instanceof mw) {
                this.iv.add((mw) znVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(Canvas canvas, Matrix matrix, int i) {
        Shader zn;
        if (this.zn) {
            return;
        }
        com.bytedance.adsdk.fs.btk.zmn("GradientFillContent#draw");
        this.nps.reset();
        for (int i2 = 0; i2 < this.iv.size(); i2++) {
            this.nps.addPath(this.iv.get(i2).fb(), matrix);
        }
        this.nps.computeBounds(this.bvs, false);
        if (this.rc == com.bytedance.adsdk.fs.zn.fs.nps.LINEAR) {
            zn = fs();
        } else {
            zn = zn();
        }
        zn.setLocalMatrix(matrix);
        this.zg.setShader(zn);
        com.bytedance.adsdk.fs.zmn.fs.zmn<ColorFilter, ColorFilter> zmnVar = this.cyb;
        if (zmnVar != null) {
            this.zg.setColorFilter(zmnVar.nps());
        }
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmnVar2 = this.iqz;
        if (zmnVar2 != null) {
            float floatValue = zmnVar2.nps().floatValue();
            if (floatValue == 0.0f) {
                this.zg.setMaskFilter(null);
            } else if (floatValue != this.zmn) {
                this.zg.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.zmn = floatValue;
        }
        com.bytedance.adsdk.fs.zmn.fs.zn znVar = this.phc;
        if (znVar != null) {
            znVar.zmn(this.zg);
        }
        this.zg.setAlpha(com.bytedance.adsdk.fs.hhw.btk.zmn((int) ((((i / 255.0f) * this.mw.nps().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.nps, this.zg);
        com.bytedance.adsdk.fs.btk.fs("GradientFillContent#draw");
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(RectF rectF, Matrix matrix, boolean z) {
        this.nps.reset();
        for (int i = 0; i < this.iv.size(); i++) {
            this.nps.addPath(this.iv.get(i).fb(), matrix);
        }
        this.nps.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    private LinearGradient fs() {
        long fb = fb();
        LinearGradient linearGradient = this.btk.get(fb);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF nps = this.rt.nps();
        PointF nps2 = this.cn.nps();
        com.bytedance.adsdk.fs.zn.fs.fb nps3 = this.klz.nps();
        LinearGradient linearGradient2 = new LinearGradient(nps.x, nps.y, nps2.x, nps2.y, zmn(nps3.fs()), nps3.zmn(), Shader.TileMode.CLAMP);
        this.btk.put(fb, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient zn() {
        long fb = fb();
        RadialGradient radialGradient = this.hhw.get(fb);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF nps = this.rt.nps();
        PointF nps2 = this.cn.nps();
        com.bytedance.adsdk.fs.zn.fs.fb nps3 = this.klz.nps();
        int[] zmn = zmn(nps3.fs());
        float[] zmn2 = nps3.zmn();
        float f = nps.x;
        float f2 = nps.y;
        float hypot = (float) Math.hypot(nps2.x - f, nps2.y - f2);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f, f2, hypot, zmn, zmn2, Shader.TileMode.CLAMP);
        this.hhw.put(fb, radialGradient2);
        return radialGradient2;
    }

    private int fb() {
        int round = Math.round(this.rt.zg() * this.kw);
        int round2 = Math.round(this.cn.zg() * this.kw);
        int round3 = Math.round(this.klz.zg() * this.kw);
        int i = round != 0 ? round * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private int[] zmn(int[] iArr) {
        if (this.olo == null) {
            return iArr;
        }
        throw null;
    }
}
