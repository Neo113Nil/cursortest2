package com.bytedance.adsdk.fs.zn;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* loaded from: classes13.dex */
public class zmn {
    private final PointF fs;
    private final PointF zmn;
    private final PointF zn;

    public zmn() {
        this.zmn = new PointF();
        this.fs = new PointF();
        this.zn = new PointF();
    }

    public zmn(PointF pointF, PointF pointF2, PointF pointF3) {
        this.zmn = pointF;
        this.fs = pointF2;
        this.zn = pointF3;
    }

    public void zmn(float f, float f2) {
        this.zmn.set(f, f2);
    }

    public PointF zmn() {
        return this.zmn;
    }

    public void fs(float f, float f2) {
        this.fs.set(f, f2);
    }

    public PointF fs() {
        return this.fs;
    }

    public void zn(float f, float f2) {
        this.zn.set(f, f2);
    }

    public PointF zn() {
        return this.zn;
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.zn.x), Float.valueOf(this.zn.y), Float.valueOf(this.zmn.x), Float.valueOf(this.zmn.y), Float.valueOf(this.fs.x), Float.valueOf(this.fs.y));
    }
}
