package L0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class h extends I0.g {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f569y = 0;

    /* renamed from: x, reason: collision with root package name */
    public g f570x;

    @Override // I0.g
    public final void e(Canvas canvas) {
        if (this.f570x.f568q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f570x.f568q);
        super.e(canvas);
        canvas.restore();
    }

    @Override // I0.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f570x = new g(this.f570x);
        return this;
    }

    public final void n(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f570x.f568q;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
