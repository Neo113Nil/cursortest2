package f1;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: h, reason: collision with root package name */
    public static final d f2201h;

    static {
        int i2 = k.f2210c;
        int i3 = k.f2211d;
        long j2 = k.f2212e;
        String str = k.f2208a;
        d dVar = new d();
        dVar.f2203g = new b(i2, i3, j2, str);
        f2201h = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // Y0.AbstractC0124s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
