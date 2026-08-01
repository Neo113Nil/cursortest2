package z0;

import E0.k;
import E0.l;
import K0.f;
import K0.g;
import K0.j;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import r0.C0293b;

/* loaded from: classes.dex */
public final class e extends g implements Drawable.Callback, k {
    public static final int[] F0 = {R.attr.state_enabled};

    /* renamed from: G0, reason: collision with root package name */
    public static final ShapeDrawable f4362G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f4363A;
    public WeakReference A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f4364B;

    /* renamed from: B0, reason: collision with root package name */
    public TextUtils.TruncateAt f4365B0;

    /* renamed from: C, reason: collision with root package name */
    public float f4366C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f4367C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f4368D;

    /* renamed from: D0, reason: collision with root package name */
    public int f4369D0;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f4370E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f4371E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f4372F;
    public Drawable G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f4373H;

    /* renamed from: I, reason: collision with root package name */
    public float f4374I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f4375J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4376K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f4377L;

    /* renamed from: M, reason: collision with root package name */
    public RippleDrawable f4378M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f4379N;

    /* renamed from: O, reason: collision with root package name */
    public float f4380O;

    /* renamed from: P, reason: collision with root package name */
    public SpannableStringBuilder f4381P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f4382Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4383R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f4384S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f4385T;

    /* renamed from: U, reason: collision with root package name */
    public C0293b f4386U;

    /* renamed from: V, reason: collision with root package name */
    public C0293b f4387V;

    /* renamed from: W, reason: collision with root package name */
    public float f4388W;

    /* renamed from: X, reason: collision with root package name */
    public float f4389X;

    /* renamed from: Y, reason: collision with root package name */
    public float f4390Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f4391Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f4392a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f4393b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f4394c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f4395d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f4396e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f4397f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f4398g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f4399h0;

    /* renamed from: i0, reason: collision with root package name */
    public final PointF f4400i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Path f4401j0;

    /* renamed from: k0, reason: collision with root package name */
    public final l f4402k0;
    public int l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f4403m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f4404n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f4405o0;
    public int p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f4406q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f4407r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f4408s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4409t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorFilter f4410u0;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuffColorFilter f4411v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f4412w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f4413x;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuff.Mode f4414x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f4415y;

    /* renamed from: y0, reason: collision with root package name */
    public int[] f4416y0;

    /* renamed from: z, reason: collision with root package name */
    public float f4417z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f4418z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winfour.winrandom.R.attr.chipStyle, com.winfour.winrandom.R.style.Widget_MaterialComponents_Chip_Action);
        this.f4363A = -1.0f;
        this.f4397f0 = new Paint(1);
        this.f4398g0 = new Paint.FontMetrics();
        this.f4399h0 = new RectF();
        this.f4400i0 = new PointF();
        this.f4401j0 = new Path();
        this.f4409t0 = 255;
        this.f4414x0 = PorterDuff.Mode.SRC_IN;
        this.A0 = new WeakReference(null);
        h(context);
        this.f4396e0 = context;
        l lVar = new l(this);
        this.f4402k0 = lVar;
        this.f4370E = "";
        lVar.f217a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = F0;
        setState(iArr);
        if (!Arrays.equals(this.f4416y0, iArr)) {
            this.f4416y0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f4367C0 = true;
        int[] iArr2 = I0.a.f345a;
        f4362G0.setTint(-1);
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
        if (this.f4363A != f2) {
            this.f4363A = f2;
            j e2 = this.f397a.f382a.e();
            e2.f421e = new K0.a(f2);
            e2.f422f = new K0.a(f2);
            e2.f423g = new K0.a(f2);
            e2.f424h = new K0.a(f2);
            setShapeAppearanceModel(e2.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.G;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof E.d;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p2 = p();
            this.G = drawable != null ? drawable.mutate() : null;
            float p3 = p();
            U(drawable2);
            if (S()) {
                n(this.G);
            }
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.f4374I != f2) {
            float p2 = p();
            this.f4374I = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f4375J = true;
        if (this.f4373H != colorStateList) {
            this.f4373H = colorStateList;
            if (S()) {
                E.a.h(this.G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z2) {
        if (this.f4372F != z2) {
            boolean S2 = S();
            this.f4372F = z2;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    n(this.G);
                } else {
                    U(this.G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f4364B != colorStateList) {
            this.f4364B = colorStateList;
            if (this.f4371E0) {
                f fVar = this.f397a;
                if (fVar.d != colorStateList) {
                    fVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.f4366C != f2) {
            this.f4366C = f2;
            this.f4397f0.setStrokeWidth(f2);
            if (this.f4371E0) {
                this.f397a.f389j = f2;
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
        Drawable drawable3 = this.f4377L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof E.d;
            drawable2 = drawable3;
            if (z2) {
            }
            if (drawable2 == drawable) {
                float q2 = q();
                this.f4377L = drawable != null ? drawable.mutate() : null;
                int[] iArr = I0.a.f345a;
                this.f4378M = new RippleDrawable(I0.a.a(this.f4368D), this.f4377L, f4362G0);
                float q3 = q();
                U(drawable2);
                if (T()) {
                    n(this.f4377L);
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
        if (this.f4394c0 != f2) {
            this.f4394c0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.f4380O != f2) {
            this.f4380O = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.f4393b0 != f2) {
            this.f4393b0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f4379N != colorStateList) {
            this.f4379N = colorStateList;
            if (T()) {
                E.a.h(this.f4377L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.f4376K != z2) {
            boolean T2 = T();
            this.f4376K = z2;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.f4377L);
                } else {
                    U(this.f4377L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.f4390Y != f2) {
            float p2 = p();
            this.f4390Y = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.f4389X != f2) {
            float p2 = p();
            this.f4389X = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f4368D != colorStateList) {
            this.f4368D = colorStateList;
            this.f4418z0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(H0.d dVar) {
        l lVar = this.f4402k0;
        if (lVar.f221f != dVar) {
            lVar.f221f = dVar;
            if (dVar != null) {
                TextPaint textPaint = lVar.f217a;
                Context context = this.f4396e0;
                E0.j jVar = lVar.f218b;
                dVar.f(context, textPaint, jVar);
                k kVar = (k) lVar.f220e.get();
                if (kVar != null) {
                    textPaint.drawableState = kVar.getState();
                }
                dVar.e(context, textPaint, jVar);
                lVar.d = true;
            }
            k kVar2 = (k) lVar.f220e.get();
            if (kVar2 != null) {
                e eVar = (e) kVar2;
                eVar.u();
                eVar.invalidateSelf();
                eVar.onStateChange(kVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f4383R && this.f4384S != null && this.f4407r0;
    }

    public final boolean S() {
        return this.f4372F && this.G != null;
    }

    public final boolean T() {
        return this.f4376K && this.f4377L != null;
    }

    @Override // K0.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f4409t0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z2 = this.f4371E0;
        Paint paint = this.f4397f0;
        RectF rectF3 = this.f4399h0;
        if (!z2) {
            paint.setColor(this.l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (!this.f4371E0) {
            paint.setColor(this.f4403m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f4410u0;
            if (colorFilter == null) {
                colorFilter = this.f4411v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (this.f4371E0) {
            super.draw(canvas);
        }
        if (this.f4366C > RecyclerView.A0 && !this.f4371E0) {
            paint.setColor(this.f4405o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f4371E0) {
                ColorFilter colorFilter2 = this.f4410u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f4411v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f4366C / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f4363A - (this.f4366C / 2.0f);
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        paint.setColor(this.p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f4371E0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f4401j0;
            f fVar = this.f397a;
            this.f412r.a(fVar.f382a, fVar.i, rectF4, this.f411q, path);
            d(canvas, paint, path, this.f397a.f382a, f());
        } else {
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.G.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (R()) {
            o(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.f4384S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f4384S.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.f4367C0 || this.f4370E == null) {
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f4400i0;
            pointF.set(RecyclerView.A0, RecyclerView.A0);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f4370E;
            l lVar = this.f4402k0;
            if (charSequence != null) {
                float p2 = p() + this.f4388W + this.f4391Z;
                if (E.b.a(this) == 0) {
                    pointF.x = bounds.left + p2;
                } else {
                    pointF.x = bounds.right - p2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = lVar.f217a;
                Paint.FontMetrics fontMetrics = this.f4398g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f4370E != null) {
                float p3 = p() + this.f4388W + this.f4391Z;
                float q2 = q() + this.f4395d0 + this.f4392a0;
                if (E.b.a(this) == 0) {
                    rectF3.left = bounds.left + p3;
                    rectF3.right = bounds.right - q2;
                } else {
                    rectF3.left = bounds.left + q2;
                    rectF3.right = bounds.right - p3;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            H0.d dVar = lVar.f221f;
            TextPaint textPaint2 = lVar.f217a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                lVar.f221f.e(this.f4396e0, textPaint2, lVar.f218b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(lVar.a(this.f4370E.toString())) > Math.round(rectF3.width());
            if (z3) {
                i5 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i5 = 0;
            }
            CharSequence charSequence2 = this.f4370E;
            if (z3 && this.f4365B0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f4365B0);
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
                float f11 = this.f4395d0 + this.f4394c0;
                if (E.b.a(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.f4380O;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.f4380O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.f4380O;
                float f15 = exactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.f4377L.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = I0.a.f345a;
            this.f4378M.setBounds(this.f4377L.getBounds());
            this.f4378M.jumpToCurrentState();
            this.f4378M.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.f4409t0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // K0.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4409t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f4410u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f4417z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f4402k0.a(this.f4370E.toString()) + p() + this.f4388W + this.f4391Z + this.f4392a0 + this.f4395d0), this.f4369D0);
    }

    @Override // K0.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // K0.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f4371E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f4417z, this.f4363A);
        } else {
            outline.setRoundRect(bounds, this.f4363A);
        }
        outline.setAlpha(this.f4409t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // K0.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        H0.d dVar;
        ColorStateList colorStateList;
        return s(this.f4413x) || s(this.f4415y) || s(this.f4364B) || !((dVar = this.f4402k0.f221f) == null || (colorStateList = dVar.f310j) == null || !colorStateList.isStateful()) || ((this.f4383R && this.f4384S != null && this.f4382Q) || t(this.G) || t(this.f4384S) || s(this.f4412w0));
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        E.b.b(drawable, E.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f4377L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f4416y0);
            }
            E.a.h(drawable, this.f4379N);
            return;
        }
        Drawable drawable2 = this.G;
        if (drawable == drawable2 && this.f4375J) {
            E.a.h(drawable2, this.f4373H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.f4388W + this.f4389X;
            Drawable drawable = this.f4407r0 ? this.f4384S : this.G;
            float f3 = this.f4374I;
            if (f3 <= RecyclerView.A0 && drawable != null) {
                f3 = drawable.getIntrinsicWidth();
            }
            if (E.b.a(this) == 0) {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            Drawable drawable2 = this.f4407r0 ? this.f4384S : this.G;
            float f6 = this.f4374I;
            if (f6 <= RecyclerView.A0 && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f4396e0.getResources().getDisplayMetrics()));
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
            onLayoutDirectionChanged |= E.b.b(this.G, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= E.b.b(this.f4384S, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= E.b.b(this.f4377L, i);
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
            onLevelChange |= this.G.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f4384S.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.f4377L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // K0.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f4371E0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f4416y0);
    }

    public final float p() {
        if (!S() && !R()) {
            return RecyclerView.A0;
        }
        float f2 = this.f4389X;
        Drawable drawable = this.f4407r0 ? this.f4384S : this.G;
        float f3 = this.f4374I;
        if (f3 <= RecyclerView.A0 && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f4390Y;
    }

    public final float q() {
        return T() ? this.f4393b0 + this.f4380O + this.f4394c0 : RecyclerView.A0;
    }

    public final float r() {
        return this.f4371E0 ? this.f397a.f382a.f431e.a(f()) : this.f4363A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // K0.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f4409t0 != i) {
            this.f4409t0 = i;
            invalidateSelf();
        }
    }

    @Override // K0.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4410u0 != colorFilter) {
            this.f4410u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // K0.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4412w0 != colorStateList) {
            this.f4412w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // K0.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f4414x0 != mode) {
            this.f4414x0 = mode;
            ColorStateList colorStateList = this.f4412w0;
            this.f4411v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (S()) {
            visible |= this.G.setVisible(z2, z3);
        }
        if (R()) {
            visible |= this.f4384S.setVisible(z2, z3);
        }
        if (T()) {
            visible |= this.f4377L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        d dVar = (d) this.A0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.f1852p);
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
        ColorStateList colorStateList2 = this.f4413x;
        int b2 = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.l0) : 0);
        if (this.l0 != b2) {
            this.l0 = b2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f4415y;
        int b3 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f4403m0) : 0);
        if (this.f4403m0 != b3) {
            this.f4403m0 = b3;
            onStateChange = true;
        }
        int b4 = D.a.b(b3, b2);
        if ((this.f4404n0 != b4) | (this.f397a.f384c == null)) {
            this.f4404n0 = b4;
            j(ColorStateList.valueOf(b4));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f4364B;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f4405o0) : 0;
        if (this.f4405o0 != colorForState2) {
            this.f4405o0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f4418z0 == null || !I0.a.b(iArr)) ? 0 : this.f4418z0.getColorForState(iArr, this.p0);
        if (this.p0 != colorForState3) {
            this.p0 = colorForState3;
        }
        H0.d dVar = this.f4402k0.f221f;
        int colorForState4 = (dVar == null || (colorStateList = dVar.f310j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f4406q0);
        if (this.f4406q0 != colorForState4) {
            this.f4406q0 = colorForState4;
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
                } else if (this.f4382Q) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (this.f4407r0 != z2 && this.f4384S != null) {
            float p2 = p();
            this.f4407r0 = z2;
            if (p2 != p()) {
                onStateChange = true;
                z3 = true;
                ColorStateList colorStateList5 = this.f4412w0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f4408s0) : 0;
                if (this.f4408s0 == colorForState) {
                    this.f4408s0 = colorForState;
                    ColorStateList colorStateList6 = this.f4412w0;
                    PorterDuff.Mode mode = this.f4414x0;
                    this.f4411v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z4 = onStateChange;
                }
                if (t(this.G)) {
                    z4 |= this.G.setState(iArr);
                }
                if (t(this.f4384S)) {
                    z4 |= this.f4384S.setState(iArr);
                }
                if (t(this.f4377L)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z4 |= this.f4377L.setState(iArr3);
                }
                int[] iArr4 = I0.a.f345a;
                if (t(this.f4378M)) {
                    z4 |= this.f4378M.setState(iArr2);
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
        ColorStateList colorStateList52 = this.f4412w0;
        if (colorStateList52 == null) {
        }
        if (this.f4408s0 == colorForState) {
        }
        if (t(this.G)) {
        }
        if (t(this.f4384S)) {
        }
        if (t(this.f4377L)) {
        }
        int[] iArr42 = I0.a.f345a;
        if (t(this.f4378M)) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z4;
    }

    public final void w(boolean z2) {
        if (this.f4382Q != z2) {
            this.f4382Q = z2;
            float p2 = p();
            if (!z2 && this.f4407r0) {
                this.f4407r0 = false;
            }
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f4384S != drawable) {
            float p2 = p();
            this.f4384S = drawable;
            float p3 = p();
            U(this.f4384S);
            n(this.f4384S);
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f4385T != colorStateList) {
            this.f4385T = colorStateList;
            if (this.f4383R && (drawable = this.f4384S) != null && this.f4382Q) {
                E.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.f4383R != z2) {
            boolean R2 = R();
            this.f4383R = z2;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f4384S);
                } else {
                    U(this.f4384S);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
