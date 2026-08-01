package L0;

import K.Q;
import a0.C0057a;
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
import y0.AbstractC0395a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f700A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f701B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f702C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f704E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f705G;

    /* renamed from: H, reason: collision with root package name */
    public float f706H;

    /* renamed from: I, reason: collision with root package name */
    public float f707I;

    /* renamed from: J, reason: collision with root package name */
    public float f708J;

    /* renamed from: K, reason: collision with root package name */
    public int f709K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f710L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f711M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f712N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f713O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f714P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f715Q;

    /* renamed from: R, reason: collision with root package name */
    public float f716R;

    /* renamed from: S, reason: collision with root package name */
    public float f717S;

    /* renamed from: T, reason: collision with root package name */
    public float f718T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f719U;

    /* renamed from: V, reason: collision with root package name */
    public float f720V;

    /* renamed from: W, reason: collision with root package name */
    public float f721W;

    /* renamed from: X, reason: collision with root package name */
    public float f722X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f723Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f724Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f725a;

    /* renamed from: a0, reason: collision with root package name */
    public float f726a0;

    /* renamed from: b, reason: collision with root package name */
    public float f727b;

    /* renamed from: b0, reason: collision with root package name */
    public float f728b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f729c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f730c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f732e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f737j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f738k;

    /* renamed from: l, reason: collision with root package name */
    public float f739l;

    /* renamed from: m, reason: collision with root package name */
    public float f740m;

    /* renamed from: n, reason: collision with root package name */
    public float f741n;

    /* renamed from: o, reason: collision with root package name */
    public float f742o;

    /* renamed from: p, reason: collision with root package name */
    public float f743p;

    /* renamed from: q, reason: collision with root package name */
    public float f744q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f745r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f746s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f747t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f748u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f749v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f750w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f751x;

    /* renamed from: y, reason: collision with root package name */
    public O0.a f752y;

    /* renamed from: f, reason: collision with root package name */
    public int f734f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f736g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f753z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f703D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f731d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f733e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f735f0 = 1;

    public b(TextInputLayout textInputLayout) {
        this.f725a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f712N = textPaint;
        this.f713O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f729c = new Rect();
        this.f732e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f2, int i, int i2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i2) * f2) + (Color.alpha(i) * f3)), Math.round((Color.red(i2) * f2) + (Color.red(i) * f3)), Math.round((Color.green(i2) * f2) + (Color.green(i) * f3)), Math.round((Color.blue(i2) * f2) + (Color.blue(i) * f3)));
    }

    public static float f(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return AbstractC0395a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = Q.f578a;
        boolean z2 = this.f725a.getLayoutDirection() == 1;
        if (this.f703D) {
            return (z2 ? I.h.d : I.h.f541c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f700A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f729c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f720V;
            this.F = 1.0f;
            typeface = this.f745r;
        } else {
            float f5 = this.h;
            float f6 = this.f721W;
            Typeface typeface2 = this.f748u;
            if (Math.abs(f2 - RecyclerView.f1937A0) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f715Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f712N;
        if (width > RecyclerView.f1937A0) {
            boolean z4 = this.f705G != f3;
            boolean z5 = this.f722X != f4;
            boolean z6 = this.f751x != typeface;
            StaticLayout staticLayout = this.f723Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f711M;
            this.f705G = f3;
            this.f722X = f4;
            this.f751x = typeface;
            this.f711M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f701B == null || z3) {
            textPaint.setTextSize(this.f705G);
            textPaint.setTypeface(this.f751x);
            textPaint.setLetterSpacing(this.f722X);
            boolean b2 = b(this.f700A);
            this.f702C = b2;
            int i = this.f731d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f734f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f702C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f702C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            g gVar = new g(this.f700A, textPaint, (int) width);
            gVar.f769k = this.f753z;
            gVar.f768j = b2;
            gVar.f765e = alignment;
            gVar.i = false;
            gVar.f766f = i;
            gVar.f767g = this.f733e0;
            gVar.h = this.f735f0;
            StaticLayout a2 = gVar.a();
            a2.getClass();
            this.f723Y = a2;
            this.f701B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f713O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f745r);
        textPaint.setLetterSpacing(this.f720V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f710L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f747t;
            if (typeface != null) {
                this.f746s = H1.l.S(configuration, typeface);
            }
            Typeface typeface2 = this.f750w;
            if (typeface2 != null) {
                this.f749v = H1.l.S(configuration, typeface2);
            }
            Typeface typeface3 = this.f746s;
            if (typeface3 == null) {
                typeface3 = this.f747t;
            }
            this.f745r = typeface3;
            Typeface typeface4 = this.f749v;
            if (typeface4 == null) {
                typeface4 = this.f750w;
            }
            this.f748u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f725a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f701B;
        TextPaint textPaint = this.f712N;
        if (charSequence != null && (staticLayout = this.f723Y) != null) {
            this.f730c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f753z);
        }
        CharSequence charSequence2 = this.f730c0;
        if (charSequence2 != null) {
            this.f724Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f724Z = RecyclerView.f1937A0;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f736g, this.f702C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f740m = rect.top;
        } else if (i != 80) {
            this.f740m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f740m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f742o = rect.centerX() - (this.f724Z / 2.0f);
        } else if (i2 != 5) {
            this.f742o = rect.left;
        } else {
            this.f742o = rect.right - this.f724Z;
        }
        c(RecyclerView.f1937A0, z2);
        float height = this.f723Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f723Y;
        if (staticLayout2 == null || this.f731d0 <= 1) {
            CharSequence charSequence3 = this.f701B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f723Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f734f, this.f702C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f729c;
        if (i3 == 48) {
            this.f739l = rect2.top;
        } else if (i3 != 80) {
            this.f739l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f739l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f741n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f741n = rect2.left;
        } else {
            this.f741n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f704E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f704E = null;
        }
        l(this.f727b);
        float f2 = this.f727b;
        float f3 = f(rect2.left, rect.left, f2, this.f714P);
        RectF rectF = this.f732e;
        rectF.left = f3;
        rectF.top = f(this.f739l, this.f740m, f2, this.f714P);
        rectF.right = f(rect2.right, rect.right, f2, this.f714P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f714P);
        this.f743p = f(this.f741n, this.f742o, f2, this.f714P);
        this.f744q = f(this.f739l, this.f740m, f2, this.f714P);
        l(f2);
        C0057a c0057a = AbstractC0395a.f4571b;
        this.f726a0 = 1.0f - f(RecyclerView.f1937A0, 1.0f, 1.0f - f2, c0057a);
        WeakHashMap weakHashMap = Q.f578a;
        textInputLayout.postInvalidateOnAnimation();
        this.f728b0 = f(1.0f, RecyclerView.f1937A0, f2, c0057a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f738k;
        ColorStateList colorStateList2 = this.f737j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f2, e(colorStateList2), e(this.f738k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f720V;
        float f5 = this.f721W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, c0057a));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f706H = AbstractC0395a.a(RecyclerView.f1937A0, this.f716R, f2);
        this.f707I = AbstractC0395a.a(RecyclerView.f1937A0, this.f717S, f2);
        this.f708J = AbstractC0395a.a(RecyclerView.f1937A0, this.f718T, f2);
        int a2 = a(f2, 0, e(this.f719U));
        this.f709K = a2;
        textPaint.setShadowLayer(this.f706H, this.f707I, this.f708J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f738k == colorStateList && this.f737j == colorStateList) {
            return;
        }
        this.f738k = colorStateList;
        this.f737j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        O0.a aVar = this.f752y;
        if (aVar != null) {
            aVar.f842g = true;
        }
        if (this.f747t == typeface) {
            return false;
        }
        this.f747t = typeface;
        Typeface S2 = H1.l.S(this.f725a.getContext().getResources().getConfiguration(), typeface);
        this.f746s = S2;
        if (S2 == null) {
            S2 = this.f747t;
        }
        this.f745r = S2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < RecyclerView.f1937A0) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f727b) {
            this.f727b = f2;
            float f3 = this.f729c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f714P);
            RectF rectF = this.f732e;
            rectF.left = f4;
            rectF.top = f(this.f739l, this.f740m, f2, this.f714P);
            rectF.right = f(r1.right, rect.right, f2, this.f714P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f714P);
            this.f743p = f(this.f741n, this.f742o, f2, this.f714P);
            this.f744q = f(this.f739l, this.f740m, f2, this.f714P);
            l(f2);
            C0057a c0057a = AbstractC0395a.f4571b;
            this.f726a0 = 1.0f - f(RecyclerView.f1937A0, 1.0f, 1.0f - f2, c0057a);
            WeakHashMap weakHashMap = Q.f578a;
            TextInputLayout textInputLayout = this.f725a;
            textInputLayout.postInvalidateOnAnimation();
            this.f728b0 = f(1.0f, RecyclerView.f1937A0, f2, c0057a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f738k;
            ColorStateList colorStateList2 = this.f737j;
            TextPaint textPaint = this.f712N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f2, e(colorStateList2), e(this.f738k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f720V;
            float f6 = this.f721W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, c0057a));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f706H = AbstractC0395a.a(RecyclerView.f1937A0, this.f716R, f2);
            this.f707I = AbstractC0395a.a(RecyclerView.f1937A0, this.f717S, f2);
            this.f708J = AbstractC0395a.a(RecyclerView.f1937A0, this.f718T, f2);
            int a2 = a(f2, 0, e(this.f719U));
            this.f709K = a2;
            textPaint.setShadowLayer(this.f706H, this.f707I, this.f708J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = Q.f578a;
        this.f725a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f750w != typeface) {
            this.f750w = typeface;
            Typeface S2 = H1.l.S(this.f725a.getContext().getResources().getConfiguration(), typeface);
            this.f749v = S2;
            if (S2 == null) {
                S2 = this.f750w;
            }
            this.f748u = S2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
