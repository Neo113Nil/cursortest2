package f8;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j implements e0 {

    /* renamed from: f, reason: collision with root package name */
    public final r f3608f;

    /* renamed from: g, reason: collision with root package name */
    public long f3609g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3610h;

    public j(r rVar) {
        r6.k.f(rVar, "fileHandle");
        this.f3608f = rVar;
        this.f3609g = 0L;
    }

    @Override // f8.e0
    public final i0 a() {
        return i0.f3604d;
    }

    @Override // f8.e0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r rVar = this.f3608f;
        if (this.f3610h) {
            return;
        }
        this.f3610h = true;
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

    @Override // f8.e0
    public final void f(long j8, f fVar) {
        if (this.f3610h) {
            throw new IllegalStateException("closed");
        }
        r rVar = this.f3608f;
        long j9 = this.f3609g;
        rVar.getClass();
        t6.a.t(fVar.f3598g, 0L, j8);
        long j10 = j9 + j8;
        while (j9 < j10) {
            b0 b0Var = fVar.f3597f;
            r6.k.c(b0Var);
            int min = (int) Math.min(j10 - j9, b0Var.f3573c - b0Var.f3572b);
            byte[] bArr = b0Var.f3571a;
            int i7 = b0Var.f3572b;
            synchronized (rVar) {
                r6.k.f(bArr, "array");
                rVar.f3641j.seek(j9);
                rVar.f3641j.write(bArr, i7, min);
            }
            int i8 = b0Var.f3572b + min;
            b0Var.f3572b = i8;
            long j11 = min;
            j9 += j11;
            fVar.f3598g -= j11;
            if (i8 == b0Var.f3573c) {
                fVar.f3597f = b0Var.a();
                c0.a(b0Var);
            }
        }
        this.f3609g += j8;
    }

    @Override // f8.e0, java.io.Flushable
    public final void flush() {
        if (this.f3610h) {
            throw new IllegalStateException("closed");
        }
        r rVar = this.f3608f;
        synchronized (rVar) {
            rVar.f3641j.getFD().sync();
        }
    }
}
