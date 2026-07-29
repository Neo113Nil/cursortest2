package b;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: Cache.java */
/* loaded from: classes.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: a, reason: collision with root package name */
    final b.a.a.e f2072a;

    /* renamed from: b, reason: collision with root package name */
    final b.a.a.d f2073b;

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f2073b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2073b.close();
    }
}
