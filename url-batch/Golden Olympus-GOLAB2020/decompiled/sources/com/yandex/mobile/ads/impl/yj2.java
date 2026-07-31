package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.graphics.Insets;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yj2 {
    @NotNull
    public static final i10 a(@NotNull Context context) {
        WindowInsetsCompat windowInsetsCompat;
        i10 i10Var;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            windowInsetsCompat = b(context);
        } catch (Throwable th) {
            ap0.b(th);
            windowInsetsCompat = null;
        }
        if (windowInsetsCompat == null) {
            i10Var = i10.f27042g;
            return i10Var;
        }
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i4 = insets.left;
        int i5 = lh2.f28593b;
        Intrinsics.checkNotNullParameter(context, "context");
        float b4 = lh2.b(i4, context.getResources().getDisplayMetrics().density);
        int i6 = insets.top;
        Intrinsics.checkNotNullParameter(context, "context");
        float b5 = lh2.b(i6, context.getResources().getDisplayMetrics().density);
        int i7 = insets.right;
        Intrinsics.checkNotNullParameter(context, "context");
        float b6 = lh2.b(i7, context.getResources().getDisplayMetrics().density);
        int i8 = insets.bottom;
        Intrinsics.checkNotNullParameter(context, "context");
        float b7 = lh2.b(i8, context.getResources().getDisplayMetrics().density);
        int i9 = insets2.top;
        Intrinsics.checkNotNullParameter(context, "context");
        float b8 = lh2.b(i9, context.getResources().getDisplayMetrics().density);
        int i10 = insets2.bottom;
        Intrinsics.checkNotNullParameter(context, "context");
        return new i10(b4, b5, b6, b7, b8, lh2.b(i10, context.getResources().getDisplayMetrics().density));
    }

    private static WindowInsetsCompat b(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        if (Build.VERSION.SDK_INT < 30) {
            Activity a4 = C2054l0.a();
            if (a4 == null) {
                return null;
            }
            View decorView = a4.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            return AbstractC1281a0.I(decorView);
        }
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        windowInsets = currentWindowMetrics.getWindowInsets();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        return windowInsetsCompat;
    }
}
