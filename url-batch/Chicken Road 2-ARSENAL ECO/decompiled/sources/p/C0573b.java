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

/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0573b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f5641a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f5642b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f5643c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f5644d;

    /* renamed from: e, reason: collision with root package name */
    public float f5645e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f5648h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f5649i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f5650j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5646f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5647g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f5651k = PorterDuff.Mode.SRC_IN;

    public C0573b(ColorStateList colorStateList, float f7) {
        this.f5641a = f7;
        Paint paint = new Paint(5);
        this.f5642b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f5648h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f5648h.getDefaultColor()));
        this.f5643c = new RectF();
        this.f5644d = new Rect();
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
        RectF rectF = this.f5643c;
        rectF.set(f7, f8, f9, f10);
        Rect rect2 = this.f5644d;
        rect2.set(rect);
        if (this.f5646f) {
            rect2.inset((int) Math.ceil(AbstractC0574c.a(this.f5645e, this.f5641a, this.f5647g)), (int) Math.ceil(AbstractC0574c.b(this.f5645e, this.f5641a, this.f5647g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z5;
        PorterDuffColorFilter porterDuffColorFilter = this.f5649i;
        Paint paint = this.f5642b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z5 = false;
        } else {
            paint.setColorFilter(this.f5649i);
            z5 = true;
        }
        RectF rectF = this.f5643c;
        float f7 = this.f5641a;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        if (z5) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f5644d, this.f5641a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f5650j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f5648h;
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
        ColorStateList colorStateList = this.f5648h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f5642b;
        boolean z5 = colorForState != paint.getColor();
        if (z5) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f5650j;
        if (colorStateList2 == null || (mode = this.f5651k) == null) {
            return z5;
        }
        this.f5649i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.f5642b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5642b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f5650j = colorStateList;
        this.f5649i = a(colorStateList, this.f5651k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f5651k = mode;
        this.f5649i = a(this.f5650j, mode);
        invalidateSelf();
    }
}
