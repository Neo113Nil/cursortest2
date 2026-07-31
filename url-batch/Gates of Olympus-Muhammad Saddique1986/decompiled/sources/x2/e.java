package x2;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: g, reason: collision with root package name */
    public static final e f10348g;

    static {
        int i3 = k.f10356c;
        int i4 = k.f10357d;
        long j3 = k.f10358e;
        String str = k.f10354a;
        e eVar = new e();
        eVar.f10350f = new c(i3, i4, j3, str);
        f10348g = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // q2.AbstractC0831s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
