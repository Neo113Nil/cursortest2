package H0;

import M.P;
import a.AbstractC0058a;
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
import b0.C0096a;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import u0.AbstractC0389a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f462A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f463B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f464C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f466E;

    /* renamed from: F, reason: collision with root package name */
    public float f467F;

    /* renamed from: G, reason: collision with root package name */
    public float f468G;
    public float H;

    /* renamed from: I, reason: collision with root package name */
    public float f469I;

    /* renamed from: J, reason: collision with root package name */
    public float f470J;

    /* renamed from: K, reason: collision with root package name */
    public int f471K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f472L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f473M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f474N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f475O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f476P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f477Q;

    /* renamed from: R, reason: collision with root package name */
    public float f478R;

    /* renamed from: S, reason: collision with root package name */
    public float f479S;

    /* renamed from: T, reason: collision with root package name */
    public float f480T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f481U;

    /* renamed from: V, reason: collision with root package name */
    public float f482V;

    /* renamed from: W, reason: collision with root package name */
    public float f483W;

    /* renamed from: X, reason: collision with root package name */
    public float f484X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f485Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f486Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f487a;

    /* renamed from: a0, reason: collision with root package name */
    public float f488a0;

    /* renamed from: b, reason: collision with root package name */
    public float f489b;

    /* renamed from: b0, reason: collision with root package name */
    public float f490b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f491c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f492c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f493d;
    public final RectF e;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f500k;

    /* renamed from: l, reason: collision with root package name */
    public float f501l;

    /* renamed from: m, reason: collision with root package name */
    public float f502m;

    /* renamed from: n, reason: collision with root package name */
    public float f503n;

    /* renamed from: o, reason: collision with root package name */
    public float f504o;

    /* renamed from: p, reason: collision with root package name */
    public float f505p;

    /* renamed from: q, reason: collision with root package name */
    public float f506q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f507r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f508s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f509t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f510u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f511v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f512w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f513x;

    /* renamed from: y, reason: collision with root package name */
    public K0.a f514y;

    /* renamed from: f, reason: collision with root package name */
    public int f496f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f498g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f499h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f515z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f465D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f494d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f495e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f497f0 = 1;

    public d(TextInputLayout textInputLayout) {
        this.f487a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f474N = textPaint;
        this.f475O = new TextPaint(textPaint);
        this.f493d = new Rect();
        this.f491c = new Rect();
        this.e = new RectF();
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
        return AbstractC0389a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = P.f711a;
        boolean z2 = this.f487a.getLayoutDirection() == 1;
        if (this.f465D) {
            return (z2 ? K.i.f671d : K.i.f670c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f462A == null) {
            return;
        }
        float width = this.f493d.width();
        float width2 = this.f491c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f482V;
            this.f467F = 1.0f;
            typeface = this.f507r;
        } else {
            float f5 = this.f499h;
            float f6 = this.f483W;
            Typeface typeface2 = this.f510u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.f467F = 1.0f;
            } else {
                this.f467F = f(this.f499h, this.i, f2, this.f477Q) / this.f499h;
            }
            float f7 = this.i / this.f499h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f474N;
        if (width > 0.0f) {
            boolean z4 = this.f468G != f3;
            boolean z5 = this.f484X != f4;
            boolean z6 = this.f513x != typeface;
            StaticLayout staticLayout = this.f485Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f473M;
            this.f468G = f3;
            this.f484X = f4;
            this.f513x = typeface;
            this.f473M = false;
            textPaint.setLinearText(this.f467F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f463B == null || z3) {
            textPaint.setTextSize(this.f468G);
            textPaint.setTypeface(this.f513x);
            textPaint.setLetterSpacing(this.f484X);
            boolean b2 = b(this.f462A);
            this.f464C = b2;
            int i = this.f494d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f496f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f464C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f464C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f462A, textPaint, (int) width);
            iVar.f531k = this.f515z;
            iVar.j = b2;
            iVar.e = alignment;
            iVar.i = false;
            iVar.f528f = i;
            iVar.f529g = this.f495e0;
            iVar.f530h = this.f497f0;
            StaticLayout a2 = iVar.a();
            a2.getClass();
            this.f485Y = a2;
            this.f463B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f475O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f507r);
        textPaint.setLetterSpacing(this.f482V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f472L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f509t;
            if (typeface != null) {
                this.f508s = AbstractC0058a.L(configuration, typeface);
            }
            Typeface typeface2 = this.f512w;
            if (typeface2 != null) {
                this.f511v = AbstractC0058a.L(configuration, typeface2);
            }
            Typeface typeface3 = this.f508s;
            if (typeface3 == null) {
                typeface3 = this.f509t;
            }
            this.f507r = typeface3;
            Typeface typeface4 = this.f511v;
            if (typeface4 == null) {
                typeface4 = this.f512w;
            }
            this.f510u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f487a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f463B;
        TextPaint textPaint = this.f474N;
        if (charSequence != null && (staticLayout = this.f485Y) != null) {
            this.f492c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f515z);
        }
        CharSequence charSequence2 = this.f492c0;
        if (charSequence2 != null) {
            this.f486Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f486Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f498g, this.f464C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f493d;
        if (i == 48) {
            this.f502m = rect.top;
        } else if (i != 80) {
            this.f502m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f502m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f504o = rect.centerX() - (this.f486Z / 2.0f);
        } else if (i2 != 5) {
            this.f504o = rect.left;
        } else {
            this.f504o = rect.right - this.f486Z;
        }
        c(0.0f, z2);
        float height = this.f485Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f485Y;
        if (staticLayout2 == null || this.f494d0 <= 1) {
            CharSequence charSequence3 = this.f463B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f485Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f496f, this.f464C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f491c;
        if (i3 == 48) {
            this.f501l = rect2.top;
        } else if (i3 != 80) {
            this.f501l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f501l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f503n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f503n = rect2.left;
        } else {
            this.f503n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f466E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f466E = null;
        }
        l(this.f489b);
        float f2 = this.f489b;
        float f3 = f(rect2.left, rect.left, f2, this.f476P);
        RectF rectF = this.e;
        rectF.left = f3;
        rectF.top = f(this.f501l, this.f502m, f2, this.f476P);
        rectF.right = f(rect2.right, rect.right, f2, this.f476P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f476P);
        this.f505p = f(this.f503n, this.f504o, f2, this.f476P);
        this.f506q = f(this.f501l, this.f502m, f2, this.f476P);
        l(f2);
        C0096a c0096a = AbstractC0389a.f4370b;
        this.f488a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, c0096a);
        WeakHashMap weakHashMap = P.f711a;
        textInputLayout.postInvalidateOnAnimation();
        this.f490b0 = f(1.0f, 0.0f, f2, c0096a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f500k;
        ColorStateList colorStateList2 = this.j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f500k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f482V;
        float f5 = this.f483W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, c0096a));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.H = AbstractC0389a.a(0.0f, this.f478R, f2);
        this.f469I = AbstractC0389a.a(0.0f, this.f479S, f2);
        this.f470J = AbstractC0389a.a(0.0f, this.f480T, f2);
        int a2 = a(0, e(this.f481U), f2);
        this.f471K = a2;
        textPaint.setShadowLayer(this.H, this.f469I, this.f470J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f500k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.f500k = colorStateList;
        this.j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        K0.a aVar = this.f514y;
        if (aVar != null) {
            aVar.f674h = true;
        }
        if (this.f509t == typeface) {
            return false;
        }
        this.f509t = typeface;
        Typeface L2 = AbstractC0058a.L(this.f487a.getContext().getResources().getConfiguration(), typeface);
        this.f508s = L2;
        if (L2 == null) {
            L2 = this.f509t;
        }
        this.f507r = L2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f489b) {
            this.f489b = f2;
            float f3 = this.f491c.left;
            Rect rect = this.f493d;
            float f4 = f(f3, rect.left, f2, this.f476P);
            RectF rectF = this.e;
            rectF.left = f4;
            rectF.top = f(this.f501l, this.f502m, f2, this.f476P);
            rectF.right = f(r1.right, rect.right, f2, this.f476P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f476P);
            this.f505p = f(this.f503n, this.f504o, f2, this.f476P);
            this.f506q = f(this.f501l, this.f502m, f2, this.f476P);
            l(f2);
            C0096a c0096a = AbstractC0389a.f4370b;
            this.f488a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, c0096a);
            WeakHashMap weakHashMap = P.f711a;
            TextInputLayout textInputLayout = this.f487a;
            textInputLayout.postInvalidateOnAnimation();
            this.f490b0 = f(1.0f, 0.0f, f2, c0096a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f500k;
            ColorStateList colorStateList2 = this.j;
            TextPaint textPaint = this.f474N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f500k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f482V;
            float f6 = this.f483W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, c0096a));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.H = AbstractC0389a.a(0.0f, this.f478R, f2);
            this.f469I = AbstractC0389a.a(0.0f, this.f479S, f2);
            this.f470J = AbstractC0389a.a(0.0f, this.f480T, f2);
            int a2 = a(0, e(this.f481U), f2);
            this.f471K = a2;
            textPaint.setShadowLayer(this.H, this.f469I, this.f470J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = P.f711a;
        this.f487a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j = j(typeface);
        if (this.f512w != typeface) {
            this.f512w = typeface;
            Typeface L2 = AbstractC0058a.L(this.f487a.getContext().getResources().getConfiguration(), typeface);
            this.f511v = L2;
            if (L2 == null) {
                L2 = this.f512w;
            }
            this.f510u = L2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j || z2) {
            h(false);
        }
    }
}
