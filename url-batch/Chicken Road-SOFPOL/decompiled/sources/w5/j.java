package w5;

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
import android.util.Log;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class j extends Drawable implements y {
    public static final Paint H;
    public static final i[] I;
    public boolean A;
    public n B;
    public c4.g C;
    public final c4.f[] D;
    public float[] E;
    public float[] F;
    public b.q G;

    /* renamed from: d, reason: collision with root package name */
    public final g f8104d;

    /* renamed from: e, reason: collision with root package name */
    public h f8105e;

    /* renamed from: f, reason: collision with root package name */
    public final w[] f8106f;

    /* renamed from: g, reason: collision with root package name */
    public final w[] f8107g;

    /* renamed from: h, reason: collision with root package name */
    public final BitSet f8108h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8109j;

    /* renamed from: k, reason: collision with root package name */
    public final Matrix f8110k;

    /* renamed from: l, reason: collision with root package name */
    public final Path f8111l;

    /* renamed from: m, reason: collision with root package name */
    public final Path f8112m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f8113n;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f8114o;

    /* renamed from: p, reason: collision with root package name */
    public final Region f8115p;

    /* renamed from: q, reason: collision with root package name */
    public final Region f8116q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f8117r;

    /* renamed from: s, reason: collision with root package name */
    public final Paint f8118s;

    /* renamed from: t, reason: collision with root package name */
    public final v5.a f8119t;

    /* renamed from: u, reason: collision with root package name */
    public final g f8120u;

    /* renamed from: v, reason: collision with root package name */
    public final p f8121v;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuffColorFilter f8122w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuffColorFilter f8123x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f8124y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f8125z;

    static {
        Paint paint = new Paint(1);
        H = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        I = new i[4];
        int i = 0;
        while (true) {
            i[] iVarArr = I;
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

    public static float b(RectF rectF, n nVar, float[] fArr) {
        if (fArr == null) {
            if (nVar.e(rectF)) {
                return nVar.f8142e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f6 = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f6) {
                    return -1.0f;
                }
            }
        }
        if (nVar.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        h hVar = this.f8105e;
        this.f8121v.a(hVar.f8087a, this.E, hVar.f8095j, rectF, this.f8120u, path);
        if (this.f8105e.i != 1.0f) {
            Matrix matrix = this.f8110k;
            matrix.reset();
            float f6 = this.f8105e.i;
            matrix.setScale(f6, f6, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f8124y, true);
    }

    public final int c(int i) {
        int i8;
        h hVar = this.f8105e;
        float f6 = hVar.f8099n + 0.0f + hVar.f8098m;
        q5.a aVar = hVar.f8089c;
        if (aVar == null || !aVar.f6176a || i3.a.d(i, 255) != aVar.f6179d) {
            return i;
        }
        float min = (aVar.f6180e <= 0.0f || f6 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f6 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int M = h0.a.M(min, i3.a.d(i, 255), aVar.f6177b);
        if (min > 0.0f && (i8 = aVar.f6178c) != 0) {
            M = i3.a.b(i3.a.d(i8, q5.a.f6175f), M);
        }
        return i3.a.d(M, alpha);
    }

    public final void d(Canvas canvas) {
        if (this.f8108h.cardinality() > 0) {
            Log.w("j", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f8105e.f8101p;
        Path path = this.f8111l;
        v5.a aVar = this.f8119t;
        if (i != 0) {
            canvas.drawPath(path, aVar.f7483a);
        }
        for (int i8 = 0; i8 < 4; i8++) {
            w wVar = this.f8106f[i8];
            int i9 = this.f8105e.f8100o;
            Matrix matrix = w.f8177b;
            wVar.a(matrix, aVar, i9, canvas);
            this.f8107g[i8].a(matrix, aVar, this.f8105e.f8100o, canvas);
        }
        if (this.f8125z) {
            double d8 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d8)) * this.f8105e.f8101p);
            int cos = (int) (Math.cos(Math.toRadians(d8)) * this.f8105e.f8101p);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, H);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        if (r19.f8105e.f8087a.d() != false) goto L43;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f8122w;
        Paint paint2 = this.f8117r;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.f8105e.f8097l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f8123x;
        Paint paint3 = this.f8118s;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f8105e.f8096k);
        int alpha2 = paint3.getAlpha();
        int i8 = this.f8105e.f8097l;
        paint3.setAlpha(((i8 + (i8 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.f8105e.f8102q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z3 = this.i;
            paint = paint2;
            Path path = this.f8111l;
            if (z3) {
                a(g(), path);
                this.i = false;
            }
            h hVar = this.f8105e;
            hVar.getClass();
            if (hVar.f8100o > 0 && !hVar.f8087a.e(g())) {
                float[] fArr = this.E;
                if (fArr != null) {
                    if (fArr.length > 1) {
                        float f6 = fArr[0];
                        for (int i9 = 1; i9 < fArr.length; i9++) {
                            if (fArr[i9] != f6) {
                                break;
                            }
                        }
                    }
                }
                if (!path.isConvex() && Build.VERSION.SDK_INT < 29) {
                    canvas.save();
                    double d8 = 0;
                    canvas.translate((int) (Math.sin(Math.toRadians(d8)) * this.f8105e.f8101p), (int) (Math.cos(Math.toRadians(d8)) * this.f8105e.f8101p));
                    if (this.f8125z) {
                        RectF rectF = this.f8124y;
                        int width = (int) (rectF.width() - getBounds().width());
                        int height = (int) (rectF.height() - getBounds().height());
                        if (width < 0 || height < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap createBitmap = Bitmap.createBitmap((this.f8105e.f8100o * 2) + ((int) rectF.width()) + width, (this.f8105e.f8100o * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap);
                        float f8 = (getBounds().left - this.f8105e.f8100o) - width;
                        float f9 = (getBounds().top - this.f8105e.f8100o) - height;
                        canvas2.translate(-f8, -f9);
                        d(canvas2);
                        canvas.drawBitmap(createBitmap, f8, f9, (Paint) null);
                        createBitmap.recycle();
                        canvas.restore();
                    } else {
                        d(canvas);
                        canvas.restore();
                    }
                }
            }
            e(canvas, paint, path, this.f8105e.f8087a, this.E, g());
        } else {
            paint = paint2;
        }
        if (j()) {
            if (this.f8109j) {
                n nVar = this.f8105e.f8087a;
                m f10 = nVar.f();
                d dVar = nVar.f8142e;
                g gVar = this.f8104d;
                f10.f8131e = gVar.a(dVar);
                f10.f8132f = gVar.a(nVar.f8143f);
                f10.f8134h = gVar.a(nVar.f8145h);
                f10.f8133g = gVar.a(nVar.f8144g);
                this.B = f10.a();
                float[] fArr2 = this.E;
                if (fArr2 != null) {
                    if (this.F == null) {
                        this.F = new float[fArr2.length];
                    }
                    float i10 = i();
                    int i11 = 0;
                    while (true) {
                        float[] fArr3 = this.E;
                        if (i11 >= fArr3.length) {
                            break;
                        }
                        this.F[i11] = Math.max(0.0f, fArr3[i11] - i10);
                        i11++;
                    }
                } else {
                    this.F = null;
                }
                n nVar2 = this.B;
                float[] fArr4 = this.F;
                float f11 = this.f8105e.f8095j;
                RectF g3 = g();
                RectF rectF2 = this.f8114o;
                rectF2.set(g3);
                float i12 = i();
                rectF2.inset(i12, i12);
                this.f8121v.a(nVar2, fArr4, f11, rectF2, null, this.f8112m);
                this.f8109j = false;
            }
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, n nVar, float[] fArr, RectF rectF) {
        float b8 = b(rectF, nVar, fArr);
        if (b8 < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f6 = b8 * this.f8105e.f8095j;
            canvas.drawRoundRect(rectF, f6, f6, paint);
        }
    }

    public void f(Canvas canvas) {
        n nVar = this.B;
        float[] fArr = this.F;
        RectF g3 = g();
        RectF rectF = this.f8114o;
        rectF.set(g3);
        float i = i();
        rectF.inset(i, i);
        e(canvas, this.f8118s, this.f8112m, nVar, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.f8113n;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f8105e.f8097l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f8105e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f8105e.getClass();
        RectF g3 = g();
        if (g3.isEmpty()) {
            return;
        }
        float b8 = b(g3, this.f8105e.f8087a, this.E);
        if (b8 >= 0.0f) {
            outline.setRoundRect(getBounds(), b8 * this.f8105e.f8095j);
            return;
        }
        boolean z3 = this.i;
        Path path = this.f8111l;
        if (z3) {
            a(g3, path);
            this.i = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            p5.b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                p5.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            p5.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f8105e.f8094h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f8115p;
        region.set(bounds);
        RectF g3 = g();
        Path path = this.f8111l;
        a(g3, path);
        Region region2 = this.f8116q;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.E;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF g3 = g();
        n nVar = this.f8105e.f8087a;
        p pVar = this.f8121v;
        pVar.getClass();
        float a8 = nVar.f8142e.a(g3);
        n nVar2 = this.f8105e.f8087a;
        pVar.getClass();
        float a9 = nVar2.f8145h.a(g3) + a8;
        n nVar3 = this.f8105e.f8087a;
        pVar.getClass();
        float a10 = a9 - nVar3.f8144g.a(g3);
        n nVar4 = this.f8105e.f8087a;
        pVar.getClass();
        return (a10 - nVar4.f8143f.a(g3)) / 2.0f;
    }

    public final float i() {
        if (j()) {
            return this.f8118s.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.i = true;
        this.f8109j = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f8105e.f8092f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f8105e.getClass();
        ColorStateList colorStateList2 = this.f8105e.f8091e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f8105e.f8090d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        b0 b0Var = this.f8105e.f8088b;
        return b0Var != null && b0Var.d();
    }

    public final boolean j() {
        Paint.Style style = this.f8105e.f8102q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f8118s.getStrokeWidth() > 0.0f;
    }

    public final void k(Context context) {
        this.f8105e.f8089c = new q5.a(context);
        s();
    }

    public final void l(c4.g gVar) {
        if (this.C == gVar) {
            return;
        }
        this.C = gVar;
        int i = 0;
        while (true) {
            c4.f[] fVarArr = this.D;
            if (i >= fVarArr.length) {
                q(getState(), true);
                invalidateSelf();
                return;
            }
            if (fVarArr[i] == null) {
                fVarArr[i] = new c4.f(this, I[i]);
            }
            c4.f fVar = fVarArr[i];
            c4.g gVar2 = new c4.g();
            float f6 = (float) gVar.f1644b;
            if (f6 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            gVar2.f1644b = f6;
            gVar2.f1645c = false;
            double d8 = gVar.f1643a;
            float f8 = (float) (d8 * d8);
            if (f8 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            gVar2.f1643a = Math.sqrt(f8);
            gVar2.f1645c = false;
            fVar.f1640j = gVar2;
            i++;
        }
    }

    public final void m(float f6) {
        h hVar = this.f8105e;
        if (hVar.f8099n != f6) {
            hVar.f8099n = f6;
            s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f8105e = new h(this.f8105e);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        h hVar = this.f8105e;
        if (hVar.f8090d != colorStateList) {
            hVar.f8090d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(b0 b0Var) {
        h hVar = this.f8105e;
        if (hVar.f8088b != b0Var) {
            hVar.f8088b = b0Var;
            q(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.i = true;
        this.f8109j = true;
        super.onBoundsChange(rect);
        if (this.f8105e.f8088b != null && !rect.isEmpty()) {
            q(getState(), this.A);
        }
        this.A = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f8105e.f8088b != null) {
            q(iArr, false);
        }
        boolean z3 = p(iArr) || r();
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    public final boolean p(int[] iArr) {
        boolean z3;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f8105e.f8090d == null || color2 == (colorForState2 = this.f8105e.f8090d.getColorForState(iArr, (color2 = (paint2 = this.f8117r).getColor())))) {
            z3 = false;
        } else {
            paint2.setColor(colorForState2);
            z3 = true;
        }
        if (this.f8105e.f8091e == null || color == (colorForState = this.f8105e.f8091e.getColorForState(iArr, (color = (paint = this.f8118s).getColor())))) {
            return z3;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void q(int[] iArr, boolean z3) {
        n a8;
        int i;
        RectF g3 = g();
        if (this.f8105e.f8088b == null || g3.isEmpty()) {
            return;
        }
        boolean z7 = z3 | (this.C == null);
        if (this.E == null) {
            this.E = new float[4];
        }
        b0 b0Var = this.f8105e.f8088b;
        n[] nVarArr = b0Var.f8072d;
        int i8 = b0Var.f8069a;
        int[][] iArr2 = b0Var.f8071c;
        z zVar = b0Var.f8076h;
        z zVar2 = b0Var.f8075g;
        z zVar3 = b0Var.f8074f;
        z zVar4 = b0Var.f8073e;
        int i9 = 0;
        while (true) {
            if (i9 >= i8) {
                i9 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i9], iArr)) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i10 = 0;
            while (true) {
                if (i10 >= i8) {
                    i = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i10], iArr3)) {
                        i = i10;
                        break;
                    }
                    i10++;
                }
            }
            i9 = i;
        }
        if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
            a8 = nVarArr[i9];
        } else {
            m f6 = nVarArr[i9].f();
            if (zVar4 != null) {
                f6.f8131e = zVar4.c(iArr);
            }
            if (zVar3 != null) {
                f6.f8132f = zVar3.c(iArr);
            }
            if (zVar2 != null) {
                f6.f8134h = zVar2.c(iArr);
            }
            if (zVar != null) {
                f6.f8133g = zVar.c(iArr);
            }
            a8 = f6.a();
        }
        int i11 = 0;
        while (i11 < 4) {
            this.f8121v.getClass();
            float a9 = (i11 != 1 ? i11 != 2 ? i11 != 3 ? a8.f8143f : a8.f8142e : a8.f8145h : a8.f8144g).a(g3);
            if (z7) {
                this.E[i11] = a9;
            }
            c4.f[] fVarArr = this.D;
            c4.f fVar = fVarArr[i11];
            if (fVar != null) {
                fVar.a(a9);
                if (z7) {
                    fVarArr[i11].d();
                }
            }
            i11++;
        }
        if (z7) {
            invalidateSelf();
        }
    }

    public final boolean r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f8122w;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f8123x;
        h hVar = this.f8105e;
        ColorStateList colorStateList = hVar.f8092f;
        PorterDuff.Mode mode = hVar.f8093g;
        if (colorStateList == null || mode == null) {
            int color = this.f8117r.getColor();
            int c8 = c(color);
            porterDuffColorFilter = c8 != color ? new PorterDuffColorFilter(c8, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f8122w = porterDuffColorFilter;
        this.f8105e.getClass();
        this.f8123x = null;
        this.f8105e.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f8122w) && Objects.equals(porterDuffColorFilter3, this.f8123x)) ? false : true;
    }

    public final void s() {
        h hVar = this.f8105e;
        float f6 = hVar.f8099n + 0.0f;
        hVar.f8100o = (int) Math.ceil(0.75f * f6);
        this.f8105e.f8101p = (int) Math.ceil(f6 * 0.25f);
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        h hVar = this.f8105e;
        if (hVar.f8097l != i) {
            hVar.f8097l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8105e.getClass();
        super.invalidateSelf();
    }

    @Override // w5.y
    public final void setShapeAppearanceModel(n nVar) {
        h hVar = this.f8105e;
        hVar.f8087a = nVar;
        hVar.f8088b = null;
        this.E = null;
        this.F = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f8105e.f8092f = colorStateList;
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.f8105e;
        if (hVar.f8093g != mode) {
            hVar.f8093g = mode;
            r();
            super.invalidateSelf();
        }
    }

    public j(n nVar) {
        this(new h(nVar));
    }

    public j(h hVar) {
        p pVar;
        this.f8104d = new g(this);
        this.f8106f = new w[4];
        this.f8107g = new w[4];
        this.f8108h = new BitSet(8);
        this.f8110k = new Matrix();
        this.f8111l = new Path();
        this.f8112m = new Path();
        this.f8113n = new RectF();
        this.f8114o = new RectF();
        this.f8115p = new Region();
        this.f8116q = new Region();
        Paint paint = new Paint(1);
        this.f8117r = paint;
        Paint paint2 = new Paint(1);
        this.f8118s = paint2;
        this.f8119t = new v5.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            pVar = o.f8149a;
        } else {
            pVar = new p();
        }
        this.f8121v = pVar;
        this.f8124y = new RectF();
        this.f8125z = true;
        this.A = true;
        this.D = new c4.f[4];
        this.f8105e = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r();
        p(getState());
        this.f8120u = new g(this);
    }
}
