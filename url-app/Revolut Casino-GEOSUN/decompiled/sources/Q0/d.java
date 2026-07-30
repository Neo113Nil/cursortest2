package Q0;

import M0.AbstractC0063v;
import M0.B;
import M0.InterfaceC0062u;
import u0.C0247g;

/* loaded from: classes.dex */
public final class d extends y0.f implements E0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f835i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f836j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P0.e f837k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f838l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(P0.e eVar, f fVar, w0.d dVar) {
        super(2, dVar);
        this.f837k = eVar;
        this.f838l = fVar;
    }

    @Override // y0.b
    public final w0.d b(Object obj, w0.d dVar) {
        d dVar2 = new d(this.f837k, this.f838l, dVar);
        dVar2.f836j = obj;
        return dVar2;
    }

    @Override // E0.p
    public final Object f(Object obj, Object obj2) {
        return ((d) b((InterfaceC0062u) obj, (w0.d) obj2)).l(C0247g.f3005a);
    }

    @Override // y0.b
    public final Object l(Object obj) {
        x0.a aVar = x0.a.f3094e;
        int i2 = this.f835i;
        C0247g c0247g = C0247g.f3005a;
        if (i2 == 0) {
            o.g.z(obj);
            InterfaceC0062u interfaceC0062u = (InterfaceC0062u) this.f836j;
            f fVar = this.f838l;
            int i3 = fVar.f843f;
            if (i3 == -3) {
                i3 = -2;
            }
            E0.p eVar = new e(fVar, null);
            O0.b a2 = O0.i.a(i3, fVar.f844g, 4);
            w0.i a3 = AbstractC0063v.a(interfaceC0062u.m(), fVar.f842e, true);
            T0.d dVar = B.f616a;
            if (a3 != dVar && a3.f(w0.e.f3081e) == null) {
                a3 = a3.k(dVar);
            }
            O0.o oVar = new O0.o(a3, a2);
            oVar.U(3, oVar, eVar);
            this.f835i = 1;
            Object b2 = P0.r.b(this.f837k, oVar, true, this);
            if (b2 != aVar) {
                b2 = c0247g;
            }
            if (b2 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return c0247g;
    }
}
