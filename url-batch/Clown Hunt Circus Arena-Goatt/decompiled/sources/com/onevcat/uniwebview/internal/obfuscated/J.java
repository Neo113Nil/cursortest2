package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class J {
    public static int a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorView");
        WindowInsets rootWindowInsets = decorView.getRootView().getRootWindowInsets();
        Insets insets = rootWindowInsets != null ? rootWindowInsets.getInsets(WindowInsets.Type.statusBars()) : null;
        if (insets == null || insets.top != 0) {
            return dimensionPixelSize;
        }
        return 0;
    }
}
