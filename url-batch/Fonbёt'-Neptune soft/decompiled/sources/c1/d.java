package c1;

import Y0.AbstractC0127v;
import Y0.B;
import Y0.InterfaceC0126u;

/* loaded from: classes.dex */
public final class d extends J0.g implements P0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2002i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2003j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1.e f2004k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f2005l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b1.e eVar, f fVar, H0.d dVar) {
        super(2, dVar);
        this.f2004k = eVar;
        this.f2005l = fVar;
    }

    @Override // J0.b
    public final H0.d b(H0.d dVar, Object obj) {
        d dVar2 = new d(this.f2004k, this.f2005l, dVar);
        dVar2.f2003j = obj;
        return dVar2;
    }

    @Override // P0.p
    public final Object h(Object obj, Object obj2) {
        return ((d) b((H0.d) obj2, (InterfaceC0126u) obj)).l(F0.h.f469a);
    }

    @Override // J0.b
    public final Object l(Object obj) {
        I0.a aVar = I0.a.f733e;
        int i2 = this.f2002i;
        F0.h hVar = F0.h.f469a;
        if (i2 == 0) {
            i1.a.G(obj);
            InterfaceC0126u interfaceC0126u = (InterfaceC0126u) this.f2003j;
            f fVar = this.f2005l;
            int i3 = fVar.f2010f;
            if (i3 == -3) {
                i3 = -2;
            }
            P0.p eVar = new e(fVar, null);
            a1.b a2 = a1.i.a(i3, fVar.f2011g, 4);
            H0.i a3 = AbstractC0127v.a(interfaceC0126u.h(), fVar.f2009e, true);
            f1.d dVar = B.f1159a;
            if (a3 != dVar && a3.k(H0.e.f502e) == null) {
                a3 = a3.i(dVar);
            }
            a1.o oVar = new a1.o(a3, a2);
            oVar.W(3, oVar, eVar);
            this.f2002i = 1;
            Object b2 = b1.q.b(this.f2004k, oVar, true, this);
            if (b2 != aVar) {
                b2 = hVar;
            }
            if (b2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1.a.G(obj);
        }
        return hVar;
    }
}
