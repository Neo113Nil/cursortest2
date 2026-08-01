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
    public static final Paint f267w;

    /* renamed from: a, reason: collision with root package name */
    public f f268a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f269b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f270c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f271e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f272f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f273g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f274j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f275k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f276l;

    /* renamed from: m, reason: collision with root package name */
    public k f277m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f278n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f279o;

    /* renamed from: p, reason: collision with root package name */
    public final H0.a f280p;

    /* renamed from: q, reason: collision with root package name */
    public final C.g f281q;

    /* renamed from: r, reason: collision with root package name */
    public final m f282r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f283s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f284t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f285u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f286v;

    static {
        Paint paint = new Paint(1);
        f267w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f268a;
        this.f282r.a(fVar.f254a, fVar.i, rectF, this.f281q, path);
        if (this.f268a.h != 1.0f) {
            Matrix matrix = this.f272f;
            matrix.reset();
            float f2 = this.f268a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f285u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f268a;
        float f2 = fVar.f263m + 0.0f + fVar.f262l;
        B0.a aVar = fVar.f255b;
        if (aVar == null || !aVar.f50a || C.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f53e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int q2 = k1.c.q(C.a.d(i, 255), aVar.f51b, min);
        if (min > 0.0f && (i2 = aVar.f52c) != 0) {
            q2 = C.a.b(C.a.d(i2, B0.a.f49f), q2);
        }
        return C.a.d(q2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f268a.f265o;
        Path path = this.f273g;
        H0.a aVar = this.f280p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f226a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f269b[i2];
            int i3 = this.f268a.f264n;
            Matrix matrix = t.f328b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f270c[i2].a(matrix, aVar, this.f268a.f264n, canvas);
        }
        if (this.f286v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f268a.f265o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f268a.f265o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f267w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f301f.a(rectF) * this.f268a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f278n;
        paint.setColorFilter(this.f283s);
        int alpha = paint.getAlpha();
        int i = this.f268a.f261k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f279o;
        paint2.setColorFilter(this.f284t);
        paint2.setStrokeWidth(this.f268a.f260j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f268a.f261k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f271e;
        Path path = this.f273g;
        if (z2) {
            float f2 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f268a.f254a;
            j e2 = kVar.e();
            c cVar = kVar.f300e;
            if (!(cVar instanceof h)) {
                cVar = new b(f2, cVar);
            }
            e2.f291e = cVar;
            c cVar2 = kVar.f301f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f2, cVar2);
            }
            e2.f292f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f2, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f302g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f2, cVar4);
            }
            e2.f293g = cVar4;
            k a2 = e2.a();
            this.f277m = a2;
            float f3 = this.f268a.i;
            RectF rectF = this.f274j;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f282r.a(a2, f3, rectF, null, this.h);
            a(f(), path);
            this.f271e = false;
        }
        f fVar = this.f268a;
        fVar.getClass();
        if (fVar.f264n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f268a.f254a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f268a.f265o), (int) (Math.cos(Math.toRadians(d)) * this.f268a.f265o));
                if (this.f286v) {
                    RectF rectF2 = this.f285u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f268a.f264n * 2) + ((int) rectF2.width()) + width, (this.f268a.f264n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f4 = (getBounds().left - this.f268a.f264n) - width;
                    float f5 = (getBounds().top - this.f268a.f264n) - height;
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
        f fVar2 = this.f268a;
        Paint.Style style = fVar2.f266p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f254a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f279o;
        Path path = this.h;
        k kVar = this.f277m;
        RectF rectF = this.f274j;
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
        Paint.Style style = this.f268a.f266p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f279o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f268a.f261k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f268a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f268a.getClass();
        if (this.f268a.f254a.d(f())) {
            outline.setRoundRect(getBounds(), this.f268a.f254a.f300e.a(f()) * this.f268a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f273g;
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
        Rect rect2 = this.f268a.f259g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f275k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f273g;
        a(f2, path);
        Region region2 = this.f276l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f268a.f255b = new B0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f268a;
        if (fVar.f263m != f2) {
            fVar.f263m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f271e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f268a.f257e) == null || !colorStateList.isStateful())) {
            this.f268a.getClass();
            ColorStateList colorStateList3 = this.f268a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f268a.f256c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f268a;
        if (fVar.f256c != colorStateList) {
            fVar.f256c = colorStateList;
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
        if (this.f268a.f256c == null || color2 == (colorForState2 = this.f268a.f256c.getColorForState(iArr, (color2 = (paint2 = this.f278n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f268a.d == null || color == (colorForState = this.f268a.d.getColorForState(iArr, (color = (paint = this.f279o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f283s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f284t;
        f fVar = this.f268a;
        ColorStateList colorStateList = fVar.f257e;
        PorterDuff.Mode mode = fVar.f258f;
        Paint paint = this.f278n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f283s = porterDuffColorFilter;
        this.f268a.getClass();
        this.f284t = null;
        this.f268a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f283s) && Objects.equals(porterDuffColorFilter3, this.f284t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f268a;
        float f2 = fVar.f263m + 0.0f;
        fVar.f264n = (int) Math.ceil(0.75f * f2);
        this.f268a.f265o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f268a = new f(this.f268a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f271e = true;
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
        f fVar = this.f268a;
        if (fVar.f261k != i) {
            fVar.f261k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f268a.getClass();
        super.invalidateSelf();
    }

    @Override // I0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f268a.f254a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f268a.f257e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f268a;
        if (fVar.f258f != mode) {
            fVar.f258f = mode;
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
        this.f269b = new t[4];
        this.f270c = new t[4];
        this.d = new BitSet(8);
        this.f272f = new Matrix();
        this.f273g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f274j = new RectF();
        this.f275k = new Region();
        this.f276l = new Region();
        Paint paint = new Paint(1);
        this.f278n = paint;
        Paint paint2 = new Paint(1);
        this.f279o = paint2;
        this.f280p = new H0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f306a;
        } else {
            mVar = new m();
        }
        this.f282r = mVar;
        this.f285u = new RectF();
        this.f286v = true;
        this.f268a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f281q = new C.g(2, this);
    }
}
