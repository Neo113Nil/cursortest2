package com.bytedance.adsdk.fs.zn.fs;

/* loaded from: classes15.dex */
public class bvs implements zn {
    private final zmn fs;
    private final String zmn;
    private final boolean zn;

    public enum zmn {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static zmn zmn(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public bvs(String str, zmn zmnVar, boolean z) {
        this.zmn = str;
        this.fs = zmnVar;
        this.zn = z;
    }

    public String zmn() {
        return this.zmn;
    }

    public zmn fs() {
        return this.fs;
    }

    public boolean zn() {
        return this.zn;
    }

    @Override // com.bytedance.adsdk.fs.zn.fs.zn
    public com.bytedance.adsdk.fs.zmn.zmn.zn zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        return new com.bytedance.adsdk.fs.zmn.zmn.klz(this);
    }

    public String toString() {
        return "MergePaths{mode=" + this.fs + '}';
    }
}
