package com.bytedance.adsdk.fs.zmn.fs;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes4.dex */
public class bvs extends com.bytedance.adsdk.fs.nps.zmn<PointF> {
    private Path iv;
    private final com.bytedance.adsdk.fs.nps.zmn<PointF> rc;

    public bvs(com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.nps.zmn<PointF> zmnVar) {
        super(npsVar, zmnVar.zmn, zmnVar.fs, zmnVar.zn, zmnVar.fb, zmnVar.btk, zmnVar.hhw, zmnVar.nps);
        this.rc = zmnVar;
        zmn();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void zmn() {
        T t;
        T t2;
        T t3 = this.fs;
        boolean z = (t3 == 0 || (t2 = this.zmn) == 0 || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) ? false : true;
        T t4 = this.zmn;
        if (t4 == 0 || (t = this.fs) == 0 || z) {
            return;
        }
        com.bytedance.adsdk.fs.nps.zmn<PointF> zmnVar = this.rc;
        this.iv = com.bytedance.adsdk.fs.hhw.hhw.zmn((PointF) t4, (PointF) t, zmnVar.zg, zmnVar.bvs);
    }

    Path fs() {
        return this.iv;
    }
}
