package defpackage;

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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xg {
    public final TextView a;
    public e10 b;
    public e10 c;
    public e10 d;
    public e10 e;
    public e10 f;
    public e10 g;
    public e10 h;
    public final gh i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public xg(TextView textView) {
        this.a = textView;
        this.i = new gh(textView);
    }

    public static e10 c(Context context, tf tfVar, int i) {
        ColorStateList f;
        synchronized (tfVar) {
            f = tfVar.a.f(context, i);
        }
        if (f == null) {
            return null;
        }
        e10 e10Var = new e10();
        e10Var.b = true;
        e10Var.c = f;
        return e10Var;
    }

    public final void a(Drawable drawable, e10 e10Var) {
        if (drawable == null || e10Var == null) {
            return;
        }
        tf.d(drawable, e10Var, this.a.getDrawableState());
    }

    public final void b() {
        e10 e10Var = this.b;
        TextView textView = this.a;
        if (e10Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        e10 e10Var = this.h;
        if (e10Var != null) {
            return (ColorStateList) e10Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        e10 e10Var = this.h;
        if (e10Var != null) {
            return (PorterDuff.Mode) e10Var.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        int i2;
        float f;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int i4;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        tf a = tf.a();
        int[] iArr = b62.h;
        mh z3 = mh.z(context, attributeSet, iArr, i);
        e53.h(textView, textView.getContext(), iArr, attributeSet, (TypedArray) z3.n, i);
        TypedArray typedArray = (TypedArray) z3.n;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a, typedArray.getResourceId(6, 0));
        }
        z3.B();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = b62.v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            mh mhVar = new mh(context, obtainStyledAttributes);
            if (z4 || !obtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m(context, mhVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (Build.VERSION.SDK_INT < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            mhVar.B();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        mh mhVar2 = new mh(context, obtainStyledAttributes2);
        if (!z4 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z5 = z2;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, mhVar2);
        mhVar2.B();
        if (!z4 && z) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            vg.d(textView, str);
        }
        if (str2 != null) {
            ug.b(textView, ug.a(str2));
        }
        gh ghVar = this.i;
        Context context2 = ghVar.j;
        int[] iArr3 = b62.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = ghVar.i;
        e53.h(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            ghVar.a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                ghVar.f = gh.b(iArr4);
                ghVar.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!ghVar.j()) {
            ghVar.a = 0;
        } else if (ghVar.a == 1) {
            if (!ghVar.g) {
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
                float f2 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                ghVar.k(dimension2, f2, dimension);
            }
            ghVar.h();
        }
        if (c63.c && ghVar.a != 0) {
            int[] iArr5 = ghVar.f;
            if (iArr5.length > 0) {
                if (vg.a(textView) != -1.0f) {
                    vg.b(textView, Math.round(ghVar.d), Math.round(ghVar.e), Math.round(ghVar.c), 0);
                } else {
                    vg.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b = resourceId4 != -1 ? a.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b2 = resourceId5 != -1 ? a.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b3 = resourceId6 != -1 ? a.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b4 = resourceId7 != -1 ? a.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b5 = resourceId8 != -1 ? a.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b6 = resourceId9 != -1 ? a.b(context, resourceId9) : null;
        if (b5 != null || b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b5 == null) {
                b5 = compoundDrawablesRelative[0];
            }
            if (b2 == null) {
                b2 = compoundDrawablesRelative[1];
            }
            if (b6 == null) {
                b6 = compoundDrawablesRelative[2];
            }
            if (b4 == null) {
                b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b5, b2, b6, b4);
        } else if (b != null || b2 != null || b3 != null || b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b == null) {
                    b = compoundDrawables[0];
                }
                if (b2 == null) {
                    b2 = compoundDrawables[1];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[2];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, b4);
            } else {
                if (b2 == null) {
                    b2 = compoundDrawablesRelative2[1];
                }
                if (b4 == null) {
                    b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b2, compoundDrawablesRelative2[2], b4);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = j8.D(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(he0.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i7 = peekValue.data;
                int i8 = i7 & 15;
                f = TypedValue.complexToFloat(i7);
                i3 = i8;
                i2 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i2) {
                    ti2.j(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i2) {
                    ti2.k(textView, dimensionPixelSize2);
                }
                if (f == -1.0f) {
                    if (i3 == i2) {
                        ti2.l(textView, (int) f);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        v1.p(textView, i3, f);
                        return;
                    } else {
                        ti2.l(textView, Math.round(TypedValue.applyDimension(i3, f, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i2 = -1;
            f = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i2 = -1;
            f = -1.0f;
        }
        i3 = i2;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i2) {
        }
        if (dimensionPixelSize2 != i2) {
        }
        if (f == -1.0f) {
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, b62.v);
        mh mhVar = new mh(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, mhVar);
        if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            vg.d(textView, string);
        }
        mhVar.B();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        gh ghVar = this.i;
        if (ghVar.j()) {
            DisplayMetrics displayMetrics = ghVar.j.getResources().getDisplayMetrics();
            ghVar.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (ghVar.h()) {
                ghVar.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        gh ghVar = this.i;
        if (ghVar.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = ghVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                ghVar.f = gh.b(iArr2);
                if (!ghVar.i()) {
                    lh.d(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                ghVar.g = false;
            }
            if (ghVar.h()) {
                ghVar.a();
            }
        }
    }

    public final void j(int i) {
        gh ghVar = this.i;
        if (ghVar.j()) {
            if (i == 0) {
                ghVar.a = 0;
                ghVar.d = -1.0f;
                ghVar.e = -1.0f;
                ghVar.c = -1.0f;
                ghVar.f = new int[0];
                ghVar.b = false;
                return;
            }
            if (i != 1) {
                lh.e(in1.k(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = ghVar.j.getResources().getDisplayMetrics();
            ghVar.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (ghVar.h()) {
                ghVar.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new e10();
        }
        e10 e10Var = this.h;
        e10Var.c = colorStateList;
        e10Var.b = colorStateList != null;
        this.b = e10Var;
        this.c = e10Var;
        this.d = e10Var;
        this.e = e10Var;
        this.f = e10Var;
        this.g = e10Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new e10();
        }
        e10 e10Var = this.h;
        e10Var.d = mode;
        e10Var.a = mode != null;
        this.b = e10Var;
        this.c = e10Var;
        this.d = e10Var;
        this.e = e10Var;
        this.f = e10Var;
        this.g = e10Var;
    }

    public final void m(Context context, mh mhVar) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) mhVar.n;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface s = mhVar.s(i5, this.j, new sg(this, i6, i7, new WeakReference(this.a)));
                if (s != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = s;
                    } else {
                        this.l = wg.a(Typeface.create(s, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = wg.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
