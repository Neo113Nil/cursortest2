package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.FrameLayout;

/* renamed from: com.unity3d.player.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1736d1 {

    /* renamed from: a, reason: collision with root package name */
    public static int f22162a;

    public static Point a(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        Rect bounds;
        Rect bounds2;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (!PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        systemBars = WindowInsets.Type.systemBars();
        windowInsets.getInsetsIgnoringVisibility(systemBars);
        bounds = currentWindowMetrics.getBounds();
        int width = bounds.width();
        bounds2 = currentWindowMetrics.getBounds();
        return new Point(width, bounds2.height());
    }

    public static void a(Activity activity, FrameLayout frameLayout) {
        Insets insets;
        int i4;
        int i5;
        int i6;
        int i7;
        if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            insets = activity.getWindow().getDecorView().getRootWindowInsets().getInsets(f22162a);
            i4 = insets.left;
            i5 = insets.top;
            i6 = insets.right;
            i7 = insets.bottom;
            frameLayout.setPadding(i4, i5, i6, i7);
        }
    }

    public static void a(Activity activity, FrameLayout frameLayout, boolean z4, boolean z5) {
        WindowInsetsController windowInsetsController;
        int navigationBars;
        int i4;
        boolean z6;
        int statusBars;
        int statusBars2;
        int navigationBars2;
        int systemUiVisibility;
        if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                if (z4) {
                    navigationBars2 = WindowInsets.Type.navigationBars();
                    i4 = navigationBars2;
                    navigationBars = 0;
                    z6 = true;
                } else {
                    navigationBars = WindowInsets.Type.navigationBars();
                    i4 = 0;
                    z6 = false;
                }
                if (z5) {
                    statusBars2 = WindowInsets.Type.statusBars();
                    i4 |= statusBars2;
                    z6 = true;
                } else {
                    statusBars = WindowInsets.Type.statusBars();
                    navigationBars |= statusBars;
                }
                if (i4 != 0) {
                    windowInsetsController.hide(i4);
                }
                if (navigationBars != 0) {
                    windowInsetsController.show(navigationBars);
                }
                f22162a = navigationBars;
                windowInsetsController.setSystemBarsBehavior(z6 ? 2 : 1);
            }
            activity.getWindow().setDecorFitsSystemWindows(false);
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        if (z4) {
            systemUiVisibility = decorView.getSystemUiVisibility() | 5894;
        } else {
            systemUiVisibility = decorView.getSystemUiVisibility() & (-5895);
        }
        if (z5) {
            systemUiVisibility |= 1024;
        }
        decorView.setSystemUiVisibility(systemUiVisibility);
    }
}
