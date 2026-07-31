package F;

import W0.AbstractC0081v;
import W0.C0072l;
import W0.InterfaceC0080u;
import a.AbstractC0086a;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class K extends I0.g implements O0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f268i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f269j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f270k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I0.g f271l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(P p2, O0.p pVar, G0.d dVar) {
        super(2, dVar);
        this.f270k = p2;
        this.f271l = (I0.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [I0.g, O0.p] */
    @Override // I0.b
    public final G0.d b(G0.d dVar, Object obj) {
        K k2 = new K(this.f270k, this.f271l, dVar);
        k2.f269j = obj;
        return k2;
    }

    @Override // O0.p
    public final Object i(Object obj, Object obj2) {
        return ((K) b((G0.d) obj2, (InterfaceC0080u) obj)).m(D0.h.f206a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [I0.g, O0.p] */
    @Override // I0.b
    public final Object m(Object obj) {
        int i2 = this.f268i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0086a.I(obj);
            return obj;
        }
        AbstractC0086a.I(obj);
        InterfaceC0080u interfaceC0080u = (InterfaceC0080u) this.f269j;
        C0072l c0072l = new C0072l(true);
        c0072l.G(null);
        P p2 = this.f270k;
        c0 c0Var = new c0(this.f271l, c0072l, p2.f295l.z(), interfaceC0080u.c());
        C0032n c0032n = p2.f299p;
        Object l2 = ((Y0.b) c0032n.f411c).l(c0Var);
        if (l2 instanceof Y0.g) {
            Y0.g gVar = (Y0.g) l2;
            if (gVar == null) {
                gVar = null;
            }
            Throwable th = gVar != null ? gVar.f1041a : null;
            if (th == null) {
                throw new Y0.l("Channel was closed normally");
            }
            throw th;
        }
        if (l2 instanceof Y0.h) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) ((B0.E) c0032n.f412d).f20f).getAndIncrement() == 0) {
            AbstractC0081v.f((InterfaceC0080u) c0032n.f409a, new g0(c0032n, null));
        }
        this.f268i = 1;
        Object T2 = c0072l.T(this);
        H0.a aVar = H0.a.f511e;
        return T2 == aVar ? aVar : T2;
    }
}
