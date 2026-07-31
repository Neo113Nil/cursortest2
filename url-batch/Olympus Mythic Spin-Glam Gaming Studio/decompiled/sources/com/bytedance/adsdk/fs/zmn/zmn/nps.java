package com.bytedance.adsdk.fs.zmn.zmn;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.fs.zmn.fs.zmn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class nps implements zmn.InterfaceC0104zmn, btk, rc {
    private final String btk;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> bvs;
    private final com.bytedance.adsdk.fs.zn.zn.zmn fb;
    private final Path fs;
    private final boolean hhw;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<ColorFilter, ColorFilter> iv;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> klz;
    private com.bytedance.adsdk.fs.zmn.fs.zn mw;
    private final List<mw> nps;
    private final com.bytedance.adsdk.fs.bvs rc;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zg;
    float zmn;
    private final Paint zn;

    public nps(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.zn.fs.cn cnVar) {
        Path path = new Path();
        this.fs = path;
        this.zn = new com.bytedance.adsdk.fs.zmn.zmn(1);
        this.nps = new ArrayList();
        this.fb = zmnVar;
        this.btk = cnVar.zmn();
        this.hhw = cnVar.btk();
        this.rc = bvsVar;
        if (zmnVar.iv() != null) {
            com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn = zmnVar.iv().zmn().zmn();
            this.klz = zmn;
            zmn.zmn(this);
            zmnVar.zmn(this.klz);
        }
        if (zmnVar.rc() != null) {
            this.mw = new com.bytedance.adsdk.fs.zmn.fs.zn(this, zmnVar, zmnVar.rc());
        }
        if (cnVar.fs() == null || cnVar.zn() == null) {
            this.zg = null;
            this.bvs = null;
            return;
        }
        path.setFillType(cnVar.fb());
        com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmn2 = cnVar.fs().zmn();
        this.zg = zmn2;
        zmn2.zmn(this);
        zmnVar.zmn(zmn2);
        com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmn3 = cnVar.zn().zmn();
        this.bvs = zmn3;
        zmn3.zmn(this);
        zmnVar.zmn(zmn3);
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        this.rc.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<zn> list, List<zn> list2) {
        for (int i = 0; i < list2.size(); i++) {
            zn znVar = list2.get(i);
            if (znVar instanceof mw) {
                this.nps.add((mw) znVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(Canvas canvas, Matrix matrix, int i) {
        if (this.hhw) {
            return;
        }
        com.bytedance.adsdk.fs.btk.zmn("FillContent#draw");
        this.zn.setColor((com.bytedance.adsdk.fs.hhw.btk.zmn((int) ((((i / 255.0f) * this.bvs.nps().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.fs.zmn.fs.fs) this.zg).bvs() & 16777215));
        com.bytedance.adsdk.fs.zmn.fs.zmn<ColorFilter, ColorFilter> zmnVar = this.iv;
        if (zmnVar != null) {
            this.zn.setColorFilter(zmnVar.nps());
        }
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmnVar2 = this.klz;
        if (zmnVar2 != null) {
            float floatValue = zmnVar2.nps().floatValue();
            if (floatValue == 0.0f) {
                this.zn.setMaskFilter(null);
            } else if (floatValue != this.zmn) {
                this.zn.setMaskFilter(this.fb.fs(floatValue));
            }
            this.zmn = floatValue;
        }
        com.bytedance.adsdk.fs.zmn.fs.zn znVar = this.mw;
        if (znVar != null) {
            znVar.zmn(this.zn);
        }
        this.fs.reset();
        for (int i2 = 0; i2 < this.nps.size(); i2++) {
            this.fs.addPath(this.nps.get(i2).fb(), matrix);
        }
        canvas.drawPath(this.fs, this.zn);
        com.bytedance.adsdk.fs.btk.fs("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(RectF rectF, Matrix matrix, boolean z) {
        this.fs.reset();
        for (int i = 0; i < this.nps.size(); i++) {
            this.fs.addPath(this.nps.get(i).fb(), matrix);
        }
        this.fs.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
