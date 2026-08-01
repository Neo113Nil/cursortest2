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

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ia extends ct implements Drawable.Callback {
    public static final int[] U0 = {R.attr.state_enabled};
    public static final ShapeDrawable V0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public int H0;
    public int I0;
    public ColorFilter J0;
    public PorterDuffColorFilter K0;
    public ColorStateList L0;
    public ColorStateList M;
    public PorterDuff.Mode M0;
    public ColorStateList N;
    public int[] N0;
    public float O;
    public ColorStateList O0;
    public float P;
    public WeakReference P0;
    public ColorStateList Q;
    public TextUtils.TruncateAt Q0;
    public float R;
    public boolean R0;
    public ColorStateList S;
    public int S0;
    public CharSequence T;
    public boolean T0;
    public boolean U;
    public Drawable V;
    public ColorStateList W;
    public float X;
    public boolean Y;
    public boolean Z;
    public Drawable a0;
    public RippleDrawable b0;
    public ColorStateList c0;
    public float d0;
    public SpannableStringBuilder e0;
    public boolean f0;
    public boolean g0;
    public Drawable h0;
    public ColorStateList i0;
    public mu j0;
    public mu k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public float r0;
    public float s0;
    public final Context t0;
    public final Paint u0;
    public final Paint.FontMetrics v0;
    public final RectF w0;
    public final PointF x0;
    public final Path y0;
    public final k50 z0;

    public ia(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.derinko.gbini.n1casino.R.attr.chipStyle, com.derinko.gbini.n1casino.R.style.Widget_MaterialComponents_Chip_Action);
        this.P = -1.0f;
        this.u0 = new Paint(1);
        this.v0 = new Paint.FontMetrics();
        this.w0 = new RectF();
        this.x0 = new PointF();
        this.y0 = new Path();
        this.I0 = 255;
        this.M0 = PorterDuff.Mode.SRC_IN;
        this.P0 = new WeakReference(null);
        n(context);
        this.t0 = context;
        k50 k50Var = new k50(this);
        this.z0 = k50Var;
        this.T = "";
        k50Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = U0;
        setState(iArr);
        X(iArr);
        this.R0 = true;
        V0.setTint(-1);
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
            float f = this.l0 + this.m0;
            Drawable drawable = this.G0 ? this.h0 : this.V;
            float f2 = this.X;
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
            Drawable drawable2 = this.G0 ? this.h0 : this.V;
            float f5 = this.X;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.t0.getResources().getDisplayMetrics()));
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
        float f = this.m0;
        Drawable drawable = this.G0 ? this.h0 : this.V;
        float f2 = this.X;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.n0;
    }

    public final float C() {
        if (g0()) {
            return this.q0 + this.d0 + this.r0;
        }
        return 0.0f;
    }

    public final float D() {
        return this.T0 ? k() : this.P;
    }

    public final void G() {
        Chip chip = (Chip) this.P0.get();
        if (chip != null) {
            chip.b(chip.u);
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
        ColorStateList colorStateList2 = this.M;
        int c = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.A0) : 0);
        boolean z3 = true;
        if (this.A0 != c) {
            this.A0 = c;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.N;
        int c2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.B0) : 0);
        if (this.B0 != c2) {
            this.B0 = c2;
            onStateChange = true;
        }
        int b = lb.b(c2, c);
        if ((this.C0 != b) | (this.g.c == null)) {
            this.C0 = b;
            r(ColorStateList.valueOf(b));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.Q;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.D0) : 0;
        if (this.D0 != colorForState3) {
            this.D0 = colorForState3;
            onStateChange = true;
        }
        if (this.O0 != null) {
            int[] iArr3 = m00.a;
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
                i = this.O0.getColorForState(iArr, this.E0);
                if (this.E0 != i) {
                    this.E0 = i;
                }
                i50 i50Var = this.z0.f;
                colorForState = (i50Var != null || (colorStateList = i50Var.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.F0);
                if (this.F0 != colorForState) {
                    this.F0 = colorForState;
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
                        } else if (this.f0) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (this.G0 != z || this.h0 == null) {
                    z2 = false;
                } else {
                    float B = B();
                    this.G0 = z;
                    if (B != B()) {
                        onStateChange = true;
                        z2 = true;
                    } else {
                        z2 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.L0;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.H0) : 0;
                if (this.H0 == colorForState2) {
                    this.H0 = colorForState2;
                    ColorStateList colorStateList6 = this.L0;
                    PorterDuff.Mode mode = this.M0;
                    this.K0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z3 = onStateChange;
                }
                if (F(this.V)) {
                    z3 |= this.V.setState(iArr);
                }
                if (F(this.h0)) {
                    z3 |= this.h0.setState(iArr);
                }
                if (F(this.a0)) {
                    int[] iArr4 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                    z3 |= this.a0.setState(iArr4);
                }
                if (F(this.b0)) {
                    z3 |= this.b0.setState(iArr2);
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
        if (this.E0 != i) {
        }
        i50 i50Var2 = this.z0.f;
        if (i50Var2 != null) {
        }
        if (this.F0 != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z = false;
        if (this.G0 != z) {
        }
        z2 = false;
        ColorStateList colorStateList52 = this.L0;
        if (colorStateList52 == null) {
        }
        if (this.H0 == colorForState2) {
        }
        if (F(this.V)) {
        }
        if (F(this.h0)) {
        }
        if (F(this.a0)) {
        }
        if (F(this.b0)) {
        }
        if (z3) {
        }
        if (z2) {
        }
        return z3;
    }

    public final void I(boolean z) {
        if (this.f0 != z) {
            this.f0 = z;
            float B = B();
            if (!z && this.G0) {
                this.G0 = false;
            }
            float B2 = B();
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void J(Drawable drawable) {
        if (this.h0 != drawable) {
            float B = B();
            this.h0 = drawable;
            float B2 = B();
            h0(this.h0);
            z(this.h0);
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.i0 != colorStateList) {
            this.i0 = colorStateList;
            if (this.g0 && (drawable = this.h0) != null && this.f0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void L(boolean z) {
        if (this.g0 != z) {
            boolean e0 = e0();
            this.g0 = z;
            boolean e02 = e0();
            if (e0 != e02) {
                Drawable drawable = this.h0;
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
        if (this.P != f) {
            this.P = f;
            setShapeAppearanceModel(i().a(f));
        }
    }

    public final void N(Drawable drawable) {
        Drawable drawable2 = this.V;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float B = B();
            this.V = drawable != null ? drawable.mutate() : null;
            float B2 = B();
            h0(drawable2);
            if (f0()) {
                z(this.V);
            }
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void O(float f) {
        if (this.X != f) {
            float B = B();
            this.X = f;
            float B2 = B();
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        this.Y = true;
        if (this.W != colorStateList) {
            this.W = colorStateList;
            if (f0()) {
                this.V.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z) {
        if (this.U != z) {
            boolean f0 = f0();
            this.U = z;
            boolean f02 = f0();
            if (f0 != f02) {
                Drawable drawable = this.V;
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
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            if (this.T0) {
                at atVar = this.g;
                if (atVar.d != colorStateList) {
                    atVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void S(float f) {
        if (this.R != f) {
            this.R = f;
            this.u0.setStrokeWidth(f);
            if (this.T0) {
                this.g.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void T(Drawable drawable) {
        Drawable drawable2 = this.a0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float C = C();
            this.a0 = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(m00.a(this.S), this.a0, V0);
            FocusRingDrawable.e(this.t0, rippleDrawable, null);
            this.b0 = rippleDrawable;
            float C2 = C();
            h0(drawable2);
            if (g0()) {
                z(this.a0);
            }
            invalidateSelf();
            if (C != C2) {
                G();
            }
        }
    }

    public final void U(float f) {
        if (this.r0 != f) {
            this.r0 = f;
            invalidateSelf();
            if (g0()) {
                G();
            }
        }
    }

    public final void V(float f) {
        if (this.d0 != f) {
            this.d0 = f;
            invalidateSelf();
            if (g0()) {
                G();
            }
        }
    }

    public final void W(float f) {
        if (this.q0 != f) {
            this.q0 = f;
            invalidateSelf();
            if (g0()) {
                G();
            }
        }
    }

    public final boolean X(int[] iArr) {
        if (Arrays.equals(this.N0, iArr)) {
            return false;
        }
        this.N0 = iArr;
        if (g0()) {
            return H(getState(), iArr);
        }
        return false;
    }

    public final void Y(ColorStateList colorStateList) {
        if (this.c0 != colorStateList) {
            this.c0 = colorStateList;
            if (g0()) {
                this.a0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Z(boolean z) {
        if (this.Z != z) {
            boolean g0 = g0();
            this.Z = z;
            boolean g02 = g0();
            if (g0 != g02) {
                Drawable drawable = this.a0;
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
        if (this.n0 != f) {
            float B = B();
            this.n0 = f;
            float B2 = B();
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void b0(float f) {
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

    public final void c0(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            this.O0 = null;
            onStateChange(getState());
        }
    }

    public final void d0(i50 i50Var) {
        k50 k50Var = this.z0;
        fa faVar = k50Var.b;
        TextPaint textPaint = k50Var.a;
        if (k50Var.f != i50Var) {
            k50Var.f = i50Var;
            if (i50Var != null) {
                Context context = this.t0;
                i50Var.e(context, textPaint, faVar);
                ia iaVar = (ia) k50Var.e.get();
                if (iaVar != null) {
                    textPaint.drawableState = iaVar.getState();
                }
                i50Var.d(context, textPaint, faVar);
                k50Var.d = true;
            }
            ia iaVar2 = (ia) k50Var.e.get();
            if (iaVar2 != null) {
                iaVar2.G();
                iaVar2.invalidateSelf();
                iaVar2.onStateChange(iaVar2.getState());
            }
        }
    }

    @Override // defpackage.ct, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.I0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.T0;
        Paint paint = this.u0;
        RectF rectF = this.w0;
        if (!z) {
            paint.setColor(this.A0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, D(), D(), paint);
        }
        if (!this.T0) {
            paint.setColor(this.B0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.J0;
            if (colorFilter == null) {
                colorFilter = this.K0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, D(), D(), paint);
        }
        if (this.T0) {
            super.draw(canvas);
        }
        if (this.R > 0.0f && !this.T0) {
            paint.setColor(this.D0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.T0) {
                ColorFilter colorFilter2 = this.J0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.K0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.R / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.P - (this.R / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.E0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.T0) {
            RectF rectF2 = new RectF(bounds);
            d20 d = this.g.a.d();
            float[] fArr = this.H;
            float f5 = this.g.i;
            zs zsVar = this.w;
            f20 f20Var = this.x;
            f = 2.0f;
            Path path = this.y0;
            f20Var.a(d, fArr, f5, rectF2, zsVar, path);
            e(canvas2, paint, path, this.g.a.d(), this.H, g());
        } else {
            canvas2.drawRoundRect(rectF, D(), D(), paint);
            f = 2.0f;
        }
        if (f0()) {
            A(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.V.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.V.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (e0()) {
            A(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.h0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.h0.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.R0 && this.T != null) {
            PointF pointF = this.x0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.T;
            k50 k50Var = this.z0;
            if (charSequence != null) {
                float B = B() + this.l0 + this.o0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + B;
                } else {
                    pointF.x = bounds.right - B;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = k50Var.a;
                Paint.FontMetrics fontMetrics = this.v0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.T != null) {
                float B2 = B() + this.l0 + this.o0;
                float C = C() + this.s0 + this.p0;
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
            i50 i50Var = k50Var.f;
            TextPaint textPaint2 = k50Var.a;
            if (i50Var != null) {
                textPaint2.drawableState = getState();
                k50Var.f.d(this.t0, textPaint2, k50Var.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(k50Var.a(this.T.toString())) > Math.round(rectF.width());
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence2 = this.T;
            if (z2 && this.Q0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.Q0);
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
                float f10 = this.s0 + this.r0;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.d0;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.d0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f13 = this.d0;
                float f14 = exactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.a0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.b0.setBounds(this.a0.getBounds());
            this.b0.jumpToCurrentState();
            this.b0.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.I0 < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    public final boolean e0() {
        return this.g0 && this.h0 != null && this.G0;
    }

    public final boolean f0() {
        return this.U && this.V != null;
    }

    public final boolean g0() {
        return this.Z && this.a0 != null;
    }

    @Override // defpackage.ct, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.I0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.J0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.O;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(C() + this.z0.a(this.T.toString()) + B() + this.l0 + this.o0 + this.p0 + this.s0), this.S0);
    }

    @Override // defpackage.ct, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.ct, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.T0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.O, this.P);
        } else {
            outline.setRoundRect(bounds, this.P);
            outline2 = outline;
        }
        outline2.setAlpha(this.I0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.ct, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (E(this.M) || E(this.N) || E(this.Q)) {
            return true;
        }
        i50 i50Var = this.z0.f;
        if (i50Var == null || (colorStateList = i50Var.k) == null || !colorStateList.isStateful()) {
            return (this.g0 && this.h0 != null && this.f0) || F(this.V) || F(this.h0) || E(this.L0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (f0()) {
            onLayoutDirectionChanged |= this.V.setLayoutDirection(i);
        }
        if (e0()) {
            onLayoutDirectionChanged |= this.h0.setLayoutDirection(i);
        }
        if (g0()) {
            onLayoutDirectionChanged |= this.a0.setLayoutDirection(i);
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
            onLevelChange |= this.V.setLevel(i);
        }
        if (e0()) {
            onLevelChange |= this.h0.setLevel(i);
        }
        if (g0()) {
            onLevelChange |= this.a0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.ct, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.T0) {
            super.onStateChange(iArr);
        }
        return H(iArr, this.N0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.ct, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.I0 != i) {
            this.I0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.ct, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.J0 != colorFilter) {
            this.J0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.ct, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.L0 != colorStateList) {
            this.L0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.ct, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.M0 != mode) {
            this.M0 = mode;
            ColorStateList colorStateList = this.L0;
            this.K0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (f0()) {
            visible |= this.V.setVisible(z, z2);
        }
        if (e0()) {
            visible |= this.h0.setVisible(z, z2);
        }
        if (g0()) {
            visible |= this.a0.setVisible(z, z2);
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
        if (drawable == this.a0) {
            drawable.setTintList(this.c0);
            if (drawable.isStateful()) {
                drawable.setState(this.N0);
                return;
            }
            return;
        }
        Drawable drawable2 = this.V;
        if (drawable == drawable2 && this.Y) {
            drawable2.setTintList(this.W);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }
}
