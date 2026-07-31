package u4;

import java.io.Closeable;
import java.util.Iterator;
import q4.C0600a;

/* renamed from: u4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694b implements Iterable, Closeable {

    /* renamed from: f, reason: collision with root package name */
    public final C0600a f6039f;

    public C0694b(C0600a c0600a) {
        this.f6039f = c0600a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6039f.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f6039f.iterator();
    }
}
