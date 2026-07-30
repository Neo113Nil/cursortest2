package com.airbnb.lottie.model;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class a {
    private final PointF controlPoint1;
    private final PointF controlPoint2;
    private final PointF vertex;

    public a() {
        this.controlPoint1 = new PointF();
        this.controlPoint2 = new PointF();
        this.vertex = new PointF();
    }

    public PointF getControlPoint1() {
        return this.controlPoint1;
    }

    public PointF getControlPoint2() {
        return this.controlPoint2;
    }

    public PointF getVertex() {
        return this.vertex;
    }

    public void setControlPoint1(float f8, float f9) {
        this.controlPoint1.set(f8, f9);
    }

    public void setControlPoint2(float f8, float f9) {
        this.controlPoint2.set(f8, f9);
    }

    public void setFrom(a aVar) {
        PointF pointF = aVar.vertex;
        setVertex(pointF.x, pointF.y);
        PointF pointF2 = aVar.controlPoint1;
        setControlPoint1(pointF2.x, pointF2.y);
        PointF pointF3 = aVar.controlPoint2;
        setControlPoint2(pointF3.x, pointF3.y);
    }

    public void setVertex(float f8, float f9) {
        this.vertex.set(f8, f9);
    }

    @NonNull
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.vertex.x), Float.valueOf(this.vertex.y), Float.valueOf(this.controlPoint1.x), Float.valueOf(this.controlPoint1.y), Float.valueOf(this.controlPoint2.x), Float.valueOf(this.controlPoint2.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.controlPoint1 = pointF;
        this.controlPoint2 = pointF2;
        this.vertex = pointF3;
    }
}
