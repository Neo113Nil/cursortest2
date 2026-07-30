package okio;

import java.io.Closeable;

/* loaded from: classes5.dex */
public interface x0 extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(c cVar, long j8);

    y0 timeout();
}
