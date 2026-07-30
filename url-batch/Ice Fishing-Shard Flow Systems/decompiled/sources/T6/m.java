package T6;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements w {

    /* renamed from: d, reason: collision with root package name */
    public final InputStream f2632d;

    /* renamed from: e, reason: collision with root package name */
    public final y f2633e;

    public m(InputStream input, y timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f2632d = input;
        this.f2633e = timeout;
    }

    @Override // T6.w
    public final y b() {
        return this.f2633e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2632d.close();
    }

    @Override // T6.w
    public final long o(long j, f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            this.f2633e.f();
            r E7 = sink.E(1);
            int read = this.f2632d.read(E7.f2643a, E7.f2645c, (int) Math.min(8192L, 8192 - E7.f2645c));
            if (read != -1) {
                E7.f2645c += read;
                long j7 = read;
                sink.f2617e += j7;
                return j7;
            }
            if (E7.f2644b != E7.f2645c) {
                return -1L;
            }
            sink.f2616d = E7.a();
            s.a(E7);
            return -1L;
        } catch (AssertionError e7) {
            if (U6.f.a(e7)) {
                throw new IOException(e7);
            }
            throw e7;
        }
    }

    public final String toString() {
        return "source(" + this.f2632d + ')';
    }
}
