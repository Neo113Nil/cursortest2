package x5;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: x5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1019i {

    /* renamed from: a, reason: collision with root package name */
    public final double f8388a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8389b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f8390c;

    public C1019i(double d7, double d8) {
        double d9 = d7 / 1.0E9d;
        this.f8388a = d9;
        long j = (long) (d8 / d9);
        this.f8389b = j;
        this.f8390c = new AtomicLong(System.nanoTime() - j);
    }

    public final boolean a(double d7) {
        AtomicLong atomicLong;
        long j;
        long nanoTime;
        long j7;
        long j8 = (long) (d7 / this.f8388a);
        do {
            atomicLong = this.f8390c;
            j = atomicLong.get();
            nanoTime = System.nanoTime();
            long j9 = nanoTime - j;
            long j10 = this.f8389b;
            if (j9 > j10) {
                j9 = j10;
            }
            j7 = j9 - j8;
            if (j7 < 0) {
                return false;
            }
        } while (!atomicLong.compareAndSet(j, nanoTime - j7));
        return true;
    }
}
