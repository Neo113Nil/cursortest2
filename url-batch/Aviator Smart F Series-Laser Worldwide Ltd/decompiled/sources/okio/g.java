package okio;

import javax.crypto.Cipher;

/* loaded from: classes5.dex */
public final class g implements x0 {
    private final int blockSize;
    private final c buffer;
    private final Cipher cipher;
    private boolean closed;

    /* renamed from: final, reason: not valid java name */
    private boolean f8final;
    private final e source;

    public g(e source, Cipher cipher) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(cipher, "cipher");
        this.source = source;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new c();
        if (!(blockSize > 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("Block cipher required ", getCipher()).toString());
        }
    }

    private final void doFinal() {
        int outputSize = this.cipher.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        t0 writableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int doFinal = this.cipher.doFinal(writableSegment$okio.data, writableSegment$okio.pos);
        writableSegment$okio.limit += doFinal;
        c cVar = this.buffer;
        cVar.setSize$okio(cVar.size() + doFinal);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            this.buffer.head = writableSegment$okio.pop();
            u0.recycle(writableSegment$okio);
        }
    }

    private final void refill() {
        while (this.buffer.size() == 0) {
            if (this.source.exhausted()) {
                this.f8final = true;
                doFinal();
                return;
            }
            update();
        }
    }

    private final void update() {
        t0 t0Var = this.source.getBuffer().head;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        int i8 = t0Var.limit - t0Var.pos;
        int outputSize = this.cipher.getOutputSize(i8);
        while (outputSize > 8192) {
            int i9 = this.blockSize;
            if (!(i8 > i9)) {
                throw new IllegalStateException(("Unexpected output size " + outputSize + " for input size " + i8).toString());
            }
            i8 -= i9;
            outputSize = this.cipher.getOutputSize(i8);
        }
        t0 writableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int update = this.cipher.update(t0Var.data, t0Var.pos, i8, writableSegment$okio.data, writableSegment$okio.pos);
        this.source.skip(i8);
        writableSegment$okio.limit += update;
        c cVar = this.buffer;
        cVar.setSize$okio(cVar.size() + update);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            this.buffer.head = writableSegment$okio.pop();
            u0.recycle(writableSegment$okio);
        }
    }

    @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
        this.source.close();
    }

    public final Cipher getCipher() {
        return this.cipher;
    }

    @Override // okio.x0
    public long read(c sink, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
        }
        if (!(true ^ this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j8 == 0) {
            return 0L;
        }
        if (this.f8final) {
            return this.buffer.read(sink, j8);
        }
        refill();
        return this.buffer.read(sink, j8);
    }

    @Override // okio.x0
    public y0 timeout() {
        return this.source.timeout();
    }
}
