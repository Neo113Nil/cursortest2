package okio;

import java.io.Closeable;

/* loaded from: classes3.dex */
public interface B extends Closeable, AutoCloseable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long read(C3372e c3372e, long j4);

    C timeout();
}
