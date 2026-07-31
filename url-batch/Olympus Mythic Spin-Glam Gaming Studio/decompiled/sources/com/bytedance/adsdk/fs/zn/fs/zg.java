package com.bytedance.adsdk.fs.zn.fs;

/* loaded from: classes13.dex */
public class zg {
    private final boolean fb;
    private final com.bytedance.adsdk.fs.zn.zmn.zg fs;
    private final zmn zmn;
    private final com.bytedance.adsdk.fs.zn.zmn.fb zn;

    public enum zmn {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public zg(zmn zmnVar, com.bytedance.adsdk.fs.zn.zmn.zg zgVar, com.bytedance.adsdk.fs.zn.zmn.fb fbVar, boolean z) {
        this.zmn = zmnVar;
        this.fs = zgVar;
        this.zn = fbVar;
        this.fb = z;
    }

    public zmn zmn() {
        return this.zmn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.zg fs() {
        return this.fs;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fb zn() {
        return this.zn;
    }

    public boolean fb() {
        return this.fb;
    }
}
