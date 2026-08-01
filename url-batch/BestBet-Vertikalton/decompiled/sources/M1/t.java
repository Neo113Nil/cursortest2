package M1;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface t extends Closeable, Flushable {
    x b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void i(f fVar, long j2);
}
