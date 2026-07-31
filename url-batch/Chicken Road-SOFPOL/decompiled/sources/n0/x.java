package n0;

import java.util.Set;
import m0.b2;
import m0.i2;
import m0.t1;
import o.r0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class x extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x f5300c = new x(0, 1, 1);

    @Override // n0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, m0.c cVar, i2 i2Var, u0.i iVar, k0 k0Var) {
        t1 t1Var = (t1) kVar.c(0);
        Set set = iVar.f7154a;
        if (set == null) {
            return;
        }
        u0.e eVar = new u0.e(set);
        o.j0 j0Var = iVar.i;
        if (j0Var == null) {
            long[] jArr = r0.f5528a;
            j0Var = new o.j0();
            iVar.i = j0Var;
        }
        j0Var.m(t1Var, eVar);
        iVar.f7158e.b(new b2(eVar, null));
    }
}
