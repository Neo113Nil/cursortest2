package defpackage;

import android.animation.TimeInterpolator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fny {
    public fny() {
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, pj.j(weight + i3, 1, 1000), typeface.isItalic());
        return create;
    }

    public static int c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static int d(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    public static ColorStateList e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList d;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (d = aat.d(context, resourceId)) == null) ? typedArray.getColorStateList(i) : d;
    }

    public static Drawable f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable f;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (f = e.f(context, resourceId)) == null) ? typedArray.getDrawable(i) : f;
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    public static int i(Context context, int i, int i2) {
        TypedValue k = k(context.getTheme(), i);
        return (k == null || k.type != 16) ? i2 : k.data;
    }

    public static TypedValue j(Context context, int i) {
        return k(context.getTheme(), i);
    }

    public static TypedValue k(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue l(Context context, int i, String str) {
        TypedValue j = j(context, i);
        if (j != null) {
            return j;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean m(Context context, int i, boolean z) {
        return n(context.getTheme(), i, z);
    }

    public static boolean n(Resources.Theme theme, int i, boolean z) {
        TypedValue k = k(theme, i);
        return (k == null || k.type != 18) ? z : k.data != 0;
    }

    public static float o(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }

    public static TimeInterpolator p(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!u(valueOf, "cubic-bezier") && !u(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!u(valueOf, "cubic-bezier")) {
            if (u(valueOf, "path")) {
                return new PathInterpolator(pi.r(t(valueOf, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(valueOf)));
        }
        String[] split = t(valueOf, "cubic-bezier").split(",");
        int length = split.length;
        if (length == 4) {
            return new PathInterpolator(s(split, 0), s(split, 1), s(split, 2), s(split, 3));
        }
        throw new IllegalArgumentException(a.Y(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
    }

    public static acu q(Context context, int i) {
        TypedValue j = j(context, R.attr.motionSpringFastSpatial);
        TypedArray obtainStyledAttributes = j == null ? context.obtainStyledAttributes(null, fkp.a, 0, i) : context.obtainStyledAttributes(j.resourceId, fkp.a);
        acu acuVar = new acu();
        try {
            float f = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            acuVar.e(f);
            acuVar.c(f2);
            return acuVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList r(Context context, byo byoVar, int i) {
        int h;
        ColorStateList d;
        return (!byoVar.p(i) || (h = byoVar.h(i, 0)) == 0 || (d = aat.d(context, h)) == null) ? byoVar.i(i) : d;
    }

    private static float s(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    private static String t(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean u(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public fny(byte[] bArr) {
    }

    public void a(foq foqVar, float f, float f2) {
    }
}
