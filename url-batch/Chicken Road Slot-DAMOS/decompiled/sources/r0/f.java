package r0;

import n0.c1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f f8102c = new f(0, 2, 1);

    @Override // r0.i0
    public final void a(androidx.datastore.preferences.protobuf.j jVar, n0.a aVar, q0.k kVar, c6.q qVar, j0 j0Var) {
        x0.e eVar = (x0.e) jVar.c(1);
        int i3 = eVar != null ? eVar.f10227a : 0;
        a aVar2 = (a) jVar.c(0);
        if (i3 > 0) {
            aVar = new c1(aVar, i3);
        }
        aVar2.i0(aVar, kVar, qVar, j0Var != null ? new c6.e(10, j0Var, kVar) : null);
    }
}
