package Q0;

import M0.AbstractC0063v;
import M0.C0058p;
import R0.AbstractC0068a;
import u0.C0247g;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: h, reason: collision with root package name */
    public final P0.d f848h;

    public h(P0.d dVar, w0.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f848h = dVar;
    }

    @Override // Q0.f
    public final Object a(O0.p pVar, w0.d dVar) {
        Object d2 = this.f848h.d(new r(pVar), dVar);
        x0.a aVar = x0.a.f3094e;
        C0247g c0247g = C0247g.f3005a;
        if (d2 != aVar) {
            d2 = c0247g;
        }
        return d2 == aVar ? d2 : c0247g;
    }

    @Override // Q0.f
    public final f b(w0.i iVar, int i2, int i3) {
        return new h(this.f848h, iVar, i2, i3);
    }

    @Override // Q0.f, P0.d
    public final Object d(P0.e eVar, w0.d dVar) {
        Object d2;
        C0247g c0247g = C0247g.f3005a;
        int i2 = this.f843f;
        x0.a aVar = x0.a.f3094e;
        if (i2 == -3) {
            w0.i context = dVar.getContext();
            Boolean bool = Boolean.FALSE;
            C0058p c0058p = C0058p.f680h;
            w0.i iVar = this.f842e;
            w0.i k2 = !((Boolean) iVar.h(bool, c0058p)).booleanValue() ? context.k(iVar) : AbstractC0063v.a(context, iVar, false);
            if (F0.i.a(k2, context)) {
                d2 = this.f848h.d(eVar, dVar);
                if (d2 != aVar) {
                    d2 = c0247g;
                }
                if (d2 != aVar) {
                    return c0247g;
                }
            } else {
                w0.e eVar2 = w0.e.f3081e;
                if (F0.i.a(k2.f(eVar2), context.f(eVar2))) {
                    w0.i context2 = dVar.getContext();
                    if (!(eVar instanceof r)) {
                        eVar = new P0.l(eVar, context2);
                    }
                    d2 = l.b(k2, eVar, AbstractC0068a.m(k2), new g(this, null), dVar);
                    if (d2 != aVar) {
                        d2 = c0247g;
                    }
                    if (d2 != aVar) {
                        return c0247g;
                    }
                }
            }
            return d2;
        }
        d2 = super.d(eVar, dVar);
        if (d2 != aVar) {
            return c0247g;
        }
        return d2;
    }

    @Override // Q0.f
    public final String toString() {
        return this.f848h + " -> " + super.toString();
    }
}
