package okio;

import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes5.dex */
public final class h implements v0 {
    private boolean closed;
    private final Deflater deflater;
    private final d sink;

    public h(d sink, Deflater deflater) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.s.checkNotNullParameter(deflater, "deflater");
        this.sink = sink;
        this.deflater = deflater;
    }

    @IgnoreJRERequirement
    private final void deflate(boolean z7) {
        t0 writableSegment$okio;
        int deflate;
        c buffer = this.sink.getBuffer();
        while (true) {
            writableSegment$okio = buffer.writableSegment$okio(1);
            if (z7) {
                Deflater deflater = this.deflater;
                byte[] bArr = writableSegment$okio.data;
                int i8 = writableSegment$okio.limit;
                deflate = deflater.deflate(bArr, i8, 8192 - i8, 2);
            } else {
                Deflater deflater2 = this.deflater;
                byte[] bArr2 = writableSegment$okio.data;
                int i9 = writableSegment$okio.limit;
                deflate = deflater2.deflate(bArr2, i9, 8192 - i9);
            }
            if (deflate > 0) {
                writableSegment$okio.limit += deflate;
                buffer.setSize$okio(buffer.size() + deflate);
                this.sink.emitCompleteSegments();
            } else if (this.deflater.needsInput()) {
                break;
            }
        }
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            buffer.head = writableSegment$okio.pop();
            u0.recycle(writableSegment$okio);
        }
    }

    @Override // okio.v0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            finishDeflate$okio();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.deflater.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public final void finishDeflate$okio() {
        this.deflater.finish();
        deflate(false);
    }

    @Override // okio.v0, java.io.Flushable
    public void flush() {
        deflate(true);
        this.sink.flush();
    }

    @Override // okio.v0
    public y0 timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.sink + ')';
    }

    @Override // okio.v0
    public void write(c source, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        d1.checkOffsetAndCount(source.size(), 0L, j8);
        while (j8 > 0) {
            t0 t0Var = source.head;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            int min = (int) Math.min(j8, t0Var.limit - t0Var.pos);
            this.deflater.setInput(t0Var.data, t0Var.pos, min);
            deflate(false);
            long j9 = min;
            source.setSize$okio(source.size() - j9);
            int i8 = t0Var.pos + min;
            t0Var.pos = i8;
            if (i8 == t0Var.limit) {
                source.head = t0Var.pop();
                u0.recycle(t0Var);
            }
            j8 -= j9;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(v0 sink, Deflater deflater) {
        this(j0.buffer(sink), deflater);
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        kotlin.jvm.internal.s.checkNotNullParameter(deflater, "deflater");
    }
}
