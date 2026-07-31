package a1;

import B0.C0018t;
import W0.AbstractC0081v;
import W0.C0076p;
import b1.AbstractC0115a;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: h, reason: collision with root package name */
    public final Z0.d f1157h;

    public h(Z0.d dVar, G0.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f1157h = dVar;
    }

    @Override // a1.f
    public final Object a(Y0.p pVar, G0.d dVar) {
        Object m2 = this.f1157h.m(new r(pVar), dVar);
        D0.h hVar = D0.h.f206a;
        H0.a aVar = H0.a.f511e;
        if (m2 != aVar) {
            m2 = hVar;
        }
        return m2 == aVar ? m2 : hVar;
    }

    @Override // a1.f, Z0.d
    public final Object m(Z0.e eVar, G0.d dVar) {
        int i2 = this.f1152f;
        H0.a aVar = H0.a.f511e;
        D0.h hVar = D0.h.f206a;
        if (i2 == -3) {
            G0.i e2 = dVar.e();
            Boolean bool = Boolean.FALSE;
            C0076p c0076p = C0076p.f967h;
            G0.i iVar = this.f1151e;
            G0.i j2 = !((Boolean) iVar.h(bool, c0076p)).booleanValue() ? e2.j(iVar) : AbstractC0081v.a(e2, iVar, false);
            if (P0.h.a(j2, e2)) {
                Object m2 = this.f1157h.m(eVar, dVar);
                if (m2 != aVar) {
                    m2 = hVar;
                }
                if (m2 == aVar) {
                    return m2;
                }
            } else {
                G0.e eVar2 = G0.e.f499e;
                if (P0.h.a(j2.m(eVar2), e2.m(eVar2))) {
                    G0.i e3 = dVar.e();
                    if (!(eVar instanceof r)) {
                        eVar = new C0018t(eVar, e3);
                    }
                    Object b2 = l.b(j2, eVar, AbstractC0115a.k(j2), new g(this, null), dVar);
                    if (b2 != aVar) {
                        b2 = hVar;
                    }
                    if (b2 == aVar) {
                        return b2;
                    }
                }
            }
        }
        Object m3 = super.m(eVar, dVar);
        return m3 == aVar ? m3 : hVar;
    }

    @Override // a1.f
    public final String toString() {
        return this.f1157h + " -> " + super.toString();
    }
}
