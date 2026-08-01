package r0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j f8111c = new j(0, 2, 1);

    @Override // r0.i0
    public final void a(androidx.datastore.preferences.protobuf.j jVar, n0.a aVar, q0.k kVar, c6.q qVar, j0 j0Var) {
        int i3;
        x0.e eVar = (x0.e) jVar.c(0);
        int c10 = kVar.c((q0.b) jVar.c(1));
        if (kVar.f7777t >= c10) {
            n0.m.a("Check failed");
        }
        k7.e.G(kVar, aVar, c10);
        int i10 = kVar.f7777t;
        int i11 = kVar.f7779v;
        while (i11 >= 0 && !kVar.y(i11)) {
            i11 = kVar.E(kVar.f7761b, i11);
        }
        int i12 = i11 + 1;
        int i13 = 0;
        while (i12 < i10) {
            if (kVar.v(i10, i12)) {
                if (kVar.y(i12)) {
                    i13 = 0;
                }
                i12++;
            } else {
                i13 += kVar.y(i12) ? 1 : kVar.f7761b[(kVar.r(i12) * 5) + 1] & 67108863;
                i12 += kVar.u(i12);
            }
        }
        while (true) {
            i3 = kVar.f7777t;
            if (i3 >= c10) {
                break;
            }
            if (kVar.v(c10, i3)) {
                int i14 = kVar.f7777t;
                if (i14 < kVar.f7778u && (kVar.f7761b[(kVar.r(i14) * 5) + 1] & 1073741824) != 0) {
                    aVar.c(kVar.D(kVar.f7777t));
                    i13 = 0;
                }
                kVar.P();
            } else {
                i13 += kVar.L();
            }
        }
        if (i3 != c10) {
            n0.m.a("Check failed");
        }
        eVar.f10227a = i13;
    }
}
