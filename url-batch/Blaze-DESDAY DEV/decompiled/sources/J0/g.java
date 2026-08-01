package J0;

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
import androidx.recyclerview.widget.RecyclerView;
import java.util.BitSet;
import java.util.Objects;
import k0.AbstractC0180a;

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f351w;

    /* renamed from: a, reason: collision with root package name */
    public f f352a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f353b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f354c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f355e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f356f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f357g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f358j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f359k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f360l;

    /* renamed from: m, reason: collision with root package name */
    public k f361m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f362n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f363o;

    /* renamed from: p, reason: collision with root package name */
    public final I0.a f364p;

    /* renamed from: q, reason: collision with root package name */
    public final C.g f365q;

    /* renamed from: r, reason: collision with root package name */
    public final m f366r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f367s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f368t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f369u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f370v;

    static {
        Paint paint = new Paint(1);
        f351w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f352a;
        this.f366r.a(fVar.f338a, fVar.i, rectF, this.f365q, path);
        if (this.f352a.h != 1.0f) {
            Matrix matrix = this.f356f;
            matrix.reset();
            float f2 = this.f352a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f369u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f352a;
        float f2 = fVar.f347m + RecyclerView.f1559A0 + fVar.f346l;
        C0.a aVar = fVar.f339b;
        if (aVar == null || !aVar.f93a || C.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f96e <= RecyclerView.f1559A0 || f2 <= RecyclerView.f1559A0) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int l2 = AbstractC0180a.l(C.a.d(i, 255), aVar.f94b, min);
        if (min > RecyclerView.f1559A0 && (i2 = aVar.f95c) != 0) {
            l2 = C.a.b(C.a.d(i2, C0.a.f92f), l2);
        }
        return C.a.d(l2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f352a.f349o;
        Path path = this.f357g;
        I0.a aVar = this.f364p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f324a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f353b[i2];
            int i3 = this.f352a.f348n;
            Matrix matrix = t.f412b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f354c[i2].a(matrix, aVar, this.f352a.f348n, canvas);
        }
        if (this.f370v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f352a.f349o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f352a.f349o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f351w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f385f.a(rectF) * this.f352a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f362n;
        paint.setColorFilter(this.f367s);
        int alpha = paint.getAlpha();
        int i = this.f352a.f345k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f363o;
        paint2.setColorFilter(this.f368t);
        paint2.setStrokeWidth(this.f352a.f344j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f352a.f345k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f355e;
        Path path = this.f357g;
        if (z2) {
            boolean g2 = g();
            float f2 = RecyclerView.f1559A0;
            float f3 = -(g2 ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f352a.f338a;
            j e2 = kVar.e();
            c cVar = kVar.f384e;
            if (!(cVar instanceof h)) {
                cVar = new b(f3, cVar);
            }
            e2.f375e = cVar;
            c cVar2 = kVar.f385f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f3, cVar2);
            }
            e2.f376f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f3, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f386g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f3, cVar4);
            }
            e2.f377g = cVar4;
            k a2 = e2.a();
            this.f361m = a2;
            float f4 = this.f352a.i;
            RectF rectF = this.f358j;
            rectF.set(f());
            if (g()) {
                f2 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f2, f2);
            this.f366r.a(a2, f4, rectF, null, this.h);
            a(f(), path);
            this.f355e = false;
        }
        f fVar = this.f352a;
        fVar.getClass();
        if (fVar.f348n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f352a.f338a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f352a.f349o), (int) (Math.cos(Math.toRadians(d)) * this.f352a.f349o));
                if (this.f370v) {
                    RectF rectF2 = this.f369u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f352a.f348n * 2) + ((int) rectF2.width()) + width, (this.f352a.f348n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f5 = (getBounds().left - this.f352a.f348n) - width;
                    float f6 = (getBounds().top - this.f352a.f348n) - height;
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
        f fVar2 = this.f352a;
        Paint.Style style = fVar2.f350p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f338a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f363o;
        Path path = this.h;
        k kVar = this.f361m;
        RectF rectF = this.f358j;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : RecyclerView.f1559A0;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f352a.f350p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f363o.getStrokeWidth() > RecyclerView.f1559A0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f352a.f345k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f352a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f352a.getClass();
        if (this.f352a.f338a.d(f())) {
            outline.setRoundRect(getBounds(), this.f352a.f338a.f384e.a(f()) * this.f352a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f357g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            B0.c.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                B0.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            B0.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f352a.f343g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f359k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f357g;
        a(f2, path);
        Region region2 = this.f360l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f352a.f339b = new C0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f352a;
        if (fVar.f347m != f2) {
            fVar.f347m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f355e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f352a.f341e) == null || !colorStateList.isStateful())) {
            this.f352a.getClass();
            ColorStateList colorStateList3 = this.f352a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f352a.f340c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f352a;
        if (fVar.f340c != colorStateList) {
            fVar.f340c = colorStateList;
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
        if (this.f352a.f340c == null || color2 == (colorForState2 = this.f352a.f340c.getColorForState(iArr, (color2 = (paint2 = this.f362n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f352a.d == null || color == (colorForState = this.f352a.d.getColorForState(iArr, (color = (paint = this.f363o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f367s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f368t;
        f fVar = this.f352a;
        ColorStateList colorStateList = fVar.f341e;
        PorterDuff.Mode mode = fVar.f342f;
        Paint paint = this.f362n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f367s = porterDuffColorFilter;
        this.f352a.getClass();
        this.f368t = null;
        this.f352a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f367s) && Objects.equals(porterDuffColorFilter3, this.f368t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f352a;
        float f2 = fVar.f347m + RecyclerView.f1559A0;
        fVar.f348n = (int) Math.ceil(0.75f * f2);
        this.f352a.f349o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f352a = new f(this.f352a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f355e = true;
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
        f fVar = this.f352a;
        if (fVar.f345k != i) {
            fVar.f345k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f352a.getClass();
        super.invalidateSelf();
    }

    @Override // J0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f352a.f338a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f352a.f341e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f352a;
        if (fVar.f342f != mode) {
            fVar.f342f = mode;
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
        this.f353b = new t[4];
        this.f354c = new t[4];
        this.d = new BitSet(8);
        this.f356f = new Matrix();
        this.f357g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f358j = new RectF();
        this.f359k = new Region();
        this.f360l = new Region();
        Paint paint = new Paint(1);
        this.f362n = paint;
        Paint paint2 = new Paint(1);
        this.f363o = paint2;
        this.f364p = new I0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f390a;
        } else {
            mVar = new m();
        }
        this.f366r = mVar;
        this.f369u = new RectF();
        this.f370v = true;
        this.f352a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f365q = new C.g(2, this);
    }
}
