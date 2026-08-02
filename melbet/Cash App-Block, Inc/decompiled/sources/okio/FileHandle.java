package okio;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public abstract class FileHandle implements Closeable {
    public boolean closed;
    public final ReentrantLock lock = new ReentrantLock();
    public int openStreamCount;

    public final class FileHandleSource implements Source {
        public boolean closed;
        public final FileHandle fileHandle;
        public long position;

        public FileHandleSource(FileHandle fileHandle, long j) {
            this.fileHandle = fileHandle;
            this.position = j;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            FileHandle fileHandle = this.fileHandle;
            ReentrantLock reentrantLock = fileHandle.lock;
            reentrantLock.lock();
            try {
                int i = fileHandle.openStreamCount - 1;
                fileHandle.openStreamCount = i;
                if (i == 0) {
                    if (fileHandle.closed) {
                        reentrantLock.unlock();
                        fileHandle.protectedClose();
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // okio.Source
        public final long read(Buffer buffer, long j) {
            long j2;
            long j3;
            buffer.getClass();
            if (this.closed) {
                a$$ExternalSyntheticBUOutline0.m$1("closed");
                return 0L;
            }
            long j4 = this.position;
            if (j < 0) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(j, "byteCount < 0: "));
                return 0L;
            }
            long j5 = j + j4;
            long j6 = j4;
            while (true) {
                if (j6 >= j5) {
                    j2 = -1;
                    break;
                }
                Segment writableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = writableSegment$okio.data;
                j2 = -1;
                long j7 = j5;
                int protectedRead = this.fileHandle.protectedRead(j6, writableSegment$okio.limit, (int) Math.min(j5 - j6, 8192 - r12), bArr);
                if (protectedRead == -1) {
                    if (writableSegment$okio.pos == writableSegment$okio.limit) {
                        buffer.head = writableSegment$okio.pop();
                        SegmentPool.recycle(writableSegment$okio);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                    }
                } else {
                    writableSegment$okio.limit += protectedRead;
                    long j8 = protectedRead;
                    j6 += j8;
                    buffer.size += j8;
                    j5 = j7;
                }
            }
            j3 = j6 - j4;
            if (j3 != j2) {
                this.position += j3;
            }
            return j3;
        }

        @Override // okio.Source
        public final Timeout timeout() {
            return Timeout.NONE;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.openStreamCount != 0) {
                return;
            }
            reentrantLock.unlock();
            protectedClose();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract void protectedClose();

    public abstract int protectedRead(long j, int i, int i2, byte[] bArr);

    public abstract long protectedSize();

    public final long size() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return protectedSize();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final FileHandleSource source(long j) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            this.openStreamCount++;
            reentrantLock.unlock();
            return new FileHandleSource(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
