package j2;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class h extends g2.j {
    public static final /* synthetic */ int M = 0;
    public g L;

    @Override // g2.j
    public final void f(Canvas canvas) {
        if (this.L.f2312q.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.L.f2312q);
        super.f(canvas);
        canvas.restore();
    }

    @Override // g2.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.L = new g(this.L);
        return this;
    }

    public final void w(float f4, float f5, float f6, float f7) {
        RectF rectF = this.L.f2312q;
        if (f4 == rectF.left && f5 == rectF.top && f6 == rectF.right && f7 == rectF.bottom) {
            return;
        }
        rectF.set(f4, f5, f6, f7);
        invalidateSelf();
    }
}
