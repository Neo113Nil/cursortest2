package F;

import W0.C0072l;
import W0.InterfaceC0080u;
import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class A extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f222i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f223j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(P p2, G0.d dVar) {
        super(2, dVar);
        this.f223j = p2;
    }

    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        return new A(this.f223j, dVar);
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((A) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r8 == r5) goto L23;
     */
    @Override // I0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj) {
        int i2 = this.f222i;
        D0.h hVar = D0.h.f206a;
        P p2 = this.f223j;
        H0.a aVar = H0.a.f511e;
        if (i2 == 0) {
            AbstractC0086a.I(obj);
            C0032n c0032n = p2.f296m;
            this.f222i = 1;
            Object T2 = ((C0072l) c0032n.f410b).T(this);
            if (T2 != aVar) {
                T2 = hVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0086a.I(obj);
                return hVar;
            }
            AbstractC0086a.I(obj);
        }
        Z0.d dVar = p2.g().f393c;
        Z0.d a2 = dVar instanceof a1.j ? a1.l.a((Z0.c) ((a1.j) dVar), null, 0, 2, 1) : new a1.h(dVar, G0.j.f500e, 0, 2);
        C0043z c0043z = new C0043z(0, p2);
        this.f222i = 2;
        return a2.m(c0043z, this) == aVar ? aVar : hVar;
    }
}
