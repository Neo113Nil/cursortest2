package g2;

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

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class j extends Drawable implements z {
    public static final Paint J;
    public static final i[] K;
    public final RectF A;
    public final boolean B;
    public boolean C;
    public o D;
    public r0.h E;
    public final r0.g[] F;
    public float[] G;
    public float[] H;
    public j2.z I;

    /* renamed from: f, reason: collision with root package name */
    public final g f1857f;
    public h g;
    public final x[] h;

    /* renamed from: i, reason: collision with root package name */
    public final x[] f1858i;

    /* renamed from: j, reason: collision with root package name */
    public final BitSet f1859j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1860k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1861l;

    /* renamed from: m, reason: collision with root package name */
    public final Matrix f1862m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f1863n;

    /* renamed from: o, reason: collision with root package name */
    public final Path f1864o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f1865p;

    /* renamed from: q, reason: collision with root package name */
    public final RectF f1866q;

    /* renamed from: r, reason: collision with root package name */
    public final Region f1867r;

    /* renamed from: s, reason: collision with root package name */
    public final Region f1868s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f1869t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f1870u;

    /* renamed from: v, reason: collision with root package name */
    public final f2.a f1871v;

    /* renamed from: w, reason: collision with root package name */
    public final g f1872w;

    /* renamed from: x, reason: collision with root package name */
    public final q f1873x;

    /* renamed from: y, reason: collision with root package name */
    public PorterDuffColorFilter f1874y;

    /* renamed from: z, reason: collision with root package name */
    public PorterDuffColorFilter f1875z;

    static {
        Paint paint = new Paint(1);
        J = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        K = new i[4];
        int i4 = 0;
        while (true) {
            i[] iVarArr = K;
            if (i4 >= iVarArr.length) {
                return;
            }
            iVarArr[i4] = new i(i4);
            i4++;
        }
    }

    public j() {
        this(new o());
    }

    public final void a(RectF rectF, Path path) {
        this.f1873x.a(this.g.f1843a.d(), this.G, this.g.f1848i, rectF, this.f1872w, path);
        if (this.g.h != 1.0f) {
            Matrix matrix = this.f1862m;
            matrix.reset();
            float f4 = this.g.h;
            matrix.setScale(f4, f4, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A, true);
    }

    public final float b(RectF rectF, o oVar, float[] fArr) {
        if (fArr == null) {
            if (oVar.i(rectF)) {
                return oVar.f1889e.a(rectF);
            }
            return -1.0f;
        }
        if (this.C) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int c(int i4) {
        int i5;
        h hVar = this.g;
        float f4 = hVar.f1852m + 0.0f + hVar.f1851l;
        y1.a aVar = hVar.f1844b;
        if (aVar == null || !aVar.f3613a || c0.a.d(i4, 255) != aVar.f3615d) {
            return i4;
        }
        float min = (aVar.f3616e <= 0.0f || f4 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f4 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i4);
        int o4 = l0.g.o(c0.a.d(i4, 255), aVar.f3614b, min);
        if (min > 0.0f && (i5 = aVar.c) != 0) {
            o4 = c0.a.b(c0.a.d(i5, y1.a.f3612f), o4);
        }
        return c0.a.d(o4, alpha);
    }

    public final void d(Canvas canvas) {
        if (this.f1859j.cardinality() > 0) {
            Log.w("j", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i4 = this.g.f1854o;
        Path path = this.f1863n;
        f2.a aVar = this.f1871v;
        if (i4 != 0) {
            canvas.drawPath(path, aVar.f1732a);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            x xVar = this.h[i5];
            int i6 = this.g.f1853n;
            Matrix matrix = x.f1914b;
            xVar.a(matrix, aVar, i6, canvas);
            this.f1858i[i5].a(matrix, aVar, this.g.f1853n, canvas);
        }
        if (this.B) {
            double d4 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d4)) * this.g.f1854o);
            int cos = (int) (Math.cos(Math.toRadians(d4)) * this.g.f1854o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, J);
            canvas.translate(sin, cos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f1874y;
        Paint paint2 = this.f1869t;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i4 = this.g.f1850k;
        paint2.setAlpha(((i4 + (i4 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1875z;
        Paint paint3 = this.f1870u;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.g.f1849j);
        int alpha2 = paint3.getAlpha();
        int i5 = this.g.f1850k;
        paint3.setAlpha(((i5 + (i5 >>> 7)) * alpha2) >>> 8);
        boolean z3 = k() || !n();
        Paint.Style style = this.g.f1855p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z4 = this.f1860k;
            paint = paint2;
            Path path = this.f1863n;
            if (z4) {
                if (z3) {
                    a(g(), path);
                }
                this.f1860k = false;
            }
            if (k()) {
                canvas.save();
                double d4 = 0;
                canvas.translate((int) (this.g.f1854o * Math.sin(Math.toRadians(d4))), (int) (Math.cos(Math.toRadians(d4)) * this.g.f1854o));
                if (this.B) {
                    Rect bounds = getBounds();
                    RectF rectF = this.A;
                    int width = (int) (rectF.width() - bounds.width());
                    int height = (int) (rectF.height() - bounds.height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + width + " extra height: " + height + " path bounds: " + rectF);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.g.f1853n * 2) + ((int) rectF.width()) + width, (this.g.f1853n * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    int i6 = bounds.left;
                    int i7 = this.g.f1853n;
                    float f4 = (i6 - i7) - width;
                    float f5 = (bounds.top - i7) - height;
                    canvas2.translate(-f4, -f5);
                    d(canvas2);
                    canvas.drawBitmap(createBitmap, f4, f5, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
            e(canvas, paint, path, this.g.f1843a.d(), this.G, g());
        } else {
            paint = paint2;
        }
        if (l()) {
            if (this.f1861l) {
                o i8 = i();
                n j4 = i8.j();
                d dVar = i8.f1889e;
                g gVar = this.f1857f;
                j4.f1880e = gVar.a(dVar);
                j4.f1881f = gVar.a(i8.f1890f);
                j4.h = gVar.a(i8.h);
                j4.g = gVar.a(i8.g);
                this.D = j4.a();
                float[] fArr = this.G;
                if (fArr != null) {
                    if (this.H == null) {
                        this.H = new float[fArr.length];
                    }
                    float j5 = j();
                    int i9 = 0;
                    while (true) {
                        float[] fArr2 = this.G;
                        if (i9 >= fArr2.length) {
                            break;
                        }
                        this.H[i9] = Math.max(0.0f, fArr2[i9] - j5);
                        i9++;
                    }
                } else {
                    this.H = null;
                }
                if (z3) {
                    o oVar = this.D;
                    float[] fArr3 = this.H;
                    float f6 = this.g.f1848i;
                    RectF g = g();
                    RectF rectF2 = this.f1866q;
                    rectF2.set(g);
                    float j6 = j();
                    rectF2.inset(j6, j6);
                    this.f1873x.a(oVar, fArr3, f6, rectF2, null, this.f1864o);
                }
                this.f1861l = false;
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
            float f4 = b2 * this.g.f1848i;
            canvas.drawRoundRect(rectF, f4, f4, paint);
        }
    }

    public void f(Canvas canvas) {
        o oVar = this.D;
        float[] fArr = this.H;
        RectF g = g();
        RectF rectF = this.f1866q;
        rectF.set(g);
        float j4 = j();
        rectF.inset(j4, j4);
        e(canvas, this.f1870u, this.f1864o, oVar, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.f1865p;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.g.f1850k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.g.getClass();
        RectF g = g();
        if (g.isEmpty()) {
            return;
        }
        float b2 = b(g, this.g.f1843a.d(), this.G);
        if (b2 >= 0.0f) {
            outline.setRoundRect(getBounds(), b2 * this.g.f1848i);
            return;
        }
        boolean z3 = this.f1860k;
        Path path = this.f1863n;
        if (z3) {
            a(g, path);
            this.f1860k = false;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            x1.b.a(outline, path);
            return;
        }
        if (i4 >= 29) {
            try {
                x1.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            x1.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.g.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1867r;
        region.set(bounds);
        RectF g = g();
        Path path = this.f1863n;
        a(g, path);
        Region region2 = this.f1868s;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.G;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF g = g();
        o i4 = i();
        q qVar = this.f1873x;
        qVar.getClass();
        float a4 = i4.f1889e.a(g);
        o i5 = i();
        qVar.getClass();
        float a5 = i5.h.a(g) + a4;
        o i6 = i();
        qVar.getClass();
        float a6 = a5 - i6.g.a(g);
        o i7 = i();
        qVar.getClass();
        return (a6 - i7.f1890f.a(g)) / 2.0f;
    }

    public final o i() {
        return this.g.f1843a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1860k = true;
        this.f1861l = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.g.f1846e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.g.getClass();
        ColorStateList colorStateList2 = this.g.f1845d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.g.c;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.g.f1843a.e();
    }

    public final float j() {
        if (l()) {
            return this.f1870u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean k() {
        h hVar = this.g;
        hVar.getClass();
        return hVar.f1853n > 0 && !n() && !this.f1863n.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public final boolean l() {
        Paint.Style style = this.g.f1855p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1870u.getStrokeWidth() > 0.0f;
    }

    public final void m(Context context) {
        this.g.f1844b = new y1.a(context);
        v();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.g = new h(this.g);
        return this;
    }

    public final boolean n() {
        if (this.g.f1843a.c(getState()).i(g())) {
            return this.G == null || this.C;
        }
        return false;
    }

    public final void o(r0.h hVar) {
        if (this.E == hVar) {
            return;
        }
        this.E = hVar;
        int i4 = 0;
        while (true) {
            r0.g[] gVarArr = this.F;
            if (i4 >= gVarArr.length) {
                t(getState(), true);
                invalidateSelf();
                return;
            }
            if (gVarArr[i4] == null) {
                gVarArr[i4] = new r0.g(this, K[i4]);
            }
            r0.g gVar = gVarArr[i4];
            r0.h hVar2 = new r0.h();
            float f4 = (float) hVar.f3168b;
            if (f4 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            hVar2.f3168b = f4;
            hVar2.c = false;
            double d4 = hVar.f3167a;
            float f5 = (float) (d4 * d4);
            if (f5 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            hVar2.f3167a = Math.sqrt(f5);
            hVar2.c = false;
            gVar.f3164j = hVar2;
            i4++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1860k = true;
        this.f1861l = true;
        super.onBoundsChange(rect);
        if (!this.g.f1843a.e() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        r0.g[] gVarArr = this.F;
        int length = gVarArr.length;
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                r0.g gVar = gVarArr[i4];
                if (gVar != null && gVar.f3161e) {
                    z3 = true;
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        t(state, true ^ z3);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.g.f1843a.e()) {
            t(iArr, false);
        }
        boolean z3 = s(iArr) || u();
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    public final void p(float f4) {
        h hVar = this.g;
        if (hVar.f1852m != f4) {
            hVar.f1852m = f4;
            v();
        }
    }

    public final void q(ColorStateList colorStateList) {
        h hVar = this.g;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(m mVar) {
        if (mVar instanceof o) {
            setShapeAppearanceModel((o) mVar);
            return;
        }
        b0 b0Var = (b0) mVar;
        h hVar = this.g;
        if (hVar.f1843a != b0Var) {
            hVar.f1843a = b0Var;
            t(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean s(int[] iArr) {
        boolean z3;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.g.c == null || color2 == (colorForState2 = this.g.c.getColorForState(iArr, (color2 = (paint2 = this.f1869t).getColor())))) {
            z3 = false;
        } else {
            paint2.setColor(colorForState2);
            z3 = true;
        }
        if (this.g.f1845d == null || color == (colorForState = this.g.f1845d.getColorForState(iArr, (color = (paint = this.f1870u).getColor())))) {
            return z3;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        h hVar = this.g;
        if (hVar.f1850k != i4) {
            hVar.f1850k = i4;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.g.getClass();
        super.invalidateSelf();
    }

    @Override // g2.z
    public final void setShapeAppearanceModel(o oVar) {
        this.g.f1843a = oVar;
        this.G = null;
        this.H = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.g.f1846e = colorStateList;
        u();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.g;
        if (hVar.f1847f != mode) {
            hVar.f1847f = mode;
            u();
            super.invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int[] iArr, boolean z3) {
        boolean z4;
        RectF g = g();
        if (!this.g.f1843a.e() || g.isEmpty()) {
            return;
        }
        int i4 = 0;
        boolean z5 = z3 | (this.E == null);
        if (this.G == null) {
            this.G = new float[4];
        }
        o c = this.g.f1843a.c(iArr);
        float[] fArr = this.G;
        if (fArr.length > 1) {
            float f4 = fArr[0];
            for (int i5 = 1; i5 < fArr.length; i5++) {
                if (fArr[i5] != f4) {
                    break;
                }
            }
        }
        if (c.i(g())) {
            z4 = true;
            this.C = z4;
            if (!z4) {
                this.f1860k = true;
                this.f1861l = true;
            }
            while (i4 < 4) {
                this.f1873x.getClass();
                float a4 = (i4 != 1 ? i4 != 2 ? i4 != 3 ? c.f1890f : c.f1889e : c.h : c.g).a(g);
                if (z5) {
                    this.G[i4] = a4;
                }
                r0.g[] gVarArr = this.F;
                r0.g gVar = gVarArr[i4];
                if (gVar != null) {
                    gVar.a(a4);
                    if (z5) {
                        gVarArr[i4].d();
                    }
                }
                i4++;
            }
            if (z5) {
                return;
            }
            invalidateSelf();
            return;
        }
        z4 = false;
        this.C = z4;
        if (!z4) {
        }
        while (i4 < 4) {
        }
        if (z5) {
        }
    }

    public final boolean u() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1874y;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1875z;
        h hVar = this.g;
        ColorStateList colorStateList = hVar.f1846e;
        PorterDuff.Mode mode = hVar.f1847f;
        if (colorStateList == null || mode == null) {
            int color = this.f1869t.getColor();
            int c = c(color);
            porterDuffColorFilter = c != color ? new PorterDuffColorFilter(c, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f1874y = porterDuffColorFilter;
        this.g.getClass();
        this.f1875z = null;
        this.g.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f1874y) && Objects.equals(porterDuffColorFilter3, this.f1875z)) ? false : true;
    }

    public final void v() {
        h hVar = this.g;
        float f4 = hVar.f1852m + 0.0f;
        hVar.f1853n = (int) Math.ceil(0.75f * f4);
        this.g.f1854o = (int) Math.ceil(f4 * 0.25f);
        u();
        if (k() || !n()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public j(Context context, AttributeSet attributeSet, int i4, int i5) {
        this(o.f(context, attributeSet, i4, i5).a());
    }

    public j(o oVar) {
        this(new h(oVar));
    }

    public j(m mVar) {
        this(new h(mVar));
    }

    public j(h hVar) {
        this.f1857f = new g(this);
        this.h = new x[4];
        this.f1858i = new x[4];
        this.f1859j = new BitSet(8);
        this.f1862m = new Matrix();
        this.f1863n = new Path();
        this.f1864o = new Path();
        this.f1865p = new RectF();
        this.f1866q = new RectF();
        this.f1867r = new Region();
        this.f1868s = new Region();
        Paint paint = new Paint(1);
        this.f1869t = paint;
        Paint paint2 = new Paint(1);
        this.f1870u = paint2;
        this.f1871v = new f2.a();
        this.f1873x = q.b();
        this.A = new RectF();
        this.B = true;
        this.C = true;
        this.F = new r0.g[4];
        this.g = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        u();
        s(getState());
        this.f1872w = new g(this);
    }
}
