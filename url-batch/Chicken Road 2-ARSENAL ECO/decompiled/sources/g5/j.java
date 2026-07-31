package g5;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface j extends Closeable {
    default O4.c c() {
        return O4.c.f1787e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    boolean j();

    default O4.c shutdown() {
        return c();
    }

    boolean z();
}
