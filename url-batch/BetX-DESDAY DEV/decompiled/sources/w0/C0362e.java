package w0;

import B0.k;
import B0.l;
import B0.m;
import H0.f;
import H0.g;
import H0.j;
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
import o0.C0308b;

/* renamed from: w0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362e extends g implements Drawable.Callback, l {

    /* renamed from: F0, reason: collision with root package name */
    public static final int[] f4534F0 = {R.attr.state_enabled};

    /* renamed from: G0, reason: collision with root package name */
    public static final ShapeDrawable f4535G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f4536A;

    /* renamed from: A0, reason: collision with root package name */
    public WeakReference f4537A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f4538B;

    /* renamed from: B0, reason: collision with root package name */
    public TextUtils.TruncateAt f4539B0;

    /* renamed from: C, reason: collision with root package name */
    public float f4540C;
    public boolean C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f4541D;

    /* renamed from: D0, reason: collision with root package name */
    public int f4542D0;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f4543E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f4544E0;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f4545G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f4546H;

    /* renamed from: I, reason: collision with root package name */
    public float f4547I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f4548J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4549K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f4550L;

    /* renamed from: M, reason: collision with root package name */
    public RippleDrawable f4551M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f4552N;

    /* renamed from: O, reason: collision with root package name */
    public float f4553O;

    /* renamed from: P, reason: collision with root package name */
    public SpannableStringBuilder f4554P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f4555Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4556R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f4557S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f4558T;

    /* renamed from: U, reason: collision with root package name */
    public C0308b f4559U;

    /* renamed from: V, reason: collision with root package name */
    public C0308b f4560V;

    /* renamed from: W, reason: collision with root package name */
    public float f4561W;

    /* renamed from: X, reason: collision with root package name */
    public float f4562X;

    /* renamed from: Y, reason: collision with root package name */
    public float f4563Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f4564Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f4565a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f4566b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f4567c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f4568d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f4569e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f4570f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f4571g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f4572h0;
    public final PointF i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Path f4573j0;

    /* renamed from: k0, reason: collision with root package name */
    public final m f4574k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f4575l0;
    public int m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f4576n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f4577o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f4578p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f4579q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f4580r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f4581s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4582t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorFilter f4583u0;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuffColorFilter f4584v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f4585w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f4586x;
    public PorterDuff.Mode x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f4587y;

    /* renamed from: y0, reason: collision with root package name */
    public int[] f4588y0;

    /* renamed from: z, reason: collision with root package name */
    public float f4589z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f4590z0;

    public C0362e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.luckyarcade.spinthrow.R.attr.chipStyle, com.luckyarcade.spinthrow.R.style.Widget_MaterialComponents_Chip_Action);
        this.f4536A = -1.0f;
        this.f4570f0 = new Paint(1);
        this.f4571g0 = new Paint.FontMetrics();
        this.f4572h0 = new RectF();
        this.i0 = new PointF();
        this.f4573j0 = new Path();
        this.f4582t0 = 255;
        this.x0 = PorterDuff.Mode.SRC_IN;
        this.f4537A0 = new WeakReference(null);
        h(context);
        this.f4569e0 = context;
        m mVar = new m(this);
        this.f4574k0 = mVar;
        this.f4543E = "";
        mVar.f140a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f4534F0;
        setState(iArr);
        if (!Arrays.equals(this.f4588y0, iArr)) {
            this.f4588y0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.C0 = true;
        int[] iArr2 = F0.a.f194a;
        f4535G0.setTint(-1);
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
        if (this.f4536A != f2) {
            this.f4536A = f2;
            j e2 = this.f272a.f257a.e();
            e2.f297e = new H0.a(f2);
            e2.f298f = new H0.a(f2);
            e2.f299g = new H0.a(f2);
            e2.h = new H0.a(f2);
            setShapeAppearanceModel(e2.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4545G;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof D.d;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p2 = p();
            this.f4545G = drawable != null ? drawable.mutate() : null;
            float p3 = p();
            U(drawable2);
            if (S()) {
                n(this.f4545G);
            }
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.f4547I != f2) {
            float p2 = p();
            this.f4547I = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f4548J = true;
        if (this.f4546H != colorStateList) {
            this.f4546H = colorStateList;
            if (S()) {
                D.a.h(this.f4545G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z2) {
        if (this.F != z2) {
            boolean S2 = S();
            this.F = z2;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    n(this.f4545G);
                } else {
                    U(this.f4545G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f4538B != colorStateList) {
            this.f4538B = colorStateList;
            if (this.f4544E0) {
                f fVar = this.f272a;
                if (fVar.f260d != colorStateList) {
                    fVar.f260d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.f4540C != f2) {
            this.f4540C = f2;
            this.f4570f0.setStrokeWidth(f2);
            if (this.f4544E0) {
                this.f272a.f264j = f2;
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
        Drawable drawable3 = this.f4550L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof D.d;
            drawable2 = drawable3;
            if (z2) {
            }
            if (drawable2 == drawable) {
                float q2 = q();
                this.f4550L = drawable != null ? drawable.mutate() : null;
                int[] iArr = F0.a.f194a;
                this.f4551M = new RippleDrawable(F0.a.a(this.f4541D), this.f4550L, f4535G0);
                float q3 = q();
                U(drawable2);
                if (T()) {
                    n(this.f4550L);
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
        if (this.f4567c0 != f2) {
            this.f4567c0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.f4553O != f2) {
            this.f4553O = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.f4566b0 != f2) {
            this.f4566b0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f4552N != colorStateList) {
            this.f4552N = colorStateList;
            if (T()) {
                D.a.h(this.f4550L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.f4549K != z2) {
            boolean T2 = T();
            this.f4549K = z2;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.f4550L);
                } else {
                    U(this.f4550L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.f4563Y != f2) {
            float p2 = p();
            this.f4563Y = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.f4562X != f2) {
            float p2 = p();
            this.f4562X = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f4541D != colorStateList) {
            this.f4541D = colorStateList;
            this.f4590z0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(E0.d dVar) {
        m mVar = this.f4574k0;
        if (mVar.f145f != dVar) {
            mVar.f145f = dVar;
            if (dVar != null) {
                TextPaint textPaint = mVar.f140a;
                Context context = this.f4569e0;
                k kVar = mVar.f141b;
                dVar.f(context, textPaint, kVar);
                l lVar = (l) mVar.f144e.get();
                if (lVar != null) {
                    textPaint.drawableState = lVar.getState();
                }
                dVar.e(context, textPaint, kVar);
                mVar.f143d = true;
            }
            l lVar2 = (l) mVar.f144e.get();
            if (lVar2 != null) {
                C0362e c0362e = (C0362e) lVar2;
                c0362e.u();
                c0362e.invalidateSelf();
                c0362e.onStateChange(lVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f4556R && this.f4557S != null && this.f4580r0;
    }

    public final boolean S() {
        return this.F && this.f4545G != null;
    }

    public final boolean T() {
        return this.f4549K && this.f4550L != null;
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f4582t0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z2 = this.f4544E0;
        Paint paint = this.f4570f0;
        RectF rectF3 = this.f4572h0;
        if (!z2) {
            paint.setColor(this.f4575l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (!this.f4544E0) {
            paint.setColor(this.m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f4583u0;
            if (colorFilter == null) {
                colorFilter = this.f4584v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (this.f4544E0) {
            super.draw(canvas);
        }
        if (this.f4540C > 0.0f && !this.f4544E0) {
            paint.setColor(this.f4577o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f4544E0) {
                ColorFilter colorFilter2 = this.f4583u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f4584v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f4540C / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f4536A - (this.f4540C / 2.0f);
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        paint.setColor(this.f4578p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f4544E0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f4573j0;
            f fVar = this.f272a;
            this.f287r.a(fVar.f257a, fVar.i, rectF4, this.f286q, path);
            d(canvas, paint, path, this.f272a.f257a, f());
        } else {
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.f4545G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f4545G.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (R()) {
            o(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.f4557S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f4557S.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.C0 || this.f4543E == null) {
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f4543E;
            m mVar = this.f4574k0;
            if (charSequence != null) {
                float p2 = p() + this.f4561W + this.f4564Z;
                if (D.b.a(this) == 0) {
                    pointF.x = bounds.left + p2;
                } else {
                    pointF.x = bounds.right - p2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = mVar.f140a;
                Paint.FontMetrics fontMetrics = this.f4571g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f4543E != null) {
                float p3 = p() + this.f4561W + this.f4564Z;
                float q2 = q() + this.f4568d0 + this.f4565a0;
                if (D.b.a(this) == 0) {
                    rectF3.left = bounds.left + p3;
                    rectF3.right = bounds.right - q2;
                } else {
                    rectF3.left = bounds.left + q2;
                    rectF3.right = bounds.right - p3;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            E0.d dVar = mVar.f145f;
            TextPaint textPaint2 = mVar.f140a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                mVar.f145f.e(this.f4569e0, textPaint2, mVar.f141b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(mVar.a(this.f4543E.toString())) > Math.round(rectF3.width());
            if (z3) {
                i5 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i5 = 0;
            }
            CharSequence charSequence2 = this.f4543E;
            if (z3 && this.f4539B0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f4539B0);
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
                float f11 = this.f4568d0 + this.f4567c0;
                if (D.b.a(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.f4553O;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.f4553O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.f4553O;
                float f15 = exactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.f4550L.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = F0.a.f194a;
            this.f4551M.setBounds(this.f4550L.getBounds());
            this.f4551M.jumpToCurrentState();
            this.f4551M.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.f4582t0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4582t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f4583u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f4589z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f4574k0.a(this.f4543E.toString()) + p() + this.f4561W + this.f4564Z + this.f4565a0 + this.f4568d0), this.f4542D0);
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f4544E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f4589z, this.f4536A);
        } else {
            outline.setRoundRect(bounds, this.f4536A);
        }
        outline.setAlpha(this.f4582t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        E0.d dVar;
        ColorStateList colorStateList;
        return s(this.f4586x) || s(this.f4587y) || s(this.f4538B) || !((dVar = this.f4574k0.f145f) == null || (colorStateList = dVar.f189j) == null || !colorStateList.isStateful()) || ((this.f4556R && this.f4557S != null && this.f4555Q) || t(this.f4545G) || t(this.f4557S) || s(this.f4585w0));
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        D.b.b(drawable, D.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f4550L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f4588y0);
            }
            D.a.h(drawable, this.f4552N);
            return;
        }
        Drawable drawable2 = this.f4545G;
        if (drawable == drawable2 && this.f4548J) {
            D.a.h(drawable2, this.f4546H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.f4561W + this.f4562X;
            Drawable drawable = this.f4580r0 ? this.f4557S : this.f4545G;
            float f3 = this.f4547I;
            if (f3 <= 0.0f && drawable != null) {
                f3 = drawable.getIntrinsicWidth();
            }
            if (D.b.a(this) == 0) {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            Drawable drawable2 = this.f4580r0 ? this.f4557S : this.f4545G;
            float f6 = this.f4547I;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f4569e0.getResources().getDisplayMetrics()));
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
            onLayoutDirectionChanged |= D.b.b(this.f4545G, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= D.b.b(this.f4557S, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= D.b.b(this.f4550L, i);
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
            onLevelChange |= this.f4545G.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f4557S.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.f4550L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f4544E0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f4588y0);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f2 = this.f4562X;
        Drawable drawable = this.f4580r0 ? this.f4557S : this.f4545G;
        float f3 = this.f4547I;
        if (f3 <= 0.0f && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f4563Y;
    }

    public final float q() {
        if (T()) {
            return this.f4566b0 + this.f4553O + this.f4567c0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.f4544E0 ? this.f272a.f257a.f307e.a(f()) : this.f4536A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f4582t0 != i) {
            this.f4582t0 = i;
            invalidateSelf();
        }
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4583u0 != colorFilter) {
            this.f4583u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4585w0 != colorStateList) {
            this.f4585w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.x0 != mode) {
            this.x0 = mode;
            ColorStateList colorStateList = this.f4585w0;
            this.f4584v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (S()) {
            visible |= this.f4545G.setVisible(z2, z3);
        }
        if (R()) {
            visible |= this.f4557S.setVisible(z2, z3);
        }
        if (T()) {
            visible |= this.f4550L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        InterfaceC0361d interfaceC0361d = (InterfaceC0361d) this.f4537A0.get();
        if (interfaceC0361d != null) {
            Chip chip = (Chip) interfaceC0361d;
            chip.b(chip.f1823p);
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
        ColorStateList colorStateList2 = this.f4586x;
        int b2 = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f4575l0) : 0);
        if (this.f4575l0 != b2) {
            this.f4575l0 = b2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f4587y;
        int b3 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.m0) : 0);
        if (this.m0 != b3) {
            this.m0 = b3;
            onStateChange = true;
        }
        int b4 = C.a.b(b3, b2);
        if ((this.f4576n0 != b4) | (this.f272a.f259c == null)) {
            this.f4576n0 = b4;
            j(ColorStateList.valueOf(b4));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f4538B;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f4577o0) : 0;
        if (this.f4577o0 != colorForState2) {
            this.f4577o0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f4590z0 == null || !F0.a.b(iArr)) ? 0 : this.f4590z0.getColorForState(iArr, this.f4578p0);
        if (this.f4578p0 != colorForState3) {
            this.f4578p0 = colorForState3;
        }
        E0.d dVar = this.f4574k0.f145f;
        int colorForState4 = (dVar == null || (colorStateList = dVar.f189j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f4579q0);
        if (this.f4579q0 != colorForState4) {
            this.f4579q0 = colorForState4;
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
                } else if (this.f4555Q) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (this.f4580r0 != z2 && this.f4557S != null) {
            float p2 = p();
            this.f4580r0 = z2;
            if (p2 != p()) {
                onStateChange = true;
                z3 = true;
                ColorStateList colorStateList5 = this.f4585w0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f4581s0) : 0;
                if (this.f4581s0 == colorForState) {
                    this.f4581s0 = colorForState;
                    ColorStateList colorStateList6 = this.f4585w0;
                    PorterDuff.Mode mode = this.x0;
                    this.f4584v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z4 = onStateChange;
                }
                if (t(this.f4545G)) {
                    z4 |= this.f4545G.setState(iArr);
                }
                if (t(this.f4557S)) {
                    z4 |= this.f4557S.setState(iArr);
                }
                if (t(this.f4550L)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z4 |= this.f4550L.setState(iArr3);
                }
                int[] iArr4 = F0.a.f194a;
                if (t(this.f4551M)) {
                    z4 |= this.f4551M.setState(iArr2);
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
        ColorStateList colorStateList52 = this.f4585w0;
        if (colorStateList52 == null) {
        }
        if (this.f4581s0 == colorForState) {
        }
        if (t(this.f4545G)) {
        }
        if (t(this.f4557S)) {
        }
        if (t(this.f4550L)) {
        }
        int[] iArr42 = F0.a.f194a;
        if (t(this.f4551M)) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z4;
    }

    public final void w(boolean z2) {
        if (this.f4555Q != z2) {
            this.f4555Q = z2;
            float p2 = p();
            if (!z2 && this.f4580r0) {
                this.f4580r0 = false;
            }
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f4557S != drawable) {
            float p2 = p();
            this.f4557S = drawable;
            float p3 = p();
            U(this.f4557S);
            n(this.f4557S);
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f4558T != colorStateList) {
            this.f4558T = colorStateList;
            if (this.f4556R && (drawable = this.f4557S) != null && this.f4555Q) {
                D.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.f4556R != z2) {
            boolean R2 = R();
            this.f4556R = z2;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f4557S);
                } else {
                    U(this.f4557S);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
