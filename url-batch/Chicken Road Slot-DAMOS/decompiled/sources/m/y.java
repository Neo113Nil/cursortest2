package m;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f6206a;

    /* renamed from: b, reason: collision with root package name */
    public q1 f6207b;

    /* renamed from: c, reason: collision with root package name */
    public q1 f6208c;

    /* renamed from: d, reason: collision with root package name */
    public q1 f6209d;

    /* renamed from: e, reason: collision with root package name */
    public q1 f6210e;

    /* renamed from: f, reason: collision with root package name */
    public q1 f6211f;
    public q1 g;

    /* renamed from: h, reason: collision with root package name */
    public q1 f6212h;

    /* renamed from: i, reason: collision with root package name */
    public final h0 f6213i;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f6214k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f6215l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6216m;

    public y(TextView textView) {
        this.f6206a = textView;
        this.f6213i = new h0(textView);
    }

    public static q1 c(Context context, o oVar, int i3) {
        ColorStateList g;
        synchronized (oVar) {
            g = oVar.f6143a.g(context, i3);
        }
        if (g == null) {
            return null;
        }
        q1 q1Var = new q1();
        q1Var.f6174d = true;
        q1Var.f6171a = g;
        return q1Var;
    }

    public final void a(Drawable drawable, q1 q1Var) {
        if (drawable == null || q1Var == null) {
            return;
        }
        o.c(drawable, q1Var, this.f6206a.getDrawableState());
    }

    public final void b() {
        q1 q1Var = this.f6207b;
        TextView textView = this.f6206a;
        if (q1Var != null || this.f6208c != null || this.f6209d != null || this.f6210e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f6207b);
            a(compoundDrawables[1], this.f6208c);
            a(compoundDrawables[2], this.f6209d);
            a(compoundDrawables[3], this.f6210e);
        }
        if (this.f6211f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f6211f);
        a(compoundDrawablesRelative[2], this.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i3) {
        o oVar;
        boolean z10;
        boolean z11;
        String str;
        String str2;
        float f3;
        float f10;
        int i10;
        float f11;
        int i11;
        ColorStateList colorStateList;
        int resourceId;
        int i12;
        int resourceId2;
        int[] iArr = i.a.f4554q;
        h0 h0Var = this.f6213i;
        TextView textView = this.f6206a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = o.f6141b;
        synchronized (o.class) {
            try {
                if (o.f6142c == null) {
                    o.b();
                }
                oVar = o.f6142c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr2 = i.a.f4545f;
        a1.n z12 = a1.n.z(context, attributeSet, iArr2, i3);
        TextView textView2 = this.f6206a;
        o3.c0.c(textView2, textView2.getContext(), iArr2, attributeSet, (TypedArray) z12.f40e, i3);
        TypedArray typedArray = (TypedArray) z12.f40e;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f6207b = c(context, oVar, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f6208c = c(context, oVar, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f6209d = c(context, oVar, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f6210e = c(context, oVar, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f6211f = c(context, oVar, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, oVar, typedArray.getResourceId(6, 0));
        }
        z12.D();
        boolean z13 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr);
            a1.n nVar = new a1.n(context, obtainStyledAttributes);
            if (z13 || !obtainStyledAttributes.hasValue(14)) {
                z10 = false;
                z11 = false;
            } else {
                z10 = obtainStyledAttributes.getBoolean(14, false);
                z11 = true;
            }
            f(context, nVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (Build.VERSION.SDK_INT < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            nVar.D();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        a1.n nVar2 = new a1.n(context, obtainStyledAttributes2);
        if (!z13 && obtainStyledAttributes2.hasValue(14)) {
            z10 = obtainStyledAttributes2.getBoolean(14, false);
            z11 = true;
        }
        boolean z14 = z10;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i13 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, nVar2);
        nVar2.D();
        if (!z13 && z11) {
            this.f6206a.setAllCaps(z14);
        }
        Typeface typeface = this.f6215l;
        if (typeface != null) {
            if (this.f6214k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            w.d(textView, str);
        }
        if (str2 != null) {
            v.b(textView, v.a(str2));
        }
        Context context2 = h0Var.j;
        int[] iArr3 = i.a.g;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i3, 0);
        TextView textView3 = h0Var.f6094i;
        o3.c0.c(textView3, textView3.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i3);
        if (obtainStyledAttributes3.hasValue(5)) {
            h0Var.f6087a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(1)) {
            f10 = obtainStyledAttributes3.getDimension(1, -1.0f);
            f3 = -1.0f;
        } else {
            f3 = -1.0f;
            f10 = -1.0f;
        }
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i14 = 0; i14 < length; i14++) {
                    iArr4[i14] = obtainTypedArray.getDimensionPixelSize(i14, -1);
                }
                h0Var.f6092f = h0.b(iArr4);
                h0Var.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (h0Var.f6087a == 1) {
            if (!h0Var.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f3) {
                    i12 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i12 = 2;
                }
                if (f10 == f3) {
                    f10 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                }
                if (dimension == f3) {
                    dimension = 1.0f;
                }
                h0Var.i(dimension2, f10, dimension);
            }
            h0Var.g();
        }
        if (j2.f6117a && h0Var.f6087a != 0) {
            int[] iArr5 = h0Var.f6092f;
            if (iArr5.length > 0) {
                if (w.a(textView) != f3) {
                    w.b(textView, Math.round(h0Var.f6090d), Math.round(h0Var.f6091e), Math.round(h0Var.f6089c), 0);
                } else {
                    w.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, i.a.g);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a9 = resourceId4 != -1 ? oVar.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a10 = resourceId5 != -1 ? oVar.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a11 = resourceId6 != -1 ? oVar.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a12 = resourceId7 != -1 ? oVar.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a13 = resourceId8 != -1 ? oVar.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a14 = resourceId9 != -1 ? oVar.a(context, resourceId9) : null;
        if (a13 != null || a14 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a13 == null) {
                a13 = compoundDrawablesRelative[0];
            }
            if (a10 == null) {
                a10 = compoundDrawablesRelative[1];
            }
            if (a14 == null) {
                a14 = compoundDrawablesRelative[2];
            }
            if (a12 == null) {
                a12 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a13, a10, a14, a12);
        } else if (a9 != null || a10 != null || a11 != null || a12 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a9 == null) {
                    a9 = compoundDrawables[0];
                }
                if (a10 == null) {
                    a10 = compoundDrawables[1];
                }
                if (a11 == null) {
                    a11 = compoundDrawables[2];
                }
                if (a12 == null) {
                    a12 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(a9, a10, a11, a12);
            } else {
                if (a10 == null) {
                    a10 = compoundDrawablesRelative2[1];
                }
                if (a12 == null) {
                    a12 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a10, compoundDrawablesRelative2[2], a12);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = z4.w.t(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(k0.b(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i15 = peekValue.data;
                int i16 = i15 & 15;
                f11 = TypedValue.complexToFloat(i15);
                i11 = i16;
                i10 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i10) {
                    a.a.Y(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i10) {
                    a.a.Z(textView, dimensionPixelSize2);
                }
                if (f11 == f3) {
                    if (i11 == i10) {
                        a.a.a0(textView, (int) f11);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        o3.q.k(textView, i11, f11);
                        return;
                    } else {
                        a.a.a0(textView, Math.round(TypedValue.applyDimension(i11, f11, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i10 = -1;
            f11 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i10 = -1;
            f11 = f3;
        }
        i11 = i10;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i10) {
        }
        if (dimensionPixelSize2 != i10) {
        }
        if (f11 == f3) {
        }
    }

    public final void e(Context context, int i3) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, i.a.f4554q);
        a1.n nVar = new a1.n(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f6206a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, nVar);
        if (Build.VERSION.SDK_INT >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            w.d(textView, string);
        }
        nVar.D();
        Typeface typeface = this.f6215l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void f(Context context, a1.n nVar) {
        String string;
        int i3 = this.j;
        TypedArray typedArray = (TypedArray) nVar.f40e;
        this.j = typedArray.getInt(2, i3);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f6214k = i11;
            if (i11 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f6216m = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.f6215l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f6215l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f6215l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f6215l = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.f6214k;
        int i15 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface s3 = nVar.s(i13, this.j, new u(this, i14, i15, new WeakReference(this.f6206a)));
                if (s3 != null) {
                    if (i10 < 28 || this.f6214k == -1) {
                        this.f6215l = s3;
                    } else {
                        this.f6215l = x.a(Typeface.create(s3, 0), this.f6214k, (this.j & 2) != 0);
                    }
                }
                this.f6216m = this.f6215l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f6215l != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f6214k == -1) {
            this.f6215l = Typeface.create(string, this.j);
        } else {
            this.f6215l = x.a(Typeface.create(string, 0), this.f6214k, (this.j & 2) != 0);
        }
    }
}
