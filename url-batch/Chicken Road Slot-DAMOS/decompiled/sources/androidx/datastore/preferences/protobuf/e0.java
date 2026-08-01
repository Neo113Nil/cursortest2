package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public l0[] f532a;

    @Override // androidx.datastore.preferences.protobuf.l0
    public final v0 a(Class cls) {
        for (l0 l0Var : this.f532a) {
            if (l0Var.b(cls)) {
                return l0Var.a(cls);
            }
        }
        a2.r.r("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final boolean b(Class cls) {
        for (l0 l0Var : this.f532a) {
            if (l0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
