package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c0 {
    public static w a(long j, Object obj) {
        w wVar = (w) j1.f570c.h(j, obj);
        if (((u0) wVar).f640d) {
            return wVar;
        }
        u0 u0Var = (u0) wVar;
        int i3 = u0Var.f642i;
        u0 e2 = u0Var.e(i3 == 0 ? 10 : i3 * 2);
        j1.o(j, obj, e2);
        return e2;
    }
}
