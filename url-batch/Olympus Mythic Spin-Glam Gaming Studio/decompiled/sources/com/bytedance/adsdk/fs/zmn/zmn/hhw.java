package com.bytedance.adsdk.fs.zmn.zmn;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.fs.zmn.fs.zmn;
import com.bytedance.adsdk.fs.zn.fs.kw;
import java.util.List;

/* loaded from: classes4.dex */
public class hhw implements zmn.InterfaceC0104zmn, mw, rc {
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, PointF> btk;
    private final com.bytedance.adsdk.fs.zmn.fs.zmn<?, PointF> fb;
    private final String fs;
    private final com.bytedance.adsdk.fs.zn.fs.fs hhw;
    private boolean zg;
    private final com.bytedance.adsdk.fs.bvs zn;
    private final Path zmn = new Path();
    private final fs nps = new fs();

    public hhw(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar, com.bytedance.adsdk.fs.zn.fs.fs fsVar) {
        this.fs = fsVar.zmn();
        this.zn = bvsVar;
        com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> zmn = fsVar.zn().zmn();
        this.fb = zmn;
        com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> zmn2 = fsVar.fs().zmn();
        this.btk = zmn2;
        this.hhw = fsVar;
        zmnVar.zmn(zmn);
        zmnVar.zmn(zmn2);
        zmn.zmn(this);
        zmn2.zmn(this);
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn.InterfaceC0104zmn
    public void zmn() {
        fs();
    }

    private void fs() {
        this.zg = false;
        this.zn.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.zn
    public void zmn(List<zn> list, List<zn> list2) {
        for (int i = 0; i < list.size(); i++) {
            zn znVar = list.get(i);
            if (znVar instanceof phc) {
                phc phcVar = (phc) znVar;
                if (phcVar.fs() == kw.zmn.SIMULTANEOUSLY) {
                    this.nps.zmn(phcVar);
                    phcVar.zmn(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.zmn.mw
    public Path fb() {
        if (this.zg) {
            return this.zmn;
        }
        this.zmn.reset();
        if (this.hhw.btk()) {
            this.zg = true;
            return this.zmn;
        }
        PointF nps = this.fb.nps();
        float f = nps.x / 2.0f;
        float f2 = nps.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.zmn.reset();
        if (this.hhw.fb()) {
            float f5 = -f2;
            this.zmn.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.zmn.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.zmn.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.zmn.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.zmn.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.zmn.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.zmn.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.zmn.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.zmn.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.zmn.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF nps2 = this.btk.nps();
        this.zmn.offset(nps2.x, nps2.y);
        this.zmn.close();
        this.nps.zmn(this.zmn);
        this.zg = true;
        return this.zmn;
    }
}
