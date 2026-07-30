package B5;

import java.io.Closeable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import v5.C0977c;

/* loaded from: classes.dex */
public interface f extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().c(10L, TimeUnit.SECONDS);
    }

    C0977c p(Collection collection);

    C0977c shutdown();
}
