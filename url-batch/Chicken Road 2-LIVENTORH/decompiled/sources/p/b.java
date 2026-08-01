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

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f2996a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f2997b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f2998c;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public float f2999e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f3002h;
    public PorterDuffColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f3003j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3000f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3001g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f3004k = PorterDuff.Mode.SRC_IN;

    public b(ColorStateList colorStateList, float f2) {
        this.f2996a = f2;
        Paint paint = new Paint(5);
        this.f2997b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f3002h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f3002h.getDefaultColor()));
        this.f2998c = new RectF();
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
        float f2 = rect.left;
        float f4 = rect.top;
        float f5 = rect.right;
        float f6 = rect.bottom;
        RectF rectF = this.f2998c;
        rectF.set(f2, f4, f5, f6);
        Rect rect2 = this.d;
        rect2.set(rect);
        if (this.f3000f) {
            rect2.inset((int) Math.ceil(c.a(this.f2999e, this.f2996a, this.f3001g)), (int) Math.ceil(c.b(this.f2999e, this.f2996a, this.f3001g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z3;
        PorterDuffColorFilter porterDuffColorFilter = this.i;
        Paint paint = this.f2997b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z3 = false;
        } else {
            paint.setColorFilter(this.i);
            z3 = true;
        }
        RectF rectF = this.f2998c;
        float f2 = this.f2996a;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        if (z3) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.d, this.f2996a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f3003j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f3002h;
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
        ColorStateList colorStateList = this.f3002h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f2997b;
        boolean z3 = colorForState != paint.getColor();
        if (z3) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f3003j;
        if (colorStateList2 == null || (mode = this.f3004k) == null) {
            return z3;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f2997b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2997b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f3003j = colorStateList;
        this.i = a(colorStateList, this.f3004k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f3004k = mode;
        this.i = a(this.f3003j, mode);
        invalidateSelf();
    }
}
