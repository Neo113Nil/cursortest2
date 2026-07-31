package v2;

/* renamed from: v2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3468c extends AbstractC3471f {

    /* renamed from: j, reason: collision with root package name */
    public static final C3468c f46464j = new C3468c();

    private C3468c() {
        super(AbstractC3477l.f46477c, AbstractC3477l.f46478d, AbstractC3477l.f46479e, AbstractC3477l.f46475a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // o2.AbstractC3313G
    public String toString() {
        return "Dispatchers.Default";
    }
}
