package com.bytedance.adsdk.fs.zn.fs;

import com.bytedance.adsdk.fs.zmn.zmn.phc;

/* loaded from: classes10.dex */
public class kw implements zn {
    private final com.bytedance.adsdk.fs.zn.zmn.fs btk;
    private final com.bytedance.adsdk.fs.zn.zmn.fs fb;
    private final zmn fs;
    private final boolean hhw;
    private final String zmn;
    private final com.bytedance.adsdk.fs.zn.zmn.fs zn;

    public enum zmn {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static zmn zmn(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public kw(String str, zmn zmnVar, com.bytedance.adsdk.fs.zn.zmn.fs fsVar, com.bytedance.adsdk.fs.zn.zmn.fs fsVar2, com.bytedance.adsdk.fs.zn.zmn.fs fsVar3, boolean z) {
        this.zmn = str;
        this.fs = zmnVar;
        this.zn = fsVar;
        this.fb = fsVar2;
        this.btk = fsVar3;
        this.hhw = z;
    }

    public String zmn() {
        return this.zmn;
    }

    public zmn fs() {
        return this.fs;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs zn() {
        return this.fb;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs fb() {
        return this.zn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs btk() {
        return this.btk;
    }

    public boolean hhw() {
        return this.hhw;
    }

    @Override // com.bytedance.adsdk.fs.zn.fs.zn
    public com.bytedance.adsdk.fs.zmn.zmn.zn zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        return new phc(zmnVar, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.zn + ", end: " + this.fb + ", offset: " + this.btk + "}";
    }
}
