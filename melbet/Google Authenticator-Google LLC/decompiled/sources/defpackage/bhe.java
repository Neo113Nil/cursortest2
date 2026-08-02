package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bhe implements bbp {
    @Override // defpackage.bbp
    public final bdv b(Context context, bdv bdvVar, int i, int i2) {
        if (!bmi.k(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        bed bedVar = azj.b(context).b;
        Bitmap bitmap = (Bitmap) bdvVar.c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap c = c(bedVar, bitmap, i, i2);
        return bitmap.equals(c) ? bdvVar : bil.g(c, bedVar);
    }

    protected abstract Bitmap c(bed bedVar, Bitmap bitmap, int i, int i2);
}
