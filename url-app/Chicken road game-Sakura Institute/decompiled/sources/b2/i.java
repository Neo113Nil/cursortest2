package b2;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1283a = new i();

    public final void a(Canvas canvas) {
        canvas.disableZ();
    }

    public final void b(Canvas canvas, int i7, BlendMode blendMode) {
        canvas.drawColor(i7, blendMode);
    }

    public final void c(Canvas canvas, long j8) {
        canvas.drawColor(j8);
    }

    public final void d(Canvas canvas, long j8, BlendMode blendMode) {
        canvas.drawColor(j8, blendMode);
    }

    public final void e(Canvas canvas, RectF rectF, float f9, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f9, f10, rectF2, f11, f12, paint);
    }

    public final void f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void h(Canvas canvas, MeasuredText measuredText, int i7, int i8, int i9, int i10, float f9, float f10, boolean z8, Paint paint) {
        canvas.drawTextRun(measuredText, i7, i8, i9, i10, f9, f10, z8, paint);
    }

    public final void i(Canvas canvas) {
        canvas.enableZ();
    }
}
