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
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import f.AbstractC0410a;
import g.AbstractC0432a;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1232s {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f14090a;

    /* renamed from: b, reason: collision with root package name */
    public G3.h f14091b;

    /* renamed from: c, reason: collision with root package name */
    public G3.h f14092c;

    /* renamed from: d, reason: collision with root package name */
    public G3.h f14093d;

    /* renamed from: e, reason: collision with root package name */
    public G3.h f14094e;

    /* renamed from: f, reason: collision with root package name */
    public G3.h f14095f;

    /* renamed from: g, reason: collision with root package name */
    public G3.h f14096g;

    /* renamed from: h, reason: collision with root package name */
    public G3.h f14097h;

    /* renamed from: i, reason: collision with root package name */
    public final C1234u f14098i;

    /* renamed from: j, reason: collision with root package name */
    public int f14099j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f14100k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f14101l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14102m;

    public C1232s(TextView textView) {
        this.f14090a = textView;
        this.f14098i = new C1234u(textView);
    }

    public static G3.h c(Context context, C1227n c1227n, int i4) {
        ColorStateList f4;
        synchronized (c1227n) {
            f4 = c1227n.f14051a.f(context, i4);
        }
        if (f4 == null) {
            return null;
        }
        G3.h hVar = new G3.h();
        hVar.f908b = true;
        hVar.f909c = f4;
        return hVar;
    }

    public final void a(Drawable drawable, G3.h hVar) {
        if (drawable == null || hVar == null) {
            return;
        }
        C1227n.c(drawable, hVar, this.f14090a.getDrawableState());
    }

    public final void b() {
        G3.h hVar = this.f14091b;
        TextView textView = this.f14090a;
        if (hVar != null || this.f14092c != null || this.f14093d != null || this.f14094e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f14091b);
            a(compoundDrawables[1], this.f14092c);
            a(compoundDrawables[2], this.f14093d);
            a(compoundDrawables[3], this.f14094e);
        }
        if (this.f14095f == null && this.f14096g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f14095f);
        a(compoundDrawablesRelative[2], this.f14096g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0346, code lost:
    
        if (r3 != null) goto L224;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i4) {
        C1227n c1227n;
        boolean z;
        boolean z4;
        String str;
        String str2;
        int i5;
        float f4;
        ColorStateList colorStateList;
        int resourceId;
        int autoSizeStepGranularity;
        int i6;
        int resourceId2;
        int[] iArr = AbstractC0410a.f8476g;
        int[] iArr2 = AbstractC0410a.f8486s;
        C1234u c1234u = this.f14098i;
        TextView textView = this.f14090a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C1227n.f14049b;
        synchronized (C1227n.class) {
            try {
                if (C1227n.f14050c == null) {
                    C1227n.b();
                }
                c1227n = C1227n.f14050c;
            } catch (Throwable th) {
                throw th;
            }
        }
        B1.j v = B1.j.v(context, attributeSet, AbstractC0410a.f8475f, i4);
        TypedArray typedArray = (TypedArray) v.f202c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f14091b = c(context, c1227n, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f14092c = c(context, c1227n, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f14093d = c(context, c1227n, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f14094e = c(context, c1227n, typedArray.getResourceId(2, 0));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f14095f = c(context, c1227n, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f14096g = c(context, c1227n, typedArray.getResourceId(6, 0));
        }
        v.x();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            B1.j jVar = new B1.j(context, obtainStyledAttributes);
            if (z5 || !obtainStyledAttributes.hasValue(14)) {
                z = false;
                z4 = false;
            } else {
                z4 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            f(context, jVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i7 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            jVar.x();
        } else {
            z = false;
            z4 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        B1.j jVar2 = new B1.j(context, obtainStyledAttributes2);
        if (!z5 && obtainStyledAttributes2.hasValue(14)) {
            z4 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z6 = z4;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i7 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i7 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, jVar2);
        jVar2.x();
        if (!z5 && z) {
            this.f14090a.setAllCaps(z6);
        }
        Typeface typeface = this.f14101l;
        if (typeface != null) {
            if (this.f14100k == -1) {
                textView.setTypeface(typeface, this.f14099j);
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
        Context context2 = c1234u.f14119j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i4, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            c1234u.f14110a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!obtainStyledAttributes3.hasValue(3) || (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            i5 = 0;
            f4 = -1.0f;
        } else {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            f4 = -1.0f;
            int[] iArr3 = new int[length];
            if (length > 0) {
                i5 = 0;
                for (int i8 = 0; i8 < length; i8++) {
                    iArr3[i8] = obtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                c1234u.f14115f = C1234u.b(iArr3);
                c1234u.h();
            } else {
                i5 = 0;
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (c1234u.f14110a == 1) {
            if (!c1234u.f14116g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f4) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == f4) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == f4) {
                    dimension = 1.0f;
                }
                c1234u.i(dimension2, dimension3, dimension);
            }
            c1234u.g();
        }
        if (H.b.f1058u0 && c1234u.f14110a != 0) {
            int[] iArr4 = c1234u.f14115f;
            if (iArr4.length > 0) {
                autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != f4) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c1234u.f14113d), Math.round(c1234u.f14114e), Math.round(c1234u.f14112c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a3 = resourceId4 != -1 ? c1227n.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a4 = resourceId5 != -1 ? c1227n.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a5 = resourceId6 != -1 ? c1227n.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a6 = resourceId7 != -1 ? c1227n.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a7 = resourceId8 != -1 ? c1227n.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a8 = resourceId9 != -1 ? c1227n.a(context, resourceId9) : null;
        if (a7 != null || a8 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a7 == null) {
                a7 = compoundDrawablesRelative[i5];
            }
            if (a4 == null) {
                a4 = compoundDrawablesRelative[1];
            }
            if (a8 == null) {
                a8 = compoundDrawablesRelative[2];
            }
            if (a6 == null) {
                a6 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a7, a4, a8, a6);
        } else if (a3 != null || a4 != null || a5 != null || a6 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[i5];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a3 == null) {
                    a3 = compoundDrawables[i5];
                }
                if (a4 == null) {
                    a4 = compoundDrawables[1];
                }
                if (a5 == null) {
                    a5 = compoundDrawables[2];
                }
                if (a6 == null) {
                    a6 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(a3, a4, a5, a6);
            } else {
                if (a4 == null) {
                    a4 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (a6 == null) {
                    a6 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a4, drawable2, a6);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (obtainStyledAttributes4.hasValue(11) && (resourceId = obtainStyledAttributes4.getResourceId(11, i5)) != 0) {
                Object obj = AbstractC0432a.f8818a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes4.getColorStateList(11);
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC1237x.c(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(14, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(17, -1);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            AbstractC0347t0.r(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            AbstractC0347t0.s(textView, dimensionPixelSize2);
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

    public final void e(Context context, int i4) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, AbstractC0410a.f8486s);
        B1.j jVar = new B1.j(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f14090a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, jVar);
        if (i5 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        jVar.x();
        Typeface typeface = this.f14101l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f14099j);
        }
    }

    public final void f(Context context, B1.j jVar) {
        String string;
        Typeface create;
        Typeface create2;
        int i4 = this.f14099j;
        TypedArray typedArray = (TypedArray) jVar.f202c;
        this.f14099j = typedArray.getInt(2, i4);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int i6 = typedArray.getInt(11, -1);
            this.f14100k = i6;
            if (i6 != -1) {
                this.f14099j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f14102m = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 == 1) {
                    this.f14101l = Typeface.SANS_SERIF;
                    return;
                } else if (i7 == 2) {
                    this.f14101l = Typeface.SERIF;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.f14101l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f14101l = null;
        int i8 = typedArray.hasValue(12) ? 12 : 10;
        int i9 = this.f14100k;
        int i10 = this.f14099j;
        if (!context.isRestricted()) {
            try {
                Typeface p2 = jVar.p(i8, this.f14099j, new N3.A(this, i9, i10));
                if (p2 != null) {
                    if (i5 < 28 || this.f14100k == -1) {
                        this.f14101l = p2;
                    } else {
                        create2 = Typeface.create(Typeface.create(p2, 0), this.f14100k, (this.f14099j & 2) != 0);
                        this.f14101l = create2;
                    }
                }
                this.f14102m = this.f14101l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f14101l != null || (string = typedArray.getString(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f14100k == -1) {
            this.f14101l = Typeface.create(string, this.f14099j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f14100k, (this.f14099j & 2) != 0);
            this.f14101l = create;
        }
    }
}
