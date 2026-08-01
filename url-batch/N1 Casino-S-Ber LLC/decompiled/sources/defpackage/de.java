package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class de extends ct {
    public static final /* synthetic */ int N = 0;
    public ce M;

    @Override // defpackage.ct
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

    @Override // defpackage.ct, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.M = new ce(this.M);
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
