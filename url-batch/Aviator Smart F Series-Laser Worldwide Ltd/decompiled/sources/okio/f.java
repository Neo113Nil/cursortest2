package okio;

import javax.crypto.Cipher;

/* loaded from: classes5.dex */
public final class f implements v0 {
    private final int blockSize;
    private final Cipher cipher;
    private boolean closed;
    private final d sink;

    public f(d sink, Cipher cipher) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.s.checkNotNullParameter(cipher, "cipher");
        this.sink = sink;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        if (!(blockSize > 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("Block cipher required ", getCipher()).toString());
        }
    }

    private final Throwable doFinal() {
        int outputSize = this.cipher.getOutputSize(0);
        Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        c buffer = this.sink.getBuffer();
        t0 writableSegment$okio = buffer.writableSegment$okio(outputSize);
        try {
            int doFinal = this.cipher.doFinal(writableSegment$okio.data, writableSegment$okio.limit);
            writableSegment$okio.limit += doFinal;
            buffer.setSize$okio(buffer.size() + doFinal);
        } catch (Throwable th2) {
            th = th2;
        }
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            buffer.head = writableSegment$okio.pop();
            u0.recycle(writableSegment$okio);
        }
        return th;
    }

    private final int update(c cVar, long j8) {
        t0 t0Var = cVar.head;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        int min = (int) Math.min(j8, t0Var.limit - t0Var.pos);
        c buffer = this.sink.getBuffer();
        int outputSize = this.cipher.getOutputSize(min);
        while (outputSize > 8192) {
            int i8 = this.blockSize;
            if (!(min > i8)) {
                throw new IllegalStateException(("Unexpected output size " + outputSize + " for input size " + min).toString());
            }
            min -= i8;
            outputSize = this.cipher.getOutputSize(min);
        }
        t0 writableSegment$okio = buffer.writableSegment$okio(outputSize);
        int update = this.cipher.update(t0Var.data, t0Var.pos, min, writableSegment$okio.data, writableSegment$okio.limit);
        writableSegment$okio.limit += update;
        buffer.setSize$okio(buffer.size() + update);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            buffer.head = writableSegment$okio.pop();
            u0.recycle(writableSegment$okio);
        }
        this.sink.emitCompleteSegments();
        cVar.setSize$okio(cVar.size() - min);
        int i9 = t0Var.pos + min;
        t0Var.pos = i9;
        if (i9 == t0Var.limit) {
            cVar.head = t0Var.pop();
            u0.recycle(t0Var);
        }
        return min;
    }

    @Override // okio.v0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        Throwable doFinal = doFinal();
        try {
            this.sink.close();
        } catch (Throwable th) {
            if (doFinal == null) {
                doFinal = th;
            }
        }
        if (doFinal != null) {
            throw doFinal;
        }
    }

    @Override // okio.v0, java.io.Flushable
    public void flush() {
        this.sink.flush();
    }

    public final Cipher getCipher() {
        return this.cipher;
    }

    @Override // okio.v0
    public y0 timeout() {
        return this.sink.timeout();
    }

    @Override // okio.v0
    public void write(c source, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        d1.checkOffsetAndCount(source.size(), 0L, j8);
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j8 > 0) {
            j8 -= update(source, j8);
        }
    }
}
