package R4;

import f4.C0374a;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface g extends Closeable {
    default O4.c c() {
        return O4.c.f1787e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    default O4.c shutdown() {
        return c();
    }

    void x(C0374a c0374a, o oVar);
}
