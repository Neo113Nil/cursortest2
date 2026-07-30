package okio;

/* loaded from: classes5.dex */
public final class p0 implements x0 {
    private final c buffer;
    private boolean closed;
    private int expectedPos;
    private t0 expectedSegment;
    private long pos;
    private final e upstream;

    public p0(e upstream) {
        kotlin.jvm.internal.s.checkNotNullParameter(upstream, "upstream");
        this.upstream = upstream;
        c buffer = upstream.getBuffer();
        this.buffer = buffer;
        t0 t0Var = buffer.head;
        this.expectedSegment = t0Var;
        this.expectedPos = t0Var == null ? -1 : t0Var.pos;
    }

    @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r5 == r6.pos) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    @Override // okio.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long read(c sink, long j8) {
        t0 t0Var;
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        boolean z7 = false;
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("byteCount < 0: ", Long.valueOf(j8)).toString());
        }
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        t0 t0Var2 = this.expectedSegment;
        if (t0Var2 != null) {
            t0 t0Var3 = this.buffer.head;
            if (t0Var2 == t0Var3) {
                int i8 = this.expectedPos;
                kotlin.jvm.internal.s.checkNotNull(t0Var3);
            }
            if (z7) {
                throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
            }
            if (j8 == 0) {
                return 0L;
            }
            if (!this.upstream.request(this.pos + 1)) {
                return -1L;
            }
            if (this.expectedSegment == null && (t0Var = this.buffer.head) != null) {
                this.expectedSegment = t0Var;
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                this.expectedPos = t0Var.pos;
            }
            long min = Math.min(j8, this.buffer.size() - this.pos);
            this.buffer.copyTo(sink, this.pos, min);
            this.pos += min;
            return min;
        }
        z7 = true;
        if (z7) {
        }
    }

    @Override // okio.x0
    public y0 timeout() {
        return this.upstream.timeout();
    }
}
