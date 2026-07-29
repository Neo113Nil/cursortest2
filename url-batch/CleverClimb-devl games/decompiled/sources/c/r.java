package c;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: Source.java */
/* loaded from: classes.dex */
public interface r extends Closeable {
    long a(c cVar, long j) throws IOException;

    s a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;
}
