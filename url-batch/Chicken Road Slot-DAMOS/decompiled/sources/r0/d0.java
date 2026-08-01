package r0;

import n0.l0;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d0 extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f8099c = new d0(1, 0, 2);

    @Override // r0.i0
    public final void a(androidx.datastore.preferences.protobuf.j jVar, n0.a aVar, q0.k kVar, c6.q qVar, j0 j0Var) {
        int b10 = jVar.b(0);
        int i3 = kVar.f7779v;
        int N = kVar.N(kVar.f7761b, kVar.r(i3));
        int g = kVar.g(kVar.f7761b, kVar.r(i3 + 1));
        for (int max = Math.max(N, g - b10); max < g; max++) {
            Object obj = kVar.f7762c[kVar.h(max)];
            if (obj instanceof l0) {
                qVar.d((l0) obj);
            } else if (obj instanceof s1) {
                ((s1) obj).c();
            }
        }
        if (b10 <= 0) {
            n0.m.a("Check failed");
        }
        int i10 = kVar.f7779v;
        int N2 = kVar.N(kVar.f7761b, kVar.r(i10));
        int g2 = kVar.g(kVar.f7761b, kVar.r(i10 + 1)) - b10;
        if (g2 < N2) {
            n0.m.a("Check failed");
        }
        kVar.J(g2, b10, i10);
        int i11 = kVar.f7767i;
        if (i11 >= N2) {
            kVar.f7767i = i11 - b10;
        }
    }
}
