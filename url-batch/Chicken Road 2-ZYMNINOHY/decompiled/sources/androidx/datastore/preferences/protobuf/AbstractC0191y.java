package androidx.datastore.preferences.protobuf;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0191y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f4712a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4713b;

    static {
        Charset.forName(CharEncoding.US_ASCII);
        f4712a = Charset.forName(CharEncoding.UTF_8);
        Charset.forName(CharEncoding.ISO_8859_1);
        byte[] bArr = new byte[0];
        f4713b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0175h(bArr, 0, 0, false).e(0);
        } catch (A e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }
}
