package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0207x {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3571a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3572b;

    static {
        Charset.forName("US-ASCII");
        f3571a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3572b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0192h(bArr, 0, 0, false).e(0);
        } catch (C0209z e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
