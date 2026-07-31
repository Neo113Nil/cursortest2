package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class dg {
    public final WeakReference a;

    public dg(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = new WeakReference(activity);
    }

    public final cg b() {
        Insets insets;
        DisplayMetrics a = a();
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        float f = a.density;
        WindowInsetsCompat c = c();
        if (c == null) {
            return new cg(i, i2, f, null, null, 24, null);
        }
        Insets insets2 = c.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        DisplayCutoutCompat displayCutout = c.getDisplayCutout();
        if (displayCutout != null) {
            insets = Insets.of(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
        } else {
            insets = Insets.NONE;
        }
        Intrinsics.checkNotNull(insets);
        Insets of = Insets.of(Math.max(insets2.left, insets.left), Math.max(insets2.top, insets.top), Math.max(insets2.right, insets.right), Math.max(insets2.bottom, insets.bottom));
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        int i3 = (i - of.left) - of.right;
        int i4 = (i2 - of.top) - of.bottom;
        xb.c("VAST rendering container computed: width=" + i3 + ", height=" + i4 + ", density=" + f, null, 2, null);
        return new cg(i3, i4, f, null, of, 8, null);
    }

    public final DisplayMetrics a() {
        Activity activity = (Activity) this.a.get();
        if (activity != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics;
        }
        DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        return displayMetrics2;
    }

    public final WindowInsetsCompat c() {
        Window window;
        View decorView;
        Activity activity = (Activity) this.a.get();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(decorView);
        xb.a("Window insets retrieved: " + rootWindowInsets, (Throwable) null, 2, (Object) null);
        return rootWindowInsets;
    }
}
