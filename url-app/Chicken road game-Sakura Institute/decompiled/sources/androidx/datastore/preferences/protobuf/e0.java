package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 extends f0 {
    @Override // androidx.datastore.preferences.protobuf.f0
    public final void a(long j8, Object obj) {
        ((b) ((w) r1.f903c.i(j8, obj))).f794f = false;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final void b(long j8, Object obj, Object obj2) {
        q1 q1Var = r1.f903c;
        w wVar = (w) q1Var.i(j8, obj);
        w wVar2 = (w) q1Var.i(j8, obj2);
        int size = wVar.size();
        int size2 = wVar2.size();
        if (size > 0 && size2 > 0) {
            if (!((b) wVar).f794f) {
                wVar = wVar.e(size2 + size);
            }
            wVar.addAll(wVar2);
        }
        if (size > 0) {
            wVar2 = wVar;
        }
        r1.p(j8, obj, wVar2);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final List c(long j8, Object obj) {
        w wVar = (w) r1.f903c.i(j8, obj);
        if (((b) wVar).f794f) {
            return wVar;
        }
        int size = wVar.size();
        w e9 = wVar.e(size == 0 ? 10 : size * 2);
        r1.p(j8, obj, e9);
        return e9;
    }
}
