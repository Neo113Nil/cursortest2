package l;

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
import g.AbstractC0328a;
import h.AbstractC0337a;

/* renamed from: l.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1097t {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f9897a;

    /* renamed from: b, reason: collision with root package name */
    public j0 f9898b;

    /* renamed from: c, reason: collision with root package name */
    public j0 f9899c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f9900d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f9901e;
    public j0 f;

    /* renamed from: g, reason: collision with root package name */
    public j0 f9902g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f9903h;

    /* renamed from: i, reason: collision with root package name */
    public final C1099v f9904i;

    /* renamed from: j, reason: collision with root package name */
    public int f9905j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f9906k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f9907l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9908m;

    public C1097t(TextView textView) {
        this.f9897a = textView;
        this.f9904i = new C1099v(textView);
    }

    public static j0 c(Context context, C1093o c1093o, int i3) {
        ColorStateList f;
        synchronized (c1093o) {
            f = c1093o.f9863a.f(context, i3);
        }
        if (f == null) {
            return null;
        }
        j0 j0Var = new j0();
        j0Var.f9840d = true;
        j0Var.f9837a = f;
        return j0Var;
    }

    public final void a(Drawable drawable, j0 j0Var) {
        if (drawable == null || j0Var == null) {
            return;
        }
        C1093o.c(drawable, j0Var, this.f9897a.getDrawableState());
    }

    public final void b() {
        j0 j0Var = this.f9898b;
        TextView textView = this.f9897a;
        if (j0Var != null || this.f9899c != null || this.f9900d != null || this.f9901e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f9898b);
            a(compoundDrawables[1], this.f9899c);
            a(compoundDrawables[2], this.f9900d);
            a(compoundDrawables[3], this.f9901e);
        }
        if (this.f == null && this.f9902g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.f9902g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0342, code lost:
    
        if (r3 != null) goto L222;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i3) {
        C1093o c1093o;
        boolean z;
        boolean z2;
        String str;
        String str2;
        int i4;
        float f;
        int i5;
        ColorStateList colorStateList;
        int resourceId;
        int autoSizeStepGranularity;
        int i6;
        TextView textView = this.f9897a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C1093o.f9861b;
        synchronized (C1093o.class) {
            try {
                if (C1093o.f9862c == null) {
                    C1093o.b();
                }
                c1093o = C1093o.f9862c;
            } catch (Throwable th) {
                throw th;
            }
        }
        A0.f K2 = A0.f.K(context, attributeSet, AbstractC0328a.f, i3);
        TypedArray typedArray = (TypedArray) K2.f24c;
        int resourceId2 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f9898b = c(context, c1093o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f9899c = c(context, c1093o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f9900d = c(context, c1093o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f9901e = c(context, c1093o, typedArray.getResourceId(2, 0));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f = c(context, c1093o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f9902g = c(context, c1093o, typedArray.getResourceId(6, 0));
        }
        K2.O();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr = AbstractC0328a.f5005s;
        if (resourceId2 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, iArr);
            A0.f fVar = new A0.f(context, obtainStyledAttributes);
            if (z3 || !obtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            f(context, fVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i7 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            fVar.O();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        A0.f fVar2 = new A0.f(context, obtainStyledAttributes2);
        if (!z3 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i7 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i7 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, fVar2);
        fVar2.O();
        if (!z3 && z) {
            this.f9897a.setAllCaps(z4);
        }
        Typeface typeface = this.f9907l;
        if (typeface != null) {
            if (this.f9906k == -1) {
                textView.setTypeface(typeface, this.f9905j);
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
        int[] iArr2 = AbstractC0328a.f4994g;
        C1099v c1099v = this.f9904i;
        Context context2 = c1099v.f9930j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            c1099v.f9922a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3)) {
            f = -1.0f;
            int resourceId3 = obtainStyledAttributes3.getResourceId(3, 0);
            if (resourceId3 > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId3);
                int length = obtainTypedArray.length();
                i4 = 0;
                int[] iArr3 = new int[length];
                if (length > 0) {
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr3[i8] = obtainTypedArray.getDimensionPixelSize(i8, -1);
                    }
                    c1099v.f = C1099v.b(iArr3);
                    c1099v.h();
                }
                obtainTypedArray.recycle();
            } else {
                i4 = 0;
            }
        } else {
            i4 = 0;
            f = -1.0f;
        }
        obtainStyledAttributes3.recycle();
        if (c1099v.f9922a == 1) {
            if (!c1099v.f9927g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == f) {
                    dimension = 1.0f;
                }
                c1099v.i(dimension2, dimension3, dimension);
            }
            c1099v.g();
        }
        if (H.b.f573t0 && c1099v.f9922a != 0) {
            int[] iArr4 = c1099v.f;
            if (iArr4.length > 0) {
                autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c1099v.f9925d), Math.round(c1099v.f9926e), Math.round(c1099v.f9924c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr2);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a3 = resourceId4 != -1 ? c1093o.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a4 = resourceId5 != -1 ? c1093o.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a5 = resourceId6 != -1 ? c1093o.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a6 = resourceId7 != -1 ? c1093o.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a7 = resourceId8 != -1 ? c1093o.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a8 = resourceId9 != -1 ? c1093o.a(context, resourceId9) : null;
        if (a7 != null || a8 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a7 == null) {
                a7 = compoundDrawablesRelative[i4];
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
            Drawable drawable = compoundDrawablesRelative2[i4];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a3 == null) {
                    a3 = compoundDrawables[i4];
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
            if (obtainStyledAttributes4.hasValue(11) && (resourceId = obtainStyledAttributes4.getResourceId(11, i4)) != 0) {
                Object obj = AbstractC0337a.f5053a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes4.getColorStateList(11);
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i5 = -1;
            textView.setCompoundDrawableTintMode(AbstractC1103z.c(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i5 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(14, i5);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(17, i5);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(18, i5);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i5) {
            android.support.v4.media.session.a.M(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i5) {
            android.support.v4.media.session.a.N(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i5) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void e(Context context, int i3) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC0328a.f5005s);
        A0.f fVar = new A0.f(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f9897a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, fVar);
        if (i4 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        fVar.O();
        Typeface typeface = this.f9907l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f9905j);
        }
    }

    public final void f(Context context, A0.f fVar) {
        String string;
        Typeface create;
        Typeface create2;
        int i3 = this.f9905j;
        TypedArray typedArray = (TypedArray) fVar.f24c;
        this.f9905j = typedArray.getInt(2, i3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = typedArray.getInt(11, -1);
            this.f9906k = i5;
            if (i5 != -1) {
                this.f9905j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f9908m = false;
                int i6 = typedArray.getInt(1, 1);
                if (i6 == 1) {
                    this.f9907l = Typeface.SANS_SERIF;
                    return;
                } else if (i6 == 2) {
                    this.f9907l = Typeface.SERIF;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f9907l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f9907l = null;
        int i7 = typedArray.hasValue(12) ? 12 : 10;
        int i8 = this.f9906k;
        int i9 = this.f9905j;
        if (!context.isRestricted()) {
            try {
                Typeface D3 = fVar.D(i7, this.f9905j, new C1096s(this, i8, i9));
                if (D3 != null) {
                    if (i4 < 28 || this.f9906k == -1) {
                        this.f9907l = D3;
                    } else {
                        create2 = Typeface.create(Typeface.create(D3, 0), this.f9906k, (this.f9905j & 2) != 0);
                        this.f9907l = create2;
                    }
                }
                this.f9908m = this.f9907l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f9907l != null || (string = typedArray.getString(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f9906k == -1) {
            this.f9907l = Typeface.create(string, this.f9905j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f9906k, (this.f9905j & 2) != 0);
            this.f9907l = create;
        }
    }
}
