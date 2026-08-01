package l2;

import a.e0;
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
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class j extends Drawable implements y {
    public static final Paint J;
    public static final i[] K;
    public final RectF A;
    public boolean B;
    public boolean C;
    public n D;
    public u0.f E;
    public final u0.e[] F;
    public float[] G;
    public float[] H;
    public e0 I;

    /* renamed from: f, reason: collision with root package name */
    public final g f2597f;

    /* renamed from: g, reason: collision with root package name */
    public h f2598g;

    /* renamed from: h, reason: collision with root package name */
    public final w[] f2599h;
    public final w[] i;

    /* renamed from: j, reason: collision with root package name */
    public final BitSet f2600j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2601k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2602l;

    /* renamed from: m, reason: collision with root package name */
    public final Matrix f2603m;

    /* renamed from: n, reason: collision with root package name */
    public final Path f2604n;

    /* renamed from: o, reason: collision with root package name */
    public final Path f2605o;

    /* renamed from: p, reason: collision with root package name */
    public final RectF f2606p;

    /* renamed from: q, reason: collision with root package name */
    public final RectF f2607q;

    /* renamed from: r, reason: collision with root package name */
    public final Region f2608r;

    /* renamed from: s, reason: collision with root package name */
    public final Region f2609s;

    /* renamed from: t, reason: collision with root package name */
    public final Paint f2610t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f2611u;

    /* renamed from: v, reason: collision with root package name */
    public final k2.a f2612v;

    /* renamed from: w, reason: collision with root package name */
    public final g f2613w;

    /* renamed from: x, reason: collision with root package name */
    public final p f2614x;

    /* renamed from: y, reason: collision with root package name */
    public PorterDuffColorFilter f2615y;

    /* renamed from: z, reason: collision with root package name */
    public PorterDuffColorFilter f2616z;

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
        this(new n());
    }

    public static float c(RectF rectF, n nVar, float[] fArr) {
        if (fArr == null) {
            if (nVar.f(rectF)) {
                return nVar.f2631e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f2 = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f2) {
                    return -1.0f;
                }
            }
        }
        if (nVar.e()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void b(RectF rectF, Path path) {
        h hVar = this.f2598g;
        this.f2614x.a(hVar.f2581a, this.G, hVar.f2588j, rectF, this.f2613w, path);
        if (this.f2598g.i != 1.0f) {
            Matrix matrix = this.f2603m;
            matrix.reset();
            float f2 = this.f2598g.i;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A, true);
    }

    public final int d(int i) {
        int i4;
        h hVar = this.f2598g;
        float f2 = hVar.f2592n + 0.0f + hVar.f2591m;
        d2.a aVar = hVar.f2583c;
        if (aVar == null || !aVar.f1122a || f0.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f1125e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int J2 = a.y.J(f0.a.d(i, 255), aVar.f1123b, min);
        if (min > 0.0f && (i4 = aVar.f1124c) != 0) {
            J2 = f0.a.b(f0.a.d(i4, d2.a.f1121f), J2);
        }
        return f0.a.d(J2, alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f2615y;
        Paint paint2 = this.f2610t;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.f2598g.f2590l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2616z;
        Paint paint3 = this.f2611u;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f2598g.f2589k);
        int alpha2 = paint3.getAlpha();
        int i4 = this.f2598g.f2590l;
        paint3.setAlpha(((i4 + (i4 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.f2598g.f2595q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z3 = this.f2601k;
            paint = paint2;
            Path path = this.f2604n;
            if (z3) {
                b(h(), path);
                this.f2601k = false;
            }
            h hVar = this.f2598g;
            hVar.getClass();
            if (hVar.f2593o > 0 && !n() && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f2598g.f2594p), (int) (Math.cos(Math.toRadians(d)) * this.f2598g.f2594p));
                if (this.B) {
                    RectF rectF = this.A;
                    int width = (int) (rectF.width() - getBounds().width());
                    int height = (int) (rectF.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f2598g.f2593o * 2) + ((int) rectF.width()) + width, (this.f2598g.f2593o * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f2 = (getBounds().left - this.f2598g.f2593o) - width;
                    float f4 = (getBounds().top - this.f2598g.f2593o) - height;
                    canvas2.translate(-f2, -f4);
                    e(canvas2);
                    canvas.drawBitmap(createBitmap, f2, f4, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.f2598g.f2581a, this.G, h());
        } else {
            paint = paint2;
        }
        if (l()) {
            if (this.f2602l) {
                n nVar = this.f2598g.f2581a;
                m g4 = nVar.g();
                d dVar = nVar.f2631e;
                g gVar = this.f2597f;
                g4.f2621e = gVar.a(dVar);
                g4.f2622f = gVar.a(nVar.f2632f);
                g4.f2624h = gVar.a(nVar.f2634h);
                g4.f2623g = gVar.a(nVar.f2633g);
                this.D = g4.a();
                float[] fArr = this.G;
                if (fArr != null) {
                    if (this.H == null) {
                        this.H = new float[fArr.length];
                    }
                    float j4 = j();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.G;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.H[i5] = Math.max(0.0f, fArr2[i5] - j4);
                        i5++;
                    }
                } else {
                    this.H = null;
                }
                n nVar2 = this.D;
                float[] fArr3 = this.H;
                float f5 = this.f2598g.f2588j;
                RectF h4 = h();
                RectF rectF2 = this.f2607q;
                rectF2.set(h4);
                float j5 = j();
                rectF2.inset(j5, j5);
                this.f2614x.a(nVar2, fArr3, f5, rectF2, null, this.f2605o);
                this.f2602l = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f2600j.cardinality() > 0) {
            Log.w("j", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f2598g.f2594p;
        Path path = this.f2604n;
        k2.a aVar = this.f2612v;
        if (i != 0) {
            canvas.drawPath(path, aVar.f2233a);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            w wVar = this.f2599h[i4];
            int i5 = this.f2598g.f2593o;
            Matrix matrix = w.f2662b;
            wVar.a(matrix, aVar, i5, canvas);
            this.i[i4].a(matrix, aVar, this.f2598g.f2593o, canvas);
        }
        if (this.B) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f2598g.f2594p);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f2598g.f2594p);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, J);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, n nVar, float[] fArr, RectF rectF) {
        float c4 = c(rectF, nVar, fArr);
        if (c4 < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f2 = c4 * this.f2598g.f2588j;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    public void g(Canvas canvas) {
        n nVar = this.D;
        float[] fArr = this.H;
        RectF h4 = h();
        RectF rectF = this.f2607q;
        rectF.set(h4);
        float j4 = j();
        rectF.inset(j4, j4);
        f(canvas, this.f2611u, this.f2605o, nVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2598g.f2590l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f2598g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2598g.getClass();
        RectF h4 = h();
        if (h4.isEmpty()) {
            return;
        }
        float c4 = c(h4, this.f2598g.f2581a, this.G);
        if (c4 >= 0.0f) {
            outline.setRoundRect(getBounds(), c4 * this.f2598g.f2588j);
            return;
        }
        boolean z3 = this.f2601k;
        Path path = this.f2604n;
        if (z3) {
            b(h4, path);
            this.f2601k = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c2.c.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                c2.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            c2.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f2598g.f2587h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f2608r;
        region.set(bounds);
        RectF h4 = h();
        Path path = this.f2604n;
        b(h4, path);
        Region region2 = this.f2609s;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.f2606p;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.G;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF h4 = h();
        n nVar = this.f2598g.f2581a;
        p pVar = this.f2614x;
        pVar.getClass();
        float a2 = nVar.f2631e.a(h4);
        n nVar2 = this.f2598g.f2581a;
        pVar.getClass();
        float a4 = nVar2.f2634h.a(h4) + a2;
        n nVar3 = this.f2598g.f2581a;
        pVar.getClass();
        float a5 = a4 - nVar3.f2633g.a(h4);
        n nVar4 = this.f2598g.f2581a;
        pVar.getClass();
        return (a5 - nVar4.f2632f.a(h4)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f2601k = true;
        this.f2602l = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f2598g.f2585f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f2598g.getClass();
        ColorStateList colorStateList2 = this.f2598g.f2584e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f2598g.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        b0 b0Var = this.f2598g.f2582b;
        return b0Var != null && b0Var.d();
    }

    public final float j() {
        if (l()) {
            return this.f2611u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float k() {
        float[] fArr = this.G;
        return fArr != null ? fArr[3] : this.f2598g.f2581a.f2631e.a(h());
    }

    public final boolean l() {
        Paint.Style style = this.f2598g.f2595q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2611u.getStrokeWidth() > 0.0f;
    }

    public final void m(Context context) {
        this.f2598g.f2583c = new d2.a(context);
        x();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2598g = new h(this.f2598g);
        return this;
    }

    public final boolean n() {
        if (!this.f2598g.f2581a.f(h())) {
            float[] fArr = this.G;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f2 = fArr[0];
                    for (int i = 1; i < fArr.length; i++) {
                        if (fArr[i] != f2) {
                            break;
                        }
                    }
                }
                if (this.f2598g.f2581a.e()) {
                }
            }
            return false;
        }
        return true;
    }

    public final void o(u0.f fVar) {
        if (this.E == fVar) {
            return;
        }
        this.E = fVar;
        int i = 0;
        while (true) {
            u0.e[] eVarArr = this.F;
            if (i >= eVarArr.length) {
                v(getState(), true);
                invalidateSelf();
                return;
            }
            if (eVarArr[i] == null) {
                eVarArr[i] = new u0.e(this, K[i]);
            }
            u0.e eVar = eVarArr[i];
            u0.f fVar2 = new u0.f();
            float f2 = (float) fVar.f3341b;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            fVar2.f3341b = f2;
            fVar2.f3342c = false;
            double d = fVar.f3340a;
            float f4 = (float) (d * d);
            if (f4 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            fVar2.f3340a = Math.sqrt(f4);
            fVar2.f3342c = false;
            eVar.f3337j = fVar2;
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f2601k = true;
        this.f2602l = true;
        super.onBoundsChange(rect);
        if (this.f2598g.f2582b != null && !rect.isEmpty()) {
            v(getState(), this.C);
        }
        this.C = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f2598g.f2582b != null) {
            v(iArr, false);
        }
        boolean z3 = u(iArr) || w();
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    public final void p(float f2) {
        h hVar = this.f2598g;
        if (hVar.f2592n != f2) {
            hVar.f2592n = f2;
            x();
        }
    }

    public final void q(ColorStateList colorStateList) {
        h hVar = this.f2598g;
        if (hVar.d != colorStateList) {
            hVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(float f2) {
        h hVar = this.f2598g;
        if (hVar.f2588j != f2) {
            hVar.f2588j = f2;
            this.f2601k = true;
            this.f2602l = true;
            invalidateSelf();
        }
    }

    public final void s() {
        this.f2612v.a(-12303292);
        this.f2598g.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        h hVar = this.f2598g;
        if (hVar.f2590l != i) {
            hVar.f2590l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2598g.getClass();
        super.invalidateSelf();
    }

    @Override // l2.y
    public final void setShapeAppearanceModel(n nVar) {
        h hVar = this.f2598g;
        hVar.f2581a = nVar;
        hVar.f2582b = null;
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
        this.f2598g.f2585f = colorStateList;
        w();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.f2598g;
        if (hVar.f2586g != mode) {
            hVar.f2586g = mode;
            w();
            super.invalidateSelf();
        }
    }

    public final void t(b0 b0Var) {
        h hVar = this.f2598g;
        if (hVar.f2582b != b0Var) {
            hVar.f2582b = b0Var;
            v(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean u(int[] iArr) {
        boolean z3;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f2598g.d == null || color2 == (colorForState2 = this.f2598g.d.getColorForState(iArr, (color2 = (paint2 = this.f2610t).getColor())))) {
            z3 = false;
        } else {
            paint2.setColor(colorForState2);
            z3 = true;
        }
        if (this.f2598g.f2584e == null || color == (colorForState = this.f2598g.f2584e.getColorForState(iArr, (color = (paint = this.f2611u).getColor())))) {
            return z3;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void v(int[] iArr, boolean z3) {
        n a2;
        int i;
        RectF h4 = h();
        if (this.f2598g.f2582b == null || h4.isEmpty()) {
            return;
        }
        boolean z4 = z3 | (this.E == null);
        if (this.G == null) {
            this.G = new float[4];
        }
        b0 b0Var = this.f2598g.f2582b;
        n[] nVarArr = b0Var.d;
        int i4 = b0Var.f2565a;
        int[][] iArr2 = b0Var.f2567c;
        z zVar = b0Var.f2571h;
        z zVar2 = b0Var.f2570g;
        z zVar3 = b0Var.f2569f;
        z zVar4 = b0Var.f2568e;
        int i5 = 0;
        while (true) {
            if (i5 >= i4) {
                i5 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i5], iArr)) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i6 = 0;
            while (true) {
                if (i6 >= i4) {
                    i = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i6], iArr3)) {
                        i = i6;
                        break;
                    }
                    i6++;
                }
            }
            i5 = i;
        }
        if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
            a2 = nVarArr[i5];
        } else {
            m g4 = nVarArr[i5].g();
            if (zVar4 != null) {
                g4.f2621e = zVar4.c(iArr);
            }
            if (zVar3 != null) {
                g4.f2622f = zVar3.c(iArr);
            }
            if (zVar2 != null) {
                g4.f2624h = zVar2.c(iArr);
            }
            if (zVar != null) {
                g4.f2623g = zVar.c(iArr);
            }
            a2 = g4.a();
        }
        int i7 = 0;
        while (i7 < 4) {
            this.f2614x.getClass();
            float a4 = (i7 != 1 ? i7 != 2 ? i7 != 3 ? a2.f2632f : a2.f2631e : a2.f2634h : a2.f2633g).a(h4);
            if (z4) {
                this.G[i7] = a4;
            }
            u0.e[] eVarArr = this.F;
            u0.e eVar = eVarArr[i7];
            if (eVar != null) {
                eVar.a(a4);
                if (z4) {
                    eVarArr[i7].d();
                }
            }
            i7++;
        }
        if (z4) {
            invalidateSelf();
        }
    }

    public final boolean w() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2615y;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f2616z;
        h hVar = this.f2598g;
        ColorStateList colorStateList = hVar.f2585f;
        PorterDuff.Mode mode = hVar.f2586g;
        if (colorStateList == null || mode == null) {
            int color = this.f2610t.getColor();
            int d = d(color);
            porterDuffColorFilter = d != color ? new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(d(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f2615y = porterDuffColorFilter;
        this.f2598g.getClass();
        this.f2616z = null;
        this.f2598g.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f2615y) && Objects.equals(porterDuffColorFilter3, this.f2616z)) ? false : true;
    }

    public final void x() {
        h hVar = this.f2598g;
        float f2 = hVar.f2592n + 0.0f;
        hVar.f2593o = (int) Math.ceil(0.75f * f2);
        this.f2598g.f2594p = (int) Math.ceil(f2 * 0.25f);
        w();
        super.invalidateSelf();
    }

    public j(Context context, AttributeSet attributeSet, int i, int i4) {
        this(n.c(context, attributeSet, i, i4).a());
    }

    public j(n nVar) {
        this(new h(nVar));
    }

    public j(h hVar) {
        p pVar;
        this.f2597f = new g(this);
        this.f2599h = new w[4];
        this.i = new w[4];
        this.f2600j = new BitSet(8);
        this.f2603m = new Matrix();
        this.f2604n = new Path();
        this.f2605o = new Path();
        this.f2606p = new RectF();
        this.f2607q = new RectF();
        this.f2608r = new Region();
        this.f2609s = new Region();
        Paint paint = new Paint(1);
        this.f2610t = paint;
        Paint paint2 = new Paint(1);
        this.f2611u = paint2;
        this.f2612v = new k2.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            pVar = o.f2638a;
        } else {
            pVar = new p();
        }
        this.f2614x = pVar;
        this.A = new RectF();
        this.B = true;
        this.C = true;
        this.F = new u0.e[4];
        this.f2598g = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        w();
        u(getState());
        this.f2613w = new g(this);
    }
}
