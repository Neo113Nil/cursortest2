package o2;

import a.g0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class j extends Drawable implements z {
    public static final Paint J;
    public static final i[] K;
    public final RectF A;
    public boolean B;
    public boolean C;
    public o D;
    public v0.f E;
    public final v0.e[] F;
    public float[] G;
    public float[] H;
    public g0 I;

    /* renamed from: f, reason: collision with root package name */
    public final g f2954f;

    /* renamed from: g, reason: collision with root package name */
    public h f2955g;
    public final x[] h;
    public final x[] i;

    /* renamed from: j, reason: collision with root package name */
    public final BitSet f2956j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2957k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2958l;

    /* renamed from: m, reason: collision with root package name */
    public final Matrix f2959m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f2960n;

    /* renamed from: o, reason: collision with root package name */
    public final Path f2961o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f2962p;

    /* renamed from: q, reason: collision with root package name */
    public final RectF f2963q;

    /* renamed from: r, reason: collision with root package name */
    public final Region f2964r;

    /* renamed from: s, reason: collision with root package name */
    public final Region f2965s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f2966t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f2967u;

    /* renamed from: v, reason: collision with root package name */
    public final n2.a f2968v;

    /* renamed from: w, reason: collision with root package name */
    public final g f2969w;

    /* renamed from: x, reason: collision with root package name */
    public final q f2970x;

    /* renamed from: y, reason: collision with root package name */
    public PorterDuffColorFilter f2971y;

    /* renamed from: z, reason: collision with root package name */
    public PorterDuffColorFilter f2972z;

    static {
        Paint paint = new Paint(1);
        J = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        K = new i[4];
        int i = 0;
        while (true) {
            i[] iVarArr = K;
            if (i >= iVarArr.length) {
                return;
            }
            iVarArr[i] = new i(i);
            i++;
        }
    }

    public j() {
        this(new o());
    }

    public final void a(RectF rectF, Path path) {
        this.f2970x.a(this.f2955g.f2940a.d(), this.G, this.f2955g.i, rectF, this.f2969w, path);
        if (this.f2955g.h != 1.0f) {
            Matrix matrix = this.f2959m;
            matrix.reset();
            float f5 = this.f2955g.h;
            matrix.setScale(f5, f5, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A, true);
    }

    public final float b(RectF rectF, o oVar, float[] fArr) {
        if (fArr == null) {
            if (oVar.j(rectF)) {
                return oVar.f2987e.a(rectF);
            }
            return -1.0f;
        }
        if (this.C) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int c(int i) {
        int i4;
        h hVar = this.f2955g;
        float f5 = hVar.f2949m + 0.0f + hVar.f2948l;
        e2.a aVar = hVar.f2941b;
        if (aVar == null || !aVar.f1385a || f0.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f1388e <= 0.0f || f5 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f5 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int P = b4.l.P(f0.a.d(i, 255), aVar.f1386b, min);
        if (min > 0.0f && (i4 = aVar.f1387c) != 0) {
            P = f0.a.b(f0.a.d(i4, e2.a.f1384f), P);
        }
        return f0.a.d(P, alpha);
    }

    public final void d(Canvas canvas) {
        if (this.f2956j.cardinality() > 0) {
            Log.w("j", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f2955g.f2951o;
        Path path = this.f2960n;
        n2.a aVar = this.f2968v;
        if (i != 0) {
            canvas.drawPath(path, aVar.f2861a);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            x xVar = this.h[i4];
            int i5 = this.f2955g.f2950n;
            Matrix matrix = x.f3015b;
            xVar.a(matrix, aVar, i5, canvas);
            this.i[i4].a(matrix, aVar, this.f2955g.f2950n, canvas);
        }
        if (this.B) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f2955g.f2951o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f2955g.f2951o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, J);
            canvas.translate(sin, cos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f2971y;
        Paint paint2 = this.f2966t;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.f2955g.f2947k;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2972z;
        Paint paint3 = this.f2967u;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f2955g.f2946j);
        int alpha2 = paint3.getAlpha();
        int i4 = this.f2955g.f2947k;
        paint3.setAlpha(((i4 + (i4 >>> 7)) * alpha2) >>> 8);
        boolean z4 = l() || !o();
        Paint.Style style = this.f2955g.f2952p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z5 = this.f2957k;
            paint = paint2;
            Path path = this.f2960n;
            if (z5) {
                if (z4) {
                    a(g(), path);
                }
                this.f2957k = false;
            }
            if (l()) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (this.f2955g.f2951o * Math.sin(Math.toRadians(d))), (int) (Math.cos(Math.toRadians(d)) * this.f2955g.f2951o));
                if (this.B) {
                    Rect bounds = getBounds();
                    RectF rectF = this.A;
                    int width = (int) (rectF.width() - bounds.width());
                    int height = (int) (rectF.height() - bounds.height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + width + " extra height: " + height + " path bounds: " + rectF);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f2955g.f2950n * 2) + ((int) rectF.width()) + width, (this.f2955g.f2950n * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    int i5 = bounds.left;
                    int i6 = this.f2955g.f2950n;
                    float f5 = (i5 - i6) - width;
                    float f6 = (bounds.top - i6) - height;
                    canvas2.translate(-f5, -f6);
                    d(canvas2);
                    canvas.drawBitmap(createBitmap, f5, f6, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
            e(canvas, paint, path, this.f2955g.f2940a.d(), this.G, g());
        } else {
            paint = paint2;
        }
        if (m()) {
            if (this.f2958l) {
                o i7 = i();
                n k4 = i7.k();
                d dVar = i7.f2987e;
                g gVar = this.f2954f;
                k4.f2977e = gVar.a(dVar);
                k4.f2978f = gVar.a(i7.f2988f);
                k4.h = gVar.a(i7.h);
                k4.f2979g = gVar.a(i7.f2989g);
                this.D = k4.a();
                float[] fArr = this.G;
                if (fArr != null) {
                    if (this.H == null) {
                        this.H = new float[fArr.length];
                    }
                    float j2 = j();
                    int i8 = 0;
                    while (true) {
                        float[] fArr2 = this.G;
                        if (i8 >= fArr2.length) {
                            break;
                        }
                        this.H[i8] = Math.max(0.0f, fArr2[i8] - j2);
                        i8++;
                    }
                } else {
                    this.H = null;
                }
                if (z4) {
                    o oVar = this.D;
                    float[] fArr3 = this.H;
                    float f7 = this.f2955g.i;
                    RectF g3 = g();
                    RectF rectF2 = this.f2963q;
                    rectF2.set(g3);
                    float j4 = j();
                    rectF2.inset(j4, j4);
                    this.f2970x.a(oVar, fArr3, f7, rectF2, null, this.f2961o);
                }
                this.f2958l = false;
            }
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, o oVar, float[] fArr, RectF rectF) {
        float b2 = b(rectF, oVar, fArr);
        if (b2 < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f5 = b2 * this.f2955g.i;
            canvas.drawRoundRect(rectF, f5, f5, paint);
        }
    }

    public void f(Canvas canvas) {
        o oVar = this.D;
        float[] fArr = this.H;
        RectF g3 = g();
        RectF rectF = this.f2963q;
        rectF.set(g3);
        float j2 = j();
        rectF.inset(j2, j2);
        e(canvas, this.f2967u, this.f2961o, oVar, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.f2962p;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2955g.f2947k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f2955g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2955g.getClass();
        RectF g3 = g();
        if (g3.isEmpty()) {
            return;
        }
        float b2 = b(g3, this.f2955g.f2940a.d(), this.G);
        if (b2 >= 0.0f) {
            outline.setRoundRect(getBounds(), b2 * this.f2955g.i);
            return;
        }
        boolean z4 = this.f2957k;
        Path path = this.f2960n;
        if (z4) {
            a(g3, path);
            this.f2957k = false;
        }
        b4.l.e0(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f2955g.f2945g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f2964r;
        region.set(bounds);
        RectF g3 = g();
        Path path = this.f2960n;
        a(g3, path);
        Region region2 = this.f2965s;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.G;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF g3 = g();
        o i = i();
        q qVar = this.f2970x;
        qVar.getClass();
        float a5 = i.f2987e.a(g3);
        o i4 = i();
        qVar.getClass();
        float a6 = i4.h.a(g3) + a5;
        o i5 = i();
        qVar.getClass();
        float a7 = a6 - i5.f2989g.a(g3);
        o i6 = i();
        qVar.getClass();
        return (a7 - i6.f2988f.a(g3)) / 2.0f;
    }

    public final o i() {
        return this.f2955g.f2940a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f2957k = true;
        this.f2958l = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f2955g.f2943e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f2955g.getClass();
        ColorStateList colorStateList2 = this.f2955g.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f2955g.f2942c;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.f2955g.f2940a.f();
    }

    public final float j() {
        if (m()) {
            return this.f2967u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float k() {
        float[] fArr = this.G;
        return fArr != null ? fArr[3] : this.f2955g.f2940a.d().f2987e.a(g());
    }

    public final boolean l() {
        h hVar = this.f2955g;
        hVar.getClass();
        return hVar.f2950n > 0 && !o() && !this.f2960n.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public final boolean m() {
        Paint.Style style = this.f2955g.f2952p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2967u.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2955g = new h(this.f2955g);
        return this;
    }

    public final void n(Context context) {
        this.f2955g.f2941b = new e2.a(context);
        y();
    }

    public final boolean o() {
        if (this.f2955g.f2940a.b(getState()).j(g())) {
            return this.G == null || this.C;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f2957k = true;
        this.f2958l = true;
        super.onBoundsChange(rect);
        if (!this.f2955g.f2940a.f() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        v0.e[] eVarArr = this.F;
        int length = eVarArr.length;
        boolean z4 = false;
        int i = 0;
        while (true) {
            if (i < length) {
                v0.e eVar = eVarArr[i];
                if (eVar != null && eVar.f3711e) {
                    z4 = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        w(state, true ^ z4);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f2955g.f2940a.f()) {
            w(iArr, false);
        }
        boolean z4 = v(iArr) || x();
        if (z4) {
            invalidateSelf();
        }
        return z4;
    }

    public final void p(v0.f fVar) {
        if (this.E == fVar) {
            return;
        }
        this.E = fVar;
        int i = 0;
        while (true) {
            v0.e[] eVarArr = this.F;
            if (i >= eVarArr.length) {
                w(getState(), true);
                invalidateSelf();
                return;
            }
            if (eVarArr[i] == null) {
                eVarArr[i] = new v0.e(this, K[i]);
            }
            v0.e eVar = eVarArr[i];
            v0.f fVar2 = new v0.f();
            float f5 = (float) fVar.f3718b;
            if (f5 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            fVar2.f3718b = f5;
            fVar2.f3719c = false;
            double d = fVar.f3717a;
            float f6 = (float) (d * d);
            if (f6 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            fVar2.f3717a = Math.sqrt(f6);
            fVar2.f3719c = false;
            eVar.f3714j = fVar2;
            i++;
        }
    }

    public final void q(float f5) {
        h hVar = this.f2955g;
        if (hVar.f2949m != f5) {
            hVar.f2949m = f5;
            y();
        }
    }

    public final void r(ColorStateList colorStateList) {
        h hVar = this.f2955g;
        if (hVar.f2942c != colorStateList) {
            hVar.f2942c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void s(float f5) {
        h hVar = this.f2955g;
        if (hVar.i != f5) {
            hVar.i = f5;
            this.f2957k = true;
            this.f2958l = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        h hVar = this.f2955g;
        if (hVar.f2947k != i) {
            hVar.f2947k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2955g.getClass();
        super.invalidateSelf();
    }

    @Override // o2.z
    public final void setShapeAppearanceModel(o oVar) {
        this.f2955g.f2940a = oVar;
        this.G = null;
        this.H = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2955g.f2943e = colorStateList;
        x();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.f2955g;
        if (hVar.f2944f != mode) {
            hVar.f2944f = mode;
            x();
            super.invalidateSelf();
        }
    }

    public final void t() {
        this.f2968v.a(-12303292);
        this.f2955g.getClass();
        super.invalidateSelf();
    }

    public final void u(m mVar) {
        if (mVar instanceof o) {
            setShapeAppearanceModel((o) mVar);
            return;
        }
        c0 c0Var = (c0) mVar;
        h hVar = this.f2955g;
        if (hVar.f2940a != c0Var) {
            hVar.f2940a = c0Var;
            w(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean v(int[] iArr) {
        boolean z4;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f2955g.f2942c == null || color2 == (colorForState2 = this.f2955g.f2942c.getColorForState(iArr, (color2 = (paint2 = this.f2966t).getColor())))) {
            z4 = false;
        } else {
            paint2.setColor(colorForState2);
            z4 = true;
        }
        if (this.f2955g.d == null || color == (colorForState = this.f2955g.d.getColorForState(iArr, (color = (paint = this.f2967u).getColor())))) {
            return z4;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(int[] iArr, boolean z4) {
        boolean z5;
        RectF g3 = g();
        if (!this.f2955g.f2940a.f() || g3.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z6 = z4 | (this.E == null);
        if (this.G == null) {
            this.G = new float[4];
        }
        o b2 = this.f2955g.f2940a.b(iArr);
        float[] fArr = this.G;
        if (fArr.length > 1) {
            float f5 = fArr[0];
            for (int i4 = 1; i4 < fArr.length; i4++) {
                if (fArr[i4] != f5) {
                    break;
                }
            }
        }
        if (b2.j(g())) {
            z5 = true;
            this.C = z5;
            if (!z5) {
                this.f2957k = true;
                this.f2958l = true;
            }
            while (i < 4) {
                this.f2970x.getClass();
                float a5 = (i != 1 ? i != 2 ? i != 3 ? b2.f2988f : b2.f2987e : b2.h : b2.f2989g).a(g3);
                if (z6) {
                    this.G[i] = a5;
                }
                v0.e[] eVarArr = this.F;
                v0.e eVar = eVarArr[i];
                if (eVar != null) {
                    eVar.a(a5);
                    if (z6) {
                        eVarArr[i].d();
                    }
                }
                i++;
            }
            if (z6) {
                return;
            }
            invalidateSelf();
            return;
        }
        z5 = false;
        this.C = z5;
        if (!z5) {
        }
        while (i < 4) {
        }
        if (z6) {
        }
    }

    public final boolean x() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2971y;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f2972z;
        h hVar = this.f2955g;
        ColorStateList colorStateList = hVar.f2943e;
        PorterDuff.Mode mode = hVar.f2944f;
        if (colorStateList == null || mode == null) {
            int color = this.f2966t.getColor();
            int c5 = c(color);
            porterDuffColorFilter = c5 != color ? new PorterDuffColorFilter(c5, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f2971y = porterDuffColorFilter;
        this.f2955g.getClass();
        this.f2972z = null;
        this.f2955g.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f2971y) && Objects.equals(porterDuffColorFilter3, this.f2972z)) ? false : true;
    }

    public final void y() {
        h hVar = this.f2955g;
        float f5 = hVar.f2949m + 0.0f;
        hVar.f2950n = (int) Math.ceil(0.75f * f5);
        this.f2955g.f2951o = (int) Math.ceil(f5 * 0.25f);
        x();
        if (l() || !o()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public j(Context context, AttributeSet attributeSet, int i, int i4) {
        this(o.g(context, attributeSet, i, i4).a());
    }

    public j(o oVar) {
        this(new h(oVar));
    }

    public j(m mVar) {
        this(new h(mVar));
    }

    public j(h hVar) {
        this.f2954f = new g(this);
        this.h = new x[4];
        this.i = new x[4];
        this.f2956j = new BitSet(8);
        this.f2959m = new Matrix();
        this.f2960n = new Path();
        this.f2961o = new Path();
        this.f2962p = new RectF();
        this.f2963q = new RectF();
        this.f2964r = new Region();
        this.f2965s = new Region();
        Paint paint = new Paint(1);
        this.f2966t = paint;
        Paint paint2 = new Paint(1);
        this.f2967u = paint2;
        this.f2968v = new n2.a();
        this.f2970x = q.b();
        this.A = new RectF();
        this.B = true;
        this.C = true;
        this.F = new v0.e[4];
        this.f2955g = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        x();
        v(getState());
        this.f2969w = new g(this);
    }
}
