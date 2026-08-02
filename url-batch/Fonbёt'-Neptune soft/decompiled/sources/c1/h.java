package c1;

import Y0.AbstractC0127v;
import Y0.C0122p;
import d1.AbstractC0184a;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: h, reason: collision with root package name */
    public final b1.d f2015h;

    public h(b1.d dVar, H0.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f2015h = dVar;
    }

    @Override // c1.f
    public final Object a(a1.p pVar, H0.d dVar) {
        Object k2 = this.f2015h.k(new r(pVar), dVar);
        I0.a aVar = I0.a.f733e;
        F0.h hVar = F0.h.f469a;
        if (k2 != aVar) {
            k2 = hVar;
        }
        return k2 == aVar ? k2 : hVar;
    }

    @Override // c1.f
    public final f b(H0.i iVar, int i2, int i3) {
        return new h(this.f2015h, iVar, i2, i3);
    }

    @Override // c1.f, b1.d
    public final Object k(b1.e eVar, H0.d dVar) {
        Object k2;
        I0.a aVar = I0.a.f733e;
        F0.h hVar = F0.h.f469a;
        if (this.f2010f == -3) {
            H0.i f2 = dVar.f();
            Boolean bool = Boolean.FALSE;
            C0122p c0122p = C0122p.f1223h;
            H0.i iVar = this.f2009e;
            H0.i i2 = !((Boolean) iVar.m(bool, c0122p)).booleanValue() ? f2.i(iVar) : AbstractC0127v.a(f2, iVar, false);
            if (Q0.h.a(i2, f2)) {
                k2 = this.f2015h.k(eVar, dVar);
                if (k2 != aVar) {
                    k2 = hVar;
                }
                if (k2 != aVar) {
                    return hVar;
                }
            } else {
                H0.e eVar2 = H0.e.f502e;
                if (Q0.h.a(i2.k(eVar2), f2.k(eVar2))) {
                    H0.i f3 = dVar.f();
                    if (!(eVar instanceof r)) {
                        eVar = new B0.t(eVar, f3);
                    }
                    k2 = l.b(i2, eVar, AbstractC0184a.l(i2), new g(this, null), dVar);
                    if (k2 != aVar) {
                        k2 = hVar;
                    }
                    if (k2 != aVar) {
                        return hVar;
                    }
                }
            }
            return k2;
        }
        k2 = super.k(eVar, dVar);
        if (k2 != aVar) {
            return hVar;
        }
        return k2;
    }

    @Override // c1.f
    public final String toString() {
        return this.f2015h + " -> " + super.toString();
    }
}
