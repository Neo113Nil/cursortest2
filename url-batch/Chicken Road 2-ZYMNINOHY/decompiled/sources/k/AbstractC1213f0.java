package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import g.AbstractC0432a;
import x.AbstractC1512a;

/* renamed from: k.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1213f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f14002a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f14003b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f14004c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f14005d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f14006e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f14007f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f14008g = new int[1];

    public static int a(Context context, int i4) {
        ColorStateList c4 = c(context, i4);
        if (c4 != null && c4.isStateful()) {
            return c4.getColorForState(f14003b, c4.getDefaultColor());
        }
        ThreadLocal threadLocal = f14002a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f4 = typedValue.getFloat();
        int b4 = b(context, i4);
        int round = Math.round(Color.alpha(b4) * f4);
        int i5 = AbstractC1512a.f15953a;
        if (round < 0 || round > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (b4 & 16777215) | (round << 24);
    }

    public static int b(Context context, int i4) {
        int[] iArr = f14008g;
        iArr[0] = i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList c(Context context, int i4) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f14008g;
        iArr[0] = i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                Object obj = AbstractC0432a.f8818a;
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
