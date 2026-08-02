package j;

import B0.C0031i;
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
import c.AbstractC0165a;
import java.util.Locale;

/* renamed from: j.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0244u {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3053a;

    /* renamed from: b, reason: collision with root package name */
    public l0 f3054b;

    /* renamed from: c, reason: collision with root package name */
    public l0 f3055c;

    /* renamed from: d, reason: collision with root package name */
    public l0 f3056d;

    /* renamed from: e, reason: collision with root package name */
    public l0 f3057e;

    /* renamed from: f, reason: collision with root package name */
    public l0 f3058f;

    /* renamed from: g, reason: collision with root package name */
    public l0 f3059g;

    /* renamed from: h, reason: collision with root package name */
    public l0 f3060h;

    /* renamed from: i, reason: collision with root package name */
    public final C0247x f3061i;

    /* renamed from: j, reason: collision with root package name */
    public int f3062j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3063k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f3064l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3065m;

    public C0244u(TextView textView) {
        this.f3053a = textView;
        this.f3061i = new C0247x(textView);
    }

    public static l0 c(Context context, C0240p c0240p, int i2) {
        ColorStateList i3;
        synchronized (c0240p) {
            i3 = c0240p.f3026a.i(context, i2);
        }
        if (i3 == null) {
            return null;
        }
        l0 l0Var = new l0();
        l0Var.f3003d = true;
        l0Var.f3000a = i3;
        return l0Var;
    }

    public final void a(Drawable drawable, l0 l0Var) {
        if (drawable == null || l0Var == null) {
            return;
        }
        C0240p.c(drawable, l0Var, this.f3053a.getDrawableState());
    }

    public final void b() {
        l0 l0Var = this.f3054b;
        TextView textView = this.f3053a;
        if (l0Var != null || this.f3055c != null || this.f3056d != null || this.f3057e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f3054b);
            a(compoundDrawables[1], this.f3055c);
            a(compoundDrawables[2], this.f3056d);
            a(compoundDrawables[3], this.f3057e);
        }
        if (this.f3058f == null && this.f3059g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f3058f);
        a(compoundDrawablesRelative[2], this.f3059g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0451 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i2) {
        C0240p c0240p;
        String str;
        boolean z2;
        boolean z3;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        String str2;
        boolean z4;
        int i3;
        C0247x c0247x;
        TypedArray obtainStyledAttributes;
        int i4;
        float f2;
        int i5;
        float f3;
        TypedArray obtainStyledAttributes2;
        Drawable a2;
        Drawable a3;
        Drawable a4;
        Drawable a5;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        ColorStateList colorStateList4;
        int resourceId;
        int[] iArr;
        int autoSizeStepGranularity;
        int i6;
        int resourceId2;
        int length;
        LocaleList forLanguageTags;
        int i7;
        int i8;
        int i9;
        TextView textView = this.f3053a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0240p.f3024b;
        synchronized (C0240p.class) {
            try {
                if (C0240p.f3025c == null) {
                    C0240p.b();
                }
                c0240p = C0240p.f3025c;
            } catch (Throwable th) {
                throw th;
            }
        }
        C0031i J = C0031i.J(context, attributeSet, AbstractC0165a.f1968f, i2);
        TypedArray typedArray = (TypedArray) J.f154f;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f3054b = c(context, c0240p, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f3055c = c(context, c0240p, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f3056d = c(context, c0240p, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f3057e = c(context, c0240p, typedArray.getResourceId(2, 0));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f3058f = c(context, c0240p, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f3059g = c(context, c0240p, typedArray.getResourceId(6, 0));
        }
        J.N();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0165a.f1981s;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId3, iArr2);
            C0031i c0031i = new C0031i(context, obtainStyledAttributes3);
            if (z5 || !obtainStyledAttributes3.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = obtainStyledAttributes3.getBoolean(14, false);
                z2 = true;
            }
            f(context, c0031i);
            if (i10 < 23) {
                colorStateList = obtainStyledAttributes3.hasValue(3) ? c0031i.z(3) : null;
                if (obtainStyledAttributes3.hasValue(4)) {
                    colorStateList2 = c0031i.z(4);
                    i9 = 5;
                } else {
                    i9 = 5;
                    colorStateList2 = null;
                }
                if (obtainStyledAttributes3.hasValue(i9)) {
                    colorStateList3 = c0031i.z(i9);
                    i7 = 15;
                    if (obtainStyledAttributes3.hasValue(i7)) {
                        i8 = 26;
                        str2 = null;
                    } else {
                        str2 = obtainStyledAttributes3.getString(i7);
                        i8 = 26;
                    }
                    str = (i10 >= i8 || !obtainStyledAttributes3.hasValue(13)) ? null : obtainStyledAttributes3.getString(13);
                    c0031i.N();
                } else {
                    i7 = 15;
                }
            } else {
                i7 = 15;
                colorStateList = null;
                colorStateList2 = null;
            }
            colorStateList3 = null;
            if (obtainStyledAttributes3.hasValue(i7)) {
            }
            if (i10 >= i8) {
            }
            c0031i.N();
        } else {
            str = null;
            z2 = false;
            z3 = false;
            colorStateList = null;
            colorStateList2 = null;
            colorStateList3 = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        C0031i c0031i2 = new C0031i(context, obtainStyledAttributes4);
        if (z5 || !obtainStyledAttributes4.hasValue(14)) {
            z4 = z3;
        } else {
            z4 = obtainStyledAttributes4.getBoolean(14, false);
            z2 = true;
        }
        if (i10 < 23) {
            if (obtainStyledAttributes4.hasValue(3)) {
                colorStateList = c0031i2.z(3);
            }
            if (obtainStyledAttributes4.hasValue(4)) {
                colorStateList2 = c0031i2.z(4);
            }
            if (obtainStyledAttributes4.hasValue(5)) {
                colorStateList3 = c0031i2.z(5);
            }
        }
        ColorStateList colorStateList5 = colorStateList;
        ColorStateList colorStateList6 = colorStateList2;
        ColorStateList colorStateList7 = colorStateList3;
        if (obtainStyledAttributes4.hasValue(15)) {
            str2 = obtainStyledAttributes4.getString(15);
        }
        String str3 = str;
        String str4 = str2;
        if (i10 >= 26 && obtainStyledAttributes4.hasValue(13)) {
            str3 = obtainStyledAttributes4.getString(13);
        }
        String str5 = str3;
        if (i10 >= 28 && obtainStyledAttributes4.hasValue(0) && obtainStyledAttributes4.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0031i2);
        c0031i2.N();
        if (colorStateList5 != null) {
            textView.setTextColor(colorStateList5);
        }
        if (colorStateList6 != null) {
            textView.setHintTextColor(colorStateList6);
        }
        if (colorStateList7 != null) {
            textView.setLinkTextColor(colorStateList7);
        }
        if (!z5 && z2) {
            this.f3053a.setAllCaps(z4);
        }
        Typeface typeface = this.f3064l;
        if (typeface != null) {
            if (this.f3063k == -1) {
                textView.setTypeface(typeface, this.f3062j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str5 != null) {
            textView.setFontVariationSettings(str5);
        }
        if (str4 != null) {
            if (i10 < 24) {
                i3 = 0;
                textView.setTextLocale(Locale.forLanguageTag(str4.substring(0, str4.indexOf(44))));
                int[] iArr3 = AbstractC0165a.f1969g;
                c0247x = this.f3061i;
                Context context2 = c0247x.f3100j;
                obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i2, i3);
                if (obtainStyledAttributes.hasValue(5)) {
                    c0247x.f3091a = obtainStyledAttributes.getInt(5, i3);
                }
                float dimension = !obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
                if (obtainStyledAttributes.hasValue(2)) {
                    i4 = 1;
                    f2 = -1.0f;
                } else {
                    f2 = obtainStyledAttributes.getDimension(2, -1.0f);
                    i4 = 1;
                }
                if (obtainStyledAttributes.hasValue(i4)) {
                    i5 = 3;
                    f3 = -1.0f;
                } else {
                    f3 = obtainStyledAttributes.getDimension(i4, -1.0f);
                    i5 = 3;
                }
                if (obtainStyledAttributes.hasValue(i5) && (resourceId2 = obtainStyledAttributes.getResourceId(i5, 0)) > 0) {
                    TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId2);
                    length = obtainTypedArray.length();
                    int[] iArr4 = new int[length];
                    if (length > 0) {
                        for (int i11 = 0; i11 < length; i11++) {
                            iArr4[i11] = obtainTypedArray.getDimensionPixelSize(i11, -1);
                        }
                        c0247x.f3096f = C0247x.b(iArr4);
                        c0247x.h();
                    }
                    obtainTypedArray.recycle();
                }
                obtainStyledAttributes.recycle();
                if (c0247x.f3091a == 1) {
                    if (!c0247x.f3097g) {
                        DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                        if (f2 == -1.0f) {
                            i6 = 2;
                            f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                        } else {
                            i6 = 2;
                        }
                        if (f3 == -1.0f) {
                            f3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                        }
                        if (dimension == -1.0f) {
                            dimension = 1.0f;
                        }
                        c0247x.i(f2, f3, dimension);
                    }
                    c0247x.g();
                }
                if (F.c.f434b && c0247x.f3091a != 0) {
                    iArr = c0247x.f3096f;
                    if (iArr.length > 0) {
                        autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                        if (autoSizeStepGranularity != -1.0f) {
                            textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c0247x.f3094d), Math.round(c0247x.f3095e), Math.round(c0247x.f3093c), 0);
                        } else {
                            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 0);
                        }
                    }
                }
                obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr3);
                int resourceId4 = obtainStyledAttributes2.getResourceId(8, -1);
                Drawable a6 = resourceId4 == -1 ? c0240p.a(context, resourceId4) : null;
                int resourceId5 = obtainStyledAttributes2.getResourceId(13, -1);
                a2 = resourceId5 == -1 ? c0240p.a(context, resourceId5) : null;
                int resourceId6 = obtainStyledAttributes2.getResourceId(9, -1);
                Drawable a7 = resourceId6 == -1 ? c0240p.a(context, resourceId6) : null;
                int resourceId7 = obtainStyledAttributes2.getResourceId(6, -1);
                a3 = resourceId7 == -1 ? c0240p.a(context, resourceId7) : null;
                int resourceId8 = obtainStyledAttributes2.getResourceId(10, -1);
                a4 = resourceId8 == -1 ? c0240p.a(context, resourceId8) : null;
                int resourceId9 = obtainStyledAttributes2.getResourceId(7, -1);
                a5 = resourceId9 == -1 ? c0240p.a(context, resourceId9) : null;
                if (a4 == null || a5 != null) {
                    Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                    if (a4 == null) {
                        a4 = compoundDrawablesRelative[0];
                    }
                    if (a2 == null) {
                        a2 = compoundDrawablesRelative[1];
                    }
                    if (a5 == null) {
                        a5 = compoundDrawablesRelative[2];
                    }
                    if (a3 == null) {
                        a3 = compoundDrawablesRelative[3];
                    }
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a4, a2, a5, a3);
                } else if (a6 != null || a2 != null || a7 != null || a3 != null) {
                    Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
                    Drawable drawable = compoundDrawablesRelative2[0];
                    if (drawable == null && compoundDrawablesRelative2[2] == null) {
                        Drawable[] compoundDrawables = textView.getCompoundDrawables();
                        if (a6 == null) {
                            a6 = compoundDrawables[0];
                        }
                        if (a2 == null) {
                            a2 = compoundDrawables[1];
                        }
                        if (a7 == null) {
                            a7 = compoundDrawables[2];
                        }
                        if (a3 == null) {
                            a3 = compoundDrawables[3];
                        }
                        textView.setCompoundDrawablesWithIntrinsicBounds(a6, a2, a7, a3);
                    } else {
                        if (a2 == null) {
                            a2 = compoundDrawablesRelative2[1];
                        }
                        Drawable drawable2 = compoundDrawablesRelative2[2];
                        if (a3 == null) {
                            a3 = compoundDrawablesRelative2[3];
                        }
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a2, drawable2, a3);
                    }
                }
                if (obtainStyledAttributes2.hasValue(11)) {
                    if (!obtainStyledAttributes2.hasValue(11) || (resourceId = obtainStyledAttributes2.getResourceId(11, 0)) == 0 || (colorStateList4 = d.b.b(context, resourceId)) == null) {
                        colorStateList4 = obtainStyledAttributes2.getColorStateList(11);
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        F.n.f(textView, colorStateList4);
                    } else if (textView instanceof F.r) {
                        ((F.r) textView).setSupportCompoundDrawablesTintList(colorStateList4);
                    }
                }
                if (obtainStyledAttributes2.hasValue(12)) {
                    PorterDuff.Mode d2 = A.d(obtainStyledAttributes2.getInt(12, -1), null);
                    if (Build.VERSION.SDK_INT >= 24) {
                        F.n.g(textView, d2);
                    } else if (textView instanceof F.r) {
                        ((F.r) textView).setSupportCompoundDrawablesTintMode(d2);
                    }
                }
                dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(14, -1);
                dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(17, -1);
                dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(18, -1);
                obtainStyledAttributes2.recycle();
                if (dimensionPixelSize != -1) {
                    i1.a.x(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != -1) {
                    i1.a.y(textView, dimensionPixelSize2);
                }
                if (dimensionPixelSize3 == -1) {
                    if (dimensionPixelSize3 < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                        textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
                        return;
                    }
                    return;
                }
                return;
            }
            forLanguageTags = LocaleList.forLanguageTags(str4);
            textView.setTextLocales(forLanguageTags);
        }
        i3 = 0;
        int[] iArr32 = AbstractC0165a.f1969g;
        c0247x = this.f3061i;
        Context context22 = c0247x.f3100j;
        obtainStyledAttributes = context22.obtainStyledAttributes(attributeSet, iArr32, i2, i3);
        if (obtainStyledAttributes.hasValue(5)) {
        }
        if (!obtainStyledAttributes.hasValue(4)) {
        }
        if (obtainStyledAttributes.hasValue(2)) {
        }
        if (obtainStyledAttributes.hasValue(i4)) {
        }
        if (obtainStyledAttributes.hasValue(i5)) {
            TypedArray obtainTypedArray2 = obtainStyledAttributes.getResources().obtainTypedArray(resourceId2);
            length = obtainTypedArray2.length();
            int[] iArr42 = new int[length];
            if (length > 0) {
            }
            obtainTypedArray2.recycle();
        }
        obtainStyledAttributes.recycle();
        if (c0247x.f3091a == 1) {
        }
        if (F.c.f434b) {
            iArr = c0247x.f3096f;
            if (iArr.length > 0) {
            }
        }
        obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr32);
        int resourceId42 = obtainStyledAttributes2.getResourceId(8, -1);
        if (resourceId42 == -1) {
        }
        int resourceId52 = obtainStyledAttributes2.getResourceId(13, -1);
        if (resourceId52 == -1) {
        }
        int resourceId62 = obtainStyledAttributes2.getResourceId(9, -1);
        if (resourceId62 == -1) {
        }
        int resourceId72 = obtainStyledAttributes2.getResourceId(6, -1);
        if (resourceId72 == -1) {
        }
        int resourceId82 = obtainStyledAttributes2.getResourceId(10, -1);
        if (resourceId82 == -1) {
        }
        int resourceId92 = obtainStyledAttributes2.getResourceId(7, -1);
        if (resourceId92 == -1) {
        }
        if (a4 == null) {
        }
        Drawable[] compoundDrawablesRelative3 = textView.getCompoundDrawablesRelative();
        if (a4 == null) {
        }
        if (a2 == null) {
        }
        if (a5 == null) {
        }
        if (a3 == null) {
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a4, a2, a5, a3);
        if (obtainStyledAttributes2.hasValue(11)) {
        }
        if (obtainStyledAttributes2.hasValue(12)) {
        }
        dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(14, -1);
        dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(17, -1);
        dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(18, -1);
        obtainStyledAttributes2.recycle();
        if (dimensionPixelSize != -1) {
        }
        if (dimensionPixelSize2 != -1) {
        }
        if (dimensionPixelSize3 == -1) {
        }
    }

    public final void e(Context context, int i2) {
        String string;
        ColorStateList z2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0165a.f1981s);
        C0031i c0031i = new C0031i(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f3053a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23 && obtainStyledAttributes.hasValue(3) && (z2 = c0031i.z(3)) != null) {
            textView.setTextColor(z2);
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0031i);
        if (i3 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        c0031i.N();
        Typeface typeface = this.f3064l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3062j);
        }
    }

    public final void f(Context context, C0031i c0031i) {
        String string;
        Typeface create;
        Typeface create2;
        int i2 = this.f3062j;
        TypedArray typedArray = (TypedArray) c0031i.f154f;
        this.f3062j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f3063k = i4;
            if (i4 != -1) {
                this.f3062j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f3065m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f3064l = Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f3064l = Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f3064l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3064l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f3063k;
        int i8 = this.f3062j;
        if (!context.isRestricted()) {
            try {
                Typeface B2 = c0031i.B(i6, this.f3062j, new C0243t(this, i7, i8));
                if (B2 != null) {
                    if (i3 < 28 || this.f3063k == -1) {
                        this.f3064l = B2;
                    } else {
                        create2 = Typeface.create(Typeface.create(B2, 0), this.f3063k, (this.f3062j & 2) != 0);
                        this.f3064l = create2;
                    }
                }
                this.f3065m = this.f3064l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3064l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3063k == -1) {
            this.f3064l = Typeface.create(string, this.f3062j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f3063k, (this.f3062j & 2) != 0);
            this.f3064l = create;
        }
    }
}
