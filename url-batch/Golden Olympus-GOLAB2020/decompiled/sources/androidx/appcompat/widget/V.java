package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f10835a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f10836b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f10837c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f10838d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f10839e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f10840f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    static final int[] f10841g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f10842h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    static final int[] f10843i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f10844j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e.j.f36591y0);
        try {
            if (!obtainStyledAttributes.hasValue(e.j.f36376D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i4) {
        ColorStateList e4 = e(context, i4);
        if (e4 != null && e4.isStateful()) {
            return e4.getColorForState(f10836b, e4.getDefaultColor());
        }
        TypedValue f4 = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, f4, true);
        return d(context, i4, f4.getFloat());
    }

    public static int c(Context context, int i4) {
        int[] iArr = f10844j;
        iArr[0] = i4;
        Z u4 = Z.u(context, null, iArr);
        try {
            return u4.b(0, 0);
        } finally {
            u4.x();
        }
    }

    static int d(Context context, int i4, float f4) {
        return androidx.core.graphics.a.k(c(context, i4), Math.round(Color.alpha(r0) * f4));
    }

    public static ColorStateList e(Context context, int i4) {
        int[] iArr = f10844j;
        iArr[0] = i4;
        Z u4 = Z.u(context, null, iArr);
        try {
            return u4.c(0);
        } finally {
            u4.x();
        }
    }

    private static TypedValue f() {
        ThreadLocal threadLocal = f10835a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
