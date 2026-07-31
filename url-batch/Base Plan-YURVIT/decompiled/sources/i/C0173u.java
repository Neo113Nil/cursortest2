package i;

import B0.C0008i;
import a.AbstractC0086a;
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
import d.AbstractC0119a;
import e.AbstractC0121a;

/* renamed from: i.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173u {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2320a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f2321b;

    /* renamed from: c, reason: collision with root package name */
    public j0 f2322c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f2323d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f2324e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f2325f;

    /* renamed from: g, reason: collision with root package name */
    public j0 f2326g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f2327h;

    /* renamed from: i, reason: collision with root package name */
    public final C0175w f2328i;

    /* renamed from: j, reason: collision with root package name */
    public int f2329j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2330k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f2331l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2332m;

    public C0173u(TextView textView) {
        this.f2320a = textView;
        this.f2328i = new C0175w(textView);
    }

    public static j0 c(Context context, C0168o c0168o, int i2) {
        ColorStateList f2;
        synchronized (c0168o) {
            f2 = c0168o.f2277a.f(context, i2);
        }
        if (f2 == null) {
            return null;
        }
        j0 j0Var = new j0();
        j0Var.f2252d = true;
        j0Var.f2249a = f2;
        return j0Var;
    }

    public final void a(Drawable drawable, j0 j0Var) {
        if (drawable == null || j0Var == null) {
            return;
        }
        C0168o.c(drawable, j0Var, this.f2320a.getDrawableState());
    }

    public final void b() {
        j0 j0Var = this.f2321b;
        TextView textView = this.f2320a;
        if (j0Var != null || this.f2322c != null || this.f2323d != null || this.f2324e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2321b);
            a(compoundDrawables[1], this.f2322c);
            a(compoundDrawables[2], this.f2323d);
            a(compoundDrawables[3], this.f2324e);
        }
        if (this.f2325f == null && this.f2326g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2325f);
        a(compoundDrawablesRelative[2], this.f2326g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0346, code lost:
    
        if (r3 != null) goto L224;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i2) {
        C0168o c0168o;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        int i3;
        float f2;
        ColorStateList colorStateList;
        int resourceId;
        int autoSizeStepGranularity;
        int i4;
        int resourceId2;
        int[] iArr = AbstractC0119a.f1793g;
        int[] iArr2 = AbstractC0119a.f1805s;
        C0175w c0175w = this.f2328i;
        TextView textView = this.f2320a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0168o.f2275b;
        synchronized (C0168o.class) {
            try {
                if (C0168o.f2276c == null) {
                    C0168o.b();
                }
                c0168o = C0168o.f2276c;
            } catch (Throwable th) {
                throw th;
            }
        }
        C0008i D2 = C0008i.D(context, attributeSet, AbstractC0119a.f1792f, i2);
        TypedArray typedArray = (TypedArray) D2.f84f;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2321b = c(context, c0168o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2322c = c(context, c0168o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f2323d = c(context, c0168o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2324e = c(context, c0168o, typedArray.getResourceId(2, 0));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f2325f = c(context, c0168o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f2326g = c(context, c0168o, typedArray.getResourceId(6, 0));
        }
        D2.G();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0008i c0008i = new C0008i(context, obtainStyledAttributes);
            if (z4 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = obtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            f(context, c0008i);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i5 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            c0008i.G();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        C0008i c0008i2 = new C0008i(context, obtainStyledAttributes2);
        if (!z4 && obtainStyledAttributes2.hasValue(14)) {
            z3 = obtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        boolean z5 = z3;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i5 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0008i2);
        c0008i2.G();
        if (!z4 && z2) {
            this.f2320a.setAllCaps(z5);
        }
        Typeface typeface = this.f2331l;
        if (typeface != null) {
            if (this.f2330k == -1) {
                textView.setTypeface(typeface, this.f2329j);
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
        Context context2 = c0175w.f2349j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0175w.f2340a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!obtainStyledAttributes3.hasValue(3) || (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            i3 = 0;
            f2 = -1.0f;
        } else {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            f2 = -1.0f;
            int[] iArr3 = new int[length];
            if (length > 0) {
                i3 = 0;
                for (int i6 = 0; i6 < length; i6++) {
                    iArr3[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                c0175w.f2345f = C0175w.b(iArr3);
                c0175w.h();
            } else {
                i3 = 0;
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (c0175w.f2340a == 1) {
            if (!c0175w.f2346g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f2) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == f2) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == f2) {
                    dimension = 1.0f;
                }
                c0175w.i(dimension2, dimension3, dimension);
            }
            c0175w.g();
        }
        if (C.c.f159b && c0175w.f2340a != 0) {
            int[] iArr4 = c0175w.f2345f;
            if (iArr4.length > 0) {
                autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != f2) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c0175w.f2343d), Math.round(c0175w.f2344e), Math.round(c0175w.f2342c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a2 = resourceId4 != -1 ? c0168o.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a3 = resourceId5 != -1 ? c0168o.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a4 = resourceId6 != -1 ? c0168o.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a5 = resourceId7 != -1 ? c0168o.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a6 = resourceId8 != -1 ? c0168o.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a7 = resourceId9 != -1 ? c0168o.a(context, resourceId9) : null;
        if (a6 != null || a7 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a6 == null) {
                a6 = compoundDrawablesRelative[i3];
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
            Drawable drawable = compoundDrawablesRelative2[i3];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a2 == null) {
                    a2 = compoundDrawables[i3];
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
            if (obtainStyledAttributes4.hasValue(11) && (resourceId = obtainStyledAttributes4.getResourceId(11, i3)) != 0) {
                Object obj = AbstractC0121a.f1852a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes4.getColorStateList(11);
            C.n.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            C.n.g(textView, AbstractC0178z.c(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(14, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(17, -1);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            AbstractC0086a.E(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            AbstractC0086a.F(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0119a.f1805s);
        C0008i c0008i = new C0008i(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f2320a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0008i);
        if (i3 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        c0008i.G();
        Typeface typeface = this.f2331l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2329j);
        }
    }

    public final void f(Context context, C0008i c0008i) {
        String string;
        Typeface create;
        Typeface create2;
        int i2 = this.f2329j;
        TypedArray typedArray = (TypedArray) c0008i.f84f;
        this.f2329j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f2330k = i4;
            if (i4 != -1) {
                this.f2329j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2332m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f2331l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f2331l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f2331l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2331l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f2330k;
        int i8 = this.f2329j;
        if (!context.isRestricted()) {
            try {
                Typeface w2 = c0008i.w(i6, this.f2329j, new C0172t(this, i7, i8));
                if (w2 != null) {
                    if (i3 < 28 || this.f2330k == -1) {
                        this.f2331l = w2;
                    } else {
                        create2 = Typeface.create(Typeface.create(w2, 0), this.f2330k, (this.f2329j & 2) != 0);
                        this.f2331l = create2;
                    }
                }
                this.f2332m = this.f2331l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2331l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2330k == -1) {
            this.f2331l = Typeface.create(string, this.f2329j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f2330k, (this.f2329j & 2) != 0);
            this.f2331l = create;
        }
    }
}
