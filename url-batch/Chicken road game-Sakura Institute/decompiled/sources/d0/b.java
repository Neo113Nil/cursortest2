package d0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.e f1847h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(q6.e eVar, int i7) {
        super(2);
        this.f1846g = i7;
        this.f1847h = eVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        switch (this.f1846g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    s0.o j8 = androidx.compose.foundation.layout.b.d(s0.l.f8103a, m.f2160f).j(new HorizontalAlignElement(s0.b.f8089q));
                    p1.f0 e9 = q.n.e(s0.b.f8078f, false);
                    int i7 = pVar.P;
                    g0.k1 m8 = pVar.m();
                    s0.o c4 = s0.a.c(pVar, j8);
                    r1.j.f7810d.getClass();
                    r1.n nVar = r1.i.f7781b;
                    pVar.U();
                    if (pVar.O) {
                        pVar.l(nVar);
                    } else {
                        pVar.d0();
                    }
                    g0.d.Q(pVar, e9, r1.i.f7784e);
                    g0.d.Q(pVar, m8, r1.i.f7783d);
                    r1.h hVar = r1.i.f7785f;
                    if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i7))) {
                        a0.m.q(i7, pVar, i7, hVar);
                    }
                    g0.d.Q(pVar, c4, r1.i.f7782c);
                    this.f1847h.d(pVar, 0);
                    pVar.p(true);
                }
                return d6.z.f2639a;
            case 1:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                } else {
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    s0.o j9 = androidx.compose.foundation.layout.b.d(new LayoutWeightElement(1.0f, false), m.f2161g).j(new HorizontalAlignElement(s0.b.f8089q));
                    p1.f0 e10 = q.n.e(s0.b.f8078f, false);
                    int i8 = pVar2.P;
                    g0.k1 m9 = pVar2.m();
                    s0.o c6 = s0.a.c(pVar2, j9);
                    r1.j.f7810d.getClass();
                    r1.n nVar2 = r1.i.f7781b;
                    pVar2.U();
                    if (pVar2.O) {
                        pVar2.l(nVar2);
                    } else {
                        pVar2.d0();
                    }
                    g0.d.Q(pVar2, e10, r1.i.f7784e);
                    g0.d.Q(pVar2, m9, r1.i.f7783d);
                    r1.h hVar2 = r1.i.f7785f;
                    if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i8))) {
                        a0.m.q(i8, pVar2, i8, hVar2);
                    }
                    g0.d.Q(pVar2, c6, r1.i.f7782c);
                    this.f1847h.d(pVar2, 0);
                    pVar2.p(true);
                }
                return d6.z.f2639a;
            default:
                g0.p pVar3 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar3.x()) {
                    pVar3.L();
                } else {
                    this.f1847h.d(pVar3, 0);
                }
                return d6.z.f2639a;
        }
    }
}
