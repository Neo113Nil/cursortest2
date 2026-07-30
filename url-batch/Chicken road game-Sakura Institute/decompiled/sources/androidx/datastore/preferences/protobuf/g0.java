package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public n0[] f820a;

    @Override // androidx.datastore.preferences.protobuf.n0
    public final x0 a(Class cls) {
        for (n0 n0Var : this.f820a) {
            if (n0Var.b(cls)) {
                return n0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public final boolean b(Class cls) {
        for (n0 n0Var : this.f820a) {
            if (n0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
