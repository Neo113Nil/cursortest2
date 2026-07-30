package f8;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3637f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3638g;

    /* renamed from: h, reason: collision with root package name */
    public int f3639h;

    /* renamed from: i, reason: collision with root package name */
    public final ReentrantLock f3640i = new ReentrantLock();

    /* renamed from: j, reason: collision with root package name */
    public final RandomAccessFile f3641j;

    public r(boolean z8, RandomAccessFile randomAccessFile) {
        this.f3637f = z8;
        this.f3641j = randomAccessFile;
    }

    public static j b(r rVar) {
        if (!rVar.f3637f) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = rVar.f3640i;
        reentrantLock.lock();
        try {
            if (rVar.f3638g) {
                throw new IllegalStateException("closed");
            }
            rVar.f3639h++;
            reentrantLock.unlock();
            return new j(rVar);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final k c(long j8) {
        ReentrantLock reentrantLock = this.f3640i;
        reentrantLock.lock();
        try {
            if (this.f3638g) {
                throw new IllegalStateException("closed");
            }
            this.f3639h++;
            reentrantLock.unlock();
            return new k(this, j8);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f3640i;
        reentrantLock.lock();
        try {
            if (this.f3638g) {
                return;
            }
            this.f3638g = true;
            if (this.f3639h != 0) {
                return;
            }
            synchronized (this) {
                this.f3641j.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (!this.f3637f) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f3640i;
        reentrantLock.lock();
        try {
            if (this.f3638g) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                this.f3641j.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f3640i;
        reentrantLock.lock();
        try {
            if (this.f3638g) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f3641j.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
