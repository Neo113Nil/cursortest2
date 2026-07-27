package b4;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* renamed from: b4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0294i extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    default J3.c e() {
        return J3.c.f1361e;
    }

    boolean h();

    default J3.c shutdown() {
        return e();
    }

    boolean v();
}
