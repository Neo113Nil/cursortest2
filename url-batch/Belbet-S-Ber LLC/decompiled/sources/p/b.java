package p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f3045a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f3046b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f3047c;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public float f3048e;
    public ColorStateList h;
    public PorterDuffColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f3051j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3049f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3050g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f3052k = PorterDuff.Mode.SRC_IN;

    public b(ColorStateList colorStateList, float f5) {
        this.f3045a = f5;
        Paint paint = new Paint(5);
        this.f3046b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
        this.f3047c = new RectF();
        this.d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f5 = rect.left;
        float f6 = rect.top;
        float f7 = rect.right;
        float f8 = rect.bottom;
        RectF rectF = this.f3047c;
        rectF.set(f5, f6, f7, f8);
        Rect rect2 = this.d;
        rect2.set(rect);
        if (this.f3049f) {
            rect2.inset((int) Math.ceil(c.a(this.f3048e, this.f3045a, this.f3050g)), (int) Math.ceil(c.b(this.f3048e, this.f3045a, this.f3050g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z4;
        PorterDuffColorFilter porterDuffColorFilter = this.i;
        Paint paint = this.f3046b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z4 = false;
        } else {
            paint.setColorFilter(this.i);
            z4 = true;
        }
        RectF rectF = this.f3047c;
        float f5 = this.f3045a;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        if (z4) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.f3045a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f3051j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f3046b;
        boolean z4 = colorForState != paint.getColor();
        if (z4) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f3051j;
        if (colorStateList2 == null || (mode = this.f3052k) == null) {
            return z4;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3046b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3046b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f3051j = colorStateList;
        this.i = a(colorStateList, this.f3052k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f3052k = mode;
        this.i = a(this.f3051j, mode);
        invalidateSelf();
    }
}
