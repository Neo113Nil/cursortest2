package K0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import androidx.recyclerview.widget.RecyclerView;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f396w;

    /* renamed from: a, reason: collision with root package name */
    public f f397a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f398b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f399c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f400e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f401f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f402g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f403h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f404j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f405k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f406l;

    /* renamed from: m, reason: collision with root package name */
    public k f407m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f408n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f409o;

    /* renamed from: p, reason: collision with root package name */
    public final J0.a f410p;

    /* renamed from: q, reason: collision with root package name */
    public final D.g f411q;

    /* renamed from: r, reason: collision with root package name */
    public final m f412r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f413s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f414t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f415u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f416v;

    static {
        Paint paint = new Paint(1);
        f396w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f397a;
        this.f412r.a(fVar.f382a, fVar.i, rectF, this.f411q, path);
        if (this.f397a.f388h != 1.0f) {
            Matrix matrix = this.f401f;
            matrix.reset();
            float f2 = this.f397a.f388h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f415u, true);
    }

    public final int b(int i) {
        f fVar = this.f397a;
        float f2 = fVar.f392m + RecyclerView.A0 + fVar.f391l;
        D0.a aVar = fVar.f383b;
        return aVar != null ? aVar.a(i, f2) : i;
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f397a.f394o;
        Path path = this.f402g;
        J0.a aVar = this.f410p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f367a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f398b[i2];
            int i3 = this.f397a.f393n;
            Matrix matrix = t.f462b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f399c[i2].a(matrix, aVar, this.f397a.f393n, canvas);
        }
        if (this.f416v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f397a.f394o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f397a.f394o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f396w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f432f.a(rectF) * this.f397a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f408n;
        paint.setColorFilter(this.f413s);
        int alpha = paint.getAlpha();
        int i = this.f397a.f390k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f409o;
        paint2.setColorFilter(this.f414t);
        paint2.setStrokeWidth(this.f397a.f389j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f397a.f390k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f400e;
        Path path = this.f402g;
        if (z2) {
            boolean g2 = g();
            float f2 = RecyclerView.A0;
            float f3 = -(g2 ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f397a.f382a;
            j e2 = kVar.e();
            c cVar = kVar.f431e;
            if (!(cVar instanceof h)) {
                cVar = new b(f3, cVar);
            }
            e2.f421e = cVar;
            c cVar2 = kVar.f432f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f3, cVar2);
            }
            e2.f422f = cVar2;
            c cVar3 = kVar.f434h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f3, cVar3);
            }
            e2.f424h = cVar3;
            c cVar4 = kVar.f433g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f3, cVar4);
            }
            e2.f423g = cVar4;
            k a2 = e2.a();
            this.f407m = a2;
            float f4 = this.f397a.i;
            RectF rectF = this.f404j;
            rectF.set(f());
            if (g()) {
                f2 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f2, f2);
            this.f412r.a(a2, f4, rectF, null, this.f403h);
            a(f(), path);
            this.f400e = false;
        }
        f fVar = this.f397a;
        fVar.getClass();
        if (fVar.f393n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f397a.f382a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f397a.f394o), (int) (Math.cos(Math.toRadians(d)) * this.f397a.f394o));
                if (this.f416v) {
                    RectF rectF2 = this.f415u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f397a.f393n * 2) + ((int) rectF2.width()) + width, (this.f397a.f393n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f5 = (getBounds().left - this.f397a.f393n) - width;
                    float f6 = (getBounds().top - this.f397a.f393n) - height;
                    canvas2.translate(-f5, -f6);
                    c(canvas2);
                    canvas.drawBitmap(createBitmap, f5, f6, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f397a;
        Paint.Style style = fVar2.f395p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f382a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f409o;
        Path path = this.f403h;
        k kVar = this.f407m;
        RectF rectF = this.f404j;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : RecyclerView.A0;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f397a.f395p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f409o.getStrokeWidth() > RecyclerView.A0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f397a.f390k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f397a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f397a.getClass();
        if (this.f397a.f382a.d(f())) {
            outline.setRoundRect(getBounds(), this.f397a.f382a.f431e.a(f()) * this.f397a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f402g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            C0.c.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                C0.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            C0.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f397a.f387g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f405k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f402g;
        a(f2, path);
        Region region2 = this.f406l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f397a.f383b = new D0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f397a;
        if (fVar.f392m != f2) {
            fVar.f392m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f400e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f397a.f385e) == null || !colorStateList.isStateful())) {
            this.f397a.getClass();
            ColorStateList colorStateList3 = this.f397a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f397a.f384c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f397a;
        if (fVar.f384c != colorStateList) {
            fVar.f384c = colorStateList;
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
        if (this.f397a.f384c == null || color2 == (colorForState2 = this.f397a.f384c.getColorForState(iArr, (color2 = (paint2 = this.f408n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f397a.d == null || color == (colorForState = this.f397a.d.getColorForState(iArr, (color = (paint = this.f409o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f413s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f414t;
        f fVar = this.f397a;
        ColorStateList colorStateList = fVar.f385e;
        PorterDuff.Mode mode = fVar.f386f;
        Paint paint = this.f408n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f413s = porterDuffColorFilter;
        this.f397a.getClass();
        this.f414t = null;
        this.f397a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f413s) && Objects.equals(porterDuffColorFilter3, this.f414t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f397a;
        float f2 = fVar.f392m + RecyclerView.A0;
        fVar.f393n = (int) Math.ceil(0.75f * f2);
        this.f397a.f394o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f397a = new f(this.f397a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f400e = true;
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
        f fVar = this.f397a;
        if (fVar.f390k != i) {
            fVar.f390k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f397a.getClass();
        super.invalidateSelf();
    }

    @Override // K0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f397a.f382a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f397a.f385e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f397a;
        if (fVar.f386f != mode) {
            fVar.f386f = mode;
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
        this.f398b = new t[4];
        this.f399c = new t[4];
        this.d = new BitSet(8);
        this.f401f = new Matrix();
        this.f402g = new Path();
        this.f403h = new Path();
        this.i = new RectF();
        this.f404j = new RectF();
        this.f405k = new Region();
        this.f406l = new Region();
        Paint paint = new Paint(1);
        this.f408n = paint;
        Paint paint2 = new Paint(1);
        this.f409o = paint2;
        this.f410p = new J0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f438a;
        } else {
            mVar = new m();
        }
        this.f412r = mVar;
        this.f415u = new RectF();
        this.f416v = true;
        this.f397a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f411q = new D.g(2, this);
    }
}
