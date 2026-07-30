package B1;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import s1.InterfaceC4992e;
import v1.InterfaceC5117a;

/* renamed from: B1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266h extends AbstractC0263e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f97b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC4992e.f40420a);

    @Override // s1.InterfaceC4992e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f97b);
    }

    @Override // B1.AbstractC0263e
    public final Bitmap c(InterfaceC5117a interfaceC5117a, Bitmap bitmap, int i, int i4) {
        float width;
        float height;
        Paint paint = B.f69a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i4) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f6 = 0.0f;
        if (bitmap.getWidth() * i4 > bitmap.getHeight() * i) {
            width = i4 / bitmap.getHeight();
            f6 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i4 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f6 + 0.5f), (int) (height + 0.5f));
        Bitmap l9 = interfaceC5117a.l(i, i4, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        l9.setHasAlpha(bitmap.hasAlpha());
        B.a(bitmap, l9, matrix);
        return l9;
    }

    @Override // s1.InterfaceC4992e
    public final boolean equals(Object obj) {
        return obj instanceof C0266h;
    }

    @Override // s1.InterfaceC4992e
    public final int hashCode() {
        return -599754482;
    }
}
