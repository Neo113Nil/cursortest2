package defpackage;

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
import android.util.Log;
import android.view.Gravity;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fip {
    public boolean A;
    public final TextPaint B;
    public final TextPaint C;
    public TimeInterpolator D;
    public TimeInterpolator E;
    public float F;
    public float G;
    public float H;
    public ColorStateList I;
    public float J;
    public float K;
    public StaticLayout L;
    public float M;
    public float N;
    public float O;
    public CharSequence P;
    public boolean U;
    private float X;
    private float Y;
    private float Z;
    public final View a;
    private float aa;
    private Typeface ab;
    private Typeface ac;
    private Typeface ad;
    private Typeface ae;
    private int ag;
    private float ah;
    public float b;
    public final Rect c;
    public final Rect d;
    public final RectF e;
    public ColorStateList h;
    public ColorStateList i;
    public int j;
    public float k;
    public float l;
    public Typeface m;
    public Typeface n;
    public Typeface o;
    public fmk p;
    public CharSequence q;
    public CharSequence r;
    public boolean s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public int y;
    public int[] z;
    private int V = 16;
    private int W = 16;
    public float f = 15.0f;
    public float g = 15.0f;
    private final TextUtils.TruncateAt af = TextUtils.TruncateAt.END;
    public int Q = 1;
    public int R = 1;
    public int S = -1;
    public int T = -1;

    public fip(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.B = textPaint;
        this.C = new TextPaint(textPaint);
        this.d = new Rect();
        this.c = new Rect();
        this.e = new RectF();
        h(view.getContext().getResources().getConfiguration());
    }

    private final void A(float f) {
        z(f, false);
        this.a.postInvalidateOnAnimation();
    }

    private static boolean B(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    private static final float C(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public static boolean r(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private static float v(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = fes.a;
        return f + (f3 * (f2 - f));
    }

    private static int w(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private final int x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.z;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private final void y() {
        Rect rect = this.c;
        float f = this.b;
        float f2 = rect.left;
        Rect rect2 = this.d;
        float v = v(f2, rect2.left, f, this.D);
        RectF rectF = this.e;
        rectF.left = v;
        rectF.top = v(this.X, this.Y, f, this.D);
        rectF.right = v(rect.right, rect2.right, f, this.D);
        rectF.bottom = v(rect.bottom, rect2.bottom, f, this.D);
        this.k = v(this.Z, this.aa, f, this.D);
        this.l = v(this.X, this.Y, f, this.D);
        A(f);
        float f3 = this.J;
        float f4 = this.K;
        TextPaint textPaint = this.B;
        if (f3 != f4) {
            textPaint.setLetterSpacing(v(f4, f3, f, fes.b));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        TimeInterpolator timeInterpolator = fes.b;
        this.N = 1.0f - v(0.0f, 1.0f, 1.0f - f, timeInterpolator);
        View view = this.a;
        view.postInvalidateOnAnimation();
        this.O = v(1.0f, 0.0f, f, timeInterpolator);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.i;
        ColorStateList colorStateList2 = this.h;
        TextPaint textPaint2 = this.B;
        if (colorStateList != colorStateList2) {
            textPaint2.setColor(w(x(colorStateList2), d(), f));
        } else {
            textPaint2.setColor(d());
        }
        this.v = v(0.0f, this.F, f, null);
        this.w = v(0.0f, this.G, f, null);
        this.x = v(0.0f, this.H, f, null);
        int w = w(x(null), x(this.I), f);
        this.y = w;
        this.B.setShadowLayer(this.v, this.w, this.x, w);
        view.postInvalidateOnAnimation();
    }

    private final void z(float f, boolean z) {
        Typeface typeface;
        float f2;
        float f3;
        if (this.q == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.c.width();
        if (B(f, 1.0f)) {
            f2 = u() ? this.g : this.f;
            f3 = u() ? this.J : this.K;
            this.t = u() ? 1.0f : v(this.f, this.g, f, this.E) / this.f;
            if (true != u()) {
                width = width2;
            }
            typeface = this.ab;
            width2 = width;
        } else {
            float f4 = this.f;
            float f5 = this.K;
            typeface = this.m;
            if (B(f, 0.0f)) {
                this.t = 1.0f;
            } else {
                this.t = v(this.f, this.g, f, this.E) / this.f;
            }
            float f6 = this.g / this.f;
            float f7 = width2 * f6;
            if (!z && f7 > width && u()) {
                width2 = Math.min(width / f6, width2);
            }
            f2 = f4;
            f3 = f5;
        }
        int i = f < 0.5f ? this.Q : this.R;
        if (width2 > 0.0f) {
            float f8 = this.u;
            float f9 = this.ah;
            Typeface typeface2 = this.ae;
            StaticLayout staticLayout = this.L;
            boolean z2 = (f8 == f2 && f9 == f3 && !(staticLayout != null && (width2 > ((float) staticLayout.getWidth()) ? 1 : (width2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) && typeface2 == typeface && this.ag == i && !this.A) ? false : true;
            this.u = f2;
            this.ah = f3;
            this.ae = typeface;
            this.A = false;
            this.ag = i;
            this.B.setLinearText(this.t != 1.0f);
            r4 = z2;
        }
        if (this.r == null || r4) {
            TextPaint textPaint = this.B;
            textPaint.setTextSize(this.u);
            textPaint.setTypeface(this.ae);
            textPaint.setLetterSpacing(this.ah);
            boolean q = q(this.q);
            this.s = q;
            StaticLayout e = e(true != t() ? 1 : i, textPaint, this.q, width2 * (u() ? 1.0f : this.t), q);
            this.L = e;
            this.r = e.getText();
        }
    }

    public final float a() {
        TextPaint textPaint = this.C;
        f(textPaint);
        return -textPaint.ascent();
    }

    public final float b() {
        int i = this.S;
        return i != -1 ? i : a();
    }

    public final float c() {
        TextPaint textPaint = this.C;
        g(textPaint);
        return -textPaint.ascent();
    }

    public final int d() {
        return x(this.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0019, code lost:
    
        if (r3 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final StaticLayout e(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        int i2;
        Layout.Alignment alignment2;
        StaticLayout staticLayout = null;
        try {
            if (i == 1) {
                alignment2 = Layout.Alignment.ALIGN_NORMAL;
                i2 = 1;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.V, this.s ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z2 = this.s;
                    if (absoluteGravity == 5) {
                        if (z2) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                Layout.Alignment alignment3 = alignment;
                i2 = i;
                alignment2 = alignment3;
            }
            fjr fjrVar = new fjr(charSequence, textPaint, (int) f);
            fjrVar.f = this.af;
            fjrVar.e = z;
            fjrVar.a = alignment2;
            fjrVar.d = false;
            fjrVar.b = i2;
            fjrVar.b(0.0f, 1.0f);
            fjrVar.c = 1;
            fjrVar.g = null;
            staticLayout = fjrVar.a();
        } catch (fjq e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
        tw.F(staticLayout);
        return staticLayout;
    }

    public final void f(TextPaint textPaint) {
        textPaint.setTextSize(this.g);
        textPaint.setTypeface(this.ab);
        textPaint.setLetterSpacing(this.J);
    }

    public final void g(TextPaint textPaint) {
        textPaint.setTextSize(this.f);
        textPaint.setTypeface(this.m);
        textPaint.setLetterSpacing(this.K);
    }

    public final void h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.ad;
            if (typeface != null) {
                this.ac = fny.b(configuration, typeface);
            }
            Typeface typeface2 = this.o;
            if (typeface2 != null) {
                this.n = fny.b(configuration, typeface2);
            }
            Typeface typeface3 = this.ac;
            if (typeface3 == null) {
                typeface3 = this.ad;
            }
            this.ab = typeface3;
            Typeface typeface4 = this.n;
            if (typeface4 == null) {
                typeface4 = this.o;
            }
            this.m = typeface4;
            i(true);
        }
    }

    public final void i(boolean z) {
        float C;
        StaticLayout staticLayout;
        View view = this.a;
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        z(1.0f, z);
        CharSequence charSequence = this.r;
        if (charSequence != null && (staticLayout = this.L) != null) {
            if (u()) {
                charSequence = TextUtils.ellipsize(charSequence, this.B, staticLayout.getWidth(), this.af);
            }
            this.P = charSequence;
        }
        CharSequence charSequence2 = this.P;
        if (charSequence2 != null) {
            this.M = C(this.B, charSequence2);
        } else {
            this.M = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.W, this.s ? 1 : 0);
        Rect rect = this.d;
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.Y = rect.top;
        } else if (i != 80) {
            TextPaint textPaint = this.B;
            this.Y = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.Y = rect.bottom + this.B.ascent();
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.aa = rect.centerX() - (this.M / 2.0f);
        } else if (i2 != 5) {
            this.aa = rect.left;
        } else {
            this.aa = rect.right - this.M;
        }
        if (this.M <= rect.width()) {
            float max = this.aa + Math.max(0.0f, rect.left - this.aa);
            this.aa = max;
            this.aa = max + Math.min(0.0f, rect.right - (this.aa + this.M));
        }
        TextPaint textPaint2 = this.C;
        f(textPaint2);
        if ((-textPaint2.ascent()) + textPaint2.descent() <= rect.height()) {
            float max2 = this.Y + Math.max(0.0f, rect.top - this.Y);
            this.Y = max2;
            this.Y = max2 + Math.min(0.0f, rect.bottom - (this.Y + b()));
        }
        z(0.0f, z);
        float height = this.L != null ? r13.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.L;
        if (staticLayout2 == null || this.Q <= 1) {
            CharSequence charSequence3 = this.r;
            C = charSequence3 != null ? C(this.B, charSequence3) : 0.0f;
        } else {
            C = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.L;
        this.j = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.V, this.s ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 != 48) {
            Rect rect2 = this.c;
            if (i3 != 80) {
                this.X = rect2.centerY() - (height / 2.0f);
            } else {
                this.X = (rect2.bottom - height) + (this.U ? this.B.descent() : 0.0f);
            }
        } else {
            this.X = this.c.top;
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 != 1) {
            Rect rect3 = this.c;
            if (i4 != 5) {
                this.Z = rect3.left;
            } else {
                this.Z = rect3.right - C;
            }
        } else {
            this.Z = this.c.centerX() - (C / 2.0f);
        }
        A(this.b);
        y();
    }

    public final void j(ColorStateList colorStateList) {
        if (this.i == colorStateList && this.h == colorStateList) {
            return;
        }
        this.i = colorStateList;
        this.h = colorStateList;
        i(false);
    }

    public final void k(Rect rect) {
        Rect rect2 = this.d;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        if (r(rect2, i, i2, i3, i4)) {
            return;
        }
        rect2.set(i, i2, i3, i4);
        this.A = true;
    }

    public final void l(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            i(false);
        }
    }

    public final void m(int i) {
        if (this.W != i) {
            this.W = i;
            i(false);
        }
    }

    public final void n(int i) {
        if (this.V != i) {
            this.V = i;
            i(false);
        }
    }

    public final void o(float f) {
        if (this.f != f) {
            this.f = f;
            i(false);
        }
    }

    public final void p(float f) {
        float i = pj.i(f, 0.0f, 1.0f);
        if (i != this.b) {
            this.b = i;
            y();
        }
    }

    public final boolean q(CharSequence charSequence) {
        return (this.a.getLayoutDirection() == 1 ? wn.d : wn.c).c(charSequence, charSequence.length());
    }

    public final boolean s(Typeface typeface) {
        fmk fmkVar = this.p;
        if (fmkVar != null) {
            fmkVar.c();
        }
        if (this.ad == typeface) {
            return false;
        }
        this.ad = typeface;
        Typeface b = fny.b(this.a.getContext().getResources().getConfiguration(), typeface);
        this.ac = b;
        if (b == null) {
            b = this.ad;
        }
        this.ab = b;
        return true;
    }

    public final boolean t() {
        return (this.Q > 1 || this.R > 1) && !this.s;
    }

    public final boolean u() {
        return this.R == 1;
    }
}
