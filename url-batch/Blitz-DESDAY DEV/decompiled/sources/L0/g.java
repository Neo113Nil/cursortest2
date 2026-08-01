package L0;

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
    public static final Paint f432w;

    /* renamed from: a, reason: collision with root package name */
    public f f433a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f434b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f435c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f436e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f437f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f438g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f439j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f440k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f441l;

    /* renamed from: m, reason: collision with root package name */
    public k f442m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f443n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f444o;

    /* renamed from: p, reason: collision with root package name */
    public final K0.a f445p;

    /* renamed from: q, reason: collision with root package name */
    public final E.g f446q;

    /* renamed from: r, reason: collision with root package name */
    public final m f447r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f448s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f449t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f450u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f451v;

    static {
        Paint paint = new Paint(1);
        f432w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f433a;
        this.f447r.a(fVar.f419a, fVar.i, rectF, this.f446q, path);
        if (this.f433a.h != 1.0f) {
            Matrix matrix = this.f437f;
            matrix.reset();
            float f2 = this.f433a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f450u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f433a;
        float f2 = fVar.f428m + 0.0f + fVar.f427l;
        E0.a aVar = fVar.f420b;
        if (aVar == null || !aVar.f184a || E.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f187e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int I2 = z1.d.I(E.a.d(i, 255), aVar.f185b, min);
        if (min > 0.0f && (i2 = aVar.f186c) != 0) {
            I2 = E.a.b(E.a.d(i2, E0.a.f183f), I2);
        }
        return E.a.d(I2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f433a.f430o;
        Path path = this.f438g;
        K0.a aVar = this.f445p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f405a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f434b[i2];
            int i3 = this.f433a.f429n;
            Matrix matrix = t.f493b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f435c[i2].a(matrix, aVar, this.f433a.f429n, canvas);
        }
        if (this.f451v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f433a.f430o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f433a.f430o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f432w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f466f.a(rectF) * this.f433a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f443n;
        paint.setColorFilter(this.f448s);
        int alpha = paint.getAlpha();
        int i = this.f433a.f426k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f444o;
        paint2.setColorFilter(this.f449t);
        paint2.setStrokeWidth(this.f433a.f425j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f433a.f426k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f436e;
        Path path = this.f438g;
        if (z2) {
            float f2 = -(h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f433a.f419a;
            j e2 = kVar.e();
            c cVar = kVar.f465e;
            if (!(cVar instanceof h)) {
                cVar = new b(f2, cVar);
            }
            e2.f456e = cVar;
            c cVar2 = kVar.f466f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f2, cVar2);
            }
            e2.f457f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f2, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f467g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f2, cVar4);
            }
            e2.f458g = cVar4;
            k a2 = e2.a();
            this.f442m = a2;
            float f3 = this.f433a.i;
            RectF rectF = this.f439j;
            rectF.set(f());
            float strokeWidth = h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f447r.a(a2, f3, rectF, null, this.h);
            a(f(), path);
            this.f436e = false;
        }
        f fVar = this.f433a;
        fVar.getClass();
        if (fVar.f429n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!j() && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f433a.f430o), (int) (Math.cos(Math.toRadians(d)) * this.f433a.f430o));
                if (this.f451v) {
                    RectF rectF2 = this.f450u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f433a.f429n * 2) + ((int) rectF2.width()) + width, (this.f433a.f429n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f4 = (getBounds().left - this.f433a.f429n) - width;
                    float f5 = (getBounds().top - this.f433a.f429n) - height;
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
        f fVar2 = this.f433a;
        Paint.Style style = fVar2.f431p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f419a, f());
        }
        if (h()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f444o;
        Path path = this.h;
        k kVar = this.f442m;
        RectF rectF = this.f439j;
        rectF.set(f());
        float strokeWidth = h() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final float g() {
        return this.f433a.f419a.f465e.a(f());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f433a.f426k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f433a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f433a.getClass();
        if (j()) {
            outline.setRoundRect(getBounds(), g() * this.f433a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f438g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            D0.c.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                D0.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            D0.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f433a.f424g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f440k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f438g;
        a(f2, path);
        Region region2 = this.f441l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.f433a.f431p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f444o.getStrokeWidth() > 0.0f;
    }

    public final void i(Context context) {
        this.f433a.f420b = new E0.a(context);
        q();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f436e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f433a.f422e) == null || !colorStateList.isStateful())) {
            this.f433a.getClass();
            ColorStateList colorStateList3 = this.f433a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f433a.f421c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j() {
        return this.f433a.f419a.d(f());
    }

    public final void k(float f2) {
        f fVar = this.f433a;
        if (fVar.f428m != f2) {
            fVar.f428m = f2;
            q();
        }
    }

    public final void l(ColorStateList colorStateList) {
        f fVar = this.f433a;
        if (fVar.f421c != colorStateList) {
            fVar.f421c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void m(float f2) {
        f fVar = this.f433a;
        if (fVar.i != f2) {
            fVar.i = f2;
            this.f436e = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f433a = new f(this.f433a);
        return this;
    }

    public final void n() {
        this.f445p.a(-12303292);
        this.f433a.getClass();
        super.invalidateSelf();
    }

    public final boolean o(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f433a.f421c == null || color2 == (colorForState2 = this.f433a.f421c.getColorForState(iArr, (color2 = (paint2 = this.f443n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f433a.d == null || color == (colorForState = this.f433a.d.getColorForState(iArr, (color = (paint = this.f444o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f436e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = o(iArr) || p();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public final boolean p() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f448s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f449t;
        f fVar = this.f433a;
        ColorStateList colorStateList = fVar.f422e;
        PorterDuff.Mode mode = fVar.f423f;
        Paint paint = this.f443n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f448s = porterDuffColorFilter;
        this.f433a.getClass();
        this.f449t = null;
        this.f433a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f448s) && Objects.equals(porterDuffColorFilter3, this.f449t)) ? false : true;
    }

    public final void q() {
        f fVar = this.f433a;
        float f2 = fVar.f428m + 0.0f;
        fVar.f429n = (int) Math.ceil(0.75f * f2);
        this.f433a.f430o = (int) Math.ceil(f2 * 0.25f);
        p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        f fVar = this.f433a;
        if (fVar.f426k != i) {
            fVar.f426k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f433a.getClass();
        super.invalidateSelf();
    }

    @Override // L0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f433a.f419a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f433a.f422e = colorStateList;
        p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f433a;
        if (fVar.f423f != mode) {
            fVar.f423f = mode;
            p();
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
        this.f434b = new t[4];
        this.f435c = new t[4];
        this.d = new BitSet(8);
        this.f437f = new Matrix();
        this.f438g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f439j = new RectF();
        this.f440k = new Region();
        this.f441l = new Region();
        Paint paint = new Paint(1);
        this.f443n = paint;
        Paint paint2 = new Paint(1);
        this.f444o = paint2;
        this.f445p = new K0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f471a;
        } else {
            mVar = new m();
        }
        this.f447r = mVar;
        this.f450u = new RectF();
        this.f451v = true;
        this.f433a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        p();
        o(getState());
        this.f446q = new E.g(2, this);
    }
}
