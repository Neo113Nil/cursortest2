package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhh extends bhe {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.bhe
    protected final Bitmap c(bed bedVar, Bitmap bitmap, int i, int i2) {
        Paint paint = bir.a;
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? bir.c(bedVar, bitmap, i, i2) : bitmap;
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        return obj instanceof bhh;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        return -670243078;
    }
}
