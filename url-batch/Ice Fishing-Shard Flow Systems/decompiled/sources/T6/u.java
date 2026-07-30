package T6;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface u extends Closeable, Flushable {
    y b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void x(long j, f fVar);
}
