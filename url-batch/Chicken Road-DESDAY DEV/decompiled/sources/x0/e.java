package x0;

import C0.k;
import C0.l;
import I0.f;
import I0.g;
import I0.j;
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
import p0.C0282b;

/* loaded from: classes.dex */
public final class e extends g implements Drawable.Callback, k {

    /* renamed from: F0, reason: collision with root package name */
    public static final int[] f4173F0 = {R.attr.state_enabled};

    /* renamed from: G0, reason: collision with root package name */
    public static final ShapeDrawable f4174G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f4175A;

    /* renamed from: A0, reason: collision with root package name */
    public WeakReference f4176A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f4177B;

    /* renamed from: B0, reason: collision with root package name */
    public TextUtils.TruncateAt f4178B0;

    /* renamed from: C, reason: collision with root package name */
    public float f4179C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f4180C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f4181D;
    public int D0;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f4182E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f4183E0;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f4184G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f4185H;

    /* renamed from: I, reason: collision with root package name */
    public float f4186I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f4187J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4188K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f4189L;

    /* renamed from: M, reason: collision with root package name */
    public RippleDrawable f4190M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f4191N;

    /* renamed from: O, reason: collision with root package name */
    public float f4192O;

    /* renamed from: P, reason: collision with root package name */
    public SpannableStringBuilder f4193P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f4194Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4195R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f4196S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f4197T;

    /* renamed from: U, reason: collision with root package name */
    public C0282b f4198U;

    /* renamed from: V, reason: collision with root package name */
    public C0282b f4199V;

    /* renamed from: W, reason: collision with root package name */
    public float f4200W;

    /* renamed from: X, reason: collision with root package name */
    public float f4201X;

    /* renamed from: Y, reason: collision with root package name */
    public float f4202Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f4203Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f4204a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f4205b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f4206c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f4207d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f4208e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f4209f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f4210g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f4211h0;

    /* renamed from: i0, reason: collision with root package name */
    public final PointF f4212i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Path f4213j0;

    /* renamed from: k0, reason: collision with root package name */
    public final l f4214k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f4215l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f4216m0;
    public int n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f4217o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f4218p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f4219q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f4220r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f4221s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4222t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorFilter f4223u0;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuffColorFilter f4224v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f4225w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f4226x;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuff.Mode f4227x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f4228y;
    public int[] y0;

    /* renamed from: z, reason: collision with root package name */
    public float f4229z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f4230z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.playgen.securelock.R.attr.chipStyle, com.playgen.securelock.R.style.Widget_MaterialComponents_Chip_Action);
        this.f4175A = -1.0f;
        this.f4209f0 = new Paint(1);
        this.f4210g0 = new Paint.FontMetrics();
        this.f4211h0 = new RectF();
        this.f4212i0 = new PointF();
        this.f4213j0 = new Path();
        this.f4222t0 = 255;
        this.f4227x0 = PorterDuff.Mode.SRC_IN;
        this.f4176A0 = new WeakReference(null);
        h(context);
        this.f4208e0 = context;
        l lVar = new l(this);
        this.f4214k0 = lVar;
        this.f4182E = "";
        lVar.f153a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f4173F0;
        setState(iArr);
        if (!Arrays.equals(this.y0, iArr)) {
            this.y0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f4180C0 = true;
        int[] iArr2 = G0.a.f195a;
        f4174G0.setTint(-1);
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
        if (this.f4175A != f2) {
            this.f4175A = f2;
            j e2 = this.f275a.f261a.e();
            e2.f298e = new I0.a(f2);
            e2.f299f = new I0.a(f2);
            e2.f300g = new I0.a(f2);
            e2.h = new I0.a(f2);
            setShapeAppearanceModel(e2.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4184G;
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
            this.f4184G = drawable != null ? drawable.mutate() : null;
            float p3 = p();
            U(drawable2);
            if (S()) {
                n(this.f4184G);
            }
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.f4186I != f2) {
            float p2 = p();
            this.f4186I = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f4187J = true;
        if (this.f4185H != colorStateList) {
            this.f4185H = colorStateList;
            if (S()) {
                D.a.h(this.f4184G, colorStateList);
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
                    n(this.f4184G);
                } else {
                    U(this.f4184G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f4177B != colorStateList) {
            this.f4177B = colorStateList;
            if (this.f4183E0) {
                f fVar = this.f275a;
                if (fVar.d != colorStateList) {
                    fVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.f4179C != f2) {
            this.f4179C = f2;
            this.f4209f0.setStrokeWidth(f2);
            if (this.f4183E0) {
                this.f275a.f267j = f2;
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
        Drawable drawable3 = this.f4189L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof D.d;
            drawable2 = drawable3;
            if (z2) {
            }
            if (drawable2 == drawable) {
                float q2 = q();
                this.f4189L = drawable != null ? drawable.mutate() : null;
                int[] iArr = G0.a.f195a;
                this.f4190M = new RippleDrawable(G0.a.a(this.f4181D), this.f4189L, f4174G0);
                float q3 = q();
                U(drawable2);
                if (T()) {
                    n(this.f4189L);
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
        if (this.f4206c0 != f2) {
            this.f4206c0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.f4192O != f2) {
            this.f4192O = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.f4205b0 != f2) {
            this.f4205b0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f4191N != colorStateList) {
            this.f4191N = colorStateList;
            if (T()) {
                D.a.h(this.f4189L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.f4188K != z2) {
            boolean T2 = T();
            this.f4188K = z2;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.f4189L);
                } else {
                    U(this.f4189L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.f4202Y != f2) {
            float p2 = p();
            this.f4202Y = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.f4201X != f2) {
            float p2 = p();
            this.f4201X = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f4181D != colorStateList) {
            this.f4181D = colorStateList;
            this.f4230z0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(F0.d dVar) {
        l lVar = this.f4214k0;
        if (lVar.f157f != dVar) {
            lVar.f157f = dVar;
            if (dVar != null) {
                TextPaint textPaint = lVar.f153a;
                Context context = this.f4208e0;
                C0.j jVar = lVar.f154b;
                dVar.f(context, textPaint, jVar);
                k kVar = (k) lVar.f156e.get();
                if (kVar != null) {
                    textPaint.drawableState = kVar.getState();
                }
                dVar.e(context, textPaint, jVar);
                lVar.d = true;
            }
            k kVar2 = (k) lVar.f156e.get();
            if (kVar2 != null) {
                e eVar = (e) kVar2;
                eVar.u();
                eVar.invalidateSelf();
                eVar.onStateChange(kVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f4195R && this.f4196S != null && this.f4220r0;
    }

    public final boolean S() {
        return this.F && this.f4184G != null;
    }

    public final boolean T() {
        return this.f4188K && this.f4189L != null;
    }

    @Override // I0.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f4222t0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z2 = this.f4183E0;
        Paint paint = this.f4209f0;
        RectF rectF3 = this.f4211h0;
        if (!z2) {
            paint.setColor(this.f4215l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (!this.f4183E0) {
            paint.setColor(this.f4216m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f4223u0;
            if (colorFilter == null) {
                colorFilter = this.f4224v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (this.f4183E0) {
            super.draw(canvas);
        }
        if (this.f4179C > 0.0f && !this.f4183E0) {
            paint.setColor(this.f4217o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f4183E0) {
                ColorFilter colorFilter2 = this.f4223u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f4224v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f4179C / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f4175A - (this.f4179C / 2.0f);
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        paint.setColor(this.f4218p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f4183E0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f4213j0;
            f fVar = this.f275a;
            this.f289r.a(fVar.f261a, fVar.i, rectF4, this.f288q, path);
            d(canvas, paint, path, this.f275a.f261a, f());
        } else {
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.f4184G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f4184G.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (R()) {
            o(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.f4196S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f4196S.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.f4180C0 || this.f4182E == null) {
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f4212i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f4182E;
            l lVar = this.f4214k0;
            if (charSequence != null) {
                float p2 = p() + this.f4200W + this.f4203Z;
                if (D.b.a(this) == 0) {
                    pointF.x = bounds.left + p2;
                } else {
                    pointF.x = bounds.right - p2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = lVar.f153a;
                Paint.FontMetrics fontMetrics = this.f4210g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f4182E != null) {
                float p3 = p() + this.f4200W + this.f4203Z;
                float q2 = q() + this.f4207d0 + this.f4204a0;
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
            F0.d dVar = lVar.f157f;
            TextPaint textPaint2 = lVar.f153a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                lVar.f157f.e(this.f4208e0, textPaint2, lVar.f154b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(lVar.a(this.f4182E.toString())) > Math.round(rectF3.width());
            if (z3) {
                i5 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i5 = 0;
            }
            CharSequence charSequence2 = this.f4182E;
            if (z3 && this.f4178B0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f4178B0);
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
                float f11 = this.f4207d0 + this.f4206c0;
                if (D.b.a(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.f4192O;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.f4192O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.f4192O;
                float f15 = exactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.f4189L.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = G0.a.f195a;
            this.f4190M.setBounds(this.f4189L.getBounds());
            this.f4190M.jumpToCurrentState();
            this.f4190M.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.f4222t0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // I0.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4222t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f4223u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f4229z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f4214k0.a(this.f4182E.toString()) + p() + this.f4200W + this.f4203Z + this.f4204a0 + this.f4207d0), this.D0);
    }

    @Override // I0.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // I0.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f4183E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f4229z, this.f4175A);
        } else {
            outline.setRoundRect(bounds, this.f4175A);
        }
        outline.setAlpha(this.f4222t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // I0.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        F0.d dVar;
        ColorStateList colorStateList;
        return s(this.f4226x) || s(this.f4228y) || s(this.f4177B) || !((dVar = this.f4214k0.f157f) == null || (colorStateList = dVar.f182j) == null || !colorStateList.isStateful()) || ((this.f4195R && this.f4196S != null && this.f4194Q) || t(this.f4184G) || t(this.f4196S) || s(this.f4225w0));
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        D.b.b(drawable, D.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f4189L) {
            if (drawable.isStateful()) {
                drawable.setState(this.y0);
            }
            D.a.h(drawable, this.f4191N);
            return;
        }
        Drawable drawable2 = this.f4184G;
        if (drawable == drawable2 && this.f4187J) {
            D.a.h(drawable2, this.f4185H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.f4200W + this.f4201X;
            Drawable drawable = this.f4220r0 ? this.f4196S : this.f4184G;
            float f3 = this.f4186I;
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
            Drawable drawable2 = this.f4220r0 ? this.f4196S : this.f4184G;
            float f6 = this.f4186I;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f4208e0.getResources().getDisplayMetrics()));
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
            onLayoutDirectionChanged |= D.b.b(this.f4184G, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= D.b.b(this.f4196S, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= D.b.b(this.f4189L, i);
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
            onLevelChange |= this.f4184G.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f4196S.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.f4189L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // I0.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f4183E0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.y0);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f2 = this.f4201X;
        Drawable drawable = this.f4220r0 ? this.f4196S : this.f4184G;
        float f3 = this.f4186I;
        if (f3 <= 0.0f && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f4202Y;
    }

    public final float q() {
        if (T()) {
            return this.f4205b0 + this.f4192O + this.f4206c0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.f4183E0 ? this.f275a.f261a.f307e.a(f()) : this.f4175A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // I0.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f4222t0 != i) {
            this.f4222t0 = i;
            invalidateSelf();
        }
    }

    @Override // I0.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4223u0 != colorFilter) {
            this.f4223u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // I0.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4225w0 != colorStateList) {
            this.f4225w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // I0.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f4227x0 != mode) {
            this.f4227x0 = mode;
            ColorStateList colorStateList = this.f4225w0;
            this.f4224v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (S()) {
            visible |= this.f4184G.setVisible(z2, z3);
        }
        if (R()) {
            visible |= this.f4196S.setVisible(z2, z3);
        }
        if (T()) {
            visible |= this.f4189L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        d dVar = (d) this.f4176A0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.f1691p);
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
        ColorStateList colorStateList2 = this.f4226x;
        int b2 = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f4215l0) : 0);
        if (this.f4215l0 != b2) {
            this.f4215l0 = b2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f4228y;
        int b3 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f4216m0) : 0);
        if (this.f4216m0 != b3) {
            this.f4216m0 = b3;
            onStateChange = true;
        }
        int b4 = C.a.b(b3, b2);
        if ((this.n0 != b4) | (this.f275a.f263c == null)) {
            this.n0 = b4;
            j(ColorStateList.valueOf(b4));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f4177B;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f4217o0) : 0;
        if (this.f4217o0 != colorForState2) {
            this.f4217o0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f4230z0 == null || !G0.a.b(iArr)) ? 0 : this.f4230z0.getColorForState(iArr, this.f4218p0);
        if (this.f4218p0 != colorForState3) {
            this.f4218p0 = colorForState3;
        }
        F0.d dVar = this.f4214k0.f157f;
        int colorForState4 = (dVar == null || (colorStateList = dVar.f182j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f4219q0);
        if (this.f4219q0 != colorForState4) {
            this.f4219q0 = colorForState4;
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
                } else if (this.f4194Q) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (this.f4220r0 != z2 && this.f4196S != null) {
            float p2 = p();
            this.f4220r0 = z2;
            if (p2 != p()) {
                onStateChange = true;
                z3 = true;
                ColorStateList colorStateList5 = this.f4225w0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f4221s0) : 0;
                if (this.f4221s0 == colorForState) {
                    this.f4221s0 = colorForState;
                    ColorStateList colorStateList6 = this.f4225w0;
                    PorterDuff.Mode mode = this.f4227x0;
                    this.f4224v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z4 = onStateChange;
                }
                if (t(this.f4184G)) {
                    z4 |= this.f4184G.setState(iArr);
                }
                if (t(this.f4196S)) {
                    z4 |= this.f4196S.setState(iArr);
                }
                if (t(this.f4189L)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z4 |= this.f4189L.setState(iArr3);
                }
                int[] iArr4 = G0.a.f195a;
                if (t(this.f4190M)) {
                    z4 |= this.f4190M.setState(iArr2);
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
        ColorStateList colorStateList52 = this.f4225w0;
        if (colorStateList52 == null) {
        }
        if (this.f4221s0 == colorForState) {
        }
        if (t(this.f4184G)) {
        }
        if (t(this.f4196S)) {
        }
        if (t(this.f4189L)) {
        }
        int[] iArr42 = G0.a.f195a;
        if (t(this.f4190M)) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z4;
    }

    public final void w(boolean z2) {
        if (this.f4194Q != z2) {
            this.f4194Q = z2;
            float p2 = p();
            if (!z2 && this.f4220r0) {
                this.f4220r0 = false;
            }
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f4196S != drawable) {
            float p2 = p();
            this.f4196S = drawable;
            float p3 = p();
            U(this.f4196S);
            n(this.f4196S);
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f4197T != colorStateList) {
            this.f4197T = colorStateList;
            if (this.f4195R && (drawable = this.f4196S) != null && this.f4194Q) {
                D.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.f4195R != z2) {
            boolean R2 = R();
            this.f4195R = z2;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f4196S);
                } else {
                    U(this.f4196S);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
