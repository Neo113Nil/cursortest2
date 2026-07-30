package h;

import L.C0026b;
import a.AbstractC0069a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import c.AbstractC0098a;
import d.AbstractC0110a;

/* renamed from: h.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166t {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2285a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f2286b;

    /* renamed from: c, reason: collision with root package name */
    public j0 f2287c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f2288d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f2289e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f2290f;

    /* renamed from: g, reason: collision with root package name */
    public j0 f2291g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f2292h;

    /* renamed from: i, reason: collision with root package name */
    public final C0168v f2293i;

    /* renamed from: j, reason: collision with root package name */
    public int f2294j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2295k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f2296l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2297m;

    public C0166t(TextView textView) {
        this.f2285a = textView;
        this.f2293i = new C0168v(textView);
    }

    public static j0 c(Context context, C0162o c0162o, int i2) {
        ColorStateList f2;
        synchronized (c0162o) {
            f2 = c0162o.f2249a.f(context, i2);
        }
        if (f2 == null) {
            return null;
        }
        j0 j0Var = new j0();
        j0Var.f2224d = true;
        j0Var.f2221a = f2;
        return j0Var;
    }

    public final void a(Drawable drawable, j0 j0Var) {
        if (drawable == null || j0Var == null) {
            return;
        }
        C0162o.c(drawable, j0Var, this.f2285a.getDrawableState());
    }

    public final void b() {
        j0 j0Var = this.f2286b;
        TextView textView = this.f2285a;
        if (j0Var != null || this.f2287c != null || this.f2288d != null || this.f2289e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2286b);
            a(compoundDrawables[1], this.f2287c);
            a(compoundDrawables[2], this.f2288d);
            a(compoundDrawables[3], this.f2289e);
        }
        if (this.f2290f == null && this.f2291g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2290f);
        a(compoundDrawablesRelative[2], this.f2291g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0331, code lost:
    
        if (r3 != null) goto L221;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i2) {
        C0162o c0162o;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        boolean z4;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int autoSizeStepGranularity;
        int i4;
        int resourceId2;
        TextView textView = this.f2285a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0162o.f2247b;
        synchronized (C0162o.class) {
            try {
                if (C0162o.f2248c == null) {
                    C0162o.b();
                }
                c0162o = C0162o.f2248c;
            } catch (Throwable th) {
                throw th;
            }
        }
        C0026b E2 = C0026b.E(context, attributeSet, AbstractC0098a.f1645f, i2);
        TypedArray typedArray = (TypedArray) E2.f520f;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2286b = c(context, c0162o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2287c = c(context, c0162o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f2288d = c(context, c0162o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2289e = c(context, c0162o, typedArray.getResourceId(2, 0));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f2290f = c(context, c0162o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f2291g = c(context, c0162o, typedArray.getResourceId(6, 0));
        }
        E2.H();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr = AbstractC0098a.f1657s;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr);
            C0026b c0026b = new C0026b(context, obtainStyledAttributes);
            if (z5 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = obtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            f(context, c0026b);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i5 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            c0026b.H();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        C0026b c0026b2 = new C0026b(context, obtainStyledAttributes2);
        if (z5 || !obtainStyledAttributes2.hasValue(14)) {
            z4 = z3;
        } else {
            z4 = obtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i5 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0026b2);
        c0026b2.H();
        if (!z5 && z2) {
            this.f2285a.setAllCaps(z4);
        }
        Typeface typeface = this.f2296l;
        if (typeface != null) {
            if (this.f2295k == -1) {
                textView.setTypeface(typeface, this.f2294j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            textView.setFontVariationSettings(str);
        }
        if (str2 != null) {
            textView.setTextLocales(LocaleList.forLanguageTags(str2));
        }
        int[] iArr2 = AbstractC0098a.f1646g;
        C0168v c0168v = this.f2293i;
        Context context2 = c0168v.f2321j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0168v.f2312a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr3[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                c0168v.f2317f = C0168v.b(iArr3);
                c0168v.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (c0168v.f2312a == 1) {
            if (!c0168v.f2318g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0168v.i(dimension2, dimension3, dimension);
            }
            c0168v.g();
        }
        if (A.c.f11a && c0168v.f2312a != 0) {
            int[] iArr4 = c0168v.f2317f;
            if (iArr4.length > 0) {
                autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c0168v.f2315d), Math.round(c0168v.f2316e), Math.round(c0168v.f2314c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr2);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a2 = resourceId4 != -1 ? c0162o.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a3 = resourceId5 != -1 ? c0162o.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a4 = resourceId6 != -1 ? c0162o.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a5 = resourceId7 != -1 ? c0162o.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a6 = resourceId8 != -1 ? c0162o.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a7 = resourceId9 != -1 ? c0162o.a(context, resourceId9) : null;
        if (a6 != null || a7 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a6 == null) {
                a6 = compoundDrawablesRelative[0];
            }
            if (a3 == null) {
                a3 = compoundDrawablesRelative[1];
            }
            if (a7 == null) {
                a7 = compoundDrawablesRelative[2];
            }
            if (a5 == null) {
                a5 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a6, a3, a7, a5);
        } else if (a2 != null || a3 != null || a4 != null || a5 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a2 == null) {
                    a2 = compoundDrawables[0];
                }
                if (a3 == null) {
                    a3 = compoundDrawables[1];
                }
                if (a4 == null) {
                    a4 = compoundDrawables[2];
                }
                if (a5 == null) {
                    a5 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(a2, a3, a4, a5);
            } else {
                if (a3 == null) {
                    a3 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (a5 == null) {
                    a5 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a3, drawable2, a5);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (obtainStyledAttributes4.hasValue(11) && (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) != 0) {
                Object obj = AbstractC0110a.f1784a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes4.getColorStateList(11);
            A.o.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i3 = -1;
            A.o.g(textView, AbstractC0171y.c(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i3 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(14, i3);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(17, i3);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(18, i3);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i3) {
            AbstractC0069a.D(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i3) {
            AbstractC0069a.E(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i3) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void e(Context context, int i2) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0098a.f1657s);
        C0026b c0026b = new C0026b(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f2285a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0026b);
        if (i3 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        c0026b.H();
        Typeface typeface = this.f2296l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2294j);
        }
    }

    public final void f(Context context, C0026b c0026b) {
        String string;
        Typeface create;
        Typeface create2;
        int i2 = this.f2294j;
        TypedArray typedArray = (TypedArray) c0026b.f520f;
        this.f2294j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f2295k = i4;
            if (i4 != -1) {
                this.f2294j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2297m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f2296l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f2296l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f2296l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2296l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f2295k;
        int i8 = this.f2294j;
        if (!context.isRestricted()) {
            try {
                Typeface y2 = c0026b.y(i6, this.f2294j, new C0165s(this, i7, i8));
                if (y2 != null) {
                    if (i3 < 28 || this.f2295k == -1) {
                        this.f2296l = y2;
                    } else {
                        create2 = Typeface.create(Typeface.create(y2, 0), this.f2295k, (this.f2294j & 2) != 0);
                        this.f2296l = create2;
                    }
                }
                this.f2297m = this.f2296l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2296l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2295k == -1) {
            this.f2296l = Typeface.create(string, this.f2294j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f2295k, (this.f2294j & 2) != 0);
            this.f2296l = create;
        }
    }
}
