package C3;

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
import java.util.BitSet;
import java.util.Objects;
import u3.AbstractC5110a;
import u3.AbstractC5111b;
import v3.C5125a;

/* loaded from: classes2.dex */
public class g extends Drawable implements v {

    /* renamed from: P, reason: collision with root package name */
    public static final Paint f398P;

    /* renamed from: A, reason: collision with root package name */
    public final Path f399A;

    /* renamed from: B, reason: collision with root package name */
    public final RectF f400B;

    /* renamed from: C, reason: collision with root package name */
    public final RectF f401C;

    /* renamed from: D, reason: collision with root package name */
    public final Region f402D;

    /* renamed from: E, reason: collision with root package name */
    public final Region f403E;

    /* renamed from: F, reason: collision with root package name */
    public k f404F;

    /* renamed from: G, reason: collision with root package name */
    public final Paint f405G;

    /* renamed from: H, reason: collision with root package name */
    public final Paint f406H;

    /* renamed from: I, reason: collision with root package name */
    public final B3.a f407I;
    public final I0.j J;

    /* renamed from: K, reason: collision with root package name */
    public final m f408K;

    /* renamed from: L, reason: collision with root package name */
    public PorterDuffColorFilter f409L;

    /* renamed from: M, reason: collision with root package name */
    public PorterDuffColorFilter f410M;

    /* renamed from: N, reason: collision with root package name */
    public final RectF f411N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f412O;

    /* renamed from: n, reason: collision with root package name */
    public f f413n;

    /* renamed from: u, reason: collision with root package name */
    public final t[] f414u;

    /* renamed from: v, reason: collision with root package name */
    public final t[] f415v;

    /* renamed from: w, reason: collision with root package name */
    public final BitSet f416w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f417x;

    /* renamed from: y, reason: collision with root package name */
    public final Matrix f418y;

    /* renamed from: z, reason: collision with root package name */
    public final Path f419z;

    static {
        Paint paint = new Paint(1);
        f398P = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f413n;
        this.f408K.a(fVar.f383a, fVar.i, rectF, this.J, path);
        if (this.f413n.f390h != 1.0f) {
            Matrix matrix = this.f418y;
            matrix.reset();
            float f6 = this.f413n.f390h;
            matrix.setScale(f6, f6, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f411N, true);
    }

    public final int b(int i) {
        int i4;
        f fVar = this.f413n;
        float f6 = fVar.f394m + 0.0f + fVar.f393l;
        C5125a c5125a = fVar.f384b;
        if (c5125a == null || !c5125a.f41362a || G.c.d(i, com.anythink.basead.exoplayer.k.p.f8630b) != c5125a.f41365d) {
            return i;
        }
        float min = (c5125a.f41366e <= 0.0f || f6 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f6 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int n9 = U2.a.n(G.c.d(i, com.anythink.basead.exoplayer.k.p.f8630b), c5125a.f41363b, min);
        if (min > 0.0f && (i4 = c5125a.f41364c) != 0) {
            n9 = G.c.b(G.c.d(i4, C5125a.f41361f), n9);
        }
        return G.c.d(n9, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.f416w.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f413n.f396o;
        Path path = this.f419z;
        B3.a aVar = this.f407I;
        if (i != 0) {
            canvas.drawPath(path, aVar.f327a);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            t tVar = this.f414u[i4];
            int i9 = this.f413n.f395n;
            Matrix matrix = t.f472b;
            tVar.a(matrix, aVar, i9, canvas);
            this.f415v[i4].a(matrix, aVar, this.f413n.f395n, canvas);
        }
        if (this.f412O) {
            double d2 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d2)) * this.f413n.f396o);
            int cos = (int) (Math.cos(Math.toRadians(d2)) * this.f413n.f396o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f398P);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a9 = kVar.f437f.a(rectF) * this.f413n.i;
            canvas.drawRoundRect(rectF, a9, a9, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f405G;
        paint.setColorFilter(this.f409L);
        int alpha = paint.getAlpha();
        int i = this.f413n.f392k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f406H;
        paint2.setColorFilter(this.f410M);
        paint2.setStrokeWidth(this.f413n.f391j);
        int alpha2 = paint2.getAlpha();
        int i4 = this.f413n.f392k;
        paint2.setAlpha(((i4 + (i4 >>> 7)) * alpha2) >>> 8);
        boolean z8 = this.f417x;
        Path path = this.f419z;
        if (z8) {
            float f6 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f413n.f383a;
            j e6 = kVar.e();
            c cVar = kVar.f436e;
            if (!(cVar instanceof h)) {
                cVar = new b(f6, cVar);
            }
            e6.f425e = cVar;
            c cVar2 = kVar.f437f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f6, cVar2);
            }
            e6.f426f = cVar2;
            c cVar3 = kVar.f439h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f6, cVar3);
            }
            e6.f428h = cVar3;
            c cVar4 = kVar.f438g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f6, cVar4);
            }
            e6.f427g = cVar4;
            k a9 = e6.a();
            this.f404F = a9;
            float f9 = this.f413n.i;
            RectF rectF = this.f401C;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f408K.a(a9, f9, rectF, null, this.f399A);
            a(f(), path);
            this.f417x = false;
        }
        f fVar = this.f413n;
        fVar.getClass();
        if (fVar.f395n > 0) {
            int i9 = Build.VERSION.SDK_INT;
            if (!this.f413n.f383a.d(f()) && !path.isConvex() && i9 < 29) {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d2)) * this.f413n.f396o), (int) (Math.cos(Math.toRadians(d2)) * this.f413n.f396o));
                if (this.f412O) {
                    RectF rectF2 = this.f411N;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f413n.f395n * 2) + ((int) rectF2.width()) + width, (this.f413n.f395n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f10 = (getBounds().left - this.f413n.f395n) - width;
                    float f11 = (getBounds().top - this.f413n.f395n) - height;
                    canvas2.translate(-f10, -f11);
                    c(canvas2);
                    canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f413n;
        Paint.Style style = fVar2.f397p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f383a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f406H;
        Path path = this.f399A;
        k kVar = this.f404F;
        RectF rectF = this.f401C;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.f400B;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f413n.f397p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f406H.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f413n.f392k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f413n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f413n.getClass();
        if (this.f413n.f383a.d(f())) {
            outline.setRoundRect(getBounds(), this.f413n.f383a.f436e.a(f()) * this.f413n.i);
            return;
        }
        RectF f6 = f();
        Path path = this.f419z;
        a(f6, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC5111b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC5110a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC5110a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f413n.f389g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f402D;
        region.set(bounds);
        RectF f6 = f();
        Path path = this.f419z;
        a(f6, path);
        Region region2 = this.f403E;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f413n.f384b = new C5125a(context);
        m();
    }

    public final void i(float f6) {
        f fVar = this.f413n;
        if (fVar.f394m != f6) {
            fVar.f394m = f6;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f417x = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f413n.f387e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f413n.getClass();
        ColorStateList colorStateList2 = this.f413n.f386d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f413n.f385c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f413n;
        if (fVar.f385c != colorStateList) {
            fVar.f385c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z8;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f413n.f385c == null || color2 == (colorForState2 = this.f413n.f385c.getColorForState(iArr, (color2 = (paint2 = this.f405G).getColor())))) {
            z8 = false;
        } else {
            paint2.setColor(colorForState2);
            z8 = true;
        }
        if (this.f413n.f386d == null || color == (colorForState = this.f413n.f386d.getColorForState(iArr, (color = (paint = this.f406H).getColor())))) {
            return z8;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f409L;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f410M;
        f fVar = this.f413n;
        ColorStateList colorStateList = fVar.f387e;
        PorterDuff.Mode mode = fVar.f388f;
        Paint paint = this.f405G;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b9 = b(color);
            porterDuffColorFilter = b9 != color ? new PorterDuffColorFilter(b9, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f409L = porterDuffColorFilter;
        this.f413n.getClass();
        this.f410M = null;
        this.f413n.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f409L) && Objects.equals(porterDuffColorFilter3, this.f410M)) ? false : true;
    }

    public final void m() {
        f fVar = this.f413n;
        float f6 = fVar.f394m + 0.0f;
        fVar.f395n = (int) Math.ceil(0.75f * f6);
        this.f413n.f396o = (int) Math.ceil(f6 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f413n = new f(this.f413n);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f417x = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z8 = k(iArr) || l();
        if (z8) {
            invalidateSelf();
        }
        return z8;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        f fVar = this.f413n;
        if (fVar.f392k != i) {
            fVar.f392k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f413n.getClass();
        super.invalidateSelf();
    }

    @Override // C3.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f413n.f383a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f413n.f387e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f413n;
        if (fVar.f388f != mode) {
            fVar.f388f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i4) {
        this(k.b(context, attributeSet, i, i4).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f414u = new t[4];
        this.f415v = new t[4];
        this.f416w = new BitSet(8);
        this.f418y = new Matrix();
        this.f419z = new Path();
        this.f399A = new Path();
        this.f400B = new RectF();
        this.f401C = new RectF();
        this.f402D = new Region();
        this.f403E = new Region();
        Paint paint = new Paint(1);
        this.f405G = paint;
        Paint paint2 = new Paint(1);
        this.f406H = paint2;
        this.f407I = new B3.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f443a;
        } else {
            mVar = new m();
        }
        this.f408K = mVar;
        this.f411N = new RectF();
        this.f412O = true;
        this.f413n = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.J = new I0.j(3, this);
    }
}
