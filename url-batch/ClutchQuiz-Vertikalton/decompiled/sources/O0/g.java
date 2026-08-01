package O0;

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
    public static final Paint f526w;

    /* renamed from: a, reason: collision with root package name */
    public f f527a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f528b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f529c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f530e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f531f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f532g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f533j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f534k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f535l;

    /* renamed from: m, reason: collision with root package name */
    public k f536m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f537n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f538o;

    /* renamed from: p, reason: collision with root package name */
    public final N0.a f539p;

    /* renamed from: q, reason: collision with root package name */
    public final A0.h f540q;

    /* renamed from: r, reason: collision with root package name */
    public final m f541r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f542s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f543t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f544u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f545v;

    static {
        Paint paint = new Paint(1);
        f526w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f527a;
        this.f541r.a(fVar.f513a, fVar.i, rectF, this.f540q, path);
        if (this.f527a.h != 1.0f) {
            Matrix matrix = this.f531f;
            matrix.reset();
            float f2 = this.f527a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f544u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f527a;
        float f2 = fVar.f522m + 0.0f + fVar.f521l;
        H0.a aVar = fVar.f514b;
        if (aVar == null || !aVar.f246a || C.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f249e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int h02 = A.c.h0(C.a.d(i, 255), aVar.f247b, min);
        if (min > 0.0f && (i2 = aVar.f248c) != 0) {
            h02 = C.a.b(C.a.d(i2, H0.a.f245f), h02);
        }
        return C.a.d(h02, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f527a.f524o;
        Path path = this.f532g;
        N0.a aVar = this.f539p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f502a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f528b[i2];
            int i3 = this.f527a.f523n;
            Matrix matrix = t.f587b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f529c[i2].a(matrix, aVar, this.f527a.f523n, canvas);
        }
        if (this.f545v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f527a.f524o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f527a.f524o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f526w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f560f.a(rectF) * this.f527a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f537n;
        paint.setColorFilter(this.f542s);
        int alpha = paint.getAlpha();
        int i = this.f527a.f520k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f538o;
        paint2.setColorFilter(this.f543t);
        paint2.setStrokeWidth(this.f527a.f519j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f527a.f520k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f530e;
        Path path = this.f532g;
        if (z2) {
            float f2 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f527a.f513a;
            j e2 = kVar.e();
            c cVar = kVar.f559e;
            if (!(cVar instanceof h)) {
                cVar = new b(f2, cVar);
            }
            e2.f550e = cVar;
            c cVar2 = kVar.f560f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f2, cVar2);
            }
            e2.f551f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f2, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f561g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f2, cVar4);
            }
            e2.f552g = cVar4;
            k a2 = e2.a();
            this.f536m = a2;
            float f3 = this.f527a.i;
            RectF rectF = this.f533j;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f541r.a(a2, f3, rectF, null, this.h);
            a(f(), path);
            this.f530e = false;
        }
        f fVar = this.f527a;
        fVar.getClass();
        if (fVar.f523n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f527a.f513a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f527a.f524o), (int) (Math.cos(Math.toRadians(d)) * this.f527a.f524o));
                if (this.f545v) {
                    RectF rectF2 = this.f544u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f527a.f523n * 2) + ((int) rectF2.width()) + width, (this.f527a.f523n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f4 = (getBounds().left - this.f527a.f523n) - width;
                    float f5 = (getBounds().top - this.f527a.f523n) - height;
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
        f fVar2 = this.f527a;
        Paint.Style style = fVar2.f525p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f513a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f538o;
        Path path = this.h;
        k kVar = this.f536m;
        RectF rectF = this.f533j;
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
        Paint.Style style = this.f527a.f525p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f538o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f527a.f520k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f527a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f527a.getClass();
        if (this.f527a.f513a.d(f())) {
            outline.setRoundRect(getBounds(), this.f527a.f513a.f559e.a(f()) * this.f527a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f532g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            G0.c.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                G0.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            G0.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f527a.f518g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f534k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f532g;
        a(f2, path);
        Region region2 = this.f535l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f527a.f514b = new H0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f527a;
        if (fVar.f522m != f2) {
            fVar.f522m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f530e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f527a.f516e) == null || !colorStateList.isStateful())) {
            this.f527a.getClass();
            ColorStateList colorStateList3 = this.f527a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f527a.f515c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f527a;
        if (fVar.f515c != colorStateList) {
            fVar.f515c = colorStateList;
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
        if (this.f527a.f515c == null || color2 == (colorForState2 = this.f527a.f515c.getColorForState(iArr, (color2 = (paint2 = this.f537n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f527a.d == null || color == (colorForState = this.f527a.d.getColorForState(iArr, (color = (paint = this.f538o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f542s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f543t;
        f fVar = this.f527a;
        ColorStateList colorStateList = fVar.f516e;
        PorterDuff.Mode mode = fVar.f517f;
        Paint paint = this.f537n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f542s = porterDuffColorFilter;
        this.f527a.getClass();
        this.f543t = null;
        this.f527a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f542s) && Objects.equals(porterDuffColorFilter3, this.f543t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f527a;
        float f2 = fVar.f522m + 0.0f;
        fVar.f523n = (int) Math.ceil(0.75f * f2);
        this.f527a.f524o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f527a = new f(this.f527a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f530e = true;
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
        f fVar = this.f527a;
        if (fVar.f520k != i) {
            fVar.f520k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f527a.getClass();
        super.invalidateSelf();
    }

    @Override // O0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f527a.f513a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f527a.f516e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f527a;
        if (fVar.f517f != mode) {
            fVar.f517f = mode;
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
        this.f528b = new t[4];
        this.f529c = new t[4];
        this.d = new BitSet(8);
        this.f531f = new Matrix();
        this.f532g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f533j = new RectF();
        this.f534k = new Region();
        this.f535l = new Region();
        Paint paint = new Paint(1);
        this.f537n = paint;
        Paint paint2 = new Paint(1);
        this.f538o = paint2;
        this.f539p = new N0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f565a;
        } else {
            mVar = new m();
        }
        this.f541r = mVar;
        this.f544u = new RectF();
        this.f545v = true;
        this.f527a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f540q = new A0.h(6, this);
    }
}
