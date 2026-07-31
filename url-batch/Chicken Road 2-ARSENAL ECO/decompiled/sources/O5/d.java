package O5;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: i, reason: collision with root package name */
    public static final d f1816i;

    static {
        int i7 = j.f1824c;
        int i8 = j.f1825d;
        long j4 = j.f1826e;
        String str = j.f1822a;
        d dVar = new d();
        dVar.f1818h = new b(i7, i8, j4, str);
        f1816i = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // H5.AbstractC0161v
    public final String toString() {
        return "Dispatchers.Default";
    }
}
