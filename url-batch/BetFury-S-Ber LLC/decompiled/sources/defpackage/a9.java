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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class a9 extends Drawable {
    public final Paint b;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public gd0 o;
    public ColorStateList p;
    public final id0 a = hd0.a;
    public final Path c = new Path();
    public final Rect d = new Rect();
    public final RectF e = new RectF();
    public final RectF f = new RectF();
    public final j3 g = new j3(this);
    public boolean n = true;

    public a9(gd0 gd0Var) {
        this.o = gd0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.n;
        Rect rect = this.d;
        Paint paint = this.b;
        if (z) {
            copyBounds(rect);
            float height = this.h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{fd.b(this.i, this.m), fd.b(this.j, this.m), fd.b(fd.d(this.j, 0), this.m), fd.b(fd.d(this.l, 0), this.m), fd.b(this.l, this.m), fd.b(this.k, this.m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.e;
        rectF.set(rect);
        ng ngVar = this.o.e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f;
        rectF2.set(bounds);
        float min = Math.min(ngVar.a(rectF2), rectF.width() / 2.0f);
        gd0 gd0Var = this.o;
        rectF2.set(getBounds());
        if (gd0Var.j(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        gd0 gd0Var = this.o;
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        if (gd0Var.j(rectF)) {
            ng ngVar = this.o.e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), ngVar.a(rectF));
            return;
        }
        Rect rect = this.d;
        copyBounds(rect);
        RectF rectF2 = this.e;
        rectF2.set(rect);
        gd0 gd0Var2 = this.o;
        id0 id0Var = this.a;
        Path path = this.c;
        id0Var.a(gd0Var2, null, 1.0f, rectF2, null, path);
        bi.X(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        gd0 gd0Var = this.o;
        Rect bounds = getBounds();
        RectF rectF = this.f;
        rectF.set(bounds);
        if (!gd0Var.j(rectF)) {
            return true;
        }
        int round = Math.round(this.h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.m)) != this.m) {
            this.n = true;
            this.m = colorForState;
        }
        if (this.n) {
            invalidateSelf();
        }
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
