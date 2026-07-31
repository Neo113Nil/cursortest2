package com.bytedance.adsdk.fs.zn.fs;

/* loaded from: classes3.dex */
public class olo implements zn {
    private final boolean fb;
    private final int fs;
    private final String zmn;
    private final com.bytedance.adsdk.fs.zn.zmn.zg zn;

    public olo(String str, int i, com.bytedance.adsdk.fs.zn.zmn.zg zgVar, boolean z) {
        this.zmn = str;
        this.fs = i;
        this.zn = zgVar;
        this.fb = z;
    }

    public String zmn() {
        return this.zmn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.zg fs() {
        return this.zn;
    }

    @Override // com.bytedance.adsdk.fs.zn.fs.zn
    public com.bytedance.adsdk.fs.zmn.zmn.zn zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        return new com.bytedance.adsdk.fs.zmn.zmn.kgc(bvsVar, zmnVar, this);
    }

    public boolean zn() {
        return this.fb;
    }

    public String toString() {
        return "ShapePath{name=" + this.zmn + ", index=" + this.fs + '}';
    }
}
