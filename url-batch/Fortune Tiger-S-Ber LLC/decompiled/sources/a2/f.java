package a2;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class f {
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
    public final TextInputLayout f7a;
    public float a0;

    /* renamed from: b, reason: collision with root package name */
    public float f8b;

    /* renamed from: b0, reason: collision with root package name */
    public float f9b0;
    public final Rect c;

    /* renamed from: c0, reason: collision with root package name */
    public float f10c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f11d;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f12d0;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f13e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f20j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f22k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f23k0;

    /* renamed from: l, reason: collision with root package name */
    public int f24l;

    /* renamed from: m, reason: collision with root package name */
    public float f25m;

    /* renamed from: n, reason: collision with root package name */
    public float f26n;

    /* renamed from: o, reason: collision with root package name */
    public float f27o;

    /* renamed from: p, reason: collision with root package name */
    public float f28p;

    /* renamed from: q, reason: collision with root package name */
    public float f29q;

    /* renamed from: r, reason: collision with root package name */
    public float f30r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f31s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f32t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f33u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f34v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f35w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f36x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f37y;

    /* renamed from: z, reason: collision with root package name */
    public d2.a f38z;

    /* renamed from: f, reason: collision with root package name */
    public int f15f = 16;
    public int g = 16;
    public float h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f18i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* renamed from: e0, reason: collision with root package name */
    public int f14e0 = 1;
    public int f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public final float f16g0 = 1.0f;

    /* renamed from: h0, reason: collision with root package name */
    public final int f17h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public int f19i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public int f21j0 = -1;

    public f(TextInputLayout textInputLayout) {
        this.f7a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f11d = new Rect();
        this.c = new Rect();
        this.f13e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i4, int i5, float f4) {
        float f5 = 1.0f - f4;
        return Color.argb(Math.round((Color.alpha(i5) * f4) + (Color.alpha(i4) * f5)), Math.round((Color.red(i5) * f4) + (Color.red(i4) * f5)), Math.round((Color.green(i5) * f4) + (Color.green(i4) * f5)), Math.round((Color.blue(i5) * f4) + (Color.blue(i4) * f5)));
    }

    public static float h(float f4, float f5, float f6, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f6 = timeInterpolator.getInterpolation(f6);
        }
        return m1.a.a(f4, f5, f6);
    }

    public final void b() {
        float f4 = this.f8b;
        float f5 = this.c.left;
        Rect rect = this.f11d;
        float h = h(f5, rect.left, f4, this.Q);
        RectF rectF = this.f13e;
        rectF.left = h;
        rectF.top = h(this.f25m, this.f26n, f4, this.Q);
        rectF.right = h(r1.right, rect.right, f4, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f4, this.Q);
        this.f29q = h(this.f27o, this.f28p, f4, this.Q);
        this.f30r = h(this.f25m, this.f26n, f4, this.Q);
        d(f4, false);
        TextInputLayout textInputLayout = this.f7a;
        textInputLayout.postInvalidateOnAnimation();
        float f6 = this.W;
        float f7 = this.X;
        TextPaint textPaint = this.O;
        if (f6 != f7) {
            textPaint.setLetterSpacing(h(f7, f6, f4, m1.a.f2906b));
        } else {
            textPaint.setLetterSpacing(f6);
        }
        w0.a aVar = m1.a.f2906b;
        this.f9b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f4, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f10c0 = h(1.0f, 0.0f, f4, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f22k;
        ColorStateList colorStateList2 = this.f20j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(g(colorStateList2), g(this.f22k), f4));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        this.H = m1.a.a(0.0f, this.S, f4);
        this.I = m1.a.a(0.0f, this.T, f4);
        this.J = m1.a.a(0.0f, this.U, f4);
        int a4 = a(0, g(this.V), f4);
        this.K = a4;
        textPaint.setShadowLayer(this.H, this.I, this.J, a4);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z3 = this.f7a.getLayoutDirection() == 1;
        if (this.E) {
            return (z3 ? i0.g.f2096d : i0.g.c).b(charSequence, charSequence.length());
        }
        return z3;
    }

    public final void d(float f4, boolean z3) {
        float f5;
        Typeface typeface;
        float f6;
        if (this.B == null) {
            return;
        }
        float width = this.f11d.width();
        float width2 = this.c.width();
        if (Math.abs(f4 - 1.0f) < 1.0E-5f) {
            f5 = o() ? this.f18i : this.h;
            f6 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.h, this.f18i, f4, this.R) / this.h;
            if (!o()) {
                width = width2;
            }
            typeface = this.f31s;
            width2 = width;
        } else {
            f5 = this.h;
            float f7 = this.X;
            typeface = this.f34v;
            if (Math.abs(f4 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.h, this.f18i, f4, this.R) / this.h;
            }
            float f8 = this.f18i / this.h;
            float f9 = width2 * f8;
            if (!z3 && f9 > width && o()) {
                width2 = Math.min(width / f8, width2);
            }
            f6 = f7;
        }
        int i4 = f4 < 0.5f ? this.f14e0 : this.f0;
        TextPaint textPaint = this.O;
        if (width2 > 0.0f) {
            boolean z4 = this.G != f5;
            boolean z5 = this.Y != f6;
            boolean z6 = this.f37y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z7 = z4 || z5 || (staticLayout != null && (width2 > ((float) staticLayout.getWidth()) ? 1 : (width2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || (this.L != i4) || this.N;
            this.G = f5;
            this.Y = f6;
            this.f37y = typeface;
            this.N = false;
            this.L = i4;
            textPaint.setLinearText(this.F != 1.0f);
            r7 = z7;
        }
        if (this.C == null || r7) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f37y);
            textPaint.setLetterSpacing(this.Y);
            boolean c = c(this.B);
            this.D = c;
            StaticLayout e4 = e(((this.f14e0 > 1 || this.f0 > 1) && !c) ? i4 : 1, textPaint, this.B, width2 * (o() ? 1.0f : this.F), this.D);
            this.Z = e4;
            this.C = e4.getText();
        }
    }

    public final StaticLayout e(int i4, TextPaint textPaint, CharSequence charSequence, float f4, boolean z3) {
        Layout.Alignment alignment;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f15f, this.D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        k kVar = new k(charSequence, textPaint, (int) f4);
        kVar.f55l = this.A;
        kVar.f54k = z3;
        kVar.f50e = alignment;
        kVar.f53j = false;
        kVar.f51f = i4;
        float f5 = this.f16g0;
        kVar.g = 0.0f;
        kVar.h = f5;
        kVar.f52i = this.f17h0;
        kVar.f56m = null;
        StaticLayout a4 = kVar.a();
        a4.getClass();
        return a4;
    }

    public final float f() {
        int i4 = this.f19i0;
        if (i4 != -1) {
            return i4;
        }
        float f4 = this.f18i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f4);
        textPaint.setTypeface(this.f31s);
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
            Typeface typeface = this.f33u;
            if (typeface != null) {
                this.f32t = k3.m.G(configuration, typeface);
            }
            Typeface typeface2 = this.f36x;
            if (typeface2 != null) {
                this.f35w = k3.m.G(configuration, typeface2);
            }
            Typeface typeface3 = this.f32t;
            if (typeface3 == null) {
                typeface3 = this.f33u;
            }
            this.f31s = typeface3;
            Typeface typeface4 = this.f35w;
            if (typeface4 == null) {
                typeface4 = this.f36x;
            }
            this.f34v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z3) {
        float measureText;
        TextInputLayout textInputLayout = this.f7a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z3) {
            return;
        }
        d(1.0f, z3);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.f12d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.f12d0;
        if (charSequence2 != null) {
            this.a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.g, this.D ? 1 : 0);
        int i4 = absoluteGravity & 112;
        Rect rect = this.f11d;
        if (i4 == 48) {
            this.f26n = rect.top;
        } else if (i4 != 80) {
            this.f26n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f26n = textPaint.ascent() + rect.bottom;
        }
        int i5 = absoluteGravity & 8388615;
        if (i5 == 1) {
            this.f28p = rect.centerX() - (this.a0 / 2.0f);
        } else if (i5 != 5) {
            this.f28p = rect.left;
        } else {
            this.f28p = rect.right - this.a0;
        }
        if (this.a0 <= rect.width()) {
            float f4 = this.f28p;
            float max = Math.max(0.0f, rect.left - f4) + f4;
            this.f28p = max;
            this.f28p = Math.min(0.0f, rect.right - (this.a0 + max)) + max;
        }
        float f5 = this.f18i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f5);
        textPaint2.setTypeface(this.f31s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f6 = this.f26n;
            float max2 = Math.max(0.0f, rect.top - f6) + f6;
            this.f26n = max2;
            this.f26n = Math.min(0.0f, rect.bottom - (f() + max2)) + max2;
        }
        d(0.0f, z3);
        float height = this.Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.Z;
        if (staticLayout == null || this.f14e0 <= 1) {
            CharSequence charSequence3 = this.C;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.Z;
        this.f24l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f15f, this.D ? 1 : 0);
        int i6 = absoluteGravity2 & 112;
        Rect rect2 = this.c;
        if (i6 == 48) {
            this.f25m = rect2.top;
        } else if (i6 != 80) {
            this.f25m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f25m = (rect2.bottom - height) + (this.f23k0 ? textPaint.descent() : 0.0f);
        }
        int i7 = absoluteGravity2 & 8388615;
        if (i7 == 1) {
            this.f27o = rect2.centerX() - (measureText / 2.0f);
        } else if (i7 != 5) {
            this.f27o = rect2.left;
        } else {
            this.f27o = rect2.right - measureText;
        }
        d(this.f8b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f22k == colorStateList && this.f20j == colorStateList) {
            return;
        }
        this.f22k = colorStateList;
        this.f20j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        d2.a aVar = this.f38z;
        if (aVar != null) {
            aVar.h = true;
        }
        if (this.f33u == typeface) {
            return false;
        }
        this.f33u = typeface;
        Typeface G = k3.m.G(this.f7a.getContext().getResources().getConfiguration(), typeface);
        this.f32t = G;
        if (G == null) {
            G = this.f33u;
        }
        this.f31s = G;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000b, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(float f4) {
        float f5 = f4 >= 0.0f ? 1.0f : 0.0f;
        f4 = f5;
        if (f4 != this.f8b) {
            this.f8b = f4;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z3;
        boolean l4 = l(typeface);
        if (this.f36x != typeface) {
            this.f36x = typeface;
            Typeface G = k3.m.G(this.f7a.getContext().getResources().getConfiguration(), typeface);
            this.f35w = G;
            if (G == null) {
                G = this.f36x;
            }
            this.f34v = G;
            z3 = true;
        } else {
            z3 = false;
        }
        if (l4 || z3) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f0 == 1;
    }
}
