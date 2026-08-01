package B0;

import K.X;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import o0.AbstractC0307a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f67A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f68B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f69C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f71E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f72G;

    /* renamed from: H, reason: collision with root package name */
    public float f73H;

    /* renamed from: I, reason: collision with root package name */
    public float f74I;

    /* renamed from: J, reason: collision with root package name */
    public float f75J;

    /* renamed from: K, reason: collision with root package name */
    public int f76K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f77L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f78M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f79N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f80O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f81P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f82Q;

    /* renamed from: R, reason: collision with root package name */
    public float f83R;

    /* renamed from: S, reason: collision with root package name */
    public float f84S;

    /* renamed from: T, reason: collision with root package name */
    public float f85T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f86U;

    /* renamed from: V, reason: collision with root package name */
    public float f87V;

    /* renamed from: W, reason: collision with root package name */
    public float f88W;

    /* renamed from: X, reason: collision with root package name */
    public float f89X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f90Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f91Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f92a;

    /* renamed from: a0, reason: collision with root package name */
    public float f93a0;

    /* renamed from: b, reason: collision with root package name */
    public float f94b;

    /* renamed from: b0, reason: collision with root package name */
    public float f95b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f96c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f97c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f98d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f100e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f105j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f106k;

    /* renamed from: l, reason: collision with root package name */
    public float f107l;

    /* renamed from: m, reason: collision with root package name */
    public float f108m;

    /* renamed from: n, reason: collision with root package name */
    public float f109n;

    /* renamed from: o, reason: collision with root package name */
    public float f110o;

    /* renamed from: p, reason: collision with root package name */
    public float f111p;

    /* renamed from: q, reason: collision with root package name */
    public float f112q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f113r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f114s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f115t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f116u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f117v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f118w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f119x;

    /* renamed from: y, reason: collision with root package name */
    public E0.a f120y;

    /* renamed from: f, reason: collision with root package name */
    public int f102f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f104g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f121z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f70D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f99d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f101e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f103f0 = 1;

    public e(TextInputLayout textInputLayout) {
        this.f92a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f79N = textPaint;
        this.f80O = new TextPaint(textPaint);
        this.f98d = new Rect();
        this.f96c = new Rect();
        this.f100e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i2, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i2) * f2) + (Color.alpha(i) * f3)), Math.round((Color.red(i2) * f2) + (Color.red(i) * f3)), Math.round((Color.green(i2) * f2) + (Color.green(i) * f3)), Math.round((Color.blue(i2) * f2) + (Color.blue(i) * f3)));
    }

    public static float f(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return AbstractC0307a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = X.f419a;
        boolean z2 = this.f92a.getLayoutDirection() == 1;
        if (this.f70D) {
            return (z2 ? I.h.f368d : I.h.f367c).c(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f67A == null) {
            return;
        }
        float width = this.f98d.width();
        float width2 = this.f96c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f87V;
            this.F = 1.0f;
            typeface = this.f113r;
        } else {
            float f5 = this.h;
            float f6 = this.f88W;
            Typeface typeface2 = this.f116u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f82Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f79N;
        if (width > 0.0f) {
            boolean z4 = this.f72G != f3;
            boolean z5 = this.f89X != f4;
            boolean z6 = this.f119x != typeface;
            StaticLayout staticLayout = this.f90Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f78M;
            this.f72G = f3;
            this.f89X = f4;
            this.f119x = typeface;
            this.f78M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f68B == null || z3) {
            textPaint.setTextSize(this.f72G);
            textPaint.setTypeface(this.f119x);
            textPaint.setLetterSpacing(this.f89X);
            boolean b2 = b(this.f67A);
            this.f69C = b2;
            int i = this.f99d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f102f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f69C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f69C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            j jVar = new j(this.f67A, textPaint, (int) width);
            jVar.f138k = this.f121z;
            jVar.f137j = b2;
            jVar.f134e = alignment;
            jVar.i = false;
            jVar.f135f = i;
            jVar.f136g = this.f101e0;
            jVar.h = this.f103f0;
            StaticLayout a2 = jVar.a();
            a2.getClass();
            this.f90Y = a2;
            this.f68B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f80O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f113r);
        textPaint.setLetterSpacing(this.f87V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f77L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f115t;
            if (typeface != null) {
                this.f114s = q1.d.O(configuration, typeface);
            }
            Typeface typeface2 = this.f118w;
            if (typeface2 != null) {
                this.f117v = q1.d.O(configuration, typeface2);
            }
            Typeface typeface3 = this.f114s;
            if (typeface3 == null) {
                typeface3 = this.f115t;
            }
            this.f113r = typeface3;
            Typeface typeface4 = this.f117v;
            if (typeface4 == null) {
                typeface4 = this.f118w;
            }
            this.f116u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f92a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f68B;
        TextPaint textPaint = this.f79N;
        if (charSequence != null && (staticLayout = this.f90Y) != null) {
            this.f97c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f121z);
        }
        CharSequence charSequence2 = this.f97c0;
        if (charSequence2 != null) {
            this.f91Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f91Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f104g, this.f69C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f98d;
        if (i == 48) {
            this.f108m = rect.top;
        } else if (i != 80) {
            this.f108m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f108m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f110o = rect.centerX() - (this.f91Z / 2.0f);
        } else if (i2 != 5) {
            this.f110o = rect.left;
        } else {
            this.f110o = rect.right - this.f91Z;
        }
        c(0.0f, z2);
        float height = this.f90Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f90Y;
        if (staticLayout2 == null || this.f99d0 <= 1) {
            CharSequence charSequence3 = this.f68B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f90Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f102f, this.f69C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f96c;
        if (i3 == 48) {
            this.f107l = rect2.top;
        } else if (i3 != 80) {
            this.f107l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f107l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f109n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f109n = rect2.left;
        } else {
            this.f109n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f71E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f71E = null;
        }
        l(this.f94b);
        float f2 = this.f94b;
        float f3 = f(rect2.left, rect.left, f2, this.f81P);
        RectF rectF = this.f100e;
        rectF.left = f3;
        rectF.top = f(this.f107l, this.f108m, f2, this.f81P);
        rectF.right = f(rect2.right, rect.right, f2, this.f81P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f81P);
        this.f111p = f(this.f109n, this.f110o, f2, this.f81P);
        this.f112q = f(this.f107l, this.f108m, f2, this.f81P);
        l(f2);
        Y.a aVar = AbstractC0307a.f3717b;
        this.f93a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
        WeakHashMap weakHashMap = X.f419a;
        textInputLayout.postInvalidateOnAnimation();
        this.f95b0 = f(1.0f, 0.0f, f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f106k;
        ColorStateList colorStateList2 = this.f105j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f106k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f87V;
        float f5 = this.f88W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, aVar));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f73H = AbstractC0307a.a(0.0f, this.f83R, f2);
        this.f74I = AbstractC0307a.a(0.0f, this.f84S, f2);
        this.f75J = AbstractC0307a.a(0.0f, this.f85T, f2);
        int a2 = a(0, e(this.f86U), f2);
        this.f76K = a2;
        textPaint.setShadowLayer(this.f73H, this.f74I, this.f75J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f106k == colorStateList && this.f105j == colorStateList) {
            return;
        }
        this.f106k = colorStateList;
        this.f105j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        E0.a aVar = this.f120y;
        if (aVar != null) {
            aVar.i = true;
        }
        if (this.f115t == typeface) {
            return false;
        }
        this.f115t = typeface;
        Typeface O2 = q1.d.O(this.f92a.getContext().getResources().getConfiguration(), typeface);
        this.f114s = O2;
        if (O2 == null) {
            O2 = this.f115t;
        }
        this.f113r = O2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f94b) {
            this.f94b = f2;
            float f3 = this.f96c.left;
            Rect rect = this.f98d;
            float f4 = f(f3, rect.left, f2, this.f81P);
            RectF rectF = this.f100e;
            rectF.left = f4;
            rectF.top = f(this.f107l, this.f108m, f2, this.f81P);
            rectF.right = f(r1.right, rect.right, f2, this.f81P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f81P);
            this.f111p = f(this.f109n, this.f110o, f2, this.f81P);
            this.f112q = f(this.f107l, this.f108m, f2, this.f81P);
            l(f2);
            Y.a aVar = AbstractC0307a.f3717b;
            this.f93a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
            WeakHashMap weakHashMap = X.f419a;
            TextInputLayout textInputLayout = this.f92a;
            textInputLayout.postInvalidateOnAnimation();
            this.f95b0 = f(1.0f, 0.0f, f2, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f106k;
            ColorStateList colorStateList2 = this.f105j;
            TextPaint textPaint = this.f79N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f106k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f87V;
            float f6 = this.f88W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, aVar));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f73H = AbstractC0307a.a(0.0f, this.f83R, f2);
            this.f74I = AbstractC0307a.a(0.0f, this.f84S, f2);
            this.f75J = AbstractC0307a.a(0.0f, this.f85T, f2);
            int a2 = a(0, e(this.f86U), f2);
            this.f76K = a2;
            textPaint.setShadowLayer(this.f73H, this.f74I, this.f75J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = X.f419a;
        this.f92a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f118w != typeface) {
            this.f118w = typeface;
            Typeface O2 = q1.d.O(this.f92a.getContext().getResources().getConfiguration(), typeface);
            this.f117v = O2;
            if (O2 == null) {
                O2 = this.f118w;
            }
            this.f116u = O2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
