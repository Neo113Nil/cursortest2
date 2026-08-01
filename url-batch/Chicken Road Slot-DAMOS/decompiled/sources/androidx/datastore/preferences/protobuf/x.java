package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f647a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f648b;

    static {
        Charset.forName("US-ASCII");
        f647a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f648b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new g(bArr, 0, 0, false).j(0);
        } catch (z e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a2.r.j(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
