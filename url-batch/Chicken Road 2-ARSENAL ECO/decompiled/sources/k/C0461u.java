package k;

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
import g.AbstractC0389a;
import h.AbstractC0401a;
import java.lang.ref.WeakReference;

/* renamed from: k.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461u {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f5107a;

    /* renamed from: b, reason: collision with root package name */
    public X5.h f5108b;

    /* renamed from: c, reason: collision with root package name */
    public X5.h f5109c;

    /* renamed from: d, reason: collision with root package name */
    public X5.h f5110d;

    /* renamed from: e, reason: collision with root package name */
    public X5.h f5111e;

    /* renamed from: f, reason: collision with root package name */
    public X5.h f5112f;

    /* renamed from: g, reason: collision with root package name */
    public X5.h f5113g;

    /* renamed from: h, reason: collision with root package name */
    public X5.h f5114h;

    /* renamed from: i, reason: collision with root package name */
    public final C0466z f5115i;

    /* renamed from: j, reason: collision with root package name */
    public int f5116j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f5117k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f5118l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5119m;

    public C0461u(TextView textView) {
        this.f5107a = textView;
        this.f5115i = new C0466z(textView);
    }

    public static X5.h c(Context context, C0456o c0456o, int i7) {
        ColorStateList f7;
        synchronized (c0456o) {
            f7 = c0456o.f5072a.f(context, i7);
        }
        if (f7 == null) {
            return null;
        }
        X5.h hVar = new X5.h();
        hVar.f2937b = true;
        hVar.f2938c = f7;
        return hVar;
    }

    public final void a(Drawable drawable, X5.h hVar) {
        if (drawable == null || hVar == null) {
            return;
        }
        C0456o.c(drawable, hVar, this.f5107a.getDrawableState());
    }

    public final void b() {
        X5.h hVar = this.f5108b;
        TextView textView = this.f5107a;
        if (hVar != null || this.f5109c != null || this.f5110d != null || this.f5111e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f5108b);
            a(compoundDrawables[1], this.f5109c);
            a(compoundDrawables[2], this.f5110d);
            a(compoundDrawables[3], this.f5111e);
        }
        if (this.f5112f == null && this.f5113g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f5112f);
        a(compoundDrawablesRelative[2], this.f5113g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0357, code lost:
    
        if (r3 != null) goto L221;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i7) {
        C0456o c0456o;
        boolean z5;
        boolean z6;
        String str;
        String str2;
        float f7;
        float f8;
        char c7;
        int i8;
        ColorStateList colorStateList;
        int resourceId;
        int autoSizeStepGranularity;
        int i9;
        int resourceId2;
        int[] iArr = AbstractC0389a.f4260g;
        int[] iArr2 = AbstractC0389a.f4271r;
        C0466z c0466z = this.f5115i;
        TextView textView = this.f5107a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0456o.f5070b;
        synchronized (C0456o.class) {
            try {
                if (C0456o.f5071c == null) {
                    C0456o.b();
                }
                c0456o = C0456o.f5071c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr3 = AbstractC0389a.f4259f;
        B0.c r6 = B0.c.r(context, attributeSet, iArr3, i7);
        TextView textView2 = this.f5107a;
        D.D.a(textView2, textView2.getContext(), iArr3, attributeSet, (TypedArray) r6.f73i, i7);
        TypedArray typedArray = (TypedArray) r6.f73i;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f5108b = c(context, c0456o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f5109c = c(context, c0456o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f5110d = c(context, c0456o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f5111e = c(context, c0456o, typedArray.getResourceId(2, 0));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f5112f = c(context, c0456o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f5113g = c(context, c0456o, typedArray.getResourceId(6, 0));
        }
        r6.v();
        boolean z7 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            B0.c cVar = new B0.c(context, obtainStyledAttributes);
            if (z7 || !obtainStyledAttributes.hasValue(14)) {
                z5 = false;
                z6 = false;
            } else {
                z5 = obtainStyledAttributes.getBoolean(14, false);
                z6 = true;
            }
            f(context, cVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i10 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            cVar.v();
        } else {
            z5 = false;
            z6 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        B0.c cVar2 = new B0.c(context, obtainStyledAttributes2);
        if (!z7 && obtainStyledAttributes2.hasValue(14)) {
            z5 = obtainStyledAttributes2.getBoolean(14, false);
            z6 = true;
        }
        boolean z8 = z5;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i10 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i10 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, cVar2);
        cVar2.v();
        if (!z7 && z6) {
            this.f5107a.setAllCaps(z8);
        }
        Typeface typeface = this.f5118l;
        if (typeface != null) {
            if (this.f5117k == -1) {
                textView.setTypeface(typeface, this.f5116j);
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
        Context context2 = c0466z.f5155j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        TextView textView3 = c0466z.f5154i;
        D.D.a(textView3, textView3.getContext(), iArr, attributeSet, obtainStyledAttributes3, i7);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0466z.f5146a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(1)) {
            f8 = obtainStyledAttributes3.getDimension(1, -1.0f);
            f7 = -1.0f;
        } else {
            f7 = -1.0f;
            f8 = -1.0f;
        }
        if (!obtainStyledAttributes3.hasValue(3) || (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            c7 = 3;
            i8 = 0;
        } else {
            c7 = 3;
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            i8 = 0;
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i11 = 0; i11 < length; i11++) {
                    iArr4[i11] = obtainTypedArray.getDimensionPixelSize(i11, -1);
                }
                c0466z.f5151f = C0466z.b(iArr4);
                c0466z.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (c0466z.f5146a == 1) {
            if (!c0466z.f5152g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f7) {
                    i9 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i9 = 2;
                }
                if (f8 == f7) {
                    f8 = TypedValue.applyDimension(i9, 112.0f, displayMetrics);
                }
                if (dimension == f7) {
                    dimension = 1.0f;
                }
                c0466z.i(dimension2, f8, dimension);
            }
            c0466z.g();
        }
        if (I.b.f1133a && c0466z.f5146a != 0) {
            int[] iArr5 = c0466z.f5151f;
            if (iArr5.length > 0) {
                autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != f7) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c0466z.f5149d), Math.round(c0466z.f5150e), Math.round(c0466z.f5148c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a7 = resourceId4 != -1 ? c0456o.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a8 = resourceId5 != -1 ? c0456o.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a9 = resourceId6 != -1 ? c0456o.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a10 = resourceId7 != -1 ? c0456o.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a11 = resourceId8 != -1 ? c0456o.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a12 = resourceId9 != -1 ? c0456o.a(context, resourceId9) : null;
        if (a11 != null || a12 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a11 == null) {
                a11 = compoundDrawablesRelative[i8];
            }
            if (a8 == null) {
                a8 = compoundDrawablesRelative[1];
            }
            if (a12 == null) {
                a12 = compoundDrawablesRelative[2];
            }
            if (a10 == null) {
                a10 = compoundDrawablesRelative[c7];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a11, a8, a12, a10);
        } else if (a7 != null || a8 != null || a9 != null || a10 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[i8];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a7 == null) {
                    a7 = compoundDrawables[i8];
                }
                if (a8 == null) {
                    a8 = compoundDrawables[1];
                }
                if (a9 == null) {
                    a9 = compoundDrawables[2];
                }
                if (a10 == null) {
                    a10 = compoundDrawables[c7];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(a7, a8, a9, a10);
            } else {
                if (a8 == null) {
                    a8 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (a10 == null) {
                    a10 = compoundDrawablesRelative2[c7];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a8, drawable2, a10);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (obtainStyledAttributes4.hasValue(11) && (resourceId = obtainStyledAttributes4.getResourceId(11, i8)) != 0) {
                Object obj = AbstractC0401a.f4318a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes4.getColorStateList(11);
            I.m.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            I.m.g(textView, AbstractC0441C.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(14, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(17, -1);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            A3.c.e0(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            A3.c.f0(textView, dimensionPixelSize2);
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

    public final void e(Context context, int i7) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC0389a.f4271r);
        B0.c cVar = new B0.c(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f5107a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, cVar);
        if (i8 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        cVar.v();
        Typeface typeface = this.f5118l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f5116j);
        }
    }

    public final void f(Context context, B0.c cVar) {
        String string;
        Typeface create;
        Typeface create2;
        int i7 = this.f5116j;
        TypedArray typedArray = (TypedArray) cVar.f73i;
        this.f5116j = typedArray.getInt(2, i7);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = typedArray.getInt(11, -1);
            this.f5117k = i9;
            if (i9 != -1) {
                this.f5116j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f5119m = false;
                int i10 = typedArray.getInt(1, 1);
                if (i10 == 1) {
                    this.f5118l = Typeface.SANS_SERIF;
                    return;
                } else if (i10 == 2) {
                    this.f5118l = Typeface.SERIF;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f5118l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f5118l = null;
        int i11 = typedArray.hasValue(12) ? 12 : 10;
        int i12 = this.f5117k;
        int i13 = this.f5116j;
        if (!context.isRestricted()) {
            try {
                Typeface n7 = cVar.n(i11, this.f5116j, new C0459s(this, i12, i13, new WeakReference(this.f5107a)));
                if (n7 != null) {
                    if (i8 < 28 || this.f5117k == -1) {
                        this.f5118l = n7;
                    } else {
                        create2 = Typeface.create(Typeface.create(n7, 0), this.f5117k, (this.f5116j & 2) != 0);
                        this.f5118l = create2;
                    }
                }
                this.f5119m = this.f5118l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f5118l != null || (string = typedArray.getString(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f5117k == -1) {
            this.f5118l = Typeface.create(string, this.f5116j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f5117k, (this.f5116j & 2) != 0);
            this.f5118l = create;
        }
    }
}
