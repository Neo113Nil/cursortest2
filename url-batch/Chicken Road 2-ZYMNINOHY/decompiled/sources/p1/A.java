package p1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class A extends U.i {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f14725g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f14726h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f14727i = true;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f14728j = true;

    public void P(View view, int i4, int i5, int i6, int i7) {
        if (f14727i) {
            try {
                view.setLeftTopRightBottom(i4, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f14727i = false;
            }
        }
    }

    public void Q(View view, Matrix matrix) {
        if (f14725g) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f14725g = false;
            }
        }
    }

    public void R(View view, Matrix matrix) {
        if (f14726h) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f14726h = false;
            }
        }
    }

    @Override // U.i
    public void x(View view, int i4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.x(view, i4);
        } else if (f14728j) {
            try {
                view.setTransitionVisibility(i4);
            } catch (NoSuchMethodError unused) {
                f14728j = false;
            }
        }
    }
}
