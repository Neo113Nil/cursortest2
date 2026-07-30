package b5;

import java.io.Closeable;
import java.util.Iterator;

/* renamed from: b5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279b implements Iterable, Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final X4.a f4160d;

    public C0279b(X4.a aVar) {
        this.f4160d = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4160d.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f4160d.iterator();
    }
}
