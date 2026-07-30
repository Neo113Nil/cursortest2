package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public interface yj1 {
    public static final xj1 Companion = xj1.PxuCJdSBwIXG;

    static void PxuCJdSBwIXG(yj1 yj1Var, qt1 qt1Var) {
        r4 r4Var = (r4) yj1Var;
        float f = qt1Var.PxuCJdSBwIXG;
        float f2 = qt1Var.Y1f8riQaR6yg;
        float f3 = qt1Var.TSizfFm2Yiuu;
        float f4 = qt1Var.lS5Rgt96tfkO;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            t4.lS5Rgt96tfkO("Invalid rectangle, make sure no value is NaN");
        }
        if (r4Var.lS5Rgt96tfkO == null) {
            r4Var.lS5Rgt96tfkO = new RectF();
        }
        RectF rectF = r4Var.lS5Rgt96tfkO;
        rectF.getClass();
        rectF.set(f, f4, f3, f2);
        Path path = r4Var.PxuCJdSBwIXG;
        RectF rectF2 = r4Var.lS5Rgt96tfkO;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    static void TSizfFm2Yiuu(yj1 yj1Var, mx1 mx1Var) {
        r4 r4Var = (r4) yj1Var;
        if (r4Var.lS5Rgt96tfkO == null) {
            r4Var.lS5Rgt96tfkO = new RectF();
        }
        RectF rectF = r4Var.lS5Rgt96tfkO;
        rectF.getClass();
        float f = mx1Var.PxuCJdSBwIXG;
        long j = mx1Var.rtx2ld2ELZv4;
        long j2 = mx1Var.RAsUl2FVSrh6;
        long j3 = mx1Var.a92UlCVFR9N8;
        long j4 = mx1Var.e9gEMXR7LXtO;
        rectF.set(f, mx1Var.lS5Rgt96tfkO, mx1Var.TSizfFm2Yiuu, mx1Var.Y1f8riQaR6yg);
        if (r4Var.TSizfFm2Yiuu == null) {
            r4Var.TSizfFm2Yiuu = new float[8];
        }
        float[] fArr = r4Var.TSizfFm2Yiuu;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = r4Var.PxuCJdSBwIXG;
        RectF rectF2 = r4Var.lS5Rgt96tfkO;
        rectF2.getClass();
        float[] fArr2 = r4Var.TSizfFm2Yiuu;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    static void lS5Rgt96tfkO(r4 r4Var, yj1 yj1Var) {
        bf1.Companion.getClass();
        Path path = r4Var.PxuCJdSBwIXG;
        if (!(yj1Var instanceof r4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(((r4) yj1Var).PxuCJdSBwIXG, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }
}
