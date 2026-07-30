package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class r implements x0 {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final Inflater inflater;
    private final e source;

    public r(e source, Inflater inflater) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(inflater, "inflater");
        this.source = source;
        this.inflater = inflater;
    }

    private final void releaseBytesAfterInflate() {
        int i8 = this.bufferBytesHeldByInflater;
        if (i8 == 0) {
            return;
        }
        int remaining = i8 - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    @Override // okio.x0
    public long read(c sink, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        do {
            long readOrInflate = readOrInflate(sink, j8);
            if (readOrInflate > 0) {
                return readOrInflate;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    public final long readOrInflate(c sink, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
        }
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j8 == 0) {
            return 0L;
        }
        try {
            t0 writableSegment$okio = sink.writableSegment$okio(1);
            int min = (int) Math.min(j8, 8192 - writableSegment$okio.limit);
            refill();
            int inflate = this.inflater.inflate(writableSegment$okio.data, writableSegment$okio.limit, min);
            releaseBytesAfterInflate();
            if (inflate > 0) {
                writableSegment$okio.limit += inflate;
                long j9 = inflate;
                sink.setSize$okio(sink.size() + j9);
                return j9;
            }
            if (writableSegment$okio.pos == writableSegment$okio.limit) {
                sink.head = writableSegment$okio.pop();
                u0.recycle(writableSegment$okio);
            }
            return 0L;
        } catch (DataFormatException e8) {
            throw new IOException(e8);
        }
    }

    public final boolean refill() {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.exhausted()) {
            return true;
        }
        t0 t0Var = this.source.getBuffer().head;
        kotlin.jvm.internal.s.checkNotNull(t0Var);
        int i8 = t0Var.limit;
        int i9 = t0Var.pos;
        int i10 = i8 - i9;
        this.bufferBytesHeldByInflater = i10;
        this.inflater.setInput(t0Var.data, i9, i10);
        return false;
    }

    @Override // okio.x0
    public y0 timeout() {
        return this.source.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(x0 source, Inflater inflater) {
        this(j0.buffer(source), inflater);
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.s.checkNotNullParameter(inflater, "inflater");
    }
}
