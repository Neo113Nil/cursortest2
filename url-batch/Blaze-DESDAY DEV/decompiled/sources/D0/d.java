package D0;

import K.T;
import a0.C0059a;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import q0.AbstractC0292a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f100A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f101B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f102C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f104E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f105G;

    /* renamed from: H, reason: collision with root package name */
    public float f106H;

    /* renamed from: I, reason: collision with root package name */
    public float f107I;

    /* renamed from: J, reason: collision with root package name */
    public float f108J;

    /* renamed from: K, reason: collision with root package name */
    public int f109K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f110L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f111M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f112N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f113O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f114P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f115Q;

    /* renamed from: R, reason: collision with root package name */
    public float f116R;

    /* renamed from: S, reason: collision with root package name */
    public float f117S;

    /* renamed from: T, reason: collision with root package name */
    public float f118T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f119U;

    /* renamed from: V, reason: collision with root package name */
    public float f120V;

    /* renamed from: W, reason: collision with root package name */
    public float f121W;

    /* renamed from: X, reason: collision with root package name */
    public float f122X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f123Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f124Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f125a;

    /* renamed from: a0, reason: collision with root package name */
    public float f126a0;

    /* renamed from: b, reason: collision with root package name */
    public float f127b;

    /* renamed from: b0, reason: collision with root package name */
    public float f128b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f129c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f130c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f132e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f137j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f138k;

    /* renamed from: l, reason: collision with root package name */
    public float f139l;

    /* renamed from: m, reason: collision with root package name */
    public float f140m;

    /* renamed from: n, reason: collision with root package name */
    public float f141n;

    /* renamed from: o, reason: collision with root package name */
    public float f142o;

    /* renamed from: p, reason: collision with root package name */
    public float f143p;

    /* renamed from: q, reason: collision with root package name */
    public float f144q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f145r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f146s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f147t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f148u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f149v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f150w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f151x;

    /* renamed from: y, reason: collision with root package name */
    public G0.a f152y;

    /* renamed from: f, reason: collision with root package name */
    public int f134f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f136g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f153z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f103D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f131d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f133e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f135f0 = 1;

    public d(TextInputLayout textInputLayout) {
        this.f125a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f112N = textPaint;
        this.f113O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f129c = new Rect();
        this.f132e = new RectF();
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
        return AbstractC0292a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f440a;
        boolean z2 = this.f125a.getLayoutDirection() == 1;
        if (this.f103D) {
            return (z2 ? I.h.d : I.h.f320c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f100A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f129c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f120V;
            this.F = 1.0f;
            typeface = this.f145r;
        } else {
            float f5 = this.h;
            float f6 = this.f121W;
            Typeface typeface2 = this.f148u;
            if (Math.abs(f2 - RecyclerView.f1559A0) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f115Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f112N;
        if (width > RecyclerView.f1559A0) {
            boolean z4 = this.f105G != f3;
            boolean z5 = this.f122X != f4;
            boolean z6 = this.f151x != typeface;
            StaticLayout staticLayout = this.f123Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f111M;
            this.f105G = f3;
            this.f122X = f4;
            this.f151x = typeface;
            this.f111M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f101B == null || z3) {
            textPaint.setTextSize(this.f105G);
            textPaint.setTypeface(this.f151x);
            textPaint.setLetterSpacing(this.f122X);
            boolean b2 = b(this.f100A);
            this.f102C = b2;
            int i = this.f131d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f134f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f102C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f102C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f100A, textPaint, (int) width);
            iVar.f169k = this.f153z;
            iVar.f168j = b2;
            iVar.f165e = alignment;
            iVar.i = false;
            iVar.f166f = i;
            iVar.f167g = this.f133e0;
            iVar.h = this.f135f0;
            StaticLayout a2 = iVar.a();
            a2.getClass();
            this.f123Y = a2;
            this.f101B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f113O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f145r);
        textPaint.setLetterSpacing(this.f120V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f110L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f147t;
            if (typeface != null) {
                this.f146s = z1.l.G(configuration, typeface);
            }
            Typeface typeface2 = this.f150w;
            if (typeface2 != null) {
                this.f149v = z1.l.G(configuration, typeface2);
            }
            Typeface typeface3 = this.f146s;
            if (typeface3 == null) {
                typeface3 = this.f147t;
            }
            this.f145r = typeface3;
            Typeface typeface4 = this.f149v;
            if (typeface4 == null) {
                typeface4 = this.f150w;
            }
            this.f148u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f125a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f101B;
        TextPaint textPaint = this.f112N;
        if (charSequence != null && (staticLayout = this.f123Y) != null) {
            this.f130c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f153z);
        }
        CharSequence charSequence2 = this.f130c0;
        if (charSequence2 != null) {
            this.f124Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f124Z = RecyclerView.f1559A0;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f136g, this.f102C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f140m = rect.top;
        } else if (i != 80) {
            this.f140m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f140m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f142o = rect.centerX() - (this.f124Z / 2.0f);
        } else if (i2 != 5) {
            this.f142o = rect.left;
        } else {
            this.f142o = rect.right - this.f124Z;
        }
        c(RecyclerView.f1559A0, z2);
        float height = this.f123Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f123Y;
        if (staticLayout2 == null || this.f131d0 <= 1) {
            CharSequence charSequence3 = this.f101B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f123Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f134f, this.f102C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f129c;
        if (i3 == 48) {
            this.f139l = rect2.top;
        } else if (i3 != 80) {
            this.f139l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f139l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f141n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f141n = rect2.left;
        } else {
            this.f141n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f104E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f104E = null;
        }
        l(this.f127b);
        float f2 = this.f127b;
        float f3 = f(rect2.left, rect.left, f2, this.f114P);
        RectF rectF = this.f132e;
        rectF.left = f3;
        rectF.top = f(this.f139l, this.f140m, f2, this.f114P);
        rectF.right = f(rect2.right, rect.right, f2, this.f114P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f114P);
        this.f143p = f(this.f141n, this.f142o, f2, this.f114P);
        this.f144q = f(this.f139l, this.f140m, f2, this.f114P);
        l(f2);
        C0059a c0059a = AbstractC0292a.f3385b;
        this.f126a0 = 1.0f - f(RecyclerView.f1559A0, 1.0f, 1.0f - f2, c0059a);
        WeakHashMap weakHashMap = T.f440a;
        textInputLayout.postInvalidateOnAnimation();
        this.f128b0 = f(1.0f, RecyclerView.f1559A0, f2, c0059a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f138k;
        ColorStateList colorStateList2 = this.f137j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f138k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f120V;
        float f5 = this.f121W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, c0059a));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f106H = AbstractC0292a.a(RecyclerView.f1559A0, this.f116R, f2);
        this.f107I = AbstractC0292a.a(RecyclerView.f1559A0, this.f117S, f2);
        this.f108J = AbstractC0292a.a(RecyclerView.f1559A0, this.f118T, f2);
        int a2 = a(0, e(this.f119U), f2);
        this.f109K = a2;
        textPaint.setShadowLayer(this.f106H, this.f107I, this.f108J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f138k == colorStateList && this.f137j == colorStateList) {
            return;
        }
        this.f138k = colorStateList;
        this.f137j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        G0.a aVar = this.f152y;
        if (aVar != null) {
            aVar.f254c = true;
        }
        if (this.f147t == typeface) {
            return false;
        }
        this.f147t = typeface;
        Typeface G2 = z1.l.G(this.f125a.getContext().getResources().getConfiguration(), typeface);
        this.f146s = G2;
        if (G2 == null) {
            G2 = this.f147t;
        }
        this.f145r = G2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < RecyclerView.f1559A0) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f127b) {
            this.f127b = f2;
            float f3 = this.f129c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f114P);
            RectF rectF = this.f132e;
            rectF.left = f4;
            rectF.top = f(this.f139l, this.f140m, f2, this.f114P);
            rectF.right = f(r1.right, rect.right, f2, this.f114P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f114P);
            this.f143p = f(this.f141n, this.f142o, f2, this.f114P);
            this.f144q = f(this.f139l, this.f140m, f2, this.f114P);
            l(f2);
            C0059a c0059a = AbstractC0292a.f3385b;
            this.f126a0 = 1.0f - f(RecyclerView.f1559A0, 1.0f, 1.0f - f2, c0059a);
            WeakHashMap weakHashMap = T.f440a;
            TextInputLayout textInputLayout = this.f125a;
            textInputLayout.postInvalidateOnAnimation();
            this.f128b0 = f(1.0f, RecyclerView.f1559A0, f2, c0059a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f138k;
            ColorStateList colorStateList2 = this.f137j;
            TextPaint textPaint = this.f112N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f138k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f120V;
            float f6 = this.f121W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, c0059a));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f106H = AbstractC0292a.a(RecyclerView.f1559A0, this.f116R, f2);
            this.f107I = AbstractC0292a.a(RecyclerView.f1559A0, this.f117S, f2);
            this.f108J = AbstractC0292a.a(RecyclerView.f1559A0, this.f118T, f2);
            int a2 = a(0, e(this.f119U), f2);
            this.f109K = a2;
            textPaint.setShadowLayer(this.f106H, this.f107I, this.f108J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = T.f440a;
        this.f125a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f150w != typeface) {
            this.f150w = typeface;
            Typeface G2 = z1.l.G(this.f125a.getContext().getResources().getConfiguration(), typeface);
            this.f149v = G2;
            if (G2 == null) {
                G2 = this.f150w;
            }
            this.f148u = G2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
