package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k0 {
    public static j0 a(Object obj, Object obj2) {
        j0 j0Var = (j0) obj;
        j0 j0Var2 = (j0) obj2;
        if (!j0Var2.isEmpty()) {
            if (!j0Var.f709d) {
                j0Var = j0Var.b();
            }
            j0Var.a();
            if (!j0Var2.isEmpty()) {
                j0Var.putAll(j0Var2);
            }
        }
        return j0Var;
    }
}
