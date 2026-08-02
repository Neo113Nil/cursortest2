package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhi extends bhe {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.bhe
    protected final Bitmap c(bed bedVar, Bitmap bitmap, int i, int i2) {
        Bitmap a;
        Paint paint = bir.a;
        int min = Math.min(i, i2);
        float f = min;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f2 = width * max;
        float f3 = max * height;
        float f4 = (f - f2) / 2.0f;
        float f5 = (f - f3) / 2.0f;
        RectF rectF = new RectF(f4, f5, f2 + f4, f3 + f5);
        Bitmap.Config a2 = bir.a(bitmap);
        float f6 = f / 2.0f;
        if (a2.equals(bitmap.getConfig())) {
            a = bitmap;
        } else {
            a = bedVar.a(bitmap.getWidth(), bitmap.getHeight(), a2);
            new Canvas(a).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap a3 = bedVar.a(min, min, bir.a(bitmap));
        a3.setHasAlpha(true);
        bir.c.lock();
        try {
            Canvas canvas = new Canvas(a3);
            canvas.drawCircle(f6, f6, f6, bir.a);
            canvas.drawBitmap(a, (Rect) null, rectF, bir.b);
            canvas.setBitmap(null);
            bir.c.unlock();
            if (!a.equals(bitmap)) {
                bedVar.d(a);
            }
            return a3;
        } catch (Throwable th) {
            bir.c.unlock();
            throw th;
        }
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        return obj instanceof bhi;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        return 1101716364;
    }
}
