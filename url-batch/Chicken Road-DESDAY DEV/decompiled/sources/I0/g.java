package I0;

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

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f274w;

    /* renamed from: a, reason: collision with root package name */
    public f f275a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f276b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f277c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f278e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f279f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f280g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f281j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f282k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f283l;

    /* renamed from: m, reason: collision with root package name */
    public k f284m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f285n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f286o;

    /* renamed from: p, reason: collision with root package name */
    public final H0.a f287p;

    /* renamed from: q, reason: collision with root package name */
    public final C.g f288q;

    /* renamed from: r, reason: collision with root package name */
    public final m f289r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f290s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f291t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f292u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f293v;

    static {
        Paint paint = new Paint(1);
        f274w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f275a;
        this.f289r.a(fVar.f261a, fVar.i, rectF, this.f288q, path);
        if (this.f275a.h != 1.0f) {
            Matrix matrix = this.f279f;
            matrix.reset();
            float f2 = this.f275a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f292u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f275a;
        float f2 = fVar.f270m + 0.0f + fVar.f269l;
        B0.a aVar = fVar.f262b;
        if (aVar == null || !aVar.f52a || C.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f55e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int n2 = k0.k.n(C.a.d(i, 255), aVar.f53b, min);
        if (min > 0.0f && (i2 = aVar.f54c) != 0) {
            n2 = C.a.b(C.a.d(i2, B0.a.f51f), n2);
        }
        return C.a.d(n2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f275a.f272o;
        Path path = this.f280g;
        H0.a aVar = this.f287p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f233a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f276b[i2];
            int i3 = this.f275a.f271n;
            Matrix matrix = t.f335b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f277c[i2].a(matrix, aVar, this.f275a.f271n, canvas);
        }
        if (this.f293v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f275a.f272o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f275a.f272o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f274w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f308f.a(rectF) * this.f275a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f285n;
        paint.setColorFilter(this.f290s);
        int alpha = paint.getAlpha();
        int i = this.f275a.f268k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f286o;
        paint2.setColorFilter(this.f291t);
        paint2.setStrokeWidth(this.f275a.f267j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f275a.f268k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f278e;
        Path path = this.f280g;
        if (z2) {
            float f2 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f275a.f261a;
            j e2 = kVar.e();
            c cVar = kVar.f307e;
            if (!(cVar instanceof h)) {
                cVar = new b(f2, cVar);
            }
            e2.f298e = cVar;
            c cVar2 = kVar.f308f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f2, cVar2);
            }
            e2.f299f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f2, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f309g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f2, cVar4);
            }
            e2.f300g = cVar4;
            k a2 = e2.a();
            this.f284m = a2;
            float f3 = this.f275a.i;
            RectF rectF = this.f281j;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f289r.a(a2, f3, rectF, null, this.h);
            a(f(), path);
            this.f278e = false;
        }
        f fVar = this.f275a;
        fVar.getClass();
        if (fVar.f271n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f275a.f261a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f275a.f272o), (int) (Math.cos(Math.toRadians(d)) * this.f275a.f272o));
                if (this.f293v) {
                    RectF rectF2 = this.f292u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f275a.f271n * 2) + ((int) rectF2.width()) + width, (this.f275a.f271n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f4 = (getBounds().left - this.f275a.f271n) - width;
                    float f5 = (getBounds().top - this.f275a.f271n) - height;
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
        f fVar2 = this.f275a;
        Paint.Style style = fVar2.f273p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f261a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f286o;
        Path path = this.h;
        k kVar = this.f284m;
        RectF rectF = this.f281j;
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
        Paint.Style style = this.f275a.f273p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f286o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f275a.f268k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f275a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f275a.getClass();
        if (this.f275a.f261a.d(f())) {
            outline.setRoundRect(getBounds(), this.f275a.f261a.f307e.a(f()) * this.f275a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f280g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            A0.d.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                A0.b.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            A0.b.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f275a.f266g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f282k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f280g;
        a(f2, path);
        Region region2 = this.f283l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f275a.f262b = new B0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f275a;
        if (fVar.f270m != f2) {
            fVar.f270m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f278e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f275a.f264e) == null || !colorStateList.isStateful())) {
            this.f275a.getClass();
            ColorStateList colorStateList3 = this.f275a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f275a.f263c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f275a;
        if (fVar.f263c != colorStateList) {
            fVar.f263c = colorStateList;
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
        if (this.f275a.f263c == null || color2 == (colorForState2 = this.f275a.f263c.getColorForState(iArr, (color2 = (paint2 = this.f285n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f275a.d == null || color == (colorForState = this.f275a.d.getColorForState(iArr, (color = (paint = this.f286o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f290s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f291t;
        f fVar = this.f275a;
        ColorStateList colorStateList = fVar.f264e;
        PorterDuff.Mode mode = fVar.f265f;
        Paint paint = this.f285n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f290s = porterDuffColorFilter;
        this.f275a.getClass();
        this.f291t = null;
        this.f275a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f290s) && Objects.equals(porterDuffColorFilter3, this.f291t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f275a;
        float f2 = fVar.f270m + 0.0f;
        fVar.f271n = (int) Math.ceil(0.75f * f2);
        this.f275a.f272o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f275a = new f(this.f275a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f278e = true;
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
        f fVar = this.f275a;
        if (fVar.f268k != i) {
            fVar.f268k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f275a.getClass();
        super.invalidateSelf();
    }

    @Override // I0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f275a.f261a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f275a.f264e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f275a;
        if (fVar.f265f != mode) {
            fVar.f265f = mode;
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
        this.f276b = new t[4];
        this.f277c = new t[4];
        this.d = new BitSet(8);
        this.f279f = new Matrix();
        this.f280g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f281j = new RectF();
        this.f282k = new Region();
        this.f283l = new Region();
        Paint paint = new Paint(1);
        this.f285n = paint;
        Paint paint2 = new Paint(1);
        this.f286o = paint2;
        this.f287p = new H0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f313a;
        } else {
            mVar = new m();
        }
        this.f289r = mVar;
        this.f292u = new RectF();
        this.f293v = true;
        this.f275a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f288q = new C.g(2, this);
    }
}
