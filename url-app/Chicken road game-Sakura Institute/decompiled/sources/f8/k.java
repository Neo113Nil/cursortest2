package f8;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k implements g0 {

    /* renamed from: f, reason: collision with root package name */
    public final r f3615f;

    /* renamed from: g, reason: collision with root package name */
    public long f3616g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3617h;

    public k(r rVar, long j8) {
        this.f3615f = rVar;
        this.f3616g = j8;
    }

    @Override // f8.g0
    public final i0 a() {
        return i0.f3604d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r rVar = this.f3615f;
        if (this.f3617h) {
            return;
        }
        this.f3617h = true;
        ReentrantLock reentrantLock = rVar.f3640i;
        reentrantLock.lock();
        try {
            int i7 = rVar.f3639h - 1;
            rVar.f3639h = i7;
            if (i7 == 0) {
                if (rVar.f3638g) {
                    synchronized (rVar) {
                        rVar.f3641j.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // f8.g0
    public final long v(long j8, f fVar) {
        long j9;
        long j10;
        int i7;
        r6.k.f(fVar, "sink");
        if (this.f3617h) {
            throw new IllegalStateException("closed");
        }
        r rVar = this.f3615f;
        long j11 = this.f3616g;
        if (j8 < 0) {
            throw new IllegalArgumentException(a0.m.h(j8, "byteCount < 0: ").toString());
        }
        long j12 = j8 + j11;
        long j13 = j11;
        while (true) {
            if (j13 >= j12) {
                j9 = -1;
                break;
            }
            b0 F = fVar.F(1);
            byte[] bArr = F.f3571a;
            int i8 = F.f3573c;
            j9 = -1;
            int min = (int) Math.min(j12 - j13, 8192 - i8);
            synchronized (rVar) {
                r6.k.f(bArr, "array");
                rVar.f3641j.seek(j13);
                i7 = 0;
                while (true) {
                    if (i7 >= min) {
                        break;
                    }
                    int read = rVar.f3641j.read(bArr, i8, min - i7);
                    if (read != -1) {
                        i7 += read;
                    } else if (i7 == 0) {
                        i7 = -1;
                    }
                }
            }
            if (i7 == -1) {
                if (F.f3572b == F.f3573c) {
                    fVar.f3597f = F.a();
                    c0.a(F);
                }
                if (j11 == j13) {
                    j10 = -1;
                }
            } else {
                F.f3573c += i7;
                long j14 = i7;
                j13 += j14;
                fVar.f3598g += j14;
            }
        }
        j10 = j13 - j11;
        if (j10 != j9) {
            this.f3616g += j10;
        }
        return j10;
    }
}
