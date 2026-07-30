package U1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class a extends b {

    /* renamed from: X, reason: collision with root package name */
    public final /* synthetic */ int f3242X;

    @Override // U1.b
    public final void h(Canvas canvas, Paint paint) {
        switch (this.f3242X) {
            case 0:
                if (this.f3265I != null) {
                    canvas.drawCircle(this.f3265I.centerX(), this.f3265I.centerY(), Math.min(r0.width(), this.f3265I.height()) / 2, paint);
                    break;
                }
                break;
            default:
                Rect rect = this.f3265I;
                if (rect != null) {
                    canvas.drawRect(rect, paint);
                    break;
                }
                break;
        }
    }
}
