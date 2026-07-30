package com.baidu.ar;

import android.opengl.Matrix;
import android.util.Log;
import com.baidu.ar.arplay.representation.Vector4f;
import java.util.Arrays;

/* loaded from: classes.dex */
public class u8 {
    public static double a(double d8) {
        while (d8 > 360.0d) {
            d8 -= 360.0d;
        }
        while (d8 < com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            d8 += 360.0d;
        }
        return d8;
    }

    public static Vector4f b(Vector4f vector4f) {
        return new Vector4f(-vector4f.getX(), -vector4f.getY(), -vector4f.getZ(), -vector4f.getW());
    }

    public static Vector4f c(float[] fArr) {
        return new Vector4f(fArr[12], fArr[13], fArr[14], 0.0f);
    }

    public static double a(float[] fArr) {
        float[] b8 = b(fArr);
        Log.e("GeoLocalTransform", "rotate：" + Arrays.toString(b8));
        float[] fArr2 = new float[4];
        Matrix.multiplyMV(fArr2, 0, b8, 0, new float[]{0.0f, 0.0f, -1.0f, 1.0f}, 0);
        Vector4f a8 = td.a(fArr2);
        Log.e("GeoLocalTransform", "vector：" + Arrays.toString(a8.toArray()));
        if (a8.getX() == 0.0f && a8.getY() < 0.0f) {
            return com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        }
        if (a8.getX() == 0.0f && a8.getY() > 0.0f) {
            return 3.141592653589793d;
        }
        if (a8.getX() > 0.0f && a8.getY() == 0.0f) {
            return 1.5707963267948966d;
        }
        if (a8.getX() >= 0.0f || a8.getY() != 0.0f) {
            return (a8.getX() <= 0.0f || a8.getY() >= 0.0f) ? (a8.getX() <= 0.0f || a8.getY() <= 0.0f) ? (a8.getX() >= 0.0f || a8.getY() <= 0.0f) ? (a8.getX() >= 0.0f || a8.getY() >= 0.0f) ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : Math.atan(a8.getY() / a8.getX()) + 4.71238898038469d : Math.atan((-a8.getX()) / a8.getY()) + 3.141592653589793d : Math.atan(a8.getY() / a8.getX()) + 1.5707963267948966d : Math.atan(a8.getX() / (-a8.getY()));
        }
        return 4.71238898038469d;
    }

    public static float[] b(float[] fArr) {
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
        return fArr;
    }

    public static float a(float f8, float f9, float f10, float f11) {
        float f12 = (float) ((f9 * 3.141592653589793d) / 180.0d);
        float f13 = (float) ((f11 * 3.141592653589793d) / 180.0d);
        return Math.round((((float) (Math.asin(Math.sqrt(Math.pow(Math.sin((f12 - f13) / 2.0f), 2.0d) + ((Math.cos(f12) * Math.cos(f13)) * Math.pow(Math.sin(((float) (((f8 - f10) * 3.141592653589793d) / 180.0d)) / 2.0f), 2.0d)))) * 2.0d)) * 6378137.0f) * 10000.0f) / 10000.0f;
    }

    public static float[] a(Vector4f vector4f) {
        return new float[]{vector4f.getX(), 0.0f, 0.0f, 0.0f, 0.0f, vector4f.getY(), 0.0f, 0.0f, 0.0f, 0.0f, vector4f.getZ(), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static float[] a(float[] fArr, float[] fArr2) {
        float[] fArr3 = {fArr2[0], fArr2[1], fArr2[2], fArr2[3], fArr2[4], fArr2[5], fArr2[6], fArr2[7], fArr2[8], fArr2[9], fArr2[10], fArr2[11], 0.0f, 0.0f, 0.0f, 1.0f};
        float[] fArr4 = {fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], fArr[8], fArr[9], fArr[10], fArr[11], 0.0f, 0.0f, 0.0f, 1.0f};
        float[] fArr5 = new float[16];
        Matrix.invertM(fArr5, 0, fArr3, 0);
        float[] fArr6 = new float[16];
        Matrix.multiplyMM(fArr6, 0, fArr4, 0, fArr5, 0);
        return fArr6;
    }
}
