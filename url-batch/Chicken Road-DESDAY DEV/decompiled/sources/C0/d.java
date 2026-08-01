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
import p0.AbstractC0281a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f81A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f82B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f83C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f85E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f86G;

    /* renamed from: H, reason: collision with root package name */
    public float f87H;

    /* renamed from: I, reason: collision with root package name */
    public float f88I;

    /* renamed from: J, reason: collision with root package name */
    public float f89J;

    /* renamed from: K, reason: collision with root package name */
    public int f90K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f91L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f92M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f93N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f94O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f95P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f96Q;

    /* renamed from: R, reason: collision with root package name */
    public float f97R;

    /* renamed from: S, reason: collision with root package name */
    public float f98S;

    /* renamed from: T, reason: collision with root package name */
    public float f99T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f100U;

    /* renamed from: V, reason: collision with root package name */
    public float f101V;

    /* renamed from: W, reason: collision with root package name */
    public float f102W;

    /* renamed from: X, reason: collision with root package name */
    public float f103X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f104Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f105Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f106a;

    /* renamed from: a0, reason: collision with root package name */
    public float f107a0;

    /* renamed from: b, reason: collision with root package name */
    public float f108b;

    /* renamed from: b0, reason: collision with root package name */
    public float f109b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f110c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f111c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f113e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f118j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f119k;

    /* renamed from: l, reason: collision with root package name */
    public float f120l;

    /* renamed from: m, reason: collision with root package name */
    public float f121m;

    /* renamed from: n, reason: collision with root package name */
    public float f122n;

    /* renamed from: o, reason: collision with root package name */
    public float f123o;

    /* renamed from: p, reason: collision with root package name */
    public float f124p;

    /* renamed from: q, reason: collision with root package name */
    public float f125q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f126r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f127s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f128t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f129u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f130v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f131w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f132x;

    /* renamed from: y, reason: collision with root package name */
    public F0.a f133y;

    /* renamed from: f, reason: collision with root package name */
    public int f115f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f117g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f134z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f84D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f112d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f114e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f116f0 = 1;

    public d(TextInputLayout textInputLayout) {
        this.f106a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f93N = textPaint;
        this.f94O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f110c = new Rect();
        this.f113e = new RectF();
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
        return AbstractC0281a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f369a;
        boolean z2 = this.f106a.getLayoutDirection() == 1;
        if (this.f84D) {
            return (z2 ? I.h.d : I.h.f255c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f81A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f110c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f101V;
            this.F = 1.0f;
            typeface = this.f126r;
        } else {
            float f5 = this.h;
            float f6 = this.f102W;
            Typeface typeface2 = this.f129u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f96Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f93N;
        if (width > 0.0f) {
            boolean z4 = this.f86G != f3;
            boolean z5 = this.f103X != f4;
            boolean z6 = this.f132x != typeface;
            StaticLayout staticLayout = this.f104Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f92M;
            this.f86G = f3;
            this.f103X = f4;
            this.f132x = typeface;
            this.f92M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f82B == null || z3) {
            textPaint.setTextSize(this.f86G);
            textPaint.setTypeface(this.f132x);
            textPaint.setLetterSpacing(this.f103X);
            boolean b2 = b(this.f81A);
            this.f83C = b2;
            int i = this.f112d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f115f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f83C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f83C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f81A, textPaint, (int) width);
            iVar.f150k = this.f134z;
            iVar.f149j = b2;
            iVar.f146e = alignment;
            iVar.i = false;
            iVar.f147f = i;
            iVar.f148g = this.f114e0;
            iVar.h = this.f116f0;
            StaticLayout a2 = iVar.a();
            a2.getClass();
            this.f104Y = a2;
            this.f82B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f94O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f126r);
        textPaint.setLetterSpacing(this.f101V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f91L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f128t;
            if (typeface != null) {
                this.f127s = u1.d.b0(configuration, typeface);
            }
            Typeface typeface2 = this.f131w;
            if (typeface2 != null) {
                this.f130v = u1.d.b0(configuration, typeface2);
            }
            Typeface typeface3 = this.f127s;
            if (typeface3 == null) {
                typeface3 = this.f128t;
            }
            this.f126r = typeface3;
            Typeface typeface4 = this.f130v;
            if (typeface4 == null) {
                typeface4 = this.f131w;
            }
            this.f129u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f106a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f82B;
        TextPaint textPaint = this.f93N;
        if (charSequence != null && (staticLayout = this.f104Y) != null) {
            this.f111c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f134z);
        }
        CharSequence charSequence2 = this.f111c0;
        if (charSequence2 != null) {
            this.f105Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f105Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f117g, this.f83C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f121m = rect.top;
        } else if (i != 80) {
            this.f121m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f121m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f123o = rect.centerX() - (this.f105Z / 2.0f);
        } else if (i2 != 5) {
            this.f123o = rect.left;
        } else {
            this.f123o = rect.right - this.f105Z;
        }
        c(0.0f, z2);
        float height = this.f104Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f104Y;
        if (staticLayout2 == null || this.f112d0 <= 1) {
            CharSequence charSequence3 = this.f82B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f104Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f115f, this.f83C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f110c;
        if (i3 == 48) {
            this.f120l = rect2.top;
        } else if (i3 != 80) {
            this.f120l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f120l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f122n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f122n = rect2.left;
        } else {
            this.f122n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f85E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f85E = null;
        }
        l(this.f108b);
        float f2 = this.f108b;
        float f3 = f(rect2.left, rect.left, f2, this.f95P);
        RectF rectF = this.f113e;
        rectF.left = f3;
        rectF.top = f(this.f120l, this.f121m, f2, this.f95P);
        rectF.right = f(rect2.right, rect.right, f2, this.f95P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f95P);
        this.f124p = f(this.f122n, this.f123o, f2, this.f95P);
        this.f125q = f(this.f120l, this.f121m, f2, this.f95P);
        l(f2);
        Z.a aVar = AbstractC0281a.f3381b;
        this.f107a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
        WeakHashMap weakHashMap = S.f369a;
        textInputLayout.postInvalidateOnAnimation();
        this.f109b0 = f(1.0f, 0.0f, f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f119k;
        ColorStateList colorStateList2 = this.f118j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f119k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f101V;
        float f5 = this.f102W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, aVar));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f87H = AbstractC0281a.a(0.0f, this.f97R, f2);
        this.f88I = AbstractC0281a.a(0.0f, this.f98S, f2);
        this.f89J = AbstractC0281a.a(0.0f, this.f99T, f2);
        int a2 = a(0, e(this.f100U), f2);
        this.f90K = a2;
        textPaint.setShadowLayer(this.f87H, this.f88I, this.f89J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f119k == colorStateList && this.f118j == colorStateList) {
            return;
        }
        this.f119k = colorStateList;
        this.f118j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        F0.a aVar = this.f133y;
        if (aVar != null) {
            aVar.f172g = true;
        }
        if (this.f128t == typeface) {
            return false;
        }
        this.f128t = typeface;
        Typeface b02 = u1.d.b0(this.f106a.getContext().getResources().getConfiguration(), typeface);
        this.f127s = b02;
        if (b02 == null) {
            b02 = this.f128t;
        }
        this.f126r = b02;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f108b) {
            this.f108b = f2;
            float f3 = this.f110c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f95P);
            RectF rectF = this.f113e;
            rectF.left = f4;
            rectF.top = f(this.f120l, this.f121m, f2, this.f95P);
            rectF.right = f(r1.right, rect.right, f2, this.f95P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f95P);
            this.f124p = f(this.f122n, this.f123o, f2, this.f95P);
            this.f125q = f(this.f120l, this.f121m, f2, this.f95P);
            l(f2);
            Z.a aVar = AbstractC0281a.f3381b;
            this.f107a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
            WeakHashMap weakHashMap = S.f369a;
            TextInputLayout textInputLayout = this.f106a;
            textInputLayout.postInvalidateOnAnimation();
            this.f109b0 = f(1.0f, 0.0f, f2, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f119k;
            ColorStateList colorStateList2 = this.f118j;
            TextPaint textPaint = this.f93N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f119k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f101V;
            float f6 = this.f102W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, aVar));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f87H = AbstractC0281a.a(0.0f, this.f97R, f2);
            this.f88I = AbstractC0281a.a(0.0f, this.f98S, f2);
            this.f89J = AbstractC0281a.a(0.0f, this.f99T, f2);
            int a2 = a(0, e(this.f100U), f2);
            this.f90K = a2;
            textPaint.setShadowLayer(this.f87H, this.f88I, this.f89J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = S.f369a;
        this.f106a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f131w != typeface) {
            this.f131w = typeface;
            Typeface b02 = u1.d.b0(this.f106a.getContext().getResources().getConfiguration(), typeface);
            this.f130v = b02;
            if (b02 == null) {
                b02 = this.f131w;
            }
            this.f129u = b02;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
