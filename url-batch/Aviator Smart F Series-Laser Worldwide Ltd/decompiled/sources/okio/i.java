package okio;

import java.io.Closeable;

/* loaded from: classes5.dex */
public abstract class i implements Closeable {
    private boolean closed;
    private int openStreamCount;
    private final boolean readWrite;

    private static final class a implements v0 {
        private boolean closed;
        private final i fileHandle;
        private long position;

        public a(i fileHandle, long j8) {
            kotlin.jvm.internal.s.checkNotNullParameter(fileHandle, "fileHandle");
            this.fileHandle = fileHandle;
            this.position = j8;
        }

        @Override // okio.v0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            synchronized (this.fileHandle) {
                i fileHandle = getFileHandle();
                fileHandle.openStreamCount--;
                if (getFileHandle().openStreamCount == 0 && getFileHandle().closed) {
                    y5.w wVar = y5.w.INSTANCE;
                    this.fileHandle.protectedClose();
                }
            }
        }

        @Override // okio.v0, java.io.Flushable
        public void flush() {
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            this.fileHandle.protectedFlush();
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final i getFileHandle() {
            return this.fileHandle;
        }

        public final long getPosition() {
            return this.position;
        }

        public final void setClosed(boolean z7) {
            this.closed = z7;
        }

        public final void setPosition(long j8) {
            this.position = j8;
        }

        @Override // okio.v0
        public y0 timeout() {
            return y0.NONE;
        }

        @Override // okio.v0
        public void write(c source, long j8) {
            kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            this.fileHandle.writeNoCloseCheck(this.position, source, j8);
            this.position += j8;
        }
    }

    private static final class b implements x0 {
        private boolean closed;
        private final i fileHandle;
        private long position;

        public b(i fileHandle, long j8) {
            kotlin.jvm.internal.s.checkNotNullParameter(fileHandle, "fileHandle");
            this.fileHandle = fileHandle;
            this.position = j8;
        }

        @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            synchronized (this.fileHandle) {
                i fileHandle = getFileHandle();
                fileHandle.openStreamCount--;
                if (getFileHandle().openStreamCount == 0 && getFileHandle().closed) {
                    y5.w wVar = y5.w.INSTANCE;
                    this.fileHandle.protectedClose();
                }
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final i getFileHandle() {
            return this.fileHandle;
        }

        public final long getPosition() {
            return this.position;
        }

        @Override // okio.x0
        public long read(c sink, long j8) {
            kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            long readNoCloseCheck = this.fileHandle.readNoCloseCheck(this.position, sink, j8);
            if (readNoCloseCheck != -1) {
                this.position += readNoCloseCheck;
            }
            return readNoCloseCheck;
        }

        public final void setClosed(boolean z7) {
            this.closed = z7;
        }

        public final void setPosition(long j8) {
            this.position = j8;
        }

        @Override // okio.x0
        public y0 timeout() {
            return y0.NONE;
        }
    }

    public i(boolean z7) {
        this.readWrite = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long readNoCloseCheck(long j8, c cVar, long j9) {
        if (!(j9 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount < 0: ", Long.valueOf(j9)).toString());
        }
        long j10 = j8 + j9;
        long j11 = j8;
        while (true) {
            if (j11 >= j10) {
                break;
            }
            t0 writableSegment$okio = cVar.writableSegment$okio(1);
            int protectedRead = protectedRead(j11, writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j10 - j11, 8192 - r8));
            if (protectedRead == -1) {
                if (writableSegment$okio.pos == writableSegment$okio.limit) {
                    cVar.head = writableSegment$okio.pop();
                    u0.recycle(writableSegment$okio);
                }
                if (j8 == j11) {
                    return -1L;
                }
            } else {
                writableSegment$okio.limit += protectedRead;
                long j12 = protectedRead;
                j11 += j12;
                cVar.setSize$okio(cVar.size() + j12);
            }
        }
        return j11 - j8;
    }

    public static /* synthetic */ v0 sink$default(i iVar, long j8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i8 & 1) != 0) {
            j8 = 0;
        }
        return iVar.sink(j8);
    }

    public static /* synthetic */ x0 source$default(i iVar, long j8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i8 & 1) != 0) {
            j8 = 0;
        }
        return iVar.source(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeNoCloseCheck(long j8, c cVar, long j9) {
        d1.checkOffsetAndCount(cVar.size(), 0L, j9);
        long j10 = j9 + j8;
        while (j8 < j10) {
            t0 t0Var = cVar.head;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            int min = (int) Math.min(j10 - j8, t0Var.limit - t0Var.pos);
            protectedWrite(j8, t0Var.data, t0Var.pos, min);
            t0Var.pos += min;
            long j11 = min;
            j8 += j11;
            cVar.setSize$okio(cVar.size() - j11);
            if (t0Var.pos == t0Var.limit) {
                cVar.head = t0Var.pop();
                u0.recycle(t0Var);
            }
        }
    }

    public final v0 appendingSink() {
        return sink(size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            if (this.openStreamCount != 0) {
                return;
            }
            y5.w wVar = y5.w.INSTANCE;
            protectedClose();
        }
    }

    public final void flush() {
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        synchronized (this) {
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            y5.w wVar = y5.w.INSTANCE;
        }
        protectedFlush();
    }

    public final boolean getReadWrite() {
        return this.readWrite;
    }

    public final long position(x0 source) {
        long j8;
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        if (source instanceof s0) {
            s0 s0Var = (s0) source;
            j8 = s0Var.bufferField.size();
            source = s0Var.source;
        } else {
            j8 = 0;
        }
        if (!((source instanceof b) && ((b) source).getFileHandle() == this)) {
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        b bVar = (b) source;
        if (!bVar.getClosed()) {
            return bVar.getPosition() - j8;
        }
        throw new IllegalStateException("closed".toString());
    }

    protected abstract void protectedClose();

    protected abstract void protectedFlush();

    protected abstract int protectedRead(long j8, byte[] bArr, int i8, int i9);

    protected abstract void protectedResize(long j8);

    protected abstract long protectedSize();

    protected abstract void protectedWrite(long j8, byte[] bArr, int i8, int i9);

    public final int read(long j8, byte[] array, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        synchronized (this) {
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            y5.w wVar = y5.w.INSTANCE;
        }
        return protectedRead(j8, array, i8, i9);
    }

    public final void reposition(x0 source, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        boolean z7 = false;
        if (!(source instanceof s0)) {
            if ((source instanceof b) && ((b) source).getFileHandle() == this) {
                z7 = true;
            }
            if (!z7) {
                throw new IllegalArgumentException("source was not created by this FileHandle".toString());
            }
            b bVar = (b) source;
            if (!(!bVar.getClosed())) {
                throw new IllegalStateException("closed".toString());
            }
            bVar.setPosition(j8);
            return;
        }
        s0 s0Var = (s0) source;
        x0 x0Var = s0Var.source;
        if ((x0Var instanceof b) && ((b) x0Var).getFileHandle() == this) {
            z7 = true;
        }
        if (!z7) {
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        b bVar2 = (b) x0Var;
        if (!(!bVar2.getClosed())) {
            throw new IllegalStateException("closed".toString());
        }
        long size = s0Var.bufferField.size();
        long position = j8 - (bVar2.getPosition() - size);
        if (0 <= position && position < size) {
            s0Var.skip(position);
        } else {
            s0Var.bufferField.clear();
            bVar2.setPosition(j8);
        }
    }

    public final void resize(long j8) {
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        synchronized (this) {
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            y5.w wVar = y5.w.INSTANCE;
        }
        protectedResize(j8);
    }

    public final v0 sink(long j8) {
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        synchronized (this) {
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            this.openStreamCount++;
        }
        return new a(this, j8);
    }

    public final long size() {
        synchronized (this) {
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            y5.w wVar = y5.w.INSTANCE;
        }
        return protectedSize();
    }

    public final x0 source(long j8) {
        synchronized (this) {
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            this.openStreamCount++;
        }
        return new b(this, j8);
    }

    public final void write(long j8, byte[] array, int i8, int i9) {
        kotlin.jvm.internal.s.checkNotNullParameter(array, "array");
        if (!this.readWrite) {
            throw new IllegalStateException("file handle is read-only".toString());
        }
        synchronized (this) {
            if (!(!this.closed)) {
                throw new IllegalStateException("closed".toString());
            }
            y5.w wVar = y5.w.INSTANCE;
        }
        protectedWrite(j8, array, i8, i9);
    }

    public final long read(long j8, c sink, long j9) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        synchronized (this) {
            if (!this.closed) {
                y5.w wVar = y5.w.INSTANCE;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
        return readNoCloseCheck(j8, sink, j9);
    }

    public final void write(long j8, c source, long j9) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        if (this.readWrite) {
            synchronized (this) {
                if (!this.closed) {
                    y5.w wVar = y5.w.INSTANCE;
                } else {
                    throw new IllegalStateException("closed".toString());
                }
            }
            writeNoCloseCheck(j8, source, j9);
            return;
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    public final long position(v0 sink) {
        long j8;
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        if (sink instanceof r0) {
            r0 r0Var = (r0) sink;
            j8 = r0Var.bufferField.size();
            sink = r0Var.sink;
        } else {
            j8 = 0;
        }
        if ((sink instanceof a) && ((a) sink).getFileHandle() == this) {
            a aVar = (a) sink;
            if (!aVar.getClosed()) {
                return aVar.getPosition() + j8;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
    }

    public final void reposition(v0 sink, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        boolean z7 = false;
        if (sink instanceof r0) {
            r0 r0Var = (r0) sink;
            v0 v0Var = r0Var.sink;
            if ((v0Var instanceof a) && ((a) v0Var).getFileHandle() == this) {
                z7 = true;
            }
            if (z7) {
                a aVar = (a) v0Var;
                if (!aVar.getClosed()) {
                    r0Var.emit();
                    aVar.setPosition(j8);
                    return;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
        if ((sink instanceof a) && ((a) sink).getFileHandle() == this) {
            z7 = true;
        }
        if (z7) {
            a aVar2 = (a) sink;
            if (!aVar2.getClosed()) {
                aVar2.setPosition(j8);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
    }
}
