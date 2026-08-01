package G0;

import L0.h;
import L0.i;
import R0.g;
import R0.j;
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
import y0.C0396b;

/* loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, h {

    /* renamed from: F0, reason: collision with root package name */
    public static final int[] f297F0 = {R.attr.state_enabled};

    /* renamed from: G0, reason: collision with root package name */
    public static final ShapeDrawable f298G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f299A;

    /* renamed from: A0, reason: collision with root package name */
    public WeakReference f300A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f301B;

    /* renamed from: B0, reason: collision with root package name */
    public TextUtils.TruncateAt f302B0;

    /* renamed from: C, reason: collision with root package name */
    public float f303C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f304C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f305D;

    /* renamed from: D0, reason: collision with root package name */
    public int f306D0;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f307E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f308E0;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f309G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f310H;

    /* renamed from: I, reason: collision with root package name */
    public float f311I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f312J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f313K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f314L;

    /* renamed from: M, reason: collision with root package name */
    public RippleDrawable f315M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f316N;

    /* renamed from: O, reason: collision with root package name */
    public float f317O;

    /* renamed from: P, reason: collision with root package name */
    public SpannableStringBuilder f318P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f319Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f320R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f321S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f322T;

    /* renamed from: U, reason: collision with root package name */
    public C0396b f323U;

    /* renamed from: V, reason: collision with root package name */
    public C0396b f324V;

    /* renamed from: W, reason: collision with root package name */
    public float f325W;

    /* renamed from: X, reason: collision with root package name */
    public float f326X;

    /* renamed from: Y, reason: collision with root package name */
    public float f327Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f328Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f329a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f330b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f331c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f332d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f333e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f334f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f335g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f336h0;

    /* renamed from: i0, reason: collision with root package name */
    public final PointF f337i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Path f338j0;

    /* renamed from: k0, reason: collision with root package name */
    public final i f339k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f340l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f341m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f342n0;
    public int o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f343p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f344q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f345r0;
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f346t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorFilter f347u0;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuffColorFilter f348v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f349w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f350x;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuff.Mode f351x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f352y;

    /* renamed from: y0, reason: collision with root package name */
    public int[] f353y0;

    /* renamed from: z, reason: collision with root package name */
    public float f354z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f355z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.fortunequest.neontrack.R.attr.chipStyle, com.fortunequest.neontrack.R.style.Widget_MaterialComponents_Chip_Action);
        this.f299A = -1.0f;
        this.f334f0 = new Paint(1);
        this.f335g0 = new Paint.FontMetrics();
        this.f336h0 = new RectF();
        this.f337i0 = new PointF();
        this.f338j0 = new Path();
        this.f346t0 = 255;
        this.f351x0 = PorterDuff.Mode.SRC_IN;
        this.f300A0 = new WeakReference(null);
        h(context);
        this.f333e0 = context;
        i iVar = new i(this);
        this.f339k0 = iVar;
        this.f307E = "";
        iVar.f770a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f297F0;
        setState(iArr);
        if (!Arrays.equals(this.f353y0, iArr)) {
            this.f353y0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.f304C0 = true;
        int[] iArr2 = P0.a.f859a;
        f298G0.setTint(-1);
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
        if (this.f299A != f2) {
            this.f299A = f2;
            j e2 = this.f917a.f903a.e();
            e2.f940e = new R0.a(f2);
            e2.f941f = new R0.a(f2);
            e2.f942g = new R0.a(f2);
            e2.h = new R0.a(f2);
            setShapeAppearanceModel(e2.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f309G;
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
            this.f309G = drawable != null ? drawable.mutate() : null;
            float p3 = p();
            U(drawable2);
            if (S()) {
                n(this.f309G);
            }
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.f311I != f2) {
            float p2 = p();
            this.f311I = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f312J = true;
        if (this.f310H != colorStateList) {
            this.f310H = colorStateList;
            if (S()) {
                D.a.h(this.f309G, colorStateList);
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
                    n(this.f309G);
                } else {
                    U(this.f309G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f301B != colorStateList) {
            this.f301B = colorStateList;
            if (this.f308E0) {
                R0.f fVar = this.f917a;
                if (fVar.d != colorStateList) {
                    fVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.f303C != f2) {
            this.f303C = f2;
            this.f334f0.setStrokeWidth(f2);
            if (this.f308E0) {
                this.f917a.f909j = f2;
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
        Drawable drawable3 = this.f314L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof D.d;
            drawable2 = drawable3;
            if (z2) {
            }
            if (drawable2 == drawable) {
                float q2 = q();
                this.f314L = drawable != null ? drawable.mutate() : null;
                int[] iArr = P0.a.f859a;
                this.f315M = new RippleDrawable(P0.a.a(this.f305D), this.f314L, f298G0);
                float q3 = q();
                U(drawable2);
                if (T()) {
                    n(this.f314L);
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
        if (this.f331c0 != f2) {
            this.f331c0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.f317O != f2) {
            this.f317O = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.f330b0 != f2) {
            this.f330b0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f316N != colorStateList) {
            this.f316N = colorStateList;
            if (T()) {
                D.a.h(this.f314L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.f313K != z2) {
            boolean T2 = T();
            this.f313K = z2;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.f314L);
                } else {
                    U(this.f314L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.f327Y != f2) {
            float p2 = p();
            this.f327Y = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.f326X != f2) {
            float p2 = p();
            this.f326X = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f305D != colorStateList) {
            this.f305D = colorStateList;
            this.f355z0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(O0.d dVar) {
        i iVar = this.f339k0;
        if (iVar.f774f != dVar) {
            iVar.f774f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f770a;
                Context context = this.f333e0;
                b bVar = iVar.f771b;
                dVar.f(context, textPaint, bVar);
                h hVar = (h) iVar.f773e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                iVar.d = true;
            }
            h hVar2 = (h) iVar.f773e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f320R && this.f321S != null && this.f345r0;
    }

    public final boolean S() {
        return this.F && this.f309G != null;
    }

    public final boolean T() {
        return this.f313K && this.f314L != null;
    }

    @Override // R0.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f346t0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z2 = this.f308E0;
        Paint paint = this.f334f0;
        RectF rectF3 = this.f336h0;
        if (!z2) {
            paint.setColor(this.f340l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (!this.f308E0) {
            paint.setColor(this.f341m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f347u0;
            if (colorFilter == null) {
                colorFilter = this.f348v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (this.f308E0) {
            super.draw(canvas);
        }
        if (this.f303C > RecyclerView.f1937A0 && !this.f308E0) {
            paint.setColor(this.o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f308E0) {
                ColorFilter colorFilter2 = this.f347u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f348v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f303C / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f299A - (this.f303C / 2.0f);
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        paint.setColor(this.f343p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f308E0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f338j0;
            R0.f fVar = this.f917a;
            this.f931r.a(fVar.f903a, fVar.i, rectF4, this.f930q, path);
            d(canvas, paint, path, this.f917a.f903a, f());
        } else {
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.f309G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f309G.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (R()) {
            o(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.f321S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f321S.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.f304C0 || this.f307E == null) {
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f337i0;
            pointF.set(RecyclerView.f1937A0, RecyclerView.f1937A0);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f307E;
            i iVar = this.f339k0;
            if (charSequence != null) {
                float p2 = p() + this.f325W + this.f328Z;
                if (D.b.a(this) == 0) {
                    pointF.x = bounds.left + p2;
                } else {
                    pointF.x = bounds.right - p2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = iVar.f770a;
                Paint.FontMetrics fontMetrics = this.f335g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f307E != null) {
                float p3 = p() + this.f325W + this.f328Z;
                float q2 = q() + this.f332d0 + this.f329a0;
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
            O0.d dVar = iVar.f774f;
            TextPaint textPaint2 = iVar.f770a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f774f.e(this.f333e0, textPaint2, iVar.f771b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(iVar.a(this.f307E.toString())) > Math.round(rectF3.width());
            if (z3) {
                i5 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i5 = 0;
            }
            CharSequence charSequence2 = this.f307E;
            if (z3 && this.f302B0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f302B0);
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
                float f11 = this.f332d0 + this.f331c0;
                if (D.b.a(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.f317O;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.f317O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.f317O;
                float f15 = exactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.f314L.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = P0.a.f859a;
            this.f315M.setBounds(this.f314L.getBounds());
            this.f315M.jumpToCurrentState();
            this.f315M.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.f346t0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // R0.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f346t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f347u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f354z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f339k0.a(this.f307E.toString()) + p() + this.f325W + this.f328Z + this.f329a0 + this.f332d0), this.f306D0);
    }

    @Override // R0.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // R0.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f308E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f354z, this.f299A);
        } else {
            outline.setRoundRect(bounds, this.f299A);
        }
        outline.setAlpha(this.f346t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // R0.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        O0.d dVar;
        ColorStateList colorStateList;
        return s(this.f350x) || s(this.f352y) || s(this.f301B) || !((dVar = this.f339k0.f774f) == null || (colorStateList = dVar.f852j) == null || !colorStateList.isStateful()) || ((this.f320R && this.f321S != null && this.f319Q) || t(this.f309G) || t(this.f321S) || s(this.f349w0));
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        D.b.b(drawable, D.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f314L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f353y0);
            }
            D.a.h(drawable, this.f316N);
            return;
        }
        Drawable drawable2 = this.f309G;
        if (drawable == drawable2 && this.f312J) {
            D.a.h(drawable2, this.f310H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.f325W + this.f326X;
            Drawable drawable = this.f345r0 ? this.f321S : this.f309G;
            float f3 = this.f311I;
            if (f3 <= RecyclerView.f1937A0 && drawable != null) {
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
            Drawable drawable2 = this.f345r0 ? this.f321S : this.f309G;
            float f6 = this.f311I;
            if (f6 <= RecyclerView.f1937A0 && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f333e0.getResources().getDisplayMetrics()));
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
            onLayoutDirectionChanged |= D.b.b(this.f309G, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= D.b.b(this.f321S, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= D.b.b(this.f314L, i);
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
            onLevelChange |= this.f309G.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f321S.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.f314L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // R0.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f308E0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f353y0);
    }

    public final float p() {
        if (!S() && !R()) {
            return RecyclerView.f1937A0;
        }
        float f2 = this.f326X;
        Drawable drawable = this.f345r0 ? this.f321S : this.f309G;
        float f3 = this.f311I;
        if (f3 <= RecyclerView.f1937A0 && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f327Y;
    }

    public final float q() {
        return T() ? this.f330b0 + this.f317O + this.f331c0 : RecyclerView.f1937A0;
    }

    public final float r() {
        return this.f308E0 ? this.f917a.f903a.f949e.a(f()) : this.f299A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // R0.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f346t0 != i) {
            this.f346t0 = i;
            invalidateSelf();
        }
    }

    @Override // R0.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f347u0 != colorFilter) {
            this.f347u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // R0.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f349w0 != colorStateList) {
            this.f349w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // R0.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f351x0 != mode) {
            this.f351x0 = mode;
            ColorStateList colorStateList = this.f349w0;
            this.f348v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (S()) {
            visible |= this.f309G.setVisible(z2, z3);
        }
        if (R()) {
            visible |= this.f321S.setVisible(z2, z3);
        }
        if (T()) {
            visible |= this.f314L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.f300A0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f2233p);
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
        ColorStateList colorStateList2 = this.f350x;
        int b2 = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f340l0) : 0);
        if (this.f340l0 != b2) {
            this.f340l0 = b2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f352y;
        int b3 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f341m0) : 0);
        if (this.f341m0 != b3) {
            this.f341m0 = b3;
            onStateChange = true;
        }
        int b4 = C.a.b(b3, b2);
        if ((this.f342n0 != b4) | (this.f917a.f905c == null)) {
            this.f342n0 = b4;
            j(ColorStateList.valueOf(b4));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f301B;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.o0) : 0;
        if (this.o0 != colorForState2) {
            this.o0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f355z0 == null || !P0.a.b(iArr)) ? 0 : this.f355z0.getColorForState(iArr, this.f343p0);
        if (this.f343p0 != colorForState3) {
            this.f343p0 = colorForState3;
        }
        O0.d dVar = this.f339k0.f774f;
        int colorForState4 = (dVar == null || (colorStateList = dVar.f852j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f344q0);
        if (this.f344q0 != colorForState4) {
            this.f344q0 = colorForState4;
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
                } else if (this.f319Q) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (this.f345r0 != z2 && this.f321S != null) {
            float p2 = p();
            this.f345r0 = z2;
            if (p2 != p()) {
                onStateChange = true;
                z3 = true;
                ColorStateList colorStateList5 = this.f349w0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.s0) : 0;
                if (this.s0 == colorForState) {
                    this.s0 = colorForState;
                    ColorStateList colorStateList6 = this.f349w0;
                    PorterDuff.Mode mode = this.f351x0;
                    this.f348v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z4 = onStateChange;
                }
                if (t(this.f309G)) {
                    z4 |= this.f309G.setState(iArr);
                }
                if (t(this.f321S)) {
                    z4 |= this.f321S.setState(iArr);
                }
                if (t(this.f314L)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z4 |= this.f314L.setState(iArr3);
                }
                int[] iArr4 = P0.a.f859a;
                if (t(this.f315M)) {
                    z4 |= this.f315M.setState(iArr2);
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
        ColorStateList colorStateList52 = this.f349w0;
        if (colorStateList52 == null) {
        }
        if (this.s0 == colorForState) {
        }
        if (t(this.f309G)) {
        }
        if (t(this.f321S)) {
        }
        if (t(this.f314L)) {
        }
        int[] iArr42 = P0.a.f859a;
        if (t(this.f315M)) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z4;
    }

    public final void w(boolean z2) {
        if (this.f319Q != z2) {
            this.f319Q = z2;
            float p2 = p();
            if (!z2 && this.f345r0) {
                this.f345r0 = false;
            }
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f321S != drawable) {
            float p2 = p();
            this.f321S = drawable;
            float p3 = p();
            U(this.f321S);
            n(this.f321S);
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f322T != colorStateList) {
            this.f322T = colorStateList;
            if (this.f320R && (drawable = this.f321S) != null && this.f319Q) {
                D.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.f320R != z2) {
            boolean R2 = R();
            this.f320R = z2;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f321S);
                } else {
                    U(this.f321S);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
