package com.bytedance.adsdk.fs.zmn.zmn;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* loaded from: classes12.dex */
public class iqz extends zmn {
    private final String btk;
    private final com.bytedance.adsdk.fs.zn.zn.zmn fb;
    private final boolean hhw;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> nps;
    private com.bytedance.adsdk.fs.zmn.fs.zmn<ColorFilter, ColorFilter> zg;

    public iqz(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.zn.fs.kgc kgcVar) {
        super(bvsVar, zmnVar, kgcVar.nps().zmn(), kgcVar.zg().zmn(), kgcVar.bvs(), kgcVar.zn(), kgcVar.fb(), kgcVar.btk(), kgcVar.hhw());
        this.fb = zmnVar;
        this.btk = kgcVar.zmn();
        this.hhw = kgcVar.iv();
        com.bytedance.adsdk.fs.zmn.fs.zmn<Integer, Integer> zmn = kgcVar.fs().zmn();
        this.nps = zmn;
        zmn.zmn(this);
        zmnVar.zmn(zmn);
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zmn, com.bytedance.adsdk.fs.zmn.zmn.btk
    public void zmn(Canvas canvas, Matrix matrix, int i) {
        if (this.hhw) {
            return;
        }
        this.fs.setColor(((com.bytedance.adsdk.fs.zmn.fs.fs) this.nps).bvs());
        com.bytedance.adsdk.fs.zmn.fs.zmn<ColorFilter, ColorFilter> zmnVar = this.zg;
        if (zmnVar != null) {
            this.fs.setColorFilter(zmnVar.nps());
        }
        super.zmn(canvas, matrix, i);
    }
}
