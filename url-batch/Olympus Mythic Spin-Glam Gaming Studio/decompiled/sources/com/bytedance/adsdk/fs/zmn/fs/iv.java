package com.bytedance.adsdk.fs.zmn.fs;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes5.dex */
public class iv extends nps<PointF> {
    private final float[] btk;
    private final PointF fb;
    private final PathMeasure hhw;
    private bvs nps;

    public iv(List<? extends com.bytedance.adsdk.fs.nps.zmn<PointF>> list) {
        super(list);
        this.fb = new PointF();
        this.btk = new float[2];
        this.hhw = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public PointF zmn(com.bytedance.adsdk.fs.nps.zmn<PointF> zmnVar, float f) {
        bvs bvsVar = (bvs) zmnVar;
        Path fs = bvsVar.fs();
        if (fs == null) {
            return zmnVar.zmn;
        }
        if (this.zn != null) {
            bvsVar.nps.floatValue();
            fb();
            zg();
            throw null;
        }
        if (this.nps != bvsVar) {
            this.hhw.setPath(fs, false);
            this.nps = bvsVar;
        }
        PathMeasure pathMeasure = this.hhw;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.btk, null);
        PointF pointF = this.fb;
        float[] fArr = this.btk;
        pointF.set(fArr[0], fArr[1]);
        return this.fb;
    }
}
