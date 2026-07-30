package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d71 implements Closeable {
    public boolean m;
    public int n;
    public final ReentrantLock o = new ReentrantLock();
    public final RandomAccessFile p;

    public d71(RandomAccessFile randomAccessFile) {
        this.p = randomAccessFile;
    }

    public final vk0 b(long j) {
        ReentrantLock reentrantLock = this.o;
        reentrantLock.lock();
        try {
            if (this.m) {
                throw new IllegalStateException("closed");
            }
            this.n++;
            reentrantLock.unlock();
            return new vk0(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.o;
        reentrantLock.lock();
        try {
            if (this.m) {
                return;
            }
            this.m = true;
            if (this.n != 0) {
                return;
            }
            Unit unit = Unit.a;
            synchronized (this) {
                this.p.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.o;
        reentrantLock.lock();
        try {
            if (this.m) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.a;
            synchronized (this) {
                length = this.p.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
