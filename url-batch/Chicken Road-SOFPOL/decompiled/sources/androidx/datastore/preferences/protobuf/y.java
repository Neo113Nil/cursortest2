package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f794a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f795b;

    static {
        Charset.forName("US-ASCII");
        f794a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f795b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new h(bArr, 0, 0, false).i(0);
        } catch (a0 e8) {
            throw new IllegalArgumentException(e8);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }
}
