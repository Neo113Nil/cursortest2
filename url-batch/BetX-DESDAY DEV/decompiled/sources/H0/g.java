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
import z0.AbstractC0372a;
import z0.AbstractC0373b;

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f271w;

    /* renamed from: a, reason: collision with root package name */
    public f f272a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f273b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f274c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f275d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f276e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f277f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f278g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f279j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f280k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f281l;

    /* renamed from: m, reason: collision with root package name */
    public k f282m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f283n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f284o;

    /* renamed from: p, reason: collision with root package name */
    public final G0.a f285p;

    /* renamed from: q, reason: collision with root package name */
    public final B0.d f286q;

    /* renamed from: r, reason: collision with root package name */
    public final m f287r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f288s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f289t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f290u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f291v;

    static {
        Paint paint = new Paint(1);
        f271w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f272a;
        this.f287r.a(fVar.f257a, fVar.i, rectF, this.f286q, path);
        if (this.f272a.h != 1.0f) {
            Matrix matrix = this.f277f;
            matrix.reset();
            float f2 = this.f272a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f290u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f272a;
        float f2 = fVar.f267m + 0.0f + fVar.f266l;
        A0.a aVar = fVar.f258b;
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
        if (this.f275d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f272a.f269o;
        Path path = this.f278g;
        G0.a aVar = this.f285p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f207a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f273b[i2];
            int i3 = this.f272a.f268n;
            Matrix matrix = t.f339b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f274c[i2].a(matrix, aVar, this.f272a.f268n, canvas);
        }
        if (this.f291v) {
            double d2 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d2)) * this.f272a.f269o);
            int cos = (int) (Math.cos(Math.toRadians(d2)) * this.f272a.f269o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f271w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f308f.a(rectF) * this.f272a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f283n;
        paint.setColorFilter(this.f288s);
        int alpha = paint.getAlpha();
        int i = this.f272a.f265k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f284o;
        paint2.setColorFilter(this.f289t);
        paint2.setStrokeWidth(this.f272a.f264j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f272a.f265k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f276e;
        Path path = this.f278g;
        if (z2) {
            float f2 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f272a.f257a;
            j e2 = kVar.e();
            c cVar = kVar.f307e;
            if (!(cVar instanceof h)) {
                cVar = new b(f2, cVar);
            }
            e2.f297e = cVar;
            c cVar2 = kVar.f308f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f2, cVar2);
            }
            e2.f298f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f2, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f309g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f2, cVar4);
            }
            e2.f299g = cVar4;
            k a2 = e2.a();
            this.f282m = a2;
            float f3 = this.f272a.i;
            RectF rectF = this.f279j;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f287r.a(a2, f3, rectF, null, this.h);
            a(f(), path);
            this.f276e = false;
        }
        f fVar = this.f272a;
        fVar.getClass();
        if (fVar.f268n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f272a.f257a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d2)) * this.f272a.f269o), (int) (Math.cos(Math.toRadians(d2)) * this.f272a.f269o));
                if (this.f291v) {
                    RectF rectF2 = this.f290u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f272a.f268n * 2) + ((int) rectF2.width()) + width, (this.f272a.f268n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f4 = (getBounds().left - this.f272a.f268n) - width;
                    float f5 = (getBounds().top - this.f272a.f268n) - height;
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
        f fVar2 = this.f272a;
        Paint.Style style = fVar2.f270p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f257a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f284o;
        Path path = this.h;
        k kVar = this.f282m;
        RectF rectF = this.f279j;
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
        Paint.Style style = this.f272a.f270p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f284o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f272a.f265k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f272a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f272a.getClass();
        if (this.f272a.f257a.d(f())) {
            outline.setRoundRect(getBounds(), this.f272a.f257a.f307e.a(f()) * this.f272a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f278g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC0373b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC0372a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC0372a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f272a.f263g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f280k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f278g;
        a(f2, path);
        Region region2 = this.f281l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f272a.f258b = new A0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f272a;
        if (fVar.f267m != f2) {
            fVar.f267m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f276e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f272a.f261e) == null || !colorStateList.isStateful())) {
            this.f272a.getClass();
            ColorStateList colorStateList3 = this.f272a.f260d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f272a.f259c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f272a;
        if (fVar.f259c != colorStateList) {
            fVar.f259c = colorStateList;
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
        if (this.f272a.f259c == null || color2 == (colorForState2 = this.f272a.f259c.getColorForState(iArr, (color2 = (paint2 = this.f283n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f272a.f260d == null || color == (colorForState = this.f272a.f260d.getColorForState(iArr, (color = (paint = this.f284o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f288s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f289t;
        f fVar = this.f272a;
        ColorStateList colorStateList = fVar.f261e;
        PorterDuff.Mode mode = fVar.f262f;
        Paint paint = this.f283n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f288s = porterDuffColorFilter;
        this.f272a.getClass();
        this.f289t = null;
        this.f272a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f288s) && Objects.equals(porterDuffColorFilter3, this.f289t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f272a;
        float f2 = fVar.f267m + 0.0f;
        fVar.f268n = (int) Math.ceil(0.75f * f2);
        this.f272a.f269o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f272a = new f(this.f272a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f276e = true;
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
        f fVar = this.f272a;
        if (fVar.f265k != i) {
            fVar.f265k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f272a.getClass();
        super.invalidateSelf();
    }

    @Override // H0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f272a.f257a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f272a.f261e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f272a;
        if (fVar.f262f != mode) {
            fVar.f262f = mode;
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
        this.f273b = new t[4];
        this.f274c = new t[4];
        this.f275d = new BitSet(8);
        this.f277f = new Matrix();
        this.f278g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f279j = new RectF();
        this.f280k = new Region();
        this.f281l = new Region();
        Paint paint = new Paint(1);
        this.f283n = paint;
        Paint paint2 = new Paint(1);
        this.f284o = paint2;
        this.f285p = new G0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f313a;
        } else {
            mVar = new m();
        }
        this.f287r = mVar;
        this.f290u = new RectF();
        this.f291v = true;
        this.f272a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f286q = new B0.d(2, this);
    }
}
