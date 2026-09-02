package E3;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final e f711d;

    static {
        int i4 = l.f720c;
        int i5 = l.f721d;
        long j4 = l.f722e;
        String str = l.f718a;
        e eVar = new e();
        eVar.f713c = new c(i4, i5, j4, str);
        f711d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // x3.AbstractC1558s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
