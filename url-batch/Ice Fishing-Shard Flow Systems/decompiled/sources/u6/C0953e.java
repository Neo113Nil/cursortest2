package u6;

/* renamed from: u6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953e extends h {

    /* renamed from: l, reason: collision with root package name */
    public static final C0953e f8108l;

    static {
        int i2 = k.f8116c;
        int i5 = k.f8117d;
        long j = k.f8118e;
        String str = k.f8114a;
        C0953e c0953e = new C0953e();
        c0953e.f8110i = new ExecutorC0951c(str, i2, i5, j);
        f8108l = c0953e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // n6.AbstractC0786t
    public final String toString() {
        return "Dispatchers.Default";
    }
}
