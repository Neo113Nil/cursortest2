package l;

import K.C0011l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2907a;

    /* renamed from: b, reason: collision with root package name */
    public S0 f2908b;

    /* renamed from: c, reason: collision with root package name */
    public S0 f2909c;
    public S0 d;

    /* renamed from: e, reason: collision with root package name */
    public S0 f2910e;

    /* renamed from: f, reason: collision with root package name */
    public S0 f2911f;

    /* renamed from: g, reason: collision with root package name */
    public S0 f2912g;
    public S0 h;
    public final C0212g0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f2913j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2914k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f2915l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2916m;

    public X(TextView textView) {
        this.f2907a = textView;
        this.i = new C0212g0(textView);
    }

    public static S0 c(Context context, C0237t c0237t, int i) {
        ColorStateList f2;
        synchronized (c0237t) {
            f2 = c0237t.f3035a.f(context, i);
        }
        if (f2 == null) {
            return null;
        }
        S0 s02 = new S0();
        s02.f2899b = true;
        s02.f2900c = f2;
        return s02;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            P.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            P.a.a(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            u1.d.f0(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            u1.d.f0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            u1.d.f0(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int min = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int min2 = Math.min(i4, i8 - min);
        int i9 = i4 - min2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
            min--;
        }
        int i10 = min2 + i7;
        u1.d.f0(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i9, i10 + min + i9), min2, i10);
    }

    public final void a(Drawable drawable, S0 s02) {
        if (drawable == null || s02 == null) {
            return;
        }
        C0237t.e(drawable, s02, this.f2907a.getDrawableState());
    }

    public final void b() {
        S0 s02 = this.f2908b;
        TextView textView = this.f2907a;
        if (s02 != null || this.f2909c != null || this.d != null || this.f2910e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2908b);
            a(compoundDrawables[1], this.f2909c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f2910e);
        }
        if (this.f2911f == null && this.f2912g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2911f);
        a(compoundDrawablesRelative[2], this.f2912g);
    }

    public final ColorStateList d() {
        S0 s02 = this.h;
        if (s02 != null) {
            return (ColorStateList) s02.f2900c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        S0 s02 = this.h;
        if (s02 != null) {
            return (PorterDuff.Mode) s02.d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        int i2;
        int i3;
        int i4;
        float f2;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        int i6;
        TextView textView = this.f2907a;
        Context context = textView.getContext();
        C0237t a2 = C0237t.a();
        int[] iArr = f.a.h;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, i);
        K.S.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) r2.f405c, i);
        TypedArray typedArray = (TypedArray) r2.f405c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2908b = c(context, a2, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2909c = c(context, a2, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a2, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2910e = c(context, a2, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f2911f = c(context, a2, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f2912g = c(context, a2, typedArray.getResourceId(6, 0));
        }
        r2.t();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f2050v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0011l c0011l = new C0011l(context, obtainStyledAttributes);
            if (z4 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            n(context, c0011l);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
                i6 = 13;
            } else {
                i6 = 13;
                str2 = null;
            }
            str = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getString(i6) : null;
            c0011l.t();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0011l c0011l2 = new C0011l(context, obtainStyledAttributes2);
        if (!z4 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        boolean z5 = z2;
        int i7 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i7 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c0011l2);
        c0011l2.t();
        if (!z4 && z3) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f2915l;
        if (typeface != null) {
            if (this.f2914k == -1) {
                textView.setTypeface(typeface, this.f2913j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            V.d(textView, str);
        }
        if (str2 != null) {
            U.b(textView, U.a(str2));
        }
        int[] iArr3 = f.a.i;
        C0212g0 c0212g0 = this.i;
        Context context2 = c0212g0.f2961j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0212g0.i;
        K.S.k(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0212g0.f2955a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr4[i8] = obtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                c0212g0.f2959f = C0212g0.b(iArr4);
                c0212g0.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c0212g0.j()) {
            c0212g0.f2955a = 0;
        } else if (c0212g0.f2955a == 1) {
            if (!c0212g0.f2960g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i5 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0212g0.k(dimension2, dimension3, dimension);
            }
            c0212g0.h();
        }
        if (h1.f2969c && c0212g0.f2955a != 0) {
            int[] iArr5 = c0212g0.f2959f;
            if (iArr5.length > 0) {
                if (V.a(textView) != -1.0f) {
                    V.b(textView, Math.round(c0212g0.d), Math.round(c0212g0.f2958e), Math.round(c0212g0.f2957c), 0);
                } else {
                    V.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b2 = resourceId4 != -1 ? a2.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b3 = resourceId5 != -1 ? a2.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b4 = resourceId6 != -1 ? a2.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b5 = resourceId7 != -1 ? a2.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b6 = resourceId8 != -1 ? a2.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b7 = resourceId9 != -1 ? a2.b(context, resourceId9) : null;
        if (b6 != null || b7 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b6 == null) {
                b6 = compoundDrawablesRelative[0];
            }
            if (b3 == null) {
                b3 = compoundDrawablesRelative[1];
            }
            if (b7 == null) {
                b7 = compoundDrawablesRelative[2];
            }
            if (b5 == null) {
                b5 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b6, b3, b7, b5);
        } else if (b2 != null || b3 != null || b4 != null || b5 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b2 == null) {
                    b2 = compoundDrawables[0];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[1];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[2];
                }
                if (b5 == null) {
                    b5 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, b5);
            } else {
                if (b3 == null) {
                    b3 = compoundDrawablesRelative2[1];
                }
                if (b5 == null) {
                    b5 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b3, compoundDrawablesRelative2[2], b5);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = u1.d.A(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            Q.m.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i2 = -1;
            Q.m.g(textView, AbstractC0222l0.b(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i2 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, i2);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, i2);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue == null || peekValue.type != 5) {
                i3 = -1;
                f2 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i4 = -1;
            } else {
                int i9 = peekValue.data;
                int i10 = i9 & 15;
                f2 = TypedValue.complexToFloat(i9);
                i4 = i10;
                i3 = -1;
            }
        } else {
            i3 = -1;
            i4 = -1;
            f2 = -1.0f;
        }
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i3) {
            u1.d.a0(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i3) {
            u1.d.c0(textView, dimensionPixelSize2);
        }
        if (f2 != -1.0f) {
            if (i4 == i3) {
                u1.d.d0(textView, (int) f2);
            } else if (Build.VERSION.SDK_INT >= 34) {
                Q.p.a(textView, i4, f2);
            } else {
                u1.d.d0(textView, Math.round(TypedValue.applyDimension(i4, f2, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, f.a.f2050v);
        C0011l c0011l = new C0011l(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f2907a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c0011l);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            V.d(textView, string);
        }
        c0011l.t();
        Typeface typeface = this.f2915l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2913j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        C0212g0 c0212g0 = this.i;
        if (c0212g0.j()) {
            DisplayMetrics displayMetrics = c0212g0.f2961j.getResources().getDisplayMetrics();
            c0212g0.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0212g0.h()) {
                c0212g0.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        C0212g0 c0212g0 = this.i;
        if (c0212g0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0212g0.f2961j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0212g0.f2959f = C0212g0.b(iArr2);
                if (!c0212g0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0212g0.f2960g = false;
            }
            if (c0212g0.h()) {
                c0212g0.a();
            }
        }
    }

    public final void k(int i) {
        C0212g0 c0212g0 = this.i;
        if (c0212g0.j()) {
            if (i == 0) {
                c0212g0.f2955a = 0;
                c0212g0.d = -1.0f;
                c0212g0.f2958e = -1.0f;
                c0212g0.f2957c = -1.0f;
                c0212g0.f2959f = new int[0];
                c0212g0.f2956b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(X.V.d("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = c0212g0.f2961j.getResources().getDisplayMetrics();
            c0212g0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0212g0.h()) {
                c0212g0.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new S0();
        }
        S0 s02 = this.h;
        s02.f2900c = colorStateList;
        s02.f2899b = colorStateList != null;
        this.f2908b = s02;
        this.f2909c = s02;
        this.d = s02;
        this.f2910e = s02;
        this.f2911f = s02;
        this.f2912g = s02;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new S0();
        }
        S0 s02 = this.h;
        s02.d = mode;
        s02.f2898a = mode != null;
        this.f2908b = s02;
        this.f2909c = s02;
        this.d = s02;
        this.f2910e = s02;
        this.f2911f = s02;
        this.f2912g = s02;
    }

    public final void n(Context context, C0011l c0011l) {
        String string;
        int i = this.f2913j;
        TypedArray typedArray = (TypedArray) c0011l.f405c;
        this.f2913j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f2914k = i3;
            if (i3 != -1) {
                this.f2913j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2916m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f2915l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f2915l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f2915l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2915l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f2914k;
        int i7 = this.f2913j;
        if (!context.isRestricted()) {
            try {
                Typeface j2 = c0011l.j(i5, this.f2913j, new C0198S(this, i6, i7, new WeakReference(this.f2907a)));
                if (j2 != null) {
                    if (i2 < 28 || this.f2914k == -1) {
                        this.f2915l = j2;
                    } else {
                        this.f2915l = W.a(Typeface.create(j2, 0), this.f2914k, (this.f2913j & 2) != 0);
                    }
                }
                this.f2916m = this.f2915l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2915l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2914k == -1) {
            this.f2915l = Typeface.create(string, this.f2913j);
        } else {
            this.f2915l = W.a(Typeface.create(string, 0), this.f2914k, (this.f2913j & 2) != 0);
        }
    }
}
