package m;

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
import com.google.android.gms.internal.ads.CL;
import g.AbstractC4518a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f39335a;

    /* renamed from: b, reason: collision with root package name */
    public e8.h f39336b;

    /* renamed from: c, reason: collision with root package name */
    public e8.h f39337c;

    /* renamed from: d, reason: collision with root package name */
    public e8.h f39338d;

    /* renamed from: e, reason: collision with root package name */
    public e8.h f39339e;

    /* renamed from: f, reason: collision with root package name */
    public e8.h f39340f;

    /* renamed from: g, reason: collision with root package name */
    public e8.h f39341g;

    /* renamed from: h, reason: collision with root package name */
    public e8.h f39342h;
    public final C4732e0 i;

    /* renamed from: j, reason: collision with root package name */
    public int f39343j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f39344k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f39345l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f39346m;

    public V(TextView textView) {
        this.f39335a = textView;
        this.i = new C4732e0(textView);
    }

    public static e8.h c(Context context, C4758s c4758s, int i) {
        ColorStateList f6;
        synchronized (c4758s) {
            f6 = c4758s.f39494a.f(context, i);
        }
        if (f6 == null) {
            return null;
        }
        e8.h hVar = new e8.h();
        hVar.f37400b = true;
        hVar.f37401c = f6;
        return hVar;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            T.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            T.b.a(editorInfo, text);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i9 = editorInfo.initialSelEnd;
        int i10 = i4 > i9 ? i9 : i4;
        if (i4 <= i9) {
            i4 = i9;
        }
        int length = text.length();
        if (i10 < 0 || i4 > length) {
            T.c.a(editorInfo, null, 0, 0);
            return;
        }
        int i11 = editorInfo.inputType & 4095;
        if (i11 == 129 || i11 == 225 || i11 == 18) {
            T.c.a(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            T.c.a(editorInfo, text, i10, i4);
            return;
        }
        int i12 = i4 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int min = Math.min(text.length() - i4, i14 - Math.min(i10, (int) (i14 * 0.8d)));
        int min2 = Math.min(i10, i14 - min);
        int i15 = i10 - min2;
        if (Character.isLowSurrogate(text.charAt(i15))) {
            i15++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i4 + min) - 1))) {
            min--;
        }
        int i16 = min2 + i13;
        T.c.a(editorInfo, i13 != i12 ? TextUtils.concat(text.subSequence(i15, i15 + min2), text.subSequence(i4, min + i4)) : text.subSequence(i15, i16 + min + i15), min2, i16);
    }

    public final void a(Drawable drawable, e8.h hVar) {
        if (drawable == null || hVar == null) {
            return;
        }
        C4758s.e(drawable, hVar, this.f39335a.getDrawableState());
    }

    public final void b() {
        e8.h hVar = this.f39336b;
        TextView textView = this.f39335a;
        if (hVar != null || this.f39337c != null || this.f39338d != null || this.f39339e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f39336b);
            a(compoundDrawables[1], this.f39337c);
            a(compoundDrawables[2], this.f39338d);
            a(compoundDrawables[3], this.f39339e);
        }
        if (this.f39340f == null && this.f39341g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f39340f);
        a(compoundDrawablesRelative[2], this.f39341g);
    }

    public final ColorStateList d() {
        e8.h hVar = this.f39342h;
        if (hVar != null) {
            return (ColorStateList) hVar.f37401c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        e8.h hVar = this.f39342h;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f37402d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z8;
        boolean z9;
        String str;
        String str2;
        int i4;
        float f6;
        int i9;
        ColorStateList colorStateList;
        int resourceId;
        int i10;
        int resourceId2;
        TextView textView = this.f39335a;
        Context context = textView.getContext();
        C4758s a9 = C4758s.a();
        int[] iArr = AbstractC4518a.f37825h;
        Q0 p6 = Q0.p(context, attributeSet, iArr, i);
        O.X.n(textView, textView.getContext(), iArr, attributeSet, (TypedArray) p6.f39326c, i);
        TypedArray typedArray = (TypedArray) p6.f39326c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f39336b = c(context, a9, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f39337c = c(context, a9, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f39338d = c(context, a9, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f39339e = c(context, a9, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f39340f = c(context, a9, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f39341g = c(context, a9, typedArray.getResourceId(6, 0));
        }
        p6.q();
        boolean z10 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC4518a.f37839w;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            Q0 q02 = new Q0(context, obtainStyledAttributes);
            if (z10 || !obtainStyledAttributes.hasValue(14)) {
                z8 = false;
                z9 = false;
            } else {
                z9 = obtainStyledAttributes.getBoolean(14, false);
                z8 = true;
            }
            n(context, q02);
            int i11 = Build.VERSION.SDK_INT;
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i11 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            q02.q();
        } else {
            z8 = false;
            z9 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        Q0 q03 = new Q0(context, obtainStyledAttributes2);
        if (!z10 && obtainStyledAttributes2.hasValue(14)) {
            z9 = obtainStyledAttributes2.getBoolean(14, false);
            z8 = true;
        }
        boolean z11 = z9;
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
        n(context, q03);
        q03.q();
        if (!z10 && z8) {
            textView.setAllCaps(z11);
        }
        Typeface typeface = this.f39345l;
        if (typeface != null) {
            if (this.f39344k == -1) {
                textView.setTypeface(typeface, this.f39343j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            T.d(textView, str);
        }
        if (str2 != null) {
            S.b(textView, S.a(str2));
        }
        int[] iArr3 = AbstractC4518a.i;
        C4732e0 c4732e0 = this.i;
        Context context2 = c4732e0.f39412j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c4732e0.i;
        O.X.n(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            c4732e0.f39404a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i13 = 0; i13 < length; i13++) {
                    iArr4[i13] = obtainTypedArray.getDimensionPixelSize(i13, -1);
                }
                c4732e0.f39409f = C4732e0.b(iArr4);
                c4732e0.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c4732e0.j()) {
            c4732e0.f39404a = 0;
        } else if (c4732e0.f39404a == 1) {
            if (!c4732e0.f39410g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i10 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i10 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i10, 112.0f, displayMetrics);
                }
                float f9 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c4732e0.k(dimension2, f9, dimension);
            }
            c4732e0.h();
        }
        if (g1.f39421c && c4732e0.f39404a != 0) {
            int[] iArr5 = c4732e0.f39409f;
            if (iArr5.length > 0) {
                if (T.a(textView) != -1.0f) {
                    T.b(textView, Math.round(c4732e0.f39407d), Math.round(c4732e0.f39408e), Math.round(c4732e0.f39406c), 0);
                } else {
                    T.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b9 = resourceId4 != -1 ? a9.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b10 = resourceId5 != -1 ? a9.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b11 = resourceId6 != -1 ? a9.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b12 = resourceId7 != -1 ? a9.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b13 = resourceId8 != -1 ? a9.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b14 = resourceId9 != -1 ? a9.b(context, resourceId9) : null;
        if (b13 != null || b14 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b13 == null) {
                b13 = compoundDrawablesRelative[0];
            }
            if (b10 == null) {
                b10 = compoundDrawablesRelative[1];
            }
            if (b14 == null) {
                b14 = compoundDrawablesRelative[2];
            }
            if (b12 == null) {
                b12 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b13, b10, b14, b12);
        } else if (b9 != null || b10 != null || b11 != null || b12 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b9 == null) {
                    b9 = compoundDrawables[0];
                }
                if (b10 == null) {
                    b10 = compoundDrawables[1];
                }
                if (b11 == null) {
                    b11 = compoundDrawables[2];
                }
                if (b12 == null) {
                    b12 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b9, b10, b11, b12);
            } else {
                if (b10 == null) {
                    b10 = compoundDrawablesRelative2[1];
                }
                if (b12 == null) {
                    b12 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b10, compoundDrawablesRelative2[2], b12);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = E.e.c(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            U.m.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            U.m.g(textView, AbstractC4742j0.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i14 = peekValue.data;
                i9 = i14 & 15;
                f6 = TypedValue.complexToFloat(i14);
                i4 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i4) {
                    com.bumptech.glide.d.v(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i4) {
                    com.bumptech.glide.d.w(textView, dimensionPixelSize2);
                }
                if (f6 == -1.0f) {
                    if (i9 == i4) {
                        com.bumptech.glide.d.x(textView, (int) f6);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        U.p.a(textView, i9, f6);
                        return;
                    } else {
                        com.bumptech.glide.d.x(textView, Math.round(TypedValue.applyDimension(i9, f6, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i4 = -1;
            f6 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i4 = -1;
            f6 = -1.0f;
        }
        i9 = i4;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i4) {
        }
        if (dimensionPixelSize2 != i4) {
        }
        if (f6 == -1.0f) {
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC4518a.f37839w);
        Q0 q02 = new Q0(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f39335a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, q02);
        if (i4 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            T.d(textView, string);
        }
        q02.q();
        Typeface typeface = this.f39345l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f39343j);
        }
    }

    public final void i(int i, int i4, int i9, int i10) {
        C4732e0 c4732e0 = this.i;
        if (c4732e0.j()) {
            DisplayMetrics displayMetrics = c4732e0.f39412j.getResources().getDisplayMetrics();
            c4732e0.k(TypedValue.applyDimension(i10, i, displayMetrics), TypedValue.applyDimension(i10, i4, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (c4732e0.h()) {
                c4732e0.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        C4732e0 c4732e0 = this.i;
        if (c4732e0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c4732e0.f39412j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr2[i4] = Math.round(TypedValue.applyDimension(i, iArr[i4], displayMetrics));
                    }
                }
                c4732e0.f39409f = C4732e0.b(iArr2);
                if (!c4732e0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c4732e0.f39410g = false;
            }
            if (c4732e0.h()) {
                c4732e0.a();
            }
        }
    }

    public final void k(int i) {
        C4732e0 c4732e0 = this.i;
        if (c4732e0.j()) {
            if (i == 0) {
                c4732e0.f39404a = 0;
                c4732e0.f39407d = -1.0f;
                c4732e0.f39408e = -1.0f;
                c4732e0.f39406c = -1.0f;
                c4732e0.f39409f = new int[0];
                c4732e0.f39405b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(CL.i(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c4732e0.f39412j.getResources().getDisplayMetrics();
            c4732e0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c4732e0.h()) {
                c4732e0.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f39342h == null) {
            this.f39342h = new e8.h();
        }
        e8.h hVar = this.f39342h;
        hVar.f37401c = colorStateList;
        hVar.f37400b = colorStateList != null;
        this.f39336b = hVar;
        this.f39337c = hVar;
        this.f39338d = hVar;
        this.f39339e = hVar;
        this.f39340f = hVar;
        this.f39341g = hVar;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f39342h == null) {
            this.f39342h = new e8.h();
        }
        e8.h hVar = this.f39342h;
        hVar.f37402d = mode;
        hVar.f37399a = mode != null;
        this.f39336b = hVar;
        this.f39337c = hVar;
        this.f39338d = hVar;
        this.f39339e = hVar;
        this.f39340f = hVar;
        this.f39341g = hVar;
    }

    public final void n(Context context, Q0 q02) {
        String string;
        int i = this.f39343j;
        TypedArray typedArray = (TypedArray) q02.f39326c;
        this.f39343j = typedArray.getInt(2, i);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i9 = typedArray.getInt(11, -1);
            this.f39344k = i9;
            if (i9 != -1) {
                this.f39343j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f39346m = false;
                int i10 = typedArray.getInt(1, 1);
                if (i10 == 1) {
                    this.f39345l = Typeface.SANS_SERIF;
                    return;
                } else if (i10 == 2) {
                    this.f39345l = Typeface.SERIF;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f39345l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f39345l = null;
        int i11 = typedArray.hasValue(12) ? 12 : 10;
        int i12 = this.f39344k;
        int i13 = this.f39343j;
        if (!context.isRestricted()) {
            try {
                Typeface i14 = q02.i(i11, this.f39343j, new Q(this, i12, i13, new WeakReference(this.f39335a)));
                if (i14 != null) {
                    if (i4 < 28 || this.f39344k == -1) {
                        this.f39345l = i14;
                    } else {
                        this.f39345l = U.a(Typeface.create(i14, 0), this.f39344k, (this.f39343j & 2) != 0);
                    }
                }
                this.f39346m = this.f39345l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f39345l != null || (string = typedArray.getString(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f39344k == -1) {
            this.f39345l = Typeface.create(string, this.f39343j);
        } else {
            this.f39345l = U.a(Typeface.create(string, 0), this.f39344k, (this.f39343j & 2) != 0);
        }
    }
}
