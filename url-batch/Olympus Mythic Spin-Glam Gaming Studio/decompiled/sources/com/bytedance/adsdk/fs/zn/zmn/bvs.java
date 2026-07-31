package com.bytedance.adsdk.fs.zn.zmn;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes14.dex */
public class bvs implements mw<PointF, PointF> {
    private final fs fs;
    private final fs zmn;

    public bvs(fs fsVar, fs fsVar2) {
        this.zmn = fsVar;
        this.fs = fsVar2;
    }

    @Override // com.bytedance.adsdk.fs.zn.zmn.mw
    public List<com.bytedance.adsdk.fs.nps.zmn<PointF>> zn() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.fs.zn.zmn.mw
    public boolean fs() {
        return this.zmn.fs() && this.fs.fs();
    }

    @Override // com.bytedance.adsdk.fs.zn.zmn.mw
    public com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> zmn() {
        return new com.bytedance.adsdk.fs.zmn.fs.rt(this.zmn.zmn(), this.fs.zmn());
    }
}
