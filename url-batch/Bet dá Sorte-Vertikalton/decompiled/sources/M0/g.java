package M0;

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
    public static final Paint f494w;

    /* renamed from: a, reason: collision with root package name */
    public f f495a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f496b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f497c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f498e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f499f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f500g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f501j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f502k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f503l;

    /* renamed from: m, reason: collision with root package name */
    public k f504m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f505n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f506o;

    /* renamed from: p, reason: collision with root package name */
    public final L0.a f507p;

    /* renamed from: q, reason: collision with root package name */
    public final C.h f508q;

    /* renamed from: r, reason: collision with root package name */
    public final m f509r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f510s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f511t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f512u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f513v;

    static {
        Paint paint = new Paint(1);
        f494w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f495a;
        this.f509r.a(fVar.f481a, fVar.i, rectF, this.f508q, path);
        if (this.f495a.h != 1.0f) {
            Matrix matrix = this.f499f;
            matrix.reset();
            float f2 = this.f495a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f512u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f495a;
        float f2 = fVar.f490m + 0.0f + fVar.f489l;
        F0.a aVar = fVar.f482b;
        if (aVar == null || !aVar.f167a || C.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f170e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int R2 = u1.l.R(C.a.d(i, 255), aVar.f168b, min);
        if (min > 0.0f && (i2 = aVar.f169c) != 0) {
            R2 = C.a.b(C.a.d(i2, F0.a.f166f), R2);
        }
        return C.a.d(R2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f495a.f492o;
        Path path = this.f500g;
        L0.a aVar = this.f507p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f470a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f496b[i2];
            int i3 = this.f495a.f491n;
            Matrix matrix = t.f555b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f497c[i2].a(matrix, aVar, this.f495a.f491n, canvas);
        }
        if (this.f513v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f495a.f492o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f495a.f492o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f494w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f528f.a(rectF) * this.f495a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f505n;
        paint.setColorFilter(this.f510s);
        int alpha = paint.getAlpha();
        int i = this.f495a.f488k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f506o;
        paint2.setColorFilter(this.f511t);
        paint2.setStrokeWidth(this.f495a.f487j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f495a.f488k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f498e;
        Path path = this.f500g;
        if (z2) {
            float f2 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f495a.f481a;
            j e2 = kVar.e();
            c cVar = kVar.f527e;
            if (!(cVar instanceof h)) {
                cVar = new b(f2, cVar);
            }
            e2.f518e = cVar;
            c cVar2 = kVar.f528f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f2, cVar2);
            }
            e2.f519f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f2, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f529g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f2, cVar4);
            }
            e2.f520g = cVar4;
            k a2 = e2.a();
            this.f504m = a2;
            float f3 = this.f495a.i;
            RectF rectF = this.f501j;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f509r.a(a2, f3, rectF, null, this.h);
            a(f(), path);
            this.f498e = false;
        }
        f fVar = this.f495a;
        fVar.getClass();
        if (fVar.f491n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f495a.f481a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f495a.f492o), (int) (Math.cos(Math.toRadians(d)) * this.f495a.f492o));
                if (this.f513v) {
                    RectF rectF2 = this.f512u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f495a.f491n * 2) + ((int) rectF2.width()) + width, (this.f495a.f491n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f4 = (getBounds().left - this.f495a.f491n) - width;
                    float f5 = (getBounds().top - this.f495a.f491n) - height;
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
        f fVar2 = this.f495a;
        Paint.Style style = fVar2.f493p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f481a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f506o;
        Path path = this.h;
        k kVar = this.f504m;
        RectF rectF = this.f501j;
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
        Paint.Style style = this.f495a.f493p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f506o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f495a.f488k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f495a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f495a.getClass();
        if (this.f495a.f481a.d(f())) {
            outline.setRoundRect(getBounds(), this.f495a.f481a.f527e.a(f()) * this.f495a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f500g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            E0.c.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                E0.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            E0.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f495a.f486g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f502k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f500g;
        a(f2, path);
        Region region2 = this.f503l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f495a.f482b = new F0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f495a;
        if (fVar.f490m != f2) {
            fVar.f490m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f498e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f495a.f484e) == null || !colorStateList.isStateful())) {
            this.f495a.getClass();
            ColorStateList colorStateList3 = this.f495a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f495a.f483c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f495a;
        if (fVar.f483c != colorStateList) {
            fVar.f483c = colorStateList;
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
        if (this.f495a.f483c == null || color2 == (colorForState2 = this.f495a.f483c.getColorForState(iArr, (color2 = (paint2 = this.f505n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f495a.d == null || color == (colorForState = this.f495a.d.getColorForState(iArr, (color = (paint = this.f506o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f510s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f511t;
        f fVar = this.f495a;
        ColorStateList colorStateList = fVar.f484e;
        PorterDuff.Mode mode = fVar.f485f;
        Paint paint = this.f505n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f510s = porterDuffColorFilter;
        this.f495a.getClass();
        this.f511t = null;
        this.f495a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f510s) && Objects.equals(porterDuffColorFilter3, this.f511t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f495a;
        float f2 = fVar.f490m + 0.0f;
        fVar.f491n = (int) Math.ceil(0.75f * f2);
        this.f495a.f492o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f495a = new f(this.f495a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f498e = true;
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
        f fVar = this.f495a;
        if (fVar.f488k != i) {
            fVar.f488k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f495a.getClass();
        super.invalidateSelf();
    }

    @Override // M0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f495a.f481a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f495a.f484e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f495a;
        if (fVar.f485f != mode) {
            fVar.f485f = mode;
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
        this.f496b = new t[4];
        this.f497c = new t[4];
        this.d = new BitSet(8);
        this.f499f = new Matrix();
        this.f500g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f501j = new RectF();
        this.f502k = new Region();
        this.f503l = new Region();
        Paint paint = new Paint(1);
        this.f505n = paint;
        Paint paint2 = new Paint(1);
        this.f506o = paint2;
        this.f507p = new L0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f533a;
        } else {
            mVar = new m();
        }
        this.f509r = mVar;
        this.f512u = new RectF();
        this.f513v = true;
        this.f495a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f508q = new C.h(7, this);
    }
}
