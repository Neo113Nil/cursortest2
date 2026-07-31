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

/* loaded from: classes.dex */
class e extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f43342a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f43344c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f43345d;

    /* renamed from: e, reason: collision with root package name */
    private float f43346e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f43349h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f43350i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f43351j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f43347f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f43348g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f43352k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f43343b = new Paint(5);

    e(ColorStateList colorStateList, float f4) {
        this.f43342a = f4;
        e(colorStateList);
        this.f43344c = new RectF();
        this.f43345d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f43349h = colorStateList;
        this.f43343b.setColor(colorStateList.getColorForState(getState(), this.f43349h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f43344c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f43345d.set(rect);
        if (this.f43347f) {
            this.f43345d.inset((int) Math.ceil(f.a(this.f43346e, this.f43342a, this.f43348g)), (int) Math.ceil(f.b(this.f43346e, this.f43342a, this.f43348g)));
            this.f43344c.set(this.f43345d);
        }
    }

    public ColorStateList b() {
        return this.f43349h;
    }

    float c() {
        return this.f43346e;
    }

    public float d() {
        return this.f43342a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z4;
        Paint paint = this.f43343b;
        if (this.f43350i == null || paint.getColorFilter() != null) {
            z4 = false;
        } else {
            paint.setColorFilter(this.f43350i);
            z4 = true;
        }
        RectF rectF = this.f43344c;
        float f4 = this.f43342a;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        if (z4) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f4, boolean z4, boolean z5) {
        if (f4 == this.f43346e && this.f43347f == z4 && this.f43348g == z5) {
            return;
        }
        this.f43346e = f4;
        this.f43347f = z4;
        this.f43348g = z5;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f43345d, this.f43342a);
    }

    void h(float f4) {
        if (f4 == this.f43342a) {
            return;
        }
        this.f43342a = f4;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f43351j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f43349h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f43349h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z4 = colorForState != this.f43343b.getColor();
        if (z4) {
            this.f43343b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f43351j;
        if (colorStateList2 == null || (mode = this.f43352k) == null) {
            return z4;
        }
        this.f43350i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f43343b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f43343b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f43351j = colorStateList;
        this.f43350i = a(colorStateList, this.f43352k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f43352k = mode;
        this.f43350i = a(this.f43351j, mode);
        invalidateSelf();
    }
}
