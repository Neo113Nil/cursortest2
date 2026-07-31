package b0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import c0.AbstractC0300c;
import c0.C0301d;

/* renamed from: b0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0280m {
    public static final AbstractC0300c a(Bitmap bitmap) {
        ColorSpace colorSpace;
        AbstractC0300c b2;
        colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (b2 = AbstractC0293z.b(colorSpace)) == null) ? C0301d.f4351c : b2;
    }

    public static final Bitmap b(int i3, int i4, int i5, boolean z3, AbstractC0300c abstractC0300c) {
        Bitmap createBitmap;
        createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i3, i4, AbstractC0259J.F(i5), z3, AbstractC0293z.a(abstractC0300c));
        return createBitmap;
    }
}
