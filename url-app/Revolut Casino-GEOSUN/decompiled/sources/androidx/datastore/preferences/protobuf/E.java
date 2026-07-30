package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class E implements L {

    /* renamed from: a, reason: collision with root package name */
    public L[] f1363a;

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean a(Class cls) {
        for (L l2 : this.f1363a) {
            if (l2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final V b(Class cls) {
        for (L l2 : this.f1363a) {
            if (l2.a(cls)) {
                return l2.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
