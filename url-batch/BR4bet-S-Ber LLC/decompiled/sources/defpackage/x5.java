package defpackage;

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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class x5 {
    public final TextView a;
    public cd b;
    public cd c;
    public cd d;
    public cd e;
    public cd f;
    public cd g;
    public cd h;
    public final g6 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public x5(TextView textView) {
        this.a = textView;
        this.i = new g6(textView);
    }

    public static cd c(Context context, r4 r4Var, int i) {
        ColorStateList f;
        synchronized (r4Var) {
            f = r4Var.a.f(context, i);
        }
        if (f == null) {
            return null;
        }
        cd cdVar = new cd();
        cdVar.b = true;
        cdVar.c = f;
        return cdVar;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            f0.e(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            f0.e(editorInfo, text);
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
            la0.b0(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            la0.b0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            la0.b0(editorInfo, text, i4, i2);
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
        la0.b0(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i9, i10 + min + i9), min2, i10);
    }

    public final void a(Drawable drawable, cd cdVar) {
        if (drawable == null || cdVar == null) {
            return;
        }
        r4.e(drawable, cdVar, this.a.getDrawableState());
    }

    public final void b() {
        cd cdVar = this.b;
        TextView textView = this.a;
        if (cdVar != null || this.c != null || this.d != null || this.e != null) {
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
        cd cdVar = this.h;
        if (cdVar != null) {
            return (ColorStateList) cdVar.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        cd cdVar = this.h;
        if (cdVar != null) {
            return (PorterDuff.Mode) cdVar.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        float f;
        int i2;
        ColorStateList colorStateList;
        int resourceId;
        int i3;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        r4 a = r4.a();
        int[] iArr = z00.h;
        k6 z3 = k6.z(i, 0, context, attributeSet, iArr);
        ic0.l(textView, textView.getContext(), iArr, attributeSet, (TypedArray) z3.g, i);
        TypedArray typedArray = (TypedArray) z3.g;
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
        int[] iArr2 = z00.v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            k6 k6Var = new k6(context, obtainStyledAttributes);
            if (z4 || !obtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            n(context, k6Var);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = obtainStyledAttributes.hasValue(13) ? obtainStyledAttributes.getString(13) : null;
            k6Var.B();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        k6 k6Var2 = new k6(context, obtainStyledAttributes2);
        if (!z4 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z5 = z2;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (Build.VERSION.SDK_INT >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, k6Var2);
        k6Var2.B();
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
            v5.d(textView, str);
        }
        if (str2 != null) {
            u5.b(textView, u5.a(str2));
        }
        g6 g6Var = this.i;
        Context context2 = g6Var.j;
        int[] iArr3 = z00.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = g6Var.i;
        ic0.l(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            g6Var.a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr4[i4] = obtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                g6Var.f = g6.b(iArr4);
                g6Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!g6Var.j()) {
            g6Var.a = 0;
        } else if (g6Var.a == 1) {
            if (!g6Var.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i3 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                g6Var.k(dimension2, dimension3, dimension);
            }
            g6Var.h();
        }
        if (ed0.c && g6Var.a != 0) {
            int[] iArr5 = g6Var.f;
            if (iArr5.length > 0) {
                if (v5.a(textView) != -1.0f) {
                    v5.b(textView, Math.round(g6Var.d), Math.round(g6Var.e), Math.round(g6Var.c), 0);
                } else {
                    v5.c(textView, iArr5, 0);
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
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = la0.w(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(gi.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i5 = peekValue.data;
                i2 = i5 & 15;
                f = TypedValue.complexToFloat(i5);
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != -1) {
                    xf.I(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != -1) {
                    xf.J(textView, dimensionPixelSize2);
                }
                if (f == -1.0f) {
                    if (i2 == -1) {
                        xf.K(textView, (int) f);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        h0.h(textView, i2, f);
                        return;
                    } else {
                        xf.K(textView, Math.round(TypedValue.applyDimension(i2, f, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            f = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            f = -1.0f;
        }
        i2 = -1;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
        }
        if (dimensionPixelSize2 != -1) {
        }
        if (f == -1.0f) {
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, z00.v);
        k6 k6Var = new k6(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, k6Var);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            v5.d(textView, string);
        }
        k6Var.B();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        g6 g6Var = this.i;
        if (g6Var.j()) {
            DisplayMetrics displayMetrics = g6Var.j.getResources().getDisplayMetrics();
            g6Var.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (g6Var.h()) {
                g6Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        g6 g6Var = this.i;
        if (g6Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = g6Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                g6Var.f = g6.b(iArr2);
                if (!g6Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                g6Var.g = false;
            }
            if (g6Var.h()) {
                g6Var.a();
            }
        }
    }

    public final void k(int i) {
        g6 g6Var = this.i;
        if (g6Var.j()) {
            if (i == 0) {
                g6Var.a = 0;
                g6Var.d = -1.0f;
                g6Var.e = -1.0f;
                g6Var.c = -1.0f;
                g6Var.f = new int[0];
                g6Var.b = false;
                return;
            }
            if (i != 1) {
                g9.i(f60.e("Unknown auto-size text type: ", i));
                return;
            }
            DisplayMetrics displayMetrics = g6Var.j.getResources().getDisplayMetrics();
            g6Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (g6Var.h()) {
                g6Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new cd();
        }
        cd cdVar = this.h;
        cdVar.c = colorStateList;
        cdVar.b = colorStateList != null;
        this.b = cdVar;
        this.c = cdVar;
        this.d = cdVar;
        this.e = cdVar;
        this.f = cdVar;
        this.g = cdVar;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new cd();
        }
        cd cdVar = this.h;
        cdVar.d = mode;
        cdVar.a = mode != null;
        this.b = cdVar;
        this.c = cdVar;
        this.d = cdVar;
        this.e = cdVar;
        this.f = cdVar;
        this.g = cdVar;
    }

    public final void n(Context context, k6 k6Var) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) k6Var.g;
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
                Typeface q = k6Var.q(i5, this.j, new s5(this, i6, i7, new WeakReference(this.a)));
                if (q != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = q;
                    } else {
                        this.l = w5.a(Typeface.create(q, 0), this.k, (this.j & 2) != 0);
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
            this.l = w5.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
