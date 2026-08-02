package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import h.AbstractC0337a;
import x.AbstractC1237a;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f9811a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f9812b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f9813c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9814d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9815e = {R.attr.state_checked};
    public static final int[] f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f9816g = new int[1];

    public static int a(Context context, int i3) {
        ColorStateList c3 = c(context, i3);
        if (c3 != null && c3.isStateful()) {
            return c3.getColorForState(f9812b, c3.getDefaultColor());
        }
        ThreadLocal threadLocal = f9811a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f3 = typedValue.getFloat();
        int b3 = b(context, i3);
        int round = Math.round(Color.alpha(b3) * f3);
        int i4 = AbstractC1237a.f10692a;
        if (round < 0 || round > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (b3 & 16777215) | (round << 24);
    }

    public static int b(Context context, int i3) {
        int[] iArr = f9816g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList c(Context context, int i3) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f9816g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                Object obj = AbstractC0337a.f5053a;
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
