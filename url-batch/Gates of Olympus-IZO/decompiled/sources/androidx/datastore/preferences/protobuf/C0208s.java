package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208s implements N {

    /* renamed from: b, reason: collision with root package name */
    public static final C0208s f3921b = new C0208s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3922a;

    public /* synthetic */ C0208s(int i3) {
        this.f3922a = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final boolean a(Class cls) {
        switch (this.f3922a) {
            case 0:
                return AbstractC0211v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final Y b(Class cls) {
        switch (this.f3922a) {
            case 0:
                if (!AbstractC0211v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (Y) AbstractC0211v.f(cls.asSubclass(AbstractC0211v.class)).e(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
