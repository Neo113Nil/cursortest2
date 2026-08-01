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
import q0.AbstractC0289a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f138A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f139B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f140C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f142E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f143G;

    /* renamed from: H, reason: collision with root package name */
    public float f144H;

    /* renamed from: I, reason: collision with root package name */
    public float f145I;

    /* renamed from: J, reason: collision with root package name */
    public float f146J;

    /* renamed from: K, reason: collision with root package name */
    public int f147K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f148L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f149M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f150N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f151O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f152P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f153Q;

    /* renamed from: R, reason: collision with root package name */
    public float f154R;

    /* renamed from: S, reason: collision with root package name */
    public float f155S;

    /* renamed from: T, reason: collision with root package name */
    public float f156T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f157U;

    /* renamed from: V, reason: collision with root package name */
    public float f158V;

    /* renamed from: W, reason: collision with root package name */
    public float f159W;

    /* renamed from: X, reason: collision with root package name */
    public float f160X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f161Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f162Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f163a;

    /* renamed from: a0, reason: collision with root package name */
    public float f164a0;

    /* renamed from: b, reason: collision with root package name */
    public float f165b;

    /* renamed from: b0, reason: collision with root package name */
    public float f166b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f167c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f168c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f170e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f175j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f176k;

    /* renamed from: l, reason: collision with root package name */
    public float f177l;

    /* renamed from: m, reason: collision with root package name */
    public float f178m;

    /* renamed from: n, reason: collision with root package name */
    public float f179n;

    /* renamed from: o, reason: collision with root package name */
    public float f180o;

    /* renamed from: p, reason: collision with root package name */
    public float f181p;

    /* renamed from: q, reason: collision with root package name */
    public float f182q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f183r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f184s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f185t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f186u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f187v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f188w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f189x;

    /* renamed from: y, reason: collision with root package name */
    public G0.a f190y;

    /* renamed from: f, reason: collision with root package name */
    public int f172f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f174g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f191z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f141D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f169d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f171e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f173f0 = 1;

    public d(TextInputLayout textInputLayout) {
        this.f163a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f150N = textPaint;
        this.f151O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f167c = new Rect();
        this.f170e = new RectF();
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
        return AbstractC0289a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f423a;
        boolean z2 = this.f163a.getLayoutDirection() == 1;
        if (this.f141D) {
            return (z2 ? I.h.d : I.h.f303c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f138A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f167c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f158V;
            this.F = 1.0f;
            typeface = this.f183r;
        } else {
            float f5 = this.h;
            float f6 = this.f159W;
            Typeface typeface2 = this.f186u;
            if (Math.abs(f2 - RecyclerView.f1530C0) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f153Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f150N;
        if (width > RecyclerView.f1530C0) {
            boolean z4 = this.f143G != f3;
            boolean z5 = this.f160X != f4;
            boolean z6 = this.f189x != typeface;
            StaticLayout staticLayout = this.f161Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f149M;
            this.f143G = f3;
            this.f160X = f4;
            this.f189x = typeface;
            this.f149M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f139B == null || z3) {
            textPaint.setTextSize(this.f143G);
            textPaint.setTypeface(this.f189x);
            textPaint.setLetterSpacing(this.f160X);
            boolean b2 = b(this.f138A);
            this.f140C = b2;
            int i = this.f169d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f172f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f140C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f140C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f138A, textPaint, (int) width);
            iVar.f207k = this.f191z;
            iVar.f206j = b2;
            iVar.f203e = alignment;
            iVar.i = false;
            iVar.f204f = i;
            iVar.f205g = this.f171e0;
            iVar.h = this.f173f0;
            StaticLayout a2 = iVar.a();
            a2.getClass();
            this.f161Y = a2;
            this.f139B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f151O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f183r);
        textPaint.setLetterSpacing(this.f158V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f148L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f185t;
            if (typeface != null) {
                this.f184s = w1.l.G(configuration, typeface);
            }
            Typeface typeface2 = this.f188w;
            if (typeface2 != null) {
                this.f187v = w1.l.G(configuration, typeface2);
            }
            Typeface typeface3 = this.f184s;
            if (typeface3 == null) {
                typeface3 = this.f185t;
            }
            this.f183r = typeface3;
            Typeface typeface4 = this.f187v;
            if (typeface4 == null) {
                typeface4 = this.f188w;
            }
            this.f186u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f163a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f139B;
        TextPaint textPaint = this.f150N;
        if (charSequence != null && (staticLayout = this.f161Y) != null) {
            this.f168c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f191z);
        }
        CharSequence charSequence2 = this.f168c0;
        if (charSequence2 != null) {
            this.f162Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f162Z = RecyclerView.f1530C0;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f174g, this.f140C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f178m = rect.top;
        } else if (i != 80) {
            this.f178m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f178m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f180o = rect.centerX() - (this.f162Z / 2.0f);
        } else if (i2 != 5) {
            this.f180o = rect.left;
        } else {
            this.f180o = rect.right - this.f162Z;
        }
        c(RecyclerView.f1530C0, z2);
        float height = this.f161Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f161Y;
        if (staticLayout2 == null || this.f169d0 <= 1) {
            CharSequence charSequence3 = this.f139B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f161Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f172f, this.f140C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f167c;
        if (i3 == 48) {
            this.f177l = rect2.top;
        } else if (i3 != 80) {
            this.f177l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f177l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f179n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f179n = rect2.left;
        } else {
            this.f179n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f142E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f142E = null;
        }
        l(this.f165b);
        float f2 = this.f165b;
        float f3 = f(rect2.left, rect.left, f2, this.f152P);
        RectF rectF = this.f170e;
        rectF.left = f3;
        rectF.top = f(this.f177l, this.f178m, f2, this.f152P);
        rectF.right = f(rect2.right, rect.right, f2, this.f152P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f152P);
        this.f181p = f(this.f179n, this.f180o, f2, this.f152P);
        this.f182q = f(this.f177l, this.f178m, f2, this.f152P);
        l(f2);
        C0059a c0059a = AbstractC0289a.f3499b;
        this.f164a0 = 1.0f - f(RecyclerView.f1530C0, 1.0f, 1.0f - f2, c0059a);
        WeakHashMap weakHashMap = T.f423a;
        textInputLayout.postInvalidateOnAnimation();
        this.f166b0 = f(1.0f, RecyclerView.f1530C0, f2, c0059a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f176k;
        ColorStateList colorStateList2 = this.f175j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f176k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f158V;
        float f5 = this.f159W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, c0059a));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f144H = AbstractC0289a.a(RecyclerView.f1530C0, this.f154R, f2);
        this.f145I = AbstractC0289a.a(RecyclerView.f1530C0, this.f155S, f2);
        this.f146J = AbstractC0289a.a(RecyclerView.f1530C0, this.f156T, f2);
        int a2 = a(0, e(this.f157U), f2);
        this.f147K = a2;
        textPaint.setShadowLayer(this.f144H, this.f145I, this.f146J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f176k == colorStateList && this.f175j == colorStateList) {
            return;
        }
        this.f176k = colorStateList;
        this.f175j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        G0.a aVar = this.f190y;
        if (aVar != null) {
            aVar.f237c = true;
        }
        if (this.f185t == typeface) {
            return false;
        }
        this.f185t = typeface;
        Typeface G2 = w1.l.G(this.f163a.getContext().getResources().getConfiguration(), typeface);
        this.f184s = G2;
        if (G2 == null) {
            G2 = this.f185t;
        }
        this.f183r = G2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < RecyclerView.f1530C0) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f165b) {
            this.f165b = f2;
            float f3 = this.f167c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f152P);
            RectF rectF = this.f170e;
            rectF.left = f4;
            rectF.top = f(this.f177l, this.f178m, f2, this.f152P);
            rectF.right = f(r1.right, rect.right, f2, this.f152P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f152P);
            this.f181p = f(this.f179n, this.f180o, f2, this.f152P);
            this.f182q = f(this.f177l, this.f178m, f2, this.f152P);
            l(f2);
            C0059a c0059a = AbstractC0289a.f3499b;
            this.f164a0 = 1.0f - f(RecyclerView.f1530C0, 1.0f, 1.0f - f2, c0059a);
            WeakHashMap weakHashMap = T.f423a;
            TextInputLayout textInputLayout = this.f163a;
            textInputLayout.postInvalidateOnAnimation();
            this.f166b0 = f(1.0f, RecyclerView.f1530C0, f2, c0059a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f176k;
            ColorStateList colorStateList2 = this.f175j;
            TextPaint textPaint = this.f150N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f176k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f158V;
            float f6 = this.f159W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, c0059a));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f144H = AbstractC0289a.a(RecyclerView.f1530C0, this.f154R, f2);
            this.f145I = AbstractC0289a.a(RecyclerView.f1530C0, this.f155S, f2);
            this.f146J = AbstractC0289a.a(RecyclerView.f1530C0, this.f156T, f2);
            int a2 = a(0, e(this.f157U), f2);
            this.f147K = a2;
            textPaint.setShadowLayer(this.f144H, this.f145I, this.f146J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = T.f423a;
        this.f163a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f188w != typeface) {
            this.f188w = typeface;
            Typeface G2 = w1.l.G(this.f163a.getContext().getResources().getConfiguration(), typeface);
            this.f187v = G2;
            if (G2 == null) {
                G2 = this.f188w;
            }
            this.f186u = G2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
