package f8;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface e0 extends Closeable, Flushable {
    i0 a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void f(long j8, f fVar);

    void flush();
}
