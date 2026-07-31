package T2;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class j implements D {

    /* renamed from: d, reason: collision with root package name */
    public final q f4414d;

    /* renamed from: e, reason: collision with root package name */
    public long f4415e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4416f;

    public j(q qVar, long j3) {
        f2.j.f(qVar, "fileHandle");
        this.f4414d = qVar;
        this.f4415e = j3;
    }

    @Override // T2.D
    public final H c() {
        return H.f4385d;
    }

    @Override // T2.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4416f) {
            return;
        }
        this.f4416f = true;
        q qVar = this.f4414d;
        ReentrantLock reentrantLock = qVar.f4441g;
        reentrantLock.lock();
        try {
            int i3 = qVar.f4440f - 1;
            qVar.f4440f = i3;
            if (i3 == 0) {
                if (qVar.f4439e) {
                    synchronized (qVar) {
                        qVar.f4442h.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // T2.D, java.io.Flushable
    public final void flush() {
        if (this.f4416f) {
            throw new IllegalStateException("closed");
        }
        q qVar = this.f4414d;
        synchronized (qVar) {
            qVar.f4442h.getFD().sync();
        }
    }

    @Override // T2.D
    public final void p(C0231f c0231f, long j3) {
        if (this.f4416f) {
            throw new IllegalStateException("closed");
        }
        q qVar = this.f4414d;
        long j4 = this.f4415e;
        qVar.getClass();
        O2.l.R(c0231f.f4409e, 0L, j3);
        long j5 = j4 + j3;
        while (j4 < j5) {
            A a3 = c0231f.f4408d;
            f2.j.c(a3);
            int min = (int) Math.min(j5 - j4, a3.f4374c - a3.f4373b);
            byte[] bArr = a3.f4372a;
            int i3 = a3.f4373b;
            synchronized (qVar) {
                f2.j.f(bArr, "array");
                qVar.f4442h.seek(j4);
                qVar.f4442h.write(bArr, i3, min);
            }
            int i4 = a3.f4373b + min;
            a3.f4373b = i4;
            long j6 = min;
            j4 += j6;
            c0231f.f4409e -= j6;
            if (i4 == a3.f4374c) {
                c0231f.f4408d = a3.a();
                B.a(a3);
            }
        }
        this.f4415e += j3;
    }
}
