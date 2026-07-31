package okio;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class o implements B {

    /* renamed from: b, reason: collision with root package name */
    private final InputStream f43288b;

    /* renamed from: c, reason: collision with root package name */
    private final C f43289c;

    public o(InputStream input, C timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f43288b = input;
        this.f43289c = timeout;
    }

    @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f43288b.close();
    }

    @Override // okio.B
    public long read(C3372e sink, long j4) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j4 == 0) {
            return 0L;
        }
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        try {
            this.f43289c.throwIfReached();
            w o02 = sink.o0(1);
            int read = this.f43288b.read(o02.f43304a, o02.f43306c, (int) Math.min(j4, 8192 - o02.f43306c));
            if (read != -1) {
                o02.f43306c += read;
                long j5 = read;
                sink.k0(sink.l0() + j5);
                return j5;
            }
            if (o02.f43305b != o02.f43306c) {
                return -1L;
            }
            sink.f43260b = o02.b();
            x.b(o02);
            return -1L;
        } catch (AssertionError e4) {
            if (p.e(e4)) {
                throw new IOException(e4);
            }
            throw e4;
        }
    }

    @Override // okio.B
    public C timeout() {
        return this.f43289c;
    }

    public String toString() {
        return "source(" + this.f43288b + ')';
    }
}
