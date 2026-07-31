package com.bytedance.adsdk.fs.zn.fs;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class cyb implements zn {
    private final List<zn> fs;
    private final String zmn;
    private final boolean zn;

    public cyb(String str, List<zn> list, boolean z) {
        this.zmn = str;
        this.fs = list;
        this.zn = z;
    }

    public String zmn() {
        return this.zmn;
    }

    public List<zn> fs() {
        return this.fs;
    }

    public boolean zn() {
        return this.zn;
    }

    @Override // com.bytedance.adsdk.fs.zn.fs.zn
    public com.bytedance.adsdk.fs.zmn.zmn.zn zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        return new com.bytedance.adsdk.fs.zmn.zmn.fb(bvsVar, zmnVar, this, npsVar);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.zmn + "' Shapes: " + Arrays.toString(this.fs.toArray()) + '}';
    }
}
