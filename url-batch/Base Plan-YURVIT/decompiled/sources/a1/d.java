package a1;

import W0.AbstractC0081v;
import W0.B;
import W0.InterfaceC0080u;
import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class d extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f1144i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1145j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Z0.e f1146k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f1147l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Z0.e eVar, f fVar, G0.d dVar) {
        super(2, dVar);
        this.f1146k = eVar;
        this.f1147l = fVar;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        d dVar2 = new d(this.f1146k, this.f1147l, dVar);
        dVar2.f1145j = obj;
        return dVar2;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((d) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f1144i;
        D0.h hVar = D0.h.f206a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
            return hVar;
        }
        AbstractC0086a.I(obj);
        InterfaceC0080u interfaceC0080u = (InterfaceC0080u) this.f1145j;
        f fVar = this.f1147l;
        G0.i iVar = fVar.f1151e;
        int i3 = fVar.f1152f;
        if (i3 == -3) {
            i3 = -2;
        }
        int i4 = fVar.f1153g;
        O0.p eVar = new e(fVar, null);
        Y0.b a2 = Y0.i.a(i3, i4, 4);
        G0.i a3 = AbstractC0081v.a(interfaceC0080u.c(), iVar, true);
        d1.d dVar = B.f905a;
        if (a3 != dVar && a3.m(G0.e.f499e) == null) {
            a3 = a3.j(dVar);
        }
        Y0.o oVar = new Y0.o(a3, a2);
        oVar.V(3, oVar, eVar);
        this.f1144i = 1;
        Object b2 = Z0.q.b(this.f1146k, oVar, true, this);
        H0.a aVar = H0.a.f511e;
        if (b2 != aVar) {
            b2 = hVar;
        }
        return b2 == aVar ? aVar : hVar;
    }
}
