package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class j {
    private boolean closed;
    private final List<com.airbnb.lottie.model.a> curves;
    private PointF initialPoint;

    public j(PointF pointF, boolean z7, List<com.airbnb.lottie.model.a> list) {
        this.initialPoint = pointF;
        this.closed = z7;
        this.curves = new ArrayList(list);
    }

    public List<com.airbnb.lottie.model.a> getCurves() {
        return this.curves;
    }

    public PointF getInitialPoint() {
        return this.initialPoint;
    }

    public void interpolateBetween(j jVar, j jVar2, @FloatRange(from = 0.0d, to = 1.0d) float f8) {
        if (this.initialPoint == null) {
            this.initialPoint = new PointF();
        }
        this.closed = jVar.isClosed() || jVar2.isClosed();
        if (jVar.getCurves().size() != jVar2.getCurves().size()) {
            com.airbnb.lottie.utils.f.warning("Curves must have the same number of control points. Shape 1: " + jVar.getCurves().size() + "\tShape 2: " + jVar2.getCurves().size());
        }
        int min = Math.min(jVar.getCurves().size(), jVar2.getCurves().size());
        if (this.curves.size() < min) {
            for (int size = this.curves.size(); size < min; size++) {
                this.curves.add(new com.airbnb.lottie.model.a());
            }
        } else if (this.curves.size() > min) {
            for (int size2 = this.curves.size() - 1; size2 >= min; size2--) {
                List<com.airbnb.lottie.model.a> list = this.curves;
                list.remove(list.size() - 1);
            }
        }
        PointF initialPoint = jVar.getInitialPoint();
        PointF initialPoint2 = jVar2.getInitialPoint();
        setInitialPoint(com.airbnb.lottie.utils.i.lerp(initialPoint.x, initialPoint2.x, f8), com.airbnb.lottie.utils.i.lerp(initialPoint.y, initialPoint2.y, f8));
        for (int size3 = this.curves.size() - 1; size3 >= 0; size3--) {
            com.airbnb.lottie.model.a aVar = jVar.getCurves().get(size3);
            com.airbnb.lottie.model.a aVar2 = jVar2.getCurves().get(size3);
            PointF controlPoint1 = aVar.getControlPoint1();
            PointF controlPoint2 = aVar.getControlPoint2();
            PointF vertex = aVar.getVertex();
            PointF controlPoint12 = aVar2.getControlPoint1();
            PointF controlPoint22 = aVar2.getControlPoint2();
            PointF vertex2 = aVar2.getVertex();
            this.curves.get(size3).setControlPoint1(com.airbnb.lottie.utils.i.lerp(controlPoint1.x, controlPoint12.x, f8), com.airbnb.lottie.utils.i.lerp(controlPoint1.y, controlPoint12.y, f8));
            this.curves.get(size3).setControlPoint2(com.airbnb.lottie.utils.i.lerp(controlPoint2.x, controlPoint22.x, f8), com.airbnb.lottie.utils.i.lerp(controlPoint2.y, controlPoint22.y, f8));
            this.curves.get(size3).setVertex(com.airbnb.lottie.utils.i.lerp(vertex.x, vertex2.x, f8), com.airbnb.lottie.utils.i.lerp(vertex.y, vertex2.y, f8));
        }
    }

    public boolean isClosed() {
        return this.closed;
    }

    public void setClosed(boolean z7) {
        this.closed = z7;
    }

    public void setInitialPoint(float f8, float f9) {
        if (this.initialPoint == null) {
            this.initialPoint = new PointF();
        }
        this.initialPoint.set(f8, f9);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.curves.size() + "closed=" + this.closed + '}';
    }

    public j() {
        this.curves = new ArrayList();
    }
}
