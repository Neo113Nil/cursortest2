package defpackage;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kcy {
    static final int a;
    private static final Queue b;

    static {
        int max = Math.max(16384, 8192);
        a = max;
        b = new LinkedBlockingQueue(131072 / max);
    }

    static void a(byte[] bArr) {
        if (bArr.length == a) {
            b.offer(bArr);
        }
    }

    static byte[] b() {
        return c(a);
    }

    static byte[] c(int i) {
        byte[] bArr;
        return (i != a || (bArr = (byte[]) b.poll()) == null) ? new byte[i] : bArr;
    }
}
