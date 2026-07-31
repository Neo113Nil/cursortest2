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

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4426a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f4427b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f4428c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4429d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f4430e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f4431f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f4432g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(h.a.f3056h);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList d8 = d(context, i);
        if (d8 != null && d8.isStateful()) {
            return d8.getColorForState(f4427b, d8.getDefaultColor());
        }
        ThreadLocal threadLocal = f4426a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f6 = typedValue.getFloat();
        return i3.a.d(c(context, i), Math.round(Color.alpha(r4) * f6));
    }

    public static int c(Context context, int i) {
        int[] iArr = f4432g;
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
        int[] iArr = f4432g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = s6.a.q(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
