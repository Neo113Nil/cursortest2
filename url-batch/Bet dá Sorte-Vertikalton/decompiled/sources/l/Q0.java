package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2889a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2890b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2891c = {R.attr.state_focused};
    public static final int[] d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2892e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2893f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f2894g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f.a.f2038j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList d2 = d(context, i);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(f2890b, d2.getDefaultColor());
        }
        ThreadLocal threadLocal = f2889a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return C.a.d(c(context, i), Math.round(Color.alpha(r4) * f2));
    }

    public static int c(Context context, int i) {
        int[] iArr = f2894g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f2894g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = u1.d.A(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
