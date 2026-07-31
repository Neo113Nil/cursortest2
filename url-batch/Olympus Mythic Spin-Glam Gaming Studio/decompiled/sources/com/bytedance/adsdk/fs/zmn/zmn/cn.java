package com.bytedance.adsdk.fs.zmn.zmn;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.fs.zmn.fs.zmn;
import com.bytedance.adsdk.fs.zn.fs.kw;
import java.util.List;

/* loaded from: classes3.dex */
public class cn implements zmn.InterfaceC0104zmn, mw, rc {
    private final com.bytedance.adsdk.fs.bvs btk;
    private final boolean fb;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, PointF> hhw;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, PointF> nps;
    private boolean rc;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> zg;
    private final String zn;
    private final Path zmn = new Path();
    private final RectF fs = new RectF();
    private final fs bvs = new fs();
    private com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> iv = null;

    public cn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.zn.fs.rc rcVar) {
        this.zn = rcVar.zmn();
        this.fb = rcVar.btk();
        this.btk = bvsVar;
        com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> zmn = rcVar.fb().zmn();
        this.hhw = zmn;
        com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> zmn2 = rcVar.zn().zmn();
        this.nps = zmn2;
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmn3 = rcVar.fs().zmn();
        this.zg = zmn3;
        zmnVar.zmn(zmn);
        zmnVar.zmn(zmn2);
        zmnVar.zmn(zmn3);
        zmn.zmn(this);
        zmn2.zmn(this);
        zmn3.zmn(this);
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        fs();
    }

    private void fs() {
        this.rc = false;
        this.btk.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<zn> list, List<zn> list2) {
        for (int i = 0; i < list.size(); i++) {
            zn znVar = list.get(i);
            if (znVar instanceof phc) {
                phc phcVar = (phc) znVar;
                if (phcVar.fs() == kw.zmn.SIMULTANEOUSLY) {
                    this.bvs.zmn(phcVar);
                    phcVar.zmn(this);
                }
            }
            if (znVar instanceof olo) {
                this.iv = ((olo) znVar).fs();
            }
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.mw
    public Path fb() {
        com.bytedance.adsdk.fs.zmn.fs.zmn<Float, Float> zmnVar;
        if (this.rc) {
            return this.zmn;
        }
        this.zmn.reset();
        if (this.fb) {
            this.rc = true;
            return this.zmn;
        }
        PointF nps = this.nps.nps();
        float f = nps.x / 2.0f;
        float f2 = nps.y / 2.0f;
        com.bytedance.adsdk.fs.zmn.fs.zmn<?, Float> zmnVar2 = this.zg;
        float bvs = zmnVar2 == null ? 0.0f : ((com.bytedance.adsdk.fs.zmn.fs.fb) zmnVar2).bvs();
        if (bvs == 0.0f && (zmnVar = this.iv) != null) {
            bvs = Math.min(zmnVar.nps().floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (bvs > min) {
            bvs = min;
        }
        PointF nps2 = this.hhw.nps();
        this.zmn.moveTo(nps2.x + f, (nps2.y - f2) + bvs);
        this.zmn.lineTo(nps2.x + f, (nps2.y + f2) - bvs);
        if (bvs > 0.0f) {
            RectF rectF = this.fs;
            float f3 = nps2.x;
            float f4 = bvs * 2.0f;
            float f5 = nps2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.zmn.arcTo(this.fs, 0.0f, 90.0f, false);
        }
        this.zmn.lineTo((nps2.x - f) + bvs, nps2.y + f2);
        if (bvs > 0.0f) {
            RectF rectF2 = this.fs;
            float f6 = nps2.x;
            float f7 = nps2.y;
            float f8 = bvs * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.zmn.arcTo(this.fs, 90.0f, 90.0f, false);
        }
        this.zmn.lineTo(nps2.x - f, (nps2.y - f2) + bvs);
        if (bvs > 0.0f) {
            RectF rectF3 = this.fs;
            float f9 = nps2.x;
            float f10 = nps2.y;
            float f11 = bvs * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.zmn.arcTo(this.fs, 180.0f, 90.0f, false);
        }
        this.zmn.lineTo((nps2.x + f) - bvs, nps2.y - f2);
        if (bvs > 0.0f) {
            RectF rectF4 = this.fs;
            float f12 = nps2.x;
            float f13 = bvs * 2.0f;
            float f14 = nps2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.zmn.arcTo(this.fs, 270.0f, 90.0f, false);
        }
        this.zmn.close();
        this.bvs.zmn(this.zmn);
        this.rc = true;
        return this.zmn;
    }
}
