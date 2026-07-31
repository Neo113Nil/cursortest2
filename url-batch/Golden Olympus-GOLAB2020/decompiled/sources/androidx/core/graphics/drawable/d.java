package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final Bitmap f11790a;

    /* renamed from: b, reason: collision with root package name */
    private int f11791b;

    /* renamed from: e, reason: collision with root package name */
    private final BitmapShader f11794e;

    /* renamed from: g, reason: collision with root package name */
    private float f11796g;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11800k;

    /* renamed from: l, reason: collision with root package name */
    private int f11801l;

    /* renamed from: m, reason: collision with root package name */
    private int f11802m;

    /* renamed from: c, reason: collision with root package name */
    private int f11792c = 119;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f11793d = new Paint(3);

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f11795f = new Matrix();

    /* renamed from: h, reason: collision with root package name */
    final Rect f11797h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private final RectF f11798i = new RectF();

    /* renamed from: j, reason: collision with root package name */
    private boolean f11799j = true;

    d(Resources resources, Bitmap bitmap) {
        this.f11791b = 160;
        if (resources != null) {
            this.f11791b = resources.getDisplayMetrics().densityDpi;
        }
        this.f11790a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f11794e = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f11802m = -1;
            this.f11801l = -1;
            this.f11794e = null;
        }
    }

    private void a() {
        this.f11801l = this.f11790a.getScaledWidth(this.f11791b);
        this.f11802m = this.f11790a.getScaledHeight(this.f11791b);
    }

    private static boolean d(float f4) {
        return f4 > 0.05f;
    }

    private void g() {
        this.f11796g = Math.min(this.f11802m, this.f11801l) / 2;
    }

    public float b() {
        return this.f11796g;
    }

    abstract void c(int i4, int i5, int i6, Rect rect, Rect rect2);

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f11790a;
        if (bitmap == null) {
            return;
        }
        h();
        if (this.f11793d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f11797h, this.f11793d);
            return;
        }
        RectF rectF = this.f11798i;
        float f4 = this.f11796g;
        canvas.drawRoundRect(rectF, f4, f4, this.f11793d);
    }

    public void e(boolean z4) {
        this.f11800k = z4;
        this.f11799j = true;
        if (!z4) {
            f(0.0f);
            return;
        }
        g();
        this.f11793d.setShader(this.f11794e);
        invalidateSelf();
    }

    public void f(float f4) {
        if (this.f11796g == f4) {
            return;
        }
        this.f11800k = false;
        if (d(f4)) {
            this.f11793d.setShader(this.f11794e);
        } else {
            this.f11793d.setShader(null);
        }
        this.f11796g = f4;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f11793d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f11793d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f11802m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f11801l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f11792c != 119 || this.f11800k || (bitmap = this.f11790a) == null || bitmap.hasAlpha() || this.f11793d.getAlpha() < 255 || d(this.f11796g)) ? -3 : -1;
    }

    void h() {
        d dVar;
        if (this.f11799j) {
            if (this.f11800k) {
                int min = Math.min(this.f11801l, this.f11802m);
                dVar = this;
                dVar.c(this.f11792c, min, min, getBounds(), this.f11797h);
                int min2 = Math.min(dVar.f11797h.width(), dVar.f11797h.height());
                dVar.f11797h.inset(Math.max(0, (dVar.f11797h.width() - min2) / 2), Math.max(0, (dVar.f11797h.height() - min2) / 2));
                dVar.f11796g = min2 * 0.5f;
            } else {
                dVar = this;
                dVar.c(dVar.f11792c, dVar.f11801l, dVar.f11802m, getBounds(), dVar.f11797h);
            }
            dVar.f11798i.set(dVar.f11797h);
            if (dVar.f11794e != null) {
                Matrix matrix = dVar.f11795f;
                RectF rectF = dVar.f11798i;
                matrix.setTranslate(rectF.left, rectF.top);
                dVar.f11795f.preScale(dVar.f11798i.width() / dVar.f11790a.getWidth(), dVar.f11798i.height() / dVar.f11790a.getHeight());
                dVar.f11794e.setLocalMatrix(dVar.f11795f);
                dVar.f11793d.setShader(dVar.f11794e);
            }
            dVar.f11799j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f11800k) {
            g();
        }
        this.f11799j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        if (i4 != this.f11793d.getAlpha()) {
            this.f11793d.setAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11793d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z4) {
        this.f11793d.setDither(z4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z4) {
        this.f11793d.setFilterBitmap(z4);
        invalidateSelf();
    }
}
