package U0;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class h extends R0.g {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f1147y = 0;

    /* renamed from: x, reason: collision with root package name */
    public g f1148x;

    @Override // R0.g
    public final void e(Canvas canvas) {
        if (this.f1148x.f1146q.isEmpty()) {
            super.e(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f1148x.f1146q);
        super.e(canvas);
        canvas.restore();
    }

    @Override // R0.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1148x = new g(this.f1148x);
        return this;
    }

    public final void n(float f2, float f3, float f4, float f5) {
        RectF rectF = this.f1148x.f1146q;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
