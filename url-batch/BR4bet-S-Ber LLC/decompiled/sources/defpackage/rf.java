package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class rf extends dw {
    public static final /* synthetic */ int N = 0;
    public qf M;

    @Override // defpackage.dw
    public final void f(Canvas canvas) {
        if (this.M.q.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.M.q);
        super.f(canvas);
        canvas.restore();
    }

    @Override // defpackage.dw, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.M = new qf(this.M);
        return this;
    }

    public final void z(float f, float f2, float f3, float f4) {
        RectF rectF = this.M.q;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}
