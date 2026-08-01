package defpackage;

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
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ga extends rt implements Drawable.Callback {
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
    public RippleDrawable a0;
    public ColorStateList b0;
    public float c0;
    public SpannableStringBuilder d0;
    public boolean e0;
    public boolean f0;
    public Drawable g0;
    public ColorStateList h0;
    public bv i0;
    public bv j0;
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public float r0;
    public final Context s0;
    public final Paint t0;
    public final Paint.FontMetrics u0;
    public final RectF v0;
    public final PointF w0;
    public final Path x0;
    public final s50 y0;
    public int z0;

    public ga(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.awerser.monnit.betplay.R.attr.chipStyle, com.awerser.monnit.betplay.R.style.Widget_MaterialComponents_Chip_Action);
        this.O = -1.0f;
        this.t0 = new Paint(1);
        this.u0 = new Paint.FontMetrics();
        this.v0 = new RectF();
        this.w0 = new PointF();
        this.x0 = new Path();
        this.H0 = 255;
        this.L0 = PorterDuff.Mode.SRC_IN;
        this.O0 = new WeakReference(null);
        n(context);
        this.s0 = context;
        s50 s50Var = new s50(this);
        this.y0 = s50Var;
        this.S = "";
        s50Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = T0;
        setState(iArr);
        X(iArr);
        this.Q0 = true;
        U0.setTint(-1);
    }

    public static boolean E(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean F(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void h0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void A(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (f0() || e0()) {
            float f = this.k0 + this.l0;
            Drawable drawable = this.F0 ? this.g0 : this.U;
            float f2 = this.W;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.F0 ? this.g0 : this.U;
            float f5 = this.W;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.s0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final float B() {
        if (!f0() && !e0()) {
            return 0.0f;
        }
        float f = this.l0;
        Drawable drawable = this.F0 ? this.g0 : this.U;
        float f2 = this.W;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.m0;
    }

    public final float C() {
        if (g0()) {
            return this.p0 + this.c0 + this.q0;
        }
        return 0.0f;
    }

    public final float D() {
        return this.S0 ? k() : this.O;
    }

    public final void G() {
        Chip chip = (Chip) this.O0.get();
        if (chip != null) {
            chip.b(chip.v);
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
    public final boolean H(int[] iArr, int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z;
        boolean z2;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.L;
        int c = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.z0) : 0);
        boolean z3 = true;
        if (this.z0 != c) {
            this.z0 = c;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.M;
        int c2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.A0) : 0);
        if (this.A0 != c2) {
            this.A0 = c2;
            onStateChange = true;
        }
        int b = nb.b(c2, c);
        if ((this.B0 != b) | (this.g.c == null)) {
            this.B0 = b;
            r(ColorStateList.valueOf(b));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.P;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.C0) : 0;
        if (this.C0 != colorForState3) {
            this.C0 = colorForState3;
            onStateChange = true;
        }
        if (this.N0 != null) {
            int[] iArr3 = c10.a;
            boolean z4 = false;
            boolean z5 = false;
            for (int i2 : iArr) {
                if (i2 == 16842910) {
                    z4 = true;
                } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                    z5 = true;
                }
            }
            if (z4 && z5) {
                i = this.N0.getColorForState(iArr, this.D0);
                if (this.D0 != i) {
                    this.D0 = i;
                }
                p50 p50Var = this.y0.f;
                colorForState = (p50Var != null || (colorStateList = p50Var.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.E0);
                if (this.E0 != colorForState) {
                    this.E0 = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if (state[i3] != 16842912) {
                            i3++;
                        } else if (this.e0) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (this.F0 != z || this.g0 == null) {
                    z2 = false;
                } else {
                    float B = B();
                    this.F0 = z;
                    if (B != B()) {
                        onStateChange = true;
                        z2 = true;
                    } else {
                        z2 = false;
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
                    z3 = onStateChange;
                }
                if (F(this.U)) {
                    z3 |= this.U.setState(iArr);
                }
                if (F(this.g0)) {
                    z3 |= this.g0.setState(iArr);
                }
                if (F(this.Z)) {
                    int[] iArr4 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                    z3 |= this.Z.setState(iArr4);
                }
                if (F(this.a0)) {
                    z3 |= this.a0.setState(iArr2);
                }
                if (z3) {
                    invalidateSelf();
                }
                if (z2) {
                    G();
                }
                return z3;
            }
        }
        i = 0;
        if (this.D0 != i) {
        }
        p50 p50Var2 = this.y0.f;
        if (p50Var2 != null) {
        }
        if (this.E0 != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z = false;
        if (this.F0 != z) {
        }
        z2 = false;
        ColorStateList colorStateList52 = this.K0;
        if (colorStateList52 == null) {
        }
        if (this.G0 == colorForState2) {
        }
        if (F(this.U)) {
        }
        if (F(this.g0)) {
        }
        if (F(this.Z)) {
        }
        if (F(this.a0)) {
        }
        if (z3) {
        }
        if (z2) {
        }
        return z3;
    }

    public final void I(boolean z) {
        if (this.e0 != z) {
            this.e0 = z;
            float B = B();
            if (!z && this.F0) {
                this.F0 = false;
            }
            float B2 = B();
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void J(Drawable drawable) {
        if (this.g0 != drawable) {
            float B = B();
            this.g0 = drawable;
            float B2 = B();
            h0(this.g0);
            z(this.g0);
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.h0 != colorStateList) {
            this.h0 = colorStateList;
            if (this.f0 && (drawable = this.g0) != null && this.e0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void L(boolean z) {
        if (this.f0 != z) {
            boolean e0 = e0();
            this.f0 = z;
            boolean e02 = e0();
            if (e0 != e02) {
                Drawable drawable = this.g0;
                if (e02) {
                    z(drawable);
                } else {
                    h0(drawable);
                }
                invalidateSelf();
                G();
            }
        }
    }

    public final void M(float f) {
        if (this.O != f) {
            this.O = f;
            setShapeAppearanceModel(i().a(f));
        }
    }

    public final void N(Drawable drawable) {
        Drawable drawable2 = this.U;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float B = B();
            this.U = drawable != null ? drawable.mutate() : null;
            float B2 = B();
            h0(drawable2);
            if (f0()) {
                z(this.U);
            }
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void O(float f) {
        if (this.W != f) {
            float B = B();
            this.W = f;
            float B2 = B();
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        this.X = true;
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (f0()) {
                this.U.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z) {
        if (this.T != z) {
            boolean f0 = f0();
            this.T = z;
            boolean f02 = f0();
            if (f0 != f02) {
                Drawable drawable = this.U;
                if (f02) {
                    z(drawable);
                } else {
                    h0(drawable);
                }
                invalidateSelf();
                G();
            }
        }
    }

    public final void R(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (this.S0) {
                pt ptVar = this.g;
                if (ptVar.d != colorStateList) {
                    ptVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void S(float f) {
        if (this.Q != f) {
            this.Q = f;
            this.t0.setStrokeWidth(f);
            if (this.S0) {
                this.g.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void T(Drawable drawable) {
        Drawable drawable2 = this.Z;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float C = C();
            this.Z = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(c10.a(this.R), this.Z, U0);
            FocusRingDrawable.e(this.s0, rippleDrawable, null);
            this.a0 = rippleDrawable;
            float C2 = C();
            h0(drawable2);
            if (g0()) {
                z(this.Z);
            }
            invalidateSelf();
            if (C != C2) {
                G();
            }
        }
    }

    public final void U(float f) {
        if (this.q0 != f) {
            this.q0 = f;
            invalidateSelf();
            if (g0()) {
                G();
            }
        }
    }

    public final void V(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            if (g0()) {
                G();
            }
        }
    }

    public final void W(float f) {
        if (this.p0 != f) {
            this.p0 = f;
            invalidateSelf();
            if (g0()) {
                G();
            }
        }
    }

    public final boolean X(int[] iArr) {
        if (Arrays.equals(this.M0, iArr)) {
            return false;
        }
        this.M0 = iArr;
        if (g0()) {
            return H(getState(), iArr);
        }
        return false;
    }

    public final void Y(ColorStateList colorStateList) {
        if (this.b0 != colorStateList) {
            this.b0 = colorStateList;
            if (g0()) {
                this.Z.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Z(boolean z) {
        if (this.Y != z) {
            boolean g0 = g0();
            this.Y = z;
            boolean g02 = g0();
            if (g0 != g02) {
                Drawable drawable = this.Z;
                if (g02) {
                    z(drawable);
                } else {
                    h0(drawable);
                }
                invalidateSelf();
                G();
            }
        }
    }

    public final void a0(float f) {
        if (this.m0 != f) {
            float B = B();
            this.m0 = f;
            float B2 = B();
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void b0(float f) {
        if (this.l0 != f) {
            float B = B();
            this.l0 = f;
            float B2 = B();
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void c0(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            this.N0 = null;
            onStateChange(getState());
        }
    }

    public final void d0(p50 p50Var) {
        s50 s50Var = this.y0;
        da daVar = s50Var.b;
        TextPaint textPaint = s50Var.a;
        if (s50Var.f != p50Var) {
            s50Var.f = p50Var;
            if (p50Var != null) {
                Context context = this.s0;
                p50Var.e(context, textPaint, daVar);
                ga gaVar = (ga) s50Var.e.get();
                if (gaVar != null) {
                    textPaint.drawableState = gaVar.getState();
                }
                p50Var.d(context, textPaint, daVar);
                s50Var.d = true;
            }
            ga gaVar2 = (ga) s50Var.e.get();
            if (gaVar2 != null) {
                gaVar2.G();
                gaVar2.invalidateSelf();
                gaVar2.onStateChange(gaVar2.getState());
            }
        }
    }

    @Override // defpackage.rt, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.H0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.S0;
        Paint paint = this.t0;
        RectF rectF = this.v0;
        if (!z) {
            paint.setColor(this.z0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, D(), D(), paint);
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
            canvas2.drawRoundRect(rectF, D(), D(), paint);
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
            float f2 = bounds.left;
            float f3 = this.Q / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.O - (this.Q / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.D0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.S0) {
            RectF rectF2 = new RectF(bounds);
            n20 d = this.g.a.d();
            float[] fArr = this.G;
            float f5 = this.g.i;
            ot otVar = this.w;
            p20 p20Var = this.x;
            f = 2.0f;
            Path path = this.x0;
            p20Var.a(d, fArr, f5, rectF2, otVar, path);
            e(canvas2, paint, path, this.g.a.d(), this.G, g());
        } else {
            canvas2.drawRoundRect(rectF, D(), D(), paint);
            f = 2.0f;
        }
        if (f0()) {
            A(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.U.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.U.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (e0()) {
            A(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.g0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.g0.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.Q0 && this.S != null) {
            PointF pointF = this.w0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.S;
            s50 s50Var = this.y0;
            if (charSequence != null) {
                float B = B() + this.k0 + this.n0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + B;
                } else {
                    pointF.x = bounds.right - B;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = s50Var.a;
                Paint.FontMetrics fontMetrics = this.u0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.S != null) {
                float B2 = B() + this.k0 + this.n0;
                float C = C() + this.r0 + this.o0;
                int layoutDirection = getLayoutDirection();
                int i4 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i4 + B2;
                    rectF.right = bounds.right - C;
                } else {
                    rectF.left = i4 + C;
                    rectF.right = bounds.right - B2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            p50 p50Var = s50Var.f;
            TextPaint textPaint2 = s50Var.a;
            if (p50Var != null) {
                textPaint2.drawableState = getState();
                s50Var.f.d(this.s0, textPaint2, s50Var.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(s50Var.a(this.S.toString())) > Math.round(rectF.width());
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence2 = this.S;
            if (z2 && this.P0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.P0);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i3);
            }
        }
        if (g0()) {
            rectF.setEmpty();
            if (g0()) {
                float f10 = this.r0 + this.q0;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.c0;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.c0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f13 = this.c0;
                float f14 = exactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.Z.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.a0.setBounds(this.Z.getBounds());
            this.a0.jumpToCurrentState();
            this.a0.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.H0 < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    public final boolean e0() {
        return this.f0 && this.g0 != null && this.F0;
    }

    public final boolean f0() {
        return this.T && this.U != null;
    }

    public final boolean g0() {
        return this.Y && this.Z != null;
    }

    @Override // defpackage.rt, android.graphics.drawable.Drawable
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
        return Math.min(Math.round(C() + this.y0.a(this.S.toString()) + B() + this.k0 + this.n0 + this.o0 + this.r0), this.R0);
    }

    @Override // defpackage.rt, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.rt, android.graphics.drawable.Drawable
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

    @Override // defpackage.rt, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (E(this.L) || E(this.M) || E(this.P)) {
            return true;
        }
        p50 p50Var = this.y0.f;
        if (p50Var == null || (colorStateList = p50Var.k) == null || !colorStateList.isStateful()) {
            return (this.f0 && this.g0 != null && this.e0) || F(this.U) || F(this.g0) || E(this.K0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (f0()) {
            onLayoutDirectionChanged |= this.U.setLayoutDirection(i);
        }
        if (e0()) {
            onLayoutDirectionChanged |= this.g0.setLayoutDirection(i);
        }
        if (g0()) {
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
        if (f0()) {
            onLevelChange |= this.U.setLevel(i);
        }
        if (e0()) {
            onLevelChange |= this.g0.setLevel(i);
        }
        if (g0()) {
            onLevelChange |= this.Z.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.rt, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.S0) {
            super.onStateChange(iArr);
        }
        return H(iArr, this.M0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.rt, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.H0 != i) {
            this.H0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.rt, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.I0 != colorFilter) {
            this.I0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.rt, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.rt, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.L0 != mode) {
            this.L0 = mode;
            ColorStateList colorStateList = this.K0;
            this.J0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (f0()) {
            visible |= this.U.setVisible(z, z2);
        }
        if (e0()) {
            visible |= this.g0.setVisible(z, z2);
        }
        if (g0()) {
            visible |= this.Z.setVisible(z, z2);
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

    public final void z(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.Z) {
            drawable.setTintList(this.b0);
            if (drawable.isStateful()) {
                drawable.setState(this.M0);
                return;
            }
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
}
