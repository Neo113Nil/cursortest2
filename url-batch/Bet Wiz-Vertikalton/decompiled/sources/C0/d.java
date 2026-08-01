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
import p0.AbstractC0280a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f82A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f83B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f84C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f86E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f87G;

    /* renamed from: H, reason: collision with root package name */
    public float f88H;

    /* renamed from: I, reason: collision with root package name */
    public float f89I;

    /* renamed from: J, reason: collision with root package name */
    public float f90J;

    /* renamed from: K, reason: collision with root package name */
    public int f91K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f92L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f93M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f94N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f95O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f96P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f97Q;

    /* renamed from: R, reason: collision with root package name */
    public float f98R;

    /* renamed from: S, reason: collision with root package name */
    public float f99S;

    /* renamed from: T, reason: collision with root package name */
    public float f100T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f101U;

    /* renamed from: V, reason: collision with root package name */
    public float f102V;

    /* renamed from: W, reason: collision with root package name */
    public float f103W;

    /* renamed from: X, reason: collision with root package name */
    public float f104X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f105Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f106Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f107a;

    /* renamed from: a0, reason: collision with root package name */
    public float f108a0;

    /* renamed from: b, reason: collision with root package name */
    public float f109b;

    /* renamed from: b0, reason: collision with root package name */
    public float f110b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f111c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f112c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f114e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f119j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f120k;

    /* renamed from: l, reason: collision with root package name */
    public float f121l;

    /* renamed from: m, reason: collision with root package name */
    public float f122m;

    /* renamed from: n, reason: collision with root package name */
    public float f123n;

    /* renamed from: o, reason: collision with root package name */
    public float f124o;

    /* renamed from: p, reason: collision with root package name */
    public float f125p;

    /* renamed from: q, reason: collision with root package name */
    public float f126q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f127r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f128s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f129t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f130u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f131v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f132w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f133x;

    /* renamed from: y, reason: collision with root package name */
    public F0.a f134y;

    /* renamed from: f, reason: collision with root package name */
    public int f116f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f118g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f135z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f85D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f113d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f115e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f117f0 = 1;

    public d(TextInputLayout textInputLayout) {
        this.f107a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f94N = textPaint;
        this.f95O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f111c = new Rect();
        this.f114e = new RectF();
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
        return AbstractC0280a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f422a;
        boolean z2 = this.f107a.getLayoutDirection() == 1;
        if (this.f85D) {
            return (z2 ? I.h.d : I.h.f308c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f82A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f111c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f102V;
            this.F = 1.0f;
            typeface = this.f127r;
        } else {
            float f5 = this.h;
            float f6 = this.f103W;
            Typeface typeface2 = this.f130u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f97Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f94N;
        if (width > 0.0f) {
            boolean z4 = this.f87G != f3;
            boolean z5 = this.f104X != f4;
            boolean z6 = this.f133x != typeface;
            StaticLayout staticLayout = this.f105Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f93M;
            this.f87G = f3;
            this.f104X = f4;
            this.f133x = typeface;
            this.f93M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f83B == null || z3) {
            textPaint.setTextSize(this.f87G);
            textPaint.setTypeface(this.f133x);
            textPaint.setLetterSpacing(this.f104X);
            boolean b2 = b(this.f82A);
            this.f84C = b2;
            int i = this.f113d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f116f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f84C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f84C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f82A, textPaint, (int) width);
            iVar.f151k = this.f135z;
            iVar.f150j = b2;
            iVar.f147e = alignment;
            iVar.i = false;
            iVar.f148f = i;
            iVar.f149g = this.f115e0;
            iVar.h = this.f117f0;
            StaticLayout a2 = iVar.a();
            a2.getClass();
            this.f105Y = a2;
            this.f83B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f95O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f127r);
        textPaint.setLetterSpacing(this.f102V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f92L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f129t;
            if (typeface != null) {
                this.f128s = x1.l.U(configuration, typeface);
            }
            Typeface typeface2 = this.f132w;
            if (typeface2 != null) {
                this.f131v = x1.l.U(configuration, typeface2);
            }
            Typeface typeface3 = this.f128s;
            if (typeface3 == null) {
                typeface3 = this.f129t;
            }
            this.f127r = typeface3;
            Typeface typeface4 = this.f131v;
            if (typeface4 == null) {
                typeface4 = this.f132w;
            }
            this.f130u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f107a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f83B;
        TextPaint textPaint = this.f94N;
        if (charSequence != null && (staticLayout = this.f105Y) != null) {
            this.f112c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f135z);
        }
        CharSequence charSequence2 = this.f112c0;
        if (charSequence2 != null) {
            this.f106Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f106Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f118g, this.f84C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f122m = rect.top;
        } else if (i != 80) {
            this.f122m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f122m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f124o = rect.centerX() - (this.f106Z / 2.0f);
        } else if (i2 != 5) {
            this.f124o = rect.left;
        } else {
            this.f124o = rect.right - this.f106Z;
        }
        c(0.0f, z2);
        float height = this.f105Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f105Y;
        if (staticLayout2 == null || this.f113d0 <= 1) {
            CharSequence charSequence3 = this.f83B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f105Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f116f, this.f84C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f111c;
        if (i3 == 48) {
            this.f121l = rect2.top;
        } else if (i3 != 80) {
            this.f121l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f121l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f123n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f123n = rect2.left;
        } else {
            this.f123n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f86E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f86E = null;
        }
        l(this.f109b);
        float f2 = this.f109b;
        float f3 = f(rect2.left, rect.left, f2, this.f96P);
        RectF rectF = this.f114e;
        rectF.left = f3;
        rectF.top = f(this.f121l, this.f122m, f2, this.f96P);
        rectF.right = f(rect2.right, rect.right, f2, this.f96P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f96P);
        this.f125p = f(this.f123n, this.f124o, f2, this.f96P);
        this.f126q = f(this.f121l, this.f122m, f2, this.f96P);
        l(f2);
        Z.a aVar = AbstractC0280a.f3287b;
        this.f108a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
        WeakHashMap weakHashMap = S.f422a;
        textInputLayout.postInvalidateOnAnimation();
        this.f110b0 = f(1.0f, 0.0f, f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f120k;
        ColorStateList colorStateList2 = this.f119j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f120k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f102V;
        float f5 = this.f103W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, aVar));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f88H = AbstractC0280a.a(0.0f, this.f98R, f2);
        this.f89I = AbstractC0280a.a(0.0f, this.f99S, f2);
        this.f90J = AbstractC0280a.a(0.0f, this.f100T, f2);
        int a2 = a(0, e(this.f101U), f2);
        this.f91K = a2;
        textPaint.setShadowLayer(this.f88H, this.f89I, this.f90J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f120k == colorStateList && this.f119j == colorStateList) {
            return;
        }
        this.f120k = colorStateList;
        this.f119j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        F0.a aVar = this.f134y;
        if (aVar != null) {
            aVar.f225g = true;
        }
        if (this.f129t == typeface) {
            return false;
        }
        this.f129t = typeface;
        Typeface U2 = x1.l.U(this.f107a.getContext().getResources().getConfiguration(), typeface);
        this.f128s = U2;
        if (U2 == null) {
            U2 = this.f129t;
        }
        this.f127r = U2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f109b) {
            this.f109b = f2;
            float f3 = this.f111c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f96P);
            RectF rectF = this.f114e;
            rectF.left = f4;
            rectF.top = f(this.f121l, this.f122m, f2, this.f96P);
            rectF.right = f(r1.right, rect.right, f2, this.f96P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f96P);
            this.f125p = f(this.f123n, this.f124o, f2, this.f96P);
            this.f126q = f(this.f121l, this.f122m, f2, this.f96P);
            l(f2);
            Z.a aVar = AbstractC0280a.f3287b;
            this.f108a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
            WeakHashMap weakHashMap = S.f422a;
            TextInputLayout textInputLayout = this.f107a;
            textInputLayout.postInvalidateOnAnimation();
            this.f110b0 = f(1.0f, 0.0f, f2, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f120k;
            ColorStateList colorStateList2 = this.f119j;
            TextPaint textPaint = this.f94N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f120k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f102V;
            float f6 = this.f103W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, aVar));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f88H = AbstractC0280a.a(0.0f, this.f98R, f2);
            this.f89I = AbstractC0280a.a(0.0f, this.f99S, f2);
            this.f90J = AbstractC0280a.a(0.0f, this.f100T, f2);
            int a2 = a(0, e(this.f101U), f2);
            this.f91K = a2;
            textPaint.setShadowLayer(this.f88H, this.f89I, this.f90J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = S.f422a;
        this.f107a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f132w != typeface) {
            this.f132w = typeface;
            Typeface U2 = x1.l.U(this.f107a.getContext().getResources().getConfiguration(), typeface);
            this.f131v = U2;
            if (U2 == null) {
                U2 = this.f132w;
            }
            this.f130u = U2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
