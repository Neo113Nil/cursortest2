package c;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Sink.java */
/* loaded from: classes.dex */
public interface q extends Closeable, Flushable {
    s a();

    void a_(c cVar, long j) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;
}
