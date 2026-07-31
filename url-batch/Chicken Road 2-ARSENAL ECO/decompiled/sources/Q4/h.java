package Q4;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final double f2023a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2024b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f2025c;

    public h(double d7, double d8) {
        double d9 = d7 / 1.0E9d;
        this.f2023a = d9;
        long j4 = (long) (d8 / d9);
        this.f2024b = j4;
        this.f2025c = new AtomicLong(System.nanoTime() - j4);
    }

    public final boolean a(double d7) {
        AtomicLong atomicLong;
        long j4;
        long nanoTime;
        long j7;
        long j8 = (long) (d7 / this.f2023a);
        do {
            atomicLong = this.f2025c;
            j4 = atomicLong.get();
            nanoTime = System.nanoTime();
            long j9 = nanoTime - j4;
            long j10 = this.f2024b;
            if (j9 > j10) {
                j9 = j10;
            }
            j7 = j9 - j8;
            if (j7 < 0) {
                return false;
            }
        } while (!atomicLong.compareAndSet(j4, nanoTime - j7));
        return true;
    }
}
