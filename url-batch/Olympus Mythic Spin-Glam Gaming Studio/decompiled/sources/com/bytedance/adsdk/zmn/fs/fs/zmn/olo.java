package com.bytedance.adsdk.zmn.fs.fs.zmn;

/* loaded from: classes5.dex */
public abstract class olo implements com.bytedance.adsdk.zmn.fs.fs.zmn {
    protected com.bytedance.adsdk.zmn.fs.fs.zmn fs;
    protected com.bytedance.adsdk.zmn.fs.fs.zmn zmn;
    protected com.bytedance.adsdk.zmn.fs.fb.zn zn;

    protected olo(com.bytedance.adsdk.zmn.fs.fb.zn znVar) {
        this.zn = znVar;
    }

    public void zmn(com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar) {
        this.zmn = zmnVar;
    }

    public void fs(com.bytedance.adsdk.zmn.fs.fs.zmn zmnVar) {
        this.fs = zmnVar;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public com.bytedance.adsdk.zmn.fs.fb.btk zmn() {
        return com.bytedance.adsdk.zmn.fs.fb.hhw.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public String fs() {
        return this.zmn.fs() + this.zn.zmn() + this.fs.fs();
    }

    public String toString() {
        return fs();
    }
}
