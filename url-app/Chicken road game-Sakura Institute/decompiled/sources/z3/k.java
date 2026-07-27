package z3;

import A.AbstractC0017m;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k implements F {

    /* renamed from: d, reason: collision with root package name */
    public final q f12007d;

    /* renamed from: e, reason: collision with root package name */
    public long f12008e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12009i;

    public k(q fileHandle, long j4) {
        Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
        this.f12007d = fileHandle;
        this.f12008e = j4;
    }

    @Override // z3.F
    public final H c() {
        return H.f11975d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12009i) {
            return;
        }
        this.f12009i = true;
        q qVar = this.f12007d;
        ReentrantLock reentrantLock = qVar.f12031j;
        reentrantLock.lock();
        try {
            int i2 = qVar.f12030i - 1;
            qVar.f12030i = i2;
            if (i2 == 0 && qVar.f12029e) {
                Unit unit = Unit.f7487a;
                synchronized (qVar) {
                    qVar.f12032k.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // z3.F
    public final long l(C1448f sink, long j4) {
        long j5;
        long j6;
        int i2;
        int i4;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f12009i) {
            throw new IllegalStateException("closed");
        }
        q qVar = this.f12007d;
        long j7 = this.f12008e;
        qVar.getClass();
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.i("byteCount < 0: ", j4).toString());
        }
        long j8 = j4 + j7;
        long j9 = j7;
        while (true) {
            if (j9 >= j8) {
                break;
            }
            A u4 = sink.u(1);
            byte[] array = u4.f11962a;
            int i5 = u4.f11964c;
            int min = (int) Math.min(j8 - j9, 8192 - i5);
            synchronized (qVar) {
                Intrinsics.checkNotNullParameter(array, "array");
                qVar.f12032k.seek(j9);
                i2 = 0;
                while (true) {
                    if (i2 >= min) {
                        break;
                    }
                    int read = qVar.f12032k.read(array, i5, min - i2);
                    if (read != -1) {
                        i2 += read;
                    } else if (i2 == 0) {
                        i4 = -1;
                        i2 = -1;
                    }
                }
                i4 = -1;
            }
            if (i2 == i4) {
                if (u4.f11963b == u4.f11964c) {
                    sink.f11998d = u4.a();
                    B.a(u4);
                }
                if (j7 == j9) {
                    j6 = -1;
                    j5 = -1;
                }
            } else {
                u4.f11964c += i2;
                long j10 = i2;
                j9 += j10;
                sink.f11999e += j10;
            }
        }
        j5 = j9 - j7;
        j6 = -1;
        if (j5 != j6) {
            this.f12008e += j5;
        }
        return j5;
    }
}
