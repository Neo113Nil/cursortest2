package com.bytedance.adsdk.fs.zn.zmn;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes14.dex */
public class btk implements mw<PointF, PointF> {
    private final List<com.bytedance.adsdk.fs.nps.zmn<PointF>> zmn;

    public btk(List<com.bytedance.adsdk.fs.nps.zmn<PointF>> list) {
        this.zmn = list;
    }

    @Override // com.bytedance.adsdk.fs.zn.zmn.mw
    public List<com.bytedance.adsdk.fs.nps.zmn<PointF>> zn() {
        return this.zmn;
    }

    @Override // com.bytedance.adsdk.fs.zn.zmn.mw
    public boolean fs() {
        return this.zmn.size() == 1 && this.zmn.get(0).btk();
    }

    @Override // com.bytedance.adsdk.fs.zn.zmn.mw
    public com.bytedance.adsdk.fs.zmn.fs.zmn<PointF, PointF> zmn() {
        if (this.zmn.get(0).btk()) {
            return new com.bytedance.adsdk.fs.zmn.fs.rc(this.zmn);
        }
        return new com.bytedance.adsdk.fs.zmn.fs.iv(this.zmn);
    }
}
