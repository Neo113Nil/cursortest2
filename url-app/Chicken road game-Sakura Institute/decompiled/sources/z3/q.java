package z3;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12028d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12029e;

    /* renamed from: i, reason: collision with root package name */
    public int f12030i;

    /* renamed from: j, reason: collision with root package name */
    public final ReentrantLock f12031j;

    /* renamed from: k, reason: collision with root package name */
    public final RandomAccessFile f12032k;

    public q(boolean z4, RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f12028d = z4;
        this.f12031j = new ReentrantLock();
        this.f12032k = randomAccessFile;
    }

    public static j a(q qVar) {
        if (!qVar.f12028d) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = qVar.f12031j;
        reentrantLock.lock();
        try {
            if (qVar.f12029e) {
                throw new IllegalStateException("closed");
            }
            qVar.f12030i++;
            reentrantLock.unlock();
            return new j(qVar, 0L);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long b() {
        long length;
        ReentrantLock reentrantLock = this.f12031j;
        reentrantLock.lock();
        try {
            if (this.f12029e) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f7487a;
            synchronized (this) {
                length = this.f12032k.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f12031j;
        reentrantLock.lock();
        try {
            if (this.f12029e) {
                return;
            }
            this.f12029e = true;
            if (this.f12030i != 0) {
                return;
            }
            Unit unit = Unit.f7487a;
            synchronized (this) {
                this.f12032k.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final k d(long j4) {
        ReentrantLock reentrantLock = this.f12031j;
        reentrantLock.lock();
        try {
            if (this.f12029e) {
                throw new IllegalStateException("closed");
            }
            this.f12030i++;
            reentrantLock.unlock();
            return new k(this, j4);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.f12028d) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f12031j;
        reentrantLock.lock();
        try {
            if (this.f12029e) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f7487a;
            synchronized (this) {
                this.f12032k.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
