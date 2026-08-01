package l;

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
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f3320a;

    /* renamed from: b, reason: collision with root package name */
    public i1.i f3321b;

    /* renamed from: c, reason: collision with root package name */
    public i1.i f3322c;

    /* renamed from: d, reason: collision with root package name */
    public i1.i f3323d;

    /* renamed from: e, reason: collision with root package name */
    public i1.i f3324e;

    /* renamed from: f, reason: collision with root package name */
    public i1.i f3325f;

    /* renamed from: g, reason: collision with root package name */
    public i1.i f3326g;
    public i1.i h;
    public final C0267i0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f3327j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3328k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f3329l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3330m;

    public Z(TextView textView) {
        this.f3320a = textView;
        this.i = new C0267i0(textView);
    }

    public static i1.i c(Context context, C0292v c0292v, int i) {
        ColorStateList f2;
        synchronized (c0292v) {
            f2 = c0292v.f3470a.f(context, i);
        }
        if (f2 == null) {
            return null;
        }
        i1.i iVar = new i1.i();
        iVar.f2682b = true;
        iVar.f2683c = f2;
        return iVar;
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
            q1.d.W(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            q1.d.W(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            q1.d.W(editorInfo, text, i4, i2);
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
        q1.d.W(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i9, i10 + min + i9), min2, i10);
    }

    public final void a(Drawable drawable, i1.i iVar) {
        if (drawable == null || iVar == null) {
            return;
        }
        C0292v.e(drawable, iVar, this.f3320a.getDrawableState());
    }

    public final void b() {
        i1.i iVar = this.f3321b;
        TextView textView = this.f3320a;
        if (iVar != null || this.f3322c != null || this.f3323d != null || this.f3324e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f3321b);
            a(compoundDrawables[1], this.f3322c);
            a(compoundDrawables[2], this.f3323d);
            a(compoundDrawables[3], this.f3324e);
        }
        if (this.f3325f == null && this.f3326g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f3325f);
        a(compoundDrawablesRelative[2], this.f3326g);
    }

    public final ColorStateList d() {
        i1.i iVar = this.h;
        if (iVar != null) {
            return (ColorStateList) iVar.f2683c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        i1.i iVar = this.h;
        if (iVar != null) {
            return (PorterDuff.Mode) iVar.f2684d;
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
        TextView textView = this.f3320a;
        Context context = textView.getContext();
        C0292v a2 = C0292v.a();
        int[] iArr = f.a.h;
        T.r r2 = T.r.r(context, attributeSet, iArr, i);
        K.X.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) r2.f812c, i);
        TypedArray typedArray = (TypedArray) r2.f812c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f3321b = c(context, a2, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f3322c = c(context, a2, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f3323d = c(context, a2, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f3324e = c(context, a2, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f3325f = c(context, a2, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f3326g = c(context, a2, typedArray.getResourceId(6, 0));
        }
        r2.t();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f2410v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            T.r rVar = new T.r(context, obtainStyledAttributes);
            if (z4 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            n(context, rVar);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
                i6 = 13;
            } else {
                i6 = 13;
                str2 = null;
            }
            str = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getString(i6) : null;
            rVar.t();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        T.r rVar2 = new T.r(context, obtainStyledAttributes2);
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
        n(context, rVar2);
        rVar2.t();
        if (!z4 && z3) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f3329l;
        if (typeface != null) {
            if (this.f3328k == -1) {
                textView.setTypeface(typeface, this.f3327j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            X.d(textView, str);
        }
        if (str2 != null) {
            W.b(textView, W.a(str2));
        }
        int[] iArr3 = f.a.i;
        C0267i0 c0267i0 = this.i;
        Context context2 = c0267i0.f3380j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0267i0.i;
        K.X.k(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0267i0.f3373a = obtainStyledAttributes3.getInt(5, 0);
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
                c0267i0.f3378f = C0267i0.b(iArr4);
                c0267i0.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c0267i0.j()) {
            c0267i0.f3373a = 0;
        } else if (c0267i0.f3373a == 1) {
            if (!c0267i0.f3379g) {
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
                c0267i0.k(dimension2, dimension3, dimension);
            }
            c0267i0.h();
        }
        if (i1.f3384c && c0267i0.f3373a != 0) {
            int[] iArr5 = c0267i0.f3378f;
            if (iArr5.length > 0) {
                if (X.a(textView) != -1.0f) {
                    X.b(textView, Math.round(c0267i0.f3376d), Math.round(c0267i0.f3377e), Math.round(c0267i0.f3375c), 0);
                } else {
                    X.c(textView, iArr5, 0);
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
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = q1.d.w(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            Q.n.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i2 = -1;
            Q.n.g(textView, AbstractC0277n0.b(obtainStyledAttributes4.getInt(12, -1), null));
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
            q1.d.S(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i3) {
            q1.d.T(textView, dimensionPixelSize2);
        }
        if (f2 != -1.0f) {
            if (i4 == i3) {
                q1.d.U(textView, (int) f2);
            } else if (Build.VERSION.SDK_INT >= 34) {
                Q.q.a(textView, i4, f2);
            } else {
                q1.d.U(textView, Math.round(TypedValue.applyDimension(i4, f2, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, f.a.f2410v);
        T.r rVar = new T.r(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f3320a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, rVar);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            X.d(textView, string);
        }
        rVar.t();
        Typeface typeface = this.f3329l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3327j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        C0267i0 c0267i0 = this.i;
        if (c0267i0.j()) {
            DisplayMetrics displayMetrics = c0267i0.f3380j.getResources().getDisplayMetrics();
            c0267i0.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0267i0.h()) {
                c0267i0.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        C0267i0 c0267i0 = this.i;
        if (c0267i0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0267i0.f3380j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0267i0.f3378f = C0267i0.b(iArr2);
                if (!c0267i0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0267i0.f3379g = false;
            }
            if (c0267i0.h()) {
                c0267i0.a();
            }
        }
    }

    public final void k(int i) {
        C0267i0 c0267i0 = this.i;
        if (c0267i0.j()) {
            if (i == 0) {
                c0267i0.f3373a = 0;
                c0267i0.f3376d = -1.0f;
                c0267i0.f3377e = -1.0f;
                c0267i0.f3375c = -1.0f;
                c0267i0.f3378f = new int[0];
                c0267i0.f3374b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(X0.e.d("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = c0267i0.f3380j.getResources().getDisplayMetrics();
            c0267i0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0267i0.h()) {
                c0267i0.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new i1.i();
        }
        i1.i iVar = this.h;
        iVar.f2683c = colorStateList;
        iVar.f2682b = colorStateList != null;
        this.f3321b = iVar;
        this.f3322c = iVar;
        this.f3323d = iVar;
        this.f3324e = iVar;
        this.f3325f = iVar;
        this.f3326g = iVar;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new i1.i();
        }
        i1.i iVar = this.h;
        iVar.f2684d = mode;
        iVar.f2681a = mode != null;
        this.f3321b = iVar;
        this.f3322c = iVar;
        this.f3323d = iVar;
        this.f3324e = iVar;
        this.f3325f = iVar;
        this.f3326g = iVar;
    }

    public final void n(Context context, T.r rVar) {
        String string;
        int i = this.f3327j;
        TypedArray typedArray = (TypedArray) rVar.f812c;
        this.f3327j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.f3328k = i3;
            if (i3 != -1) {
                this.f3327j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f3330m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.f3329l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.f3329l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f3329l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3329l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.f3328k;
        int i7 = this.f3327j;
        if (!context.isRestricted()) {
            try {
                Typeface j2 = rVar.j(i5, this.f3327j, new U(this, i6, i7, new WeakReference(this.f3320a)));
                if (j2 != null) {
                    if (i2 < 28 || this.f3328k == -1) {
                        this.f3329l = j2;
                    } else {
                        this.f3329l = Y.a(Typeface.create(j2, 0), this.f3328k, (this.f3327j & 2) != 0);
                    }
                }
                this.f3330m = this.f3329l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f3329l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f3328k == -1) {
            this.f3329l = Typeface.create(string, this.f3327j);
        } else {
            this.f3329l = Y.a(Typeface.create(string, 0), this.f3328k, (this.f3327j & 2) != 0);
        }
    }
}
