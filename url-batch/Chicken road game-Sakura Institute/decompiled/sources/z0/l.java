package z0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class l {
    public static final a1.c a(Bitmap bitmap) {
        ColorSpace colorSpace;
        a1.c b9;
        colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (b9 = a0.b(colorSpace)) == null) ? a1.d.f220c : b9;
    }

    public static final Bitmap b(int i7, int i8, int i9, boolean z8, a1.c cVar) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i7, i8, l0.x(i9), z8, a0.a(cVar));
        return createBitmap;
    }
}
