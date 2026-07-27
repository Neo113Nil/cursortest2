package d3;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: j, reason: collision with root package name */
    public static final e f6118j;

    static {
        int i2 = k.f6126c;
        int i4 = k.f6127d;
        long j4 = k.f6128e;
        String str = k.f6124a;
        e eVar = new e();
        eVar.f6120i = new c(str, i2, i4, j4);
        f6118j = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // W2.AbstractC0298u
    public final String toString() {
        return "Dispatchers.Default";
    }
}
