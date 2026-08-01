package A0;

import F0.j;
import F0.k;
import L0.g;
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
import r0.C0261b;

/* loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, j {

    /* renamed from: F0, reason: collision with root package name */
    public static final int[] f9F0 = {R.attr.state_enabled};
    public static final ShapeDrawable G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f10A;

    /* renamed from: A0, reason: collision with root package name */
    public WeakReference f11A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f12B;
    public TextUtils.TruncateAt B0;

    /* renamed from: C, reason: collision with root package name */
    public float f13C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f14C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f15D;

    /* renamed from: D0, reason: collision with root package name */
    public int f16D0;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f17E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f18E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f19F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f20G;
    public ColorStateList H;

    /* renamed from: I, reason: collision with root package name */
    public float f21I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f22J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f23K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f24L;

    /* renamed from: M, reason: collision with root package name */
    public RippleDrawable f25M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f26N;

    /* renamed from: O, reason: collision with root package name */
    public float f27O;

    /* renamed from: P, reason: collision with root package name */
    public SpannableStringBuilder f28P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f29Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f30R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f31S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f32T;

    /* renamed from: U, reason: collision with root package name */
    public C0261b f33U;

    /* renamed from: V, reason: collision with root package name */
    public C0261b f34V;

    /* renamed from: W, reason: collision with root package name */
    public float f35W;

    /* renamed from: X, reason: collision with root package name */
    public float f36X;

    /* renamed from: Y, reason: collision with root package name */
    public float f37Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f38Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f39a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f40b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f41c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f42d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f43e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f44f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f45g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f46h0;

    /* renamed from: i0, reason: collision with root package name */
    public final PointF f47i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Path f48j0;

    /* renamed from: k0, reason: collision with root package name */
    public final k f49k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f50l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f51m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f52n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f53o0;
    public int p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f54q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f55r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f56s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f57t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorFilter f58u0;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuffColorFilter f59v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f60w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f61x;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuff.Mode f62x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f63y;

    /* renamed from: y0, reason: collision with root package name */
    public int[] f64y0;

    /* renamed from: z, reason: collision with root package name */
    public float f65z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f66z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.winfour.neondrop.R.attr.chipStyle, com.winfour.neondrop.R.style.Widget_MaterialComponents_Chip_Action);
        this.f10A = -1.0f;
        this.f44f0 = new Paint(1);
        this.f45g0 = new Paint.FontMetrics();
        this.f46h0 = new RectF();
        this.f47i0 = new PointF();
        this.f48j0 = new Path();
        this.f57t0 = 255;
        this.f62x0 = PorterDuff.Mode.SRC_IN;
        this.f11A0 = new WeakReference(null);
        i(context);
        this.f43e0 = context;
        k kVar = new k(this);
        this.f49k0 = kVar;
        this.f17E = "";
        kVar.f311a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f9F0;
        setState(iArr);
        if (!Arrays.equals(this.f64y0, iArr)) {
            this.f64y0 = iArr;
            if (X()) {
                z(getState(), iArr);
            }
        }
        this.f14C0 = true;
        int[] iArr2 = J0.a.f383a;
        G0.setTint(-1);
    }

    public static void Y(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean w(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean x(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z2) {
        if (this.f29Q != z2) {
            this.f29Q = z2;
            float t2 = t();
            if (!z2 && this.f55r0) {
                this.f55r0 = false;
            }
            float t3 = t();
            invalidateSelf();
            if (t2 != t3) {
                y();
            }
        }
    }

    public final void B(Drawable drawable) {
        if (this.f31S != drawable) {
            float t2 = t();
            this.f31S = drawable;
            float t3 = t();
            Y(this.f31S);
            r(this.f31S);
            invalidateSelf();
            if (t2 != t3) {
                y();
            }
        }
    }

    public final void C(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f32T != colorStateList) {
            this.f32T = colorStateList;
            if (this.f30R && (drawable = this.f31S) != null && this.f29Q) {
                F.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void D(boolean z2) {
        if (this.f30R != z2) {
            boolean V2 = V();
            this.f30R = z2;
            boolean V3 = V();
            if (V2 != V3) {
                if (V3) {
                    r(this.f31S);
                } else {
                    Y(this.f31S);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void E(float f2) {
        if (this.f10A != f2) {
            this.f10A = f2;
            L0.j e2 = this.f433a.f419a.e();
            e2.f456e = new L0.a(f2);
            e2.f457f = new L0.a(f2);
            e2.f458g = new L0.a(f2);
            e2.h = new L0.a(f2);
            setShapeAppearanceModel(e2.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f20G;
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
            float t2 = t();
            this.f20G = drawable != null ? drawable.mutate() : null;
            float t3 = t();
            Y(drawable2);
            if (W()) {
                r(this.f20G);
            }
            invalidateSelf();
            if (t2 != t3) {
                y();
            }
        }
    }

    public final void G(float f2) {
        if (this.f21I != f2) {
            float t2 = t();
            this.f21I = f2;
            float t3 = t();
            invalidateSelf();
            if (t2 != t3) {
                y();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        this.f22J = true;
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (W()) {
                F.a.h(this.f20G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z2) {
        if (this.f19F != z2) {
            boolean W2 = W();
            this.f19F = z2;
            boolean W3 = W();
            if (W2 != W3) {
                if (W3) {
                    r(this.f20G);
                } else {
                    Y(this.f20G);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        if (this.f12B != colorStateList) {
            this.f12B = colorStateList;
            if (this.f18E0) {
                L0.f fVar = this.f433a;
                if (fVar.d != colorStateList) {
                    fVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void K(float f2) {
        if (this.f13C != f2) {
            this.f13C = f2;
            this.f44f0.setStrokeWidth(f2);
            if (this.f18E0) {
                this.f433a.f425j = f2;
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
    public final void L(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f24L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof F.d;
            drawable2 = drawable3;
            if (z2) {
            }
            if (drawable2 == drawable) {
                float u2 = u();
                this.f24L = drawable != null ? drawable.mutate() : null;
                int[] iArr = J0.a.f383a;
                this.f25M = new RippleDrawable(J0.a.a(this.f15D), this.f24L, G0);
                float u3 = u();
                Y(drawable2);
                if (X()) {
                    r(this.f24L);
                }
                invalidateSelf();
                if (u2 != u3) {
                    y();
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

    public final void M(float f2) {
        if (this.f41c0 != f2) {
            this.f41c0 = f2;
            invalidateSelf();
            if (X()) {
                y();
            }
        }
    }

    public final void N(float f2) {
        if (this.f27O != f2) {
            this.f27O = f2;
            invalidateSelf();
            if (X()) {
                y();
            }
        }
    }

    public final void O(float f2) {
        if (this.f40b0 != f2) {
            this.f40b0 = f2;
            invalidateSelf();
            if (X()) {
                y();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f26N != colorStateList) {
            this.f26N = colorStateList;
            if (X()) {
                F.a.h(this.f24L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z2) {
        if (this.f23K != z2) {
            boolean X2 = X();
            this.f23K = z2;
            boolean X3 = X();
            if (X2 != X3) {
                if (X3) {
                    r(this.f24L);
                } else {
                    Y(this.f24L);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void R(float f2) {
        if (this.f37Y != f2) {
            float t2 = t();
            this.f37Y = f2;
            float t3 = t();
            invalidateSelf();
            if (t2 != t3) {
                y();
            }
        }
    }

    public final void S(float f2) {
        if (this.f36X != f2) {
            float t2 = t();
            this.f36X = f2;
            float t3 = t();
            invalidateSelf();
            if (t2 != t3) {
                y();
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        if (this.f15D != colorStateList) {
            this.f15D = colorStateList;
            this.f66z0 = null;
            onStateChange(getState());
        }
    }

    public final void U(I0.d dVar) {
        k kVar = this.f49k0;
        if (kVar.f315f != dVar) {
            kVar.f315f = dVar;
            if (dVar != null) {
                TextPaint textPaint = kVar.f311a;
                Context context = this.f43e0;
                b bVar = kVar.f312b;
                dVar.f(context, textPaint, bVar);
                j jVar = (j) kVar.f314e.get();
                if (jVar != null) {
                    textPaint.drawableState = jVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                kVar.d = true;
            }
            j jVar2 = (j) kVar.f314e.get();
            if (jVar2 != null) {
                f fVar = (f) jVar2;
                fVar.y();
                fVar.invalidateSelf();
                fVar.onStateChange(jVar2.getState());
            }
        }
    }

    public final boolean V() {
        return this.f30R && this.f31S != null && this.f55r0;
    }

    public final boolean W() {
        return this.f19F && this.f20G != null;
    }

    public final boolean X() {
        return this.f23K && this.f24L != null;
    }

    @Override // L0.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f57t0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z2 = this.f18E0;
        Paint paint = this.f44f0;
        RectF rectF3 = this.f46h0;
        if (!z2) {
            paint.setColor(this.f50l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, v(), v(), paint);
        }
        if (!this.f18E0) {
            paint.setColor(this.f51m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f58u0;
            if (colorFilter == null) {
                colorFilter = this.f59v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, v(), v(), paint);
        }
        if (this.f18E0) {
            super.draw(canvas);
        }
        if (this.f13C > 0.0f && !this.f18E0) {
            paint.setColor(this.f53o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f18E0) {
                ColorFilter colorFilter2 = this.f58u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f59v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f13C / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f10A - (this.f13C / 2.0f);
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        paint.setColor(this.p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f18E0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f48j0;
            L0.f fVar = this.f433a;
            this.f447r.a(fVar.f419a, fVar.i, rectF4, this.f446q, path);
            d(canvas, paint, path, this.f433a.f419a, f());
        } else {
            canvas.drawRoundRect(rectF3, v(), v(), paint);
        }
        if (W()) {
            s(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.f20G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f20G.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (V()) {
            s(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.f31S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f31S.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.f14C0 || this.f17E == null) {
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f47i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f17E;
            k kVar = this.f49k0;
            if (charSequence != null) {
                float t2 = t() + this.f35W + this.f38Z;
                if (F.b.a(this) == 0) {
                    pointF.x = bounds.left + t2;
                } else {
                    pointF.x = bounds.right - t2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = kVar.f311a;
                Paint.FontMetrics fontMetrics = this.f45g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f17E != null) {
                float t3 = t() + this.f35W + this.f38Z;
                float u2 = u() + this.f42d0 + this.f39a0;
                if (F.b.a(this) == 0) {
                    rectF3.left = bounds.left + t3;
                    rectF3.right = bounds.right - u2;
                } else {
                    rectF3.left = bounds.left + u2;
                    rectF3.right = bounds.right - t3;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            I0.d dVar = kVar.f315f;
            TextPaint textPaint2 = kVar.f311a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                kVar.f315f.e(this.f43e0, textPaint2, kVar.f312b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(kVar.a(this.f17E.toString())) > Math.round(rectF3.width());
            if (z3) {
                i5 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i5 = 0;
            }
            CharSequence charSequence2 = this.f17E;
            if (z3 && this.B0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.B0);
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
        if (X()) {
            rectF.setEmpty();
            if (X()) {
                float f11 = this.f42d0 + this.f41c0;
                if (F.b.a(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.f27O;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.f27O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.f27O;
                float f15 = exactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.f24L.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = J0.a.f383a;
            this.f25M.setBounds(this.f24L.getBounds());
            this.f25M.jumpToCurrentState();
            this.f25M.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.f57t0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // L0.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f57t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f58u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f65z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(u() + this.f49k0.a(this.f17E.toString()) + t() + this.f35W + this.f38Z + this.f39a0 + this.f42d0), this.f16D0);
    }

    @Override // L0.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // L0.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f18E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f65z, this.f10A);
        } else {
            outline.setRoundRect(bounds, this.f10A);
        }
        outline.setAlpha(this.f57t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // L0.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        I0.d dVar;
        ColorStateList colorStateList;
        return w(this.f61x) || w(this.f63y) || w(this.f12B) || !((dVar = this.f49k0.f315f) == null || (colorStateList = dVar.f348j) == null || !colorStateList.isStateful()) || ((this.f30R && this.f31S != null && this.f29Q) || x(this.f20G) || x(this.f31S) || w(this.f60w0));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (W()) {
            onLayoutDirectionChanged |= F.b.b(this.f20G, i);
        }
        if (V()) {
            onLayoutDirectionChanged |= F.b.b(this.f31S, i);
        }
        if (X()) {
            onLayoutDirectionChanged |= F.b.b(this.f24L, i);
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
        if (W()) {
            onLevelChange |= this.f20G.setLevel(i);
        }
        if (V()) {
            onLevelChange |= this.f31S.setLevel(i);
        }
        if (X()) {
            onLevelChange |= this.f24L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // L0.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f18E0) {
            super.onStateChange(iArr);
        }
        return z(iArr, this.f64y0);
    }

    public final void r(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        F.b.b(drawable, F.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f24L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f64y0);
            }
            F.a.h(drawable, this.f26N);
            return;
        }
        Drawable drawable2 = this.f20G;
        if (drawable == drawable2 && this.f22J) {
            F.a.h(drawable2, this.H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void s(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (W() || V()) {
            float f2 = this.f35W + this.f36X;
            Drawable drawable = this.f55r0 ? this.f31S : this.f20G;
            float f3 = this.f21I;
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
            Drawable drawable2 = this.f55r0 ? this.f31S : this.f20G;
            float f6 = this.f21I;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f43e0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f6) {
                    f6 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f6 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f6;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // L0.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f57t0 != i) {
            this.f57t0 = i;
            invalidateSelf();
        }
    }

    @Override // L0.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f58u0 != colorFilter) {
            this.f58u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // L0.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f60w0 != colorStateList) {
            this.f60w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // L0.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f62x0 != mode) {
            this.f62x0 = mode;
            ColorStateList colorStateList = this.f60w0;
            this.f59v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (W()) {
            visible |= this.f20G.setVisible(z2, z3);
        }
        if (V()) {
            visible |= this.f31S.setVisible(z2, z3);
        }
        if (X()) {
            visible |= this.f24L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        if (!W() && !V()) {
            return 0.0f;
        }
        float f2 = this.f36X;
        Drawable drawable = this.f55r0 ? this.f31S : this.f20G;
        float f3 = this.f21I;
        if (f3 <= 0.0f && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f37Y;
    }

    public final float u() {
        if (X()) {
            return this.f40b0 + this.f27O + this.f41c0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        return this.f18E0 ? g() : this.f10A;
    }

    public final void y() {
        e eVar = (e) this.f11A0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f1837p);
            chip.requestLayout();
            chip.invalidateOutline();
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
    public final boolean z(int[] iArr, int[] iArr2) {
        boolean z2;
        boolean z3;
        int colorForState;
        ColorStateList colorStateList;
        boolean z4 = true;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f61x;
        int b2 = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f50l0) : 0);
        if (this.f50l0 != b2) {
            this.f50l0 = b2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f63y;
        int b3 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f51m0) : 0);
        if (this.f51m0 != b3) {
            this.f51m0 = b3;
            onStateChange = true;
        }
        int b4 = E.a.b(b3, b2);
        if ((this.f52n0 != b4) | (this.f433a.f421c == null)) {
            this.f52n0 = b4;
            l(ColorStateList.valueOf(b4));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f12B;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f53o0) : 0;
        if (this.f53o0 != colorForState2) {
            this.f53o0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f66z0 == null || !J0.a.b(iArr)) ? 0 : this.f66z0.getColorForState(iArr, this.p0);
        if (this.p0 != colorForState3) {
            this.p0 = colorForState3;
        }
        I0.d dVar = this.f49k0.f315f;
        int colorForState4 = (dVar == null || (colorStateList = dVar.f348j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f54q0);
        if (this.f54q0 != colorForState4) {
            this.f54q0 = colorForState4;
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
                } else if (this.f29Q) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (this.f55r0 != z2 && this.f31S != null) {
            float t2 = t();
            this.f55r0 = z2;
            if (t2 != t()) {
                onStateChange = true;
                z3 = true;
                ColorStateList colorStateList5 = this.f60w0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f56s0) : 0;
                if (this.f56s0 == colorForState) {
                    this.f56s0 = colorForState;
                    ColorStateList colorStateList6 = this.f60w0;
                    PorterDuff.Mode mode = this.f62x0;
                    this.f59v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z4 = onStateChange;
                }
                if (x(this.f20G)) {
                    z4 |= this.f20G.setState(iArr);
                }
                if (x(this.f31S)) {
                    z4 |= this.f31S.setState(iArr);
                }
                if (x(this.f24L)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z4 |= this.f24L.setState(iArr3);
                }
                int[] iArr4 = J0.a.f383a;
                if (x(this.f25M)) {
                    z4 |= this.f25M.setState(iArr2);
                }
                if (z4) {
                    invalidateSelf();
                }
                if (z3) {
                    y();
                }
                return z4;
            }
            onStateChange = true;
        }
        z3 = false;
        ColorStateList colorStateList52 = this.f60w0;
        if (colorStateList52 == null) {
        }
        if (this.f56s0 == colorForState) {
        }
        if (x(this.f20G)) {
        }
        if (x(this.f31S)) {
        }
        if (x(this.f24L)) {
        }
        int[] iArr42 = J0.a.f383a;
        if (x(this.f25M)) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z4;
    }
}
