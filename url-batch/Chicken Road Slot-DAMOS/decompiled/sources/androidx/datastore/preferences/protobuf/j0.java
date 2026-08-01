package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j0 {
    public static i0 a(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        i0 i0Var2 = (i0) obj2;
        if (!i0Var2.isEmpty()) {
            if (!i0Var.f562d) {
                i0Var = i0Var.b();
            }
            i0Var.a();
            if (!i0Var2.isEmpty()) {
                i0Var.putAll(i0Var2);
            }
        }
        return i0Var;
    }
}
