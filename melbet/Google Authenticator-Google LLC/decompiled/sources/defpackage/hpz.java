package defpackage;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hpz {
    public static final /* synthetic */ int a = 0;

    static {
        new hpy();
    }

    public static byte[] a(InputStream inputStream, Queue queue, int i) {
        int highestOneBit = Integer.highestOneBit(i);
        int min = Math.min(8192, Math.max(128, highestOneBit + highestOneBit));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return b(queue, i);
                }
                i2 += read;
                i += read;
            }
            min = hnu.ba(min * (min < 4096 ? 4 : 2));
        }
        if (inputStream.read() == -1) {
            return b(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] b(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i);
        int i2 = i - length;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - i2, min);
            i2 -= min;
        }
        return copyOf;
    }
}
