package com.bytedance.adsdk.fs.zmn.zmn;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes15.dex */
public class bvs extends zmn {
    private final boolean btk;
    private final com.bytedance.adsdk.fs.zn.fs.nps bvs;
    private final String fb;
    private final LongSparseArray<LinearGradient> hhw;
    private final int iv;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> klz;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> mw;
    private final LongSparseArray<RadialGradient> nps;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<com.bytedance.adsdk.fs.zn.fs.fb, com.bytedance.adsdk.fs.zn.fs.fb> rc;
    private com.bytedance.adsdk.fs.zmn.fs.olo rt;
    private final RectF zg;

    public bvs(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.zn.fs.hhw hhwVar) {
        super(bvsVar, zmnVar, hhwVar.zg().zmn(), hhwVar.bvs().zmn(), hhwVar.klz(), hhwVar.fb(), hhwVar.nps(), hhwVar.iv(), hhwVar.rc());
        this.hhw = new LongSparseArray<>();
        this.nps = new LongSparseArray<>();
        this.zg = new RectF();
        this.fb = hhwVar.zmn();
        this.bvs = hhwVar.fs();
        this.btk = hhwVar.mw();
        this.iv = (int) (bvsVar.rp().btk() / 32.0f);
        com.bytedance.adsdk.fs.zmn.fs.zmn<com.bytedance.adsdk.fs.zn.fs.fb, com.bytedance.adsdk.fs.zn.fs.fb> zmn = hhwVar.zn().zmn();
        this.rc = zmn;
        zmn.zmn(this);
        zmnVar.zmn(zmn);
        com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> zmn2 = hhwVar.btk().zmn();
        this.klz = zmn2;
        zmn2.zmn(this);
        zmnVar.zmn(zmn2);
        com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> zmn3 = hhwVar.hhw().zmn();
        this.mw = zmn3;
        zmn3.zmn(this);
        zmnVar.zmn(zmn3);
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zmn, com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(Canvas canvas, Matrix matrix, int i) {
        Shader zn;
        if (this.btk) {
            return;
        }
        zmn(this.zg, matrix, false);
        if (this.bvs == com.bytedance.adsdk.fs.zn.fs.nps.LINEAR) {
            zn = fs();
        } else {
            zn = zn();
        }
        zn.setLocalMatrix(matrix);
        this.fs.setShader(zn);
        super.zmn(canvas, matrix, i);
    }

    private LinearGradient fs() {
        long fb = fb();
        LinearGradient linearGradient = this.hhw.get(fb);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF nps = this.klz.nps();
        PointF nps2 = this.mw.nps();
        com.bytedance.adsdk.fs.zn.fs.fb nps3 = this.rc.nps();
        LinearGradient linearGradient2 = new LinearGradient(nps.x, nps.y, nps2.x, nps2.y, zmn(nps3.fs()), nps3.zmn(), Shader.TileMode.CLAMP);
        this.hhw.put(fb, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient zn() {
        long fb = fb();
        RadialGradient radialGradient = this.nps.get(fb);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF nps = this.klz.nps();
        PointF nps2 = this.mw.nps();
        com.bytedance.adsdk.fs.zn.fs.fb nps3 = this.rc.nps();
        int[] zmn = zmn(nps3.fs());
        float[] zmn2 = nps3.zmn();
        RadialGradient radialGradient2 = new RadialGradient(nps.x, nps.y, (float) Math.hypot(nps2.x - r7, nps2.y - r8), zmn, zmn2, Shader.TileMode.CLAMP);
        this.nps.put(fb, radialGradient2);
        return radialGradient2;
    }

    private int fb() {
        int round = Math.round(this.klz.zg() * this.iv);
        int round2 = Math.round(this.mw.zg() * this.iv);
        int round3 = Math.round(this.rc.zg() * this.iv);
        int i = round != 0 ? round * IronSourceError.ERROR_NON_EXISTENT_INSTANCE : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private int[] zmn(int[] iArr) {
        if (this.rt == null) {
            return iArr;
        }
        throw null;
    }
}
