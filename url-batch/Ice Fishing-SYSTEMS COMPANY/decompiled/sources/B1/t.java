package B1;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import s1.InterfaceC4992e;
import v1.InterfaceC5117a;

/* loaded from: classes.dex */
public final class t extends AbstractC0263e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f124b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC4992e.f40420a);

    @Override // s1.InterfaceC4992e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f124b);
    }

    @Override // B1.AbstractC0263e
    public final Bitmap c(InterfaceC5117a interfaceC5117a, Bitmap bitmap, int i, int i4) {
        return B.b(interfaceC5117a, bitmap, i, i4);
    }

    @Override // s1.InterfaceC4992e
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    @Override // s1.InterfaceC4992e
    public final int hashCode() {
        return 1572326941;
    }
}
