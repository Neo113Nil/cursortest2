package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s implements l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final s f622b = new s(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f623a;

    public /* synthetic */ s(int i3) {
        this.f623a = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final v0 a(Class cls) {
        switch (this.f623a) {
            case 0:
                if (!v.class.isAssignableFrom(cls)) {
                    te.a1.e("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (v0) v.d(cls.asSubclass(v.class)).c(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final boolean b(Class cls) {
        switch (this.f623a) {
            case 0:
                return v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
