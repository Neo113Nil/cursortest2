package com.baidu.platform.comapi.h.t;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static float f9270a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private static int f9271b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f9272c = 124;

    /* renamed from: d, reason: collision with root package name */
    public static int f9273d = 133;

    public static float a(Context context) {
        if (f9270a == 0.0f) {
            f9270a = context.getResources().getDisplayMetrics().density;
        }
        return f9270a;
    }

    public static int b(Context context) {
        if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        return 0;
    }

    public static int c(Context context) {
        if (context != null) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        return 0;
    }

    public static int d(Context context) {
        Rect rect = new Rect();
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public static int e(Context context) {
        int b8;
        int d8;
        if (context == null) {
            return 0;
        }
        int i8 = f9271b;
        if (i8 > 0) {
            return i8;
        }
        if (context instanceof Activity) {
            View findViewById = ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
            if (findViewById != null && findViewById.getHeight() > 0) {
                return findViewById.getHeight();
            }
            b8 = b(context);
            d8 = d(context);
        } else {
            b8 = b(context);
            d8 = d(context);
        }
        return b8 - d8;
    }

    public static int a(Context context, int i8) {
        return (int) ((a(context) * i8) + 0.5f);
    }
}
