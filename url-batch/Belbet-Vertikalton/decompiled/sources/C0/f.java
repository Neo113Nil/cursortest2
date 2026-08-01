package C0;

import H0.j;
import H0.k;
import N0.g;
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
import java.lang.ref.WeakReference;
import java.util.Arrays;
import u0.C0390b;

/* loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, j {

    /* renamed from: F0, reason: collision with root package name */
    public static final int[] f75F0 = {R.attr.state_enabled};

    /* renamed from: G0, reason: collision with root package name */
    public static final ShapeDrawable f76G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f77A;

    /* renamed from: A0, reason: collision with root package name */
    public WeakReference f78A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f79B;

    /* renamed from: B0, reason: collision with root package name */
    public TextUtils.TruncateAt f80B0;

    /* renamed from: C, reason: collision with root package name */
    public float f81C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f82C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f83D;
    public int D0;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f84E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f85E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f86F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f87G;
    public ColorStateList H;

    /* renamed from: I, reason: collision with root package name */
    public float f88I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f89J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f90K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f91L;

    /* renamed from: M, reason: collision with root package name */
    public RippleDrawable f92M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f93N;

    /* renamed from: O, reason: collision with root package name */
    public float f94O;

    /* renamed from: P, reason: collision with root package name */
    public SpannableStringBuilder f95P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f96Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f97R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f98S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f99T;

    /* renamed from: U, reason: collision with root package name */
    public C0390b f100U;

    /* renamed from: V, reason: collision with root package name */
    public C0390b f101V;

    /* renamed from: W, reason: collision with root package name */
    public float f102W;

    /* renamed from: X, reason: collision with root package name */
    public float f103X;

    /* renamed from: Y, reason: collision with root package name */
    public float f104Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f105Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f106a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f107b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f108c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f109d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f110e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f111f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f112g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f113h0;

    /* renamed from: i0, reason: collision with root package name */
    public final PointF f114i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Path f115j0;

    /* renamed from: k0, reason: collision with root package name */
    public final k f116k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f117l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f118m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f119n0;
    public int o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f120p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f121q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f122r0;
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f123t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorFilter f124u0;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuffColorFilter f125v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f126w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f127x;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuff.Mode f128x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f129y;

    /* renamed from: y0, reason: collision with root package name */
    public int[] f130y0;

    /* renamed from: z, reason: collision with root package name */
    public float f131z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f132z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winpower.neonfit.R.attr.chipStyle, com.winpower.neonfit.R.style.Widget_MaterialComponents_Chip_Action);
        this.f77A = -1.0f;
        this.f111f0 = new Paint(1);
        this.f112g0 = new Paint.FontMetrics();
        this.f113h0 = new RectF();
        this.f114i0 = new PointF();
        this.f115j0 = new Path();
        this.f123t0 = 255;
        this.f128x0 = PorterDuff.Mode.SRC_IN;
        this.f78A0 = new WeakReference(null);
        h(context);
        this.f110e0 = context;
        k kVar = new k(this);
        this.f116k0 = kVar;
        this.f84E = "";
        kVar.f532a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f75F0;
        setState(iArr);
        if (!Arrays.equals(this.f130y0, iArr)) {
            this.f130y0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f82C0 = true;
        int[] iArr2 = L0.a.f693a;
        f76G0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f2) {
        if (this.f77A != f2) {
            this.f77A = f2;
            N0.j e = this.f900a.f886a.e();
            e.e = new N0.a(f2);
            e.f924f = new N0.a(f2);
            e.f925g = new N0.a(f2);
            e.f926h = new N0.a(f2);
            setShapeAppearanceModel(e.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f87G;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof F.d;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p2 = p();
            this.f87G = drawable != null ? drawable.mutate() : null;
            float p3 = p();
            U(drawable2);
            if (S()) {
                n(this.f87G);
            }
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.f88I != f2) {
            float p2 = p();
            this.f88I = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f89J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (S()) {
                F.a.h(this.f87G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z2) {
        if (this.f86F != z2) {
            boolean S2 = S();
            this.f86F = z2;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    n(this.f87G);
                } else {
                    U(this.f87G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f79B != colorStateList) {
            this.f79B = colorStateList;
            if (this.f85E0) {
                N0.f fVar = this.f900a;
                if (fVar.f889d != colorStateList) {
                    fVar.f889d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.f81C != f2) {
            this.f81C = f2;
            this.f111f0.setStrokeWidth(f2);
            if (this.f85E0) {
                this.f900a.j = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f91L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof F.d;
            drawable2 = drawable3;
            if (z2) {
            }
            if (drawable2 == drawable) {
                float q2 = q();
                this.f91L = drawable != null ? drawable.mutate() : null;
                int[] iArr = L0.a.f693a;
                this.f92M = new RippleDrawable(L0.a.a(this.f83D), this.f91L, f76G0);
                float q3 = q();
                U(drawable2);
                if (T()) {
                    n(this.f91L);
                }
                invalidateSelf();
                if (q2 != q3) {
                    u();
                    return;
                }
                return;
            }
            return;
        }
        drawable2 = null;
        if (drawable2 == drawable) {
        }
    }

    public final void I(float f2) {
        if (this.f108c0 != f2) {
            this.f108c0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.f94O != f2) {
            this.f94O = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.f107b0 != f2) {
            this.f107b0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f93N != colorStateList) {
            this.f93N = colorStateList;
            if (T()) {
                F.a.h(this.f91L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.f90K != z2) {
            boolean T2 = T();
            this.f90K = z2;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.f91L);
                } else {
                    U(this.f91L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.f104Y != f2) {
            float p2 = p();
            this.f104Y = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.f103X != f2) {
            float p2 = p();
            this.f103X = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f83D != colorStateList) {
            this.f83D = colorStateList;
            this.f132z0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(K0.d dVar) {
        k kVar = this.f116k0;
        if (kVar.f536f != dVar) {
            kVar.f536f = dVar;
            if (dVar != null) {
                TextPaint textPaint = kVar.f532a;
                Context context = this.f110e0;
                b bVar = kVar.f533b;
                dVar.f(context, textPaint, bVar);
                j jVar = (j) kVar.e.get();
                if (jVar != null) {
                    textPaint.drawableState = jVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                kVar.f535d = true;
            }
            j jVar2 = (j) kVar.e.get();
            if (jVar2 != null) {
                f fVar = (f) jVar2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(jVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f97R && this.f98S != null && this.f122r0;
    }

    public final boolean S() {
        return this.f86F && this.f87G != null;
    }

    public final boolean T() {
        return this.f90K && this.f91L != null;
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f123t0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z2 = this.f85E0;
        Paint paint = this.f111f0;
        RectF rectF3 = this.f113h0;
        if (!z2) {
            paint.setColor(this.f117l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (!this.f85E0) {
            paint.setColor(this.f118m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f124u0;
            if (colorFilter == null) {
                colorFilter = this.f125v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (this.f85E0) {
            super.draw(canvas);
        }
        if (this.f81C > 0.0f && !this.f85E0) {
            paint.setColor(this.o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f85E0) {
                ColorFilter colorFilter2 = this.f124u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f125v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f81C / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f77A - (this.f81C / 2.0f);
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        paint.setColor(this.f120p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f85E0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f115j0;
            N0.f fVar = this.f900a;
            this.f914r.a(fVar.f886a, fVar.i, rectF4, this.f913q, path);
            d(canvas, paint, path, this.f900a.f886a, f());
        } else {
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.f87G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f87G.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (R()) {
            o(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.f98S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f98S.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.f82C0 || this.f84E == null) {
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f114i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f84E;
            k kVar = this.f116k0;
            if (charSequence != null) {
                float p2 = p() + this.f102W + this.f105Z;
                if (F.b.a(this) == 0) {
                    pointF.x = bounds.left + p2;
                } else {
                    pointF.x = bounds.right - p2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = kVar.f532a;
                Paint.FontMetrics fontMetrics = this.f112g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f84E != null) {
                float p3 = p() + this.f102W + this.f105Z;
                float q2 = q() + this.f109d0 + this.f106a0;
                if (F.b.a(this) == 0) {
                    rectF3.left = bounds.left + p3;
                    rectF3.right = bounds.right - q2;
                } else {
                    rectF3.left = bounds.left + q2;
                    rectF3.right = bounds.right - p3;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            K0.d dVar = kVar.f536f;
            TextPaint textPaint2 = kVar.f532a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                kVar.f536f.e(this.f110e0, textPaint2, kVar.f533b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(kVar.a(this.f84E.toString())) > Math.round(rectF3.width());
            if (z3) {
                i5 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i5 = 0;
            }
            CharSequence charSequence2 = this.f84E;
            if (z3 && this.f80B0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f80B0);
            }
            CharSequence charSequence3 = charSequence2;
            int length = charSequence3.length();
            float f9 = pointF.x;
            float f10 = pointF.y;
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence3, 0, length, f9, f10, textPaint2);
            if (z3) {
                canvas.restoreToCount(i5);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f11 = this.f109d0 + this.f108c0;
                if (F.b.a(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.f94O;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.f94O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.f94O;
                float f15 = exactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.f91L.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = L0.a.f693a;
            this.f92M.setBounds(this.f91L.getBounds());
            this.f92M.jumpToCurrentState();
            this.f92M.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.f123t0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f123t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f124u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f131z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f116k0.a(this.f84E.toString()) + p() + this.f102W + this.f105Z + this.f106a0 + this.f109d0), this.D0);
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f85E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f131z, this.f77A);
        } else {
            outline.setRoundRect(bounds, this.f77A);
        }
        outline.setAlpha(this.f123t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        K0.d dVar;
        ColorStateList colorStateList;
        return s(this.f127x) || s(this.f129y) || s(this.f79B) || !((dVar = this.f116k0.f536f) == null || (colorStateList = dVar.j) == null || !colorStateList.isStateful()) || ((this.f97R && this.f98S != null && this.f96Q) || t(this.f87G) || t(this.f98S) || s(this.f126w0));
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        F.b.b(drawable, F.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f91L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f130y0);
            }
            F.a.h(drawable, this.f93N);
            return;
        }
        Drawable drawable2 = this.f87G;
        if (drawable == drawable2 && this.f89J) {
            F.a.h(drawable2, this.H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.f102W + this.f103X;
            Drawable drawable = this.f122r0 ? this.f98S : this.f87G;
            float f3 = this.f88I;
            if (f3 <= 0.0f && drawable != null) {
                f3 = drawable.getIntrinsicWidth();
            }
            if (F.b.a(this) == 0) {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            Drawable drawable2 = this.f122r0 ? this.f98S : this.f87G;
            float f6 = this.f88I;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f110e0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f6) {
                    f6 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f6 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            onLayoutDirectionChanged |= F.b.b(this.f87G, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= F.b.b(this.f98S, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= F.b.b(this.f91L, i);
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
        if (S()) {
            onLevelChange |= this.f87G.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f98S.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.f91L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f85E0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f130y0);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f2 = this.f103X;
        Drawable drawable = this.f122r0 ? this.f98S : this.f87G;
        float f3 = this.f88I;
        if (f3 <= 0.0f && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f104Y;
    }

    public final float q() {
        if (T()) {
            return this.f107b0 + this.f94O + this.f108c0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.f85E0 ? this.f900a.f886a.e.a(f()) : this.f77A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f123t0 != i) {
            this.f123t0 = i;
            invalidateSelf();
        }
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f124u0 != colorFilter) {
            this.f124u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f126w0 != colorStateList) {
            this.f126w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f128x0 != mode) {
            this.f128x0 = mode;
            ColorStateList colorStateList = this.f126w0;
            this.f125v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (S()) {
            visible |= this.f87G.setVisible(z2, z3);
        }
        if (R()) {
            visible |= this.f98S.setVisible(z2, z3);
        }
        if (T()) {
            visible |= this.f91L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.f78A0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f2345p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(int[] iArr, int[] iArr2) {
        boolean z2;
        boolean z3;
        int colorForState;
        ColorStateList colorStateList;
        boolean z4 = true;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f127x;
        int b2 = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f117l0) : 0);
        if (this.f117l0 != b2) {
            this.f117l0 = b2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f129y;
        int b3 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f118m0) : 0);
        if (this.f118m0 != b3) {
            this.f118m0 = b3;
            onStateChange = true;
        }
        int b4 = E.a.b(b3, b2);
        if ((this.f119n0 != b4) | (this.f900a.f888c == null)) {
            this.f119n0 = b4;
            j(ColorStateList.valueOf(b4));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f79B;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.o0) : 0;
        if (this.o0 != colorForState2) {
            this.o0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f132z0 == null || !L0.a.b(iArr)) ? 0 : this.f132z0.getColorForState(iArr, this.f120p0);
        if (this.f120p0 != colorForState3) {
            this.f120p0 = colorForState3;
        }
        K0.d dVar = this.f116k0.f536f;
        int colorForState4 = (dVar == null || (colorStateList = dVar.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f121q0);
        if (this.f121q0 != colorForState4) {
            this.f121q0 = colorForState4;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state[i] != 16842912) {
                    i++;
                } else if (this.f96Q) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (this.f122r0 != z2 && this.f98S != null) {
            float p2 = p();
            this.f122r0 = z2;
            if (p2 != p()) {
                onStateChange = true;
                z3 = true;
                ColorStateList colorStateList5 = this.f126w0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.s0) : 0;
                if (this.s0 == colorForState) {
                    this.s0 = colorForState;
                    ColorStateList colorStateList6 = this.f126w0;
                    PorterDuff.Mode mode = this.f128x0;
                    this.f125v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z4 = onStateChange;
                }
                if (t(this.f87G)) {
                    z4 |= this.f87G.setState(iArr);
                }
                if (t(this.f98S)) {
                    z4 |= this.f98S.setState(iArr);
                }
                if (t(this.f91L)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z4 |= this.f91L.setState(iArr3);
                }
                int[] iArr4 = L0.a.f693a;
                if (t(this.f92M)) {
                    z4 |= this.f92M.setState(iArr2);
                }
                if (z4) {
                    invalidateSelf();
                }
                if (z3) {
                    u();
                }
                return z4;
            }
            onStateChange = true;
        }
        z3 = false;
        ColorStateList colorStateList52 = this.f126w0;
        if (colorStateList52 == null) {
        }
        if (this.s0 == colorForState) {
        }
        if (t(this.f87G)) {
        }
        if (t(this.f98S)) {
        }
        if (t(this.f91L)) {
        }
        int[] iArr42 = L0.a.f693a;
        if (t(this.f92M)) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z4;
    }

    public final void w(boolean z2) {
        if (this.f96Q != z2) {
            this.f96Q = z2;
            float p2 = p();
            if (!z2 && this.f122r0) {
                this.f122r0 = false;
            }
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f98S != drawable) {
            float p2 = p();
            this.f98S = drawable;
            float p3 = p();
            U(this.f98S);
            n(this.f98S);
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f99T != colorStateList) {
            this.f99T = colorStateList;
            if (this.f97R && (drawable = this.f98S) != null && this.f96Q) {
                F.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.f97R != z2) {
            boolean R2 = R();
            this.f97R = z2;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f98S);
                } else {
                    U(this.f98S);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
