package b2;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1282a = new h();

    public final boolean a(Canvas canvas, Path path) {
        boolean clipOutPath;
        clipOutPath = canvas.clipOutPath(path);
        return clipOutPath;
    }

    public final boolean b(Canvas canvas, float f9, float f10, float f11, float f12) {
        boolean clipOutRect;
        clipOutRect = canvas.clipOutRect(f9, f10, f11, f12);
        return clipOutRect;
    }

    public final boolean c(Canvas canvas, int i7, int i8, int i9, int i10) {
        boolean clipOutRect;
        clipOutRect = canvas.clipOutRect(i7, i8, i9, i10);
        return clipOutRect;
    }

    public final boolean d(Canvas canvas, Rect rect) {
        boolean clipOutRect;
        clipOutRect = canvas.clipOutRect(rect);
        return clipOutRect;
    }

    public final boolean e(Canvas canvas, RectF rectF) {
        boolean clipOutRect;
        clipOutRect = canvas.clipOutRect(rectF);
        return clipOutRect;
    }
}
