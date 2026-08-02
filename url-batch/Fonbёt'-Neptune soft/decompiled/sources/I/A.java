package I;

import Y0.C0118l;
import Y0.InterfaceC0126u;

/* loaded from: classes.dex */
public final class A extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f504i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f505j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(P p2, H0.d dVar) {
        super(2, dVar);
        this.f505j = p2;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        return new A(this.f505j, dVar);
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((A) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f504i;
        F0.h hVar = F0.h.f469a;
        P p2 = this.f505j;
        if (i2 == 0) {
            i1.a.G(obj);
            this.f504i = 1;
            Object U2 = ((C0118l) p2.f577m.f690f).U(this);
            if (U2 != aVar) {
                U2 = hVar;
            }
            if (U2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    i1.a.G(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        b1.d dVar = p2.g().f664c;
        b1.d a2 = dVar instanceof c1.j ? c1.l.a((c1.j) dVar, null, 0, 2, 1) : new c1.h(dVar, H0.j.f503e, 0, 2);
        C0090z c0090z = new C0090z(0, p2);
        this.f504i = 2;
        return a2.k(c0090z, this) == aVar ? aVar : hVar;
    }
}
