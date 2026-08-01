package x1;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface t extends Closeable, Flushable {
    x a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void g(f fVar, long j2);
}
