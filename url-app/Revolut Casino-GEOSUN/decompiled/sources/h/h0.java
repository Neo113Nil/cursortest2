package h;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import d.AbstractC0110a;
import p.AbstractC0215a;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2192a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2193b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2194c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2195d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2196e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2197f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f2198g = new int[1];

    public static int a(Context context, int i2) {
        ColorStateList c2 = c(context, i2);
        if (c2 != null && c2.isStateful()) {
            return c2.getColorForState(f2193b, c2.getDefaultColor());
        }
        ThreadLocal threadLocal = f2192a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        int b2 = b(context, i2);
        int round = Math.round(Color.alpha(b2) * f2);
        int i3 = AbstractC0215a.f2806a;
        if (round < 0 || round > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (b2 & 16777215) | (round << 24);
    }

    public static int b(Context context, int i2) {
        int[] iArr = f2198g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList c(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f2198g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                Object obj = AbstractC0110a.f1784a;
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
