package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class E implements L {

    /* renamed from: a, reason: collision with root package name */
    public L[] f1450a;

    @Override // androidx.datastore.preferences.protobuf.L
    public final V a(Class cls) {
        for (L l2 : this.f1450a) {
            if (l2.b(cls)) {
                return l2.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean b(Class cls) {
        for (L l2 : this.f1450a) {
            if (l2.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
