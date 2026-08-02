package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186t implements L {

    /* renamed from: b, reason: collision with root package name */
    public static final C0186t f4708b = new C0186t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4709a;

    public /* synthetic */ C0186t(int i4) {
        this.f4709a = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final V a(Class cls) {
        switch (this.f4709a) {
            case 0:
                if (!AbstractC0189w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (V) AbstractC0189w.d(cls.asSubclass(AbstractC0189w.class)).c(3);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean b(Class cls) {
        switch (this.f4709a) {
            case 0:
                return AbstractC0189w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
