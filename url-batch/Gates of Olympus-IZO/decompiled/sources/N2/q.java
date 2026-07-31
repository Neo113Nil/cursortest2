package N2;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class q implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2958d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2959e;

    /* renamed from: f, reason: collision with root package name */
    public int f2960f;

    /* renamed from: g, reason: collision with root package name */
    public final ReentrantLock f2961g = new ReentrantLock();

    /* renamed from: h, reason: collision with root package name */
    public final RandomAccessFile f2962h;

    public q(boolean z3, RandomAccessFile randomAccessFile) {
        this.f2958d = z3;
        this.f2962h = randomAccessFile;
    }

    public static j a(q qVar) {
        if (!qVar.f2958d) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = qVar.f2961g;
        reentrantLock.lock();
        try {
            if (qVar.f2959e) {
                throw new IllegalStateException("closed");
            }
            qVar.f2960f++;
            reentrantLock.unlock();
            return new j(qVar, 0L);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long b() {
        long length;
        ReentrantLock reentrantLock = this.f2961g;
        reentrantLock.lock();
        try {
            if (this.f2959e) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f2962h.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f2961g;
        reentrantLock.lock();
        try {
            if (this.f2959e) {
                return;
            }
            this.f2959e = true;
            if (this.f2960f != 0) {
                return;
            }
            synchronized (this) {
                this.f2962h.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final k e(long j3) {
        ReentrantLock reentrantLock = this.f2961g;
        reentrantLock.lock();
        try {
            if (this.f2959e) {
                throw new IllegalStateException("closed");
            }
            this.f2960f++;
            reentrantLock.unlock();
            return new k(this, j3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.f2958d) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f2961g;
        reentrantLock.lock();
        try {
            if (this.f2959e) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                this.f2962h.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
