package D0;

import I0.h;
import I0.i;
import O0.g;
import O0.j;
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
import v0.C0373b;

/* loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, h {

    /* renamed from: F0, reason: collision with root package name */
    public static final int[] f143F0 = {R.attr.state_enabled};

    /* renamed from: G0, reason: collision with root package name */
    public static final ShapeDrawable f144G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f145A;

    /* renamed from: A0, reason: collision with root package name */
    public WeakReference f146A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f147B;

    /* renamed from: B0, reason: collision with root package name */
    public TextUtils.TruncateAt f148B0;

    /* renamed from: C, reason: collision with root package name */
    public float f149C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f150C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f151D;

    /* renamed from: D0, reason: collision with root package name */
    public int f152D0;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f153E;
    public boolean E0;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f154G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f155H;

    /* renamed from: I, reason: collision with root package name */
    public float f156I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f157J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f158K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f159L;

    /* renamed from: M, reason: collision with root package name */
    public RippleDrawable f160M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f161N;

    /* renamed from: O, reason: collision with root package name */
    public float f162O;

    /* renamed from: P, reason: collision with root package name */
    public SpannableStringBuilder f163P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f164Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f165R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f166S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f167T;

    /* renamed from: U, reason: collision with root package name */
    public C0373b f168U;

    /* renamed from: V, reason: collision with root package name */
    public C0373b f169V;

    /* renamed from: W, reason: collision with root package name */
    public float f170W;

    /* renamed from: X, reason: collision with root package name */
    public float f171X;

    /* renamed from: Y, reason: collision with root package name */
    public float f172Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f173Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f174a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f175b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f176c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f177d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f178e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f179f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f180g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f181h0;

    /* renamed from: i0, reason: collision with root package name */
    public final PointF f182i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Path f183j0;

    /* renamed from: k0, reason: collision with root package name */
    public final i f184k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f185l0;
    public int m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f186n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f187o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f188p0;
    public int q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f189r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f190s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f191t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorFilter f192u0;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuffColorFilter f193v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f194w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f195x;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuff.Mode f196x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f197y;

    /* renamed from: y0, reason: collision with root package name */
    public int[] f198y0;

    /* renamed from: z, reason: collision with root package name */
    public float f199z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f200z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.clutchquizarena.app.R.attr.chipStyle, com.clutchquizarena.app.R.style.Widget_MaterialComponents_Chip_Action);
        this.f145A = -1.0f;
        this.f179f0 = new Paint(1);
        this.f180g0 = new Paint.FontMetrics();
        this.f181h0 = new RectF();
        this.f182i0 = new PointF();
        this.f183j0 = new Path();
        this.f191t0 = 255;
        this.f196x0 = PorterDuff.Mode.SRC_IN;
        this.f146A0 = new WeakReference(null);
        h(context);
        this.f178e0 = context;
        i iVar = new i(this);
        this.f184k0 = iVar;
        this.f153E = "";
        iVar.f338a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f143F0;
        setState(iArr);
        if (!Arrays.equals(this.f198y0, iArr)) {
            this.f198y0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f150C0 = true;
        int[] iArr2 = M0.a.f497a;
        f144G0.setTint(-1);
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
        if (this.f145A != f2) {
            this.f145A = f2;
            j e2 = this.f527a.f513a.e();
            e2.f550e = new O0.a(f2);
            e2.f551f = new O0.a(f2);
            e2.f552g = new O0.a(f2);
            e2.h = new O0.a(f2);
            setShapeAppearanceModel(e2.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f154G;
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
            this.f154G = drawable != null ? drawable.mutate() : null;
            float p3 = p();
            U(drawable2);
            if (S()) {
                n(this.f154G);
            }
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.f156I != f2) {
            float p2 = p();
            this.f156I = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f157J = true;
        if (this.f155H != colorStateList) {
            this.f155H = colorStateList;
            if (S()) {
                D.a.h(this.f154G, colorStateList);
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
                    n(this.f154G);
                } else {
                    U(this.f154G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f147B != colorStateList) {
            this.f147B = colorStateList;
            if (this.E0) {
                O0.f fVar = this.f527a;
                if (fVar.d != colorStateList) {
                    fVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.f149C != f2) {
            this.f149C = f2;
            this.f179f0.setStrokeWidth(f2);
            if (this.E0) {
                this.f527a.f519j = f2;
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
        Drawable drawable3 = this.f159L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof D.d;
            drawable2 = drawable3;
            if (z2) {
            }
            if (drawable2 == drawable) {
                float q2 = q();
                this.f159L = drawable != null ? drawable.mutate() : null;
                int[] iArr = M0.a.f497a;
                this.f160M = new RippleDrawable(M0.a.a(this.f151D), this.f159L, f144G0);
                float q3 = q();
                U(drawable2);
                if (T()) {
                    n(this.f159L);
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
        if (this.f176c0 != f2) {
            this.f176c0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.f162O != f2) {
            this.f162O = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.f175b0 != f2) {
            this.f175b0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f161N != colorStateList) {
            this.f161N = colorStateList;
            if (T()) {
                D.a.h(this.f159L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.f158K != z2) {
            boolean T2 = T();
            this.f158K = z2;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.f159L);
                } else {
                    U(this.f159L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.f172Y != f2) {
            float p2 = p();
            this.f172Y = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.f171X != f2) {
            float p2 = p();
            this.f171X = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f151D != colorStateList) {
            this.f151D = colorStateList;
            this.f200z0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(L0.d dVar) {
        i iVar = this.f184k0;
        if (iVar.f342f != dVar) {
            iVar.f342f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f338a;
                Context context = this.f178e0;
                b bVar = iVar.f339b;
                dVar.f(context, textPaint, bVar);
                h hVar = (h) iVar.f341e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                iVar.d = true;
            }
            h hVar2 = (h) iVar.f341e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f165R && this.f166S != null && this.f189r0;
    }

    public final boolean S() {
        return this.F && this.f154G != null;
    }

    public final boolean T() {
        return this.f158K && this.f159L != null;
    }

    @Override // O0.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f191t0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z2 = this.E0;
        Paint paint = this.f179f0;
        RectF rectF3 = this.f181h0;
        if (!z2) {
            paint.setColor(this.f185l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (!this.E0) {
            paint.setColor(this.m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f192u0;
            if (colorFilter == null) {
                colorFilter = this.f193v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (this.E0) {
            super.draw(canvas);
        }
        if (this.f149C > 0.0f && !this.E0) {
            paint.setColor(this.f187o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.E0) {
                ColorFilter colorFilter2 = this.f192u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f193v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f149C / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f145A - (this.f149C / 2.0f);
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        paint.setColor(this.f188p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.E0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f183j0;
            O0.f fVar = this.f527a;
            this.f541r.a(fVar.f513a, fVar.i, rectF4, this.f540q, path);
            d(canvas, paint, path, this.f527a.f513a, f());
        } else {
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.f154G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f154G.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (R()) {
            o(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.f166S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f166S.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.f150C0 || this.f153E == null) {
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f182i0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f153E;
            i iVar = this.f184k0;
            if (charSequence != null) {
                float p2 = p() + this.f170W + this.f173Z;
                if (D.b.a(this) == 0) {
                    pointF.x = bounds.left + p2;
                } else {
                    pointF.x = bounds.right - p2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = iVar.f338a;
                Paint.FontMetrics fontMetrics = this.f180g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f153E != null) {
                float p3 = p() + this.f170W + this.f173Z;
                float q2 = q() + this.f177d0 + this.f174a0;
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
            L0.d dVar = iVar.f342f;
            TextPaint textPaint2 = iVar.f338a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f342f.e(this.f178e0, textPaint2, iVar.f339b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(iVar.a(this.f153E.toString())) > Math.round(rectF3.width());
            if (z3) {
                i5 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i5 = 0;
            }
            CharSequence charSequence2 = this.f153E;
            if (z3 && this.f148B0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f148B0);
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
                float f11 = this.f177d0 + this.f176c0;
                if (D.b.a(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.f162O;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.f162O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.f162O;
                float f15 = exactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.f159L.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = M0.a.f497a;
            this.f160M.setBounds(this.f159L.getBounds());
            this.f160M.jumpToCurrentState();
            this.f160M.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.f191t0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // O0.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f191t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f192u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f199z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f184k0.a(this.f153E.toString()) + p() + this.f170W + this.f173Z + this.f174a0 + this.f177d0), this.f152D0);
    }

    @Override // O0.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // O0.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f199z, this.f145A);
        } else {
            outline.setRoundRect(bounds, this.f145A);
        }
        outline.setAlpha(this.f191t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // O0.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        L0.d dVar;
        ColorStateList colorStateList;
        return s(this.f195x) || s(this.f197y) || s(this.f147B) || !((dVar = this.f184k0.f342f) == null || (colorStateList = dVar.f492j) == null || !colorStateList.isStateful()) || ((this.f165R && this.f166S != null && this.f164Q) || t(this.f154G) || t(this.f166S) || s(this.f194w0));
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        D.b.b(drawable, D.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f159L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f198y0);
            }
            D.a.h(drawable, this.f161N);
            return;
        }
        Drawable drawable2 = this.f154G;
        if (drawable == drawable2 && this.f157J) {
            D.a.h(drawable2, this.f155H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.f170W + this.f171X;
            Drawable drawable = this.f189r0 ? this.f166S : this.f154G;
            float f3 = this.f156I;
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
            Drawable drawable2 = this.f189r0 ? this.f166S : this.f154G;
            float f6 = this.f156I;
            if (f6 <= 0.0f && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f178e0.getResources().getDisplayMetrics()));
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
            onLayoutDirectionChanged |= D.b.b(this.f154G, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= D.b.b(this.f166S, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= D.b.b(this.f159L, i);
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
            onLevelChange |= this.f154G.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f166S.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.f159L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // O0.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.E0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f198y0);
    }

    public final float p() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f2 = this.f171X;
        Drawable drawable = this.f189r0 ? this.f166S : this.f154G;
        float f3 = this.f156I;
        if (f3 <= 0.0f && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f172Y;
    }

    public final float q() {
        if (T()) {
            return this.f175b0 + this.f162O + this.f176c0;
        }
        return 0.0f;
    }

    public final float r() {
        return this.E0 ? this.f527a.f513a.f559e.a(f()) : this.f145A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // O0.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f191t0 != i) {
            this.f191t0 = i;
            invalidateSelf();
        }
    }

    @Override // O0.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f192u0 != colorFilter) {
            this.f192u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // O0.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f194w0 != colorStateList) {
            this.f194w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // O0.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f196x0 != mode) {
            this.f196x0 = mode;
            ColorStateList colorStateList = this.f194w0;
            this.f193v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (S()) {
            visible |= this.f154G.setVisible(z2, z3);
        }
        if (R()) {
            visible |= this.f166S.setVisible(z2, z3);
        }
        if (T()) {
            visible |= this.f159L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.f146A0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f1835p);
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
        ColorStateList colorStateList2 = this.f195x;
        int b2 = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f185l0) : 0);
        if (this.f185l0 != b2) {
            this.f185l0 = b2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f197y;
        int b3 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.m0) : 0);
        if (this.m0 != b3) {
            this.m0 = b3;
            onStateChange = true;
        }
        int b4 = C.a.b(b3, b2);
        if ((this.f186n0 != b4) | (this.f527a.f515c == null)) {
            this.f186n0 = b4;
            j(ColorStateList.valueOf(b4));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f147B;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f187o0) : 0;
        if (this.f187o0 != colorForState2) {
            this.f187o0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f200z0 == null || !M0.a.b(iArr)) ? 0 : this.f200z0.getColorForState(iArr, this.f188p0);
        if (this.f188p0 != colorForState3) {
            this.f188p0 = colorForState3;
        }
        L0.d dVar = this.f184k0.f342f;
        int colorForState4 = (dVar == null || (colorStateList = dVar.f492j) == null) ? 0 : colorStateList.getColorForState(iArr, this.q0);
        if (this.q0 != colorForState4) {
            this.q0 = colorForState4;
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
                } else if (this.f164Q) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (this.f189r0 != z2 && this.f166S != null) {
            float p2 = p();
            this.f189r0 = z2;
            if (p2 != p()) {
                onStateChange = true;
                z3 = true;
                ColorStateList colorStateList5 = this.f194w0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f190s0) : 0;
                if (this.f190s0 == colorForState) {
                    this.f190s0 = colorForState;
                    ColorStateList colorStateList6 = this.f194w0;
                    PorterDuff.Mode mode = this.f196x0;
                    this.f193v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z4 = onStateChange;
                }
                if (t(this.f154G)) {
                    z4 |= this.f154G.setState(iArr);
                }
                if (t(this.f166S)) {
                    z4 |= this.f166S.setState(iArr);
                }
                if (t(this.f159L)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z4 |= this.f159L.setState(iArr3);
                }
                int[] iArr4 = M0.a.f497a;
                if (t(this.f160M)) {
                    z4 |= this.f160M.setState(iArr2);
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
        ColorStateList colorStateList52 = this.f194w0;
        if (colorStateList52 == null) {
        }
        if (this.f190s0 == colorForState) {
        }
        if (t(this.f154G)) {
        }
        if (t(this.f166S)) {
        }
        if (t(this.f159L)) {
        }
        int[] iArr42 = M0.a.f497a;
        if (t(this.f160M)) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z4;
    }

    public final void w(boolean z2) {
        if (this.f164Q != z2) {
            this.f164Q = z2;
            float p2 = p();
            if (!z2 && this.f189r0) {
                this.f189r0 = false;
            }
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f166S != drawable) {
            float p2 = p();
            this.f166S = drawable;
            float p3 = p();
            U(this.f166S);
            n(this.f166S);
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f167T != colorStateList) {
            this.f167T = colorStateList;
            if (this.f165R && (drawable = this.f166S) != null && this.f164Q) {
                D.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.f165R != z2) {
            boolean R2 = R();
            this.f165R = z2;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f166S);
                } else {
                    U(this.f166S);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
