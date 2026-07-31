package com.chartboost.sdk.impl;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class v6 {
    public final WindowManager a;
    public final DisplayMetrics b;
    public final Function0 c;
    public final DisplayMetrics d;
    public final float e;
    public final int f;

    public static final class a extends Lambda implements Function0 {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo4828invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    public v6(WindowManager windowManager, DisplayMetrics displayMetrics, Function0 androidVersion, DisplayMetrics realDisplayMetrics) {
        Intrinsics.checkNotNullParameter(windowManager, "windowManager");
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(realDisplayMetrics, "realDisplayMetrics");
        this.a = windowManager;
        this.b = displayMetrics;
        this.c = androidVersion;
        this.d = realDisplayMetrics;
        this.e = displayMetrics.density;
        this.f = displayMetrics.densityDpi;
    }

    public final float b() {
        return this.e;
    }

    public final int c() {
        return this.f;
    }

    public /* synthetic */ v6(WindowManager windowManager, DisplayMetrics displayMetrics, Function0 function0, DisplayMetrics displayMetrics2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(windowManager, displayMetrics, (i & 4) != 0 ? a.b : function0, (i & 8) != 0 ? new DisplayMetrics() : displayMetrics2);
    }

    public final w6 d() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        try {
            if (((Number) this.c.mo4828invoke()).intValue() >= 30) {
                currentWindowMetrics = this.a.getCurrentWindowMetrics();
                bounds = currentWindowMetrics.getBounds();
                return new w6(bounds.width(), bounds.height());
            }
            this.d.setTo(this.b);
            Display defaultDisplay = this.a.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getRealMetrics(this.d);
            }
            DisplayMetrics displayMetrics = this.d;
            return new w6(displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (Exception e) {
            xb.b("Cannot create size", e);
            return new w6(0, 0);
        }
    }

    public final w6 a(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        int i;
        int i2;
        int i3;
        int i4;
        Rect bounds;
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
        windowInsets = currentWindowMetrics.getWindowInsets();
        Intrinsics.checkNotNullExpressionValue(windowInsets, "getWindowInsets(...)");
        navigationBars = WindowInsets.Type.navigationBars();
        displayCutout = WindowInsets.Type.displayCutout();
        insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | displayCutout);
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        i = insetsIgnoringVisibility.right;
        i2 = insetsIgnoringVisibility.left;
        int i5 = i + i2;
        i3 = insetsIgnoringVisibility.top;
        i4 = insetsIgnoringVisibility.bottom;
        bounds = currentWindowMetrics.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        return new w6(bounds.width() - i5, bounds.height() - (i3 + i4));
    }

    public final w6 a() {
        w6 w6Var;
        try {
            if (((Number) this.c.mo4828invoke()).intValue() >= 30) {
                w6Var = a(this.a);
            } else {
                DisplayMetrics displayMetrics = this.b;
                w6Var = new w6(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            return w6Var;
        } catch (Exception e) {
            xb.b("Cannot create device size", e);
            return new w6(0, 0);
        }
    }
}
