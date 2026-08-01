package com.bytedance.adsdk.lottie.vG;

import android.graphics.PointF;

/* compiled from: DocumentData.java */
/* loaded from: classes.dex */
public class icD {
    public pvs Jd;
    public PointF Ju;
    public int Mxy;
    public int NB;
    public float Wyp;
    public String icD;
    public PointF kj;
    public String pvs;
    public boolean qh;
    public float sUS;
    public int so;
    public float vG;
    public float yiw;

    /* compiled from: DocumentData.java */
    public enum pvs {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public icD(String str, String str2, float f, pvs pvsVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        pvs(str, str2, f, pvsVar, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public icD() {
    }

    public void pvs(String str, String str2, float f, pvs pvsVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.pvs = str;
        this.icD = str2;
        this.vG = f;
        this.Jd = pvsVar;
        this.NB = i;
        this.sUS = f2;
        this.yiw = f3;
        this.so = i2;
        this.Mxy = i3;
        this.Wyp = f4;
        this.qh = z;
        this.kj = pointF;
        this.Ju = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.pvs.hashCode() * 31) + this.icD.hashCode()) * 31) + this.vG)) * 31) + this.Jd.ordinal()) * 31) + this.NB;
        long floatToRawIntBits = Float.floatToRawIntBits(this.sUS);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.so;
    }
}
