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
import m.C0260a;

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f334w;

    /* renamed from: a, reason: collision with root package name */
    public f f335a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f336b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f337c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f338e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f339f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f340g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f341j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f342k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f343l;

    /* renamed from: m, reason: collision with root package name */
    public k f344m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f345n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f346o;

    /* renamed from: p, reason: collision with root package name */
    public final I0.a f347p;

    /* renamed from: q, reason: collision with root package name */
    public final C.g f348q;

    /* renamed from: r, reason: collision with root package name */
    public final m f349r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f350s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f351t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f352u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f353v;

    static {
        Paint paint = new Paint(1);
        f334w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f335a;
        this.f349r.a(fVar.f321a, fVar.i, rectF, this.f348q, path);
        if (this.f335a.h != 1.0f) {
            Matrix matrix = this.f339f;
            matrix.reset();
            float f2 = this.f335a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f352u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f335a;
        float f2 = fVar.f330m + RecyclerView.f1530C0 + fVar.f329l;
        C0.a aVar = fVar.f322b;
        if (aVar == null || !aVar.f129a || C.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f132e <= RecyclerView.f1530C0 || f2 <= RecyclerView.f1530C0) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int m2 = C0260a.m(C.a.d(i, 255), aVar.f130b, min);
        if (min > RecyclerView.f1530C0 && (i2 = aVar.f131c) != 0) {
            m2 = C.a.b(C.a.d(i2, C0.a.f128f), m2);
        }
        return C.a.d(m2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f335a.f332o;
        Path path = this.f340g;
        I0.a aVar = this.f347p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f307a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f336b[i2];
            int i3 = this.f335a.f331n;
            Matrix matrix = t.f395b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f337c[i2].a(matrix, aVar, this.f335a.f331n, canvas);
        }
        if (this.f353v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f335a.f332o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f335a.f332o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f334w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f368f.a(rectF) * this.f335a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f345n;
        paint.setColorFilter(this.f350s);
        int alpha = paint.getAlpha();
        int i = this.f335a.f328k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f346o;
        paint2.setColorFilter(this.f351t);
        paint2.setStrokeWidth(this.f335a.f327j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f335a.f328k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f338e;
        Path path = this.f340g;
        if (z2) {
            boolean g2 = g();
            float f2 = RecyclerView.f1530C0;
            float f3 = -(g2 ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f335a.f321a;
            j e2 = kVar.e();
            c cVar = kVar.f367e;
            if (!(cVar instanceof h)) {
                cVar = new b(f3, cVar);
            }
            e2.f358e = cVar;
            c cVar2 = kVar.f368f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f3, cVar2);
            }
            e2.f359f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f3, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f369g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f3, cVar4);
            }
            e2.f360g = cVar4;
            k a2 = e2.a();
            this.f344m = a2;
            float f4 = this.f335a.i;
            RectF rectF = this.f341j;
            rectF.set(f());
            if (g()) {
                f2 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f2, f2);
            this.f349r.a(a2, f4, rectF, null, this.h);
            a(f(), path);
            this.f338e = false;
        }
        f fVar = this.f335a;
        fVar.getClass();
        if (fVar.f331n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f335a.f321a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f335a.f332o), (int) (Math.cos(Math.toRadians(d)) * this.f335a.f332o));
                if (this.f353v) {
                    RectF rectF2 = this.f352u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f335a.f331n * 2) + ((int) rectF2.width()) + width, (this.f335a.f331n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f5 = (getBounds().left - this.f335a.f331n) - width;
                    float f6 = (getBounds().top - this.f335a.f331n) - height;
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
        f fVar2 = this.f335a;
        Paint.Style style = fVar2.f333p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f321a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f346o;
        Path path = this.h;
        k kVar = this.f344m;
        RectF rectF = this.f341j;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : RecyclerView.f1530C0;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f335a.f333p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f346o.getStrokeWidth() > RecyclerView.f1530C0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f335a.f328k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f335a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f335a.getClass();
        if (this.f335a.f321a.d(f())) {
            outline.setRoundRect(getBounds(), this.f335a.f321a.f367e.a(f()) * this.f335a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f340g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            B0.d.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                B0.b.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            B0.b.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f335a.f326g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f342k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f340g;
        a(f2, path);
        Region region2 = this.f343l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f335a.f322b = new C0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f335a;
        if (fVar.f330m != f2) {
            fVar.f330m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f338e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f335a.f324e) == null || !colorStateList.isStateful())) {
            this.f335a.getClass();
            ColorStateList colorStateList3 = this.f335a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f335a.f323c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f335a;
        if (fVar.f323c != colorStateList) {
            fVar.f323c = colorStateList;
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
        if (this.f335a.f323c == null || color2 == (colorForState2 = this.f335a.f323c.getColorForState(iArr, (color2 = (paint2 = this.f345n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f335a.d == null || color == (colorForState = this.f335a.d.getColorForState(iArr, (color = (paint = this.f346o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f350s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f351t;
        f fVar = this.f335a;
        ColorStateList colorStateList = fVar.f324e;
        PorterDuff.Mode mode = fVar.f325f;
        Paint paint = this.f345n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f350s = porterDuffColorFilter;
        this.f335a.getClass();
        this.f351t = null;
        this.f335a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f350s) && Objects.equals(porterDuffColorFilter3, this.f351t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f335a;
        float f2 = fVar.f330m + RecyclerView.f1530C0;
        fVar.f331n = (int) Math.ceil(0.75f * f2);
        this.f335a.f332o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f335a = new f(this.f335a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f338e = true;
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
        f fVar = this.f335a;
        if (fVar.f328k != i) {
            fVar.f328k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f335a.getClass();
        super.invalidateSelf();
    }

    @Override // J0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f335a.f321a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f335a.f324e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f335a;
        if (fVar.f325f != mode) {
            fVar.f325f = mode;
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
        this.f336b = new t[4];
        this.f337c = new t[4];
        this.d = new BitSet(8);
        this.f339f = new Matrix();
        this.f340g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f341j = new RectF();
        this.f342k = new Region();
        this.f343l = new Region();
        Paint paint = new Paint(1);
        this.f345n = paint;
        Paint paint2 = new Paint(1);
        this.f346o = paint2;
        this.f347p = new I0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f373a;
        } else {
            mVar = new m();
        }
        this.f349r = mVar;
        this.f352u = new RectF();
        this.f353v = true;
        this.f335a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f348q = new C.g(2, this);
    }
}
