package s2;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g extends o2.j {
    public static final /* synthetic */ int M = 0;
    public f L;

    @Override // o2.j
    public final void f(Canvas canvas) {
        if (this.L.f3250q.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.L.f3250q);
        super.f(canvas);
        canvas.restore();
    }

    @Override // o2.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.L = new f(this.L);
        return this;
    }

    public final void z(float f5, float f6, float f7, float f8) {
        RectF rectF = this.L.f3250q;
        if (f5 == rectF.left && f6 == rectF.top && f7 == rectF.right && f8 == rectF.bottom) {
            return;
        }
        rectF.set(f5, f6, f7, f8);
        invalidateSelf();
    }
}
