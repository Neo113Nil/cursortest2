package z5;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends w5.j {
    public static final /* synthetic */ int K = 0;
    public g J;

    @Override // w5.j
    public final void f(Canvas canvas) {
        if (this.J.f9195r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.J.f9195r);
        } else {
            canvas.clipRect(this.J.f9195r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    @Override // w5.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.J = new g(this.J);
        return this;
    }

    public final void t(float f6, float f8, float f9, float f10) {
        RectF rectF = this.J.f9195r;
        if (f6 == rectF.left && f8 == rectF.top && f9 == rectF.right && f10 == rectF.bottom) {
            return;
        }
        rectF.set(f6, f8, f9, f10);
        invalidateSelf();
    }
}
