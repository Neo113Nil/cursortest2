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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2509a;

    /* renamed from: b, reason: collision with root package name */
    public t2 f2510b;

    /* renamed from: c, reason: collision with root package name */
    public t2 f2511c;
    public t2 d;

    /* renamed from: e, reason: collision with root package name */
    public t2 f2512e;

    /* renamed from: f, reason: collision with root package name */
    public t2 f2513f;

    /* renamed from: g, reason: collision with root package name */
    public t2 f2514g;

    /* renamed from: h, reason: collision with root package name */
    public t2 f2515h;
    public final h1 i;

    /* renamed from: j, reason: collision with root package name */
    public int f2516j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f2517k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f2518l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2519m;

    public y0(TextView textView) {
        this.f2509a = textView;
        this.i = new h1(textView);
    }

    public static t2 c(Context context, u uVar, int i) {
        ColorStateList f2;
        synchronized (uVar) {
            f2 = uVar.f2467a.f(context, i);
        }
        if (f2 == null) {
            return null;
        }
        t2 t2Var = new t2();
        t2Var.d = true;
        t2Var.f2462a = f2;
        return t2Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            p0.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            p0.b.a(editorInfo, text);
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
            p0.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i7 = editorInfo.inputType & 4095;
        if (i7 == 129 || i7 == 225 || i7 == 18) {
            p0.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            p0.c.a(editorInfo, text, i6, i4);
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
        p0.c.a(editorInfo, i9 != i8 ? TextUtils.concat(text.subSequence(i11, i11 + min2), text.subSequence(i4, min + i4)) : text.subSequence(i11, i12 + min + i11), min2, i12);
    }

    public final void a(Drawable drawable, t2 t2Var) {
        if (drawable == null || t2Var == null) {
            return;
        }
        u.e(drawable, t2Var, this.f2509a.getDrawableState());
    }

    public final void b() {
        t2 t2Var = this.f2510b;
        TextView textView = this.f2509a;
        if (t2Var != null || this.f2511c != null || this.d != null || this.f2512e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f2510b);
            a(compoundDrawables[1], this.f2511c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.f2512e);
        }
        if (this.f2513f == null && this.f2514g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2513f);
        a(compoundDrawablesRelative[2], this.f2514g);
    }

    public final ColorStateList d() {
        t2 t2Var = this.f2515h;
        if (t2Var != null) {
            return t2Var.f2462a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        t2 t2Var = this.f2515h;
        if (t2Var != null) {
            return t2Var.f2463b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z3;
        boolean z4;
        String str;
        String str2;
        int i4;
        float f2;
        int i5;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        TextView textView = this.f2509a;
        Context context = textView.getContext();
        u a2 = u.a();
        int[] iArr = f.a.f1246h;
        androidx.emoji2.text.t w3 = androidx.emoji2.text.t.w(context, attributeSet, iArr, i);
        n0.l0.l(textView, textView.getContext(), iArr, attributeSet, (TypedArray) w3.f356c, i);
        TypedArray typedArray = (TypedArray) w3.f356c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2510b = c(context, a2, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2511c = c(context, a2, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a2, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2512e = c(context, a2, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f2513f = c(context, a2, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f2514g = c(context, a2, typedArray.getResourceId(6, 0));
        }
        w3.y();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f1259v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(context, obtainStyledAttributes);
            if (z5 || !obtainStyledAttributes.hasValue(14)) {
                z3 = false;
                z4 = false;
            } else {
                z4 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            n(context, tVar);
            int i7 = Build.VERSION.SDK_INT;
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i7 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            tVar.y();
        } else {
            z3 = false;
            z4 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        androidx.emoji2.text.t tVar2 = new androidx.emoji2.text.t(context, obtainStyledAttributes2);
        if (!z5 && obtainStyledAttributes2.hasValue(14)) {
            z4 = obtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        boolean z6 = z4;
        int i8 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i8 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i8 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, tVar2);
        tVar2.y();
        if (!z5 && z3) {
            textView.setAllCaps(z6);
        }
        Typeface typeface = this.f2518l;
        if (typeface != null) {
            if (this.f2517k == -1) {
                textView.setTypeface(typeface, this.f2516j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            w0.d(textView, str);
        }
        if (str2 != null) {
            v0.b(textView, v0.a(str2));
        }
        h1 h1Var = this.i;
        Context context2 = h1Var.f2335j;
        int[] iArr3 = f.a.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = h1Var.i;
        n0.l0.l(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            h1Var.f2328a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i9 = 0; i9 < length; i9++) {
                    iArr4[i9] = obtainTypedArray.getDimensionPixelSize(i9, -1);
                }
                h1Var.f2332f = h1.b(iArr4);
                h1Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!h1Var.j()) {
            h1Var.f2328a = 0;
        } else if (h1Var.f2328a == 1) {
            if (!h1Var.f2333g) {
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
                float f4 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                h1Var.k(dimension2, f4, dimension);
            }
            h1Var.h();
        }
        if (l3.f2383c && h1Var.f2328a != 0) {
            int[] iArr5 = h1Var.f2332f;
            if (iArr5.length > 0) {
                if (w0.a(textView) != -1.0f) {
                    w0.b(textView, Math.round(h1Var.d), Math.round(h1Var.f2331e), Math.round(h1Var.f2330c), 0);
                } else {
                    w0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b4 = resourceId4 != -1 ? a2.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b5 = resourceId5 != -1 ? a2.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b6 = resourceId6 != -1 ? a2.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b7 = resourceId7 != -1 ? a2.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b8 = resourceId8 != -1 ? a2.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b9 = resourceId9 != -1 ? a2.b(context, resourceId9) : null;
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
        } else if (b4 != null || b5 != null || b6 != null || b7 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b4 == null) {
                    b4 = compoundDrawables[0];
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
                textView.setCompoundDrawablesWithIntrinsicBounds(b4, b5, b6, b7);
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
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = a.y.B(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(m1.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i10 = peekValue.data;
                int i11 = i10 & 15;
                f2 = TypedValue.complexToFloat(i10);
                i5 = i11;
                i4 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i4) {
                    h.a.g0(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i4) {
                    h.a.i0(textView, dimensionPixelSize2);
                }
                if (f2 == -1.0f) {
                    if (i5 == i4) {
                        h.a.j0(textView, (int) f2);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        n0.u.h(textView, i5, f2);
                        return;
                    } else {
                        h.a.j0(textView, Math.round(TypedValue.applyDimension(i5, f2, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i4 = -1;
            f2 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i4 = -1;
            f2 = -1.0f;
        }
        i5 = i4;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i4) {
        }
        if (dimensionPixelSize2 != i4) {
        }
        if (f2 == -1.0f) {
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, f.a.f1259v);
        androidx.emoji2.text.t tVar = new androidx.emoji2.text.t(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f2509a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, tVar);
        if (i4 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            w0.d(textView, string);
        }
        tVar.y();
        Typeface typeface = this.f2518l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2516j);
        }
    }

    public final void i(int i, int i4, int i5, int i6) {
        h1 h1Var = this.i;
        if (h1Var.j()) {
            DisplayMetrics displayMetrics = h1Var.f2335j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(i6, i, displayMetrics), TypedValue.applyDimension(i6, i4, displayMetrics), TypedValue.applyDimension(i6, i5, displayMetrics));
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        h1 h1Var = this.i;
        if (h1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = h1Var.f2335j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr2[i4] = Math.round(TypedValue.applyDimension(i, iArr[i4], displayMetrics));
                    }
                }
                h1Var.f2332f = h1.b(iArr2);
                if (!h1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                h1Var.f2333g = false;
            }
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void k(int i) {
        h1 h1Var = this.i;
        if (h1Var.j()) {
            if (i == 0) {
                h1Var.f2328a = 0;
                h1Var.d = -1.0f;
                h1Var.f2331e = -1.0f;
                h1Var.f2330c = -1.0f;
                h1Var.f2332f = new int[0];
                h1Var.f2329b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(androidx.fragment.app.w0.d("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = h1Var.f2335j.getResources().getDisplayMetrics();
            h1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (h1Var.h()) {
                h1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f2515h == null) {
            this.f2515h = new t2();
        }
        t2 t2Var = this.f2515h;
        t2Var.f2462a = colorStateList;
        t2Var.d = colorStateList != null;
        this.f2510b = t2Var;
        this.f2511c = t2Var;
        this.d = t2Var;
        this.f2512e = t2Var;
        this.f2513f = t2Var;
        this.f2514g = t2Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f2515h == null) {
            this.f2515h = new t2();
        }
        t2 t2Var = this.f2515h;
        t2Var.f2463b = mode;
        t2Var.f2464c = mode != null;
        this.f2510b = t2Var;
        this.f2511c = t2Var;
        this.d = t2Var;
        this.f2512e = t2Var;
        this.f2513f = t2Var;
        this.f2514g = t2Var;
    }

    public final void n(Context context, androidx.emoji2.text.t tVar) {
        String string;
        int i = this.f2516j;
        TypedArray typedArray = (TypedArray) tVar.f356c;
        this.f2516j = typedArray.getInt(2, i);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = typedArray.getInt(11, -1);
            this.f2517k = i5;
            if (i5 != -1) {
                this.f2516j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2519m = false;
                int i6 = typedArray.getInt(1, 1);
                if (i6 == 1) {
                    this.f2518l = Typeface.SANS_SERIF;
                    return;
                } else if (i6 == 2) {
                    this.f2518l = Typeface.SERIF;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f2518l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2518l = null;
        int i7 = typedArray.hasValue(12) ? 12 : 10;
        int i8 = this.f2517k;
        int i9 = this.f2516j;
        if (!context.isRestricted()) {
            try {
                Typeface p3 = tVar.p(i7, this.f2516j, new t0(this, i8, i9, new WeakReference(this.f2509a)));
                if (p3 != null) {
                    if (i4 < 28 || this.f2517k == -1) {
                        this.f2518l = p3;
                    } else {
                        this.f2518l = x0.a(Typeface.create(p3, 0), this.f2517k, (this.f2516j & 2) != 0);
                    }
                }
                this.f2519m = this.f2518l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2518l != null || (string = typedArray.getString(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2517k == -1) {
            this.f2518l = Typeface.create(string, this.f2516j);
        } else {
            this.f2518l = x0.a(Typeface.create(string, 0), this.f2517k, (this.f2516j & 2) != 0);
        }
    }
}
