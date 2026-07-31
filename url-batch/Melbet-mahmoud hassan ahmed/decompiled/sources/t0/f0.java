package t0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f0 {
    public static List<byte[]> a(byte[] bArr) {
        long e7 = e(d(bArr));
        long e8 = e(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(b(e7));
        arrayList.add(b(e8));
        return arrayList;
    }

    private static byte[] b(long j7) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j7).array();
    }

    public static int c(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static int d(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    private static long e(long j7) {
        return (j7 * 1000000000) / 48000;
    }
}
