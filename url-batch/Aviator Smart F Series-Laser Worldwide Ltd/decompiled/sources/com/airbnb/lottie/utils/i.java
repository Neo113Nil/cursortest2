package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import com.airbnb.lottie.animation.content.k;
import java.util.List;

/* loaded from: classes.dex */
public class i {
    private static final PointF pathFromDataCurrentPoint = new PointF();

    public static PointF addPoints(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int clamp(int i8, int i9, int i10) {
        return Math.max(i9, Math.min(i10, i8));
    }

    public static boolean contains(float f8, float f9, float f10) {
        return f8 >= f9 && f8 <= f10;
    }

    private static int floorDiv(int i8, int i9) {
        int i10 = i8 / i9;
        return (((i8 ^ i9) >= 0) || i8 % i9 == 0) ? i10 : i10 - 1;
    }

    static int floorMod(float f8, float f9) {
        return floorMod((int) f8, (int) f9);
    }

    public static void getPathFromData(com.airbnb.lottie.model.content.j jVar, Path path) {
        path.reset();
        PointF initialPoint = jVar.getInitialPoint();
        path.moveTo(initialPoint.x, initialPoint.y);
        pathFromDataCurrentPoint.set(initialPoint.x, initialPoint.y);
        for (int i8 = 0; i8 < jVar.getCurves().size(); i8++) {
            com.airbnb.lottie.model.a aVar = jVar.getCurves().get(i8);
            PointF controlPoint1 = aVar.getControlPoint1();
            PointF controlPoint2 = aVar.getControlPoint2();
            PointF vertex = aVar.getVertex();
            PointF pointF = pathFromDataCurrentPoint;
            if (controlPoint1.equals(pointF) && controlPoint2.equals(vertex)) {
                path.lineTo(vertex.x, vertex.y);
            } else {
                path.cubicTo(controlPoint1.x, controlPoint1.y, controlPoint2.x, controlPoint2.y, vertex.x, vertex.y);
            }
            pointF.set(vertex.x, vertex.y);
        }
        if (jVar.isClosed()) {
            path.close();
        }
    }

    public static double lerp(double d8, double d9, @FloatRange(from = 0.0d, to = 1.0d) double d10) {
        return d8 + (d10 * (d9 - d8));
    }

    public static void resolveKeyPath(com.airbnb.lottie.model.d dVar, int i8, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2, k kVar) {
        if (dVar.fullyResolvesTo(kVar.getName(), i8)) {
            list.add(dVar2.addKey(kVar.getName()).resolve(kVar));
        }
    }

    public static float clamp(float f8, float f9, float f10) {
        return Math.max(f9, Math.min(f10, f8));
    }

    private static int floorMod(int i8, int i9) {
        return i8 - (i9 * floorDiv(i8, i9));
    }

    public static float lerp(float f8, float f9, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        return f8 + (f10 * (f9 - f8));
    }

    public static double clamp(double d8, double d9, double d10) {
        return Math.max(d9, Math.min(d10, d8));
    }

    public static int lerp(int i8, int i9, @FloatRange(from = 0.0d, to = 1.0d) float f8) {
        return (int) (i8 + (f8 * (i9 - i8)));
    }
}
