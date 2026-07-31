package r5;

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
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {
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
    public final TextInputLayout f6615a;

    /* renamed from: a0, reason: collision with root package name */
    public float f6616a0;

    /* renamed from: b, reason: collision with root package name */
    public float f6617b;

    /* renamed from: b0, reason: collision with root package name */
    public float f6618b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f6619c;

    /* renamed from: c0, reason: collision with root package name */
    public float f6620c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f6621d;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f6622d0;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f6623e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f6632j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f6634k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f6635k0;

    /* renamed from: l, reason: collision with root package name */
    public int f6636l;

    /* renamed from: m, reason: collision with root package name */
    public float f6637m;

    /* renamed from: n, reason: collision with root package name */
    public float f6638n;

    /* renamed from: o, reason: collision with root package name */
    public float f6639o;

    /* renamed from: p, reason: collision with root package name */
    public float f6640p;

    /* renamed from: q, reason: collision with root package name */
    public float f6641q;

    /* renamed from: r, reason: collision with root package name */
    public float f6642r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f6643s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f6644t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f6645u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f6646v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f6647w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f6648x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f6649y;

    /* renamed from: z, reason: collision with root package name */
    public t5.a f6650z;

    /* renamed from: f, reason: collision with root package name */
    public int f6625f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f6627g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f6629h = 15.0f;
    public float i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* renamed from: e0, reason: collision with root package name */
    public int f6624e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public int f6626f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public final float f6628g0 = 1.0f;

    /* renamed from: h0, reason: collision with root package name */
    public final int f6630h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public int f6631i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public int f6633j0 = -1;

    public b(TextInputLayout textInputLayout) {
        this.f6615a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f6621d = new Rect();
        this.f6619c = new Rect();
        this.f6623e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f6, int i, int i8) {
        float f8 = 1.0f - f6;
        return Color.argb(Math.round((Color.alpha(i8) * f6) + (Color.alpha(i) * f8)), Math.round((Color.red(i8) * f6) + (Color.red(i) * f8)), Math.round((Color.green(i8) * f6) + (Color.green(i) * f8)), Math.round((Color.blue(i8) * f6) + (Color.blue(i) * f8)));
    }

    public static float h(float f6, float f8, float f9, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f9 = timeInterpolator.getInterpolation(f9);
        }
        return g5.a.a(f6, f8, f9);
    }

    public final void b() {
        float f6 = this.f6617b;
        float f8 = this.f6619c.left;
        Rect rect = this.f6621d;
        float h8 = h(f8, rect.left, f6, this.Q);
        RectF rectF = this.f6623e;
        rectF.left = h8;
        rectF.top = h(this.f6637m, this.f6638n, f6, this.Q);
        rectF.right = h(r1.right, rect.right, f6, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f6, this.Q);
        this.f6641q = h(this.f6639o, this.f6640p, f6, this.Q);
        this.f6642r = h(this.f6637m, this.f6638n, f6, this.Q);
        d(f6, false);
        TextInputLayout textInputLayout = this.f6615a;
        textInputLayout.postInvalidateOnAnimation();
        i4.a aVar = g5.a.f3032b;
        this.f6618b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f6, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f6620c0 = h(1.0f, 0.0f, f6, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f6634k;
        ColorStateList colorStateList2 = this.f6632j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f6, g(colorStateList2), g(this.f6634k)));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f9 = this.W;
        float f10 = this.X;
        if (f9 != f10) {
            textPaint.setLetterSpacing(h(f10, f9, f6, aVar));
        } else {
            textPaint.setLetterSpacing(f9);
        }
        this.H = g5.a.a(0.0f, this.S, f6);
        this.I = g5.a.a(0.0f, this.T, f6);
        this.J = g5.a.a(0.0f, this.U, f6);
        int a8 = a(f6, 0, g(this.V));
        this.K = a8;
        textPaint.setShadowLayer(this.H, this.I, this.J, a8);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z3 = this.f6615a.getLayoutDirection() == 1;
        if (this.E) {
            return (z3 ? o3.f.f5617d : o3.f.f5616c).b(charSequence.length(), charSequence);
        }
        return z3;
    }

    public final void d(float f6, boolean z3) {
        float f8;
        Typeface typeface;
        float f9;
        if (this.B == null) {
            return;
        }
        float width = this.f6621d.width();
        float width2 = this.f6619c.width();
        if (Math.abs(f6 - 1.0f) < 1.0E-5f) {
            f8 = o() ? this.i : this.f6629h;
            f9 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.f6629h, this.i, f6, this.R) / this.f6629h;
            if (!o()) {
                width = width2;
            }
            typeface = this.f6643s;
            width2 = width;
        } else {
            f8 = this.f6629h;
            float f10 = this.X;
            typeface = this.f6646v;
            if (Math.abs(f6 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f6629h, this.i, f6, this.R) / this.f6629h;
            }
            float f11 = this.i / this.f6629h;
            float f12 = width2 * f11;
            if (!z3 && f12 > width && o()) {
                width2 = Math.min(width / f11, width2);
            }
            f9 = f10;
        }
        int i = f6 < 0.5f ? this.f6624e0 : this.f6626f0;
        TextPaint textPaint = this.O;
        if (width2 > 0.0f) {
            boolean z7 = this.G != f8;
            boolean z8 = this.Y != f9;
            boolean z9 = this.f6649y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z10 = z7 || z8 || (staticLayout != null && (width2 > ((float) staticLayout.getWidth()) ? 1 : (width2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z9 || (this.L != i) || this.N;
            this.G = f8;
            this.Y = f9;
            this.f6649y = typeface;
            this.N = false;
            this.L = i;
            textPaint.setLinearText(this.F != 1.0f);
            r7 = z10;
        }
        if (this.C == null || r7) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f6649y);
            textPaint.setLetterSpacing(this.Y);
            boolean c8 = c(this.B);
            this.D = c8;
            StaticLayout e8 = e(((this.f6624e0 > 1 || this.f6626f0 > 1) && !c8) ? i : 1, textPaint, this.B, width2 * (o() ? 1.0f : this.F), this.D);
            this.Z = e8;
            this.C = e8.getText();
        }
    }

    public final StaticLayout e(int i, TextPaint textPaint, CharSequence charSequence, float f6, boolean z3) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f6625f, this.D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        g gVar = new g(charSequence, textPaint, (int) f6);
        gVar.f6669l = this.A;
        gVar.f6668k = z3;
        gVar.f6663e = alignment;
        gVar.f6667j = false;
        gVar.f6664f = i;
        float f8 = this.f6628g0;
        gVar.f6665g = 0.0f;
        gVar.f6666h = f8;
        gVar.i = this.f6630h0;
        gVar.f6670m = null;
        StaticLayout a8 = gVar.a();
        a8.getClass();
        return a8;
    }

    public final float f() {
        int i = this.f6631i0;
        if (i != -1) {
            return i;
        }
        float f6 = this.i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f6);
        textPaint.setTypeface(this.f6643s);
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
            Typeface typeface = this.f6645u;
            if (typeface != null) {
                this.f6644t = o.b0(configuration, typeface);
            }
            Typeface typeface2 = this.f6648x;
            if (typeface2 != null) {
                this.f6647w = o.b0(configuration, typeface2);
            }
            Typeface typeface3 = this.f6644t;
            if (typeface3 == null) {
                typeface3 = this.f6645u;
            }
            this.f6643s = typeface3;
            Typeface typeface4 = this.f6647w;
            if (typeface4 == null) {
                typeface4 = this.f6648x;
            }
            this.f6646v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z3) {
        float measureText;
        TextInputLayout textInputLayout = this.f6615a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z3) {
            return;
        }
        d(1.0f, z3);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.f6622d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.f6622d0;
        if (charSequence2 != null) {
            this.f6616a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f6616a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f6627g, this.D ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f6621d;
        if (i == 48) {
            this.f6638n = rect.top;
        } else if (i != 80) {
            this.f6638n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f6638n = textPaint.ascent() + rect.bottom;
        }
        int i8 = absoluteGravity & 8388615;
        if (i8 == 1) {
            this.f6640p = rect.centerX() - (this.f6616a0 / 2.0f);
        } else if (i8 != 5) {
            this.f6640p = rect.left;
        } else {
            this.f6640p = rect.right - this.f6616a0;
        }
        if (this.f6616a0 <= rect.width()) {
            float f6 = this.f6640p;
            float max = Math.max(0.0f, rect.left - f6) + f6;
            this.f6640p = max;
            this.f6640p = Math.min(0.0f, rect.right - (this.f6616a0 + max)) + max;
        }
        float f8 = this.i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f8);
        textPaint2.setTypeface(this.f6643s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f9 = this.f6638n;
            float max2 = Math.max(0.0f, rect.top - f9) + f9;
            this.f6638n = max2;
            this.f6638n = Math.min(0.0f, rect.bottom - (f() + max2)) + max2;
        }
        d(0.0f, z3);
        float height = this.Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.Z;
        if (staticLayout == null || this.f6624e0 <= 1) {
            CharSequence charSequence3 = this.C;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.Z;
        this.f6636l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f6625f, this.D ? 1 : 0);
        int i9 = absoluteGravity2 & 112;
        Rect rect2 = this.f6619c;
        if (i9 == 48) {
            this.f6637m = rect2.top;
        } else if (i9 != 80) {
            this.f6637m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f6637m = (rect2.bottom - height) + (this.f6635k0 ? textPaint.descent() : 0.0f);
        }
        int i10 = absoluteGravity2 & 8388615;
        if (i10 == 1) {
            this.f6639o = rect2.centerX() - (measureText / 2.0f);
        } else if (i10 != 5) {
            this.f6639o = rect2.left;
        } else {
            this.f6639o = rect2.right - measureText;
        }
        d(this.f6617b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f6634k == colorStateList && this.f6632j == colorStateList) {
            return;
        }
        this.f6634k = colorStateList;
        this.f6632j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        t5.a aVar = this.f6650z;
        if (aVar != null) {
            aVar.f6900c = true;
        }
        if (this.f6645u == typeface) {
            return false;
        }
        this.f6645u = typeface;
        Typeface b02 = o.b0(this.f6615a.getContext().getResources().getConfiguration(), typeface);
        this.f6644t = b02;
        if (b02 == null) {
            b02 = this.f6645u;
        }
        this.f6643s = b02;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000b, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(float f6) {
        float f8 = f6 >= 0.0f ? 1.0f : 0.0f;
        f6 = f8;
        if (f6 != this.f6617b) {
            this.f6617b = f6;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z3;
        boolean l3 = l(typeface);
        if (this.f6648x != typeface) {
            this.f6648x = typeface;
            Typeface b02 = o.b0(this.f6615a.getContext().getResources().getConfiguration(), typeface);
            this.f6647w = b02;
            if (b02 == null) {
                b02 = this.f6648x;
            }
            this.f6646v = b02;
            z3 = true;
        } else {
            z3 = false;
        }
        if (l3 || z3) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f6626f0 == 1;
    }
}
