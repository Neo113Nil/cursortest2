package y1;

/* loaded from: classes.dex */
public final class d extends g {
    public static final d d;

    static {
        int i = k.f4602c;
        int i2 = k.d;
        long j2 = k.f4603e;
        String str = k.f4600a;
        d dVar = new d();
        dVar.f4595c = new b(i, i2, j2, str);
        d = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // s1.AbstractC0332o
    public final String toString() {
        return "Dispatchers.Default";
    }
}
