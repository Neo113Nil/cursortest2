package r;

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

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4951a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f40187a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f40188b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f40189c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f40190d;

    /* renamed from: e, reason: collision with root package name */
    public float f40191e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f40194h;
    public PorterDuffColorFilter i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f40195j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40192f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40193g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f40196k = PorterDuff.Mode.SRC_IN;

    public C4951a(ColorStateList colorStateList, float f6) {
        this.f40187a = f6;
        Paint paint = new Paint(5);
        this.f40188b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f40194h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f40194h.getDefaultColor()));
        this.f40189c = new RectF();
        this.f40190d = new Rect();
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
        RectF rectF = this.f40189c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f40190d;
        rect2.set(rect);
        if (this.f40192f) {
            rect2.inset((int) Math.ceil(b.a(this.f40191e, this.f40187a, this.f40193g)), (int) Math.ceil(b.b(this.f40191e, this.f40187a, this.f40193g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z8;
        Paint paint = this.f40188b;
        if (this.i == null || paint.getColorFilter() != null) {
            z8 = false;
        } else {
            paint.setColorFilter(this.i);
            z8 = true;
        }
        RectF rectF = this.f40189c;
        float f6 = this.f40187a;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        if (z8) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f40190d, this.f40187a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f40195j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f40194h;
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
        ColorStateList colorStateList = this.f40194h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f40188b;
        boolean z8 = colorForState != paint.getColor();
        if (z8) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f40195j;
        if (colorStateList2 == null || (mode = this.f40196k) == null) {
            return z8;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f40188b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40188b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f40195j = colorStateList;
        this.i = a(colorStateList, this.f40196k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f40196k = mode;
        this.i = a(this.f40195j, mode);
        invalidateSelf();
    }
}
