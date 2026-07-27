package B0;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f925a = new n();

    public final void a(Canvas canvas, int[] iArr, int i2, float[] fArr, int i4, int i5, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i2, fArr, i4, i5, font, paint);
    }

    public final void b(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public final void c(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
