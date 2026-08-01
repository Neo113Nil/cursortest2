package com.bytedance.adsdk.lottie.sUS;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.vG.icD.IP;

/* compiled from: MiscUtils.java */
/* loaded from: classes.dex */
public class NB {
    private static final PointF pvs = new PointF();

    public static float pvs(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int pvs(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static boolean vG(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static PointF pvs(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void pvs(IP ip, Path path) {
        path.reset();
        PointF pvs2 = ip.pvs();
        path.moveTo(pvs2.x, pvs2.y);
        pvs.set(pvs2.x, pvs2.y);
        for (int i = 0; i < ip.vG().size(); i++) {
            com.bytedance.adsdk.lottie.vG.pvs pvsVar = ip.vG().get(i);
            PointF pvs3 = pvsVar.pvs();
            PointF icD = pvsVar.icD();
            PointF vG = pvsVar.vG();
            PointF pointF = pvs;
            if (pvs3.equals(pointF) && icD.equals(vG)) {
                path.lineTo(vG.x, vG.y);
            } else {
                path.cubicTo(pvs3.x, pvs3.y, icD.x, icD.y, vG.x, vG.y);
            }
            pointF.set(vG.x, vG.y);
        }
        if (ip.icD()) {
            path.close();
        }
    }

    static int pvs(float f, float f2) {
        return pvs((int) f, (int) f2);
    }

    private static int pvs(int i, int i2) {
        return i - (i2 * icD(i, i2));
    }

    private static int icD(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int pvs(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static float icD(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }
}
