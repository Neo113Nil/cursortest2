package N2;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface D extends Closeable, Flushable {
    H c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void g(C0150f c0150f, long j3);
}
