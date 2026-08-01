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
    public static final Paint f327w;

    /* renamed from: a, reason: collision with root package name */
    public f f328a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f329b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f330c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f331e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f332f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f333g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f334j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f335k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f336l;

    /* renamed from: m, reason: collision with root package name */
    public k f337m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f338n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f339o;

    /* renamed from: p, reason: collision with root package name */
    public final H0.a f340p;

    /* renamed from: q, reason: collision with root package name */
    public final C.g f341q;

    /* renamed from: r, reason: collision with root package name */
    public final m f342r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f343s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f344t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f345u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f346v;

    static {
        Paint paint = new Paint(1);
        f327w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f328a;
        this.f342r.a(fVar.f314a, fVar.i, rectF, this.f341q, path);
        if (this.f328a.h != 1.0f) {
            Matrix matrix = this.f332f;
            matrix.reset();
            float f2 = this.f328a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f345u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f328a;
        float f2 = fVar.f323m + 0.0f + fVar.f322l;
        B0.a aVar = fVar.f315b;
        if (aVar == null || !aVar.f50a || C.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f53e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int m2 = k0.k.m(C.a.d(i, 255), aVar.f51b, min);
        if (min > 0.0f && (i2 = aVar.f52c) != 0) {
            m2 = C.a.b(C.a.d(i2, B0.a.f49f), m2);
        }
        return C.a.d(m2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f328a.f325o;
        Path path = this.f333g;
        H0.a aVar = this.f340p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f286a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f329b[i2];
            int i3 = this.f328a.f324n;
            Matrix matrix = t.f388b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f330c[i2].a(matrix, aVar, this.f328a.f324n, canvas);
        }
        if (this.f346v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f328a.f325o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f328a.f325o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f327w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f361f.a(rectF) * this.f328a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f338n;
        paint.setColorFilter(this.f343s);
        int alpha = paint.getAlpha();
        int i = this.f328a.f321k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f339o;
        paint2.setColorFilter(this.f344t);
        paint2.setStrokeWidth(this.f328a.f320j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f328a.f321k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f331e;
        Path path = this.f333g;
        if (z2) {
            float f2 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f328a.f314a;
            j e2 = kVar.e();
            c cVar = kVar.f360e;
            if (!(cVar instanceof h)) {
                cVar = new b(f2, cVar);
            }
            e2.f351e = cVar;
            c cVar2 = kVar.f361f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f2, cVar2);
            }
            e2.f352f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f2, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f362g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f2, cVar4);
            }
            e2.f353g = cVar4;
            k a2 = e2.a();
            this.f337m = a2;
            float f3 = this.f328a.i;
            RectF rectF = this.f334j;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f342r.a(a2, f3, rectF, null, this.h);
            a(f(), path);
            this.f331e = false;
        }
        f fVar = this.f328a;
        fVar.getClass();
        if (fVar.f324n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f328a.f314a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f328a.f325o), (int) (Math.cos(Math.toRadians(d)) * this.f328a.f325o));
                if (this.f346v) {
                    RectF rectF2 = this.f345u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f328a.f324n * 2) + ((int) rectF2.width()) + width, (this.f328a.f324n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f4 = (getBounds().left - this.f328a.f324n) - width;
                    float f5 = (getBounds().top - this.f328a.f324n) - height;
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
        f fVar2 = this.f328a;
        Paint.Style style = fVar2.f326p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f314a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f339o;
        Path path = this.h;
        k kVar = this.f337m;
        RectF rectF = this.f334j;
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
        Paint.Style style = this.f328a.f326p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f339o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f328a.f321k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f328a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f328a.getClass();
        if (this.f328a.f314a.d(f())) {
            outline.setRoundRect(getBounds(), this.f328a.f314a.f360e.a(f()) * this.f328a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f333g;
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
        Rect rect2 = this.f328a.f319g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f335k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f333g;
        a(f2, path);
        Region region2 = this.f336l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f328a.f315b = new B0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f328a;
        if (fVar.f323m != f2) {
            fVar.f323m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f331e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f328a.f317e) == null || !colorStateList.isStateful())) {
            this.f328a.getClass();
            ColorStateList colorStateList3 = this.f328a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f328a.f316c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f328a;
        if (fVar.f316c != colorStateList) {
            fVar.f316c = colorStateList;
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
        if (this.f328a.f316c == null || color2 == (colorForState2 = this.f328a.f316c.getColorForState(iArr, (color2 = (paint2 = this.f338n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f328a.d == null || color == (colorForState = this.f328a.d.getColorForState(iArr, (color = (paint = this.f339o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f343s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f344t;
        f fVar = this.f328a;
        ColorStateList colorStateList = fVar.f317e;
        PorterDuff.Mode mode = fVar.f318f;
        Paint paint = this.f338n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f343s = porterDuffColorFilter;
        this.f328a.getClass();
        this.f344t = null;
        this.f328a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f343s) && Objects.equals(porterDuffColorFilter3, this.f344t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f328a;
        float f2 = fVar.f323m + 0.0f;
        fVar.f324n = (int) Math.ceil(0.75f * f2);
        this.f328a.f325o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f328a = new f(this.f328a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f331e = true;
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
        f fVar = this.f328a;
        if (fVar.f321k != i) {
            fVar.f321k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f328a.getClass();
        super.invalidateSelf();
    }

    @Override // I0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f328a.f314a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f328a.f317e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f328a;
        if (fVar.f318f != mode) {
            fVar.f318f = mode;
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
        this.f329b = new t[4];
        this.f330c = new t[4];
        this.d = new BitSet(8);
        this.f332f = new Matrix();
        this.f333g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f334j = new RectF();
        this.f335k = new Region();
        this.f336l = new Region();
        Paint paint = new Paint(1);
        this.f338n = paint;
        Paint paint2 = new Paint(1);
        this.f339o = paint2;
        this.f340p = new H0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f366a;
        } else {
            mVar = new m();
        }
        this.f342r = mVar;
        this.f345u = new RectF();
        this.f346v = true;
        this.f328a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f341q = new C.g(2, this);
    }
}
