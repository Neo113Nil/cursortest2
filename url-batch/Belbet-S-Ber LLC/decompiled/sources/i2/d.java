package i2;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
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
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f2005a;

    /* renamed from: a0, reason: collision with root package name */
    public float f2006a0;

    /* renamed from: b, reason: collision with root package name */
    public float f2007b;

    /* renamed from: b0, reason: collision with root package name */
    public float f2008b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f2009c;

    /* renamed from: c0, reason: collision with root package name */
    public float f2010c0;
    public final Rect d;
    public CharSequence d0;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f2011e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f2018j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f2020k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f2021k0;

    /* renamed from: l, reason: collision with root package name */
    public int f2022l;

    /* renamed from: m, reason: collision with root package name */
    public float f2023m;

    /* renamed from: n, reason: collision with root package name */
    public float f2024n;

    /* renamed from: o, reason: collision with root package name */
    public float f2025o;

    /* renamed from: p, reason: collision with root package name */
    public float f2026p;

    /* renamed from: q, reason: collision with root package name */
    public float f2027q;

    /* renamed from: r, reason: collision with root package name */
    public float f2028r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f2029s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f2030t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f2031u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f2032v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f2033w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f2034x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f2035y;

    /* renamed from: z, reason: collision with root package name */
    public l2.a f2036z;

    /* renamed from: f, reason: collision with root package name */
    public int f2013f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f2015g = 16;
    public float h = 15.0f;
    public float i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* renamed from: e0, reason: collision with root package name */
    public int f2012e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public int f2014f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public final float f2016g0 = 1.0f;

    /* renamed from: h0, reason: collision with root package name */
    public final int f2017h0 = 1;
    public int i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public int f2019j0 = -1;

    public d(TextInputLayout textInputLayout) {
        this.f2005a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.d = new Rect();
        this.f2009c = new Rect();
        this.f2011e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i4, float f5) {
        float f6 = 1.0f - f5;
        return Color.argb(Math.round((Color.alpha(i4) * f5) + (Color.alpha(i) * f6)), Math.round((Color.red(i4) * f5) + (Color.red(i) * f6)), Math.round((Color.green(i4) * f5) + (Color.green(i) * f6)), Math.round((Color.blue(i4) * f5) + (Color.blue(i) * f6)));
    }

    public static float h(float f5, float f6, float f7, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f7 = timeInterpolator.getInterpolation(f7);
        }
        return r1.a.a(f5, f6, f7);
    }

    public final void b() {
        float f5 = this.f2007b;
        float f6 = this.f2009c.left;
        Rect rect = this.d;
        float h = h(f6, rect.left, f5, this.Q);
        RectF rectF = this.f2011e;
        rectF.left = h;
        rectF.top = h(this.f2023m, this.f2024n, f5, this.Q);
        rectF.right = h(r1.right, rect.right, f5, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f5, this.Q);
        this.f2027q = h(this.f2025o, this.f2026p, f5, this.Q);
        this.f2028r = h(this.f2023m, this.f2024n, f5, this.Q);
        d(f5, false);
        TextInputLayout textInputLayout = this.f2005a;
        textInputLayout.postInvalidateOnAnimation();
        float f7 = this.W;
        float f8 = this.X;
        TextPaint textPaint = this.O;
        if (f7 != f8) {
            textPaint.setLetterSpacing(h(f8, f7, f5, r1.a.f3206b));
        } else {
            textPaint.setLetterSpacing(f7);
        }
        a1.a aVar = r1.a.f3206b;
        this.f2008b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f5, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f2010c0 = h(1.0f, 0.0f, f5, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f2020k;
        ColorStateList colorStateList2 = this.f2018j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(g(colorStateList2), g(this.f2020k), f5));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        this.H = r1.a.a(0.0f, this.S, f5);
        this.I = r1.a.a(0.0f, this.T, f5);
        this.J = r1.a.a(0.0f, this.U, f5);
        int a5 = a(0, g(this.V), f5);
        this.K = a5;
        textPaint.setShadowLayer(this.H, this.I, this.J, a5);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z4 = this.f2005a.getLayoutDirection() == 1;
        if (this.E) {
            return (z4 ? l0.g.d : l0.g.f2635c).b(charSequence, charSequence.length());
        }
        return z4;
    }

    public final void d(float f5, boolean z4) {
        float f6;
        Typeface typeface;
        float f7;
        if (this.B == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f2009c.width();
        if (Math.abs(f5 - 1.0f) < 1.0E-5f) {
            f6 = o() ? this.i : this.h;
            f7 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.h, this.i, f5, this.R) / this.h;
            if (!o()) {
                width = width2;
            }
            typeface = this.f2029s;
            width2 = width;
        } else {
            f6 = this.h;
            float f8 = this.X;
            typeface = this.f2032v;
            if (Math.abs(f5 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.h, this.i, f5, this.R) / this.h;
            }
            float f9 = this.i / this.h;
            float f10 = width2 * f9;
            if (!z4 && f10 > width && o()) {
                width2 = Math.min(width / f9, width2);
            }
            f7 = f8;
        }
        int i = f5 < 0.5f ? this.f2012e0 : this.f2014f0;
        TextPaint textPaint = this.O;
        if (width2 > 0.0f) {
            boolean z5 = this.G != f6;
            boolean z6 = this.Y != f7;
            boolean z7 = this.f2035y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z8 = z5 || z6 || (staticLayout != null && (width2 > ((float) staticLayout.getWidth()) ? 1 : (width2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z7 || (this.L != i) || this.N;
            this.G = f6;
            this.Y = f7;
            this.f2035y = typeface;
            this.N = false;
            this.L = i;
            textPaint.setLinearText(this.F != 1.0f);
            r7 = z8;
        }
        if (this.C == null || r7) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f2035y);
            textPaint.setLetterSpacing(this.Y);
            boolean c5 = c(this.B);
            this.D = c5;
            StaticLayout e4 = e(((this.f2012e0 > 1 || this.f2014f0 > 1) && !c5) ? i : 1, textPaint, this.B, width2 * (o() ? 1.0f : this.F), this.D);
            this.Z = e4;
            this.C = e4.getText();
        }
    }

    public final StaticLayout e(int i, TextPaint textPaint, CharSequence charSequence, float f5, boolean z4) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f2013f, this.D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        k kVar = new k(charSequence, textPaint, (int) f5);
        kVar.f2055l = this.A;
        kVar.f2054k = z4;
        kVar.f2050e = alignment;
        kVar.f2053j = false;
        kVar.f2051f = i;
        float f6 = this.f2016g0;
        kVar.f2052g = 0.0f;
        kVar.h = f6;
        kVar.i = this.f2017h0;
        kVar.f2056m = null;
        StaticLayout a5 = kVar.a();
        a5.getClass();
        return a5;
    }

    public final float f() {
        int i = this.i0;
        if (i != -1) {
            return i;
        }
        float f5 = this.i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f5);
        textPaint.setTypeface(this.f2029s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f2031u;
            if (typeface != null) {
                this.f2030t = b4.l.Q(configuration, typeface);
            }
            Typeface typeface2 = this.f2034x;
            if (typeface2 != null) {
                this.f2033w = b4.l.Q(configuration, typeface2);
            }
            Typeface typeface3 = this.f2030t;
            if (typeface3 == null) {
                typeface3 = this.f2031u;
            }
            this.f2029s = typeface3;
            Typeface typeface4 = this.f2033w;
            if (typeface4 == null) {
                typeface4 = this.f2034x;
            }
            this.f2032v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z4) {
        float measureText;
        TextInputLayout textInputLayout = this.f2005a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z4) {
            return;
        }
        d(1.0f, z4);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.d0;
        if (charSequence2 != null) {
            this.f2006a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f2006a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f2015g, this.D ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f2024n = rect.top;
        } else if (i != 80) {
            this.f2024n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f2024n = textPaint.ascent() + rect.bottom;
        }
        int i4 = absoluteGravity & 8388615;
        if (i4 == 1) {
            this.f2026p = rect.centerX() - (this.f2006a0 / 2.0f);
        } else if (i4 != 5) {
            this.f2026p = rect.left;
        } else {
            this.f2026p = rect.right - this.f2006a0;
        }
        if (this.f2006a0 <= rect.width()) {
            float f5 = this.f2026p;
            float max = Math.max(0.0f, rect.left - f5) + f5;
            this.f2026p = max;
            this.f2026p = Math.min(0.0f, rect.right - (this.f2006a0 + max)) + max;
        }
        float f6 = this.i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f6);
        textPaint2.setTypeface(this.f2029s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f7 = this.f2024n;
            float max2 = Math.max(0.0f, rect.top - f7) + f7;
            this.f2024n = max2;
            this.f2024n = Math.min(0.0f, rect.bottom - (f() + max2)) + max2;
        }
        d(0.0f, z4);
        float height = this.Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.Z;
        if (staticLayout == null || this.f2012e0 <= 1) {
            CharSequence charSequence3 = this.C;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.Z;
        this.f2022l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f2013f, this.D ? 1 : 0);
        int i5 = absoluteGravity2 & 112;
        Rect rect2 = this.f2009c;
        if (i5 == 48) {
            this.f2023m = rect2.top;
        } else if (i5 != 80) {
            this.f2023m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f2023m = (rect2.bottom - height) + (this.f2021k0 ? textPaint.descent() : 0.0f);
        }
        int i6 = absoluteGravity2 & 8388615;
        if (i6 == 1) {
            this.f2025o = rect2.centerX() - (measureText / 2.0f);
        } else if (i6 != 5) {
            this.f2025o = rect2.left;
        } else {
            this.f2025o = rect2.right - measureText;
        }
        d(this.f2007b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f2020k == colorStateList && this.f2018j == colorStateList) {
            return;
        }
        this.f2020k = colorStateList;
        this.f2018j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        l2.a aVar = this.f2036z;
        if (aVar != null) {
            aVar.f2701q = true;
        }
        if (this.f2031u == typeface) {
            return false;
        }
        this.f2031u = typeface;
        Typeface Q = b4.l.Q(this.f2005a.getContext().getResources().getConfiguration(), typeface);
        this.f2030t = Q;
        if (Q == null) {
            Q = this.f2031u;
        }
        this.f2029s = Q;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000b, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(float f5) {
        float f6 = f5 >= 0.0f ? 1.0f : 0.0f;
        f5 = f6;
        if (f5 != this.f2007b) {
            this.f2007b = f5;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z4;
        boolean l4 = l(typeface);
        if (this.f2034x != typeface) {
            this.f2034x = typeface;
            Typeface Q = b4.l.Q(this.f2005a.getContext().getResources().getConfiguration(), typeface);
            this.f2033w = Q;
            if (Q == null) {
                Q = this.f2034x;
            }
            this.f2032v = Q;
            z4 = true;
        } else {
            z4 = false;
        }
        if (l4 || z4) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f2014f0 == 1;
    }
}
