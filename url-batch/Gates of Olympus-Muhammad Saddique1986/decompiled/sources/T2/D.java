package T2;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface D extends Closeable, Flushable {
    H c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void p(C0231f c0231f, long j3);
}
