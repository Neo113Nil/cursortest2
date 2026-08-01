package r0;

import n0.l0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f8100c = new e(0, 2, 1);

    @Override // r0.i0
    public final void a(androidx.datastore.preferences.protobuf.j jVar, n0.a aVar, q0.k kVar, c6.q qVar, j0 j0Var) {
        q0.b bVar = (q0.b) jVar.c(0);
        Object c10 = jVar.c(1);
        if (c10 instanceof l0) {
            l0 l0Var = (l0) c10;
            ((o0.e) qVar.f1861e).b(l0Var);
            ((s.i0) qVar.f1860d).a(l0Var);
        }
        if (kVar.f7771n != 0) {
            n0.m.a("Can only append a slot if not current inserting");
        }
        int i3 = kVar.f7767i;
        int i10 = kVar.j;
        int c11 = kVar.c(bVar);
        int g = kVar.g(kVar.f7761b, kVar.r(c11 + 1));
        kVar.f7767i = g;
        kVar.j = g;
        kVar.x(1, c11);
        if (i3 >= g) {
            i3++;
            i10++;
        }
        kVar.f7762c[g] = c10;
        kVar.f7767i = i3;
        kVar.j = i10;
    }
}
