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

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2587a;

    /* renamed from: b, reason: collision with root package name */
    public q2 f2588b;

    /* renamed from: c, reason: collision with root package name */
    public q2 f2589c;
    public q2 d;

    /* renamed from: e, reason: collision with root package name */
    public q2 f2590e;

    /* renamed from: f, reason: collision with root package name */
    public q2 f2591f;

    /* renamed from: g, reason: collision with root package name */
    public q2 f2592g;
    public q2 h;
    public final e1 i;

    /* renamed from: j, reason: collision with root package name */
    public int f2593j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2594k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f2595l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2596m;

    public v0(TextView textView) {
        this.f2587a = textView;
        this.i = new e1(textView);
    }

    public static q2 c(Context context, r rVar, int i) {
        ColorStateList f5;
        synchronized (rVar) {
            f5 = rVar.f2550a.f(context, i);
        }
        if (f5 == null) {
            return null;
        }
        q2 q2Var = new q2();
        q2Var.f2546b = true;
        q2Var.f2547c = f5;
        return q2Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            j0.a.e(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            j0.a.e(editorInfo, text);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        int i6 = i4 > i5 ? i5 : i4;
        if (i4 <= i5) {
            i4 = i5;
        }
        int length = text.length();
        if (i6 < 0 || i4 > length) {
            b4.d.S(editorInfo, null, 0, 0);
            return;
        }
        int i7 = editorInfo.inputType & 4095;
        if (i7 == 129 || i7 == 225 || i7 == 18) {
            b4.d.S(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            b4.d.S(editorInfo, text, i6, i4);
            return;
        }
        int i8 = i4 - i6;
        int i9 = i8 > 1024 ? 0 : i8;
        int i10 = 2048 - i9;
        int min = Math.min(text.length() - i4, i10 - Math.min(i6, (int) (i10 * 0.8d)));
        int min2 = Math.min(i6, i10 - min);
        int i11 = i6 - min2;
        if (Character.isLowSurrogate(text.charAt(i11))) {
            i11++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i4 + min) - 1))) {
            min--;
        }
        int i12 = min2 + i9;
        b4.d.S(editorInfo, i9 != i8 ? TextUtils.concat(text.subSequence(i11, i11 + min2), text.subSequence(i4, min + i4)) : text.subSequence(i11, i12 + min + i11), min2, i12);
    }

    public final void a(Drawable drawable, q2 q2Var) {
        if (drawable == null || q2Var == null) {
            return;
        }
        r.e(drawable, q2Var, this.f2587a.getDrawableState());
    }

    public final void b() {
        q2 q2Var = this.f2588b;
        TextView textView = this.f2587a;
        if (q2Var != null || this.f2589c != null || this.d != null || this.f2590e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2588b);
            a(compoundDrawables[1], this.f2589c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f2590e);
        }
        if (this.f2591f == null && this.f2592g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2591f);
        a(compoundDrawablesRelative[2], this.f2592g);
    }

    public final ColorStateList d() {
        q2 q2Var = this.h;
        if (q2Var != null) {
            return (ColorStateList) q2Var.f2547c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        q2 q2Var = this.h;
        if (q2Var != null) {
            return (PorterDuff.Mode) q2Var.d;
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
    public final void f(AttributeSet attributeSet, int i) {
        boolean z4;
        boolean z5;
        String str;
        String str2;
        float f5;
        int i4;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        TextView textView = this.f2587a;
        Context context = textView.getContext();
        r a5 = r.a();
        int[] iArr = f.a.h;
        androidx.emoji2.text.t i6 = androidx.emoji2.text.t.i(i, 0, context, attributeSet, iArr);
        n0.p0.l(textView, textView.getContext(), iArr, attributeSet, (TypedArray) i6.f473b, i);
        TypedArray typedArray = (TypedArray) i6.f473b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2588b = c(context, a5, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2589c = c(context, a5, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a5, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2590e = c(context, a5, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f2591f = c(context, a5, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f2592g = c(context, a5, typedArray.getResourceId(6, 0));
        }
        i6.k();
        boolean z6 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f1408v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(context, obtainStyledAttributes);
            if (z6 || !obtainStyledAttributes.hasValue(14)) {
                z4 = false;
                z5 = false;
            } else {
                z5 = obtainStyledAttributes.getBoolean(14, false);
                z4 = true;
            }
            n(context, tVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = obtainStyledAttributes.hasValue(13) ? obtainStyledAttributes.getString(13) : null;
            tVar.k();
        } else {
            z4 = false;
            z5 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        androidx.emoji2.text.t tVar2 = new androidx.emoji2.text.t(context, obtainStyledAttributes2);
        if (!z6 && obtainStyledAttributes2.hasValue(14)) {
            z5 = obtainStyledAttributes2.getBoolean(14, false);
            z4 = true;
        }
        boolean z7 = z5;
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
        n(context, tVar2);
        tVar2.k();
        if (!z6 && z4) {
            textView.setAllCaps(z7);
        }
        Typeface typeface = this.f2595l;
        if (typeface != null) {
            if (this.f2594k == -1) {
                textView.setTypeface(typeface, this.f2593j);
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
        e1 e1Var = this.i;
        Context context2 = e1Var.f2440j;
        int[] iArr3 = f.a.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = e1Var.i;
        n0.p0.l(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            e1Var.f2434a = obtainStyledAttributes3.getInt(5, 0);
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
                e1Var.f2438f = e1.b(iArr4);
                e1Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!e1Var.j()) {
            e1Var.f2434a = 0;
        } else if (e1Var.f2434a == 1) {
            if (!e1Var.f2439g) {
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
                float f6 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                e1Var.k(dimension2, f6, dimension);
            }
            e1Var.h();
        }
        if (f3.f2450c && e1Var.f2434a != 0) {
            int[] iArr5 = e1Var.f2438f;
            if (iArr5.length > 0) {
                if (t0.a(textView) != -1.0f) {
                    t0.b(textView, Math.round(e1Var.d), Math.round(e1Var.f2437e), Math.round(e1Var.f2436c), 0);
                } else {
                    t0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b2 = resourceId4 != -1 ? a5.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b5 = resourceId5 != -1 ? a5.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b6 = resourceId6 != -1 ? a5.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b7 = resourceId7 != -1 ? a5.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b8 = resourceId8 != -1 ? a5.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b9 = resourceId9 != -1 ? a5.b(context, resourceId9) : null;
        if (b8 != null || b9 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b8 == null) {
                b8 = compoundDrawablesRelative[0];
            }
            if (b5 == null) {
                b5 = compoundDrawablesRelative[1];
            }
            if (b9 == null) {
                b9 = compoundDrawablesRelative[2];
            }
            if (b7 == null) {
                b7 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b8, b5, b9, b7);
        } else if (b2 != null || b5 != null || b6 != null || b7 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b2 == null) {
                    b2 = compoundDrawables[0];
                }
                if (b5 == null) {
                    b5 = compoundDrawables[1];
                }
                if (b6 == null) {
                    b6 = compoundDrawables[2];
                }
                if (b7 == null) {
                    b7 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b2, b5, b6, b7);
            } else {
                if (b5 == null) {
                    b5 = compoundDrawablesRelative2[1];
                }
                if (b7 == null) {
                    b7 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b5, compoundDrawablesRelative2[2], b7);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = c0.c.a(context, resourceId)) == null) {
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
                i4 = i9 & 15;
                f5 = TypedValue.complexToFloat(i9);
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != -1) {
                    b4.l.b0(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != -1) {
                    b4.l.c0(textView, dimensionPixelSize2);
                }
                if (f5 == -1.0f) {
                    if (i4 == -1) {
                        b4.l.d0(textView, (int) f5);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        n0.y.h(textView, i4, f5);
                        return;
                    } else {
                        b4.l.d0(textView, Math.round(TypedValue.applyDimension(i4, f5, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            f5 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            f5 = -1.0f;
        }
        i4 = -1;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
        }
        if (dimensionPixelSize2 != -1) {
        }
        if (f5 == -1.0f) {
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, f.a.f1408v);
        androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f2587a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, tVar);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            t0.d(textView, string);
        }
        tVar.k();
        Typeface typeface = this.f2595l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2593j);
        }
    }

    public final void i(int i, int i4, int i5, int i6) {
        e1 e1Var = this.i;
        if (e1Var.j()) {
            DisplayMetrics displayMetrics = e1Var.f2440j.getResources().getDisplayMetrics();
            e1Var.k(TypedValue.applyDimension(i6, i, displayMetrics), TypedValue.applyDimension(i6, i4, displayMetrics), TypedValue.applyDimension(i6, i5, displayMetrics));
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        e1 e1Var = this.i;
        if (e1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = e1Var.f2440j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr2[i4] = Math.round(TypedValue.applyDimension(i, iArr[i4], displayMetrics));
                    }
                }
                e1Var.f2438f = e1.b(iArr2);
                if (!e1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                e1Var.f2439g = false;
            }
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void k(int i) {
        e1 e1Var = this.i;
        if (e1Var.j()) {
            if (i == 0) {
                e1Var.f2434a = 0;
                e1Var.d = -1.0f;
                e1Var.f2437e = -1.0f;
                e1Var.f2436c = -1.0f;
                e1Var.f2438f = new int[0];
                e1Var.f2435b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(a4.b.f("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = e1Var.f2440j.getResources().getDisplayMetrics();
            e1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new q2();
        }
        q2 q2Var = this.h;
        q2Var.f2547c = colorStateList;
        q2Var.f2546b = colorStateList != null;
        this.f2588b = q2Var;
        this.f2589c = q2Var;
        this.d = q2Var;
        this.f2590e = q2Var;
        this.f2591f = q2Var;
        this.f2592g = q2Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new q2();
        }
        q2 q2Var = this.h;
        q2Var.d = mode;
        q2Var.f2545a = mode != null;
        this.f2588b = q2Var;
        this.f2589c = q2Var;
        this.d = q2Var;
        this.f2590e = q2Var;
        this.f2591f = q2Var;
        this.f2592g = q2Var;
    }

    public final void n(Context context, androidx.emoji2.text.t tVar) {
        String string;
        int i = this.f2593j;
        TypedArray typedArray = (TypedArray) tVar.f473b;
        this.f2593j = typedArray.getInt(2, i);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = typedArray.getInt(11, -1);
            this.f2594k = i5;
            if (i5 != -1) {
                this.f2593j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2596m = false;
                int i6 = typedArray.getInt(1, 1);
                if (i6 == 1) {
                    this.f2595l = Typeface.SANS_SERIF;
                    return;
                } else if (i6 == 2) {
                    this.f2595l = Typeface.SERIF;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f2595l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2595l = null;
        int i7 = typedArray.hasValue(12) ? 12 : 10;
        int i8 = this.f2594k;
        int i9 = this.f2593j;
        if (!context.isRestricted()) {
            try {
                Typeface f5 = tVar.f(i7, this.f2593j, new q0(this, i8, i9, new WeakReference(this.f2587a)));
                if (f5 != null) {
                    if (i4 < 28 || this.f2594k == -1) {
                        this.f2595l = f5;
                    } else {
                        this.f2595l = u0.a(Typeface.create(f5, 0), this.f2594k, (this.f2593j & 2) != 0);
                    }
                }
                this.f2596m = this.f2595l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2595l != null || (string = typedArray.getString(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2594k == -1) {
            this.f2595l = Typeface.create(string, this.f2593j);
        } else {
            this.f2595l = u0.a(Typeface.create(string, 0), this.f2594k, (this.f2593j & 2) != 0);
        }
    }
}
