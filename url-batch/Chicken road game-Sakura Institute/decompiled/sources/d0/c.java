package d0;

import androidx.compose.foundation.layout.HorizontalAlignElement;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q6.e f1866g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q6.e f1867h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1868i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f1869j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f1870k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o0.a f1871l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q6.e eVar, q6.e eVar2, long j8, long j9, long j10, long j11, o0.a aVar) {
        super(2);
        this.f1866g = eVar;
        this.f1867h = eVar2;
        this.f1868i = j9;
        this.f1869j = j10;
        this.f1870k = j11;
        this.f1871l = aVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            s0.o d8 = androidx.compose.foundation.layout.b.d(s0.l.f8103a, m.f2159e);
            int i7 = 0;
            q.s a3 = q.q.a(q.j.f7293c, s0.b.f8089q, pVar, 0);
            int i8 = pVar.P;
            g0.k1 m8 = pVar.m();
            s0.o c4 = s0.a.c(pVar, d8);
            r1.j.f7810d.getClass();
            r1.n nVar = r1.i.f7781b;
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            r1.h hVar = r1.i.f7784e;
            g0.d.Q(pVar, a3, hVar);
            r1.h hVar2 = r1.i.f7783d;
            g0.d.Q(pVar, m8, hVar2);
            r1.h hVar3 = r1.i.f7785f;
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i8))) {
                a0.m.q(i8, pVar, i8, hVar3);
            }
            r1.h hVar4 = r1.i.f7782c;
            g0.d.Q(pVar, c4, hVar4);
            pVar.Q(-1924971291);
            pVar.p(false);
            pVar.Q(-1924961479);
            q6.e eVar = this.f1866g;
            if (eVar != null) {
                e0.a.a(this.f1868i, b4.a(f0.c.f2927c, pVar), o0.f.b(434448772, new b(eVar, i7), pVar), pVar, 384);
            }
            pVar.p(false);
            pVar.Q(-1924936431);
            int i9 = 1;
            q6.e eVar2 = this.f1867h;
            if (eVar2 != null) {
                e0.a.a(this.f1869j, b4.a(f0.c.f2929e, pVar), o0.f.b(-796843771, new b(eVar2, i9), pVar), pVar, 384);
            }
            pVar.p(false);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(s0.b.f8091s);
            p1.f0 e9 = q.n.e(s0.b.f8078f, false);
            int i10 = pVar.P;
            g0.k1 m9 = pVar.m();
            s0.o c6 = s0.a.c(pVar, horizontalAlignElement);
            pVar.U();
            if (pVar.O) {
                pVar.l(nVar);
            } else {
                pVar.d0();
            }
            g0.d.Q(pVar, e9, hVar);
            g0.d.Q(pVar, m9, hVar2);
            if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i10))) {
                a0.m.q(i10, pVar, i10, hVar3);
            }
            g0.d.Q(pVar, c6, hVar4);
            int i11 = f0.c.f2925a;
            e0.a.a(this.f1870k, b4.a(10, pVar), this.f1871l, pVar, 0);
            pVar.p(true);
            pVar.p(true);
        }
        return d6.z.f2639a;
    }
}
