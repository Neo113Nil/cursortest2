package o2;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class g extends l2.j {
    public static final /* synthetic */ int M = 0;
    public f L;

    @Override // l2.j
    public final void g(Canvas canvas) {
        if (this.L.f2889r.isEmpty()) {
            super.g(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.L.f2889r);
        } else {
            canvas.clipRect(this.L.f2889r, Region.Op.DIFFERENCE);
        }
        super.g(canvas);
        canvas.restore();
    }

    @Override // l2.j, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.L = new f(this.L);
        return this;
    }

    public final void y(float f2, float f4, float f5, float f6) {
        RectF rectF = this.L.f2889r;
        if (f2 == rectF.left && f4 == rectF.top && f5 == rectF.right && f6 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f4, f5, f6);
        invalidateSelf();
    }
}
