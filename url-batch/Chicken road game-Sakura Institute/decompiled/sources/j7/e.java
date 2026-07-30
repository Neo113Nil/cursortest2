package j7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: i, reason: collision with root package name */
    public static final e f5153i;

    static {
        int i7 = k.f5161c;
        int i8 = k.f5162d;
        long j8 = k.f5163e;
        String str = k.f5159a;
        e eVar = new e();
        eVar.f5155h = new c(i7, i8, j8, str);
        f5153i = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // c7.t
    public final String toString() {
        return "Dispatchers.Default";
    }
}
