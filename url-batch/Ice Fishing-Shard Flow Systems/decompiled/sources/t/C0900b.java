package t;

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

/* renamed from: t.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0900b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f7873a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f7874b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f7875c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f7876d;

    /* renamed from: e, reason: collision with root package name */
    public float f7877e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f7880h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f7881i;
    public ColorStateList j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7878f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7879g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f7882k = PorterDuff.Mode.SRC_IN;

    public C0900b(ColorStateList colorStateList, float f7) {
        this.f7873a = f7;
        Paint paint = new Paint(5);
        this.f7874b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f7880h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f7880h.getDefaultColor()));
        this.f7875c = new RectF();
        this.f7876d = new Rect();
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
        float f7 = rect.left;
        float f8 = rect.top;
        float f9 = rect.right;
        float f10 = rect.bottom;
        RectF rectF = this.f7875c;
        rectF.set(f7, f8, f9, f10);
        Rect rect2 = this.f7876d;
        rect2.set(rect);
        if (this.f7878f) {
            rect2.inset((int) Math.ceil(AbstractC0901c.a(this.f7877e, this.f7873a, this.f7879g)), (int) Math.ceil(AbstractC0901c.b(this.f7877e, this.f7873a, this.f7879g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z7;
        PorterDuffColorFilter porterDuffColorFilter = this.f7881i;
        Paint paint = this.f7874b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z7 = false;
        } else {
            paint.setColorFilter(this.f7881i);
            z7 = true;
        }
        RectF rectF = this.f7875c;
        float f7 = this.f7873a;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (z7) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f7876d, this.f7873a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f7880h;
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
        ColorStateList colorStateList = this.f7880h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f7874b;
        boolean z7 = colorForState != paint.getColor();
        if (z7) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.f7882k) == null) {
            return z7;
        }
        this.f7881i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f7874b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7874b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f7881i = a(colorStateList, this.f7882k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f7882k = mode;
        this.f7881i = a(this.j, mode);
        invalidateSelf();
    }
}
