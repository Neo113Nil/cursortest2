package com.bytedance.adsdk.fs.zmn.fs;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes4.dex */
public class rt extends zmn<PointF, PointF> {
    protected com.bytedance.adsdk.fs.nps.fs<Float> btk;
    private final zmn<Float, Float> bvs;
    protected com.bytedance.adsdk.fs.nps.fs<Float> fb;
    private final PointF hhw;
    private final PointF nps;
    private final zmn<Float, Float> zg;

    public rt(zmn<Float, Float> zmnVar, zmn<Float, Float> zmnVar2) {
        super(Collections.emptyList());
        this.hhw = new PointF();
        this.nps = new PointF();
        this.zg = zmnVar;
        this.bvs = zmnVar2;
        zmn(zg());
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn
    public void zmn(float f) {
        this.zg.zmn(f);
        this.bvs.zmn(f);
        this.hhw.set(this.zg.nps().floatValue(), this.bvs.nps().floatValue());
        for (int i = 0; i < this.zmn.size(); i++) {
            this.zmn.get(i).zmn();
        }
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn
    /* renamed from: bvs, reason: merged with bridge method [inline-methods] */
    public PointF nps() {
        return zmn(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public PointF zmn(com.bytedance.adsdk.fs.nps.zmn<PointF> zmnVar, float f) {
        if (this.fb != null && this.zg.zn() != null) {
            this.zg.btk();
            throw null;
        }
        if (this.btk != null && this.bvs.zn() != null) {
            this.bvs.btk();
            throw null;
        }
        this.nps.set(this.hhw.x, 0.0f);
        PointF pointF = this.nps;
        pointF.set(pointF.x, this.hhw.y);
        return this.nps;
    }
}
