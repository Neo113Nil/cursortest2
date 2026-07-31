package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107t implements L {

    /* renamed from: b, reason: collision with root package name */
    public static final C0107t f1587b = new C0107t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1588a;

    public /* synthetic */ C0107t(int i2) {
        this.f1588a = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final V a(Class cls) {
        switch (this.f1588a) {
            case 0:
                if (!AbstractC0110w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (V) AbstractC0110w.d(cls.asSubclass(AbstractC0110w.class)).c(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean b(Class cls) {
        switch (this.f1588a) {
            case 0:
                return AbstractC0110w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
