package N2;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class j implements D {

    /* renamed from: d, reason: collision with root package name */
    public final q f2934d;

    /* renamed from: e, reason: collision with root package name */
    public long f2935e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2936f;

    public j(q qVar, long j3) {
        Z1.i.f(qVar, "fileHandle");
        this.f2934d = qVar;
        this.f2935e = j3;
    }

    @Override // N2.D
    public final H c() {
        return H.f2905d;
    }

    @Override // N2.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2936f) {
            return;
        }
        this.f2936f = true;
        q qVar = this.f2934d;
        ReentrantLock reentrantLock = qVar.f2961g;
        reentrantLock.lock();
        try {
            int i3 = qVar.f2960f - 1;
            qVar.f2960f = i3;
            if (i3 == 0) {
                if (qVar.f2959e) {
                    synchronized (qVar) {
                        qVar.f2962h.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // N2.D, java.io.Flushable
    public final void flush() {
        if (this.f2936f) {
            throw new IllegalStateException("closed");
        }
        q qVar = this.f2934d;
        synchronized (qVar) {
            qVar.f2962h.getFD().sync();
        }
    }

    @Override // N2.D
    public final void g(C0150f c0150f, long j3) {
        if (this.f2936f) {
            throw new IllegalStateException("closed");
        }
        q qVar = this.f2934d;
        long j4 = this.f2935e;
        qVar.getClass();
        I2.d.q(c0150f.f2929e, 0L, j3);
        long j5 = j4 + j3;
        while (j4 < j5) {
            A a3 = c0150f.f2928d;
            Z1.i.c(a3);
            int min = (int) Math.min(j5 - j4, a3.f2894c - a3.f2893b);
            byte[] bArr = a3.f2892a;
            int i3 = a3.f2893b;
            synchronized (qVar) {
                Z1.i.f(bArr, "array");
                qVar.f2962h.seek(j4);
                qVar.f2962h.write(bArr, i3, min);
            }
            int i4 = a3.f2893b + min;
            a3.f2893b = i4;
            long j6 = min;
            j4 += j6;
            c0150f.f2929e -= j6;
            if (i4 == a3.f2894c) {
                c0150f.f2928d = a3.a();
                B.a(a3);
            }
        }
        this.f2935e += j3;
    }
}
