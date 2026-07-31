package com.bytedance.adsdk.fs.zn.fs;

import android.graphics.PointF;

/* loaded from: classes11.dex */
public class fs implements zn {
    private final boolean btk;
    private final boolean fb;
    private final com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> fs;
    private final String zmn;
    private final com.bytedance.adsdk.fs.zn.zmn.hhw zn;

    public fs(String str, com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> mwVar, com.bytedance.adsdk.fs.zn.zmn.hhw hhwVar, boolean z, boolean z2) {
        this.zmn = str;
        this.fs = mwVar;
        this.zn = hhwVar;
        this.fb = z;
        this.btk = z2;
    }

    @Override // com.bytedance.adsdk.fs.zn.fs.zn
    public com.bytedance.adsdk.fs.zmn.zmn.zn zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        return new com.bytedance.adsdk.fs.zmn.zmn.hhw(bvsVar, zmnVar, this);
    }

    public String zmn() {
        return this.zmn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> fs() {
        return this.fs;
    }

    public com.bytedance.adsdk.fs.zn.zmn.hhw zn() {
        return this.zn;
    }

    public boolean fb() {
        return this.fb;
    }

    public boolean btk() {
        return this.btk;
    }
}
