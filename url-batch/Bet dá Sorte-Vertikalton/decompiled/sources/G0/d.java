package G0;

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
import t0.AbstractC0299a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f182A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f183B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f184C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f186E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f187G;

    /* renamed from: H, reason: collision with root package name */
    public float f188H;

    /* renamed from: I, reason: collision with root package name */
    public float f189I;

    /* renamed from: J, reason: collision with root package name */
    public float f190J;

    /* renamed from: K, reason: collision with root package name */
    public int f191K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f192L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f193M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f194N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f195O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f196P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f197Q;

    /* renamed from: R, reason: collision with root package name */
    public float f198R;

    /* renamed from: S, reason: collision with root package name */
    public float f199S;

    /* renamed from: T, reason: collision with root package name */
    public float f200T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f201U;

    /* renamed from: V, reason: collision with root package name */
    public float f202V;

    /* renamed from: W, reason: collision with root package name */
    public float f203W;

    /* renamed from: X, reason: collision with root package name */
    public float f204X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f205Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f206Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f207a;

    /* renamed from: a0, reason: collision with root package name */
    public float f208a0;

    /* renamed from: b, reason: collision with root package name */
    public float f209b;

    /* renamed from: b0, reason: collision with root package name */
    public float f210b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f211c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f212c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f214e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f219j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f220k;

    /* renamed from: l, reason: collision with root package name */
    public float f221l;

    /* renamed from: m, reason: collision with root package name */
    public float f222m;

    /* renamed from: n, reason: collision with root package name */
    public float f223n;

    /* renamed from: o, reason: collision with root package name */
    public float f224o;

    /* renamed from: p, reason: collision with root package name */
    public float f225p;

    /* renamed from: q, reason: collision with root package name */
    public float f226q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f227r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f228s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f229t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f230u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f231v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f232w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f233x;

    /* renamed from: y, reason: collision with root package name */
    public J0.a f234y;

    /* renamed from: f, reason: collision with root package name */
    public int f216f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f218g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f235z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f185D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f213d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f215e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f217f0 = 1;

    public d(TextInputLayout textInputLayout) {
        this.f207a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f194N = textPaint;
        this.f195O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f211c = new Rect();
        this.f214e = new RectF();
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
        return AbstractC0299a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f351a;
        boolean z2 = this.f207a.getLayoutDirection() == 1;
        if (this.f185D) {
            return (z2 ? I.i.d : I.i.f315c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f182A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f211c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f202V;
            this.F = 1.0f;
            typeface = this.f227r;
        } else {
            float f5 = this.h;
            float f6 = this.f203W;
            Typeface typeface2 = this.f230u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f197Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f194N;
        if (width > 0.0f) {
            boolean z4 = this.f187G != f3;
            boolean z5 = this.f204X != f4;
            boolean z6 = this.f233x != typeface;
            StaticLayout staticLayout = this.f205Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f193M;
            this.f187G = f3;
            this.f204X = f4;
            this.f233x = typeface;
            this.f193M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f183B == null || z3) {
            textPaint.setTextSize(this.f187G);
            textPaint.setTypeface(this.f233x);
            textPaint.setLetterSpacing(this.f204X);
            boolean b2 = b(this.f182A);
            this.f184C = b2;
            int i = this.f213d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f216f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f184C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f184C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f182A, textPaint, (int) width);
            iVar.f251k = this.f235z;
            iVar.f250j = b2;
            iVar.f247e = alignment;
            iVar.i = false;
            iVar.f248f = i;
            iVar.f249g = this.f215e0;
            iVar.h = this.f217f0;
            StaticLayout a2 = iVar.a();
            a2.getClass();
            this.f205Y = a2;
            this.f183B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f195O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f227r);
        textPaint.setLetterSpacing(this.f202V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f192L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f229t;
            if (typeface != null) {
                this.f228s = u1.d.Q(configuration, typeface);
            }
            Typeface typeface2 = this.f232w;
            if (typeface2 != null) {
                this.f231v = u1.d.Q(configuration, typeface2);
            }
            Typeface typeface3 = this.f228s;
            if (typeface3 == null) {
                typeface3 = this.f229t;
            }
            this.f227r = typeface3;
            Typeface typeface4 = this.f231v;
            if (typeface4 == null) {
                typeface4 = this.f232w;
            }
            this.f230u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f207a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f183B;
        TextPaint textPaint = this.f194N;
        if (charSequence != null && (staticLayout = this.f205Y) != null) {
            this.f212c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f235z);
        }
        CharSequence charSequence2 = this.f212c0;
        if (charSequence2 != null) {
            this.f206Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f206Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f218g, this.f184C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f222m = rect.top;
        } else if (i != 80) {
            this.f222m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f222m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f224o = rect.centerX() - (this.f206Z / 2.0f);
        } else if (i2 != 5) {
            this.f224o = rect.left;
        } else {
            this.f224o = rect.right - this.f206Z;
        }
        c(0.0f, z2);
        float height = this.f205Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f205Y;
        if (staticLayout2 == null || this.f213d0 <= 1) {
            CharSequence charSequence3 = this.f183B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f205Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f216f, this.f184C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f211c;
        if (i3 == 48) {
            this.f221l = rect2.top;
        } else if (i3 != 80) {
            this.f221l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f221l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f223n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f223n = rect2.left;
        } else {
            this.f223n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f186E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f186E = null;
        }
        l(this.f209b);
        float f2 = this.f209b;
        float f3 = f(rect2.left, rect.left, f2, this.f196P);
        RectF rectF = this.f214e;
        rectF.left = f3;
        rectF.top = f(this.f221l, this.f222m, f2, this.f196P);
        rectF.right = f(rect2.right, rect.right, f2, this.f196P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f196P);
        this.f225p = f(this.f223n, this.f224o, f2, this.f196P);
        this.f226q = f(this.f221l, this.f222m, f2, this.f196P);
        l(f2);
        Z.a aVar = AbstractC0299a.f3823b;
        this.f208a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
        WeakHashMap weakHashMap = S.f351a;
        textInputLayout.postInvalidateOnAnimation();
        this.f210b0 = f(1.0f, 0.0f, f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f220k;
        ColorStateList colorStateList2 = this.f219j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f220k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f202V;
        float f5 = this.f203W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, aVar));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f188H = AbstractC0299a.a(0.0f, this.f198R, f2);
        this.f189I = AbstractC0299a.a(0.0f, this.f199S, f2);
        this.f190J = AbstractC0299a.a(0.0f, this.f200T, f2);
        int a2 = a(0, e(this.f201U), f2);
        this.f191K = a2;
        textPaint.setShadowLayer(this.f188H, this.f189I, this.f190J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f220k == colorStateList && this.f219j == colorStateList) {
            return;
        }
        this.f220k = colorStateList;
        this.f219j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        J0.a aVar = this.f234y;
        if (aVar != null) {
            aVar.f324g = true;
        }
        if (this.f229t == typeface) {
            return false;
        }
        this.f229t = typeface;
        Typeface Q2 = u1.d.Q(this.f207a.getContext().getResources().getConfiguration(), typeface);
        this.f228s = Q2;
        if (Q2 == null) {
            Q2 = this.f229t;
        }
        this.f227r = Q2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f209b) {
            this.f209b = f2;
            float f3 = this.f211c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f196P);
            RectF rectF = this.f214e;
            rectF.left = f4;
            rectF.top = f(this.f221l, this.f222m, f2, this.f196P);
            rectF.right = f(r1.right, rect.right, f2, this.f196P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f196P);
            this.f225p = f(this.f223n, this.f224o, f2, this.f196P);
            this.f226q = f(this.f221l, this.f222m, f2, this.f196P);
            l(f2);
            Z.a aVar = AbstractC0299a.f3823b;
            this.f208a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
            WeakHashMap weakHashMap = S.f351a;
            TextInputLayout textInputLayout = this.f207a;
            textInputLayout.postInvalidateOnAnimation();
            this.f210b0 = f(1.0f, 0.0f, f2, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f220k;
            ColorStateList colorStateList2 = this.f219j;
            TextPaint textPaint = this.f194N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f220k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f202V;
            float f6 = this.f203W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, aVar));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f188H = AbstractC0299a.a(0.0f, this.f198R, f2);
            this.f189I = AbstractC0299a.a(0.0f, this.f199S, f2);
            this.f190J = AbstractC0299a.a(0.0f, this.f200T, f2);
            int a2 = a(0, e(this.f201U), f2);
            this.f191K = a2;
            textPaint.setShadowLayer(this.f188H, this.f189I, this.f190J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = S.f351a;
        this.f207a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f232w != typeface) {
            this.f232w = typeface;
            Typeface Q2 = u1.d.Q(this.f207a.getContext().getResources().getConfiguration(), typeface);
            this.f231v = Q2;
            if (Q2 == null) {
                Q2 = this.f232w;
            }
            this.f230u = Q2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
