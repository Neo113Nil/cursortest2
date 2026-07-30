package com.baidu.ar;

import com.baidu.ar.arplay.representation.Matrix;
import com.baidu.ar.arplay.representation.Quaternion;
import com.baidu.ar.arplay.representation.Vector4f;

/* loaded from: classes.dex */
public class mb {
    public static double a(double d8, double d9) {
        a3 a3Var = new a3(d8, d9);
        if (a3Var.a() == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && a3Var.b() == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            return com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        }
        if (a3Var.a() == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && a3Var.b() > com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            return com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        }
        if (a3Var.a() == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && a3Var.b() < com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            return 180.0d;
        }
        if (a3Var.b() == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && a3Var.a() > com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            return 90.0d;
        }
        if (a3Var.b() != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON || a3Var.a() >= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            return (a3Var.a() <= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON || a3Var.b() <= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) ? (a3Var.a() <= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON || a3Var.b() >= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) ? (a3Var.a() >= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON || a3Var.b() >= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) ? (a3Var.a() >= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON || a3Var.b() <= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : ((Math.atan(a3Var.b() / (-a3Var.a())) / 3.141592653589793d) * 180.0d) + 270.0d : ((Math.atan(a3Var.a() / a3Var.b()) / 3.141592653589793d) * 180.0d) + 180.0d : ((Math.atan((-a3Var.b()) / a3Var.a()) / 3.141592653589793d) * 180.0d) + 90.0d : (Math.atan(a3Var.a() / a3Var.b()) / 3.141592653589793d) * 180.0d;
        }
        return 270.0d;
    }

    public static Vector4f a(double d8, double d9, int i8) {
        double a8 = a(d8, d9);
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(fArr, 0, (float) (-a8), 0.0f, 0.0f, 1.0f);
        Quaternion quaternion = new Quaternion();
        if (i8 == 1) {
            float[] fArr2 = new float[16];
            Matrix.setIdentityM(fArr2, 0);
            Matrix.rotateM(fArr2, 0, -90.0f, 0.0f, 1.0f, 0.0f);
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, 0);
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            quaternion.setRowMajor(fArr3);
        } else {
            quaternion.setRowMajor(fArr);
        }
        return new Vector4f(quaternion.getX(), quaternion.getY(), quaternion.getZ(), quaternion.getW());
    }
}
