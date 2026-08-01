package v1;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface u extends Closeable, Flushable {
    y a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void d(f fVar, long j2);

    void flush();
}
