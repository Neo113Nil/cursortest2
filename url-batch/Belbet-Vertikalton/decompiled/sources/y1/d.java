package y1;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: d, reason: collision with root package name */
    public static final d f4748d;

    static {
        int i = k.f4757c;
        int i2 = k.f4758d;
        long j = k.e;
        String str = k.f4755a;
        d dVar = new d();
        dVar.f4750c = new b(i, i2, j, str);
        f4748d = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // r1.AbstractC0366p
    public final String toString() {
        return "Dispatchers.Default";
    }
}
