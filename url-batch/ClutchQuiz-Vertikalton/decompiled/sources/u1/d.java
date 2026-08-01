package u1;

/* loaded from: classes.dex */
public final class d extends g {
    public static final d d;

    static {
        int i = k.f3774c;
        int i2 = k.d;
        long j2 = k.f3775e;
        String str = k.f3772a;
        d dVar = new d();
        dVar.f3767c = new b(i, i2, j2, str);
        d = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // o1.AbstractC0296o
    public final String toString() {
        return "Dispatchers.Default";
    }
}
