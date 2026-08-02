package defpackage;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jod {
    public static final /* synthetic */ int a = 0;

    static {
        int[] iArr = joc.a;
    }

    public static byte[] a(long j) {
        return ByteBuffer.allocate(8).putLong(j).array();
    }

    public static final String b(byte[][] bArr, Mac mac, int i) {
        byte[] bArr2 = bArr[0];
        if (bArr2 != null) {
            mac.update(bArr2);
        }
        byte[] doFinal = mac.doFinal();
        if (i <= 0 || i > 9) {
            throw new IllegalArgumentException("Requested code length must be between 1 and 9 digits.");
        }
        int length = doFinal.length;
        int i2 = doFinal[length - 1] & 15;
        try {
            String num = Integer.toString((new DataInputStream(new ByteArrayInputStream(doFinal, i2, length - i2)).readInt() & Integer.MAX_VALUE) % joc.a[i]);
            for (int length2 = num.length(); length2 < i; length2++) {
                num = "0".concat(String.valueOf(num));
            }
            return num;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
