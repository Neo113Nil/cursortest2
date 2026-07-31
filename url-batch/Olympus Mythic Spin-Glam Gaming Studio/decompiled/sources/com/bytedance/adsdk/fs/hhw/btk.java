package com.bytedance.adsdk.fs.hhw;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.fs.zn.fs.rt;

/* loaded from: classes6.dex */
public class btk {
    private static final PointF zmn = new PointF();

    public static float zmn(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int zmn(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static boolean zn(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static PointF zmn(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void zmn(rt rtVar, Path path) {
        path.reset();
        PointF zmn2 = rtVar.zmn();
        path.moveTo(zmn2.x, zmn2.y);
        zmn.set(zmn2.x, zmn2.y);
        for (int i = 0; i < rtVar.zn().size(); i++) {
            com.bytedance.adsdk.fs.zn.zmn zmnVar = rtVar.zn().get(i);
            PointF zmn3 = zmnVar.zmn();
            PointF fs = zmnVar.fs();
            PointF zn = zmnVar.zn();
            PointF pointF = zmn;
            if (zmn3.equals(pointF) && fs.equals(zn)) {
                path.lineTo(zn.x, zn.y);
            } else {
                path.cubicTo(zmn3.x, zmn3.y, fs.x, fs.y, zn.x, zn.y);
            }
            pointF.set(zn.x, zn.y);
        }
        if (rtVar.fs()) {
            path.close();
        }
    }

    static int zmn(float f, float f2) {
        return zmn((int) f, (int) f2);
    }

    private static int zmn(int i, int i2) {
        return i - (i2 * fs(i, i2));
    }

    private static int fs(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int zmn(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static float fs(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }
}
