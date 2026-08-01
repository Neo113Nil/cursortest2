package m;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f6146a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f6147b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f6148c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f6149d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f6150e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f6151f = new int[0];
    public static final int[] g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i.a.f4546h);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i3) {
        ColorStateList d10 = d(context, i3);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f6147b, d10.getDefaultColor());
        }
        ThreadLocal threadLocal = f6146a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f3 = typedValue.getFloat();
        int c10 = c(context, i3);
        int round = Math.round(Color.alpha(c10) * f3);
        int i10 = h3.a.f4441a;
        if (round >= 0 && round <= 255) {
            return (c10 & 16777215) | (round << 24);
        }
        te.a1.e("alpha must be between 0 and 255.");
        return 0;
    }

    public static int c(Context context, int i3) {
        int[] iArr = g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i3) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = g;
        iArr[0] = i3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = z4.w.t(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
