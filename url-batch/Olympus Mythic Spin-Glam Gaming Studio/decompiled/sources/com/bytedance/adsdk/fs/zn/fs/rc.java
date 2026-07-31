package com.bytedance.adsdk.fs.zn.fs;

import android.graphics.PointF;

/* loaded from: classes8.dex */
public class rc implements zn {
    private final boolean btk;
    private final com.bytedance.adsdk.fs.zn.zmn.fs fb;
    private final com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> fs;
    private final String zmn;
    private final com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> zn;

    public rc(String str, com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> mwVar, com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> mwVar2, com.bytedance.adsdk.fs.zn.zmn.fs fsVar, boolean z) {
        this.zmn = str;
        this.fs = mwVar;
        this.zn = mwVar2;
        this.fb = fsVar;
        this.btk = z;
    }

    public String zmn() {
        return this.zmn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs fs() {
        return this.fb;
    }

    public com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> zn() {
        return this.zn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> fb() {
        return this.fs;
    }

    public boolean btk() {
        return this.btk;
    }

    @Override // com.bytedance.adsdk.fs.zn.fs.zn
    public com.bytedance.adsdk.fs.zmn.zmn.zn zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        return new com.bytedance.adsdk.fs.zmn.zmn.cn(bvsVar, zmnVar, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.fs + ", size=" + this.zn + '}';
    }
}
