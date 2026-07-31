package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import g.AbstractC0389a;
import h.AbstractC0401a;
import w.AbstractC0708a;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f5051a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f5052b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f5053c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5054d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f5055e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f5056f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f5057g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0389a.f4261h);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i7) {
        ColorStateList d7 = d(context, i7);
        if (d7 != null && d7.isStateful()) {
            return d7.getColorForState(f5052b, d7.getDefaultColor());
        }
        ThreadLocal threadLocal = f5051a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f7 = typedValue.getFloat();
        int c7 = c(context, i7);
        int round = Math.round(Color.alpha(c7) * f7);
        int i8 = AbstractC0708a.f6125a;
        if (round < 0 || round > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (c7 & 16777215) | (round << 24);
    }

    public static int c(Context context, int i7) {
        int[] iArr = f5057g;
        iArr[0] = i7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i7) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f5057g;
        iArr[0] = i7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                Object obj = AbstractC0401a.f4318a;
                colorStateList = context.getColorStateList(resourceId);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
            colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
