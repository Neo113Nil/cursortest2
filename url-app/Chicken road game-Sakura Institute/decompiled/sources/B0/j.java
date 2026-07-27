package B0;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f923a = new j();

    public final void a(Canvas canvas) {
        canvas.disableZ();
    }

    public final void b(Canvas canvas, int i2, BlendMode blendMode) {
        canvas.drawColor(i2, blendMode);
    }

    public final void c(Canvas canvas, long j4) {
        canvas.drawColor(j4);
    }

    public final void d(Canvas canvas, long j4, BlendMode blendMode) {
        canvas.drawColor(j4, blendMode);
    }

    public final void e(Canvas canvas, RectF rectF, float f4, float f5, RectF rectF2, float f6, float f7, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f4, f5, rectF2, f6, f7, paint);
    }

    public final void f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void h(Canvas canvas, MeasuredText measuredText, int i2, int i4, int i5, int i6, float f4, float f5, boolean z4, Paint paint) {
        canvas.drawTextRun(measuredText, i2, i4, i5, i6, f4, f5, z4, paint);
    }

    public final void i(Canvas canvas) {
        canvas.enableZ();
    }
}
