package g4;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public interface t extends Closeable, Flushable {
    x a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void f(long j2, f fVar);

    void flush();
}
