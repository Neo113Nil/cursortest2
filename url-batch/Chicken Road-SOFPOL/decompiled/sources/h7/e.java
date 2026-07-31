package h7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: g, reason: collision with root package name */
    public static final e f3238g;

    static {
        int i = k.f3246c;
        int i8 = k.f3247d;
        long j7 = k.f3248e;
        String str = k.f3244a;
        e eVar = new e();
        eVar.f3240f = new c(i, i8, j7, str);
        f3238g = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // a7.q
    public final String toString() {
        return "Dispatchers.Default";
    }
}
