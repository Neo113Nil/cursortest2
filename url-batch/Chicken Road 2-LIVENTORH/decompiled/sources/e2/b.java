package e2;

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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
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
    public final TextInputLayout f1172a;

    /* renamed from: a0, reason: collision with root package name */
    public float f1173a0;

    /* renamed from: b, reason: collision with root package name */
    public float f1174b;

    /* renamed from: b0, reason: collision with root package name */
    public float f1175b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1176c;

    /* renamed from: c0, reason: collision with root package name */
    public float f1177c0;
    public final Rect d;
    public CharSequence d0;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f1178e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f1186j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1188k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f1189k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1190l;

    /* renamed from: m, reason: collision with root package name */
    public float f1191m;

    /* renamed from: n, reason: collision with root package name */
    public float f1192n;

    /* renamed from: o, reason: collision with root package name */
    public float f1193o;

    /* renamed from: p, reason: collision with root package name */
    public float f1194p;

    /* renamed from: q, reason: collision with root package name */
    public float f1195q;

    /* renamed from: r, reason: collision with root package name */
    public float f1196r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f1197s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f1198t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f1199u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f1200v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f1201w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f1202x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f1203y;

    /* renamed from: z, reason: collision with root package name */
    public i2.a f1204z;

    /* renamed from: f, reason: collision with root package name */
    public int f1180f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f1182g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f1184h = 15.0f;
    public float i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* renamed from: e0, reason: collision with root package name */
    public int f1179e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public int f1181f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public final float f1183g0 = 1.0f;

    /* renamed from: h0, reason: collision with root package name */
    public final int f1185h0 = 1;
    public int i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public int f1187j0 = -1;

    public b(TextInputLayout textInputLayout) {
        this.f1172a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.d = new Rect();
        this.f1176c = new Rect();
        this.f1178e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i4, float f2) {
        float f4 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i4) * f2) + (Color.alpha(i) * f4)), Math.round((Color.red(i4) * f2) + (Color.red(i) * f4)), Math.round((Color.green(i4) * f2) + (Color.green(i) * f4)), Math.round((Color.blue(i4) * f2) + (Color.blue(i) * f4)));
    }

    public static float h(float f2, float f4, float f5, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f5);
        }
        return o1.a.a(f2, f4, f5);
    }

    public final void b() {
        float f2 = this.f1174b;
        float f4 = this.f1176c.left;
        Rect rect = this.d;
        float h4 = h(f4, rect.left, f2, this.Q);
        RectF rectF = this.f1178e;
        rectF.left = h4;
        rectF.top = h(this.f1191m, this.f1192n, f2, this.Q);
        rectF.right = h(r1.right, rect.right, f2, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f2, this.Q);
        this.f1195q = h(this.f1193o, this.f1194p, f2, this.Q);
        this.f1196r = h(this.f1191m, this.f1192n, f2, this.Q);
        d(f2, false);
        TextInputLayout textInputLayout = this.f1172a;
        textInputLayout.postInvalidateOnAnimation();
        z0.a aVar = o1.a.f2865b;
        this.f1175b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f1177c0 = h(1.0f, 0.0f, f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f1188k;
        ColorStateList colorStateList2 = this.f1186j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(g(colorStateList2), g(this.f1188k), f2));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f5 = this.W;
        float f6 = this.X;
        if (f5 != f6) {
            textPaint.setLetterSpacing(h(f6, f5, f2, aVar));
        } else {
            textPaint.setLetterSpacing(f5);
        }
        this.H = o1.a.a(0.0f, this.S, f2);
        this.I = o1.a.a(0.0f, this.T, f2);
        this.J = o1.a.a(0.0f, this.U, f2);
        int a2 = a(0, g(this.V), f2);
        this.K = a2;
        textPaint.setShadowLayer(this.H, this.I, this.J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z3 = this.f1172a.getLayoutDirection() == 1;
        if (this.E) {
            return (z3 ? l0.g.d : l0.g.f2545c).b(charSequence, charSequence.length());
        }
        return z3;
    }

    public final void d(float f2, boolean z3) {
        float f4;
        Typeface typeface;
        float f5;
        if (this.B == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f1176c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f4 = o() ? this.i : this.f1184h;
            f5 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.f1184h, this.i, f2, this.R) / this.f1184h;
            if (!o()) {
                width = width2;
            }
            typeface = this.f1197s;
            width2 = width;
        } else {
            f4 = this.f1184h;
            float f6 = this.X;
            typeface = this.f1200v;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f1184h, this.i, f2, this.R) / this.f1184h;
            }
            float f7 = this.i / this.f1184h;
            float f8 = width2 * f7;
            if (!z3 && f8 > width && o()) {
                width2 = Math.min(width / f7, width2);
            }
            f5 = f6;
        }
        int i = f2 < 0.5f ? this.f1179e0 : this.f1181f0;
        TextPaint textPaint = this.O;
        if (width2 > 0.0f) {
            boolean z4 = this.G != f4;
            boolean z5 = this.Y != f5;
            boolean z6 = this.f1203y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z7 = z4 || z5 || (staticLayout != null && (width2 > ((float) staticLayout.getWidth()) ? 1 : (width2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || (this.L != i) || this.N;
            this.G = f4;
            this.Y = f5;
            this.f1203y = typeface;
            this.N = false;
            this.L = i;
            textPaint.setLinearText(this.F != 1.0f);
            r7 = z7;
        }
        if (this.C == null || r7) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f1203y);
            textPaint.setLetterSpacing(this.Y);
            boolean c4 = c(this.B);
            this.D = c4;
            StaticLayout e4 = e(((this.f1179e0 > 1 || this.f1181f0 > 1) && !c4) ? i : 1, textPaint, this.B, width2 * (o() ? 1.0f : this.F), this.D);
            this.Z = e4;
            this.C = e4.getText();
        }
    }

    public final StaticLayout e(int i, TextPaint textPaint, CharSequence charSequence, float f2, boolean z3) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f1180f, this.D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        h hVar = new h(charSequence, textPaint, (int) f2);
        hVar.f1222l = this.A;
        hVar.f1221k = z3;
        hVar.f1216e = alignment;
        hVar.f1220j = false;
        hVar.f1217f = i;
        float f4 = this.f1183g0;
        hVar.f1218g = 0.0f;
        hVar.f1219h = f4;
        hVar.i = this.f1185h0;
        hVar.f1223m = null;
        StaticLayout a2 = hVar.a();
        a2.getClass();
        return a2;
    }

    public final float f() {
        int i = this.i0;
        if (i != -1) {
            return i;
        }
        float f2 = this.i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f2);
        textPaint.setTypeface(this.f1197s);
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
            Typeface typeface = this.f1199u;
            if (typeface != null) {
                this.f1198t = h.a.S(configuration, typeface);
            }
            Typeface typeface2 = this.f1202x;
            if (typeface2 != null) {
                this.f1201w = h.a.S(configuration, typeface2);
            }
            Typeface typeface3 = this.f1198t;
            if (typeface3 == null) {
                typeface3 = this.f1199u;
            }
            this.f1197s = typeface3;
            Typeface typeface4 = this.f1201w;
            if (typeface4 == null) {
                typeface4 = this.f1202x;
            }
            this.f1200v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z3) {
        float measureText;
        TextInputLayout textInputLayout = this.f1172a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z3) {
            return;
        }
        d(1.0f, z3);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.d0;
        if (charSequence2 != null) {
            this.f1173a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f1173a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f1182g, this.D ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f1192n = rect.top;
        } else if (i != 80) {
            this.f1192n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f1192n = textPaint.ascent() + rect.bottom;
        }
        int i4 = absoluteGravity & 8388615;
        if (i4 == 1) {
            this.f1194p = rect.centerX() - (this.f1173a0 / 2.0f);
        } else if (i4 != 5) {
            this.f1194p = rect.left;
        } else {
            this.f1194p = rect.right - this.f1173a0;
        }
        if (this.f1173a0 <= rect.width()) {
            float f2 = this.f1194p;
            float max = Math.max(0.0f, rect.left - f2) + f2;
            this.f1194p = max;
            this.f1194p = Math.min(0.0f, rect.right - (this.f1173a0 + max)) + max;
        }
        float f4 = this.i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f4);
        textPaint2.setTypeface(this.f1197s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f5 = this.f1192n;
            float max2 = Math.max(0.0f, rect.top - f5) + f5;
            this.f1192n = max2;
            this.f1192n = Math.min(0.0f, rect.bottom - (f() + max2)) + max2;
        }
        d(0.0f, z3);
        float height = this.Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.Z;
        if (staticLayout == null || this.f1179e0 <= 1) {
            CharSequence charSequence3 = this.C;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.Z;
        this.f1190l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f1180f, this.D ? 1 : 0);
        int i5 = absoluteGravity2 & 112;
        Rect rect2 = this.f1176c;
        if (i5 == 48) {
            this.f1191m = rect2.top;
        } else if (i5 != 80) {
            this.f1191m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f1191m = (rect2.bottom - height) + (this.f1189k0 ? textPaint.descent() : 0.0f);
        }
        int i6 = absoluteGravity2 & 8388615;
        if (i6 == 1) {
            this.f1193o = rect2.centerX() - (measureText / 2.0f);
        } else if (i6 != 5) {
            this.f1193o = rect2.left;
        } else {
            this.f1193o = rect2.right - measureText;
        }
        d(this.f1174b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f1188k == colorStateList && this.f1186j == colorStateList) {
            return;
        }
        this.f1188k = colorStateList;
        this.f1186j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        i2.a aVar = this.f1204z;
        if (aVar != null) {
            aVar.f1811m = true;
        }
        if (this.f1199u == typeface) {
            return false;
        }
        this.f1199u = typeface;
        Typeface S = h.a.S(this.f1172a.getContext().getResources().getConfiguration(), typeface);
        this.f1198t = S;
        if (S == null) {
            S = this.f1199u;
        }
        this.f1197s = S;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000b, code lost:
    
        if (r3 > 1.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(float f2) {
        float f4 = f2 >= 0.0f ? 1.0f : 0.0f;
        f2 = f4;
        if (f2 != this.f1174b) {
            this.f1174b = f2;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z3;
        boolean l4 = l(typeface);
        if (this.f1202x != typeface) {
            this.f1202x = typeface;
            Typeface S = h.a.S(this.f1172a.getContext().getResources().getConfiguration(), typeface);
            this.f1201w = S;
            if (S == null) {
                S = this.f1202x;
            }
            this.f1200v = S;
            z3 = true;
        } else {
            z3 = false;
        }
        if (l4 || z3) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f1181f0 == 1;
    }
}
