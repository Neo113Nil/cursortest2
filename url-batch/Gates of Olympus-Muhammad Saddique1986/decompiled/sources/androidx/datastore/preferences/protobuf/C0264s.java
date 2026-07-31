package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264s implements N {

    /* renamed from: b, reason: collision with root package name */
    public static final C0264s f5122b = new C0264s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5123a;

    public /* synthetic */ C0264s(int i3) {
        this.f5123a = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final boolean a(Class cls) {
        switch (this.f5123a) {
            case 0:
                return AbstractC0267v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final Y b(Class cls) {
        switch (this.f5123a) {
            case 0:
                if (!AbstractC0267v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (Y) AbstractC0267v.f(cls.asSubclass(AbstractC0267v.class)).e(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
