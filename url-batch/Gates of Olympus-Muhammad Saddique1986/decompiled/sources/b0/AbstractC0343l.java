package b0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import c0.AbstractC0357c;
import c0.C0358d;

/* renamed from: b0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0343l {
    public static final AbstractC0357c a(Bitmap bitmap) {
        ColorSpace colorSpace;
        AbstractC0357c b3;
        colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (b3 = B.b(colorSpace)) == null) ? C0358d.f5476c : b3;
    }

    public static final Bitmap b(int i3, int i4, int i5, boolean z3, AbstractC0357c abstractC0357c) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i3, i4, M.E(i5), z3, B.a(abstractC0357c));
        return createBitmap;
    }
}
