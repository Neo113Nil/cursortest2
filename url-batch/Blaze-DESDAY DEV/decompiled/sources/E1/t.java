package E1;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface t extends Closeable, Flushable {
    x a();

    void b(f fVar, long j2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
