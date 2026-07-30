package n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import h.AbstractC0454a;

/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f6786a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f6787b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f6788c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f6789d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f6790e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f6791f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f6792g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0454a.j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList d7 = d(context, i2);
        if (d7 != null && d7.isStateful()) {
            return d7.getColorForState(f6787b, d7.getDefaultColor());
        }
        ThreadLocal threadLocal = f6786a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f7 = typedValue.getFloat();
        int c7 = c(context, i2);
        int round = Math.round(Color.alpha(c7) * f7);
        int i5 = B.a.f145a;
        if (round < 0 || round > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (c7 & 16777215) | (round << 24);
    }

    public static int c(Context context, int i2) {
        int[] iArr = f6792g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f6792g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = O6.g.K(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
