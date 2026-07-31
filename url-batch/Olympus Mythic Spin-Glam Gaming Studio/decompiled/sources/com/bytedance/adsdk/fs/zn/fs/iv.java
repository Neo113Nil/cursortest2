package com.bytedance.adsdk.fs.zn.fs;

import android.graphics.PointF;

/* loaded from: classes10.dex */
public class iv implements zn {
    private final com.bytedance.adsdk.fs.zn.zmn.fs btk;
    private final com.bytedance.adsdk.fs.zn.zmn.fs bvs;
    private final com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> fb;
    private final zmn fs;
    private final com.bytedance.adsdk.fs.zn.zmn.fs hhw;
    private final boolean iv;
    private final com.bytedance.adsdk.fs.zn.zmn.fs nps;
    private final boolean rc;
    private final com.bytedance.adsdk.fs.zn.zmn.fs zg;
    private final String zmn;
    private final com.bytedance.adsdk.fs.zn.zmn.fs zn;

    public enum zmn {
        STAR(1),
        POLYGON(2);

        private final int zn;

        zmn(int i) {
            this.zn = i;
        }

        public static zmn zmn(int i) {
            for (zmn zmnVar : values()) {
                if (zmnVar.zn == i) {
                    return zmnVar;
                }
            }
            return null;
        }
    }

    public iv(String str, zmn zmnVar, com.bytedance.adsdk.fs.zn.zmn.fs fsVar, com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> mwVar, com.bytedance.adsdk.fs.zn.zmn.fs fsVar2, com.bytedance.adsdk.fs.zn.zmn.fs fsVar3, com.bytedance.adsdk.fs.zn.zmn.fs fsVar4, com.bytedance.adsdk.fs.zn.zmn.fs fsVar5, com.bytedance.adsdk.fs.zn.zmn.fs fsVar6, boolean z, boolean z2) {
        this.zmn = str;
        this.fs = zmnVar;
        this.zn = fsVar;
        this.fb = mwVar;
        this.btk = fsVar2;
        this.hhw = fsVar3;
        this.nps = fsVar4;
        this.zg = fsVar5;
        this.bvs = fsVar6;
        this.iv = z;
        this.rc = z2;
    }

    public String zmn() {
        return this.zmn;
    }

    public zmn fs() {
        return this.fs;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs zn() {
        return this.zn;
    }

    public com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> fb() {
        return this.fb;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs btk() {
        return this.btk;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs hhw() {
        return this.hhw;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs nps() {
        return this.nps;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs zg() {
        return this.zg;
    }

    public com.bytedance.adsdk.fs.zn.zmn.fs bvs() {
        return this.bvs;
    }

    public boolean iv() {
        return this.iv;
    }

    public boolean rc() {
        return this.rc;
    }

    @Override // com.bytedance.adsdk.fs.zn.fs.zn
    public com.bytedance.adsdk.fs.zmn.zmn.zn zmn(com.bytedance.adsdk.fs.bvs bvsVar, com.bytedance.adsdk.fs.nps npsVar, com.bytedance.adsdk.fs.zn.zn.zmn zmnVar) {
        return new com.bytedance.adsdk.fs.zmn.zmn.rt(bvsVar, zmnVar, this);
    }
}
