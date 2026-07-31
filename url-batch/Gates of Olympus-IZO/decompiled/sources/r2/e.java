package r2;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: g, reason: collision with root package name */
    public static final e f7323g;

    static {
        int i3 = k.f7331c;
        int i4 = k.f7332d;
        long j3 = k.f7333e;
        String str = k.f7329a;
        e eVar = new e();
        eVar.f7325f = new c(i3, i4, j3, str);
        f7323g = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // k2.AbstractC0546s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
