package k;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2671a;

    /* renamed from: b, reason: collision with root package name */
    public c3.g f2672b;
    public c3.g c;

    /* renamed from: d, reason: collision with root package name */
    public c3.g f2673d;

    /* renamed from: e, reason: collision with root package name */
    public c3.g f2674e;

    /* renamed from: f, reason: collision with root package name */
    public c3.g f2675f;
    public c3.g g;
    public c3.g h;

    /* renamed from: i, reason: collision with root package name */
    public final e1 f2676i;

    /* renamed from: j, reason: collision with root package name */
    public int f2677j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2678k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f2679l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2680m;

    public v0(TextView textView) {
        this.f2671a = textView;
        this.f2676i = new e1(textView);
    }

    public static c3.g c(Context context, s sVar, int i4) {
        ColorStateList f4;
        synchronized (sVar) {
            f4 = sVar.f2641a.f(context, i4);
        }
        if (f4 == null) {
            return null;
        }
        c3.g gVar = new c3.g();
        gVar.f1048b = true;
        gVar.c = f4;
        return gVar;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i4 >= 30) {
            k0.n0.d(editorInfo, text);
            return;
        }
        text.getClass();
        if (i4 >= 30) {
            k0.n0.d(editorInfo, text);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        int i7 = i5 > i6 ? i6 : i5;
        if (i5 <= i6) {
            i5 = i6;
        }
        int length = text.length();
        if (i7 < 0 || i5 > length) {
            m0.a.z(editorInfo, null, 0, 0);
            return;
        }
        int i8 = editorInfo.inputType & 4095;
        if (i8 == 129 || i8 == 225 || i8 == 18) {
            m0.a.z(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m0.a.z(editorInfo, text, i7, i5);
            return;
        }
        int i9 = i5 - i7;
        int i10 = i9 > 1024 ? 0 : i9;
        int i11 = 2048 - i10;
        int min = Math.min(text.length() - i5, i11 - Math.min(i7, (int) (i11 * 0.8d)));
        int min2 = Math.min(i7, i11 - min);
        int i12 = i7 - min2;
        if (Character.isLowSurrogate(text.charAt(i12))) {
            i12++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i5 + min) - 1))) {
            min--;
        }
        int i13 = min2 + i10;
        m0.a.z(editorInfo, i10 != i9 ? TextUtils.concat(text.subSequence(i12, i12 + min2), text.subSequence(i5, min + i5)) : text.subSequence(i12, i13 + min + i12), min2, i13);
    }

    public final void a(Drawable drawable, c3.g gVar) {
        if (drawable == null || gVar == null) {
            return;
        }
        s.e(drawable, gVar, this.f2671a.getDrawableState());
    }

    public final void b() {
        c3.g gVar = this.f2672b;
        TextView textView = this.f2671a;
        if (gVar != null || this.c != null || this.f2673d != null || this.f2674e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2672b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.f2673d);
            a(compoundDrawables[3], this.f2674e);
        }
        if (this.f2675f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2675f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        c3.g gVar = this.h;
        if (gVar != null) {
            return (ColorStateList) gVar.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        c3.g gVar = this.h;
        if (gVar != null) {
            return (PorterDuff.Mode) gVar.f1049d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i4) {
        boolean z3;
        boolean z4;
        String str;
        String str2;
        float f4;
        int i5;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        TextView textView = this.f2671a;
        Context context = textView.getContext();
        s a4 = s.a();
        int[] iArr = e.a.h;
        androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(i4, 0, context, attributeSet, iArr);
        k0.j0.l(textView, textView.getContext(), iArr, attributeSet, (TypedArray) r3.c, i4);
        TypedArray typedArray = (TypedArray) r3.c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2672b = c(context, a4, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, a4, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f2673d = c(context, a4, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2674e = c(context, a4, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f2675f = c(context, a4, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a4, typedArray.getResourceId(6, 0));
        }
        r3.t();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = e.a.f1513v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            androidx.emoji2.text.s sVar = new androidx.emoji2.text.s(context, obtainStyledAttributes);
            if (z5 || !obtainStyledAttributes.hasValue(14)) {
                z3 = false;
                z4 = false;
            } else {
                z4 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            n(context, sVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = obtainStyledAttributes.hasValue(13) ? obtainStyledAttributes.getString(13) : null;
            sVar.t();
        } else {
            z3 = false;
            z4 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i4, 0);
        androidx.emoji2.text.s sVar2 = new androidx.emoji2.text.s(context, obtainStyledAttributes2);
        if (!z5 && obtainStyledAttributes2.hasValue(14)) {
            z4 = obtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        boolean z6 = z4;
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
        n(context, sVar2);
        sVar2.t();
        if (!z5 && z3) {
            textView.setAllCaps(z6);
        }
        Typeface typeface = this.f2679l;
        if (typeface != null) {
            if (this.f2678k == -1) {
                textView.setTypeface(typeface, this.f2677j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            t0.d(textView, str);
        }
        if (str2 != null) {
            s0.b(textView, s0.a(str2));
        }
        e1 e1Var = this.f2676i;
        Context context2 = e1Var.f2536j;
        int[] iArr3 = e.a.f1500i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i4, 0);
        TextView textView2 = e1Var.f2535i;
        k0.j0.l(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i4);
        if (obtainStyledAttributes3.hasValue(5)) {
            e1Var.f2530a = obtainStyledAttributes3.getInt(5, 0);
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
                e1Var.f2534f = e1.b(iArr4);
                e1Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!e1Var.j()) {
            e1Var.f2530a = 0;
        } else if (e1Var.f2530a == 1) {
            if (!e1Var.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                float f5 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                e1Var.k(dimension2, f5, dimension);
            }
            e1Var.h();
        }
        if (e3.c && e1Var.f2530a != 0) {
            int[] iArr5 = e1Var.f2534f;
            if (iArr5.length > 0) {
                if (t0.a(textView) != -1.0f) {
                    t0.b(textView, Math.round(e1Var.f2532d), Math.round(e1Var.f2533e), Math.round(e1Var.c), 0);
                } else {
                    t0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b2 = resourceId4 != -1 ? a4.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b4 = resourceId5 != -1 ? a4.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b5 = resourceId6 != -1 ? a4.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b6 = resourceId7 != -1 ? a4.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b7 = resourceId8 != -1 ? a4.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b8 = resourceId9 != -1 ? a4.b(context, resourceId9) : null;
        if (b7 != null || b8 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b7 == null) {
                b7 = compoundDrawablesRelative[0];
            }
            if (b4 == null) {
                b4 = compoundDrawablesRelative[1];
            }
            if (b8 == null) {
                b8 = compoundDrawablesRelative[2];
            }
            if (b6 == null) {
                b6 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b7, b4, b8, b6);
        } else if (b2 != null || b4 != null || b5 != null || b6 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b2 == null) {
                    b2 = compoundDrawables[0];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[1];
                }
                if (b5 == null) {
                    b5 = compoundDrawables[2];
                }
                if (b6 == null) {
                    b6 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b2, b4, b5, b6);
            } else {
                if (b4 == null) {
                    b4 = compoundDrawablesRelative2[1];
                }
                if (b6 == null) {
                    b6 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b4, compoundDrawablesRelative2[2], b6);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = k3.d.D(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(j1.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i9 = peekValue.data;
                i5 = i9 & 15;
                f4 = TypedValue.complexToFloat(i9);
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != -1) {
                    l0.g.u(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != -1) {
                    l0.g.v(textView, dimensionPixelSize2);
                }
                if (f4 == -1.0f) {
                    if (i5 == -1) {
                        l0.g.w(textView, (int) f4);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        androidx.activity.a.i(textView, i5, f4);
                        return;
                    } else {
                        l0.g.w(textView, Math.round(TypedValue.applyDimension(i5, f4, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            f4 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            f4 = -1.0f;
        }
        i5 = -1;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
        }
        if (dimensionPixelSize2 != -1) {
        }
        if (f4 == -1.0f) {
        }
    }

    public final void g(Context context, int i4) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, e.a.f1513v);
        androidx.emoji2.text.s sVar = new androidx.emoji2.text.s(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f2671a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, sVar);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            t0.d(textView, string);
        }
        sVar.t();
        Typeface typeface = this.f2679l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2677j);
        }
    }

    public final void i(int i4, int i5, int i6, int i7) {
        e1 e1Var = this.f2676i;
        if (e1Var.j()) {
            DisplayMetrics displayMetrics = e1Var.f2536j.getResources().getDisplayMetrics();
            e1Var.k(TypedValue.applyDimension(i7, i4, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i4) {
        e1 e1Var = this.f2676i;
        if (e1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i4 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = e1Var.f2536j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                e1Var.f2534f = e1.b(iArr2);
                if (!e1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                e1Var.g = false;
            }
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void k(int i4) {
        e1 e1Var = this.f2676i;
        if (e1Var.j()) {
            if (i4 == 0) {
                e1Var.f2530a = 0;
                e1Var.f2532d = -1.0f;
                e1Var.f2533e = -1.0f;
                e1Var.c = -1.0f;
                e1Var.f2534f = new int[0];
                e1Var.f2531b = false;
                return;
            }
            if (i4 != 1) {
                throw new IllegalArgumentException(androidx.fragment.app.w0.e("Unknown auto-size text type: ", i4));
            }
            DisplayMetrics displayMetrics = e1Var.f2536j.getResources().getDisplayMetrics();
            e1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new c3.g();
        }
        c3.g gVar = this.h;
        gVar.c = colorStateList;
        gVar.f1048b = colorStateList != null;
        this.f2672b = gVar;
        this.c = gVar;
        this.f2673d = gVar;
        this.f2674e = gVar;
        this.f2675f = gVar;
        this.g = gVar;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new c3.g();
        }
        c3.g gVar = this.h;
        gVar.f1049d = mode;
        gVar.f1047a = mode != null;
        this.f2672b = gVar;
        this.c = gVar;
        this.f2673d = gVar;
        this.f2674e = gVar;
        this.f2675f = gVar;
        this.g = gVar;
    }

    public final void n(Context context, androidx.emoji2.text.s sVar) {
        String string;
        int i4 = this.f2677j;
        TypedArray typedArray = (TypedArray) sVar.c;
        this.f2677j = typedArray.getInt(2, i4);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int i6 = typedArray.getInt(11, -1);
            this.f2678k = i6;
            if (i6 != -1) {
                this.f2677j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2680m = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 == 1) {
                    this.f2679l = Typeface.SANS_SERIF;
                    return;
                } else if (i7 == 2) {
                    this.f2679l = Typeface.SERIF;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.f2679l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2679l = null;
        int i8 = typedArray.hasValue(12) ? 12 : 10;
        int i9 = this.f2678k;
        int i10 = this.f2677j;
        if (!context.isRestricted()) {
            try {
                Typeface k4 = sVar.k(i8, this.f2677j, new q0(this, i9, i10, new WeakReference(this.f2671a)));
                if (k4 != null) {
                    if (i5 < 28 || this.f2678k == -1) {
                        this.f2679l = k4;
                    } else {
                        this.f2679l = u0.a(Typeface.create(k4, 0), this.f2678k, (this.f2677j & 2) != 0);
                    }
                }
                this.f2680m = this.f2679l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2679l != null || (string = typedArray.getString(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2678k == -1) {
            this.f2679l = Typeface.create(string, this.f2677j);
        } else {
            this.f2679l = u0.a(Typeface.create(string, 0), this.f2678k, (this.f2677j & 2) != 0);
        }
    }
}
