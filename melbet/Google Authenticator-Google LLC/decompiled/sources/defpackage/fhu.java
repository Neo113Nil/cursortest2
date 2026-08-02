package defpackage;

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

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fhu extends Drawable {
    public final Paint a;
    public float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public fog h;
    private int o;
    private ColorStateList p;
    private final foi i = foh.a;
    private final Path j = new Path();
    private final Rect k = new Rect();
    private final RectF l = new RectF();
    private final RectF m = new RectF();
    private final fht n = new fht(this);
    public boolean g = true;

    public fhu(fog fogVar) {
        this.h = fogVar;
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    protected final RectF a() {
        RectF rectF = this.m;
        rectF.set(getBounds());
        return rectF;
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.o = colorStateList.getColorForState(getState(), this.o);
        }
        this.p = colorStateList;
        this.g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g) {
            Paint paint = this.a;
            copyBounds(this.k);
            float height = this.b / r2.height();
            paint.setShader(new LinearGradient(0.0f, r2.top, 0.0f, r2.bottom, new int[]{va.b(this.c, this.o), va.b(this.d, this.o), va.b(va.c(this.d, 0), this.o), va.b(va.c(this.f, 0), this.o), va.b(this.f, this.o), va.b(this.e, this.o)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.g = false;
        }
        Paint paint2 = this.a;
        float strokeWidth = paint2.getStrokeWidth() / 2.0f;
        Rect rect = this.k;
        copyBounds(rect);
        RectF rectF = this.l;
        rectF.set(rect);
        float min = Math.min(this.h.b.a(a()), rectF.width() / 2.0f);
        if (this.h.g(a())) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.b > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.h.g(a())) {
            outline.setRoundRect(getBounds(), this.h.b.a(a()));
            return;
        }
        Rect rect = this.k;
        copyBounds(rect);
        RectF rectF = this.l;
        rectF.set(rect);
        foi foiVar = this.i;
        fog fogVar = this.h;
        Path path = this.j;
        foiVar.c(fogVar, null, 1.0f, rectF, null, path);
        fhr.d(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        if (!this.h.g(a())) {
            return true;
        }
        int round = Math.round(this.b);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.g = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.o)) != this.o) {
            this.g = true;
            this.o = colorForState;
        }
        if (this.g) {
            invalidateSelf();
        }
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
