package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202s implements K {

    /* renamed from: b, reason: collision with root package name */
    public static final C0202s f3567b = new C0202s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3568a;

    public /* synthetic */ C0202s(int i2) {
        this.f3568a = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final U a(Class cls) {
        switch (this.f3568a) {
            case 0:
                if (!AbstractC0205v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (U) AbstractC0205v.d(cls.asSubclass(AbstractC0205v.class)).c(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean b(Class cls) {
        switch (this.f3568a) {
            case 0:
                return AbstractC0205v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
