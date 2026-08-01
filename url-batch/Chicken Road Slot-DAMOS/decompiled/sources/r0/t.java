package r0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t f8130c = new t(0, 3, 1);

    @Override // r0.i0
    public final void a(androidx.datastore.preferences.protobuf.j jVar, n0.a aVar, q0.k kVar, c6.q qVar, j0 j0Var) {
        c6.e eVar;
        q0.h hVar = (q0.h) jVar.c(1);
        q0.b bVar = (q0.b) jVar.c(0);
        c cVar = (c) jVar.c(2);
        q0.k f3 = hVar.f();
        if (j0Var != null) {
            try {
                eVar = new c6.e(10, j0Var, kVar);
            } catch (Throwable th) {
                f3.e(false);
                throw th;
            }
        } else {
            eVar = null;
        }
        if (!cVar.f8096b.k0()) {
            n0.m.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar.f8095a.j0(aVar, f3, qVar, eVar);
        f3.e(true);
        kVar.d();
        bVar.getClass();
        kVar.A(hVar, hVar.b(bVar));
        kVar.k();
    }
}
