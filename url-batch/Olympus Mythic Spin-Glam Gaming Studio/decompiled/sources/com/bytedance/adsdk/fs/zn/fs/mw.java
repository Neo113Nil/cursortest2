package com.bytedance.adsdk.fs.zn.fs;

/* loaded from: classes9.dex */
public class mw implements zn {
    private final com.bytedance.adsdk.fs.zn.zmn.mw<Float, Float> fs;
    private final String zmn;

    public mw(String str, com.bytedance.adsdk.fs.zn.zmn.mw<Float, Float> mwVar) {
        this.zmn = str;
        this.fs = mwVar;
    }

    public String zmn() {
        return this.zmn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.mw<Float, Float> fs() {
        return this.fs;
    }

    @Override // com.bytedance.adsdk.fs.zn.fs.zn
    public com.bytedance.adsdk.fs.zmn.zmn.zn zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        return new com.bytedance.adsdk.fs.zmn.zmn.olo(bvsVar, zmnVar, this);
    }
}
