package N2;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class k implements F {

    /* renamed from: d, reason: collision with root package name */
    public final q f2937d;

    /* renamed from: e, reason: collision with root package name */
    public long f2938e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2939f;

    public k(q qVar, long j3) {
        Z1.i.f(qVar, "fileHandle");
        this.f2937d = qVar;
        this.f2938e = j3;
    }

    @Override // N2.F
    public final H c() {
        return H.f2905d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2939f) {
            return;
        }
        this.f2939f = true;
        q qVar = this.f2937d;
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

    @Override // N2.F
    public final long l(C0150f c0150f, long j3) {
        long j4;
        long j5;
        int i3;
        int i4;
        Z1.i.f(c0150f, "sink");
        if (this.f2939f) {
            throw new IllegalStateException("closed");
        }
        q qVar = this.f2937d;
        long j6 = this.f2938e;
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
            A D = c0150f.D(1);
            byte[] bArr = D.f2892a;
            int i5 = D.f2894c;
            int min = (int) Math.min(j7 - j8, 8192 - i5);
            synchronized (qVar) {
                Z1.i.f(bArr, "array");
                qVar.f2962h.seek(j8);
                i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        break;
                    }
                    int read = qVar.f2962h.read(bArr, i5, min - i3);
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
                if (D.f2893b == D.f2894c) {
                    c0150f.f2928d = D.a();
                    B.a(D);
                }
                if (j6 == j8) {
                    j5 = -1;
                    j4 = -1;
                }
            } else {
                D.f2894c += i3;
                long j9 = i3;
                j8 += j9;
                c0150f.f2929e += j9;
            }
        }
        j4 = j8 - j6;
        j5 = -1;
        if (j4 != j5) {
            this.f2938e += j4;
        }
        return j4;
    }
}
