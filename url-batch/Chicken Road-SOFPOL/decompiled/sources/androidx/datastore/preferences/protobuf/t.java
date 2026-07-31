package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t implements m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t f771b = new t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f772a;

    public /* synthetic */ t(int i) {
        this.f772a = i;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final w0 a(Class cls) {
        switch (this.f772a) {
            case 0:
                if (!w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (w0) w.d(cls.asSubclass(w.class)).c(3);
                } catch (Exception e8) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean b(Class cls) {
        switch (this.f772a) {
            case 0:
                return w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
