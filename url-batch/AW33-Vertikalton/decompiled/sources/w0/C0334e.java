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

/* renamed from: w0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334e extends g implements Drawable.Callback, l {

    /* renamed from: F0, reason: collision with root package name */
    public static final int[] f4108F0 = {R.attr.state_enabled};

    /* renamed from: G0, reason: collision with root package name */
    public static final ShapeDrawable f4109G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f4110A;

    /* renamed from: A0, reason: collision with root package name */
    public WeakReference f4111A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f4112B;

    /* renamed from: B0, reason: collision with root package name */
    public TextUtils.TruncateAt f4113B0;

    /* renamed from: C, reason: collision with root package name */
    public float f4114C;
    public boolean C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f4115D;

    /* renamed from: D0, reason: collision with root package name */
    public int f4116D0;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f4117E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f4118E0;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f4119G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f4120H;

    /* renamed from: I, reason: collision with root package name */
    public float f4121I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f4122J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4123K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f4124L;

    /* renamed from: M, reason: collision with root package name */
    public RippleDrawable f4125M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f4126N;

    /* renamed from: O, reason: collision with root package name */
    public float f4127O;

    /* renamed from: P, reason: collision with root package name */
    public SpannableStringBuilder f4128P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f4129Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4130R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f4131S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f4132T;

    /* renamed from: U, reason: collision with root package name */
    public o0.b f4133U;

    /* renamed from: V, reason: collision with root package name */
    public o0.b f4134V;

    /* renamed from: W, reason: collision with root package name */
    public float f4135W;

    /* renamed from: X, reason: collision with root package name */
    public float f4136X;

    /* renamed from: Y, reason: collision with root package name */
    public float f4137Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f4138Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f4139a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f4140b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f4141c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f4142d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f4143e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f4144f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f4145g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f4146h0;

    /* renamed from: i0, reason: collision with root package name */
    public final PointF f4147i0;
    public final Path j0;

    /* renamed from: k0, reason: collision with root package name */
    public final m f4148k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f4149l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f4150m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f4151n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f4152o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f4153p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f4154q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f4155r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f4156s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4157t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorFilter f4158u0;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuffColorFilter f4159v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f4160w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f4161x;
    public PorterDuff.Mode x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f4162y;

    /* renamed from: y0, reason: collision with root package name */
    public int[] f4163y0;

    /* renamed from: z, reason: collision with root package name */
    public float f4164z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f4165z0;

    public C0334e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.luckycalc.loanfinance.R.attr.chipStyle, com.luckycalc.loanfinance.R.style.Widget_MaterialComponents_Chip_Action);
        this.f4110A = -1.0f;
        this.f4144f0 = new Paint(1);
        this.f4145g0 = new Paint.FontMetrics();
        this.f4146h0 = new RectF();
        this.f4147i0 = new PointF();
        this.j0 = new Path();
        this.f4157t0 = 255;
        this.x0 = PorterDuff.Mode.SRC_IN;
        this.f4111A0 = new WeakReference(null);
        h(context);
        this.f4143e0 = context;
        m mVar = new m(this);
        this.f4148k0 = mVar;
        this.f4117E = "";
        mVar.f132a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f4108F0;
        setState(iArr);
        if (!Arrays.equals(this.f4163y0, iArr)) {
            this.f4163y0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.C0 = true;
        int[] iArr2 = F0.a.f185a;
        f4109G0.setTint(-1);
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
        if (this.f4110A != f2) {
            this.f4110A = f2;
            j e2 = this.f256a.f242a.e();
            e2.f279e = new H0.a(f2);
            e2.f280f = new H0.a(f2);
            e2.f281g = new H0.a(f2);
            e2.h = new H0.a(f2);
            setShapeAppearanceModel(e2.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4119G;
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
            this.f4119G = drawable != null ? drawable.mutate() : null;
            float p3 = p();
            U(drawable2);
            if (S()) {
                n(this.f4119G);
            }
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.f4121I != f2) {
            float p2 = p();
            this.f4121I = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f4122J = true;
        if (this.f4120H != colorStateList) {
            this.f4120H = colorStateList;
            if (S()) {
                D.a.h(this.f4119G, colorStateList);
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
                    n(this.f4119G);
                } else {
                    U(this.f4119G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f4112B != colorStateList) {
            this.f4112B = colorStateList;
            if (this.f4118E0) {
                f fVar = this.f256a;
                if (fVar.d != colorStateList) {
                    fVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.f4114C != f2) {
            this.f4114C = f2;
            this.f4144f0.setStrokeWidth(f2);
            if (this.f4118E0) {
                this.f256a.f248j = f2;
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
        Drawable drawable3 = this.f4124L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof D.d;
            drawable2 = drawable3;
            if (z2) {
            }
            if (drawable2 == drawable) {
                float q2 = q();
                this.f4124L = drawable != null ? drawable.mutate() : null;
                int[] iArr = F0.a.f185a;
                this.f4125M = new RippleDrawable(F0.a.a(this.f4115D), this.f4124L, f4109G0);
                float q3 = q();
                U(drawable2);
                if (T()) {
                    n(this.f4124L);
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
        if (this.f4141c0 != f2) {
            this.f4141c0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.f4127O != f2) {
            this.f4127O = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.f4140b0 != f2) {
            this.f4140b0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f4126N != colorStateList) {
            this.f4126N = colorStateList;
            if (T()) {
                D.a.h(this.f4124L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.f4123K != z2) {
            boolean T2 = T();
            this.f4123K = z2;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.f4124L);
                } else {
                    U(this.f4124L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.f4137Y != f2) {
            float p2 = p();
            this.f4137Y = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.f4136X != f2) {
            float p2 = p();
            this.f4136X = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f4115D != colorStateList) {
            this.f4115D = colorStateList;
            this.f4165z0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(E0.d dVar) {
        m mVar = this.f4148k0;
        if (mVar.f136f != dVar) {
            mVar.f136f = dVar;
            if (dVar != null) {
                TextPaint textPaint = mVar.f132a;
                Context context = this.f4143e0;
                k kVar = mVar.f133b;
                dVar.f(context, textPaint, kVar);
                l lVar = (l) mVar.f135e.get();
                if (lVar != null) {
                    textPaint.drawableState = lVar.getState();
                }
                dVar.e(context, textPaint, kVar);
                mVar.d = true;
            }
            l lVar2 = (l) mVar.f135e.get();
            if (lVar2 != null) {
                C0334e c0334e = (C0334e) lVar2;
                c0334e.u();
                c0334e.invalidateSelf();
                c0334e.onStateChange(lVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f4130R && this.f4131S != null && this.f4155r0;
    }

    public final boolean S() {
        return this.F && this.f4119G != null;
    }

    public final boolean T() {
        return this.f4123K && this.f4124L != null;
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
        if (bounds.isEmpty() || (i = this.f4157t0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z2 = this.f4118E0;
        Paint paint = this.f4144f0;
        RectF rectF3 = this.f4146h0;
        if (!z2) {
            paint.setColor(this.f4149l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (!this.f4118E0) {
            paint.setColor(this.f4150m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f4158u0;
            if (colorFilter == null) {
                colorFilter = this.f4159v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (this.f4118E0) {
            super.draw(canvas);
        }
        if (this.f4114C > 0.0f && !this.f4118E0) {
            paint.setColor(this.f4152o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f4118E0) {
                ColorFilter colorFilter2 = this.f4158u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f4159v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f4114C / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f4110A - (this.f4114C / 2.0f);
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        paint.setColor(this.f4153p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f4118E0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.j0;
            f fVar = this.f256a;
            this.f270r.a(fVar.f242a, fVar.i, rectF4, this.f269q, path);
            d(canvas, paint, path, this.f256a.f242a, f());
        } else {
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.f4119G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f4119G.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (R()) {
            o(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.f4131S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f4131S.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.C0 || this.f4117E == null) {
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f4147i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f4117E;
            m mVar = this.f4148k0;
            if (charSequence != null) {
                float p2 = p() + this.f4135W + this.f4138Z;
                if (D.b.a(this) == 0) {
                    pointF.x = bounds.left + p2;
                } else {
                    pointF.x = bounds.right - p2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = mVar.f132a;
                Paint.FontMetrics fontMetrics = this.f4145g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f4117E != null) {
                float p3 = p() + this.f4135W + this.f4138Z;
                float q2 = q() + this.f4142d0 + this.f4139a0;
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
            E0.d dVar = mVar.f136f;
            TextPaint textPaint2 = mVar.f132a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                mVar.f136f.e(this.f4143e0, textPaint2, mVar.f133b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(mVar.a(this.f4117E.toString())) > Math.round(rectF3.width());
            if (z3) {
                i5 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i5 = 0;
            }
            CharSequence charSequence2 = this.f4117E;
            if (z3 && this.f4113B0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f4113B0);
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
                float f11 = this.f4142d0 + this.f4141c0;
                if (D.b.a(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.f4127O;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.f4127O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.f4127O;
                float f15 = exactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.f4124L.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = F0.a.f185a;
            this.f4125M.setBounds(this.f4124L.getBounds());
            this.f4125M.jumpToCurrentState();
            this.f4125M.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.f4157t0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f4157t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f4158u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f4164z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f4148k0.a(this.f4117E.toString()) + p() + this.f4135W + this.f4138Z + this.f4139a0 + this.f4142d0), this.f4116D0);
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f4118E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f4164z, this.f4110A);
        } else {
            outline.setRoundRect(bounds, this.f4110A);
        }
        outline.setAlpha(this.f4157t0 / 255.0f);
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
        return s(this.f4161x) || s(this.f4162y) || s(this.f4112B) || !((dVar = this.f4148k0.f136f) == null || (colorStateList = dVar.f180j) == null || !colorStateList.isStateful()) || ((this.f4130R && this.f4131S != null && this.f4129Q) || t(this.f4119G) || t(this.f4131S) || s(this.f4160w0));
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        D.b.b(drawable, D.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f4124L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f4163y0);
            }
            D.a.h(drawable, this.f4126N);
            return;
        }
        Drawable drawable2 = this.f4119G;
        if (drawable == drawable2 && this.f4122J) {
            D.a.h(drawable2, this.f4120H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.f4135W + this.f4136X;
            Drawable drawable = this.f4155r0 ? this.f4131S : this.f4119G;
            float f3 = this.f4121I;
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
            Drawable drawable2 = this.f4155r0 ? this.f4131S : this.f4119G;
            float f6 = this.f4121I;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f4143e0.getResources().getDisplayMetrics()));
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
            onLayoutDirectionChanged |= D.b.b(this.f4119G, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= D.b.b(this.f4131S, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= D.b.b(this.f4124L, i);
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
            onLevelChange |= this.f4119G.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f4131S.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.f4124L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f4118E0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f4163y0);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f2 = this.f4136X;
        Drawable drawable = this.f4155r0 ? this.f4131S : this.f4119G;
        float f3 = this.f4121I;
        if (f3 <= 0.0f && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f4137Y;
    }

    public final float q() {
        if (T()) {
            return this.f4140b0 + this.f4127O + this.f4141c0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.f4118E0 ? this.f256a.f242a.f288e.a(f()) : this.f4110A;
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
        if (this.f4157t0 != i) {
            this.f4157t0 = i;
            invalidateSelf();
        }
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4158u0 != colorFilter) {
            this.f4158u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f4160w0 != colorStateList) {
            this.f4160w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // H0.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.x0 != mode) {
            this.x0 = mode;
            ColorStateList colorStateList = this.f4160w0;
            this.f4159v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (S()) {
            visible |= this.f4119G.setVisible(z2, z3);
        }
        if (R()) {
            visible |= this.f4131S.setVisible(z2, z3);
        }
        if (T()) {
            visible |= this.f4124L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        InterfaceC0333d interfaceC0333d = (InterfaceC0333d) this.f4111A0.get();
        if (interfaceC0333d != null) {
            Chip chip = (Chip) interfaceC0333d;
            chip.b(chip.f1625p);
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
        ColorStateList colorStateList2 = this.f4161x;
        int b2 = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f4149l0) : 0);
        if (this.f4149l0 != b2) {
            this.f4149l0 = b2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f4162y;
        int b3 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f4150m0) : 0);
        if (this.f4150m0 != b3) {
            this.f4150m0 = b3;
            onStateChange = true;
        }
        int b4 = C.a.b(b3, b2);
        if ((this.f4151n0 != b4) | (this.f256a.f244c == null)) {
            this.f4151n0 = b4;
            j(ColorStateList.valueOf(b4));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f4112B;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f4152o0) : 0;
        if (this.f4152o0 != colorForState2) {
            this.f4152o0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f4165z0 == null || !F0.a.b(iArr)) ? 0 : this.f4165z0.getColorForState(iArr, this.f4153p0);
        if (this.f4153p0 != colorForState3) {
            this.f4153p0 = colorForState3;
        }
        E0.d dVar = this.f4148k0.f136f;
        int colorForState4 = (dVar == null || (colorStateList = dVar.f180j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f4154q0);
        if (this.f4154q0 != colorForState4) {
            this.f4154q0 = colorForState4;
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
                } else if (this.f4129Q) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (this.f4155r0 != z2 && this.f4131S != null) {
            float p2 = p();
            this.f4155r0 = z2;
            if (p2 != p()) {
                onStateChange = true;
                z3 = true;
                ColorStateList colorStateList5 = this.f4160w0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f4156s0) : 0;
                if (this.f4156s0 == colorForState) {
                    this.f4156s0 = colorForState;
                    ColorStateList colorStateList6 = this.f4160w0;
                    PorterDuff.Mode mode = this.x0;
                    this.f4159v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z4 = onStateChange;
                }
                if (t(this.f4119G)) {
                    z4 |= this.f4119G.setState(iArr);
                }
                if (t(this.f4131S)) {
                    z4 |= this.f4131S.setState(iArr);
                }
                if (t(this.f4124L)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z4 |= this.f4124L.setState(iArr3);
                }
                int[] iArr4 = F0.a.f185a;
                if (t(this.f4125M)) {
                    z4 |= this.f4125M.setState(iArr2);
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
        ColorStateList colorStateList52 = this.f4160w0;
        if (colorStateList52 == null) {
        }
        if (this.f4156s0 == colorForState) {
        }
        if (t(this.f4119G)) {
        }
        if (t(this.f4131S)) {
        }
        if (t(this.f4124L)) {
        }
        int[] iArr42 = F0.a.f185a;
        if (t(this.f4125M)) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z4;
    }

    public final void w(boolean z2) {
        if (this.f4129Q != z2) {
            this.f4129Q = z2;
            float p2 = p();
            if (!z2 && this.f4155r0) {
                this.f4155r0 = false;
            }
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f4131S != drawable) {
            float p2 = p();
            this.f4131S = drawable;
            float p3 = p();
            U(this.f4131S);
            n(this.f4131S);
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f4132T != colorStateList) {
            this.f4132T = colorStateList;
            if (this.f4130R && (drawable = this.f4131S) != null && this.f4129Q) {
                D.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.f4130R != z2) {
            boolean R2 = R();
            this.f4130R = z2;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f4131S);
                } else {
                    U(this.f4131S);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
