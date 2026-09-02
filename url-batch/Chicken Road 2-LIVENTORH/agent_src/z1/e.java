package z1;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import e2.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l2.g;
import l2.h;
import l2.j;
import l2.m;
import l2.n;
import l2.p;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e extends j implements Drawable.Callback, e2.j {
    public static final int[] T0 = {R.attr.state_enabled};
    public static final ShapeDrawable U0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public boolean F0;
    public int G0;
    public int H0;
    public ColorFilter I0;
    public PorterDuffColorFilter J0;
    public ColorStateList K0;
    public ColorStateList L;
    public PorterDuff.Mode L0;
    public ColorStateList M;
    public int[] M0;
    public float N;
    public ColorStateList N0;
    public float O;
    public WeakReference O0;
    public ColorStateList P;
    public TextUtils.TruncateAt P0;
    public float Q;
    public boolean Q0;
    public ColorStateList R;
    public int R0;
    public CharSequence S;
    public boolean S0;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public float W;
    public boolean X;
    public boolean Y;
    public Drawable Z;

    /* renamed from: a0, reason: collision with root package name */
    public RippleDrawable f3855a0;

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f3856b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f3857c0;
    public SpannableStringBuilder d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3858e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3859f0;

    /* renamed from: g0, reason: collision with root package name */
    public Drawable f3860g0;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f3861h0;
    public o1.b i0;

    /* renamed from: j0, reason: collision with root package name */
    public o1.b f3862j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f3863k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f3864l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f3865m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f3866n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f3867o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f3868p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f3869q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f3870r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Context f3871s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Paint f3872t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Paint.FontMetrics f3873u0;

    /* renamed from: v0, reason: collision with root package name */
    public final RectF f3874v0;

    /* renamed from: w0, reason: collision with root package name */
    public final PointF f3875w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Path f3876x0;

    /* renamed from: y0, reason: collision with root package name */
    public final k f3877y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3878z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.oriondriftchasers.arordrft.R.attr.chipStyle, com.oriondriftchasers.arordrft.R.style.Widget_MaterialComponents_Chip_Action);
        this.O = -1.0f;
        this.f3872t0 = new Paint(1);
        this.f3873u0 = new Paint.FontMetrics();
        this.f3874v0 = new RectF();
        this.f3875w0 = new PointF();
        this.f3876x0 = new Path();
        this.H0 = 255;
        this.L0 = PorterDuff.Mode.SRC_IN;
        this.O0 = new WeakReference(null);
        m(context);
        this.f3871s0 = context;
        k kVar = new k(this);
        this.f3877y0 = kVar;
        this.S = "";
        kVar.f1226a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = T0;
        setState(iArr);
        W(iArr);
        this.Q0 = true;
        U0.setTint(-1);
    }

    public static boolean D(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean E(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void f0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        if (!d0() && !c0()) {
            return 0.0f;
        }
        float f2 = this.f3864l0;
        Drawable drawable = this.F0 ? this.f3860g0 : this.U;
        float f4 = this.W;
        if (f4 <= 0.0f && drawable != null) {
            f4 = drawable.getIntrinsicWidth();
        }
        return f4 + f2 + this.f3865m0;
    }

    public final float B() {
        if (e0()) {
            return this.f3868p0 + this.f3857c0 + this.f3869q0;
        }
        return 0.0f;
    }

    public final float C() {
        return this.S0 ? k() : this.O;
    }

    public final void F() {
        d dVar = (d) this.O0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.f893u);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(int[] iArr, int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z3;
        boolean z4;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.L;
        int d = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f3878z0) : 0);
        boolean z5 = true;
        if (this.f3878z0 != d) {
            this.f3878z0 = d;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.M;
        int d3 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.A0) : 0);
        if (this.A0 != d3) {
            this.A0 = d3;
            onStateChange = true;
        }
        int b4 = f0.a.b(d3, d);
        if ((this.B0 != b4) | (this.f2598g.d == null)) {
            this.B0 = b4;
            q(ColorStateList.valueOf(b4));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.P;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.C0) : 0;
        if (this.C0 != colorForState3) {
            this.C0 = colorForState3;
            onStateChange = true;
        }
        if (this.N0 != null) {
            int[] iArr3 = j2.a.f1972a;
            boolean z6 = false;
            boolean z7 = false;
            for (int i4 : iArr) {
                if (i4 == 16842910) {
                    z6 = true;
                } else if (i4 == 16842908 || i4 == 16842919 || i4 == 16843623) {
                    z7 = true;
                }
            }
            if (z6 && z7) {
                i = this.N0.getColorForState(iArr, this.D0);
                if (this.D0 != i) {
                    this.D0 = i;
                }
                i2.d dVar = this.f3877y0.f1231g;
                colorForState = (dVar != null || (colorStateList = dVar.f1825k) == null) ? 0 : colorStateList.getColorForState(iArr, this.E0);
                if (this.E0 != colorForState) {
                    this.E0 = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (state[i5] != 16842912) {
                            i5++;
                        } else if (this.f3858e0) {
                            z3 = true;
                        }
                    }
                }
                z3 = false;
                if (this.F0 != z3 || this.f3860g0 == null) {
                    z4 = false;
                } else {
                    float A = A();
                    this.F0 = z3;
                    if (A != A()) {
                        onStateChange = true;
                        z4 = true;
                    } else {
                        z4 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.K0;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.G0) : 0;
                if (this.G0 == colorForState2) {
                    this.G0 = colorForState2;
                    ColorStateList colorStateList6 = this.K0;
                    PorterDuff.Mode mode = this.L0;
                    this.J0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z5 = onStateChange;
                }
                if (E(this.U)) {
                    z5 |= this.U.setState(iArr);
                }
                if (E(this.f3860g0)) {
                    z5 |= this.f3860g0.setState(iArr);
                }
                if (E(this.Z)) {
                    int[] iArr4 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                    z5 |= this.Z.setState(iArr4);
                }
                if (E(this.f3855a0)) {
                    z5 |= this.f3855a0.setState(iArr2);
                }
                if (z5) {
                    invalidateSelf();
                }
                if (z4) {
                    F();
                }
                return z5;
            }
        }
        i = 0;
        if (this.D0 != i) {
        }
        i2.d dVar2 = this.f3877y0.f1231g;
        if (dVar2 != null) {
        }
        if (this.E0 != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z3 = false;
        if (this.F0 != z3) {
        }
        z4 = false;
        ColorStateList colorStateList52 = this.K0;
        if (colorStateList52 == null) {
        }
        if (this.G0 == colorForState2) {
        }
        if (E(this.U)) {
        }
        if (E(this.f3860g0)) {
        }
        if (E(this.Z)) {
        }
        if (E(this.f3855a0)) {
        }
        if (z5) {
        }
        if (z4) {
        }
        return z5;
    }

    public final void H(boolean z3) {
        if (this.f3858e0 != z3) {
            this.f3858e0 = z3;
            float A = A();
            if (!z3 && this.F0) {
                this.F0 = false;
            }
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void I(Drawable drawable) {
        if (this.f3860g0 != drawable) {
            float A = A();
            this.f3860g0 = drawable;
            float A2 = A();
            f0(this.f3860g0);
            y(this.f3860g0);
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f3861h0 != colorStateList) {
            this.f3861h0 = colorStateList;
            if (this.f3859f0 && (drawable = this.f3860g0) != null && this.f3858e0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z3) {
        if (this.f3859f0 != z3) {
            boolean c02 = c0();
            this.f3859f0 = z3;
            boolean c03 = c0();
            if (c02 != c03) {
                if (c03) {
                    y(this.f3860g0);
                } else {
                    f0(this.f3860g0);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void L(float f2) {
        if (this.O != f2) {
            this.O = f2;
            m g4 = this.f2598g.f2581a.g();
            g4.f2621e = new l2.a(f2);
            g4.f2622f = new l2.a(f2);
            g4.f2623g = new l2.a(f2);
            g4.f2624h = new l2.a(f2);
            setShapeAppearanceModel(g4.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.U;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof g0.b;
            drawable2 = drawable3;
            if (z3) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float A = A();
            this.U = drawable != null ? drawable.mutate() : null;
            float A2 = A();
            f0(drawable2);
            if (d0()) {
                y(this.U);
            }
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void N(float f2) {
        if (this.W != f2) {
            float A = A();
            this.W = f2;
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        this.X = true;
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (d0()) {
                this.U.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P(boolean z3) {
        if (this.T != z3) {
            boolean d0 = d0();
            this.T = z3;
            boolean d02 = d0();
            if (d0 != d02) {
                if (d02) {
                    y(this.U);
                } else {
                    f0(this.U);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (this.S0) {
                h hVar = this.f2598g;
                if (hVar.f2584e != colorStateList) {
                    hVar.f2584e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void R(float f2) {
        if (this.Q != f2) {
            this.Q = f2;
            this.f3872t0.setStrokeWidth(f2);
            if (this.S0) {
                this.f2598g.f2589k = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.Z;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof g0.b;
            drawable2 = drawable3;
            if (z3) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float B = B();
            this.Z = drawable != null ? drawable.mutate() : null;
            this.f3855a0 = new RippleDrawable(j2.a.b(this.R), this.Z, U0);
            float B2 = B();
            f0(drawable2);
            if (e0()) {
                y(this.Z);
            }
            invalidateSelf();
            if (B != B2) {
                F();
            }
        }
    }

    public final void T(float f2) {
        if (this.f3869q0 != f2) {
            this.f3869q0 = f2;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final void U(float f2) {
        if (this.f3857c0 != f2) {
            this.f3857c0 = f2;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final void V(float f2) {
        if (this.f3868p0 != f2) {
            this.f3868p0 = f2;
            invalidateSelf();
            if (e0()) {
                F();
            }
        }
    }

    public final boolean W(int[] iArr) {
        if (Arrays.equals(this.M0, iArr)) {
            return false;
        }
        this.M0 = iArr;
        if (e0()) {
            return G(getState(), iArr);
        }
        return false;
    }

    public final void X(ColorStateList colorStateList) {
        if (this.f3856b0 != colorStateList) {
            this.f3856b0 = colorStateList;
            if (e0()) {
                this.Z.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Y(boolean z3) {
        if (this.Y != z3) {
            boolean e02 = e0();
            this.Y = z3;
            boolean e03 = e0();
            if (e02 != e03) {
                if (e03) {
                    y(this.Z);
                } else {
                    f0(this.Z);
                }
                invalidateSelf();
                F();
            }
        }
    }

    public final void Z(float f2) {
        if (this.f3865m0 != f2) {
            float A = A();
            this.f3865m0 = f2;
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    @Override // e2.j
    public final void a() {
        F();
        invalidateSelf();
    }

    public final void a0(float f2) {
        if (this.f3864l0 != f2) {
            float A = A();
            this.f3864l0 = f2;
            float A2 = A();
            invalidateSelf();
            if (A != A2) {
                F();
            }
        }
    }

    public final void b0(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            this.N0 = null;
            onStateChange(getState());
        }
    }

    public final boolean c0() {
        return this.f3859f0 && this.f3860g0 != null && this.F0;
    }

    public final boolean d0() {
        return this.T && this.U != null;
    }

    @Override // l2.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i4;
        float f2;
        float f4;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.H0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i4 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i4 = 0;
        }
        boolean z3 = this.S0;
        Paint paint = this.f3872t0;
        RectF rectF = this.f3874v0;
        if (!z3) {
            paint.setColor(this.f3878z0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, C(), C(), paint);
        }
        if (!this.S0) {
            paint.setColor(this.A0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.I0;
            if (colorFilter == null) {
                colorFilter = this.J0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, C(), C(), paint);
        }
        if (this.S0) {
            super.draw(canvas);
        }
        if (this.Q > 0.0f && !this.S0) {
            paint.setColor(this.C0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.S0) {
                ColorFilter colorFilter2 = this.I0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.J0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f5 = bounds.left;
            float f6 = this.Q / 2.0f;
            rectF.set(f5 + f6, bounds.top + f6, bounds.right - f6, bounds.bottom - f6);
            float f7 = this.O - (this.Q / 2.0f);
            canvas2.drawRoundRect(rectF, f7, f7, paint);
        }
        paint.setColor(this.D0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.S0) {
            RectF rectF2 = new RectF(bounds);
            h hVar = this.f2598g;
            n nVar = hVar.f2581a;
            float[] fArr = this.G;
            float f8 = hVar.f2588j;
            g gVar = this.f2613w;
            p pVar = this.f2614x;
            f2 = 2.0f;
            Path path = this.f3876x0;
            pVar.a(nVar, fArr, f8, rectF2, gVar, path);
            f(canvas2, paint, path, this.f2598g.f2581a, this.G, h());
        } else {
            canvas2.drawRoundRect(rectF, C(), C(), paint);
            f2 = 2.0f;
        }
        if (d0()) {
            z(bounds, rectF);
            float f9 = rectF.left;
            float f10 = rectF.top;
            canvas2.translate(f9, f10);
            this.U.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.U.draw(canvas2);
            canvas2.translate(-f9, -f10);
        }
        if (c0()) {
            z(bounds, rectF);
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas2.translate(f11, f12);
            this.f3860g0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f3860g0.draw(canvas2);
            canvas2.translate(-f11, -f12);
        }
        if (this.Q0 && this.S != null) {
            PointF pointF = this.f3875w0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.S;
            k kVar = this.f3877y0;
            if (charSequence != null) {
                float A = A() + this.f3863k0 + this.f3866n0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + A;
                } else {
                    pointF.x = bounds.right - A;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = kVar.f1226a;
                Paint.FontMetrics fontMetrics = this.f3873u0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f2);
            }
            rectF.setEmpty();
            if (this.S != null) {
                float A2 = A() + this.f3863k0 + this.f3866n0;
                float B = B() + this.f3870r0 + this.f3867o0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + A2;
                    rectF.right = bounds.right - B;
                } else {
                    rectF.left = bounds.left + B;
                    rectF.right = bounds.right - A2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            i2.d dVar = kVar.f1231g;
            TextPaint textPaint2 = kVar.f1226a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                kVar.f1231g.d(this.f3871s0, textPaint2, kVar.f1227b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.S.toString();
            if (kVar.f1229e) {
                kVar.a(charSequence2);
                f4 = kVar.f1228c;
            } else {
                f4 = kVar.f1228c;
            }
            boolean z4 = Math.round(f4) > Math.round(rectF.width());
            if (z4) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i5 = save;
            } else {
                i5 = 0;
            }
            CharSequence charSequence3 = this.S;
            if (z4 && this.P0 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.P0);
            }
            canvas.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z4) {
                canvas2.restoreToCount(i5);
            }
        }
        if (e0()) {
            rectF.setEmpty();
            if (e0()) {
                float f13 = this.f3870r0 + this.f3869q0;
                if (getLayoutDirection() == 0) {
                    float f14 = bounds.right - f13;
                    rectF.right = f14;
                    rectF.left = f14 - this.f3857c0;
                } else {
                    float f15 = bounds.left + f13;
                    rectF.left = f15;
                    rectF.right = f15 + this.f3857c0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f16 = this.f3857c0;
                float f17 = exactCenterY - (f16 / f2);
                rectF.top = f17;
                rectF.bottom = f17 + f16;
            }
            float f18 = rectF.left;
            float f19 = rectF.top;
            canvas2.translate(f18, f19);
            this.Z.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f3855a0.setBounds(this.Z.getBounds());
            this.f3855a0.jumpToCurrentState();
            this.f3855a0.draw(canvas2);
            canvas2.translate(-f18, -f19);
        }
        if (this.H0 < 255) {
            canvas2.restoreToCount(i4);
        }
    }

    public final boolean e0() {
        return this.Y && this.Z != null;
    }

    @Override // l2.j, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.H0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.I0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.N;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f2;
        float A = A() + this.f3863k0 + this.f3866n0;
        String charSequence = this.S.toString();
        k kVar = this.f3877y0;
        if (kVar.f1229e) {
            kVar.a(charSequence);
            f2 = kVar.f1228c;
        } else {
            f2 = kVar.f1228c;
        }
        return Math.min(Math.round(B() + f2 + A + this.f3867o0 + this.f3870r0), this.R0);
    }

    @Override // l2.j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // l2.j, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.S0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.N, this.O);
        } else {
            outline.setRoundRect(bounds, this.O);
            outline2 = outline;
        }
        outline2.setAlpha(this.H0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // l2.j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (D(this.L) || D(this.M) || D(this.P)) {
            return true;
        }
        i2.d dVar = this.f3877y0.f1231g;
        if (dVar == null || (colorStateList = dVar.f1825k) == null || !colorStateList.isStateful()) {
            return (this.f3859f0 && this.f3860g0 != null && this.f3858e0) || E(this.U) || E(this.f3860g0) || D(this.K0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (d0()) {
            onLayoutDirectionChanged |= this.U.setLayoutDirection(i);
        }
        if (c0()) {
            onLayoutDirectionChanged |= this.f3860g0.setLayoutDirection(i);
        }
        if (e0()) {
            onLayoutDirectionChanged |= this.Z.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (d0()) {
            onLevelChange |= this.U.setLevel(i);
        }
        if (c0()) {
            onLevelChange |= this.f3860g0.setLevel(i);
        }
        if (e0()) {
            onLevelChange |= this.Z.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // l2.j, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.S0) {
            super.onStateChange(iArr);
        }
        return G(iArr, this.M0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // l2.j, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.H0 != i) {
            this.H0 = i;
            invalidateSelf();
        }
    }

    @Override // l2.j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.I0 != colorFilter) {
            this.I0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // l2.j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // l2.j, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.L0 != mode) {
            this.L0 = mode;
            ColorStateList colorStateList = this.K0;
            this.J0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        if (d0()) {
            visible |= this.U.setVisible(z3, z4);
        }
        if (c0()) {
            visible |= this.f3860g0.setVisible(z3, z4);
        }
        if (e0()) {
            visible |= this.Z.setVisible(z3, z4);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void y(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.Z) {
            if (drawable.isStateful()) {
                drawable.setState(this.M0);
            }
            drawable.setTintList(this.f3856b0);
            return;
        }
        Drawable drawable2 = this.U;
        if (drawable == drawable2 && this.X) {
            drawable2.setTintList(this.V);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void z(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (d0() || c0()) {
            float f2 = this.f3863k0 + this.f3864l0;
            Drawable drawable = this.F0 ? this.f3860g0 : this.U;
            float f4 = this.W;
            if (f4 <= 0.0f && drawable != null) {
                f4 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f5 = rect.left + f2;
                rectF.left = f5;
                rectF.right = f5 + f4;
            } else {
                float f6 = rect.right - f2;
                rectF.right = f6;
                rectF.left = f6 - f4;
            }
            Drawable drawable2 = this.F0 ? this.f3860g0 : this.U;
            float f7 = this.W;
            if (f7 <= 0.0f && drawable2 != null) {
                f7 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f3871s0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f7) {
                    f7 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f7 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f7;
        }
    }
}
