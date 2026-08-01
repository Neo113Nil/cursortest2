package Q0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class h extends N0.g {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f1019y = 0;

    /* renamed from: x, reason: collision with root package name */
    public g f1020x;

    @Override // N0.g
    public final void e(Canvas canvas) {
        if (this.f1020x.f1018q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f1020x.f1018q);
        super.e(canvas);
        canvas.restore();
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1020x = new g(this.f1020x);
        return this;
    }

    public final void n(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f1020x.f1018q;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
