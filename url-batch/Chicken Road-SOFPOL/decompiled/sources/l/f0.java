package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f4232a;

    /* renamed from: b, reason: collision with root package name */
    public x1 f4233b;

    /* renamed from: c, reason: collision with root package name */
    public x1 f4234c;

    /* renamed from: d, reason: collision with root package name */
    public x1 f4235d;

    /* renamed from: e, reason: collision with root package name */
    public x1 f4236e;

    /* renamed from: f, reason: collision with root package name */
    public x1 f4237f;

    /* renamed from: g, reason: collision with root package name */
    public x1 f4238g;

    /* renamed from: h, reason: collision with root package name */
    public x1 f4239h;
    public final o0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f4240j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f4241k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f4242l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4243m;

    public f0(TextView textView) {
        this.f4232a = textView;
        this.i = new o0(textView);
    }

    public static x1 c(Context context, s sVar, int i) {
        ColorStateList f6;
        synchronized (sVar) {
            f6 = sVar.f4403a.f(context, i);
        }
        if (f6 == null) {
            return null;
        }
        x1 x1Var = new x1();
        x1Var.f4455d = true;
        x1Var.f4452a = f6;
        return x1Var;
    }

    public final void a(Drawable drawable, x1 x1Var) {
        if (drawable == null || x1Var == null) {
            return;
        }
        s.d(drawable, x1Var, this.f4232a.getDrawableState());
    }

    public final void b() {
        x1 x1Var = this.f4233b;
        TextView textView = this.f4232a;
        if (x1Var != null || this.f4234c != null || this.f4235d != null || this.f4236e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f4233b);
            a(compoundDrawables[1], this.f4234c);
            a(compoundDrawables[2], this.f4235d);
            a(compoundDrawables[3], this.f4236e);
        }
        if (this.f4237f == null && this.f4238g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f4237f);
        a(compoundDrawablesRelative[2], this.f4238g);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i) {
        s sVar;
        boolean z3;
        boolean z7;
        String str;
        String str2;
        float f6;
        float f8;
        char c8;
        int i8;
        float f9;
        int i9;
        ColorStateList colorStateList;
        int resourceId;
        int i10;
        int resourceId2;
        int[] iArr = h.a.f3055g;
        int[] iArr2 = h.a.f3065r;
        o0 o0Var = this.i;
        TextView textView = this.f4232a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = s.f4401b;
        synchronized (s.class) {
            try {
                if (s.f4402c == null) {
                    s.c();
                }
                sVar = s.f4402c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr3 = h.a.f3054f;
        a0.g1 E = a0.g1.E(context, attributeSet, iArr3, i);
        TextView textView2 = this.f4232a;
        q3.k0.j(textView2, textView2.getContext(), iArr3, attributeSet, (TypedArray) E.f85c, i);
        TypedArray typedArray = (TypedArray) E.f85c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f4233b = c(context, sVar, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f4234c = c(context, sVar, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f4235d = c(context, sVar, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f4236e = c(context, sVar, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f4237f = c(context, sVar, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f4238g = c(context, sVar, typedArray.getResourceId(6, 0));
        }
        E.G();
        boolean z8 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            a0.g1 g1Var = new a0.g1(context, obtainStyledAttributes);
            if (z8 || !obtainStyledAttributes.hasValue(14)) {
                z3 = false;
                z7 = false;
            } else {
                z3 = obtainStyledAttributes.getBoolean(14, false);
                z7 = true;
            }
            k(context, g1Var);
            int i11 = Build.VERSION.SDK_INT;
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i11 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            g1Var.G();
        } else {
            z3 = false;
            z7 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        a0.g1 g1Var2 = new a0.g1(context, obtainStyledAttributes2);
        if (!z8 && obtainStyledAttributes2.hasValue(14)) {
            z3 = obtainStyledAttributes2.getBoolean(14, false);
            z7 = true;
        }
        boolean z9 = z3;
        int i12 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i12 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i12 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, g1Var2);
        g1Var2.G();
        if (!z8 && z7) {
            this.f4232a.setAllCaps(z9);
        }
        Typeface typeface = this.f4242l;
        if (typeface != null) {
            if (this.f4241k == -1) {
                textView.setTypeface(typeface, this.f4240j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            d0.d(textView, str);
        }
        if (str2 != null) {
            c0.b(textView, c0.a(str2));
        }
        Context context2 = o0Var.f4372j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView3 = o0Var.i;
        q3.k0.j(textView3, textView3.getContext(), iArr, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            o0Var.f4364a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(1)) {
            f8 = obtainStyledAttributes3.getDimension(1, -1.0f);
            f6 = -1.0f;
        } else {
            f6 = -1.0f;
            f8 = -1.0f;
        }
        if (!obtainStyledAttributes3.hasValue(3) || (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            c8 = 3;
        } else {
            c8 = 3;
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr4[i13] = obtainTypedArray.getDimensionPixelSize(i13, -1);
                }
                o0Var.f4369f = o0.b(iArr4);
                o0Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!o0Var.j()) {
            o0Var.f4364a = 0;
        } else if (o0Var.f4364a == 1) {
            if (!o0Var.f4370g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f6) {
                    i10 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i10 = 2;
                }
                if (f8 == f6) {
                    f8 = TypedValue.applyDimension(i10, 112.0f, displayMetrics);
                }
                float f10 = f8;
                if (dimension == f6) {
                    dimension = 1.0f;
                }
                o0Var.k(dimension2, f10, dimension);
            }
            o0Var.h();
        }
        if (p2.f4378a && o0Var.f4364a != 0) {
            int[] iArr5 = o0Var.f4369f;
            if (iArr5.length > 0) {
                if (d0.a(textView) != f6) {
                    d0.b(textView, Math.round(o0Var.f4367d), Math.round(o0Var.f4368e), Math.round(o0Var.f4366c), 0);
                } else {
                    d0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a8 = resourceId4 != -1 ? sVar.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a9 = resourceId5 != -1 ? sVar.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a10 = resourceId6 != -1 ? sVar.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a11 = resourceId7 != -1 ? sVar.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a12 = resourceId8 != -1 ? sVar.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a13 = resourceId9 != -1 ? sVar.a(context, resourceId9) : null;
        if (a12 != null || a13 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a12 == null) {
                a12 = compoundDrawablesRelative[0];
            }
            if (a9 == null) {
                a9 = compoundDrawablesRelative[1];
            }
            if (a13 == null) {
                a13 = compoundDrawablesRelative[2];
            }
            if (a11 == null) {
                a11 = compoundDrawablesRelative[c8];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a12, a9, a13, a11);
        } else if (a8 != null || a9 != null || a10 != null || a11 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a8 == null) {
                    a8 = compoundDrawables[0];
                }
                if (a9 == null) {
                    a9 = compoundDrawables[1];
                }
                if (a10 == null) {
                    a10 = compoundDrawables[2];
                }
                if (a11 == null) {
                    a11 = compoundDrawables[c8];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(a8, a9, a10, a11);
            } else {
                if (a9 == null) {
                    a9 = compoundDrawablesRelative2[1];
                }
                if (a11 == null) {
                    a11 = compoundDrawablesRelative2[c8];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a9, compoundDrawablesRelative2[2], a11);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = s6.a.q(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(r0.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i14 = peekValue.data;
                int i15 = i14 & 15;
                f9 = TypedValue.complexToFloat(i14);
                i9 = i15;
                i8 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i8) {
                    r2.o.k0(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i8) {
                    r2.o.l0(textView, dimensionPixelSize2);
                }
                if (f9 == f6) {
                    if (i9 == i8) {
                        r2.o.m0(textView, (int) f9);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        q3.v.k(textView, i9, f9);
                        return;
                    } else {
                        r2.o.m0(textView, Math.round(TypedValue.applyDimension(i9, f9, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i8 = -1;
            f9 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i8 = -1;
            f9 = f6;
        }
        i9 = i8;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i8) {
        }
        if (dimensionPixelSize2 != i8) {
        }
        if (f9 == f6) {
        }
    }

    public final void e(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, h.a.f3065r);
        a0.g1 g1Var = new a0.g1(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f4232a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(context, g1Var);
        if (i8 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            d0.d(textView, string);
        }
        g1Var.G();
        Typeface typeface = this.f4242l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f4240j);
        }
    }

    public final void f(int i, int i8, int i9, int i10) {
        o0 o0Var = this.i;
        if (o0Var.j()) {
            DisplayMetrics displayMetrics = o0Var.f4372j.getResources().getDisplayMetrics();
            o0Var.k(TypedValue.applyDimension(i10, i, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (o0Var.h()) {
                o0Var.a();
            }
        }
    }

    public final void g(int[] iArr, int i) {
        o0 o0Var = this.i;
        if (o0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = o0Var.f4372j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr2[i8] = Math.round(TypedValue.applyDimension(i, iArr[i8], displayMetrics));
                    }
                }
                o0Var.f4369f = o0.b(iArr2);
                if (!o0Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                o0Var.f4370g = false;
            }
            if (o0Var.h()) {
                o0Var.a();
            }
        }
    }

    public final void h(int i) {
        o0 o0Var = this.i;
        if (o0Var.j()) {
            if (i == 0) {
                o0Var.f4364a = 0;
                o0Var.f4367d = -1.0f;
                o0Var.f4368e = -1.0f;
                o0Var.f4366c = -1.0f;
                o0Var.f4369f = new int[0];
                o0Var.f4365b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(a0.q.h("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = o0Var.f4372j.getResources().getDisplayMetrics();
            o0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (o0Var.h()) {
                o0Var.a();
            }
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f4239h == null) {
            this.f4239h = new x1();
        }
        x1 x1Var = this.f4239h;
        x1Var.f4452a = colorStateList;
        x1Var.f4455d = colorStateList != null;
        this.f4233b = x1Var;
        this.f4234c = x1Var;
        this.f4235d = x1Var;
        this.f4236e = x1Var;
        this.f4237f = x1Var;
        this.f4238g = x1Var;
    }

    public final void j(PorterDuff.Mode mode) {
        if (this.f4239h == null) {
            this.f4239h = new x1();
        }
        x1 x1Var = this.f4239h;
        x1Var.f4453b = mode;
        x1Var.f4454c = mode != null;
        this.f4233b = x1Var;
        this.f4234c = x1Var;
        this.f4235d = x1Var;
        this.f4236e = x1Var;
        this.f4237f = x1Var;
        this.f4238g = x1Var;
    }

    public final void k(Context context, a0.g1 g1Var) {
        String string;
        int i = this.f4240j;
        TypedArray typedArray = (TypedArray) g1Var.f85c;
        this.f4240j = typedArray.getInt(2, i);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = typedArray.getInt(11, -1);
            this.f4241k = i9;
            if (i9 != -1) {
                this.f4240j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f4243m = false;
                int i10 = typedArray.getInt(1, 1);
                if (i10 == 1) {
                    this.f4242l = Typeface.SANS_SERIF;
                    return;
                } else if (i10 == 2) {
                    this.f4242l = Typeface.SERIF;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f4242l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f4242l = null;
        int i11 = typedArray.hasValue(12) ? 12 : 10;
        int i12 = this.f4241k;
        int i13 = this.f4240j;
        if (!context.isRestricted()) {
            try {
                Typeface r7 = g1Var.r(i11, this.f4240j, new b0(this, i12, i13, new WeakReference(this.f4232a)));
                if (r7 != null) {
                    if (i8 < 28 || this.f4241k == -1) {
                        this.f4242l = r7;
                    } else {
                        this.f4242l = e0.a(Typeface.create(r7, 0), this.f4241k, (this.f4240j & 2) != 0);
                    }
                }
                this.f4243m = this.f4242l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f4242l != null || (string = typedArray.getString(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f4241k == -1) {
            this.f4242l = Typeface.create(string, this.f4240j);
        } else {
            this.f4242l = e0.a(Typeface.create(string, 0), this.f4241k, (this.f4240j & 2) != 0);
        }
    }
}
