package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453s implements N {

    /* renamed from: b, reason: collision with root package name */
    public static final C0453s f5396b = new C0453s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5397a;

    public /* synthetic */ C0453s(int i2) {
        this.f5397a = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final boolean a(Class cls) {
        switch (this.f5397a) {
            case 0:
                return AbstractC0456v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final Y b(Class cls) {
        switch (this.f5397a) {
            case 0:
                if (!AbstractC0456v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (Y) AbstractC0456v.f(cls.asSubclass(AbstractC0456v.class)).e(3);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
