package F0;

import M.Q;
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
import r0.AbstractC0260a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f241A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f242B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f243C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f245E;

    /* renamed from: F, reason: collision with root package name */
    public float f246F;

    /* renamed from: G, reason: collision with root package name */
    public float f247G;
    public float H;

    /* renamed from: I, reason: collision with root package name */
    public float f248I;

    /* renamed from: J, reason: collision with root package name */
    public float f249J;

    /* renamed from: K, reason: collision with root package name */
    public int f250K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f251L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f252M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f253N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f254O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f255P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f256Q;

    /* renamed from: R, reason: collision with root package name */
    public float f257R;

    /* renamed from: S, reason: collision with root package name */
    public float f258S;

    /* renamed from: T, reason: collision with root package name */
    public float f259T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f260U;

    /* renamed from: V, reason: collision with root package name */
    public float f261V;

    /* renamed from: W, reason: collision with root package name */
    public float f262W;

    /* renamed from: X, reason: collision with root package name */
    public float f263X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f264Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f265Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f266a;

    /* renamed from: a0, reason: collision with root package name */
    public float f267a0;

    /* renamed from: b, reason: collision with root package name */
    public float f268b;

    /* renamed from: b0, reason: collision with root package name */
    public float f269b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f270c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f271c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f273e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f278j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f279k;

    /* renamed from: l, reason: collision with root package name */
    public float f280l;

    /* renamed from: m, reason: collision with root package name */
    public float f281m;

    /* renamed from: n, reason: collision with root package name */
    public float f282n;

    /* renamed from: o, reason: collision with root package name */
    public float f283o;

    /* renamed from: p, reason: collision with root package name */
    public float f284p;

    /* renamed from: q, reason: collision with root package name */
    public float f285q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f286r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f287s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f288t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f289u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f290v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f291w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f292x;

    /* renamed from: y, reason: collision with root package name */
    public I0.a f293y;

    /* renamed from: f, reason: collision with root package name */
    public int f275f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f277g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f294z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f244D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f272d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f274e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f276f0 = 1;

    public d(TextInputLayout textInputLayout) {
        this.f266a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f253N = textPaint;
        this.f254O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f270c = new Rect();
        this.f273e = new RectF();
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
        return AbstractC0260a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = Q.f513a;
        boolean z2 = this.f266a.getLayoutDirection() == 1;
        if (this.f244D) {
            return (z2 ? K.h.d : K.h.f401c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f241A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f270c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f261V;
            this.f246F = 1.0f;
            typeface = this.f286r;
        } else {
            float f5 = this.h;
            float f6 = this.f262W;
            Typeface typeface2 = this.f289u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.f246F = 1.0f;
            } else {
                this.f246F = f(this.h, this.i, f2, this.f256Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f253N;
        if (width > 0.0f) {
            boolean z4 = this.f247G != f3;
            boolean z5 = this.f263X != f4;
            boolean z6 = this.f292x != typeface;
            StaticLayout staticLayout = this.f264Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f252M;
            this.f247G = f3;
            this.f263X = f4;
            this.f292x = typeface;
            this.f252M = false;
            textPaint.setLinearText(this.f246F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f242B == null || z3) {
            textPaint.setTextSize(this.f247G);
            textPaint.setTypeface(this.f292x);
            textPaint.setLetterSpacing(this.f263X);
            boolean b2 = b(this.f241A);
            this.f243C = b2;
            int i = this.f272d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f275f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f243C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f243C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f241A, textPaint, (int) width);
            iVar.f310k = this.f294z;
            iVar.f309j = b2;
            iVar.f306e = alignment;
            iVar.i = false;
            iVar.f307f = i;
            iVar.f308g = this.f274e0;
            iVar.h = this.f276f0;
            StaticLayout a2 = iVar.a();
            a2.getClass();
            this.f264Y = a2;
            this.f242B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f254O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f286r);
        textPaint.setLetterSpacing(this.f261V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f251L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f288t;
            if (typeface != null) {
                this.f287s = z1.d.K(configuration, typeface);
            }
            Typeface typeface2 = this.f291w;
            if (typeface2 != null) {
                this.f290v = z1.d.K(configuration, typeface2);
            }
            Typeface typeface3 = this.f287s;
            if (typeface3 == null) {
                typeface3 = this.f288t;
            }
            this.f286r = typeface3;
            Typeface typeface4 = this.f290v;
            if (typeface4 == null) {
                typeface4 = this.f291w;
            }
            this.f289u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f266a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f242B;
        TextPaint textPaint = this.f253N;
        if (charSequence != null && (staticLayout = this.f264Y) != null) {
            this.f271c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f294z);
        }
        CharSequence charSequence2 = this.f271c0;
        if (charSequence2 != null) {
            this.f265Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f265Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f277g, this.f243C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f281m = rect.top;
        } else if (i != 80) {
            this.f281m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f281m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f283o = rect.centerX() - (this.f265Z / 2.0f);
        } else if (i2 != 5) {
            this.f283o = rect.left;
        } else {
            this.f283o = rect.right - this.f265Z;
        }
        c(0.0f, z2);
        float height = this.f264Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f264Y;
        if (staticLayout2 == null || this.f272d0 <= 1) {
            CharSequence charSequence3 = this.f242B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f264Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f275f, this.f243C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f270c;
        if (i3 == 48) {
            this.f280l = rect2.top;
        } else if (i3 != 80) {
            this.f280l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f280l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f282n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f282n = rect2.left;
        } else {
            this.f282n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f245E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f245E = null;
        }
        l(this.f268b);
        float f2 = this.f268b;
        float f3 = f(rect2.left, rect.left, f2, this.f255P);
        RectF rectF = this.f273e;
        rectF.left = f3;
        rectF.top = f(this.f280l, this.f281m, f2, this.f255P);
        rectF.right = f(rect2.right, rect.right, f2, this.f255P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f255P);
        this.f284p = f(this.f282n, this.f283o, f2, this.f255P);
        this.f285q = f(this.f280l, this.f281m, f2, this.f255P);
        l(f2);
        b0.a aVar = AbstractC0260a.f3421b;
        this.f267a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
        WeakHashMap weakHashMap = Q.f513a;
        textInputLayout.postInvalidateOnAnimation();
        this.f269b0 = f(1.0f, 0.0f, f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f279k;
        ColorStateList colorStateList2 = this.f278j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f279k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f261V;
        float f5 = this.f262W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, aVar));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.H = AbstractC0260a.a(0.0f, this.f257R, f2);
        this.f248I = AbstractC0260a.a(0.0f, this.f258S, f2);
        this.f249J = AbstractC0260a.a(0.0f, this.f259T, f2);
        int a2 = a(0, e(this.f260U), f2);
        this.f250K = a2;
        textPaint.setShadowLayer(this.H, this.f248I, this.f249J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f279k == colorStateList && this.f278j == colorStateList) {
            return;
        }
        this.f279k = colorStateList;
        this.f278j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        I0.a aVar = this.f293y;
        if (aVar != null) {
            aVar.f338c = true;
        }
        if (this.f288t == typeface) {
            return false;
        }
        this.f288t = typeface;
        Typeface K2 = z1.d.K(this.f266a.getContext().getResources().getConfiguration(), typeface);
        this.f287s = K2;
        if (K2 == null) {
            K2 = this.f288t;
        }
        this.f286r = K2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f268b) {
            this.f268b = f2;
            float f3 = this.f270c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f255P);
            RectF rectF = this.f273e;
            rectF.left = f4;
            rectF.top = f(this.f280l, this.f281m, f2, this.f255P);
            rectF.right = f(r1.right, rect.right, f2, this.f255P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f255P);
            this.f284p = f(this.f282n, this.f283o, f2, this.f255P);
            this.f285q = f(this.f280l, this.f281m, f2, this.f255P);
            l(f2);
            b0.a aVar = AbstractC0260a.f3421b;
            this.f267a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
            WeakHashMap weakHashMap = Q.f513a;
            TextInputLayout textInputLayout = this.f266a;
            textInputLayout.postInvalidateOnAnimation();
            this.f269b0 = f(1.0f, 0.0f, f2, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f279k;
            ColorStateList colorStateList2 = this.f278j;
            TextPaint textPaint = this.f253N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f279k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f261V;
            float f6 = this.f262W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, aVar));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.H = AbstractC0260a.a(0.0f, this.f257R, f2);
            this.f248I = AbstractC0260a.a(0.0f, this.f258S, f2);
            this.f249J = AbstractC0260a.a(0.0f, this.f259T, f2);
            int a2 = a(0, e(this.f260U), f2);
            this.f250K = a2;
            textPaint.setShadowLayer(this.H, this.f248I, this.f249J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = Q.f513a;
        this.f266a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f291w != typeface) {
            this.f291w = typeface;
            Typeface K2 = z1.d.K(this.f266a.getContext().getResources().getConfiguration(), typeface);
            this.f290v = K2;
            if (K2 == null) {
                K2 = this.f291w;
            }
            this.f289u = K2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
