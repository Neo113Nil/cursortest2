package n0;

import java.util.ArrayList;
import m0.i2;
import m0.t1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final o f5287c = new o(0, 1, 1);

    @Override // n0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, m0.c cVar, i2 i2Var, u0.i iVar, k0 k0Var) {
        o0.e eVar;
        t1 t1Var = (t1) kVar.c(0);
        o.j0 j0Var = iVar.i;
        if (j0Var == null || ((u0.e) j0Var.g(t1Var)) == null) {
            return;
        }
        ArrayList arrayList = iVar.f7162j;
        if (arrayList != null && (eVar = (o0.e) arrayList.remove(arrayList.size() - 1)) != null) {
            iVar.f7158e = eVar;
        }
        j0Var.k(t1Var);
    }
}
