package n5;

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
import r5.h;
import r5.i;
import w5.g;
import w5.j;
import w5.m;
import w5.n;
import w5.p;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends j implements Drawable.Callback, h {
    public static final int[] R0 = {R.attr.state_enabled};
    public static final ShapeDrawable S0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public boolean D0;
    public int E0;
    public int F0;
    public ColorFilter G0;
    public PorterDuffColorFilter H0;
    public ColorStateList I0;
    public ColorStateList J;
    public PorterDuff.Mode J0;
    public ColorStateList K;
    public int[] K0;
    public float L;
    public ColorStateList L0;
    public float M;
    public WeakReference M0;
    public ColorStateList N;
    public TextUtils.TruncateAt N0;
    public float O;
    public boolean O0;
    public ColorStateList P;
    public int P0;
    public CharSequence Q;
    public boolean Q0;
    public boolean R;
    public Drawable S;
    public ColorStateList T;
    public float U;
    public boolean V;
    public boolean W;
    public Drawable X;
    public RippleDrawable Y;
    public ColorStateList Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f5380a0;

    /* renamed from: b0, reason: collision with root package name */
    public SpannableStringBuilder f5381b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f5382c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f5383d0;

    /* renamed from: e0, reason: collision with root package name */
    public Drawable f5384e0;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f5385f0;

    /* renamed from: g0, reason: collision with root package name */
    public g5.b f5386g0;

    /* renamed from: h0, reason: collision with root package name */
    public g5.b f5387h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f5388i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f5389j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f5390k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f5391l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f5392m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f5393n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f5394o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f5395p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Context f5396q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Paint f5397r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Paint.FontMetrics f5398s0;

    /* renamed from: t0, reason: collision with root package name */
    public final RectF f5399t0;

    /* renamed from: u0, reason: collision with root package name */
    public final PointF f5400u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Path f5401v0;

    /* renamed from: w0, reason: collision with root package name */
    public final i f5402w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f5403x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f5404y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f5405z0;

    public f(Context context, AttributeSet attributeSet) {
        super(n.b(context, attributeSet, com.snovikpovik.vuevnxsj.R.attr.chipStyle, com.snovikpovik.vuevnxsj.R.style.Widget_MaterialComponents_Chip_Action).a());
        this.M = -1.0f;
        this.f5397r0 = new Paint(1);
        this.f5398s0 = new Paint.FontMetrics();
        this.f5399t0 = new RectF();
        this.f5400u0 = new PointF();
        this.f5401v0 = new Path();
        this.F0 = 255;
        this.J0 = PorterDuff.Mode.SRC_IN;
        this.M0 = new WeakReference(null);
        k(context);
        this.f5396q0 = context;
        i iVar = new i(this);
        this.f5402w0 = iVar;
        this.Q = "";
        iVar.f6671a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = R0;
        setState(iArr);
        R(iArr);
        this.O0 = true;
        S0.setTint(-1);
    }

    public static void b0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean y(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean z(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A() {
        e eVar = (e) this.M0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f1911s);
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
    public final boolean B(int[] iArr, int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z3;
        boolean z7;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.J;
        int c8 = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f5403x0) : 0);
        boolean z8 = true;
        if (this.f5403x0 != c8) {
            this.f5403x0 = c8;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.K;
        int c9 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f5404y0) : 0);
        if (this.f5404y0 != c9) {
            this.f5404y0 = c9;
            onStateChange = true;
        }
        int b8 = i3.a.b(c9, c8);
        if ((this.f5405z0 != b8) | (this.f8105e.f8090d == null)) {
            this.f5405z0 = b8;
            n(ColorStateList.valueOf(b8));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.N;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.A0) : 0;
        if (this.A0 != colorForState3) {
            this.A0 = colorForState3;
            onStateChange = true;
        }
        if (this.L0 != null) {
            int[] iArr3 = u5.a.f7413a;
            boolean z9 = false;
            boolean z10 = false;
            for (int i8 : iArr) {
                if (i8 == 16842910) {
                    z9 = true;
                } else if (i8 == 16842908 || i8 == 16842919 || i8 == 16843623) {
                    z10 = true;
                }
            }
            if (z9 && z10) {
                i = this.L0.getColorForState(iArr, this.B0);
                if (this.B0 != i) {
                    this.B0 = i;
                }
                t5.d dVar = this.f5402w0.f6676f;
                colorForState = (dVar != null || (colorStateList = dVar.f6916k) == null) ? 0 : colorStateList.getColorForState(iArr, this.C0);
                if (this.C0 != colorForState) {
                    this.C0 = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        }
                        if (state[i9] != 16842912) {
                            i9++;
                        } else if (this.f5382c0) {
                            z3 = true;
                        }
                    }
                }
                z3 = false;
                if (this.D0 != z3 || this.f5384e0 == null) {
                    z7 = false;
                } else {
                    float v7 = v();
                    this.D0 = z3;
                    if (v7 != v()) {
                        onStateChange = true;
                        z7 = true;
                    } else {
                        z7 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.I0;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.E0) : 0;
                if (this.E0 == colorForState2) {
                    this.E0 = colorForState2;
                    ColorStateList colorStateList6 = this.I0;
                    PorterDuff.Mode mode = this.J0;
                    this.H0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z8 = onStateChange;
                }
                if (z(this.S)) {
                    z8 |= this.S.setState(iArr);
                }
                if (z(this.f5384e0)) {
                    z8 |= this.f5384e0.setState(iArr);
                }
                if (z(this.X)) {
                    int[] iArr4 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                    z8 |= this.X.setState(iArr4);
                }
                if (z(this.Y)) {
                    z8 |= this.Y.setState(iArr2);
                }
                if (z8) {
                    invalidateSelf();
                }
                if (z7) {
                    A();
                }
                return z8;
            }
        }
        i = 0;
        if (this.B0 != i) {
        }
        t5.d dVar2 = this.f5402w0.f6676f;
        if (dVar2 != null) {
        }
        if (this.C0 != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z3 = false;
        if (this.D0 != z3) {
        }
        z7 = false;
        ColorStateList colorStateList52 = this.I0;
        if (colorStateList52 == null) {
        }
        if (this.E0 == colorForState2) {
        }
        if (z(this.S)) {
        }
        if (z(this.f5384e0)) {
        }
        if (z(this.X)) {
        }
        if (z(this.Y)) {
        }
        if (z8) {
        }
        if (z7) {
        }
        return z8;
    }

    public final void C(boolean z3) {
        if (this.f5382c0 != z3) {
            this.f5382c0 = z3;
            float v7 = v();
            if (!z3 && this.D0) {
                this.D0 = false;
            }
            float v8 = v();
            invalidateSelf();
            if (v7 != v8) {
                A();
            }
        }
    }

    public final void D(Drawable drawable) {
        if (this.f5384e0 != drawable) {
            float v7 = v();
            this.f5384e0 = drawable;
            float v8 = v();
            b0(this.f5384e0);
            t(this.f5384e0);
            invalidateSelf();
            if (v7 != v8) {
                A();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f5385f0 != colorStateList) {
            this.f5385f0 = colorStateList;
            if (this.f5383d0 && (drawable = this.f5384e0) != null && this.f5382c0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z3) {
        if (this.f5383d0 != z3) {
            boolean Y = Y();
            this.f5383d0 = z3;
            boolean Y2 = Y();
            if (Y != Y2) {
                if (Y2) {
                    t(this.f5384e0);
                } else {
                    b0(this.f5384e0);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void G(float f6) {
        if (this.M != f6) {
            this.M = f6;
            m f8 = this.f8105e.f8087a.f();
            f8.f8131e = new w5.a(f6);
            f8.f8132f = new w5.a(f6);
            f8.f8133g = new w5.a(f6);
            f8.f8134h = new w5.a(f6);
            setShapeAppearanceModel(f8.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.S;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof j3.b;
            drawable2 = drawable3;
            if (z3) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float v7 = v();
            this.S = drawable != null ? drawable.mutate() : null;
            float v8 = v();
            b0(drawable2);
            if (Z()) {
                t(this.S);
            }
            invalidateSelf();
            if (v7 != v8) {
                A();
            }
        }
    }

    public final void I(float f6) {
        if (this.U != f6) {
            float v7 = v();
            this.U = f6;
            float v8 = v();
            invalidateSelf();
            if (v7 != v8) {
                A();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        this.V = true;
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (Z()) {
                this.S.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(boolean z3) {
        if (this.R != z3) {
            boolean Z = Z();
            this.R = z3;
            boolean Z2 = Z();
            if (Z != Z2) {
                if (Z2) {
                    t(this.S);
                } else {
                    b0(this.S);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (this.Q0) {
                w5.h hVar = this.f8105e;
                if (hVar.f8091e != colorStateList) {
                    hVar.f8091e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void M(float f6) {
        if (this.O != f6) {
            this.O = f6;
            this.f5397r0.setStrokeWidth(f6);
            if (this.Q0) {
                this.f8105e.f8096k = f6;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.X;
        if (drawable3 != 0) {
            boolean z3 = drawable3 instanceof j3.b;
            drawable2 = drawable3;
            if (z3) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float w7 = w();
            this.X = drawable != null ? drawable.mutate() : null;
            this.Y = new RippleDrawable(u5.a.a(this.P), this.X, S0);
            float w8 = w();
            b0(drawable2);
            if (a0()) {
                t(this.X);
            }
            invalidateSelf();
            if (w7 != w8) {
                A();
            }
        }
    }

    public final void O(float f6) {
        if (this.f5394o0 != f6) {
            this.f5394o0 = f6;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void P(float f6) {
        if (this.f5380a0 != f6) {
            this.f5380a0 = f6;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final void Q(float f6) {
        if (this.f5393n0 != f6) {
            this.f5393n0 = f6;
            invalidateSelf();
            if (a0()) {
                A();
            }
        }
    }

    public final boolean R(int[] iArr) {
        if (Arrays.equals(this.K0, iArr)) {
            return false;
        }
        this.K0 = iArr;
        if (a0()) {
            return B(getState(), iArr);
        }
        return false;
    }

    public final void S(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (a0()) {
                this.X.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void T(boolean z3) {
        if (this.W != z3) {
            boolean a02 = a0();
            this.W = z3;
            boolean a03 = a0();
            if (a02 != a03) {
                if (a03) {
                    t(this.X);
                } else {
                    b0(this.X);
                }
                invalidateSelf();
                A();
            }
        }
    }

    public final void U(float f6) {
        if (this.f5390k0 != f6) {
            float v7 = v();
            this.f5390k0 = f6;
            float v8 = v();
            invalidateSelf();
            if (v7 != v8) {
                A();
            }
        }
    }

    public final void V(float f6) {
        if (this.f5389j0 != f6) {
            float v7 = v();
            this.f5389j0 = f6;
            float v8 = v();
            invalidateSelf();
            if (v7 != v8) {
                A();
            }
        }
    }

    public final void W(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            this.L0 = null;
            onStateChange(getState());
        }
    }

    public final void X(t5.d dVar) {
        i iVar = this.f5402w0;
        b bVar = iVar.f6672b;
        TextPaint textPaint = iVar.f6671a;
        if (iVar.f6676f != dVar) {
            iVar.f6676f = dVar;
            if (dVar != null) {
                Context context = this.f5396q0;
                dVar.e(context, textPaint, bVar);
                h hVar = (h) iVar.f6675e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.d(context, textPaint, bVar);
                iVar.f6674d = true;
            }
            h hVar2 = (h) iVar.f6675e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.A();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean Y() {
        return this.f5383d0 && this.f5384e0 != null && this.D0;
    }

    public final boolean Z() {
        return this.R && this.S != null;
    }

    public final boolean a0() {
        return this.W && this.X != null;
    }

    @Override // w5.j, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i8;
        float f6;
        int i9;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.F0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i8 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i8 = 0;
        }
        boolean z3 = this.Q0;
        Paint paint = this.f5397r0;
        RectF rectF = this.f5399t0;
        if (!z3) {
            paint.setColor(this.f5403x0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, x(), x(), paint);
        }
        if (!this.Q0) {
            paint.setColor(this.f5404y0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.G0;
            if (colorFilter == null) {
                colorFilter = this.H0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, x(), x(), paint);
        }
        if (this.Q0) {
            super.draw(canvas);
        }
        if (this.O > 0.0f && !this.Q0) {
            paint.setColor(this.A0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.Q0) {
                ColorFilter colorFilter2 = this.G0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.H0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f8 = bounds.left;
            float f9 = this.O / 2.0f;
            rectF.set(f8 + f9, bounds.top + f9, bounds.right - f9, bounds.bottom - f9);
            float f10 = this.M - (this.O / 2.0f);
            canvas2.drawRoundRect(rectF, f10, f10, paint);
        }
        paint.setColor(this.B0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.Q0) {
            RectF rectF2 = new RectF(bounds);
            w5.h hVar = this.f8105e;
            n nVar = hVar.f8087a;
            float[] fArr = this.E;
            float f11 = hVar.f8095j;
            g gVar = this.f8120u;
            p pVar = this.f8121v;
            f6 = 2.0f;
            Path path = this.f5401v0;
            pVar.a(nVar, fArr, f11, rectF2, gVar, path);
            e(canvas2, paint, path, this.f8105e.f8087a, this.E, g());
        } else {
            canvas2.drawRoundRect(rectF, x(), x(), paint);
            f6 = 2.0f;
        }
        if (Z()) {
            u(bounds, rectF);
            float f12 = rectF.left;
            float f13 = rectF.top;
            canvas2.translate(f12, f13);
            this.S.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.S.draw(canvas2);
            canvas2.translate(-f12, -f13);
        }
        if (Y()) {
            u(bounds, rectF);
            float f14 = rectF.left;
            float f15 = rectF.top;
            canvas2.translate(f14, f15);
            this.f5384e0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f5384e0.draw(canvas2);
            canvas2.translate(-f14, -f15);
        }
        if (this.O0 && this.Q != null) {
            PointF pointF = this.f5400u0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.Q;
            i iVar = this.f5402w0;
            if (charSequence != null) {
                float v7 = v() + this.f5388i0 + this.f5391l0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + v7;
                } else {
                    pointF.x = bounds.right - v7;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = iVar.f6671a;
                Paint.FontMetrics fontMetrics = this.f5398s0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f6);
            }
            rectF.setEmpty();
            if (this.Q != null) {
                float v8 = v() + this.f5388i0 + this.f5391l0;
                float w7 = w() + this.f5395p0 + this.f5392m0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + v8;
                    rectF.right = bounds.right - w7;
                } else {
                    rectF.left = bounds.left + w7;
                    rectF.right = bounds.right - v8;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            t5.d dVar = iVar.f6676f;
            TextPaint textPaint2 = iVar.f6671a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                iVar.f6676f.d(this.f5396q0, textPaint2, iVar.f6672b);
            }
            textPaint2.setTextAlign(align);
            boolean z7 = Math.round(iVar.a(this.Q.toString())) > Math.round(rectF.width());
            if (z7) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i9 = save;
            } else {
                i9 = 0;
            }
            CharSequence charSequence2 = this.Q;
            if (z7 && this.N0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.N0);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z7) {
                canvas2.restoreToCount(i9);
            }
        }
        if (a0()) {
            rectF.setEmpty();
            if (a0()) {
                float f16 = this.f5395p0 + this.f5394o0;
                if (getLayoutDirection() == 0) {
                    float f17 = bounds.right - f16;
                    rectF.right = f17;
                    rectF.left = f17 - this.f5380a0;
                } else {
                    float f18 = bounds.left + f16;
                    rectF.left = f18;
                    rectF.right = f18 + this.f5380a0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f19 = this.f5380a0;
                float f20 = exactCenterY - (f19 / f6);
                rectF.top = f20;
                rectF.bottom = f20 + f19;
            }
            float f21 = rectF.left;
            float f22 = rectF.top;
            canvas2.translate(f21, f22);
            this.X.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.Y.setBounds(this.X.getBounds());
            this.Y.jumpToCurrentState();
            this.Y.draw(canvas2);
            canvas2.translate(-f21, -f22);
        }
        if (this.F0 < 255) {
            canvas2.restoreToCount(i8);
        }
    }

    @Override // w5.j, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.F0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.G0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(w() + this.f5402w0.a(this.Q.toString()) + v() + this.f5388i0 + this.f5391l0 + this.f5392m0 + this.f5395p0), this.P0);
    }

    @Override // w5.j, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // w5.j, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.Q0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.L, this.M);
        } else {
            outline.setRoundRect(bounds, this.M);
            outline2 = outline;
        }
        outline2.setAlpha(this.F0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // w5.j, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (y(this.J) || y(this.K) || y(this.N)) {
            return true;
        }
        t5.d dVar = this.f5402w0.f6676f;
        if (dVar == null || (colorStateList = dVar.f6916k) == null || !colorStateList.isStateful()) {
            return (this.f5383d0 && this.f5384e0 != null && this.f5382c0) || z(this.S) || z(this.f5384e0) || y(this.I0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (Z()) {
            onLayoutDirectionChanged |= this.S.setLayoutDirection(i);
        }
        if (Y()) {
            onLayoutDirectionChanged |= this.f5384e0.setLayoutDirection(i);
        }
        if (a0()) {
            onLayoutDirectionChanged |= this.X.setLayoutDirection(i);
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
        if (Z()) {
            onLevelChange |= this.S.setLevel(i);
        }
        if (Y()) {
            onLevelChange |= this.f5384e0.setLevel(i);
        }
        if (a0()) {
            onLevelChange |= this.X.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // w5.j, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.Q0) {
            super.onStateChange(iArr);
        }
        return B(iArr, this.K0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j7);
        }
    }

    @Override // w5.j, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.F0 != i) {
            this.F0 = i;
            invalidateSelf();
        }
    }

    @Override // w5.j, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.G0 != colorFilter) {
            this.G0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // w5.j, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.I0 != colorStateList) {
            this.I0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // w5.j, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.J0 != mode) {
            this.J0 = mode;
            ColorStateList colorStateList = this.I0;
            this.H0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z7) {
        boolean visible = super.setVisible(z3, z7);
        if (Z()) {
            visible |= this.S.setVisible(z3, z7);
        }
        if (Y()) {
            visible |= this.f5384e0.setVisible(z3, z7);
        }
        if (a0()) {
            visible |= this.X.setVisible(z3, z7);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.X) {
            if (drawable.isStateful()) {
                drawable.setState(this.K0);
            }
            drawable.setTintList(this.Z);
            return;
        }
        Drawable drawable2 = this.S;
        if (drawable == drawable2 && this.V) {
            drawable2.setTintList(this.T);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void u(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Z() || Y()) {
            float f6 = this.f5388i0 + this.f5389j0;
            Drawable drawable = this.D0 ? this.f5384e0 : this.S;
            float f8 = this.U;
            if (f8 <= 0.0f && drawable != null) {
                f8 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f9 = rect.left + f6;
                rectF.left = f9;
                rectF.right = f9 + f8;
            } else {
                float f10 = rect.right - f6;
                rectF.right = f10;
                rectF.left = f10 - f8;
            }
            Drawable drawable2 = this.D0 ? this.f5384e0 : this.S;
            float f11 = this.U;
            if (f11 <= 0.0f && drawable2 != null) {
                f11 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f5396q0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f11) {
                    f11 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f11 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f11;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        if (!Z() && !Y()) {
            return 0.0f;
        }
        float f6 = this.f5389j0;
        Drawable drawable = this.D0 ? this.f5384e0 : this.S;
        float f8 = this.U;
        if (f8 <= 0.0f && drawable != null) {
            f8 = drawable.getIntrinsicWidth();
        }
        return f8 + f6 + this.f5390k0;
    }

    public final float w() {
        if (a0()) {
            return this.f5393n0 + this.f5380a0 + this.f5394o0;
        }
        return 0.0f;
    }

    public final float x() {
        if (!this.Q0) {
            return this.M;
        }
        float[] fArr = this.E;
        return fArr != null ? fArr[3] : this.f8105e.f8087a.f8142e.a(g());
    }
}
