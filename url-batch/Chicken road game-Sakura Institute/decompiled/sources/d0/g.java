package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1969g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o0.a f1970h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(o0.a aVar, int i7, byte b9) {
        super(2);
        this.f1969g = i7;
        this.f1970h = aVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        int i7 = this.f1969g;
        s0.l lVar = s0.l.f8103a;
        d6.z zVar = d6.z.f2639a;
        o0.a aVar = this.f1970h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                float f9 = m.f2155a;
                float f10 = m.f2155a;
                m.b(aVar, (g0.p) obj, g0.d.T(439));
                break;
            case 1:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar.x()) {
                    q.s a3 = q.q.a(q.j.f7293c, s0.b.f8089q, pVar, 0);
                    int i8 = pVar.P;
                    g0.k1 m8 = pVar.m();
                    s0.o c4 = s0.a.c(pVar, lVar);
                    r1.j.f7810d.getClass();
                    r1.n nVar = r1.i.f7781b;
                    pVar.U();
                    if (pVar.O) {
                        pVar.l(nVar);
                    } else {
                        pVar.d0();
                    }
                    g0.d.Q(pVar, a3, r1.i.f7784e);
                    g0.d.Q(pVar, m8, r1.i.f7783d);
                    r1.h hVar = r1.i.f7785f;
                    if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i8))) {
                        a0.m.q(i8, pVar, i8, hVar);
                    }
                    g0.d.Q(pVar, c4, r1.i.f7782c);
                    aVar.c(q.t.f7341a, pVar, 6);
                    pVar.p(true);
                    break;
                } else {
                    pVar.L();
                    break;
                }
            case 2:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar2.x()) {
                    s0.o a9 = androidx.compose.foundation.layout.c.a(lVar, f0.g.f2940d, f0.g.f2938b);
                    p1.f0 e9 = q.n.e(s0.b.f8082j, false);
                    int i9 = pVar2.P;
                    g0.k1 m9 = pVar2.m();
                    s0.o c6 = s0.a.c(pVar2, a9);
                    r1.j.f7810d.getClass();
                    r1.n nVar2 = r1.i.f7781b;
                    pVar2.U();
                    if (pVar2.O) {
                        pVar2.l(nVar2);
                    } else {
                        pVar2.d0();
                    }
                    g0.d.Q(pVar2, e9, r1.i.f7784e);
                    g0.d.Q(pVar2, m9, r1.i.f7783d);
                    r1.h hVar2 = r1.i.f7785f;
                    if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i9))) {
                        a0.m.q(i9, pVar2, i9, hVar2);
                    }
                    g0.d.Q(pVar2, c6, r1.i.f7782c);
                    aVar.d(pVar2, 0);
                    pVar2.p(true);
                    break;
                } else {
                    pVar2.L();
                    break;
                }
                break;
            default:
                ((Number) obj2).intValue();
                a.a.d(aVar, (g0.p) obj, g0.d.T(7));
                break;
        }
        return zVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o0.a aVar, int i7, int i8) {
        super(2);
        this.f1969g = i8;
        switch (i8) {
            case 3:
                this.f1970h = aVar;
                super(2);
                break;
            default:
                float f9 = m.f2155a;
                float f10 = m.f2155a;
                this.f1970h = aVar;
                break;
        }
    }
}
