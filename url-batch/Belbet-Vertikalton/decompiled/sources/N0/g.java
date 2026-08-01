package N0;

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
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f899w;

    /* renamed from: a, reason: collision with root package name */
    public f f900a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f901b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f902c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f903d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f904f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f905g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f906h;
    public final RectF i;
    public final RectF j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f907k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f908l;

    /* renamed from: m, reason: collision with root package name */
    public k f909m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f910n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f911o;

    /* renamed from: p, reason: collision with root package name */
    public final M0.a f912p;

    /* renamed from: q, reason: collision with root package name */
    public final C1.d f913q;

    /* renamed from: r, reason: collision with root package name */
    public final m f914r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f915s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f916t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f917u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f918v;

    static {
        Paint paint = new Paint(1);
        f899w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f900a;
        this.f914r.a(fVar.f886a, fVar.i, rectF, this.f913q, path);
        if (this.f900a.f892h != 1.0f) {
            Matrix matrix = this.f904f;
            matrix.reset();
            float f2 = this.f900a.f892h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f917u, true);
    }

    public final int b(int i) {
        f fVar = this.f900a;
        float f2 = fVar.f895m + 0.0f + fVar.f894l;
        G0.a aVar = fVar.f887b;
        return aVar != null ? aVar.a(i, f2) : i;
    }

    public final void c(Canvas canvas) {
        if (this.f903d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f900a.f897o;
        Path path = this.f905g;
        M0.a aVar = this.f912p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f807a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f901b[i2];
            int i3 = this.f900a.f896n;
            Matrix matrix = t.f962b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f902c[i2].a(matrix, aVar, this.f900a.f896n, canvas);
        }
        if (this.f918v) {
            double d2 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d2)) * this.f900a.f897o);
            int cos = (int) (Math.cos(Math.toRadians(d2)) * this.f900a.f897o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f899w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f933f.a(rectF) * this.f900a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f910n;
        paint.setColorFilter(this.f915s);
        int alpha = paint.getAlpha();
        int i = this.f900a.f893k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f911o;
        paint2.setColorFilter(this.f916t);
        paint2.setStrokeWidth(this.f900a.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f900a.f893k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.e;
        Path path = this.f905g;
        if (z2) {
            float f2 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f900a.f886a;
            j e = kVar.e();
            c cVar = kVar.e;
            if (!(cVar instanceof h)) {
                cVar = new b(f2, cVar);
            }
            e.e = cVar;
            c cVar2 = kVar.f933f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f2, cVar2);
            }
            e.f924f = cVar2;
            c cVar3 = kVar.f935h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f2, cVar3);
            }
            e.f926h = cVar3;
            c cVar4 = kVar.f934g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f2, cVar4);
            }
            e.f925g = cVar4;
            k a2 = e.a();
            this.f909m = a2;
            float f3 = this.f900a.i;
            RectF rectF = this.j;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f914r.a(a2, f3, rectF, null, this.f906h);
            a(f(), path);
            this.e = false;
        }
        f fVar = this.f900a;
        fVar.getClass();
        if (fVar.f896n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f900a.f886a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d2 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d2)) * this.f900a.f897o), (int) (Math.cos(Math.toRadians(d2)) * this.f900a.f897o));
                if (this.f918v) {
                    RectF rectF2 = this.f917u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f900a.f896n * 2) + ((int) rectF2.width()) + width, (this.f900a.f896n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f4 = (getBounds().left - this.f900a.f896n) - width;
                    float f5 = (getBounds().top - this.f900a.f896n) - height;
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
        f fVar2 = this.f900a;
        Paint.Style style = fVar2.f898p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f886a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f911o;
        Path path = this.f906h;
        k kVar = this.f909m;
        RectF rectF = this.j;
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
        Paint.Style style = this.f900a.f898p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f911o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f900a.f893k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f900a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f900a.getClass();
        if (this.f900a.f886a.d(f())) {
            outline.setRoundRect(getBounds(), this.f900a.f886a.e.a(f()) * this.f900a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f905g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            F0.d.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                F0.b.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            F0.b.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f900a.f891g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f907k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f905g;
        a(f2, path);
        Region region2 = this.f908l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f900a.f887b = new G0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f900a;
        if (fVar.f895m != f2) {
            fVar.f895m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f900a.e) == null || !colorStateList.isStateful())) {
            this.f900a.getClass();
            ColorStateList colorStateList3 = this.f900a.f889d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f900a.f888c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f900a;
        if (fVar.f888c != colorStateList) {
            fVar.f888c = colorStateList;
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
        if (this.f900a.f888c == null || color2 == (colorForState2 = this.f900a.f888c.getColorForState(iArr, (color2 = (paint2 = this.f910n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f900a.f889d == null || color == (colorForState = this.f900a.f889d.getColorForState(iArr, (color = (paint = this.f911o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f915s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f916t;
        f fVar = this.f900a;
        ColorStateList colorStateList = fVar.e;
        PorterDuff.Mode mode = fVar.f890f;
        Paint paint = this.f910n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f915s = porterDuffColorFilter;
        this.f900a.getClass();
        this.f916t = null;
        this.f900a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f915s) && Objects.equals(porterDuffColorFilter3, this.f916t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f900a;
        float f2 = fVar.f895m + 0.0f;
        fVar.f896n = (int) Math.ceil(0.75f * f2);
        this.f900a.f897o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f900a = new f(this.f900a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
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
        f fVar = this.f900a;
        if (fVar.f893k != i) {
            fVar.f893k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f900a.getClass();
        super.invalidateSelf();
    }

    @Override // N0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f900a.f886a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f900a.e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f900a;
        if (fVar.f890f != mode) {
            fVar.f890f = mode;
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
        this.f901b = new t[4];
        this.f902c = new t[4];
        this.f903d = new BitSet(8);
        this.f904f = new Matrix();
        this.f905g = new Path();
        this.f906h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.f907k = new Region();
        this.f908l = new Region();
        Paint paint = new Paint(1);
        this.f910n = paint;
        Paint paint2 = new Paint(1);
        this.f911o = paint2;
        this.f912p = new M0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f938a;
        } else {
            mVar = new m();
        }
        this.f914r = mVar;
        this.f917u = new RectF();
        this.f918v = true;
        this.f900a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f913q = new C1.d(9, this);
    }
}
