package com.pgl.ssdk;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: DisplayUnits.java */
/* loaded from: classes3.dex */
public class A {
    public static int a;
    public static int b;
    public static int c;

    private static void a(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            a = point.x;
            b = point.y;
        } catch (Throwable unused) {
        }
    }

    public static String b(Context context) {
        try {
            a(context);
            if (context != null) {
                try {
                    new DisplayMetrics();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    float f = displayMetrics.density;
                    c = displayMetrics.densityDpi;
                } catch (Throwable unused) {
                }
            }
            new DisplayMetrics();
            float f2 = context.getResources().getDisplayMetrics().xdpi;
        } catch (Throwable unused2) {
        }
        return c + "[<!>]" + a + "," + b + "[<!>]";
    }
}
