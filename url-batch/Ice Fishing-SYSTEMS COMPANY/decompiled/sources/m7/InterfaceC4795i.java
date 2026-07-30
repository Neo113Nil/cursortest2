package m7;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* renamed from: m7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4795i extends Closeable {
    default U6.c M() {
        return U6.c.f3310e;
    }

    boolean O();

    boolean U();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    default U6.c shutdown() {
        return M();
    }
}
