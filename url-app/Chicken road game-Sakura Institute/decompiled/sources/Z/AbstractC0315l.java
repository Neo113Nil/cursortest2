package Z;

import a0.AbstractC0348c;
import a0.C0349d;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* renamed from: Z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0315l {
    public static final AbstractC0348c a(Bitmap bitmap) {
        AbstractC0348c b4;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (b4 = y.b(colorSpace)) == null) ? C0349d.f4763c : b4;
    }

    public static final Bitmap b(int i2, int i4, int i5, boolean z4, AbstractC0348c abstractC0348c) {
        return Bitmap.createBitmap((DisplayMetrics) null, i2, i4, K.E(i5), z4, y.a(abstractC0348c));
    }
}
