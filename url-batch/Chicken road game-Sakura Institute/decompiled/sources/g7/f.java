package g7;

import a0.e0;
import d0.e1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f extends e {

    /* renamed from: i, reason: collision with root package name */
    public final f7.f f4486i;

    public f(int i7, e7.a aVar, f7.f fVar, h6.i iVar) {
        super(iVar, i7, aVar);
        this.f4486i = fVar;
    }

    @Override // g7.e, f7.f
    public final Object b(f7.g gVar, h6.d dVar) {
        int i7 = this.f4484g;
        i6.a aVar = i6.a.f4956f;
        if (i7 == -3) {
            h6.i context = dVar.getContext();
            Boolean bool = Boolean.FALSE;
            c7.q qVar = new c7.q(0);
            h6.i iVar = this.f4483f;
            h6.i z8 = !((Boolean) iVar.D(bool, qVar)).booleanValue() ? context.z(iVar) : c7.a0.g(context, iVar, false);
            if (r6.k.a(z8, context)) {
                Object j8 = j(gVar, dVar);
                if (j8 == aVar) {
                    return j8;
                }
            } else {
                h6.e eVar = h6.e.f4660f;
                if (r6.k.a(z8.u(eVar), context.u(eVar))) {
                    h6.i context2 = dVar.getContext();
                    if (!(gVar instanceof y) && !(gVar instanceof u)) {
                        gVar = new e1(gVar, context2);
                    }
                    Object a3 = c.a(z8, gVar, h7.a.k(z8), new e0(this, (h6.d) null, 13), dVar);
                    if (a3 == aVar) {
                        return a3;
                    }
                }
            }
            return d6.z.f2639a;
        }
        Object b9 = super.b(gVar, dVar);
        if (b9 == aVar) {
            return b9;
        }
        return d6.z.f2639a;
    }

    @Override // g7.e
    public final Object d(e7.r rVar, e0 e0Var) {
        Object j8 = j(new y(rVar), e0Var);
        return j8 == i6.a.f4956f ? j8 : d6.z.f2639a;
    }

    public abstract Object j(f7.g gVar, h6.d dVar);

    @Override // g7.e
    public final String toString() {
        return this.f4486i + " -> " + super.toString();
    }
}
