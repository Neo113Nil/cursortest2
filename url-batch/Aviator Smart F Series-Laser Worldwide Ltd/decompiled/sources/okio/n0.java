package okio;

import java.io.OutputStream;

/* loaded from: classes5.dex */
final class n0 implements v0 {
    private final OutputStream out;
    private final y0 timeout;

    public n0(OutputStream out, y0 timeout) {
        kotlin.jvm.internal.s.checkNotNullParameter(out, "out");
        kotlin.jvm.internal.s.checkNotNullParameter(timeout, "timeout");
        this.out = out;
        this.timeout = timeout;
    }

    @Override // okio.v0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out.close();
    }

    @Override // okio.v0, java.io.Flushable
    public void flush() {
        this.out.flush();
    }

    @Override // okio.v0
    public y0 timeout() {
        return this.timeout;
    }

    public String toString() {
        return "sink(" + this.out + ')';
    }

    @Override // okio.v0
    public void write(c source, long j8) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        d1.checkOffsetAndCount(source.size(), 0L, j8);
        while (j8 > 0) {
            this.timeout.throwIfReached();
            t0 t0Var = source.head;
            kotlin.jvm.internal.s.checkNotNull(t0Var);
            int min = (int) Math.min(j8, t0Var.limit - t0Var.pos);
            this.out.write(t0Var.data, t0Var.pos, min);
            t0Var.pos += min;
            long j9 = min;
            j8 -= j9;
            source.setSize$okio(source.size() - j9);
            if (t0Var.pos == t0Var.limit) {
                source.head = t0Var.pop();
                u0.recycle(t0Var);
            }
        }
    }
}
