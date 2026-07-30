package n;

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
import h.AbstractC0454a;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6725a;

    /* renamed from: b, reason: collision with root package name */
    public D6.i f6726b;

    /* renamed from: c, reason: collision with root package name */
    public D6.i f6727c;

    /* renamed from: d, reason: collision with root package name */
    public D6.i f6728d;

    /* renamed from: e, reason: collision with root package name */
    public D6.i f6729e;

    /* renamed from: f, reason: collision with root package name */
    public D6.i f6730f;

    /* renamed from: g, reason: collision with root package name */
    public D6.i f6731g;

    /* renamed from: h, reason: collision with root package name */
    public D6.i f6732h;

    /* renamed from: i, reason: collision with root package name */
    public final C0717j0 f6733i;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f6734k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f6735l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6736m;

    public Z(TextView textView) {
        this.f6725a = textView;
        this.f6733i = new C0717j0(textView);
    }

    public static D6.i c(Context context, C0733s c0733s, int i2) {
        ColorStateList f7;
        synchronized (c0733s) {
            f7 = c0733s.f6881a.f(context, i2);
        }
        if (f7 == null) {
            return null;
        }
        D6.i iVar = new D6.i();
        iVar.f514b = true;
        iVar.f515c = f7;
        return iVar;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i2 >= 30) {
            K.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i2 >= 30) {
            K.b.a(editorInfo, text);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i7 = editorInfo.initialSelEnd;
        int i8 = i5 > i7 ? i7 : i5;
        if (i5 <= i7) {
            i5 = i7;
        }
        int length = text.length();
        if (i8 < 0 || i5 > length) {
            K.d.b(editorInfo, null, 0, 0);
            return;
        }
        int i9 = editorInfo.inputType & 4095;
        if (i9 == 129 || i9 == 225 || i9 == 18) {
            K.d.b(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            K.d.b(editorInfo, text, i8, i5);
            return;
        }
        int i10 = i5 - i8;
        int i11 = i10 > 1024 ? 0 : i10;
        int i12 = 2048 - i11;
        int min = Math.min(text.length() - i5, i12 - Math.min(i8, (int) (i12 * 0.8d)));
        int min2 = Math.min(i8, i12 - min);
        int i13 = i8 - min2;
        if (Character.isLowSurrogate(text.charAt(i13))) {
            i13++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i5 + min) - 1))) {
            min--;
        }
        int i14 = min2 + i11;
        K.d.b(editorInfo, i11 != i10 ? TextUtils.concat(text.subSequence(i13, i13 + min2), text.subSequence(i5, min + i5)) : text.subSequence(i13, i14 + min + i13), min2, i14);
    }

    public final void a(Drawable drawable, D6.i iVar) {
        if (drawable == null || iVar == null) {
            return;
        }
        C0733s.d(drawable, iVar, this.f6725a.getDrawableState());
    }

    public final void b() {
        D6.i iVar = this.f6726b;
        TextView textView = this.f6725a;
        if (iVar != null || this.f6727c != null || this.f6728d != null || this.f6729e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f6726b);
            a(compoundDrawables[1], this.f6727c);
            a(compoundDrawables[2], this.f6728d);
            a(compoundDrawables[3], this.f6729e);
        }
        if (this.f6730f == null && this.f6731g == null) {
            return;
        }
        Drawable[] a7 = V.a(textView);
        a(a7[0], this.f6730f);
        a(a7[2], this.f6731g);
    }

    public final ColorStateList d() {
        D6.i iVar = this.f6732h;
        if (iVar != null) {
            return (ColorStateList) iVar.f515c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        D6.i iVar = this.f6732h;
        if (iVar != null) {
            return (PorterDuff.Mode) iVar.f516d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i2) {
        boolean z7;
        boolean z8;
        String str;
        String str2;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        TextView textView = this.f6725a;
        Context context = textView.getContext();
        C0733s a7 = C0733s.a();
        int[] iArr = AbstractC0454a.f5044h;
        D0.j R4 = D0.j.R(context, attributeSet, iArr, i2);
        I.T.h(textView, textView.getContext(), iArr, attributeSet, (TypedArray) R4.f331i, i2);
        TypedArray typedArray = (TypedArray) R4.f331i;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f6726b = c(context, a7, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f6727c = c(context, a7, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f6728d = c(context, a7, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f6729e = c(context, a7, typedArray.getResourceId(2, 0));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f6730f = c(context, a7, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f6731g = c(context, a7, typedArray.getResourceId(6, 0));
        }
        R4.W();
        boolean z9 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0454a.f5059x;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            D0.j jVar = new D0.j(context, obtainStyledAttributes);
            if (z9 || !obtainStyledAttributes.hasValue(14)) {
                z7 = false;
                z8 = false;
            } else {
                z8 = obtainStyledAttributes.getBoolean(14, false);
                z7 = true;
            }
            n(context, jVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i7 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            jVar.W();
        } else {
            z7 = false;
            z8 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        D0.j jVar2 = new D0.j(context, obtainStyledAttributes2);
        if (!z9 && obtainStyledAttributes2.hasValue(14)) {
            z8 = obtainStyledAttributes2.getBoolean(14, false);
            z7 = true;
        }
        boolean z10 = z8;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i7 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i7 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, jVar2);
        jVar2.W();
        if (!z9 && z7) {
            textView.setAllCaps(z10);
        }
        Typeface typeface = this.f6735l;
        if (typeface != null) {
            if (this.f6734k == -1) {
                textView.setTypeface(typeface, this.j);
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
        C0717j0 c0717j0 = this.f6733i;
        Context context2 = c0717j0.j;
        int[] iArr3 = AbstractC0454a.f5045i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i2, 0);
        TextView textView2 = c0717j0.f6826i;
        I.T.h(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i2);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0717j0.f6818a = obtainStyledAttributes3.getInt(5, 0);
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
                c0717j0.f6823f = C0717j0.b(iArr4);
                c0717j0.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c0717j0.j()) {
            c0717j0.f6818a = 0;
        } else if (c0717j0.f6818a == 1) {
            if (!c0717j0.f6824g) {
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
                float f7 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0717j0.k(dimension2, f7, dimension);
            }
            c0717j0.h();
        }
        if (z1.f6968b && c0717j0.f6818a != 0) {
            int[] iArr5 = c0717j0.f6823f;
            if (iArr5.length > 0) {
                if (X.a(textView) != -1.0f) {
                    X.b(textView, Math.round(c0717j0.f6821d), Math.round(c0717j0.f6822e), Math.round(c0717j0.f6820c), 0);
                } else {
                    X.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b7 = resourceId4 != -1 ? a7.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b8 = resourceId5 != -1 ? a7.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b9 = resourceId6 != -1 ? a7.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b10 = resourceId7 != -1 ? a7.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b11 = resourceId8 != -1 ? a7.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b12 = resourceId9 != -1 ? a7.b(context, resourceId9) : null;
        if (b11 != null || b12 != null) {
            Drawable[] a8 = V.a(textView);
            if (b11 == null) {
                b11 = a8[0];
            }
            if (b8 == null) {
                b8 = a8[1];
            }
            if (b12 == null) {
                b12 = a8[2];
            }
            if (b10 == null) {
                b10 = a8[3];
            }
            V.b(textView, b11, b8, b12, b10);
        } else if (b7 != null || b8 != null || b9 != null || b10 != null) {
            Drawable[] a9 = V.a(textView);
            Drawable drawable = a9[0];
            if (drawable == null && a9[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b7 == null) {
                    b7 = compoundDrawables[0];
                }
                if (b8 == null) {
                    b8 = compoundDrawables[1];
                }
                if (b9 == null) {
                    b9 = compoundDrawables[2];
                }
                if (b10 == null) {
                    b10 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b7, b8, b9, b10);
            } else {
                if (b8 == null) {
                    b8 = a9[1];
                }
                Drawable drawable2 = a9[2];
                if (b10 == null) {
                    b10 = a9[3];
                }
                V.b(textView, drawable, b8, drawable2, b10);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = O6.g.K(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC0731q0.c(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            P0.f.K(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            P0.f.L(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
            }
        }
    }

    public final void g(Context context, int i2) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0454a.f5059x);
        D0.j jVar = new D0.j(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f6725a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, jVar);
        if (i5 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            X.d(textView, string);
        }
        jVar.W();
        Typeface typeface = this.f6735l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i2, int i5, int i7, int i8) {
        C0717j0 c0717j0 = this.f6733i;
        if (c0717j0.j()) {
            DisplayMetrics displayMetrics = c0717j0.j.getResources().getDisplayMetrics();
            c0717j0.k(TypedValue.applyDimension(i8, i2, displayMetrics), TypedValue.applyDimension(i8, i5, displayMetrics), TypedValue.applyDimension(i8, i7, displayMetrics));
            if (c0717j0.h()) {
                c0717j0.a();
            }
        }
    }

    public final void j(int[] iArr, int i2) {
        C0717j0 c0717j0 = this.f6733i;
        if (c0717j0.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0717j0.j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i2, iArr[i5], displayMetrics));
                    }
                }
                c0717j0.f6823f = C0717j0.b(iArr2);
                if (!c0717j0.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0717j0.f6824g = false;
            }
            if (c0717j0.h()) {
                c0717j0.a();
            }
        }
    }

    public final void k(int i2) {
        C0717j0 c0717j0 = this.f6733i;
        if (c0717j0.j()) {
            if (i2 == 0) {
                c0717j0.f6818a = 0;
                c0717j0.f6821d = -1.0f;
                c0717j0.f6822e = -1.0f;
                c0717j0.f6820c = -1.0f;
                c0717j0.f6823f = new int[0];
                c0717j0.f6819b = false;
                return;
            }
            if (i2 != 1) {
                throw new IllegalArgumentException(C4.p.g(i2, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c0717j0.j.getResources().getDisplayMetrics();
            c0717j0.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0717j0.h()) {
                c0717j0.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f6732h == null) {
            this.f6732h = new D6.i();
        }
        D6.i iVar = this.f6732h;
        iVar.f515c = colorStateList;
        iVar.f514b = colorStateList != null;
        this.f6726b = iVar;
        this.f6727c = iVar;
        this.f6728d = iVar;
        this.f6729e = iVar;
        this.f6730f = iVar;
        this.f6731g = iVar;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f6732h == null) {
            this.f6732h = new D6.i();
        }
        D6.i iVar = this.f6732h;
        iVar.f516d = mode;
        iVar.f513a = mode != null;
        this.f6726b = iVar;
        this.f6727c = iVar;
        this.f6728d = iVar;
        this.f6729e = iVar;
        this.f6730f = iVar;
        this.f6731g = iVar;
    }

    public final void n(Context context, D0.j jVar) {
        String string;
        int i2 = this.j;
        TypedArray typedArray = (TypedArray) jVar.f331i;
        this.j = typedArray.getInt(2, i2);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int i7 = typedArray.getInt(11, -1);
            this.f6734k = i7;
            if (i7 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f6736m = false;
                int i8 = typedArray.getInt(1, 1);
                if (i8 == 1) {
                    this.f6735l = Typeface.SANS_SERIF;
                    return;
                } else if (i8 == 2) {
                    this.f6735l = Typeface.SERIF;
                    return;
                } else {
                    if (i8 != 3) {
                        return;
                    }
                    this.f6735l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f6735l = null;
        int i9 = typedArray.hasValue(12) ? 12 : 10;
        int i10 = this.f6734k;
        int i11 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface L7 = jVar.L(i9, this.j, new U(this, i10, i11, new WeakReference(this.f6725a)));
                if (L7 != null) {
                    if (i5 < 28 || this.f6734k == -1) {
                        this.f6735l = L7;
                    } else {
                        this.f6735l = Y.a(Typeface.create(L7, 0), this.f6734k, (this.j & 2) != 0);
                    }
                }
                this.f6736m = this.f6735l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f6735l != null || (string = typedArray.getString(i9)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f6734k == -1) {
            this.f6735l = Typeface.create(string, this.j);
        } else {
            this.f6735l = Y.a(Typeface.create(string, 0), this.f6734k, (this.j & 2) != 0);
        }
    }
}
