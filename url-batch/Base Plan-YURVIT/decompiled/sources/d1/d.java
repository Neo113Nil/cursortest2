package d1;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: h, reason: collision with root package name */
    public static final d f1831h;

    static {
        int i2 = k.f1840c;
        int i3 = k.f1841d;
        long j2 = k.f1842e;
        String str = k.f1838a;
        d dVar = new d();
        dVar.f1833g = new b(i2, i3, j2, str);
        f1831h = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // W0.AbstractC0078s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
