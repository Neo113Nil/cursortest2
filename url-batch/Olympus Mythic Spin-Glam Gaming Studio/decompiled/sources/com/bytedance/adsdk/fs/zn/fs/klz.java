package com.bytedance.adsdk.fs.zn.fs;

/* loaded from: classes15.dex */
public class klz implements zn {
    private final boolean btk;
    private final com.bytedance.adsdk.fs.zn.zmn.klz fb;
    private final com.bytedance.adsdk.fs.zn.zmn.fs fs;
    private final String zmn;
    private final com.bytedance.adsdk.fs.zn.zmn.fs zn;

    public klz(String str, com.bytedance.adsdk.fs.zn.zmn.fs fsVar, com.bytedance.adsdk.fs.zn.zmn.fs fsVar2, com.bytedance.adsdk.fs.zn.zmn.klz klzVar, boolean z) {
        this.zmn = str;
        this.fs = fsVar;
        this.zn = fsVar2;
        this.fb = klzVar;
        this.btk = z;
    }

    public String zmn() {
        return this.zmn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs fs() {
        return this.fs;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs zn() {
        return this.zn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.klz fb() {
        return this.fb;
    }

    public boolean btk() {
        return this.btk;
    }

    @Override // com.bytedance.adsdk.fs.zn.fs.zn
    public com.bytedance.adsdk.fs.zmn.zmn.zn zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        return new com.bytedance.adsdk.fs.zmn.zmn.cyb(bvsVar, zmnVar, this);
    }
}
