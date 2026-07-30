package com.baidu.ar;

import android.content.Context;

/* loaded from: classes.dex */
public class ob {

    /* renamed from: a, reason: collision with root package name */
    public static int f2916a = 1280;

    /* renamed from: b, reason: collision with root package name */
    public static int f2917b = 720;

    public static float a(Context context) {
        if (context != null) {
            return context.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    public static boolean b(Context context) {
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    public static float a(Context context, float f8) {
        return (a(context) * f8) + 0.5f;
    }
}
