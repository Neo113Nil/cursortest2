package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f0 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public m0[] f681a;

    @Override // androidx.datastore.preferences.protobuf.m0
    public final w0 a(Class cls) {
        for (m0 m0Var : this.f681a) {
            if (m0Var.b(cls)) {
                return m0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final boolean b(Class cls) {
        for (m0 m0Var : this.f681a) {
            if (m0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
