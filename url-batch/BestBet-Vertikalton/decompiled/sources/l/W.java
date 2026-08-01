package l;

import G1.AbstractC0001b;
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
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import u0.C0372k;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3342a;

    /* renamed from: b, reason: collision with root package name */
    public S0 f3343b;

    /* renamed from: c, reason: collision with root package name */
    public S0 f3344c;
    public S0 d;

    /* renamed from: e, reason: collision with root package name */
    public S0 f3345e;

    /* renamed from: f, reason: collision with root package name */
    public S0 f3346f;

    /* renamed from: g, reason: collision with root package name */
    public S0 f3347g;
    public S0 h;
    public final C0235g0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f3348j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3349k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f3350l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3351m;

    public W(TextView textView) {
        this.f3342a = textView;
        this.i = new C0235g0(textView);
    }

    public static S0 c(Context context, C0260t c0260t, int i) {
        ColorStateList f2;
        synchronized (c0260t) {
            f2 = c0260t.f3469a.f(context, i);
        }
        if (f2 == null) {
            return null;
        }
        S0 s0 = new S0();
        s0.f3337b = true;
        s0.f3338c = f2;
        return s0;
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
            H1.d.o0(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            H1.d.o0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            H1.d.o0(editorInfo, text, i4, i2);
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
        H1.d.o0(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i9, i10 + min + i9), min2, i10);
    }

    public final void a(Drawable drawable, S0 s0) {
        if (drawable == null || s0 == null) {
            return;
        }
        C0260t.e(drawable, s0, this.f3342a.getDrawableState());
    }

    public final void b() {
        S0 s0 = this.f3343b;
        TextView textView = this.f3342a;
        if (s0 != null || this.f3344c != null || this.d != null || this.f3345e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f3343b);
            a(compoundDrawables[1], this.f3344c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f3345e);
        }
        if (this.f3346f == null && this.f3347g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f3346f);
        a(compoundDrawablesRelative[2], this.f3347g);
    }

    public final ColorStateList d() {
        S0 s0 = this.h;
        if (s0 != null) {
            return (ColorStateList) s0.f3338c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        S0 s0 = this.h;
        if (s0 != null) {
            return (PorterDuff.Mode) s0.d;
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
        TextView textView = this.f3342a;
        Context context = textView.getContext();
        C0260t a2 = C0260t.a();
        int[] iArr = f.a.h;
        C0372k j2 = C0372k.j(context, attributeSet, iArr, i);
        K.Q.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) j2.f4191b, i);
        TypedArray typedArray = (TypedArray) j2.f4191b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f3343b = c(context, a2, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f3344c = c(context, a2, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a2, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f3345e = c(context, a2, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f3346f = c(context, a2, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f3347g = c(context, a2, typedArray.getResourceId(6, 0));
        }
        j2.l();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f2532v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0372k c0372k = new C0372k(context, obtainStyledAttributes);
            if (z4 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            n(context, c0372k);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
                i6 = 13;
            } else {
                i6 = 13;
                str2 = null;
            }
            str = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getString(i6) : null;
            c0372k.l();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0372k c0372k2 = new C0372k(context, obtainStyledAttributes2);
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
            textView.setTextSize(0, RecyclerView.f1937A0);
        }
        n(context, c0372k2);
        c0372k2.l();
        if (!z4 && z3) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f3350l;
        if (typeface != null) {
            if (this.f3349k == -1) {
                textView.setTypeface(typeface, this.f3348j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            U.d(textView, str);
        }
        if (str2 != null) {
            T.b(textView, T.a(str2));
        }
        int[] iArr3 = f.a.i;
        C0235g0 c0235g0 = this.i;
        Context context2 = c0235g0.f3397j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0235g0.i;
        K.Q.k(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0235g0.f3391a = obtainStyledAttributes3.getInt(5, 0);
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
                c0235g0.f3395f = C0235g0.b(iArr4);
                c0235g0.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c0235g0.j()) {
            c0235g0.f3391a = 0;
        } else if (c0235g0.f3391a == 1) {
            if (!c0235g0.f3396g) {
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
                c0235g0.k(dimension2, dimension3, dimension);
            }
            c0235g0.h();
        }
        if (h1.f3405c && c0235g0.f3391a != 0) {
            int[] iArr5 = c0235g0.f3395f;
            if (iArr5.length > 0) {
                if (U.a(textView) != -1.0f) {
                    U.b(textView, Math.round(c0235g0.d), Math.round(c0235g0.f3394e), Math.round(c0235g0.f3393c), 0);
                } else {
                    U.c(textView, iArr5, 0);
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
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = H1.d.z(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            Q.m.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i2 = -1;
            Q.m.g(textView, AbstractC0245l0.b(obtainStyledAttributes4.getInt(12, -1), null));
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
            H1.d.k0(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i3) {
            H1.d.m0(textView, dimensionPixelSize2);
        }
        if (f2 != -1.0f) {
            if (i4 == i3) {
                H1.d.n0(textView, (int) f2);
            } else if (Build.VERSION.SDK_INT >= 34) {
                Q.p.a(textView, i4, f2);
            } else {
                H1.d.n0(textView, Math.round(TypedValue.applyDimension(i4, f2, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, f.a.f2532v);
        C0372k c0372k = new C0372k(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f3342a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, RecyclerView.f1937A0);
        }
        n(context, c0372k);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            U.d(textView, string);
        }
        c0372k.l();
        Typeface typeface = this.f3350l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3348j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        C0235g0 c0235g0 = this.i;
        if (c0235g0.j()) {
            DisplayMetrics displayMetrics = c0235g0.f3397j.getResources().getDisplayMetrics();
            c0235g0.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0235g0.h()) {
                c0235g0.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        C0235g0 c0235g0 = this.i;
        if (c0235g0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0235g0.f3397j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0235g0.f3395f = C0235g0.b(iArr2);
                if (!c0235g0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0235g0.f3396g = false;
            }
            if (c0235g0.h()) {
                c0235g0.a();
            }
        }
    }

    public final void k(int i) {
        C0235g0 c0235g0 = this.i;
        if (c0235g0.j()) {
            if (i == 0) {
                c0235g0.f3391a = 0;
                c0235g0.d = -1.0f;
                c0235g0.f3394e = -1.0f;
                c0235g0.f3393c = -1.0f;
                c0235g0.f3395f = new int[0];
                c0235g0.f3392b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(AbstractC0001b.f("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = c0235g0.f3397j.getResources().getDisplayMetrics();
            c0235g0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0235g0.h()) {
                c0235g0.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new S0();
        }
        S0 s0 = this.h;
        s0.f3338c = colorStateList;
        s0.f3337b = colorStateList != null;
        this.f3343b = s0;
        this.f3344c = s0;
        this.d = s0;
        this.f3345e = s0;
        this.f3346f = s0;
        this.f3347g = s0;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new S0();
        }
        S0 s0 = this.h;
        s0.d = mode;
        s0.f3336a = mode != null;
        this.f3343b = s0;
        this.f3344c = s0;
        this.d = s0;
        this.f3345e = s0;
        this.f3346f = s0;
        this.f3347g = s0;
    }

    public final void n(Context context, C0372k c0372k) {
        String string;
        int i = this.f3348j;
        TypedArray typedArray = (TypedArray) c0372k.f4191b;
        this.f3348j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f3349k = i3;
            if (i3 != -1) {
                this.f3348j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f3351m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f3350l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f3350l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f3350l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3350l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f3349k;
        int i7 = this.f3348j;
        if (!context.isRestricted()) {
            try {
                Typeface f2 = c0372k.f(i5, this.f3348j, new C0221S(this, i6, i7, new WeakReference(this.f3342a)));
                if (f2 != null) {
                    if (i2 < 28 || this.f3349k == -1) {
                        this.f3350l = f2;
                    } else {
                        this.f3350l = V.a(Typeface.create(f2, 0), this.f3349k, (this.f3348j & 2) != 0);
                    }
                }
                this.f3351m = this.f3350l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3350l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3349k == -1) {
            this.f3350l = Typeface.create(string, this.f3348j);
        } else {
            this.f3350l = V.a(Typeface.create(string, 0), this.f3349k, (this.f3348j & 2) != 0);
        }
    }
}
