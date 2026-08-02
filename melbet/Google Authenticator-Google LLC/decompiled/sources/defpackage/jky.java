package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jky {
    public static final byte[] a;
    public static final ByteBuffer b;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        b = ByteBuffer.wrap(bArr);
        jju.Q(bArr, 0, 0);
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static int b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int c() {
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
