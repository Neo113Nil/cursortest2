package n0;

import m0.i2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f f5266c = new f(0, 2, 1);

    @Override // n0.j0
    public final void a(androidx.datastore.preferences.protobuf.k kVar, m0.c cVar, i2 i2Var, u0.i iVar, k0 k0Var) {
        u0.d dVar = (u0.d) kVar.c(1);
        int i = dVar != null ? dVar.f7143a : 0;
        a aVar = (a) kVar.c(0);
        if (i > 0) {
            cVar = new b3.g(cVar, i);
        }
        aVar.X(cVar, i2Var, iVar, k0Var != null ? new a0.a0(13, k0Var, i2Var) : null);
    }
}
