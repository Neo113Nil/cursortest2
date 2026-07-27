package z3;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface D extends Closeable, Flushable {
    H c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void e(C1448f c1448f, long j4);

    void flush();
}
