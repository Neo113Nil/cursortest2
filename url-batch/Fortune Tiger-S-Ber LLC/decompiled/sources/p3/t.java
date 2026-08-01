package p3;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public interface t extends Closeable, Flushable {
    x a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void e(long j4, f fVar);

    void flush();
}
