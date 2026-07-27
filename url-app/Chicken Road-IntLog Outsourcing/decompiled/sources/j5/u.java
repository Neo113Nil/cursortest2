package j5;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface u extends Closeable, Flushable {
    void B(f fVar, long j2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    y d();

    void flush();
}
