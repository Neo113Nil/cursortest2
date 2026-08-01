package g2;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import b4.l;
import o2.o;
import o2.p;
import o2.q;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1876b;
    public float h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f1881j;

    /* renamed from: k, reason: collision with root package name */
    public int f1882k;

    /* renamed from: l, reason: collision with root package name */
    public int f1883l;

    /* renamed from: m, reason: collision with root package name */
    public int f1884m;

    /* renamed from: o, reason: collision with root package name */
    public o f1886o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f1887p;

    /* renamed from: a, reason: collision with root package name */
    public final q f1875a = p.f2993a;

    /* renamed from: c, reason: collision with root package name */
    public final Path f1877c = new Path();
    public final Rect d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f1878e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f1879f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final a f1880g = new a(this);

    /* renamed from: n, reason: collision with root package name */
    public boolean f1885n = true;

    public b(o oVar) {
        this.f1886o = oVar;
        Paint paint = new Paint(1);
        this.f1876b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z4 = this.f1885n;
        Rect rect = this.d;
        Paint paint = this.f1876b;
        if (z4) {
            copyBounds(rect);
            float height = this.h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{f0.a.b(this.i, this.f1884m), f0.a.b(this.f1881j, this.f1884m), f0.a.b(f0.a.d(this.f1881j, 0), this.f1884m), f0.a.b(f0.a.d(this.f1883l, 0), this.f1884m), f0.a.b(this.f1883l, this.f1884m), f0.a.b(this.f1882k, this.f1884m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f1885n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f1878e;
        rectF.set(rect);
        o2.d dVar = this.f1886o.f2987e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f1879f;
        rectF2.set(bounds);
        float min = Math.min(dVar.a(rectF2), rectF.width() / 2.0f);
        o oVar = this.f1886o;
        rectF2.set(getBounds());
        if (oVar.j(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1880g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        o oVar = this.f1886o;
        Rect bounds = getBounds();
        RectF rectF = this.f1879f;
        rectF.set(bounds);
        if (oVar.j(rectF)) {
            o2.d dVar = this.f1886o.f2987e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), dVar.a(rectF));
            return;
        }
        Rect rect = this.d;
        copyBounds(rect);
        RectF rectF2 = this.f1878e;
        rectF2.set(rect);
        o oVar2 = this.f1886o;
        q qVar = this.f1875a;
        Path path = this.f1877c;
        qVar.a(oVar2, null, 1.0f, rectF2, null, path);
        l.e0(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        o oVar = this.f1886o;
        Rect bounds = getBounds();
        RectF rectF = this.f1879f;
        rectF.set(bounds);
        if (!oVar.j(rectF)) {
            return true;
        }
        int round = Math.round(this.h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f1887p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1885n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f1887p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f1884m)) != this.f1884m) {
            this.f1885n = true;
            this.f1884m = colorForState;
        }
        if (this.f1885n) {
            invalidateSelf();
        }
        return this.f1885n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f1876b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1876b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
