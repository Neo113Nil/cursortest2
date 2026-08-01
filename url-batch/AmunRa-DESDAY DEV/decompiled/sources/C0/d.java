package C0;

import K.S;
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
import p0.AbstractC0278a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f79A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f80B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f81C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f83E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f84G;

    /* renamed from: H, reason: collision with root package name */
    public float f85H;

    /* renamed from: I, reason: collision with root package name */
    public float f86I;

    /* renamed from: J, reason: collision with root package name */
    public float f87J;

    /* renamed from: K, reason: collision with root package name */
    public int f88K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f89L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f90M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f91N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f92O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f93P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f94Q;

    /* renamed from: R, reason: collision with root package name */
    public float f95R;

    /* renamed from: S, reason: collision with root package name */
    public float f96S;

    /* renamed from: T, reason: collision with root package name */
    public float f97T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f98U;

    /* renamed from: V, reason: collision with root package name */
    public float f99V;

    /* renamed from: W, reason: collision with root package name */
    public float f100W;

    /* renamed from: X, reason: collision with root package name */
    public float f101X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f102Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f103Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f104a;

    /* renamed from: a0, reason: collision with root package name */
    public float f105a0;

    /* renamed from: b, reason: collision with root package name */
    public float f106b;

    /* renamed from: b0, reason: collision with root package name */
    public float f107b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f108c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f109c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f111e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f116j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f117k;

    /* renamed from: l, reason: collision with root package name */
    public float f118l;

    /* renamed from: m, reason: collision with root package name */
    public float f119m;

    /* renamed from: n, reason: collision with root package name */
    public float f120n;

    /* renamed from: o, reason: collision with root package name */
    public float f121o;

    /* renamed from: p, reason: collision with root package name */
    public float f122p;

    /* renamed from: q, reason: collision with root package name */
    public float f123q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f124r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f125s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f126t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f127u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f128v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f129w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f130x;

    /* renamed from: y, reason: collision with root package name */
    public F0.a f131y;

    /* renamed from: f, reason: collision with root package name */
    public int f113f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f115g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f132z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f82D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f110d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f112e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f114f0 = 1;

    public d(TextInputLayout textInputLayout) {
        this.f104a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f91N = textPaint;
        this.f92O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f108c = new Rect();
        this.f111e = new RectF();
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
        return AbstractC0278a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f362a;
        boolean z2 = this.f104a.getLayoutDirection() == 1;
        if (this.f82D) {
            return (z2 ? I.h.d : I.h.f248c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f79A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f108c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f99V;
            this.F = 1.0f;
            typeface = this.f124r;
        } else {
            float f5 = this.h;
            float f6 = this.f100W;
            Typeface typeface2 = this.f127u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f94Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f91N;
        if (width > 0.0f) {
            boolean z4 = this.f84G != f3;
            boolean z5 = this.f101X != f4;
            boolean z6 = this.f130x != typeface;
            StaticLayout staticLayout = this.f102Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f90M;
            this.f84G = f3;
            this.f101X = f4;
            this.f130x = typeface;
            this.f90M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f80B == null || z3) {
            textPaint.setTextSize(this.f84G);
            textPaint.setTypeface(this.f130x);
            textPaint.setLetterSpacing(this.f101X);
            boolean b2 = b(this.f79A);
            this.f81C = b2;
            int i = this.f110d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f113f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f81C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f81C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f79A, textPaint, (int) width);
            iVar.f148k = this.f132z;
            iVar.f147j = b2;
            iVar.f144e = alignment;
            iVar.i = false;
            iVar.f145f = i;
            iVar.f146g = this.f112e0;
            iVar.h = this.f114f0;
            StaticLayout a2 = iVar.a();
            a2.getClass();
            this.f102Y = a2;
            this.f80B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f92O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f124r);
        textPaint.setLetterSpacing(this.f99V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f89L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f126t;
            if (typeface != null) {
                this.f125s = s1.d.S(configuration, typeface);
            }
            Typeface typeface2 = this.f129w;
            if (typeface2 != null) {
                this.f128v = s1.d.S(configuration, typeface2);
            }
            Typeface typeface3 = this.f125s;
            if (typeface3 == null) {
                typeface3 = this.f126t;
            }
            this.f124r = typeface3;
            Typeface typeface4 = this.f128v;
            if (typeface4 == null) {
                typeface4 = this.f129w;
            }
            this.f127u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f104a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f80B;
        TextPaint textPaint = this.f91N;
        if (charSequence != null && (staticLayout = this.f102Y) != null) {
            this.f109c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f132z);
        }
        CharSequence charSequence2 = this.f109c0;
        if (charSequence2 != null) {
            this.f103Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f103Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f115g, this.f81C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f119m = rect.top;
        } else if (i != 80) {
            this.f119m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f119m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f121o = rect.centerX() - (this.f103Z / 2.0f);
        } else if (i2 != 5) {
            this.f121o = rect.left;
        } else {
            this.f121o = rect.right - this.f103Z;
        }
        c(0.0f, z2);
        float height = this.f102Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f102Y;
        if (staticLayout2 == null || this.f110d0 <= 1) {
            CharSequence charSequence3 = this.f80B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f102Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f113f, this.f81C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f108c;
        if (i3 == 48) {
            this.f118l = rect2.top;
        } else if (i3 != 80) {
            this.f118l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f118l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f120n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f120n = rect2.left;
        } else {
            this.f120n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f83E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f83E = null;
        }
        l(this.f106b);
        float f2 = this.f106b;
        float f3 = f(rect2.left, rect.left, f2, this.f93P);
        RectF rectF = this.f111e;
        rectF.left = f3;
        rectF.top = f(this.f118l, this.f119m, f2, this.f93P);
        rectF.right = f(rect2.right, rect.right, f2, this.f93P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f93P);
        this.f122p = f(this.f120n, this.f121o, f2, this.f93P);
        this.f123q = f(this.f118l, this.f119m, f2, this.f93P);
        l(f2);
        Z.a aVar = AbstractC0278a.f3456b;
        this.f105a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
        WeakHashMap weakHashMap = S.f362a;
        textInputLayout.postInvalidateOnAnimation();
        this.f107b0 = f(1.0f, 0.0f, f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f117k;
        ColorStateList colorStateList2 = this.f116j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f117k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f99V;
        float f5 = this.f100W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, aVar));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f85H = AbstractC0278a.a(0.0f, this.f95R, f2);
        this.f86I = AbstractC0278a.a(0.0f, this.f96S, f2);
        this.f87J = AbstractC0278a.a(0.0f, this.f97T, f2);
        int a2 = a(0, e(this.f98U), f2);
        this.f88K = a2;
        textPaint.setShadowLayer(this.f85H, this.f86I, this.f87J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f117k == colorStateList && this.f116j == colorStateList) {
            return;
        }
        this.f117k = colorStateList;
        this.f116j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        F0.a aVar = this.f131y;
        if (aVar != null) {
            aVar.f166j = true;
        }
        if (this.f126t == typeface) {
            return false;
        }
        this.f126t = typeface;
        Typeface S2 = s1.d.S(this.f104a.getContext().getResources().getConfiguration(), typeface);
        this.f125s = S2;
        if (S2 == null) {
            S2 = this.f126t;
        }
        this.f124r = S2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f106b) {
            this.f106b = f2;
            float f3 = this.f108c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f93P);
            RectF rectF = this.f111e;
            rectF.left = f4;
            rectF.top = f(this.f118l, this.f119m, f2, this.f93P);
            rectF.right = f(r1.right, rect.right, f2, this.f93P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f93P);
            this.f122p = f(this.f120n, this.f121o, f2, this.f93P);
            this.f123q = f(this.f118l, this.f119m, f2, this.f93P);
            l(f2);
            Z.a aVar = AbstractC0278a.f3456b;
            this.f105a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
            WeakHashMap weakHashMap = S.f362a;
            TextInputLayout textInputLayout = this.f104a;
            textInputLayout.postInvalidateOnAnimation();
            this.f107b0 = f(1.0f, 0.0f, f2, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f117k;
            ColorStateList colorStateList2 = this.f116j;
            TextPaint textPaint = this.f91N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f117k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f99V;
            float f6 = this.f100W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, aVar));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f85H = AbstractC0278a.a(0.0f, this.f95R, f2);
            this.f86I = AbstractC0278a.a(0.0f, this.f96S, f2);
            this.f87J = AbstractC0278a.a(0.0f, this.f97T, f2);
            int a2 = a(0, e(this.f98U), f2);
            this.f88K = a2;
            textPaint.setShadowLayer(this.f85H, this.f86I, this.f87J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = S.f362a;
        this.f104a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f129w != typeface) {
            this.f129w = typeface;
            Typeface S2 = s1.d.S(this.f104a.getContext().getResources().getConfiguration(), typeface);
            this.f128v = S2;
            if (S2 == null) {
                S2 = this.f129w;
            }
            this.f127u = S2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
