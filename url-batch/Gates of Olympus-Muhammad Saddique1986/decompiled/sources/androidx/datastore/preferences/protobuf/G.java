package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class G implements N {

    /* renamed from: a, reason: collision with root package name */
    public N[] f4996a;

    @Override // androidx.datastore.preferences.protobuf.N
    public final boolean a(Class cls) {
        for (N n3 : this.f4996a) {
            if (n3.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.N
    public final Y b(Class cls) {
        for (N n3 : this.f4996a) {
            if (n3.a(cls)) {
                return n3.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
