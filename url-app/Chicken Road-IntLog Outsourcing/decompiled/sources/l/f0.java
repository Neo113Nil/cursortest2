package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import h.AbstractC0477a;
import x.AbstractC1526a;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f10858a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f10859b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f10860c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f10861d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f10862e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f10863f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f10864g = new int[1];

    public static int a(Context context, int i2) {
        ColorStateList c2 = c(context, i2);
        if (c2 != null && c2.isStateful()) {
            return c2.getColorForState(f10859b, c2.getDefaultColor());
        }
        ThreadLocal threadLocal = f10858a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f3 = typedValue.getFloat();
        int b6 = b(context, i2);
        int round = Math.round(Color.alpha(b6) * f3);
        int i3 = AbstractC1526a.f12230a;
        if (round < 0 || round > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (b6 & 16777215) | (round << 24);
    }

    public static int b(Context context, int i2) {
        int[] iArr = f10864g;
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
        int[] iArr = f10864g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                Object obj = AbstractC0477a.f5759a;
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
