package com.bytedance.adsdk.fs.zn.fs;

import android.graphics.Path;

/* loaded from: classes15.dex */
public class btk implements zn {
    private final com.bytedance.adsdk.fs.zn.zmn.hhw btk;
    private final com.bytedance.adsdk.fs.zn.zmn.fs bvs;
    private final com.bytedance.adsdk.fs.zn.zmn.fb fb;
    private final Path.FillType fs;
    private final com.bytedance.adsdk.fs.zn.zmn.hhw hhw;
    private final boolean iv;
    private final String nps;
    private final com.bytedance.adsdk.fs.zn.zmn.fs zg;
    private final nps zmn;
    private final com.bytedance.adsdk.fs.zn.zmn.zn zn;

    public btk(String str, nps npsVar, Path.FillType fillType, com.bytedance.adsdk.fs.zn.zmn.zn znVar, com.bytedance.adsdk.fs.zn.zmn.fb fbVar, com.bytedance.adsdk.fs.zn.zmn.hhw hhwVar, com.bytedance.adsdk.fs.zn.zmn.hhw hhwVar2, com.bytedance.adsdk.fs.zn.zmn.fs fsVar, com.bytedance.adsdk.fs.zn.zmn.fs fsVar2, boolean z) {
        this.zmn = npsVar;
        this.fs = fillType;
        this.zn = znVar;
        this.fb = fbVar;
        this.btk = hhwVar;
        this.hhw = hhwVar2;
        this.nps = str;
        this.zg = fsVar;
        this.bvs = fsVar2;
        this.iv = z;
    }

    public String zmn() {
        return this.nps;
    }

    public nps fs() {
        return this.zmn;
    }

    public Path.FillType zn() {
        return this.fs;
    }

    public com.bytedance.adsdk.fs.zn.zmn.zn fb() {
        return this.zn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fb btk() {
        return this.fb;
    }

    public com.bytedance.adsdk.fs.zn.zmn.hhw hhw() {
        return this.btk;
    }

    public com.bytedance.adsdk.fs.zn.zmn.hhw nps() {
        return this.hhw;
    }

    public boolean zg() {
        return this.iv;
    }

    @Override // com.bytedance.adsdk.fs.zn.fs.zn
    public com.bytedance.adsdk.fs.zmn.zmn.zn zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        return new com.bytedance.adsdk.fs.zmn.zmn.zg(bvsVar, npsVar, zmnVar, this);
    }
}
