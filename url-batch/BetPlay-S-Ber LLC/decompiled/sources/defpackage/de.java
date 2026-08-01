package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class de extends rt {
    public static final /* synthetic */ int M = 0;
    public ce L;

    @Override // defpackage.rt
    public final void f(Canvas canvas) {
        if (this.L.q.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.L.q);
        super.f(canvas);
        canvas.restore();
    }

    @Override // defpackage.rt, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.L = new ce(this.L);
        return this;
    }

    public final void z(float f, float f2, float f3, float f4) {
        RectF rectF = this.L.q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
