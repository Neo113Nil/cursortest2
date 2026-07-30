package D;

import M0.C0054l;
import M0.InterfaceC0062u;
import u0.C0247g;

/* loaded from: classes.dex */
public final class B extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f59i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ S f60j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(S s2, w0.d dVar) {
        super(2, dVar);
        this.f60j = s2;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        return new B(this.f60j, dVar);
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((B) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f59i;
        C0247g c0247g = C0247g.f3005a;
        S s2 = this.f60j;
        if (i2 == 0) {
            o.g.z(obj);
            this.f59i = 1;
            Object S2 = ((C0054l) s2.f134m.f245b).S(this);
            if (S2 != aVar) {
                S2 = c0247g;
            }
            if (S2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    o.g.z(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        P0.d dVar = s2.g().f233c;
        P0.d a2 = dVar instanceof Q0.j ? Q0.l.a((Q0.j) dVar, null, 0, 2, 1) : new Q0.h(dVar, w0.j.f3082e, 0, 2);
        A a3 = new A(0, s2);
        this.f59i = 2;
        return a2.d(a3, this) == aVar ? aVar : c0247g;
    }
}
