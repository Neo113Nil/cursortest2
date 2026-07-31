package T2;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class q implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4438d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4439e;

    /* renamed from: f, reason: collision with root package name */
    public int f4440f;

    /* renamed from: g, reason: collision with root package name */
    public final ReentrantLock f4441g = new ReentrantLock();

    /* renamed from: h, reason: collision with root package name */
    public final RandomAccessFile f4442h;

    public q(boolean z3, RandomAccessFile randomAccessFile) {
        this.f4438d = z3;
        this.f4442h = randomAccessFile;
    }

    public static j a(q qVar) {
        if (!qVar.f4438d) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = qVar.f4441g;
        reentrantLock.lock();
        try {
            if (qVar.f4439e) {
                throw new IllegalStateException("closed");
            }
            qVar.f4440f++;
            reentrantLock.unlock();
            return new j(qVar, 0L);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long b() {
        long length;
        ReentrantLock reentrantLock = this.f4441g;
        reentrantLock.lock();
        try {
            if (this.f4439e) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f4442h.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f4441g;
        reentrantLock.lock();
        try {
            if (this.f4439e) {
                return;
            }
            this.f4439e = true;
            if (this.f4440f != 0) {
                return;
            }
            synchronized (this) {
                this.f4442h.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final k d(long j3) {
        ReentrantLock reentrantLock = this.f4441g;
        reentrantLock.lock();
        try {
            if (this.f4439e) {
                throw new IllegalStateException("closed");
            }
            this.f4440f++;
            reentrantLock.unlock();
            return new k(this, j3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.f4438d) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f4441g;
        reentrantLock.lock();
        try {
            if (this.f4439e) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                this.f4442h.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
