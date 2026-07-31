package com.bytedance.adsdk.fs.zn;

import android.graphics.PointF;

/* loaded from: classes3.dex */
public class fs {
    public int btk;
    public int bvs;
    public zmn fb;
    public String fs;
    public float hhw;
    public float iv;
    public PointF klz;
    public PointF mw;
    public float nps;
    public boolean rc;
    public int zg;
    public String zmn;
    public float zn;

    public enum zmn {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public fs(String str, String str2, float f, zmn zmnVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        zmn(str, str2, f, zmnVar, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public fs() {
    }

    public void zmn(String str, String str2, float f, zmn zmnVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.zmn = str;
        this.fs = str2;
        this.zn = f;
        this.fb = zmnVar;
        this.btk = i;
        this.hhw = f2;
        this.nps = f3;
        this.zg = i2;
        this.bvs = i3;
        this.iv = f4;
        this.rc = z;
        this.klz = pointF;
        this.mw = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.zmn.hashCode() * 31) + this.fs.hashCode()) * 31) + this.zn)) * 31) + this.fb.ordinal()) * 31) + this.btk;
        long floatToRawIntBits = Float.floatToRawIntBits(this.hhw);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.zg;
    }
}
