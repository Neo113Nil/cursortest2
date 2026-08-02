package T3;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface t extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    x d();

    void flush();

    void o(g gVar, long j4);
}
