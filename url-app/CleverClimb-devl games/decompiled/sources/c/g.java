package c;

import java.io.IOException;

/* compiled from: ForwardingSource.java */
/* loaded from: classes.dex */
public abstract class g implements r {

    /* renamed from: a, reason: collision with root package name */
    private final r f2193a;

    public g(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2193a = rVar;
    }

    @Override // c.r
    public long a(c cVar, long j) throws IOException {
        return this.f2193a.a(cVar, j);
    }

    @Override // c.r
    public s a() {
        return this.f2193a.a();
    }

    @Override // c.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2193a.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f2193a.toString() + ")";
    }
}
