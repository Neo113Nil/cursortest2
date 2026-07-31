package com.bytedance.adsdk.fs.zmn.fs;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes4.dex */
public class rc extends nps<PointF> {
    private final PointF fb;

    public rc(List<com.bytedance.adsdk.fs.nps.zmn<PointF>> list) {
        super(list);
        this.fb = new PointF();
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public PointF zmn(com.bytedance.adsdk.fs.nps.zmn<PointF> zmnVar, float f) {
        return zmn(zmnVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public PointF zmn(com.bytedance.adsdk.fs.nps.zmn<PointF> zmnVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2 = zmnVar.zmn;
        if (pointF2 == null || (pointF = zmnVar.fs) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = pointF2;
        PointF pointF4 = pointF;
        if (this.zn != null) {
            zmnVar.nps.floatValue();
            fb();
            zg();
            throw null;
        }
        PointF pointF5 = this.fb;
        float f4 = pointF3.x;
        float f5 = f4 + (f2 * (pointF4.x - f4));
        float f6 = pointF3.y;
        pointF5.set(f5, f6 + (f3 * (pointF4.y - f6)));
        return this.fb;
    }
}
