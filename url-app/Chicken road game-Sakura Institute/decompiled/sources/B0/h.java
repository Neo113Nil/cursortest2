package B0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f922a = new h();

    public final boolean a(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public final boolean b(Canvas canvas, float f4, float f5, float f6, float f7) {
        return canvas.clipOutRect(f4, f5, f6, f7);
    }

    public final boolean c(Canvas canvas, int i2, int i4, int i5, int i6) {
        return canvas.clipOutRect(i2, i4, i5, i6);
    }

    public final boolean d(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean e(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}
