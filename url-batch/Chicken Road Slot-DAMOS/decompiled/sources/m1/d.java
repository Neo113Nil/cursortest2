package m1;

import a1.n;
import c2.i0;
import k1.j;
import k1.v;
import x2.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface d extends x2.c {
    static void C(i0 i0Var, long j, float f3) {
        long E = i0Var.f1585d.E();
        b bVar = i0Var.f1585d;
        bVar.f6405d.f6403c.g(f3, E, b.a(bVar, j, f.f6411b, 3));
    }

    static void U(d dVar, k1.e eVar, long j, long j3, float f3, j jVar, int i3, int i10) {
        dVar.M(eVar, 0L, j, (i10 & 16) != 0 ? j : j3, f3, jVar, (i10 & 512) != 0 ? 1 : i3);
    }

    static void r(d dVar, long j, long j3, int i3) {
        if ((i3 & 4) != 0) {
            float intBitsToFloat = Float.intBitsToFloat((int) (dVar.u() >> 32)) - Float.intBitsToFloat((int) 0);
            j3 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r12 & 4294967295L)) - Float.intBitsToFloat((int) 0)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        }
        dVar.i(j, 0L, j3, f.f6411b, (i3 & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void z(d dVar, k1.g gVar, v vVar, float f3, g gVar2, int i3) {
        c cVar = gVar2;
        if ((i3 & 8) != 0) {
            cVar = f.f6411b;
        }
        dVar.D(gVar, vVar, f3, cVar);
    }

    void D(k1.g gVar, v vVar, float f3, c cVar);

    default long E() {
        return i7.a.N(s().u());
    }

    void M(k1.e eVar, long j, long j3, long j10, float f3, j jVar, int i3);

    void R(long j, float f3, long j3, g gVar);

    l getLayoutDirection();

    void i(long j, long j3, long j10, c cVar, int i3);

    n s();

    default long u() {
        return s().u();
    }
}
