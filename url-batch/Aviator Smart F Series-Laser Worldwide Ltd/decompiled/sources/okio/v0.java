package okio;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes5.dex */
public interface v0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    y0 timeout();

    void write(c cVar, long j8);
}
