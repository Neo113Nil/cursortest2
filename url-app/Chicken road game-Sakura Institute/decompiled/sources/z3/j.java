package z3;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements D {

    /* renamed from: d, reason: collision with root package name */
    public final q f12004d;

    /* renamed from: e, reason: collision with root package name */
    public long f12005e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f12006i;

    public j(q fileHandle, long j4) {
        Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
        this.f12004d = fileHandle;
        this.f12005e = j4;
    }

    @Override // z3.D
    public final H c() {
        return H.f11975d;
    }

    @Override // z3.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12006i) {
            return;
        }
        this.f12006i = true;
        q qVar = this.f12004d;
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

    @Override // z3.D
    public final void e(C1448f source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f12006i) {
            throw new IllegalStateException("closed");
        }
        q qVar = this.f12004d;
        long j5 = this.f12005e;
        qVar.getClass();
        m3.s.g(source.f11999e, 0L, j4);
        long j6 = j5 + j4;
        while (j5 < j6) {
            A a4 = source.f11998d;
            Intrinsics.c(a4);
            int min = (int) Math.min(j6 - j5, a4.f11964c - a4.f11963b);
            byte[] array = a4.f11962a;
            int i2 = a4.f11963b;
            synchronized (qVar) {
                Intrinsics.checkNotNullParameter(array, "array");
                qVar.f12032k.seek(j5);
                qVar.f12032k.write(array, i2, min);
            }
            int i4 = a4.f11963b + min;
            a4.f11963b = i4;
            long j7 = min;
            j5 += j7;
            source.f11999e -= j7;
            if (i4 == a4.f11964c) {
                source.f11998d = a4.a();
                B.a(a4);
            }
        }
        this.f12005e += j4;
    }

    @Override // z3.D, java.io.Flushable
    public final void flush() {
        if (this.f12006i) {
            throw new IllegalStateException("closed");
        }
        q qVar = this.f12004d;
        synchronized (qVar) {
            qVar.f12032k.getFD().sync();
        }
    }
}
