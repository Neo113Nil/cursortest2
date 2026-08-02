package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhg extends bhe {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.bhe
    protected final Bitmap c(bed bedVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        Paint paint = bir.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = i2;
        float f4 = i;
        float f5 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f = f3 / bitmap.getHeight();
            f2 = 0.0f;
            f5 = (f4 - (bitmap.getWidth() * f)) * 0.5f;
        } else {
            float width = f4 / bitmap.getWidth();
            float height = (f3 - (bitmap.getHeight() * width)) * 0.5f;
            f = width;
            f2 = height;
        }
        matrix.setScale(f, f);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (f2 + 0.5f));
        Bitmap a = bedVar.a(i, i2, bir.b(bitmap));
        bir.e(bitmap, a);
        bir.d(bitmap, a, matrix);
        if (a != null && !a.equals(bitmap) && a.getWidth() == bitmap.getWidth()) {
            a.getHeight();
            bitmap.getHeight();
        }
        return a;
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        return obj instanceof bhg;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        return -599754482;
    }
}
