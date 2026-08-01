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
import o0.AbstractC0305a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f68A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f69B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f70C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f72E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f73G;

    /* renamed from: H, reason: collision with root package name */
    public float f74H;

    /* renamed from: I, reason: collision with root package name */
    public float f75I;

    /* renamed from: J, reason: collision with root package name */
    public float f76J;

    /* renamed from: K, reason: collision with root package name */
    public int f77K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f78L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f79M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f80N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f81O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f82P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f83Q;

    /* renamed from: R, reason: collision with root package name */
    public float f84R;

    /* renamed from: S, reason: collision with root package name */
    public float f85S;

    /* renamed from: T, reason: collision with root package name */
    public float f86T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f87U;

    /* renamed from: V, reason: collision with root package name */
    public float f88V;

    /* renamed from: W, reason: collision with root package name */
    public float f89W;

    /* renamed from: X, reason: collision with root package name */
    public float f90X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f91Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f92Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f93a;

    /* renamed from: a0, reason: collision with root package name */
    public float f94a0;

    /* renamed from: b, reason: collision with root package name */
    public float f95b;

    /* renamed from: b0, reason: collision with root package name */
    public float f96b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f97c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f98c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f99d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f101e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f106j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f107k;

    /* renamed from: l, reason: collision with root package name */
    public float f108l;

    /* renamed from: m, reason: collision with root package name */
    public float f109m;

    /* renamed from: n, reason: collision with root package name */
    public float f110n;

    /* renamed from: o, reason: collision with root package name */
    public float f111o;

    /* renamed from: p, reason: collision with root package name */
    public float f112p;

    /* renamed from: q, reason: collision with root package name */
    public float f113q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f114r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f115s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f116t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f117u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f118v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f119w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f120x;

    /* renamed from: y, reason: collision with root package name */
    public E0.a f121y;

    /* renamed from: f, reason: collision with root package name */
    public int f103f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f105g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f122z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f71D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f100d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f102e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f104f0 = 1;

    public e(TextInputLayout textInputLayout) {
        this.f93a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f80N = textPaint;
        this.f81O = new TextPaint(textPaint);
        this.f99d = new Rect();
        this.f97c = new Rect();
        this.f101e = new RectF();
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
        return AbstractC0305a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = X.f418a;
        boolean z2 = this.f93a.getLayoutDirection() == 1;
        if (this.f71D) {
            return (z2 ? I.h.f369d : I.h.f368c).c(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f68A == null) {
            return;
        }
        float width = this.f99d.width();
        float width2 = this.f97c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f88V;
            this.F = 1.0f;
            typeface = this.f114r;
        } else {
            float f5 = this.h;
            float f6 = this.f89W;
            Typeface typeface2 = this.f117u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f83Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f80N;
        if (width > 0.0f) {
            boolean z4 = this.f73G != f3;
            boolean z5 = this.f90X != f4;
            boolean z6 = this.f120x != typeface;
            StaticLayout staticLayout = this.f91Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f79M;
            this.f73G = f3;
            this.f90X = f4;
            this.f120x = typeface;
            this.f79M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f69B == null || z3) {
            textPaint.setTextSize(this.f73G);
            textPaint.setTypeface(this.f120x);
            textPaint.setLetterSpacing(this.f90X);
            boolean b2 = b(this.f68A);
            this.f70C = b2;
            int i = this.f100d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f103f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f70C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f70C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            j jVar = new j(this.f68A, textPaint, (int) width);
            jVar.f139k = this.f122z;
            jVar.f138j = b2;
            jVar.f135e = alignment;
            jVar.i = false;
            jVar.f136f = i;
            jVar.f137g = this.f102e0;
            jVar.h = this.f104f0;
            StaticLayout a2 = jVar.a();
            a2.getClass();
            this.f91Y = a2;
            this.f69B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f81O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f114r);
        textPaint.setLetterSpacing(this.f88V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f78L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f116t;
            if (typeface != null) {
                this.f115s = q1.d.O(configuration, typeface);
            }
            Typeface typeface2 = this.f119w;
            if (typeface2 != null) {
                this.f118v = q1.d.O(configuration, typeface2);
            }
            Typeface typeface3 = this.f115s;
            if (typeface3 == null) {
                typeface3 = this.f116t;
            }
            this.f114r = typeface3;
            Typeface typeface4 = this.f118v;
            if (typeface4 == null) {
                typeface4 = this.f119w;
            }
            this.f117u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f93a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f69B;
        TextPaint textPaint = this.f80N;
        if (charSequence != null && (staticLayout = this.f91Y) != null) {
            this.f98c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f122z);
        }
        CharSequence charSequence2 = this.f98c0;
        if (charSequence2 != null) {
            this.f92Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f92Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f105g, this.f70C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f99d;
        if (i == 48) {
            this.f109m = rect.top;
        } else if (i != 80) {
            this.f109m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f109m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f111o = rect.centerX() - (this.f92Z / 2.0f);
        } else if (i2 != 5) {
            this.f111o = rect.left;
        } else {
            this.f111o = rect.right - this.f92Z;
        }
        c(0.0f, z2);
        float height = this.f91Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f91Y;
        if (staticLayout2 == null || this.f100d0 <= 1) {
            CharSequence charSequence3 = this.f69B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f91Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f103f, this.f70C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f97c;
        if (i3 == 48) {
            this.f108l = rect2.top;
        } else if (i3 != 80) {
            this.f108l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f108l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f110n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f110n = rect2.left;
        } else {
            this.f110n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f72E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f72E = null;
        }
        l(this.f95b);
        float f2 = this.f95b;
        float f3 = f(rect2.left, rect.left, f2, this.f82P);
        RectF rectF = this.f101e;
        rectF.left = f3;
        rectF.top = f(this.f108l, this.f109m, f2, this.f82P);
        rectF.right = f(rect2.right, rect.right, f2, this.f82P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f82P);
        this.f112p = f(this.f110n, this.f111o, f2, this.f82P);
        this.f113q = f(this.f108l, this.f109m, f2, this.f82P);
        l(f2);
        Y.a aVar = AbstractC0305a.f3713b;
        this.f94a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
        WeakHashMap weakHashMap = X.f418a;
        textInputLayout.postInvalidateOnAnimation();
        this.f96b0 = f(1.0f, 0.0f, f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f107k;
        ColorStateList colorStateList2 = this.f106j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f107k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f88V;
        float f5 = this.f89W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, aVar));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f74H = AbstractC0305a.a(0.0f, this.f84R, f2);
        this.f75I = AbstractC0305a.a(0.0f, this.f85S, f2);
        this.f76J = AbstractC0305a.a(0.0f, this.f86T, f2);
        int a2 = a(0, e(this.f87U), f2);
        this.f77K = a2;
        textPaint.setShadowLayer(this.f74H, this.f75I, this.f76J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f107k == colorStateList && this.f106j == colorStateList) {
            return;
        }
        this.f107k = colorStateList;
        this.f106j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        E0.a aVar = this.f121y;
        if (aVar != null) {
            aVar.i = true;
        }
        if (this.f116t == typeface) {
            return false;
        }
        this.f116t = typeface;
        Typeface O2 = q1.d.O(this.f93a.getContext().getResources().getConfiguration(), typeface);
        this.f115s = O2;
        if (O2 == null) {
            O2 = this.f116t;
        }
        this.f114r = O2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f95b) {
            this.f95b = f2;
            float f3 = this.f97c.left;
            Rect rect = this.f99d;
            float f4 = f(f3, rect.left, f2, this.f82P);
            RectF rectF = this.f101e;
            rectF.left = f4;
            rectF.top = f(this.f108l, this.f109m, f2, this.f82P);
            rectF.right = f(r1.right, rect.right, f2, this.f82P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f82P);
            this.f112p = f(this.f110n, this.f111o, f2, this.f82P);
            this.f113q = f(this.f108l, this.f109m, f2, this.f82P);
            l(f2);
            Y.a aVar = AbstractC0305a.f3713b;
            this.f94a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
            WeakHashMap weakHashMap = X.f418a;
            TextInputLayout textInputLayout = this.f93a;
            textInputLayout.postInvalidateOnAnimation();
            this.f96b0 = f(1.0f, 0.0f, f2, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f107k;
            ColorStateList colorStateList2 = this.f106j;
            TextPaint textPaint = this.f80N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f107k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f88V;
            float f6 = this.f89W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, aVar));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f74H = AbstractC0305a.a(0.0f, this.f84R, f2);
            this.f75I = AbstractC0305a.a(0.0f, this.f85S, f2);
            this.f76J = AbstractC0305a.a(0.0f, this.f86T, f2);
            int a2 = a(0, e(this.f87U), f2);
            this.f77K = a2;
            textPaint.setShadowLayer(this.f74H, this.f75I, this.f76J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = X.f418a;
        this.f93a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f119w != typeface) {
            this.f119w = typeface;
            Typeface O2 = q1.d.O(this.f93a.getContext().getResources().getConfiguration(), typeface);
            this.f118v = O2;
            if (O2 == null) {
                O2 = this.f119w;
            }
            this.f117u = O2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
