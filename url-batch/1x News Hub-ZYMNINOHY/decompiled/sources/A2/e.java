package A2;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: d, reason: collision with root package name */
    public static final e f54d;

    static {
        int i3 = l.f63c;
        int i4 = l.f64d;
        long j3 = l.f65e;
        String str = l.f61a;
        e eVar = new e();
        eVar.f56c = new c(i3, i4, j3, str);
        f54d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // t2.AbstractC1208s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
