package u1;

import a2.l;
import a2.m;
import a2.n;
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
import g2.g;
import g2.h;
import g2.j;
import g2.o;
import g2.q;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e extends j implements Drawable.Callback, m {
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

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f3403b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f3404c0;

    /* renamed from: d0, reason: collision with root package name */
    public SpannableStringBuilder f3405d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3406e0;
    public boolean f0;

    /* renamed from: g0, reason: collision with root package name */
    public Drawable f3407g0;

    /* renamed from: h0, reason: collision with root package name */
    public ColorStateList f3408h0;

    /* renamed from: i0, reason: collision with root package name */
    public m1.b f3409i0;

    /* renamed from: j0, reason: collision with root package name */
    public m1.b f3410j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f3411k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f3412l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f3413m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f3414n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f3415o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f3416p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f3417q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f3418r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Context f3419s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Paint f3420t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Paint.FontMetrics f3421u0;

    /* renamed from: v0, reason: collision with root package name */
    public final RectF f3422v0;

    /* renamed from: w0, reason: collision with root package name */
    public final PointF f3423w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Path f3424x0;

    /* renamed from: y0, reason: collision with root package name */
    public final n f3425y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3426z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.gglhk.bofio.fortunetiger.R.attr.chipStyle, com.gglhk.bofio.fortunetiger.R.style.Widget_MaterialComponents_Chip_Action);
        this.O = -1.0f;
        this.f3420t0 = new Paint(1);
        this.f3421u0 = new Paint.FontMetrics();
        this.f3422v0 = new RectF();
        this.f3423w0 = new PointF();
        this.f3424x0 = new Path();
        this.H0 = 255;
        this.L0 = PorterDuff.Mode.SRC_IN;
        this.O0 = new WeakReference(null);
        m(context);
        this.f3419s0 = context;
        n nVar = new n(this);
        this.f3425y0 = nVar;
        this.S = "";
        nVar.f58a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = T0;
        setState(iArr);
        U(iArr);
        this.Q0 = true;
        U0.setTint(-1);
    }

    public static boolean B(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean C(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void e0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        if (!this.S0) {
            return this.O;
        }
        float[] fArr = this.G;
        return fArr != null ? fArr[3] : this.g.f1843a.d().f1889e.a(g());
    }

    public final void D() {
        d dVar = (d) this.O0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.f1266u);
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
    public final boolean E(int[] iArr, int[] iArr2) {
        int i4;
        int colorForState;
        int[] state;
        boolean z3;
        boolean z4;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.L;
        int c = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f3426z0) : 0);
        boolean z5 = true;
        if (this.f3426z0 != c) {
            this.f3426z0 = c;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.M;
        int c4 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.A0) : 0);
        if (this.A0 != c4) {
            this.A0 = c4;
            onStateChange = true;
        }
        int b2 = c0.a.b(c4, c);
        if ((this.B0 != b2) | (this.g.c == null)) {
            this.B0 = b2;
            q(ColorStateList.valueOf(b2));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.P;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.C0) : 0;
        if (this.C0 != colorForState3) {
            this.C0 = colorForState3;
            onStateChange = true;
        }
        if (this.N0 != null) {
            int[] iArr3 = e2.a.f1518a;
            boolean z6 = false;
            boolean z7 = false;
            for (int i5 : iArr) {
                if (i5 == 16842910) {
                    z6 = true;
                } else if (i5 == 16842908 || i5 == 16842919 || i5 == 16843623) {
                    z7 = true;
                }
            }
            if (z6 && z7) {
                i4 = this.N0.getColorForState(iArr, this.D0);
                if (this.D0 != i4) {
                    this.D0 = i4;
                }
                d2.d dVar = this.f3425y0.f62f;
                colorForState = (dVar != null || (colorStateList = dVar.f1481k) == null) ? 0 : colorStateList.getColorForState(iArr, this.E0);
                if (this.E0 != colorForState) {
                    this.E0 = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            break;
                        }
                        if (state[i6] != 16842912) {
                            i6++;
                        } else if (this.f3406e0) {
                            z3 = true;
                        }
                    }
                }
                z3 = false;
                if (this.F0 != z3 || this.f3407g0 == null) {
                    z4 = false;
                } else {
                    float y3 = y();
                    this.F0 = z3;
                    if (y3 != y()) {
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
                if (C(this.U)) {
                    z5 |= this.U.setState(iArr);
                }
                if (C(this.f3407g0)) {
                    z5 |= this.f3407g0.setState(iArr);
                }
                if (C(this.Z)) {
                    int[] iArr4 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                    z5 |= this.Z.setState(iArr4);
                }
                if (C(this.a0)) {
                    z5 |= this.a0.setState(iArr2);
                }
                if (z5) {
                    invalidateSelf();
                }
                if (z4) {
                    D();
                }
                return z5;
            }
        }
        i4 = 0;
        if (this.D0 != i4) {
        }
        d2.d dVar2 = this.f3425y0.f62f;
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
        if (C(this.U)) {
        }
        if (C(this.f3407g0)) {
        }
        if (C(this.Z)) {
        }
        if (C(this.a0)) {
        }
        if (z5) {
        }
        if (z4) {
        }
        return z5;
    }

    public final void F(boolean z3) {
        if (this.f3406e0 != z3) {
            this.f3406e0 = z3;
            float y3 = y();
            if (!z3 && this.F0) {
                this.F0 = false;
            }
            float y4 = y();
            invalidateSelf();
            if (y3 != y4) {
                D();
            }
        }
    }

    public final void G(Drawable drawable) {
        if (this.f3407g0 != drawable) {
            float y3 = y();
            this.f3407g0 = drawable;
            float y4 = y();
            e0(this.f3407g0);
            w(this.f3407g0);
            invalidateSelf();
            if (y3 != y4) {
                D();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f3408h0 != colorStateList) {
            this.f3408h0 = colorStateList;
            if (this.f0 && (drawable = this.f3407g0) != null && this.f3406e0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z3) {
        if (this.f0 != z3) {
            boolean b02 = b0();
            this.f0 = z3;
            boolean b03 = b0();
            if (b02 != b03) {
                if (b03) {
                    w(this.f3407g0);
                } else {
                    e0(this.f3407g0);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void J(float f4) {
        if (this.O != f4) {
            this.O = f4;
            setShapeAppearanceModel(i().b(f4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.U;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof d0.b;
            drawable2 = drawable3;
            if (z3) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float y3 = y();
            this.U = drawable != null ? drawable.mutate() : null;
            float y4 = y();
            e0(drawable2);
            if (c0()) {
                w(this.U);
            }
            invalidateSelf();
            if (y3 != y4) {
                D();
            }
        }
    }

    public final void L(float f4) {
        if (this.W != f4) {
            float y3 = y();
            this.W = f4;
            float y4 = y();
            invalidateSelf();
            if (y3 != y4) {
                D();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        this.X = true;
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (c0()) {
                this.U.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z3) {
        if (this.T != z3) {
            boolean c02 = c0();
            this.T = z3;
            boolean c03 = c0();
            if (c02 != c03) {
                if (c03) {
                    w(this.U);
                } else {
                    e0(this.U);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void O(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (this.S0) {
                h hVar = this.g;
                if (hVar.f1845d != colorStateList) {
                    hVar.f1845d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void P(float f4) {
        if (this.Q != f4) {
            this.Q = f4;
            this.f3420t0.setStrokeWidth(f4);
            if (this.S0) {
                this.g.f1849j = f4;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.Z;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof d0.b;
            drawable2 = drawable3;
            if (z3) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float z4 = z();
            this.Z = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(e2.a.a(this.R), this.Z, U0);
            FocusRingDrawable.e(this.f3419s0, rippleDrawable, null);
            this.a0 = rippleDrawable;
            float z5 = z();
            e0(drawable2);
            if (d0()) {
                w(this.Z);
            }
            invalidateSelf();
            if (z4 != z5) {
                D();
            }
        }
    }

    public final void R(float f4) {
        if (this.f3417q0 != f4) {
            this.f3417q0 = f4;
            invalidateSelf();
            if (d0()) {
                D();
            }
        }
    }

    public final void S(float f4) {
        if (this.f3404c0 != f4) {
            this.f3404c0 = f4;
            invalidateSelf();
            if (d0()) {
                D();
            }
        }
    }

    public final void T(float f4) {
        if (this.f3416p0 != f4) {
            this.f3416p0 = f4;
            invalidateSelf();
            if (d0()) {
                D();
            }
        }
    }

    public final boolean U(int[] iArr) {
        if (Arrays.equals(this.M0, iArr)) {
            return false;
        }
        this.M0 = iArr;
        if (d0()) {
            return E(getState(), iArr);
        }
        return false;
    }

    public final void V(ColorStateList colorStateList) {
        if (this.f3403b0 != colorStateList) {
            this.f3403b0 = colorStateList;
            if (d0()) {
                this.Z.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void W(boolean z3) {
        if (this.Y != z3) {
            boolean d02 = d0();
            this.Y = z3;
            boolean d03 = d0();
            if (d02 != d03) {
                if (d03) {
                    w(this.Z);
                } else {
                    e0(this.Z);
                }
                invalidateSelf();
                D();
            }
        }
    }

    public final void X(float f4) {
        if (this.f3413m0 != f4) {
            float y3 = y();
            this.f3413m0 = f4;
            float y4 = y();
            invalidateSelf();
            if (y3 != y4) {
                D();
            }
        }
    }

    public final void Y(float f4) {
        if (this.f3412l0 != f4) {
            float y3 = y();
            this.f3412l0 = f4;
            float y4 = y();
            invalidateSelf();
            if (y3 != y4) {
                D();
            }
        }
    }

    public final void Z(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            this.N0 = null;
            onStateChange(getState());
        }
    }

    public final void a0(d2.d dVar) {
        n nVar = this.f3425y0;
        l lVar = nVar.f59b;
        TextPaint textPaint = nVar.f58a;
        if (nVar.f62f != dVar) {
            nVar.f62f = dVar;
            if (dVar != null) {
                Context context = this.f3419s0;
                dVar.e(context, textPaint, lVar);
                m mVar = (m) nVar.f61e.get();
                if (mVar != null) {
                    textPaint.drawableState = mVar.getState();
                }
                dVar.d(context, textPaint, lVar);
                nVar.f60d = true;
            }
            m mVar2 = (m) nVar.f61e.get();
            if (mVar2 != null) {
                e eVar = (e) mVar2;
                eVar.D();
                eVar.invalidateSelf();
                eVar.onStateChange(mVar2.getState());
            }
        }
    }

    public final boolean b0() {
        return this.f0 && this.f3407g0 != null && this.F0;
    }

    public final boolean c0() {
        return this.T && this.U != null;
    }

    public final boolean d0() {
        return this.Y && this.Z != null;
    }

    @Override // g2.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i4;
        Canvas canvas2;
        int i5;
        float f4;
        int i6;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i4 = this.H0) == 0) {
            return;
        }
        if (i4 < 255) {
            canvas2 = canvas;
            i5 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i4);
        } else {
            canvas2 = canvas;
            i5 = 0;
        }
        boolean z3 = this.S0;
        Paint paint = this.f3420t0;
        RectF rectF = this.f3422v0;
        if (!z3) {
            paint.setColor(this.f3426z0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, A(), A(), paint);
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
            canvas2.drawRoundRect(rectF, A(), A(), paint);
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
            o d4 = this.g.f1843a.d();
            float[] fArr = this.G;
            float f8 = this.g.f1848i;
            g gVar = this.f1872w;
            q qVar = this.f1873x;
            f4 = 2.0f;
            Path path = this.f3424x0;
            qVar.a(d4, fArr, f8, rectF2, gVar, path);
            e(canvas2, paint, path, this.g.f1843a.d(), this.G, g());
        } else {
            canvas2.drawRoundRect(rectF, A(), A(), paint);
            f4 = 2.0f;
        }
        if (c0()) {
            x(bounds, rectF);
            float f9 = rectF.left;
            float f10 = rectF.top;
            canvas2.translate(f9, f10);
            this.U.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.U.draw(canvas2);
            canvas2.translate(-f9, -f10);
        }
        if (b0()) {
            x(bounds, rectF);
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas2.translate(f11, f12);
            this.f3407g0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f3407g0.draw(canvas2);
            canvas2.translate(-f11, -f12);
        }
        if (this.Q0 && this.S != null) {
            PointF pointF = this.f3423w0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.S;
            n nVar = this.f3425y0;
            if (charSequence != null) {
                float y3 = y() + this.f3411k0 + this.f3414n0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + y3;
                } else {
                    pointF.x = bounds.right - y3;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = nVar.f58a;
                Paint.FontMetrics fontMetrics = this.f3421u0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f4);
            }
            rectF.setEmpty();
            if (this.S != null) {
                float y4 = y() + this.f3411k0 + this.f3414n0;
                float z4 = z() + this.f3418r0 + this.f3415o0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + y4;
                    rectF.right = bounds.right - z4;
                } else {
                    rectF.left = bounds.left + z4;
                    rectF.right = bounds.right - y4;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            d2.d dVar = nVar.f62f;
            TextPaint textPaint2 = nVar.f58a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                nVar.f62f.d(this.f3419s0, textPaint2, nVar.f59b);
            }
            textPaint2.setTextAlign(align);
            boolean z5 = Math.round(nVar.a(this.S.toString())) > Math.round(rectF.width());
            if (z5) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i6 = save;
            } else {
                i6 = 0;
            }
            CharSequence charSequence2 = this.S;
            if (z5 && this.P0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.P0);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z5) {
                canvas2.restoreToCount(i6);
            }
        }
        if (d0()) {
            rectF.setEmpty();
            if (d0()) {
                float f13 = this.f3418r0 + this.f3417q0;
                if (getLayoutDirection() == 0) {
                    float f14 = bounds.right - f13;
                    rectF.right = f14;
                    rectF.left = f14 - this.f3404c0;
                } else {
                    float f15 = bounds.left + f13;
                    rectF.left = f15;
                    rectF.right = f15 + this.f3404c0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f16 = this.f3404c0;
                float f17 = exactCenterY - (f16 / f4);
                rectF.top = f17;
                rectF.bottom = f17 + f16;
            }
            float f18 = rectF.left;
            float f19 = rectF.top;
            canvas2.translate(f18, f19);
            this.Z.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.a0.setBounds(this.Z.getBounds());
            this.a0.jumpToCurrentState();
            this.a0.draw(canvas2);
            canvas2.translate(-f18, -f19);
        }
        if (this.H0 < 255) {
            canvas2.restoreToCount(i5);
        }
    }

    @Override // g2.j, android.graphics.drawable.Drawable
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
        return Math.min(Math.round(z() + this.f3425y0.a(this.S.toString()) + y() + this.f3411k0 + this.f3414n0 + this.f3415o0 + this.f3418r0), this.R0);
    }

    @Override // g2.j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // g2.j, android.graphics.drawable.Drawable
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

    @Override // g2.j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (B(this.L) || B(this.M) || B(this.P)) {
            return true;
        }
        d2.d dVar = this.f3425y0.f62f;
        if (dVar == null || (colorStateList = dVar.f1481k) == null || !colorStateList.isStateful()) {
            return (this.f0 && this.f3407g0 != null && this.f3406e0) || C(this.U) || C(this.f3407g0) || B(this.K0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i4) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i4);
        if (c0()) {
            onLayoutDirectionChanged |= this.U.setLayoutDirection(i4);
        }
        if (b0()) {
            onLayoutDirectionChanged |= this.f3407g0.setLayoutDirection(i4);
        }
        if (d0()) {
            onLayoutDirectionChanged |= this.Z.setLayoutDirection(i4);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        boolean onLevelChange = super.onLevelChange(i4);
        if (c0()) {
            onLevelChange |= this.U.setLevel(i4);
        }
        if (b0()) {
            onLevelChange |= this.f3407g0.setLevel(i4);
        }
        if (d0()) {
            onLevelChange |= this.Z.setLevel(i4);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // g2.j, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.S0) {
            super.onStateChange(iArr);
        }
        return E(iArr, this.M0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // g2.j, android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.H0 != i4) {
            this.H0 = i4;
            invalidateSelf();
        }
    }

    @Override // g2.j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.I0 != colorFilter) {
            this.I0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // g2.j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // g2.j, android.graphics.drawable.Drawable
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
        if (c0()) {
            visible |= this.U.setVisible(z3, z4);
        }
        if (b0()) {
            visible |= this.f3407g0.setVisible(z3, z4);
        }
        if (d0()) {
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

    public final void w(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.Z) {
            drawable.setTintList(this.f3403b0);
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

    public final void x(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (c0() || b0()) {
            float f4 = this.f3411k0 + this.f3412l0;
            Drawable drawable = this.F0 ? this.f3407g0 : this.U;
            float f5 = this.W;
            if (f5 <= 0.0f && drawable != null) {
                f5 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f6 = rect.left + f4;
                rectF.left = f6;
                rectF.right = f6 + f5;
            } else {
                float f7 = rect.right - f4;
                rectF.right = f7;
                rectF.left = f7 - f5;
            }
            Drawable drawable2 = this.F0 ? this.f3407g0 : this.U;
            float f8 = this.W;
            if (f8 <= 0.0f && drawable2 != null) {
                f8 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f3419s0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f8) {
                    f8 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f8 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f8;
        }
    }

    public final float y() {
        if (!c0() && !b0()) {
            return 0.0f;
        }
        float f4 = this.f3412l0;
        Drawable drawable = this.F0 ? this.f3407g0 : this.U;
        float f5 = this.W;
        if (f5 <= 0.0f && drawable != null) {
            f5 = drawable.getIntrinsicWidth();
        }
        return f5 + f4 + this.f3413m0;
    }

    public final float z() {
        if (d0()) {
            return this.f3416p0 + this.f3404c0 + this.f3417q0;
        }
        return 0.0f;
    }
}
