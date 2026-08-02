package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156t implements L {

    /* renamed from: b, reason: collision with root package name */
    public static final C0156t f1757b = new C0156t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1758a;

    public /* synthetic */ C0156t(int i2) {
        this.f1758a = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean a(Class cls) {
        switch (this.f1758a) {
            case 0:
                return AbstractC0159w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final V b(Class cls) {
        switch (this.f1758a) {
            case 0:
                if (!AbstractC0159w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (V) AbstractC0159w.f(cls.asSubclass(AbstractC0159w.class)).e(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
