package T2;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class k implements F {

    /* renamed from: d, reason: collision with root package name */
    public final q f4417d;

    /* renamed from: e, reason: collision with root package name */
    public long f4418e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4419f;

    public k(q qVar, long j3) {
        f2.j.f(qVar, "fileHandle");
        this.f4417d = qVar;
        this.f4418e = j3;
    }

    @Override // T2.F
    public final H c() {
        return H.f4385d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4419f) {
            return;
        }
        this.f4419f = true;
        q qVar = this.f4417d;
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

    @Override // T2.F
    public final long f(C0231f c0231f, long j3) {
        long j4;
        long j5;
        int i3;
        int i4;
        f2.j.f(c0231f, "sink");
        if (this.f4419f) {
            throw new IllegalStateException("closed");
        }
        q qVar = this.f4417d;
        long j6 = this.f4418e;
        qVar.getClass();
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        long j7 = j3 + j6;
        long j8 = j6;
        while (true) {
            if (j8 >= j7) {
                break;
            }
            A x3 = c0231f.x(1);
            byte[] bArr = x3.f4372a;
            int i5 = x3.f4374c;
            int min = (int) Math.min(j7 - j8, 8192 - i5);
            synchronized (qVar) {
                f2.j.f(bArr, "array");
                qVar.f4442h.seek(j8);
                i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        break;
                    }
                    int read = qVar.f4442h.read(bArr, i5, min - i3);
                    if (read != -1) {
                        i3 += read;
                    } else if (i3 == 0) {
                        i4 = -1;
                        i3 = -1;
                    }
                }
                i4 = -1;
            }
            if (i3 == i4) {
                if (x3.f4373b == x3.f4374c) {
                    c0231f.f4408d = x3.a();
                    B.a(x3);
                }
                if (j6 == j8) {
                    j5 = -1;
                    j4 = -1;
                }
            } else {
                x3.f4374c += i3;
                long j9 = i3;
                j8 += j9;
                c0231f.f4409e += j9;
            }
        }
        j4 = j8 - j6;
        j5 = -1;
        if (j4 != j5) {
            this.f4418e += j4;
        }
        return j4;
    }
}
