package v1;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface s extends Closeable, Flushable {
    w a();

    void c(f fVar, long j2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();
}
