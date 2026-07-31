package okio;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes3.dex */
public interface z extends Closeable, Flushable, AutoCloseable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    C timeout();

    void write(C3372e c3372e, long j4);
}
