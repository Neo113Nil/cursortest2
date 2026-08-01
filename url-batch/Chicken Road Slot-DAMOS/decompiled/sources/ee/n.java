package ee;

import kotlin.time.TimeMark;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class n implements TimeMark, Comparable {
    public static long a(long j) {
        long j3;
        long j10;
        m.f3986a.getClass();
        long nanoTime = System.nanoTime() - m.f3987b;
        d dVar = d.NANOSECONDS;
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            if (j < 0) {
                b.f3956e.getClass();
                j10 = b.f3958r;
            } else {
                b.f3956e.getClass();
                j10 = b.f3957i;
            }
            return b.h(j10);
        }
        long j11 = nanoTime - j;
        if (((j11 ^ nanoTime) & (~(j11 ^ j))) >= 0) {
            return i.i(j11, dVar);
        }
        d dVar2 = d.MILLISECONDS;
        if (dVar.compareTo(dVar2) < 0) {
            long j12 = (nanoTime / 1000000) - (j / 1000000);
            long j13 = (nanoTime % 1000000) - (j % 1000000);
            a aVar = b.f3956e;
            return b.e(i.i(j12, dVar2), i.i(j13, dVar));
        }
        if (j11 < 0) {
            b.f3956e.getClass();
            j3 = b.f3958r;
        } else {
            b.f3956e.getClass();
            j3 = b.f3957i;
        }
        return b.h(j3);
    }
}
