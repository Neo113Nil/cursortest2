package com.bytedance.adsdk.lottie.vG;

import android.graphics.PointF;

/* compiled from: CubicCurveData.java */
/* loaded from: classes.dex */
public class pvs {
    private final PointF icD;
    private final PointF pvs;
    private final PointF vG;

    public pvs() {
        this.pvs = new PointF();
        this.icD = new PointF();
        this.vG = new PointF();
    }

    public pvs(PointF pointF, PointF pointF2, PointF pointF3) {
        this.pvs = pointF;
        this.icD = pointF2;
        this.vG = pointF3;
    }

    public void pvs(float f, float f2) {
        this.pvs.set(f, f2);
    }

    public PointF pvs() {
        return this.pvs;
    }

    public void icD(float f, float f2) {
        this.icD.set(f, f2);
    }

    public PointF icD() {
        return this.icD;
    }

    public void vG(float f, float f2) {
        this.vG.set(f, f2);
    }

    public PointF vG() {
        return this.vG;
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.vG.x), Float.valueOf(this.vG.y), Float.valueOf(this.pvs.x), Float.valueOf(this.pvs.y), Float.valueOf(this.icD.x), Float.valueOf(this.icD.y));
    }
}
