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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f8071a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f8072b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f8073c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f8074d;

    /* renamed from: e, reason: collision with root package name */
    public float f8075e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f8077h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f8078i;
    public ColorStateList j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8076f = false;
    public boolean g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f8079k = PorterDuff.Mode.SRC_IN;

    public b(ColorStateList colorStateList, float f3) {
        this.f8071a = f3;
        Paint paint = new Paint(5);
        this.f8072b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f8077h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f8077h.getDefaultColor()));
        this.f8073c = new RectF();
        this.f8074d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        float f3;
        if (rect == null) {
            rect = getBounds();
        }
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = rect.right;
        float f13 = rect.bottom;
        RectF rectF = this.f8073c;
        rectF.set(f10, f11, f12, f13);
        Rect rect2 = this.f8074d;
        rect2.set(rect);
        if (this.f8076f) {
            float f14 = this.f8075e;
            float f15 = this.f8071a;
            boolean z10 = this.g;
            if (z10) {
                f3 = (float) (((1.0d - c.f8080a) * f15) + (1.5f * f14));
            } else {
                int i3 = c.f8081b;
                f3 = 1.5f * f14;
            }
            if (z10) {
                f14 = (float) (((1.0d - c.f8080a) * f15) + f14);
            }
            rect2.inset((int) Math.ceil(f14), (int) Math.ceil(f3));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        PorterDuffColorFilter porterDuffColorFilter = this.f8078i;
        Paint paint = this.f8072b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f8078i);
            z10 = true;
        }
        RectF rectF = this.f8073c;
        float f3 = this.f8071a;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f8074d, this.f8071a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f8077h;
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
        ColorStateList colorStateList = this.f8077h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f8072b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.j;
        if (colorStateList2 == null || (mode = this.f8079k) == null) {
            return z10;
        }
        this.f8078i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.f8072b.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8072b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.f8078i = a(colorStateList, this.f8079k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f8079k = mode;
        this.f8078i = a(this.j, mode);
        invalidateSelf();
    }
}
