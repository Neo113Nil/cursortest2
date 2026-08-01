package H0;

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
import z0.AbstractC0370a;
import z0.AbstractC0371b;

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f272w;

    /* renamed from: a, reason: collision with root package name */
    public f f273a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f274b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f275c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f276d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f277e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f278f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f279g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f280j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f281k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f282l;

    /* renamed from: m, reason: collision with root package name */
    public k f283m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f284n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f285o;

    /* renamed from: p, reason: collision with root package name */
    public final G0.a f286p;

    /* renamed from: q, reason: collision with root package name */
    public final B0.d f287q;

    /* renamed from: r, reason: collision with root package name */
    public final m f288r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f289s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f290t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f291u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f292v;

    static {
        Paint paint = new Paint(1);
        f272w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f273a;
        this.f288r.a(fVar.f258a, fVar.i, rectF, this.f287q, path);
        if (this.f273a.h != 1.0f) {
            Matrix matrix = this.f278f;
            matrix.reset();
            float f2 = this.f273a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f291u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f273a;
        float f2 = fVar.f268m + 0.0f + fVar.f267l;
        A0.a aVar = fVar.f259b;
        if (aVar == null || !aVar.f1a || C.a.d(i, 255) != aVar.f4d) {
            return i;
        }
        float min = (aVar.f5e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int l2 = i1.r.l(C.a.d(i, 255), aVar.f2b, min);
        if (min > 0.0f && (i2 = aVar.f3c) != 0) {
            l2 = C.a.b(C.a.d(i2, A0.a.f0f), l2);
        }
        return C.a.d(l2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.f276d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f273a.f270o;
        Path path = this.f279g;
        G0.a aVar = this.f286p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f208a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f274b[i2];
            int i3 = this.f273a.f269n;
            Matrix matrix = t.f340b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f275c[i2].a(matrix, aVar, this.f273a.f269n, canvas);
        }
        if (this.f292v) {
            double d2 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d2)) * this.f273a.f270o);
            int cos = (int) (Math.cos(Math.toRadians(d2)) * this.f273a.f270o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f272w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f309f.a(rectF) * this.f273a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f284n;
        paint.setColorFilter(this.f289s);
        int alpha = paint.getAlpha();
        int i = this.f273a.f266k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f285o;
        paint2.setColorFilter(this.f290t);
        paint2.setStrokeWidth(this.f273a.f265j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f273a.f266k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f277e;
        Path path = this.f279g;
        if (z2) {
            float f2 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f273a.f258a;
            j e2 = kVar.e();
            c cVar = kVar.f308e;
            if (!(cVar instanceof h)) {
                cVar = new b(f2, cVar);
            }
            e2.f298e = cVar;
            c cVar2 = kVar.f309f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f2, cVar2);
            }
            e2.f299f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f2, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f310g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f2, cVar4);
            }
            e2.f300g = cVar4;
            k a2 = e2.a();
            this.f283m = a2;
            float f3 = this.f273a.i;
            RectF rectF = this.f280j;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f288r.a(a2, f3, rectF, null, this.h);
            a(f(), path);
            this.f277e = false;
        }
        f fVar = this.f273a;
        fVar.getClass();
        if (fVar.f269n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f273a.f258a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d2)) * this.f273a.f270o), (int) (Math.cos(Math.toRadians(d2)) * this.f273a.f270o));
                if (this.f292v) {
                    RectF rectF2 = this.f291u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f273a.f269n * 2) + ((int) rectF2.width()) + width, (this.f273a.f269n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f4 = (getBounds().left - this.f273a.f269n) - width;
                    float f5 = (getBounds().top - this.f273a.f269n) - height;
                    canvas2.translate(-f4, -f5);
                    c(canvas2);
                    canvas.drawBitmap(createBitmap, f4, f5, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f273a;
        Paint.Style style = fVar2.f271p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f258a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f285o;
        Path path = this.h;
        k kVar = this.f283m;
        RectF rectF = this.f280j;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f273a.f271p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f285o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f273a.f266k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f273a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f273a.getClass();
        if (this.f273a.f258a.d(f())) {
            outline.setRoundRect(getBounds(), this.f273a.f258a.f308e.a(f()) * this.f273a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f279g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC0371b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC0370a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC0370a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f273a.f264g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f281k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f279g;
        a(f2, path);
        Region region2 = this.f282l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f273a.f259b = new A0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f273a;
        if (fVar.f268m != f2) {
            fVar.f268m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f277e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f273a.f262e) == null || !colorStateList.isStateful())) {
            this.f273a.getClass();
            ColorStateList colorStateList3 = this.f273a.f261d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f273a.f260c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f273a;
        if (fVar.f260c != colorStateList) {
            fVar.f260c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f273a.f260c == null || color2 == (colorForState2 = this.f273a.f260c.getColorForState(iArr, (color2 = (paint2 = this.f284n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f273a.f261d == null || color == (colorForState = this.f273a.f261d.getColorForState(iArr, (color = (paint = this.f285o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f289s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f290t;
        f fVar = this.f273a;
        ColorStateList colorStateList = fVar.f262e;
        PorterDuff.Mode mode = fVar.f263f;
        Paint paint = this.f284n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f289s = porterDuffColorFilter;
        this.f273a.getClass();
        this.f290t = null;
        this.f273a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f289s) && Objects.equals(porterDuffColorFilter3, this.f290t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f273a;
        float f2 = fVar.f268m + 0.0f;
        fVar.f269n = (int) Math.ceil(0.75f * f2);
        this.f273a.f270o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f273a = new f(this.f273a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f277e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = k(iArr) || l();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        f fVar = this.f273a;
        if (fVar.f266k != i) {
            fVar.f266k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f273a.getClass();
        super.invalidateSelf();
    }

    @Override // H0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f273a.f258a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f273a.f262e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f273a;
        if (fVar.f263f != mode) {
            fVar.f263f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(k.b(context, attributeSet, i, i2).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f274b = new t[4];
        this.f275c = new t[4];
        this.f276d = new BitSet(8);
        this.f278f = new Matrix();
        this.f279g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f280j = new RectF();
        this.f281k = new Region();
        this.f282l = new Region();
        Paint paint = new Paint(1);
        this.f284n = paint;
        Paint paint2 = new Paint(1);
        this.f285o = paint2;
        this.f286p = new G0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f314a;
        } else {
            mVar = new m();
        }
        this.f288r = mVar;
        this.f291u = new RectF();
        this.f292v = true;
        this.f273a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f287q = new B0.d(2, this);
    }
}
