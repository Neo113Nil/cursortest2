package R0;

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

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f916w;

    /* renamed from: a, reason: collision with root package name */
    public f f917a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f918b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f919c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f920e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f921f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f922g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f923j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f924k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f925l;

    /* renamed from: m, reason: collision with root package name */
    public k f926m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f927n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f928o;

    /* renamed from: p, reason: collision with root package name */
    public final Q0.a f929p;

    /* renamed from: q, reason: collision with root package name */
    public final A0.c f930q;

    /* renamed from: r, reason: collision with root package name */
    public final m f931r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f932s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f933t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f934u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f935v;

    static {
        Paint paint = new Paint(1);
        f916w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f917a;
        this.f931r.a(fVar.f903a, fVar.i, rectF, this.f930q, path);
        if (this.f917a.h != 1.0f) {
            Matrix matrix = this.f921f;
            matrix.reset();
            float f2 = this.f917a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f934u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f917a;
        float f2 = fVar.f912m + RecyclerView.f1937A0 + fVar.f911l;
        K0.a aVar = fVar.f904b;
        if (aVar == null || !aVar.f679a || C.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f682e <= RecyclerView.f1937A0 || f2 <= RecyclerView.f1937A0) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int Q2 = H1.l.Q(min, C.a.d(i, 255), aVar.f680b);
        if (min > RecyclerView.f1937A0 && (i2 = aVar.f681c) != 0) {
            Q2 = C.a.b(C.a.d(i2, K0.a.f678f), Q2);
        }
        return C.a.d(Q2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f917a.f914o;
        Path path = this.f922g;
        Q0.a aVar = this.f929p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f891a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f918b[i2];
            int i3 = this.f917a.f913n;
            Matrix matrix = t.f977b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f919c[i2].a(matrix, aVar, this.f917a.f913n, canvas);
        }
        if (this.f935v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f917a.f914o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f917a.f914o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f916w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f950f.a(rectF) * this.f917a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f927n;
        paint.setColorFilter(this.f932s);
        int alpha = paint.getAlpha();
        int i = this.f917a.f910k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f928o;
        paint2.setColorFilter(this.f933t);
        paint2.setStrokeWidth(this.f917a.f909j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f917a.f910k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f920e;
        Path path = this.f922g;
        if (z2) {
            boolean g2 = g();
            float f2 = RecyclerView.f1937A0;
            float f3 = -(g2 ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f917a.f903a;
            j e2 = kVar.e();
            c cVar = kVar.f949e;
            if (!(cVar instanceof h)) {
                cVar = new b(f3, cVar);
            }
            e2.f940e = cVar;
            c cVar2 = kVar.f950f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f3, cVar2);
            }
            e2.f941f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f3, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f951g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f3, cVar4);
            }
            e2.f942g = cVar4;
            k a2 = e2.a();
            this.f926m = a2;
            float f4 = this.f917a.i;
            RectF rectF = this.f923j;
            rectF.set(f());
            if (g()) {
                f2 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f2, f2);
            this.f931r.a(a2, f4, rectF, null, this.h);
            a(f(), path);
            this.f920e = false;
        }
        f fVar = this.f917a;
        fVar.getClass();
        if (fVar.f913n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f917a.f903a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f917a.f914o), (int) (Math.cos(Math.toRadians(d)) * this.f917a.f914o));
                if (this.f935v) {
                    RectF rectF2 = this.f934u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f917a.f913n * 2) + ((int) rectF2.width()) + width, (this.f917a.f913n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f5 = (getBounds().left - this.f917a.f913n) - width;
                    float f6 = (getBounds().top - this.f917a.f913n) - height;
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
        f fVar2 = this.f917a;
        Paint.Style style = fVar2.f915p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f903a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f928o;
        Path path = this.h;
        k kVar = this.f926m;
        RectF rectF = this.f923j;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : RecyclerView.f1937A0;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f917a.f915p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f928o.getStrokeWidth() > RecyclerView.f1937A0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f917a.f910k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f917a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f917a.getClass();
        if (this.f917a.f903a.d(f())) {
            outline.setRoundRect(getBounds(), this.f917a.f903a.f949e.a(f()) * this.f917a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f922g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            J0.c.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                J0.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            J0.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f917a.f908g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f924k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f922g;
        a(f2, path);
        Region region2 = this.f925l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f917a.f904b = new K0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f917a;
        if (fVar.f912m != f2) {
            fVar.f912m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f920e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f917a.f906e) == null || !colorStateList.isStateful())) {
            this.f917a.getClass();
            ColorStateList colorStateList3 = this.f917a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f917a.f905c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f917a;
        if (fVar.f905c != colorStateList) {
            fVar.f905c = colorStateList;
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
        if (this.f917a.f905c == null || color2 == (colorForState2 = this.f917a.f905c.getColorForState(iArr, (color2 = (paint2 = this.f927n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f917a.d == null || color == (colorForState = this.f917a.d.getColorForState(iArr, (color = (paint = this.f928o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f932s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f933t;
        f fVar = this.f917a;
        ColorStateList colorStateList = fVar.f906e;
        PorterDuff.Mode mode = fVar.f907f;
        Paint paint = this.f927n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f932s = porterDuffColorFilter;
        this.f917a.getClass();
        this.f933t = null;
        this.f917a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f932s) && Objects.equals(porterDuffColorFilter3, this.f933t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f917a;
        float f2 = fVar.f912m + RecyclerView.f1937A0;
        fVar.f913n = (int) Math.ceil(0.75f * f2);
        this.f917a.f914o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f917a = new f(this.f917a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f920e = true;
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
        f fVar = this.f917a;
        if (fVar.f910k != i) {
            fVar.f910k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f917a.getClass();
        super.invalidateSelf();
    }

    @Override // R0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f917a.f903a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f917a.f906e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f917a;
        if (fVar.f907f != mode) {
            fVar.f907f = mode;
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
        this.f918b = new t[4];
        this.f919c = new t[4];
        this.d = new BitSet(8);
        this.f921f = new Matrix();
        this.f922g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f923j = new RectF();
        this.f924k = new Region();
        this.f925l = new Region();
        Paint paint = new Paint(1);
        this.f927n = paint;
        Paint paint2 = new Paint(1);
        this.f928o = paint2;
        this.f929p = new Q0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f955a;
        } else {
            mVar = new m();
        }
        this.f931r = mVar;
        this.f934u = new RectF();
        this.f935v = true;
        this.f917a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f930q = new A0.c(14, this);
    }
}
