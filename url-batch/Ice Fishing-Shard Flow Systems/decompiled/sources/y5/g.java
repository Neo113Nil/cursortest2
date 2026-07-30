package y5;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import v5.C0977c;

/* loaded from: classes.dex */
public interface g extends Closeable {
    default C0977c c() {
        return C0977c.f8229e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    default C0977c shutdown() {
        return c();
    }

    void v(M4.a aVar, n nVar);
}
