package com.bytedance.adsdk.fs.zn.fs;

import android.graphics.Path;

/* loaded from: classes15.dex */
public class cn implements zn {
    private final com.bytedance.adsdk.fs.zn.zmn.fb btk;
    private final com.bytedance.adsdk.fs.zn.zmn.zmn fb;
    private final Path.FillType fs;
    private final boolean hhw;
    private final boolean zmn;
    private final String zn;

    public cn(String str, boolean z, Path.FillType fillType, com.bytedance.adsdk.fs.zn.zmn.zmn zmnVar, com.bytedance.adsdk.fs.zn.zmn.fb fbVar, boolean z2) {
        this.zn = str;
        this.zmn = z;
        this.fs = fillType;
        this.fb = zmnVar;
        this.btk = fbVar;
        this.hhw = z2;
    }

    public String zmn() {
        return this.zn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.zmn fs() {
        return this.fb;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fb zn() {
        return this.btk;
    }

    public Path.FillType fb() {
        return this.fs;
    }

    public boolean btk() {
        return this.hhw;
    }

    @Override // com.bytedance.adsdk.fs.zn.fs.zn
    public com.bytedance.adsdk.fs.zmn.zmn.zn zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        return new com.bytedance.adsdk.fs.zmn.zmn.nps(bvsVar, zmnVar, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.zmn + '}';
    }
}
