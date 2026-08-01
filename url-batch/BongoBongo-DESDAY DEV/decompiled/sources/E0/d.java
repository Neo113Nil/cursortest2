package E0;

import L.T;
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
import b0.C0085a;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import r0.AbstractC0292a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f143A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f144B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f145C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f147E;

    /* renamed from: F, reason: collision with root package name */
    public float f148F;
    public float G;

    /* renamed from: H, reason: collision with root package name */
    public float f149H;

    /* renamed from: I, reason: collision with root package name */
    public float f150I;

    /* renamed from: J, reason: collision with root package name */
    public float f151J;

    /* renamed from: K, reason: collision with root package name */
    public int f152K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f153L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f154M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f155N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f156O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f157P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f158Q;

    /* renamed from: R, reason: collision with root package name */
    public float f159R;

    /* renamed from: S, reason: collision with root package name */
    public float f160S;

    /* renamed from: T, reason: collision with root package name */
    public float f161T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f162U;

    /* renamed from: V, reason: collision with root package name */
    public float f163V;

    /* renamed from: W, reason: collision with root package name */
    public float f164W;

    /* renamed from: X, reason: collision with root package name */
    public float f165X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f166Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f167Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f168a;

    /* renamed from: a0, reason: collision with root package name */
    public float f169a0;

    /* renamed from: b, reason: collision with root package name */
    public float f170b;

    /* renamed from: b0, reason: collision with root package name */
    public float f171b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f172c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f173c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f175e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f181j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f182k;

    /* renamed from: l, reason: collision with root package name */
    public float f183l;

    /* renamed from: m, reason: collision with root package name */
    public float f184m;

    /* renamed from: n, reason: collision with root package name */
    public float f185n;

    /* renamed from: o, reason: collision with root package name */
    public float f186o;

    /* renamed from: p, reason: collision with root package name */
    public float f187p;

    /* renamed from: q, reason: collision with root package name */
    public float f188q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f189r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f190s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f191t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f192u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f193v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f194w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f195x;

    /* renamed from: y, reason: collision with root package name */
    public H0.a f196y;

    /* renamed from: f, reason: collision with root package name */
    public int f177f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f179g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f180h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f197z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f146D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f174d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f176e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f178f0 = 1;

    public d(TextInputLayout textInputLayout) {
        this.f168a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f155N = textPaint;
        this.f156O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f172c = new Rect();
        this.f175e = new RectF();
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
        WeakHashMap weakHashMap = T.f490a;
        boolean z2 = this.f168a.getLayoutDirection() == 1;
        if (this.f146D) {
            return (z2 ? J.h.d : J.h.f363c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f143A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f172c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f163V;
            this.f148F = 1.0f;
            typeface = this.f189r;
        } else {
            float f5 = this.f180h;
            float f6 = this.f164W;
            Typeface typeface2 = this.f192u;
            if (Math.abs(f2 - RecyclerView.A0) < 1.0E-5f) {
                this.f148F = 1.0f;
            } else {
                this.f148F = f(this.f180h, this.i, f2, this.f158Q) / this.f180h;
            }
            float f7 = this.i / this.f180h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f155N;
        if (width > RecyclerView.A0) {
            boolean z4 = this.G != f3;
            boolean z5 = this.f165X != f4;
            boolean z6 = this.f195x != typeface;
            StaticLayout staticLayout = this.f166Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f154M;
            this.G = f3;
            this.f165X = f4;
            this.f195x = typeface;
            this.f154M = false;
            textPaint.setLinearText(this.f148F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f144B == null || z3) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f195x);
            textPaint.setLetterSpacing(this.f165X);
            boolean b2 = b(this.f143A);
            this.f145C = b2;
            int i = this.f174d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f177f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f145C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f145C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f143A, textPaint, (int) width);
            iVar.f214k = this.f197z;
            iVar.f213j = b2;
            iVar.f209e = alignment;
            iVar.i = false;
            iVar.f210f = i;
            iVar.f211g = this.f176e0;
            iVar.f212h = this.f178f0;
            StaticLayout a2 = iVar.a();
            a2.getClass();
            this.f166Y = a2;
            this.f144B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f156O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f189r);
        textPaint.setLetterSpacing(this.f163V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f153L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f191t;
            if (typeface != null) {
                this.f190s = A1.d.V(configuration, typeface);
            }
            Typeface typeface2 = this.f194w;
            if (typeface2 != null) {
                this.f193v = A1.d.V(configuration, typeface2);
            }
            Typeface typeface3 = this.f190s;
            if (typeface3 == null) {
                typeface3 = this.f191t;
            }
            this.f189r = typeface3;
            Typeface typeface4 = this.f193v;
            if (typeface4 == null) {
                typeface4 = this.f194w;
            }
            this.f192u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f168a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f144B;
        TextPaint textPaint = this.f155N;
        if (charSequence != null && (staticLayout = this.f166Y) != null) {
            this.f173c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f197z);
        }
        CharSequence charSequence2 = this.f173c0;
        if (charSequence2 != null) {
            this.f167Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f167Z = RecyclerView.A0;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f179g, this.f145C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f184m = rect.top;
        } else if (i != 80) {
            this.f184m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f184m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f186o = rect.centerX() - (this.f167Z / 2.0f);
        } else if (i2 != 5) {
            this.f186o = rect.left;
        } else {
            this.f186o = rect.right - this.f167Z;
        }
        c(RecyclerView.A0, z2);
        float height = this.f166Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f166Y;
        if (staticLayout2 == null || this.f174d0 <= 1) {
            CharSequence charSequence3 = this.f144B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f166Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f177f, this.f145C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f172c;
        if (i3 == 48) {
            this.f183l = rect2.top;
        } else if (i3 != 80) {
            this.f183l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f183l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f185n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f185n = rect2.left;
        } else {
            this.f185n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f147E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f147E = null;
        }
        l(this.f170b);
        float f2 = this.f170b;
        float f3 = f(rect2.left, rect.left, f2, this.f157P);
        RectF rectF = this.f175e;
        rectF.left = f3;
        rectF.top = f(this.f183l, this.f184m, f2, this.f157P);
        rectF.right = f(rect2.right, rect.right, f2, this.f157P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f157P);
        this.f187p = f(this.f185n, this.f186o, f2, this.f157P);
        this.f188q = f(this.f183l, this.f184m, f2, this.f157P);
        l(f2);
        C0085a c0085a = AbstractC0292a.f3567b;
        this.f169a0 = 1.0f - f(RecyclerView.A0, 1.0f, 1.0f - f2, c0085a);
        WeakHashMap weakHashMap = T.f490a;
        textInputLayout.postInvalidateOnAnimation();
        this.f171b0 = f(1.0f, RecyclerView.A0, f2, c0085a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f182k;
        ColorStateList colorStateList2 = this.f181j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f182k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f163V;
        float f5 = this.f164W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, c0085a));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f149H = AbstractC0292a.a(RecyclerView.A0, this.f159R, f2);
        this.f150I = AbstractC0292a.a(RecyclerView.A0, this.f160S, f2);
        this.f151J = AbstractC0292a.a(RecyclerView.A0, this.f161T, f2);
        int a2 = a(0, e(this.f162U), f2);
        this.f152K = a2;
        textPaint.setShadowLayer(this.f149H, this.f150I, this.f151J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f182k == colorStateList && this.f181j == colorStateList) {
            return;
        }
        this.f182k = colorStateList;
        this.f181j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        H0.a aVar = this.f196y;
        if (aVar != null) {
            aVar.f298c = true;
        }
        if (this.f191t == typeface) {
            return false;
        }
        this.f191t = typeface;
        Typeface V2 = A1.d.V(this.f168a.getContext().getResources().getConfiguration(), typeface);
        this.f190s = V2;
        if (V2 == null) {
            V2 = this.f191t;
        }
        this.f189r = V2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < RecyclerView.A0) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f170b) {
            this.f170b = f2;
            float f3 = this.f172c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f157P);
            RectF rectF = this.f175e;
            rectF.left = f4;
            rectF.top = f(this.f183l, this.f184m, f2, this.f157P);
            rectF.right = f(r1.right, rect.right, f2, this.f157P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f157P);
            this.f187p = f(this.f185n, this.f186o, f2, this.f157P);
            this.f188q = f(this.f183l, this.f184m, f2, this.f157P);
            l(f2);
            C0085a c0085a = AbstractC0292a.f3567b;
            this.f169a0 = 1.0f - f(RecyclerView.A0, 1.0f, 1.0f - f2, c0085a);
            WeakHashMap weakHashMap = T.f490a;
            TextInputLayout textInputLayout = this.f168a;
            textInputLayout.postInvalidateOnAnimation();
            this.f171b0 = f(1.0f, RecyclerView.A0, f2, c0085a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f182k;
            ColorStateList colorStateList2 = this.f181j;
            TextPaint textPaint = this.f155N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f182k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f163V;
            float f6 = this.f164W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, c0085a));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f149H = AbstractC0292a.a(RecyclerView.A0, this.f159R, f2);
            this.f150I = AbstractC0292a.a(RecyclerView.A0, this.f160S, f2);
            this.f151J = AbstractC0292a.a(RecyclerView.A0, this.f161T, f2);
            int a2 = a(0, e(this.f162U), f2);
            this.f152K = a2;
            textPaint.setShadowLayer(this.f149H, this.f150I, this.f151J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = T.f490a;
        this.f168a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f194w != typeface) {
            this.f194w = typeface;
            Typeface V2 = A1.d.V(this.f168a.getContext().getResources().getConfiguration(), typeface);
            this.f193v = V2;
            if (V2 == null) {
                V2 = this.f194w;
            }
            this.f192u = V2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
