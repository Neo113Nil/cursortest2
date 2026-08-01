package a2;

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
import i2.l;
import i2.m;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o2.o;
import o2.q;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f extends o2.j implements Drawable.Callback, l {
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
    public RippleDrawable f110a0;

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f111b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f112c0;
    public SpannableStringBuilder d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f113e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f114f0;

    /* renamed from: g0, reason: collision with root package name */
    public Drawable f115g0;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f116h0;
    public r1.e i0;

    /* renamed from: j0, reason: collision with root package name */
    public r1.e f117j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f118k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f119l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f120m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f121n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f122o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f123p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f124q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f125r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Context f126s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Paint f127t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Paint.FontMetrics f128u0;

    /* renamed from: v0, reason: collision with root package name */
    public final RectF f129v0;

    /* renamed from: w0, reason: collision with root package name */
    public final PointF f130w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Path f131x0;

    /* renamed from: y0, reason: collision with root package name */
    public final m f132y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f133z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gdmhkmf.belbet.R.attr.chipStyle, com.gdmhkmf.belbet.R.style.Widget_MaterialComponents_Chip_Action);
        this.O = -1.0f;
        this.f127t0 = new Paint(1);
        this.f128u0 = new Paint.FontMetrics();
        this.f129v0 = new RectF();
        this.f130w0 = new PointF();
        this.f131x0 = new Path();
        this.H0 = 255;
        this.L0 = PorterDuff.Mode.SRC_IN;
        this.O0 = new WeakReference(null);
        n(context);
        this.f126s0 = context;
        m mVar = new m(this);
        this.f132y0 = mVar;
        this.S = "";
        mVar.f2057a.density = context.getResources().getDisplayMetrics().density;
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
            float f5 = this.f118k0 + this.f119l0;
            Drawable drawable = this.F0 ? this.f115g0 : this.U;
            float f6 = this.W;
            if (f6 <= 0.0f && drawable != null) {
                f6 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f7 = rect.left + f5;
                rectF.left = f7;
                rectF.right = f7 + f6;
            } else {
                float f8 = rect.right - f5;
                rectF.right = f8;
                rectF.left = f8 - f6;
            }
            Drawable drawable2 = this.F0 ? this.f115g0 : this.U;
            float f9 = this.W;
            if (f9 <= 0.0f && drawable2 != null) {
                f9 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f126s0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f9) {
                    f9 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f9 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f9;
        }
    }

    public final float B() {
        if (!f0() && !e0()) {
            return 0.0f;
        }
        float f5 = this.f119l0;
        Drawable drawable = this.F0 ? this.f115g0 : this.U;
        float f6 = this.W;
        if (f6 <= 0.0f && drawable != null) {
            f6 = drawable.getIntrinsicWidth();
        }
        return f6 + f5 + this.f120m0;
    }

    public final float C() {
        if (g0()) {
            return this.f123p0 + this.f112c0 + this.f124q0;
        }
        return 0.0f;
    }

    public final float D() {
        return this.S0 ? k() : this.O;
    }

    public final void G() {
        e eVar = (e) this.O0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f1012v);
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
        boolean z4;
        boolean z5;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.L;
        int c5 = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f133z0) : 0);
        boolean z6 = true;
        if (this.f133z0 != c5) {
            this.f133z0 = c5;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.M;
        int c6 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.A0) : 0);
        if (this.A0 != c6) {
            this.A0 = c6;
            onStateChange = true;
        }
        int b2 = f0.a.b(c6, c5);
        if ((this.B0 != b2) | (this.f2955g.f2942c == null)) {
            this.B0 = b2;
            r(ColorStateList.valueOf(b2));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.P;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.C0) : 0;
        if (this.C0 != colorForState3) {
            this.C0 = colorForState3;
            onStateChange = true;
        }
        if (this.N0 != null) {
            int[] iArr3 = m2.a.f2733a;
            boolean z7 = false;
            boolean z8 = false;
            for (int i4 : iArr) {
                if (i4 == 16842910) {
                    z7 = true;
                } else if (i4 == 16842908 || i4 == 16842919 || i4 == 16843623) {
                    z8 = true;
                }
            }
            if (z7 && z8) {
                i = this.N0.getColorForState(iArr, this.D0);
                if (this.D0 != i) {
                    this.D0 = i;
                }
                l2.d dVar = this.f132y0.f2061f;
                colorForState = (dVar != null || (colorStateList = dVar.f2713k) == null) ? 0 : colorStateList.getColorForState(iArr, this.E0);
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
                        } else if (this.f113e0) {
                            z4 = true;
                        }
                    }
                }
                z4 = false;
                if (this.F0 != z4 || this.f115g0 == null) {
                    z5 = false;
                } else {
                    float B = B();
                    this.F0 = z4;
                    if (B != B()) {
                        onStateChange = true;
                        z5 = true;
                    } else {
                        z5 = false;
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
                    z6 = onStateChange;
                }
                if (F(this.U)) {
                    z6 |= this.U.setState(iArr);
                }
                if (F(this.f115g0)) {
                    z6 |= this.f115g0.setState(iArr);
                }
                if (F(this.Z)) {
                    int[] iArr4 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                    z6 |= this.Z.setState(iArr4);
                }
                if (F(this.f110a0)) {
                    z6 |= this.f110a0.setState(iArr2);
                }
                if (z6) {
                    invalidateSelf();
                }
                if (z5) {
                    G();
                }
                return z6;
            }
        }
        i = 0;
        if (this.D0 != i) {
        }
        l2.d dVar2 = this.f132y0.f2061f;
        if (dVar2 != null) {
        }
        if (this.E0 != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z4 = false;
        if (this.F0 != z4) {
        }
        z5 = false;
        ColorStateList colorStateList52 = this.K0;
        if (colorStateList52 == null) {
        }
        if (this.G0 == colorForState2) {
        }
        if (F(this.U)) {
        }
        if (F(this.f115g0)) {
        }
        if (F(this.Z)) {
        }
        if (F(this.f110a0)) {
        }
        if (z6) {
        }
        if (z5) {
        }
        return z6;
    }

    public final void I(boolean z4) {
        if (this.f113e0 != z4) {
            this.f113e0 = z4;
            float B = B();
            if (!z4 && this.F0) {
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
        if (this.f115g0 != drawable) {
            float B = B();
            this.f115g0 = drawable;
            float B2 = B();
            h0(this.f115g0);
            z(this.f115g0);
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void K(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f116h0 != colorStateList) {
            this.f116h0 = colorStateList;
            if (this.f114f0 && (drawable = this.f115g0) != null && this.f113e0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void L(boolean z4) {
        if (this.f114f0 != z4) {
            boolean e02 = e0();
            this.f114f0 = z4;
            boolean e03 = e0();
            if (e02 != e03) {
                if (e03) {
                    z(this.f115g0);
                } else {
                    h0(this.f115g0);
                }
                invalidateSelf();
                G();
            }
        }
    }

    public final void M(float f5) {
        if (this.O != f5) {
            this.O = f5;
            setShapeAppearanceModel(i().a(f5));
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

    public final void O(float f5) {
        if (this.W != f5) {
            float B = B();
            this.W = f5;
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

    public final void Q(boolean z4) {
        if (this.T != z4) {
            boolean f02 = f0();
            this.T = z4;
            boolean f03 = f0();
            if (f02 != f03) {
                if (f03) {
                    z(this.U);
                } else {
                    h0(this.U);
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
                o2.h hVar = this.f2955g;
                if (hVar.d != colorStateList) {
                    hVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void S(float f5) {
        if (this.Q != f5) {
            this.Q = f5;
            this.f127t0.setStrokeWidth(f5);
            if (this.S0) {
                this.f2955g.f2946j = f5;
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
            RippleDrawable rippleDrawable = new RippleDrawable(m2.a.a(this.R), this.Z, U0);
            FocusRingDrawable.e(this.f126s0, rippleDrawable, null);
            this.f110a0 = rippleDrawable;
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

    public final void U(float f5) {
        if (this.f124q0 != f5) {
            this.f124q0 = f5;
            invalidateSelf();
            if (g0()) {
                G();
            }
        }
    }

    public final void V(float f5) {
        if (this.f112c0 != f5) {
            this.f112c0 = f5;
            invalidateSelf();
            if (g0()) {
                G();
            }
        }
    }

    public final void W(float f5) {
        if (this.f123p0 != f5) {
            this.f123p0 = f5;
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
        if (this.f111b0 != colorStateList) {
            this.f111b0 = colorStateList;
            if (g0()) {
                this.Z.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Z(boolean z4) {
        if (this.Y != z4) {
            boolean g02 = g0();
            this.Y = z4;
            boolean g03 = g0();
            if (g02 != g03) {
                if (g03) {
                    z(this.Z);
                } else {
                    h0(this.Z);
                }
                invalidateSelf();
                G();
            }
        }
    }

    public final void a0(float f5) {
        if (this.f120m0 != f5) {
            float B = B();
            this.f120m0 = f5;
            float B2 = B();
            invalidateSelf();
            if (B != B2) {
                G();
            }
        }
    }

    public final void b0(float f5) {
        if (this.f119l0 != f5) {
            float B = B();
            this.f119l0 = f5;
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

    public final void d0(l2.d dVar) {
        m mVar = this.f132y0;
        b bVar = mVar.f2058b;
        TextPaint textPaint = mVar.f2057a;
        if (mVar.f2061f != dVar) {
            mVar.f2061f = dVar;
            if (dVar != null) {
                Context context = this.f126s0;
                dVar.e(context, textPaint, bVar);
                l lVar = (l) mVar.f2060e.get();
                if (lVar != null) {
                    textPaint.drawableState = lVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                mVar.d = true;
            }
            l lVar2 = (l) mVar.f2060e.get();
            if (lVar2 != null) {
                f fVar = (f) lVar2;
                fVar.G();
                fVar.invalidateSelf();
                fVar.onStateChange(lVar2.getState());
            }
        }
    }

    @Override // o2.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i4;
        float f5;
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
        boolean z4 = this.S0;
        Paint paint = this.f127t0;
        RectF rectF = this.f129v0;
        if (!z4) {
            paint.setColor(this.f133z0);
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
            float f6 = bounds.left;
            float f7 = this.Q / 2.0f;
            rectF.set(f6 + f7, bounds.top + f7, bounds.right - f7, bounds.bottom - f7);
            float f8 = this.O - (this.Q / 2.0f);
            canvas2.drawRoundRect(rectF, f8, f8, paint);
        }
        paint.setColor(this.D0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.S0) {
            RectF rectF2 = new RectF(bounds);
            o d = this.f2955g.f2940a.d();
            float[] fArr = this.G;
            float f9 = this.f2955g.i;
            o2.g gVar = this.f2969w;
            q qVar = this.f2970x;
            f5 = 2.0f;
            Path path = this.f131x0;
            qVar.a(d, fArr, f9, rectF2, gVar, path);
            e(canvas2, paint, path, this.f2955g.f2940a.d(), this.G, g());
        } else {
            canvas2.drawRoundRect(rectF, D(), D(), paint);
            f5 = 2.0f;
        }
        if (f0()) {
            A(bounds, rectF);
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas2.translate(f10, f11);
            this.U.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.U.draw(canvas2);
            canvas2.translate(-f10, -f11);
        }
        if (e0()) {
            A(bounds, rectF);
            float f12 = rectF.left;
            float f13 = rectF.top;
            canvas2.translate(f12, f13);
            this.f115g0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f115g0.draw(canvas2);
            canvas2.translate(-f12, -f13);
        }
        if (this.Q0 && this.S != null) {
            PointF pointF = this.f130w0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.S;
            m mVar = this.f132y0;
            if (charSequence != null) {
                float B = B() + this.f118k0 + this.f121n0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + B;
                } else {
                    pointF.x = bounds.right - B;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = mVar.f2057a;
                Paint.FontMetrics fontMetrics = this.f128u0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f5);
            }
            rectF.setEmpty();
            if (this.S != null) {
                float B2 = B() + this.f118k0 + this.f121n0;
                float C = C() + this.f125r0 + this.f122o0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + B2;
                    rectF.right = bounds.right - C;
                } else {
                    rectF.left = bounds.left + C;
                    rectF.right = bounds.right - B2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            l2.d dVar = mVar.f2061f;
            TextPaint textPaint2 = mVar.f2057a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                mVar.f2061f.d(this.f126s0, textPaint2, mVar.f2058b);
            }
            textPaint2.setTextAlign(align);
            boolean z5 = Math.round(mVar.a(this.S.toString())) > Math.round(rectF.width());
            if (z5) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i5 = save;
            } else {
                i5 = 0;
            }
            CharSequence charSequence2 = this.S;
            if (z5 && this.P0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.P0);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z5) {
                canvas2.restoreToCount(i5);
            }
        }
        if (g0()) {
            rectF.setEmpty();
            if (g0()) {
                float f14 = this.f125r0 + this.f124q0;
                if (getLayoutDirection() == 0) {
                    float f15 = bounds.right - f14;
                    rectF.right = f15;
                    rectF.left = f15 - this.f112c0;
                } else {
                    float f16 = bounds.left + f14;
                    rectF.left = f16;
                    rectF.right = f16 + this.f112c0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f17 = this.f112c0;
                float f18 = exactCenterY - (f17 / f5);
                rectF.top = f18;
                rectF.bottom = f18 + f17;
            }
            float f19 = rectF.left;
            float f20 = rectF.top;
            canvas2.translate(f19, f20);
            this.Z.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f110a0.setBounds(this.Z.getBounds());
            this.f110a0.jumpToCurrentState();
            this.f110a0.draw(canvas2);
            canvas2.translate(-f19, -f20);
        }
        if (this.H0 < 255) {
            canvas2.restoreToCount(i4);
        }
    }

    public final boolean e0() {
        return this.f114f0 && this.f115g0 != null && this.F0;
    }

    public final boolean f0() {
        return this.T && this.U != null;
    }

    public final boolean g0() {
        return this.Y && this.Z != null;
    }

    @Override // o2.j, android.graphics.drawable.Drawable
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
        return Math.min(Math.round(C() + this.f132y0.a(this.S.toString()) + B() + this.f118k0 + this.f121n0 + this.f122o0 + this.f125r0), this.R0);
    }

    @Override // o2.j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // o2.j, android.graphics.drawable.Drawable
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

    @Override // o2.j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (E(this.L) || E(this.M) || E(this.P)) {
            return true;
        }
        l2.d dVar = this.f132y0.f2061f;
        if (dVar == null || (colorStateList = dVar.f2713k) == null || !colorStateList.isStateful()) {
            return (this.f114f0 && this.f115g0 != null && this.f113e0) || F(this.U) || F(this.f115g0) || E(this.K0);
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
            onLayoutDirectionChanged |= this.f115g0.setLayoutDirection(i);
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
            onLevelChange |= this.f115g0.setLevel(i);
        }
        if (g0()) {
            onLevelChange |= this.Z.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // o2.j, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.S0) {
            super.onStateChange(iArr);
        }
        return H(iArr, this.M0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // o2.j, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.H0 != i) {
            this.H0 = i;
            invalidateSelf();
        }
    }

    @Override // o2.j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.I0 != colorFilter) {
            this.I0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // o2.j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // o2.j, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.L0 != mode) {
            this.L0 = mode;
            ColorStateList colorStateList = this.K0;
            this.J0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        if (f0()) {
            visible |= this.U.setVisible(z4, z5);
        }
        if (e0()) {
            visible |= this.f115g0.setVisible(z4, z5);
        }
        if (g0()) {
            visible |= this.Z.setVisible(z4, z5);
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
            drawable.setTintList(this.f111b0);
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
