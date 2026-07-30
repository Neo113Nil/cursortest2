package V7;

/* loaded from: classes2.dex */
public final class e extends h {

    /* renamed from: w, reason: collision with root package name */
    public static final e f3353w;

    static {
        int i = k.f3361c;
        int i4 = k.f3362d;
        long j9 = k.f3363e;
        String str = k.f3359a;
        e eVar = new e();
        eVar.f3355v = new c(i, i4, str, j9);
        f3353w = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // O7.AbstractC0395u
    public final String toString() {
        return "Dispatchers.Default";
    }
}
